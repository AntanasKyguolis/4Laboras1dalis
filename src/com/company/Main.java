package bazineTransportas;

import com.bazine.TransportasImpl;
import com.isvestine.AutomobilisImpl;


public class Main {

    public static void main(String[] args) {
        TransportasImpl transportas1 = new TransportasImpl("Sausumos",true, 2008);
        TransportasImpl transportas2 = new TransportasImpl("Oro",true,2001);
        TransportasImpl transportas3 = new TransportasImpl("Sausumos",true,2021);
        TransportasImpl transportas4 = new TransportasImpl("Oro",true,2019);
        TransportasImpl transportas5 =new TransportasImpl("Vandens",false,2022);

        AutomobilisImpl automobilis1 = new AutomobilisImpl("Sausumos",true,2008,
                "BMW",3,false);
        AutomobilisImpl automobilis2 = new AutomobilisImpl("Sausumos",true,2001,
                "Wolsvagen",5,false);
        AutomobilisImpl automobilis3 =new AutomobilisImpl("Sausumos",true,2021,
                "Audi",5,true);
        AutomobilisImpl automobilis4 = new AutomobilisImpl("Sausumos",true,2019,
                "Toyota",2,true);
        AutomobilisImpl automobilis5 = new AutomobilisImpl("Sausumos",true,2022,
                "Tesla",5,true);

        TransportasImpl[] transport = {transportas1,transportas2,transportas3,transportas4, transportas5,
                automobilis1,automobilis2,automobilis3,automobilis4,automobilis5};

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