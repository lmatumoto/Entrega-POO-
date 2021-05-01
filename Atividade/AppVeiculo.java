package Atividade;

import java.util.Scanner;

public class AppVeiculo {
    public static void main(String[] args) {
       GerenciarVeiculo carro = new GerenciarVeiculo();
       Scanner entrada = new Scanner(System.in);
   
    
       String modelo, marca, placa, combustivel;
       int anoFabricacao, menu;
       double valorMercado;
       
       do{
        System.out.println("\n1 - Adicionar Veículo");
        System.out.println("2 - Remover Veículo");
        System.out.println("3 - Buscar Veículo por Placa");
        System.out.println("4 - Listar Veículos");
        System.out.println("5 - Obter valor do imposto");
        System.out.println("6 - Listar Veículos por Combustível");
        System.out.println("7 - sair");
        menu = (entrada.nextInt()); entrada.nextLine();
 


    switch(menu){
        case 1:
            System.out.println("Informe o modelo:");
            modelo = entrada.nextLine();
            System.out.println("Informe a marca");
            marca = entrada.nextLine();
            System.out.println("Informe a placa");
            placa = entrada.nextLine();
            System.out.println("Informe o combustível");
            combustivel = entrada.nextLine();
            System.out.println("Informe o Ano de Fabricação");
            anoFabricacao = entrada.nextInt(); entrada.nextLine();
            System.out.println("Informe o valor de mercado");
            valorMercado = entrada.nextDouble();
            
            carro.adicionarVeiculo(modelo, marca, placa, combustivel, anoFabricacao, valorMercado);

        break;

        case 2:
            System.out.println(carro.listaVeiculos());
            System.out.println("Digite a placa do veículo que deseja apagar?");
            placa = entrada.nextLine();
            carro.remover(placa);
        break;

        case 3:

        System.out.println(carro.listaVeiculos());
            System.out.println("Digite a placa que deseja buscar");
            placa = entrada.nextLine();
            System.out.println(carro.buscaPorPlaca(placa));
        break;

        case 4:
            System.out.println(carro.listaVeiculos()); 
        break;

        case 5:

        System.out.println(carro.listaVeiculos());
        System.out.println("Digite a placa do veículo que deseja obter o valor do imposto");
        placa = entrada.nextLine();
        System.out.println(carro.obterValorImposto(placa));

        break;

        case 6:

        System.out.println(carro.listaVeiculos());
        System.out.println("Digite o nome do combustível");
        combustivel = entrada.nextLine();
        System.out.println(carro.listaVeiculoCombustivel(combustivel));

        break;

        case 7:
        System.exit(0);

        break;
        default:
        System.out.println("\nOpção inválida");
    }
}while(menu != 7);

      entrada.close();
    }
}
