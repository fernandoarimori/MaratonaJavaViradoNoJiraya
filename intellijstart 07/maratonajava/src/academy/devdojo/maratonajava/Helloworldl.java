package academy.devdojo.maratonajava;

 /**
 * <b>Weeee</b>
 * <img src="https://c.tenor.com/UoVewZBW_owAAAAM/gif.gif" />
 */
public class Helloworldl {
     public  static  void main(String[] args){
         System.out.println("abcdef".substring(2,3));

         System.out.println("~~~~~~~~");

         for (int i=0; i<=10; i++) {
             String result = new String(new char[i]).replace("\0","0");
             System.out.println("123"+result);
         }

         System.out.println("~~~~~~~~");

         char nullTest = '0';
         System.out.println(nullTest == '\u0000');
         }

     }








