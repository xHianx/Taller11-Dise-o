public class Costo {
    private double valor;

    public Costo(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("El costo no puede ser menor a 0");
        }
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
