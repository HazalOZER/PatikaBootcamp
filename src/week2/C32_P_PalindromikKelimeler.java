package week2;

import java.util.Scanner;

public class C32_P_PalindromikKelimeler {

    static boolean isPalimdrome(String str){


      int i=0;
      int j=str.length()-1 ;

      while (i<j){
         if( str.charAt(i)!=str.charAt(j)){
             return false;
         }
         i++;
         j--;
      }

        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Kelime :");
        String str = scan.nextLine();

        if(isPalimdrome(str)) {
            System.out.println(str+ " kelimesi palindromdur");
        }   else {
            System.out.println(str+ "kelimesi palindrom değildir");
        }
    }
}
