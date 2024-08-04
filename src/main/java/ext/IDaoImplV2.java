package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class IDaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("web service version");
        return 300;
    }
}