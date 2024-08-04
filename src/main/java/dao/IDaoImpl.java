package dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dao1")
public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("data base version");
        return 200;
    }
}
