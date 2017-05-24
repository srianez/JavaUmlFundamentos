package Aula2205;


public class Cavalo implements Runnable{
	
	String nomeCavalo;
	
	public Cavalo(String nomeCavalo) {
		this.nomeCavalo = nomeCavalo;
	}

	
	public void run(){
		try{
			for (int i=1;i<11;i++){
				System.out.println(nomeCavalo);
				Thread.sleep((int)(Math.random() * 5000));
			}
		}
		catch (Exception e){
			
		}
		
	}

}
