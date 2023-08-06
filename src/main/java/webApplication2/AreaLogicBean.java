package webApplication2;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.io.Serializable;

@Named("AreaLogic")
@ApplicationScoped
public class AreaLogicBean implements Serializable {
    @Getter @Setter private Double x;
    @Getter @Setter private Double y;
    @Getter @Setter private Double r;

    private boolean isInArea(double x, double y, double r){
        return false;
    }

    public String getFalse(){return "false";}

    @Getter @Setter private String result;
    public void submit() {
        DataEntry entry = new DataEntry();
        entry.setX(x); entry.setY(y); entry.setR(r);

        result = "Submitted values: " + x + ", " + y + ", " + r;
        System.out.println(result);

        try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracleDB");
            EntityManager manager = factory.createEntityManager();
            manager.getTransaction().begin();
            manager.persist(entry);
            manager.getTransaction().commit();
            System.out.println("data saved");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}