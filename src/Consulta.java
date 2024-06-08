import java.time.*;

public class Consulta {

    private Paciente paciente;
    private Medico medico;
    private LocalDate data;
    private LocalTime hora;

    public Consulta(Paciente paciente, Medico medico, LocalDate data, LocalTime hora) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
    }

    // Getter e Setter para paciente
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    // Getter e Setter para medico
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDate getData(){
        return data;
    }

    public LocalDate setData(LocalDate data){
        return data;
    }

    public LocalTime getHora(){
        return hora;
    }

    public LocalTime setHora(LocalTime hora){
        return hora;
    }
}




