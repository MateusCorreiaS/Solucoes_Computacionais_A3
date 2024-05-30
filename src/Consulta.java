import java.time.*;

public class Consulta {

    private int protocolo;
    private String paciente;
    private String medico;
    private LocalDate data;
    private LocalTime hora;

    public Consulta(int protocolo, String paciente, String medico, LocalDate data, LocalTime hora) {
        this.protocolo = protocolo;
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
    }

    public int getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(int protocolo) {
        this.protocolo = protocolo;
    }

    // Getter e Setter para paciente
    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    // Getter e Setter para medico
    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }
}
