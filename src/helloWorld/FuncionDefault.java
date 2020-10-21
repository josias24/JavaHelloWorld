package helloWorld;

public class FuncionDefault {
    public static void main(String[] args) {
        int dia = 3;

        switch (dia) {
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia Laboral");
                break;
        }
    }
}
