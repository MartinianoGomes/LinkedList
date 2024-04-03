# Informações

<p>Uma lista lincada é uma estrutura de dados dinâmica que armazena uma coleção de elementos de forma linear. Cada elemento da lista, chamado de nó, contém dois campos:</p>

- **Dado:** Armazena o valor do elemento.
- **Próximo:** Armazena o endereço do próximo nó na lista.

![alt text](src/images/image.png)

# Como usar

<p>As operações básicas em uma lista lincada são:</p>

- **Inserir:** Adiciona um novo nó na lista.
- **Remover:** Remove um nó da lista.
- **Buscar:** Procura um nó na lista.
- **Percorrer:** Acessa cada nó da lista um por um.

# Para que serve

<p>As listas lincadas são usadas em diversas aplicações, como:</p>

- **Armazenar dados de forma dinâmica:** As listas lincadas permitem adicionar e remover elementos facilmente, sem a necessidade de redimensionar a estrutura de dados.
- **Implementar filas e pilhas:** As listas lincadas podem ser facilmente adaptadas para implementar filas e pilhas, que são estruturas de dados que seguem a ordem FIFO (First In First Out) e LIFO (Last In First Out), respectivamente.
- **Implementar algoritmos:** As listas lincadas são usadas em diversos algoritmos, como ordenação e busca.

# Vantagens

- **Dinâmica:** Permite adicionar e remover elementos facilmente.
- **Eficiente em memória:** Só usa memória para os elementos que estão na lista.
- **Versátil:** Pode ser usada para implementar diversas estruturas de dados e algoritmos.

# Desvantagens

- **Acesso aleatório lento:** Acessar um elemento específico na lista pode ser lento, pois é necessário percorrer a lista desde o início.
- **Gerenciamento de memória:** É necessário gerenciar manualmente a memória alocada para os nós da lista.