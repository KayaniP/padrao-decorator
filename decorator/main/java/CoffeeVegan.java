package decorator.main.java;


public class CoffeeVegan implements Cafeteria{
    public float preco;

    public CoffeeVegan(){
    }

    public CoffeeVegan (float preco){
        this.preco = preco;
    }
    
    public String getPedido(){
        return "Coffee Vegan";
    }

    public Float getPreco(){
        return preco;
    }

}

