# Controle de Funcionários e Salários

Este é um programa Java que realiza diversas operações com dados dos funcionários e salários. Os dados dos funcionários, como nome, salário base e número de dependentes, são armazenados em vetores.

## Dados dos Funcionários

O programa utiliza os seguintes vetores para armazenar os dados dos funcionários:

- `nome`: vetor de strings contendo os nomes dos funcionários.
- `salarioBase`: vetor de números de ponto flutuante contendo os salários base de cada funcionário.
- `numDep`: vetor de inteiros contendo o número de dependentes de cada funcionário.

## Exibindo os Dados dos Funcionários

Ao iniciar o programa, os dados dos funcionários serão exibidos na tela.

## Média dos Salários Base

O programa calcula e exibe a média dos salários base dos funcionários que possuem menos de 3 dependentes.

## Cálculo dos Salários Finais

O programa exibe os nomes e os salários finais de todos os funcionários, considerando o acréscimo do salário família de acordo com o número de dependentes. O valor do salário família é R$ 70 para salários base até R$ 1100 e R$ 50 para salários base acima de R$ 1100 até R$ 1550. Funcionários com salário base acima de R$ 1550 não têm direito ao salário-família.

## Porcentagem de Funcionários com Mais Dependentes

O programa solicita que o usuário digite o número de dependentes e calcula a porcentagem de funcionários que possuem mais dependentes do que o número informado.

## Funcionário com o Menor Salário

O programa identifica o funcionário que possui o menor salário e exibe o nome e o número de dependentes desse funcionário.

## Executando o Programa

1. Certifique-se de ter o Java JDK instalado em seu computador.
2. Clone este repositório ou faça o download dos arquivos.
3. Abra o terminal ou prompt de comando na pasta do projeto.
4. Compile o código usando o comando: `javac Main.java`
5. Execute o programa com o comando: `java Main`

## Observações

- Este programa foi desenvolvido com fins educacionais e pode conter limitações ou simplificações.
- Os dados dos funcionários são armazenados em memória e não são persistentes.
- O programa não possui uma interface gráfica, todas as interações são feitas através do terminal ou prompt de comando.

## Autor

Nome: Felippe Diniz  
E-mail: felippemu@hotmail.com

---
Este projeto é parte de um trabalho escolar/prova e não representa um aplicativo comercial completo. Tem como finalidade apenas demonstrar habilidades de programação em Java.
