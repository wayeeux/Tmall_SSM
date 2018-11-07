package comparator;

import com.viol3t.tmall.pojo.Product;

import java.util.Comparator;

public class ProductSaleCountComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1,Product p2){
        return p2.getSaleCount()-p1.getSaleCount();
    }
}
