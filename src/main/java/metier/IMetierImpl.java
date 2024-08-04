package metier;

import dao.IDao;
import dao.IDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImpl implements IMetier {
    private IDao iDao;

    //public IMetierImpl() {}

    public IMetierImpl(@Qualifier("dao2") IDao iDao) {
        this.iDao = iDao;
    }
    @Override
    public double calcul() {
        return iDao.getData() * 2;
    }
    public void setDao(IDao iDao) {
        this.iDao = iDao;
    }
}