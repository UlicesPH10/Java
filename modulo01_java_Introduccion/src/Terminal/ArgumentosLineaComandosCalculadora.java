package Terminal;

public class ArgumentosLineaComandosCalculadora {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Ingresar una operacion y 2 numeros ejemplo: + 1 2");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;

        resultado = switch (operacion){
            case "+" -> a + b;
            case "-" -> a -b;
            case "*" -> a * b;
            case "/" -> {
                if(b==0){
                    throw new ArithmeticException("División por cero");
                }
                yield (double) a / b;
            }
            default -> throw new IllegalStateException("Unexpected value: " + operacion);
        };

        System.out.printf("Resultado: %d %s %d = %f%n", a, operacion, b, resultado);


    }
}
