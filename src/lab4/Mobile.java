package lab4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Mobile <S,T,N>{
    public S hang;
    public T seri;
    public N year;
    public Mobile(){

    }

    public Mobile(S hang, T seri, N year) {
        this.hang = hang;
        this.seri = seri;
        this.year = year;
    }

    public S getHang() {
        return hang;
    }

    public void setHang(S hang) {
        this.hang = hang;
    }

    public T getSeri() {
        return seri;
    }

    public void setSeri(T seri) {
        this.seri = seri;
    }

    public N getYear() {
        return year;
    }

    public void setYear(N year) {
        this.year = year;
    }
    public boolean checkGuarantee(){
        //LocalDate madeYear=LocalDate.of((Integer) year,1,1) ;
        LocalDate now= LocalDate.now();
        if((Integer) year<(now.getYear()-5)){
            return false;
        }
        return  true;
    }

    public static void main(String[] args) {
        //java time
        LocalDate lc= LocalDate.now();//ngay hien tai
       // LocalDate lc2=LocalDate.of(2019,2,29);
        //loi khong co ngay 29/2/2019//tao ngay bang nam thang ngay
        LocalDate lc3=LocalDate.of(2020,2,29);
        LocalDate lc4= LocalDate.parse("2019-04-02");//ra ngay chinh xac bang chuoi chuan iso
        LocalDate lc5=lc3.minusYears(1);
        System.out.println("lv5 "+lc5);
        LocalDateTime dt=LocalDateTime.now();//ngay gio hien tai
        System.out.println(dt);
        LocalDateTime dt2=LocalDateTime.of(2020,1,30,12,30,45);
        //year month day hour min second
        //LocalDateTime
        LocalDateTime dt3=LocalDateTime.parse("2020-02-28T11:18:12.226");
        //vi du kiem tra mot nam nao do co phai la nam nhuan hay khong
        System.out.println("nhap nam can kiem tra :");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        LocalDate kt= LocalDate.of(x,2,28);
        LocalDate nextDay=kt.plusDays(1);
        if(nextDay.getDayOfMonth()==29){
            System.out.println("day la nam nhuan");

        }else{
            System.out.println("day la nam khong nhuan");
        }











    }
}
