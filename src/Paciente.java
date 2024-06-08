public class Paciente extends Pessoa {

    private String telefone;

    public Paciente(int id, String nome, String cpf, String endereco, String telefone) {
        super(id, nome, cpf, telefone, endereco);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public String setTelefone(String telefone){
        this.telefone = telefone;
        return telefone;
    }
}
