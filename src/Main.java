import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("Que deseas hacer?" +
                    "\n1. Convertir pesos a dolares" +
                    "\n2. Converir pesos a euros" +
                    "\n3. Convertir dolares a pesos" +
                    "\n4. Convertir euros a pesos" +
                    "\n0. SALIR\n");
            int option = sc.nextInt();
            double pesos;
            double convertidos;
            double dolares;
            switch (option) {
                case 1:
                    System.out.println("Cuantos pesos quieres convertir a dolares?\n");
                    pesos = sc.nextInt();
                    convertidos = pesos * 0.053;
                    System.out.printf("%f pesos son %f dolares\n", pesos, convertidos);
                    break;
                case 2:
                    System.out.println("Cuantos pesos quieres convertir a euros?\n");
                    pesos = sc.nextInt();
                    convertidos = pesos * 0.046;
                    System.out.printf("%f pesos son %f euros\n", pesos, convertidos);
                    break;
                case 3:
                    System.out.println("Cuantos dolares quieres convertir a pesos (MXN)?\n");
                    dolares = sc.nextInt();
                    convertidos = dolares * 18.89;
                    System.out.printf("%f dolares son %f pesos (MXN)\n", dolares, convertidos);
                    break;
                case 4:
                    System.out.println("Cuanto euros quieres convertir a pesos (MXN)?\n");
                    dolares = sc.nextInt();
                    convertidos = dolares * 21.9;
                    System.out.printf("%f euros son %f pesos (MXN)\n", dolares, convertidos);
                    break;
                case 0:
                    System.out.println("Hasta luego\n");
                    flag = false;
            }
        }
    }
}