package ExSingleton;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.print.attribute.standard.PrinterMakeAndModel;

public class AlmacenaTesis{

    private static AlmacenaTesis instance;
    private Map<Tesis, Date> registro = new ConcurrentHashMap<>();

    private AlmacenaTesis(){
        System.out.println("se estan almacenando las tesis");
    }

    public static AlmacenaTesis getInstance(){

        if (instance == null){
            multiThreadControl();
        
        }
        return instance;
    }

    private synchronized void registroTesis(Tesis tesis, Date date){
        if (!registro.containsKey(tesis)){

            System.out.println("REGISTRO DE TESIS: "+ tesis.getDatosEst().getNombre()+ " FECHA: " +date);
            registro.put(tesis, date);

        }else{
            System.out.println("HA OCURRIDO UN ERROR");
        }
    }

    public synchronized void verRegistr0(){
        System.out.println("REGISTRO");
        for (Map.Entry<Tesis, Date> entry: registro.entrySet()){
            System.out.println("null");
        }
    }

}