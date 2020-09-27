Padrão de Projetos
# *Singleton – 
## *Padrão de Projetos* <br />
### **Pattern Name and Classification** <br />
*Singleton* <br />
  •	Padrão Criacional  <br />

### **Intent e Motivation** <br />
  •	1. Permite que uma instancia seja iniciada apenas uma vez durante toda a executação. <br />
  •	2. A propria classe gerencia a instancia, não é possivel fazer isso através de outras classes. <br />
  •	3. Reduz o consumo de memória desnecessário. <br />

### **Applicability** <br />
  •	Ajuda em aplicações com multiplos acesso, onde temos que controlar a concorrência de recursos
  • Utilizada em diversas partes do codigo.

### **Structure** <br />
<img align="left" width="500" height="300" src="https://programmer.group/images/article/70fb5c64e18617361cd64c4597fac3ed.jpg"> <br />
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
<br />
### **Participants** <br />
  •	2 participantes – Classe Singleton e Client <br />
  • Classe Singleton - Única classe desse operador, contém a unica instancia gerada. <br />
  • Classe Client - Quem utiliza o Singleton. <br />

### **Sample**
  •	Uma das maiores utilizações do padrão Singleton é deixar a conexão aberta, para assim evitar ficar criando instancias para cada solicitação.<br />
  •	Fiz um exemplo de uma classe para manter a conexão em banco de dados.<br />
  •	Utilizei a Variação de Static Block, fazendo a inicialização da instancia após um teste de erro.<br />
  •	No codigo deixei as explicações de cada passo de implementação.<br />
  •	[Codigo feito](https://github.com/Gust2610/ProgramaaoAvancada/blob/Gust2610-patch-SG/Main.java)<br />
  
