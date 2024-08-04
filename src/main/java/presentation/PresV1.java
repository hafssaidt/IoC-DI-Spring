package presentation;

import dao.IDao;
import dao.IDaoImpl;
import metier.IMetier;
import metier.IMetierImpl;

//instanciation statique
//couplage faible
public class PresV1 {
    public static void main(String[] args) {
        IDao iDao = new IDaoImpl();
        IMetierImpl iMetier = new IMetierImpl(iDao);
        //iMetier.setIDao(iDao);
        System.out.println(iMetier.calcul());
    }
}
