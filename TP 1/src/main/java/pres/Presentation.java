package pres;

import dao.DaoImp;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImp dao = new DaoImp();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.print("Result: " + metier.calcul(14,-7));
    }
}
