package decorator.main.java;

public class CoffeeBreak implements Cafeteria{
    public float preco;

    public CoffeeBreak(){
    }

    public CoffeeBreak (float preco){
        this.preco = preco;
    }
    
    public String getPedido(){
        return "Coffee Break";
    }

    public Float getPreco(){
        return preco;
    }

}