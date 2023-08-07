package webApplication2;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("controller")
@ApplicationScoped
public class backendController {
    @Inject
    private AreaLogicBean logicBean;
    @Inject
    private DataBean dataBean;

    @Getter @Setter private String result;

    @Getter @Setter private Double x;
    @Getter @Setter private Double y;
    @Getter @Setter private Double r;

    public void processData(){
        logicBean.setX(x); logicBean.setY(y); logicBean.setR(r);
        logicBean.submit();
        result = logicBean.getResult();

        dataBean.saveToDb(x, y, r);
    }
}
