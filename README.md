## *Padrão de Projetos* <br />
### **Pattern Name and Classification** <br />
*Padrão Factory Method* <br />
  •	Padrão Criacional <br />

### **Intent e Motivation** <br />
  •	1. Define uma interface para criação de objetos. <br />
  •	2. As subclasses são responsaveis pela inicialização e utilização da interface<br />
  •	3. Centralização das dependências em um unico ponto. <br />

### **Applicability** <br />
  •	Essencial quando o projeto tem uma estrutura de classes complexas com varias dependências entre si.

### **Structure** <br />
<img align="left" width="200" height="100" src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.devmedia.com.br%2Fcomo-usar-o-pattern-factory-na-plataforma-java-ee%2F32814&psig=AOvVaw071p2qKuz01zWi61t5wQZP&ust=1606651122325000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCMCj34OYpe0CFQAAAAAdAAAAABAD"> <br />

<br />
<br />
<br />
<br />
<br />
### **Participants** <br />
  • O padrão Factory Method possui 4 participantes
  • Cliente: É quem tem a dependência com iProduct.
  • Creator: Responsável pela construção e definição do Factory Method
  • IProduct: Define a interface de objetos que o Factory cria.
  • ProductA, ProductB,C: Implementa a interface do Product.
  

### **Sample**
•	[Codigo feito](https://github.com/Gust2610/ProgramaaoAvancada/blob/Gust2610-patch-MM/Memento.class)<br />

