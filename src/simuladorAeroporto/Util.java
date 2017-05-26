package simuladorAeroporto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	public static String horaFormatada(Date d) {
		if (d == null)
			return "";

		SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
		return formatador.format(d);
	}
}
