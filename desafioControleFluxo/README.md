### README.md

# DesafioControleFluxo

## Descrição

Este projeto tem como objetivo praticar o controle de fluxo em Java, recebendo dois números inteiros e imprimindo uma sequência de números com base na diferença entre eles. Se o primeiro número for maior que o segundo, uma exceção customizada é lançada.

## Estrutura do Projeto

O projeto é composto por duas classes principais:

1. **Contador**
   - Lê dois números inteiros do terminal.
   - Realiza a contagem e imprime uma sequência de números.
   - Trata a exceção `ParametrosInvalidosException` caso o primeiro número seja maior que o segundo.

2. **ParametrosInvalidosException**
   - Exceção customizada que é lançada quando o primeiro número é maior que o segundo.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/DesafioControleFluxo.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd DesafioControleFluxo
   ```
3. Compile as classes:
   ```bash
   javac Contador.java ParametrosInvalidosException.java
   ```
4. Execute o programa:
   ```bash
   java Contador
   ```

## Exemplo de Uso

Ao executar o programa, você será solicitado a digitar dois números inteiros. O programa imprimirá uma sequência de números baseada na diferença entre eles. Se o primeiro número for maior que o segundo, a seguinte mensagem será exibida:
```
O segundo parâmetro deve ser maior que o primeiro
```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

**Exemplo de Interação:**

```sh
Digite o primeiro parâmetro
12
Digite o segundo parâmetro
30
Imprimindo o número 1
Imprimindo o número 2
...
Imprimindo o número 18
```

```sh
Digite o primeiro parâmetro
30
Digite o segundo parâmetro
12
O segundo parâmetro deve ser maior que o primeiro
```

---
