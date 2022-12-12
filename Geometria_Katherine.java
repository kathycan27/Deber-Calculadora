import java.util.Scanner;

public class Geometria_Katherine {
    int opcion=0;
    double lado=0,lado1=0, lado2=0;
    double area, area1;
    double volumen;
    double perimetro;

    Scanner sc=new Scanner(System.in);
    public void cuadrado()
    {
        do {
            System.out.println("Escoja el tipo de figura \n 1: Cuadrado \n 2: Cubo ");
            opcion = sc.nextInt();
            System.out.println("Ingrese el valor del lado de la figura: ");
            lado = sc.nextInt();

            switch (opcion) {
                case 1:
                    valoresCuadrado();
                    break;
                case 2:
                    valoresCubo();
                    break;
            }
        }        while (opcion!=0);

    }
    public void valoresCuadrado()
    {
        do{
        System.out.println("Escoja el tpo de operacion que desea \n 1: Area \n 2: Perimetro \n 0: Salir");
        opcion= sc.nextInt();
            switch (opcion) {
                case 1:
                    area = lado * lado;
                    System.out.println("El area del cuadrado es: " + area);
                    break;
                case 2:
                    perimetro = lado * 4;
                    System.out.println("El perimetro es: " + perimetro);
                    break;
                default:
                    break;
            }
        }        while (opcion!=0);

    }
    public void valoresCubo()
    {
        do {
            System.out.println("Escoja el tpo de operacion que desea \n 1: Area \n 2: Perimetro \n 3: Volumen \n 0: Salir");
            switch (opcion) {
                case 1:
                    area = (Math.pow(lado, 2)) * 6;
                    System.out.println("El area del cuadrado es: " + area);
                    break;
                case 2:
                    perimetro = lado * 12;
                    System.out.println("El perimetro es: " + perimetro);
                    break;
                case 3:
                    volumen = Math.pow(lado, 3);
                    System.out.println("El perimetro es: " + volumen);
                    break;
                default:
                    break;
            }
        }        while (opcion!=0);

    }
    public void rectangulo()
    {
        do {
            System.out.println("Escoja el tipo de figura \n 1: Rectangulo \n 2: Prisma \n 0: Salir ");
            opcion = sc.nextInt();
            System.out.println("Ingrese el valor del lado 1 de la figura: ");
            lado = sc.nextInt();
            System.out.println("Ingrese el valor del lado 2 de la figura: ");
            lado1 = sc.nextInt();
            switch (opcion) {
                case 1:
                    valoresCuadrado();
                    break;
                case 2:
                    System.out.println("Ingrese el valor del lado 3 de la figura: ");
                    lado2 = sc.nextInt();
                    valoresCubo();
                    break;
            }
        }        while (opcion!=0);

    }
    public void valoresRectangulo()
    {
        do{
            System.out.println("Escoja el tpo de operacion que desea \n 1: Area \n 2: Perimetro \n 0: Salir");
            opcion= sc.nextInt();
            switch (opcion) {
                case 1:
                    area = lado * lado1;
                    System.out.println("El area es: " + area);
                    break;
                case 2:
                    perimetro = (2*lado) +(2*lado1);
                    System.out.println("El perimetro es: " + perimetro);
                    break;
                default:
                    break;
            }
        }        while (opcion!=0);

    }
    public void valoresPrisma()
    {
        do {
            System.out.println("Escoja el tpo de operacion que desea \n 1: Area \n 2: Perimetro \n 3: Volumen \n 0: Salir");
            switch (opcion) {
                case 1:
                    area = 2*((lado*lado1)+(lado*lado2)+(lado1*lado2));
                    System.out.println("El area total prisma es: " + area);
                    break;
                case 2:
                    perimetro = ((lado * 4)+(lado1*4)+(lado2*4));
                    System.out.println("El perimetro es: " + perimetro);
                    break;
                case 3:
                    volumen = lado*lado1*lado2;
                    System.out.println("El volumen es: " + volumen);
                    break;
                default:
                    break;
            }
        }        while (opcion!=0);

    }

    public void esfera()
    {
        do {
            System.out.println("Escoja el tipo de figura \n 1: Circulo \n 2: Esfera \n 0: Salir ");
            opcion = sc.nextInt();
            System.out.println("Ingrese el valor del radio de la figura: ");
            lado = sc.nextInt();

            switch (opcion) {
                case 1:
                    valoresCuadrado();
                    break;
                case 2:
                    valoresCubo();
                    break;
            }
        }        while (opcion!=0);

    }
    public void valoresCirculo()
    {
        do{
            System.out.println("Escoja el tpo de operacion que desea \n 1: Area \n 2: Perimetro \n 0: Salir");
            opcion= sc.nextInt();
            switch (opcion) {
                case 1:
                    area = (Math.PI*(Math.pow(lado,2)));
                    System.out.println("El area es: " + area);
                    break;
                case 2:
                    perimetro = 2*(Math.PI*lado);
                    System.out.println("El perimetro es: " + perimetro);
                    break;
                default:
                    break;
            }
        }        while (opcion!=0);

    }
    public void valoresEsfera()
    {
        do {
            System.out.println("Escoja el tpo de operacion que desea \n 1: Area \n 2: Volumen \n 0: Salir");
            switch (opcion) {
                case 1:
                    area = 4*(Math.PI*(Math.pow(lado,2)));
                    System.out.println("El area total prisma es: " + area);
                    break;

                case 2:
                    volumen = (4/3)*(Math.PI*(Math.pow(lado,3)));
                    System.out.println("El volumen es: " + volumen);
                    break;
                default:
                    break;
            }
        }        while (opcion!=0);

    }
}
