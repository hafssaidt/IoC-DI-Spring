package presentation;

import metier.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.stereotype.Component;

public class PresV4 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier","ext");
        IMetier iMetier = (IMetier) context.getBean("metier");
        System.out.println(iMetier.calcul());
    }
}
