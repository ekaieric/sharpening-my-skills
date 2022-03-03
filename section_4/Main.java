public class Main {
    public static void main(String[] args) {
        double x = 3.10;
        double y = 5.90;
        double a, b, c;

        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " é " + a);
        System.out.println("Raiz quadrada de " + y + " é " + b);
        System.out.println("Raiz quadrada de 25.0 é " + c);

        int z = 2;
        double el;
        el = Math.pow(z, 2);
        System.out.println(z + " elevado a 2 é " + el);
    }
}
