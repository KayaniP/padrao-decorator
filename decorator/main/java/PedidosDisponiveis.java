package decorator.main.java;

public  abstract class PedidosDisponiveis extends CafeteriaDecorator{

  public PedidosDisponiveis(Cafeteria cafeteria){

    super(cafeteria);

  }
  public float getValorPreco(){
    return 20f;
  }
  public String getNomePedido(){
    return "Pedido efetuado";
  }
}