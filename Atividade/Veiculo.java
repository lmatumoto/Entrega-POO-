package Atividade;

public class Veiculo {
    protected String modelo, marca, placa, combustivel;
    protected int anoFabricacao;
    protected double valorMercado;
    double imposto;

    public Veiculo(String modelo, String marca,
    String placa, String combustivel, int anoFabricacao,
     double valorMercado){
        this.modelo = modelo;
        this.marca = marca;
        this.placa=placa;
        this.combustivel = combustivel;
        this.anoFabricacao = anoFabricacao;
        this.valorMercado = valorMercado;

     }

     public double calcularImposto() {
    
        if(this.getAnoFabricacao() <= 2001){
           return imposto = 0;
        }
 
        if(this.getCombustivel() == "GNV" ||
         this.getCombustivel() == "alcool" ){
            return imposto = this.getValorMercado() -(this.getValorMercado() * 0.97);
         }else{
            return  imposto = this.getValorMercado() - (this.getValorMercado() * 0.96);
      }    
      
    }

     public String imprimir(){
        return "Marca: " + marca + " Modelo: " + modelo + " Placa: " + placa +
        " Combustível: " + combustivel + " Ano de Fabricação: " + anoFabricacao + 
        " Valor de Mercado: " + valorMercado;

     }

     public int getAnoFabricacao() {
         return anoFabricacao;
     }

     public String getCombustivel() {
         return combustivel;
     }

     public String getMarca() {
         return marca;
     }

     public String getModelo() {
         return modelo;
     }

     public String getPlaca() {
         return placa;
     }

     public double getValorMercado() {
         return valorMercado;
     }

     public void setValorMercado(double valorMercado) {
         this.valorMercado = valorMercado;
     }


  @Override
  public String toString() {
 
      return "\r\nMarca: " + marca + " Modelo: " + modelo + " Placa: " + placa +
      " Combustível: " + combustivel + " Ano de Fabricação: " + anoFabricacao + 
      " Valor de Mercado: " + valorMercado;
  }

   

}
