package projetodio.bancodigital;

import com.sun.source.tree.CaseTree;
import java.lang.invoke.SwitchPoint;
import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

//   ===================VARIAVEIS E ESTATICOS================
                int escolha=0;
                int escolha2=0;
                int escolha3=0;
                int i=1;
                Banco banco =new Banco();
                Scanner scanner = new Scanner(System.in);
                Cliente cliente1 =new Cliente();
                Cliente cliente2 =new Cliente();
                Conta conta1 = new ContaCorrente(cliente1);

    /*===================TENTATIVA DE IMPLEMENTO DE LISTA=========================*/

                //      List<Conta> listcontas = new ArrayList<>();
                  /*System.out.println("Insira/ Crie algumas contas para fazer a simulação");
                  do {
                    System.out.println("Insira o nome do cliente");
                    cliente1.setNome(scanner.nextLine());
                    System.out.println("Insira a "+ i +"conta");
                    listcontas.add(conta1 = new ContaCorrente(cliente1));
                    System.out.println("deseja continuar?? 1-sim; 2-não;");
                    escolha3=scanner.nextInt();
                    i++;
                  }while (escolha3 == 1);
                  System.out.println(listcontas); */

    //  =======================OPAÇÕES DE MOVIMENTO NA CONTA=====================

        System.out.println("Insira nome de usuario ou de conta");
        cliente2.setNome(scanner.nextLine());
        Conta conta2 = new ContaCorrente(cliente2);

        do {
            System.out.println("Qual operação deseja efetuar Sr " + cliente2.getNome());
            System.out.println(" 1-Deposito " + " 2-Levantamento " + " 3-Tranferência ");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Digite a quantia ser depositada");
                    conta2.depositar(scanner.nextInt());
                    System.out.println("Deseja retirar um extrato? 1-sim; 2-não");
                    escolha2=scanner.nextInt();
                    if (escolha2 == 1) {
                        conta2.extrato();
                    } else {
                        System.out.println("Obrigado pela escolha!!retire o cartão");
                    }
                    break;
                case 2:
                    System.out.println("Digite a quantia ser levantada");
                    conta2.levantamento(scanner.nextInt());
                    System.out.println("Deseja retirar um extrato? 1-sim; 2-não");
                    escolha2=scanner.nextInt();
                    if (escolha2 == 1) {
                        conta2.extrato();
                    } else {
                        System.out.println("Obrigado pela escolha!!retire o cartão");
                    }
                    break;
                case 3:
                    System.out.println("Digite a quantia transferir");
                    conta2.transferir(scanner.nextInt(), conta1);
                    System.out.println("Deseja retirar um extrato? 1-sim; 2-não");
                    escolha2=scanner.nextInt();
                    if (escolha2 == 1) {
                        conta2.extrato();
                        conta1.extrato();
                    } else {
                        System.out.println("Obrigado pela escolha!!retire o cartão");
                    }
                    break;
                default:
                    System.out.println("Nehuma opção celecion");

            }
            System.out.println("Deseja fazer outra operação?? 1-sim; 2-não");
            escolha3=scanner.nextInt();
        }while (escolha3 ==1);
    }
}


