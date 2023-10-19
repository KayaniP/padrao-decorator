package decorator.main.java;


public class CoffeeProtein implements Cafeteria{
    public float preco;

    public CoffeeProtein(){
    }

    public CoffeeProtein (float preco){
        this.preco = preco;
    }
    
    public String getPedido(){
        return "Coffee Protein";
    }

    public Float getPreco(){
        return preco;
    }

}

