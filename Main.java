import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1) Armazene os dados em vetores e exiba na tela.
        String nome[] = {"Rui", "Iumi", "Nei", "Susi", "Alan", "Ian", "Bia", "Gil" };
        double salarioBase[] = {3000.00, 1000.00, 800.00, 1800.00, 1100.00, 1500.00, 1200.00, 900.00};
        int numDep[] = {4, 2, 2, 0, 1, 3, 3, 0};

        for (int i = 0; i < nome.length; i++) {
            System.out.printf("%8s %10.2f %8d \n", nome[i], salarioBase[i], numDep[i]);
        }
        System.out.println();

        //2) Calcule e escreva a média dos salários base dos funcionários com menos de 3 dependentes.

        double mediaSalBas, somaMed = 0;
        int qtdFunc3 = 0;

        for (int i = 0; i < salarioBase.length; i++) {
            if (numDep[i] < 3) {
                somaMed += salarioBase[i];
                qtdFunc3++;
            }
        }
        mediaSalBas = somaMed / qtdFunc3;
        System.out.println("A média dos salários base dos funcionarios com menos de 3 depentes é: " + mediaSalBas);
        System.out.println();


        //3) Exiba os nomes e os salários finais de todos os funcionários, sendo que, para cada um dos dependentes,
        // é acrescentado o salário família ao salário base. O valor do salário família é 70 reais para salário base até
        // 1110 reais e 50 reais para salário base acima de 1100 reais até 1550 reais. Acima desse valor, o funcionário
        // não tem direito ao salário-família.

        double salarioFinal = 0, totalAcresc;
        int acres1100 = 70, acres1550 = 50;

        for (int i = 0; i < nome.length; i++) {
            if (salarioBase[i] <= 1100) {
                totalAcresc = numDep[i] * acres1100;
                salarioFinal = totalAcresc + salarioBase[i];
                System.out.printf("%6s   Salario Final é:   %6.2f\n",nome[i], salarioFinal);

            } else if (salarioBase[i] > 1100 && salarioBase[i] <= 1550) {
                totalAcresc = numDep[i] * acres1550;
                salarioFinal = totalAcresc + salarioBase[i];
                System.out.printf("%6s   Salario Final é:   %6.2f\n",nome[i], salarioFinal);
            } else {
                System.out.printf("%6s   Essa familia não tem direito ao salario familia:   %6.2f\n",nome[i], salarioBase[i]);

            }
        }

        //4) Solicite que o usuário digite o número de dependentes e calcule e exiba a porcentagem de funcionários que
        //tem mais dependentes do que o número digitado.

        Scanner scan = new Scanner(System.in);

        double porcentagem;
        int dependentes;
        System.out.println();
        System.out.println("Digite a quantidade de dependentes: ");
        dependentes = scan.nextInt();

        int contador = 0;
        for (int i = 0; i < nome.length; i++) {
            if (numDep[i] > dependentes) {
                contador++;
            }
        }

        porcentagem = (double) contador / nome.length * 100;
        System.out.println("Porcentagem de funcionários com mais dependentes: " + porcentagem + "%");
        System.out.println();


        //5) Qual é o nome e o número de dependentes do funcionário que tem o menor salário?

        String nomeMenorSalario = nome[0];
        int numDepMenorSalario = 0;
        double menorSalario = salarioBase[0];

        for (int i = 0; i < numDep.length; i++) {
            if (salarioBase[i] < menorSalario) {
                menorSalario = salarioBase[i];
                numDepMenorSalario = numDep[i];
                nomeMenorSalario = nome[i];
            }
        }
        System.out.println("O Nome do menor salário é: " + nomeMenorSalario);
        System.out.println("O numero de dependentes do menor salário é: " + numDepMenorSalario);




    }
}