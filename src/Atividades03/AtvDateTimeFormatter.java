package Atividades03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AtvDateTimeFormatter {

	public AtvDateTimeFormatter() {

		System.out.println(" ** Atividade 2:  Formatadores baseado no DateTimeFormatter ** ");
		
		LocalDateTime data = LocalDateTime.of(2012, 9, 10, 12, 00);

		System.out.println("Resp A: " + data.format(DateTimeFormatter.ofPattern("yyyy-dd-MM H:mm")));
		System.out.println("Resp B: " + data.format(DateTimeFormatter.ofPattern("dd-MM-yy H:mm:ss")));

		System.out.println("Resp C: " + data.format(DateTimeFormatter.ofPattern("E")));
		System.out.println("Resp D: " + data.format(DateTimeFormatter.ofPattern("yyyy")));
		System.out.println("Resp E: " + data.format(DateTimeFormatter.ofPattern("G")));
	}

}
