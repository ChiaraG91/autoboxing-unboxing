public class Main {

    public static void main(String[] args){

        somma(3,5);
        character('g');
        sommaI(4,6);
        characterC('G');
        autoboxing();
        unboxing();
    }


    public static void somma(int numero1, int numero2){
        System.out.println(numero1 + numero2);
    }

    public static void character(char letter){
        System.out.println(letter);
    }

    public static void sommaI(Integer numero1,Integer numero2){
        System.out.println(Integer.sum(numero1,numero2));
    }

    public static void characterC(Character letter){
        System.out.println(Character.valueOf(letter));
    }

    public static void autoboxing(){
        Integer numeroI = 1991;
        Double numeroD = 25.5;
        Character letterC = 'c';

        System.out.println(numeroI);
        System.out.println(numeroD);
        System.out.println(letterC);
    }

    public static void unboxing(){
        Integer numeroI = 1991;
        Double numeroD = 25.5;
        Character letterC = 'c';

        int numero = numeroI;
        double numero2 = numeroD;
        char letter = letterC;;

        System.out.println(numero);
        System.out.println(numero2);
        System.out.println(letter);

    }
}
