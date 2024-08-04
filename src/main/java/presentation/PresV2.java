package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

//instanciation dynamique
//couplage forte
public class PresV2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao iDao = (IDao) cDao.getConstructor().newInstance();

            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            IMetier iMetier = (IMetier) cMetier.getConstructor().newInstance();

            Method setDao = iMetier.getClass().getDeclaredMethod("setDao",IDao.class);
            setDao.invoke(iMetier,iDao);
            System.out.println(iMetier.calcul());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
