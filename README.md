Padrão de Projetos
*Template Method – Informações gerais sobre esse padrão ensinado nas ultimas aula
*Padrão de Projetos*
**Pattern Name and Classification**
*Template Metho
  •	Padrão Comportamental 

**Intent e Motivation**
  •	Criar a base do algoritmo(principal) e permite que as subclasses os modifiquem de acordo com suas especialidades.
  •	Baseado em recursos de herança, na qual a sub classe herda todas as caracteristicas da classe pai e se necessário adota algumas particularidades.
  •	Exemplo de Aplicações de Escola(Turma-> 1º Ano, 2º Ano)

**Applicability**
  •	O Padrão Template Method define o esqueleto de um algoritmo dentro de um método, transferindo alguns de seus passos para as subclasses
  • Template Method permite que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura do próprio algoritmo.

**Structure**
<img align="left" width="100" height="100" src="https://miro.medium.com/max/866/1*fyEAfGmdfL9RPiz5ua_HCA.png">

**Participants**
  •	2 participantes – Classe Abstrata(pai) e Classe Concreta(filhos)
  • Classe Abstrata(pai) - Define um esqueleto que será implementado pelas subclasses, contém as caracteristicas gerais do do projeto.
  • Classe Concreta(filhos) - Define as particularidades de cada subclasses.

**Sample**
  •	Projeto de Professor Virtual, no qual o aluno informa a sua turma e a classe lista todas as suas atividades a serem realizadas na semana.
  •	A classe de Professor Virtual contém as caracteristicas gerais de todas as turmas, como horário para estudar e atividades a serem realizadas.
  •	As classes das turmas contém as caracteristicas de cada turma, definindo atividades especificas e aumento na carga de estudo semanal.
