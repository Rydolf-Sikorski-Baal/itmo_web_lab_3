package webApplication2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named("DataBean")
@Dependent
public class DataBean {
    public void saveToDb(double x, double y, double r){
        DataEntry entry = new DataEntry();
        entry.setX(x); entry.setY(y); entry.setR(r);

        try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracleDB");
            EntityManager manager = factory.createEntityManager();
            manager.getTransaction().begin();
            manager.persist(entry);
            manager.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
