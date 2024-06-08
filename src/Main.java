import java.time.*;
import java.time.format.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Medico carlos, ana;
        carlos = new Medico(1, "Carlos Azevedo", "123.321.123-00", "", "CRMMG 45612", "Otorrinolaringologia");
        ana = new Medico(2, "Ana Moreira", "999.888.777.00", "Rua da Bahia, n° 88", "CRMBA 77789", "Cardiologia");

        System.out.println("Seja bem vindo ao sistema de agendamento de consultas!");
        System.out.println("Por favor, insira os dados do paciente:");

        System.out.print("Nome do paciente: ");
        String nomePaciente = scan.nextLine();

        System.out.print("CPF do paciente: ");
        String cpfPaciente = scan.nextLine();

        System.out.print("ID do paciente: ");
        int idPaciente = scan.nextInt();scan.nextLine();

        System.out.print("Endereço do paciente: ");
        scan.next();
        String enderecoPaciente = scan.nextLine();

        System.out.print("Endereço do telefone: ");
        String telefonePaciente = scan.nextLine();

        Paciente paciente = new Paciente(idPaciente,nomePaciente, cpfPaciente, enderecoPaciente,telefonePaciente);

        System.out.println("Digite qual médico realiza-rá o atendimento de acordo com o ID do médico "+
                "Exemplo: (1 para Carlos, 2 para Ana..)");

        System.out.println(carlos.exibeDados());
        System.out.println(ana.exibeDados());

        int escolhaMedico = scan.nextInt();scan.nextLine();
        Medico medicoEscolhido;
        if (escolhaMedico == 1){
            medicoEscolhido = carlos;
        } else {
            medicoEscolhido = ana;
        }

        System.out.println("Digite a data da consulta. (ex: DD/MM/AAAA)");
        String dataConsultaString = scan.nextLine();

        System.out.println("Digite o horario da consulta");
        String horaConsultaString = scan.nextLine();

        LocalTime horaConsulta = LocalTime.parse(horaConsultaString,DateTimeFormatter.ofPattern("H:mm"));
        LocalDate dataConsulta = LocalDate.parse(dataConsultaString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Consulta consulta = new Consulta (paciente,medicoEscolhido,dataConsulta,horaConsulta);

        System.out.println("\nDetalhes da consulta agendada:");
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("CPF: " + paciente.getCpf());
        System.out.println("Endereço: " + paciente.getEndereco());
        System.out.println("Médico: " + medicoEscolhido.getNome());
        System.out.println("Especialidade: " + medicoEscolhido.getEspecialidade());
        System.out.println("Data da consulta: " + consulta.getData());
    }
}
