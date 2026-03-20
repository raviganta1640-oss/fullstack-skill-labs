package com.klu.PRODUCTCRUD;

import java.util.List;
import com.klu.dao.ProductDao;
import com.klu.entity.products;

public class App {

    public static void main(String[] args) {

        ProductDao dao = new ProductDao();

        
        products p1 = new products("Mobile", 10, 70000);
        products p2 = new products("Ipad", 50, 200000);

        dao.saveProduct(p1);
        dao.saveProduct(p2);

        // READ
        products p = dao.getId(1);

        // UPDATE
        if (p != null) {
            p.setPrice(60000);
            dao.updateProduct(p);
        }

        // DELETE
        dao.deleteProduct(3);

        // PRINT ALL
        List<products> list = dao.getAllProducts();
        for (products prod : list) {
            System.out.println(prod);
        }
    }
}