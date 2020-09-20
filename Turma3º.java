package Template_Method;

public class Turma3º extends ProfessorVirtual{
    
    public void aulaPortugues(){
        System.out.println("Estudar semanalmente Portugues por 4 horas");
        System.out.println("Enviar as duas redações sobre o tema escolhido");
    }
    
    public void aulaGeografia(){
        System.out.println("Estudar semanalmente Geografia por 2 horas");
        System.out.println("Entregar os exericios da pagina 4");
    }
    public void aulaCiencias(){
        System.out.println("Estudar semanalmente Ciencias por 4 horas");
        System.out.println("Finalizar o experimento da aula passada");
    }
}

