
import java.util.Calendar;

public abstract class Veiculo implements VeiculoI {
    private Marca marca;
    private Estado estado;
    private Locacao locacao;
    private Categoria categoria;
    private  double valorDeCompra;
    private String placa;
    private int ano;

    @Override
    public void locar(int dias, Calendar data, Cliente cliente) {
        if (this.estado == Estado.DISPONIVEL || this.estado == Estado.NOVO) {
            this.estado = Estado.LOCADO;
            double valorLocacao = dias * this.getValorDiariaLocacao();
            this.locacao = new Locacao(dias, valorLocacao, data, cliente);
        } else {
            System.err.println("Veículo de placa " + this.placa + " não está disponível para locação.");
        }
    }

    @Override
    public void vender() {
        if (this.estado != Estado.LOCADO) {
            this.estado = Estado.VENDIDO;
        } else {
            System.err.println("Não é possível vender um veículo que está atualmente locado.");
        }
    }

    @Override
    public void devolver() {
        if (this.estado == Estado.LOCADO) {
            this.estado = Estado.DISPONIVEL;
            this.locacao = null;
        } else {
            System.err.println("Este veículo não está locado para ser devolvido.");
        }
    }

    @Override
    public Estado getEstado() {
        return estado;
    }

    @Override
    public Marca getMarca() {
        return marca;
    }

    @Override
    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public Locacao getLocacao() {
        return locacao;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public double getValorParaVenda() {
        int idade = Calendar.getInstance().get(Calendar.YEAR) - ano;

        double valorDeVenda = valorDeCompra - idade * 0.15 * valorDeCompra;

        if(valorDeVenda < valorDeVenda * 0.10 || valorDeVenda < 0){
            valorDeVenda = valorDeCompra * 0.1;
            return valorDeVenda;
        }

        return valorDeVenda;
    }

    @Override
    public abstract double getValorDiariaLocacao();


}
