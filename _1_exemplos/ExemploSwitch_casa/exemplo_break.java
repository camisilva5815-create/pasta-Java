import java.util.Scanner;
public class exemplo_break {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String dia;
        switch (x){
            case 1:
                dia="domingo";
                break;
        }
        switch (x){
            case 2:
                dia="segunda";
                break;
        }
        switch (x){
            case 3:
                dia = "terça";
                break;
        }
        switch (x) {
            case 4:
                dia = "quarta";
                break;
        }
        switch (x) {
            case 5:
                dia = "quinta";
                break;
        }
        switch (x) {
            case 6:
                dia = "sexta";
                break;
        }
        switch (x) {
            case 7:
                dia = "sabadp";
                break;
            default:
                dia = "valor invalido.";
                break;
        }
        System.out.println("Dia da semana"+dia);
        sc.close();
    }
}
