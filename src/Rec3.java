import java.util.Scanner;

public class Rec3 {
    public static void main(String[] args) {
        checker();
    }
    public static void checker(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter BANKCARD ID: ");
        String num =scn.next();
        if (num.charAt(0)=='i'&& num.charAt(4)=='d'&& num.length()==5){
            System.out.println("Корректно!!!");
        }else {
            System.out.println("НЕ КОРРЕКТНО!!!");
            checker();
        }
    }
}
