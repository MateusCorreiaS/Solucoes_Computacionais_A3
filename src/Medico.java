public class Medico extends Pessoa {

    private String crm;
    private String especialidade;

    public Medico(int id, String nome, String cpf, String telefone, String endereco, String crm, String especialidade) {
        super(id, nome, cpf, telefone, endereco);
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
}
