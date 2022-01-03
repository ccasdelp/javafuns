package ListaDeExcepciones;
import java.util.Random;

public class OutOfGasException extends DeliverMessage{}

class UnreliableFriend {

    public boolean deliverMessage() throws Exception{

        Random r = new Random();

        boolean hasGas = r.nextBoolean();

        if (hasGas){

            return true;

        }

        throw new Exception();

    }

}


