public class Cliente {
    
    private String Nome;
    private String Sobrenome;
    private String RG;
    private String CPF;
    private String Endereco;

    public Cliente(String nome, String sobrenome, String rg, String cpf, String endereco){
        this.Nome = nome;
        this.Sobrenome = sobrenome;
        this.RG = rg;
        this.CPF = cpf;
        this.Endereco = endereco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    
}
