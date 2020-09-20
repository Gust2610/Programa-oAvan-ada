*Padrão de Projetos*
**Pattern Name and Classification**
*Composite
•	Padrão Estrutural 

**Intent e Motivation**
•	Utilizar padrão de projetos para facilitar a implementação de objetos com estrutura de árvore.
•	Modificar a estrutura do objeto
•	Utilizado para objetos com estruturas hierárquicas
•	Exemplo de Aplicações de inventários(masculino>roupa>blusa ...)

**Applicability**
•	Utilizado para compor uma estrutura de árvore e hierárquica.
• Facilita a implementação de nós da estrutura, todos serão apontados para a mesma superclasse que terá as caracteristicas unicas.

**Structure**
![](https://3.bp.blogspot.com/-2GHeEIA_Rso/T8_QjRYqdEI/AAAAAAAAABk/KiKtXtMMaIw/s1600/800px-composite_uml_class_diagram_fixed-svg.png =250x250)

**Participants**
•	4 participantes – Componentes, folha, composição, cliente.
•	Componentes – Contem comportamentos comuns para toda a hierarquia 
•	Folha – São similares as composições, porém não possui filhos.
•	Composição – Define os comportamentos dos componentes
•	Clientes – Manipula os objetos da composição

**Sample**
•	4 participantes – Componentes, folha, composição, cliente.
