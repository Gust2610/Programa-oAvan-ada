package Template_Method;

public abstract class ProfessorVirtual {
    ProfessorVirtual(){}
    
    public void consultaAulas() {
      aulaHistoria();
      aulaGeografia();
      aulaPortugues();
      aulaMatematica();
      aulaIngles();
      aulaCiencias();
    }
    protected void aulaHistoria(){
        System.out.println("Estudar semanalmente Historia por 2 horas");
    }
    protected void aulaGeografia(){
        System.out.println("Estudar semanalmente Geografia por 2 horas");
    }
    protected void aulaPortugues(){
        System.out.println("Estudar semanalmente Portugues por 4 horas");
    }
    protected void aulaMatematica(){
        System.out.println("Estudar semanalmente Matematica por 4 horas");
    }
    protected void aulaIngles(){
        System.out.println("Estudar semanalmente Ingles por 2 horas");
    }
    protected void aulaCiencias(){
        System.out.println("Estudar semanalmente Ciencias por 2 horas");
    }
    
    
    
    
}
