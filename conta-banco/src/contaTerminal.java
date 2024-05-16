import java.util.Scanner;

import javax.swing.JOptionPane;

public class contaTerminal{
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
        
    int numero = 0;
		String agencia = " ";
		String nomeCliente = " ";
		Double saldo = 0.0 ;

		System.out.println("Por favor, insira seu nome :");
		nomeCliente = input.nextLine();

		System.out.println(nomeCliente + ", Por favor digite sua agência bancária: ");
		agencia = input.nextLine();
		
		System.out.println(nomeCliente + ", agora precisamos que você digite conta bancária: ");
		numero = input.nextInt();
		System.out.println(nomeCliente + ", agora falta pouco para finalizarmos, digite o valor do seu primeiro depósito: ");
		saldo = input.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta "
						+ "em nosso banco, sua agência é: " + agencia + ", conta: "+ numero + " "
						+ "e seu saldo: " + saldo + " já está disponível para saque.");
		

	

    }
}
