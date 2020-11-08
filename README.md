## *Padrão de Projetos* <br />
### **Pattern Name and Classification** <br />
*Padrão Memento* <br />
  •	Padrão Comportamental <br />

### **Intent e Motivation** <br />
  •	1. Permite capturar e externalizar um estado de um objeto. <br />
  •	2. O objetivo desse padrão é fornecer uma maneira de implementação desse conceito sem quebrar as regras de encapsulamento<br />
  •	3. É utilizado para programas recupere errs. <br />

### **Applicability** <br />
  •	O Padrão Adapter permite pegar um estado de objeto e alterar mais tarde.,.

### **Structure** <br />
<img align="left" width="200" height="100" src="https://miro.medium.com/max/578/0*4WwqboTHnQVFz1FS."> <br />

<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
<br />
### **Participants** <br />
  • O padrão Memento possui 3 participantes
  • Memento: Classe que representa um snapshot, que seria um objeto a ser restaurado em um Originador. <br />
  • Originator: Classe na qual o estado atual é mantido. <br />
  • Caretaker: Responsável por armazenar e restaurar o estado do Originador. <br />


### **Sample**
  •	Conversor de temperaturas Celsius e Farenheit <br />
  •	Criamos um adaptar que converte a temperatura Farenheit em Celsius. <br />
  •	Utilizamos os recursos do padrão Adapter. <br />
