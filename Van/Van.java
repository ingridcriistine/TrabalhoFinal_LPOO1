public class Van extends Veiculo {

    private ModeloVan modelo;

    
    public Van (ModeloVan modelo) {
        this.modelo = modelo;
    }
    
    public ModeloVan getModelo() {
        return modelo;
    }
    
    @Override
    public double getValorDiariaLocacao() {
        switch (this.getCategoria()) {
            case POPULAR:
                return 200.00;
            case INTERMEDIARIO:
                return 400.00;
            case LUXO:
                return 600.00;
            default:
                throw new AssertionError();
        }
    }
    
}

