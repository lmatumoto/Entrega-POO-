package Atividade;

import java.util.ArrayList;

public class GerenciarVeiculo {
  
    
    
    private ArrayList<Veiculo> listaVeiculos;
    private ArrayList<Veiculo> listaCombustivel;

    public GerenciarVeiculo(){
        listaVeiculos = new ArrayList<>();
        listaCombustivel = new ArrayList<>();
    }

    public void adicionarVeiculo(String modelo, String marca,
    String placa, String combustivel, int anoFabricacao,
     double valorMercado){

        listaVeiculos.add(new Veiculo(modelo, marca, placa, 
        combustivel,anoFabricacao, valorMercado));

    }

    public boolean remover(String placa){
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                listaVeiculos.remove(veiculo);
                return true;
            }
        }
        return false;
    }

    public Veiculo buscaPorPlaca(String placa){
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                
                return veiculo;
            }
        }
        return null;
    }


    public double obterValorImposto(String placa){
        double a;
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                a =  veiculo.calcularImposto();
               return a;
            }
        }
        return -1;
    }

    
    public String listaVeiculoCombustivel(String combustivel){
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getCombustivel().equalsIgnoreCase(combustivel)) {
                listaCombustivel.add(veiculo);
            }
        }
        return ("Lista por combustível " + listaCombustivel);
    }
    

    public String listaVeiculos(){
        return ("Lista: " + listaVeiculos);
    }
     
    
    }







    
    

