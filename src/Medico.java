import java.util.Scanner;

public class Medico extends Pessoa {

    Scanner scan = new Scanner(System.in);
    private String crm;
    private String especialidade;

    public Medico(int id, String nome, String cpf, String endereco, String crm, String especialidade) {
        super(id, nome, cpf, endereco);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String exibeDados() {
        return "\nDados do médico ID: " + getId() +
                "\nNome: " + getNome() +
                "\nCPF: " + getCpf() +
                "\nEndereço: " + getEndereco() +
                "\nCRM: " + getCrm() +
                "\nEspecialidade: " + getEspecialidade();
    }
}
