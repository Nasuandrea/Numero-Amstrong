// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numero=407;
        System.out.println(isAmstrong(numero));

    }
    public static boolean isAmstrong(int numero){
        int suma=0;
        String number = String.valueOf(numero);
        char[] digitos = number.toCharArray();
        for(int i=0;i<digitos.length;i++){
            System.out.println(digitos[i]);
          suma+= (int) Math.pow(Integer.parseInt(String.valueOf(digitos[i])), digitos.length);
        }

        return suma==numero;

    }
}