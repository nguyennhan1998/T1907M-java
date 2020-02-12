package example;

import java.util.ArrayList;

import static javafx.scene.input.KeyCode.T;


public class MyUtil
{

  public static <T> T getMiddle(T[] a){
      return a[a.length/2];
  }

    public static void main(String[] args) {
        String[] names={"john","Q","public"};
        String m=MyUtil.<String>getMiddle(names);
    }
}

