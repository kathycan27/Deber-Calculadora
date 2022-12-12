import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Geometria_Katherine geometria=new Geometria_Katherine();
        Scanner sc=new Scanner(System.in);
        int op=0;
        do {
            System.out.println("Escoja la figura que desea calcular: \n 1: Cuadrado o Cubo \n 2: Rectangulo o Prisma \n 3: Circulo o Esfera \n 0: Salir");
            switch (op) {
                case 1:
                    geometria.cuadrado();
                    break;
                case 2:
                    geometria.rectangulo();
                    break;
                case 3:
                    geometria.esfera();
                    break;
                default:
                    System.out.println("-------------------------Opcion no valida intente de nuevo---------------------");
                    break;
            }
        }while(op!=0);
        System.out.println("-----------GRACIAS POR INGRESAR-------------");
    }
}
