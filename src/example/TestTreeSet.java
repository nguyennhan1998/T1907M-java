package example;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;
class ContactCompare implements Comparator<Contact>{
    public int compare(Contact one,Contact two){
        return (one.name.compareTo(two.name));
    }
}

public class TestTreeSet {
    public static void main(String[] args) {
       ContactCompare cCompare= new ContactCompare();
        TreeSet<Contact> tree= new TreeSet<Contact>(cCompare);

        tree.add(new Contact("alice","wonderland"));
        tree.add(new Contact("john","neverland"));
        tree.add(new Contact("hana","la la land"));
        System.out.println(tree);
    }
}
