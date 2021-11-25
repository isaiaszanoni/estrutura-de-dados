# Estrutura de Dados

---

### Commits:

### 01

O algoritmo adiciona alunos a um array utilizando a seguinte lógica: 

- Vamos percorrer um array e observar cada index. Se for null, então vamos adicionar um `nome` para `Aluno`.
- ⚠ Este algoritmo tem um problema de performance. É um algoritmo conhecido como o(n). O tempo de execução (runtime) depende do tamanho deste array. Vamos buscar desenvolver um metodo adiciona cujo tempo de execução é constante. 

### 02

Resolvendo o problema de performance do algoritmo anterior, vamos:

- Iniciar uma variável chamada `totalDeAlunos` com o valor 0 (zero).

- Esta variável vai nos indicar qual é a posição vazia em nosso array. Então basta adicionar o aluno dentro do array na posição == a esta variável:

  ```java
  this.alunos[totalDeAlunos] = aluno;
  totalDeAlunos++
  ```

- No final, adicionamos algumas saídas no console afim de acompanhar todo o processo do algoritmo e também utilizando o método tamanho.

---