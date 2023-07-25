package webApplication2;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

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
        result = "Submitted values: " + x + ", " + y + ", " + r;
        System.out.println(result);
    }
}