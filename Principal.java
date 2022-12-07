package ExercicioHeranca;

import ExercicioHeranca.Homem;
import ExercicioHeranca.Mulher;
import ExercicioHeranca.Pessoa;
import ExercicioHeranca.PessoaIMC;
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("CALCULO IMC");

        int j = 0;

        System.out.println("Número de pessoas: ");
        Scanner tamArray = new Scanner(System.in);
        int arrayTam = tamArray.nextInt();

        System.out.println("Qual o sexo da pessoa: 1 - HOMEM | 2 - MULHER");
        Scanner tipoPessoa = new Scanner(System.in);
        int pessoaTipo = tipoPessoa.nextInt();

        switch (pessoaTipo) {

            case 1:
                ArrayList listaHomem = new ArrayList<Homem>();

                for (int i = 0; i < arrayTam; i++) {

                    System.out.println("\n Nome do Homem: ");
                    Scanner nomePessoa = new Scanner(System.in);
                    String nome = nomePessoa.nextLine();

                    System.out.println("Data de nascimento:(dd/mm/aaaa) ");
                    Scanner dataNasc = new Scanner(System.in);
                    String NascPessoa = dataNasc.nextLine();

                    System.out.println("Peso: ");
                    Scanner pesoPessoa = new Scanner(System.in);
                    Double peso = pesoPessoa.nextDouble();

                    System.out.println("Altura: ");
                    Scanner pessoaAltura = new Scanner(System.in);
                    Double altura = pessoaAltura.nextDouble();

                    listaHomem.add(i, (new Homem(nome, NascPessoa, peso, altura)));
                }

                while (j < listaHomem.size()) {

                    System.out.println(listaHomem.get(j));

                    j++;
                }

                break;

            case 2:
                ArrayList listaMulher = new ArrayList<Mulher>();

                for (int i = 0; i < arrayTam; i++) {

                    System.out.println("\n Nome da mulher: ");
                    Scanner nomePessoa = new Scanner(System.in);
                    String nome = nomePessoa.nextLine();

                    System.out.println("Data de nascimento: (dd/mm/aaaa)");
                    Scanner dataNasc = new Scanner(System.in);
                    String NascPessoa = dataNasc.nextLine();

                    System.out.println("Peso: ");
                    Scanner pesoPessoa = new Scanner(System.in);
                    Double peso = pesoPessoa.nextDouble();

                    System.out.println("Altura: ");
                    Scanner pessoaAltura = new Scanner(System.in);
                    Double altura = pessoaAltura.nextDouble();

                    listaMulher.add(i, (new Mulher(nome, NascPessoa, peso, altura)));
                }

                while (j < listaMulher.size()) {

                    System.out.println(listaMulher.get(j));

                    j++;
                }
                break;

            default:
                System.out.println("Escolha 1 ou 2");
                break;

        }
    }
}