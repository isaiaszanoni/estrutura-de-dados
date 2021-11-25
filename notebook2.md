# Estrutura de Dados

---

### Commits:

### 01

O algoritmo adiciona alunos a um array utilizando a seguinte lógica: 

- Vamos percorrer um array e observar cada index. Se for null, então vamos adicionar um `nome` para `Aluno`.
- ⚠ Este algoritmo tem um problema de performance. É um algoritmo conhecido como o(n). O tempo de execução (runtime) depende do tamanho deste array. Vamos buscar desenvolver um metodo adiciona cujo tempo de execução é constante. 

---

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

### 03

```java
public boolean contem(Aluno aluno) {
    for(int a = 0; a < totalDeAlunos; a++){
        if(aluno.equals(alunos[a])){
            return true;
        }
    }
}
```

- A função acima, que colocamos para retornar se um determinado aluno está ou não em nosso array é, também, um algoritmo (o mesmo, praticamente) o(n). Avançando neste curso usaremos outra estrutura de dados para lidar com esta necessidade.

- ```java
  lista.adiciona(a1);
  System.out.println( a1 + " adicionado na posição: " + lista.tamanho());
          
  ```

  Vinha dando um um println a cada aluno adicionado por meio do metodo `adiciona`. Esta é uma informação que quero manter no meu algoritmo, então vou colocá-la diretamente no metodo. 

- E se eu colocar um numero fora do intervalo do meu array? Obvio, vamos ter um erro de ‘`index out of bounds`’. Vamos tratar de maneira mais amigável este erro.
  O metodo `posicaoOcupada` 

- 

