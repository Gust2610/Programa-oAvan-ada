package Template_Method;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    class Main {
    public static void main(String[] args) throws 
        IOException {
            System.out.println("********TESTE1 **********");
            System.out.println("********AGENDA RESERVADA **********");
            ProfessorVirtual a1 = new Turma1º();
            a1.consultaAulas(); 
            
            
            System.out.println("********TESTE2 **********");
            System.out.println("********AGENDA RESERVADA **********");
            ProfessorVirtual a2 = new Turma2º();
            a1.consultaAulas(); 
            
            
            System.out.println("********TESTE3 **********");
            System.out.println("********AGENDA RESERVADA **********");
            ProfessorVirtual a3 = new Turma3º();
            a1.consultaAulas(); 
    }
        
    }
    

