package logicanegocio;

public class Parcial {

    public String calcularRaices(double a, double b, double c) {
        try {
            if (a == 0) {
                throw new ArithmeticException("'a' no puede ser 0, la ecuación no es de segundo orden.");
            }

            double discriminante = b * b - 4 * a * c;
            if (discriminante < 0) {
                throw new ArithmeticException("El discriminante es negativo, las raíces son complejas.");
            }

            if (Double.isNaN(discriminante) || Double.isInfinite(discriminante)) {
                throw new ArithmeticException("Los valores ingresados no son válidos o son demasiado grandes.");
            }
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            return "x=" + x1 + ", x=" + x2;

        } catch (ArithmeticException e) {
            return "Error: " + e.getMessage();
        }
    }
}