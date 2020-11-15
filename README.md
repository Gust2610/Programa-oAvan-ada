## *Padrão de Projetos* <br />
### **Pattern Name and Classification** <br />
*Padrão State* <br />
  •	Padrão Comportamental <br />

### **Intent e Motivation** <br />
  •	1. Permite alterar o comportamento de um objeto de acordo com seus estados. <br />
  •	2. Possibilita o gerenciamento de diferentes estados contidos na classe<br />

### **Applicability** <br />
  •	Pode ser utilizado para construir uma maquina de estados
  •	Exemplo de um pedido de comida online, com estados de pedido feito, pedido entregue ao restaurante, pedido pronto, pedido enviado e pedido entregue ao cliente.
  

### **Structure** <br />
<img align="left" width="300" height="150" src="https://dzone.com/sites/all/files/state_pattern.PNG"> <br />

<br />

<br />
<br />
<br />
<br />
<br />
<br />
### **Participants** <br />
  • O padrão State possui 3 participantes
  • Context: Responsável por definir a interface com o cliente e mantém o estado concreto atual. <br />
  • State: Responsável por unir os diferentes estados do objeto; <br />
  • ConcreteState: Diferentes tipos de estados que o objeto pode desempenhar. <br />


### **Sample**
•	[Codigo feito](https://github.com/Gust2610/ProgramaaoAvancada/tree/Gust2610-patch-ST/PadraoState)<br />
