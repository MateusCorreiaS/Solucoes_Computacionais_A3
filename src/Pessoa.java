public class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;
    private int id;

    public Pessoa(int id, String nome, String cpf, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Pessoa(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        endereco = "ENDEREÇO NÃO INFORMADO.";
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public int setId() {
        return id;
    }

    public String setNome() {
        return nome;
    }

    public String setCpf() {
        return cpf;
    }

    public String setEndereco() {
        return endereco;
    }

}

