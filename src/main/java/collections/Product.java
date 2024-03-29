package collections;

import java.util.Comparator;

public class Product {



    public static final Comparator<Product>BY_WEIGHT
            = (p1, p2) -> Integer.compare(p1.getWeight(), p2.getWeight());

    private final String name;
    private final int weight;

    public Product(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public String toString(){
        return "collections.Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

}
