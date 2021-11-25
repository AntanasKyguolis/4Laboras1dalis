package bazineTransportas;

import com.bazine.TransportasImpl;
import com.isvestine.AutomobilisImpl;


public class Main {

    public static void main(String[] args) {
        TransportasImpl transportas = new TransportasImpl("Sausumos",true, 2012);
        TransportasImpl transportas1 = new TransportasImpl("Sausumos",true,2009);
        TransportasImpl transportas2 = new TransportasImpl("Sausumos",true,2017);
        TransportasImpl transportas3 = new TransportasImpl("Oro",true,2014);
        TransportasImpl transportas4 =new TransportasImpl("Vandens",false,1992);

        AutomobilisImpl automobilis = new AutomobilisImpl("Sausumos",true,2009,
                "BMW",3,false);
        AutomobilisImpl automobilis1 = new AutomobilisImpl("Sausumos",true,2016,
                "Wolsvagen",5,false);
        AutomobilisImpl automobilis2 =new AutomobilisImpl("Sausumos",true,2020,
                "Toyota",5,true);
        AutomobilisImpl automobilis3 = new AutomobilisImpl("Sausumos",true,2020,
                "Toyota",3,true);
        AutomobilisImpl automobilis4 = new AutomobilisImpl("Sausumos", true,2019,
                "Audi",5,false);
        AutomobilisImpl automobilis5 = new AutomobilisImpl("Sausumos",true,2020,
                "Tesla",5,true);
        TransportasImpl[] transport = {transportas,transportas1,transportas2,transportas3,transportas4,
                automobilis,automobilis1,automobilis2,automobilis3,automobilis4,automobilis5};

        for (TransportasImpl transportai : transport) {
            if(transportai instanceof AutomobilisImpl){
                AutomobilisImpl auto = (AutomobilisImpl) transportai;
                if (auto.isVaromasElektra()== true){
                    System.out.println(auto);
                }
            }

        }
    }
}