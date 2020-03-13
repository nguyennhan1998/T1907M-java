package exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook myPhone=new AddressBook();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one action");
        int a;
        a=sc.nextInt();
        sc.nextLine();

while(a!=4){
    switch (a){

        case 1:
            System.out.println("nhap vao so dien thoai");
            String name=sc.nextLine();
            System.out.println("nhap vao dia chi cong ty");
            String company=sc.nextLine();
            System.out.println("nhap vao dia chi email");
            String email=sc.nextLine();
            System.out.println("nhap vao so dien thoai");
            String phone=sc.nextLine();
            myPhone.addContact(name,company,email,phone);
            break;
        case 2:
            System.out.println("nhap vao ten");
            String sName=sc.nextLine();

            Contact t=myPhone.searchContact(sName);
            if(t==null){
                System.out.println("khong tim thay ten");
            }else{
                System.out.println("contact ban vua tim la: ");
                System.out.println("name "+t.name+", "+t.company+", "+t.email+", "+t.phone);
            }
            break;
        case 3:
            myPhone.displayContact();
            break;
        case 4:
            System.out.println("end the task");
            break;

    }

}

    }
}