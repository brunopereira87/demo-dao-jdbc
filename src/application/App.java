package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {
  public static void main(String[] args) throws Exception {
    Department dep = new Department(1, "Informatics");
    System.out.println(dep);

    Seller seller = new Seller(1, "Maria", "d8d5H@example.com", new Date(), 3000.0, dep);
    System.out.println(seller);

    SellerDao sellerDao = DaoFactory.createSellerDao();
  }
}
