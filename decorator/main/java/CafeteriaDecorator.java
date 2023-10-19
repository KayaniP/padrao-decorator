package decorator.main.java;

public abstract class CafeteriaDecorator implements Cafeteria{

    private Cafeteria cafeteria;
    public String pedido;
    
    public CafeteriaDecorator(Cafeteria cafeteria){
        this.cafeteria = cafeteria;
    }
    public Cafeteria getCafeteria(){
        return cafeteria; 
    }
    public void setCafeteria(Cafeteria cafeteria){
        this.cafeteria = cafeteria;
    }
    public abstract String getNomePedido();

    public String getPedido(){
        return this.cafeteria.getPedido();
    }
    public void setPedido(String pedido){
        this.pedido = pedido;
    }

    public abstract float getPrecopedido();

    public Float getPreco(){
        return this.cafeteria.getPreco();
    }
}