import java.util.HashMap;
import java.util.Set;
public class MapaDeHashmatique {

	public static void main(String[] args) {
		//Actividad 7 Mapa de Hashmatique
		
		HashMap<String, String> trackList  = new HashMap<String, String>();

		trackList .put("Love Is Colder Than Death", "Comes a time\r\n" + "When saying sorry won't do\r\n");

		trackList .put("very ill", "Comes a time\r\n" + "When saying sorry won't do\r\n");

		trackList .put("Wild World", "Feel the wild world in the air\r\n" + "Everybody says that happiness is everything\r\n");
		
		trackList .put("Teignmouth", "Teignmouth\r\n" + "On the night train\r\n");

        //Keys

        Set<String> keys = trackList .keySet();

        for(String key : keys) {

            System.out.println(key);

            System.out.println(trackList.get(key));   
        }
	}
}
