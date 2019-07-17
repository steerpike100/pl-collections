package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product>{

    private static final int LIGHT_VAN_MAX_WEIGHT = 20;

    private final List<Product> products = new ArrayList<>();

    public void add(Product product){

        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct){

        final int index = products.indexOf(oldProduct);
        products.set(index, newProduct);
    }

    public void prepare(){
        //TODO
    }

    public List<Product> getHeavyVanProducts(){
        return null;
    }public List<Product> getLightVanProducts(){
        return null;
    }

    public Iterator<Product> iterator(){
        return products.iterator();
    }

}
