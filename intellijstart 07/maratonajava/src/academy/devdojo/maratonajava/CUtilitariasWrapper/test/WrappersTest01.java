package academy.devdojo.maratonajava.CUtilitariasWrapper.test;

public class WrappersTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intp = 1;
        long longP = 1L;
        float floatP = 1F;
        double doubleP = 1D;
        char charP = 'w';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 1L;
        //        Long longWerro = 1;
        Float floatW = 1F;
        //        Float floatWerro = 1;
        Double doubleW = 1D;
        //       Double doubleWerro = 1;
        Character charW = 'w';
        Boolean booleanW = false;

        //*Boas práticas ainda demandam o uso, sempre que possivel, dos tipos primitivos.

        //---------------//
        int i = intW; //-> Referência para primitivo UNBOXING
        Integer intW2 = 2; //->Primitivo para referência AUTOBOXING
        System.out.println(intW2+3);
        System.out.println(Integer.parseInt("1")+3);

        boolean x =Character.isIdentifierIgnorable('^');
        boolean y =Character.isIdentifierIgnorable('\u0008');
        char z = '\u0000';
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
