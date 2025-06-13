public class Automovel extends Veiculo {

    private ModeloAutomovel modelo;

    
    public Automovel (ModeloAutomovel modelo) {
        this.modelo = modelo;
    }
    
    public ModeloAutomovel getModelo() {
        return modelo;
    }
    
    @Override
    public double getValorDiariaLocacao() {
        switch (this.getCategoria()) {
            case POPULAR:
                return 100.00;
            case INTERMEDIARIO:
                return 300.00;
            case LUXO:
                return 450.00;
            default:
                throw new AssertionError();
        }
    }
    
}

