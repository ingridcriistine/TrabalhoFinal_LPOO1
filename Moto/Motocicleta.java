public class Motocicleta extends Veiculo {

    private ModeloMotocicleta modelo;

    
    public Motocicleta (ModeloMotocicleta modelo) {
        this.modelo = modelo;
    }
    
    public ModeloMotocicleta getModelo() {
        return modelo;
    }
    
    @Override
    public double getValorDiariaLocacao() {
        switch (this.getCategoria()) {
            case POPULAR:
                return 70.00;
            case INTERMEDIARIO:
                return 200.00;
            case LUXO:
                return 350.00;
            default:
                throw new AssertionError();
        }
    }
    
}
