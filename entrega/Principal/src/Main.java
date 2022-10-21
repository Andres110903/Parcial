
public class Main {
	public static void main(String[] args) {
		
		Serie listaSerie[] = new Serie[5];
		VideoJuego listaVideoJuego[] = new VideoJuego[5];
		
		listaSerie[0] = new Serie();
		listaSerie[1] = new Serie("Game of Thrones", 8, "Acción", "Gregor Clegane");
		listaSerie[2] = new Serie("Breaking Bad", 5, "Acción", "Vince Gilligan");
		listaSerie[3] = new Serie("Peaky Blinders", 10, "Acción", "Arthur T");
		listaSerie[4] = new Serie("Arcane", 1, "Acción, Fantasía", "Riot G");
		
		listaVideoJuego[0] = new VideoJuego();
		listaVideoJuego[1] = new VideoJuego("Ghost of Tsushima", "Spectre Dog");
		listaVideoJuego[2] = new VideoJuego("Uncharted", "Naughty Dog");
		listaVideoJuego[3] = new VideoJuego("The Last of Us", "Naughtyn Dog");
		listaVideoJuego[4] = new VideoJuego("Assasins Creed", "Ubisoft");
		
		listaSerie[1].entregar();
		listaSerie[4].entregar();
		listaVideoJuego[0].entregar();
		listaVideoJuego[3].entregar();
		
		int entregados = 0;
		
		for(int i = 0; i < listaSerie.length;i++) {
			if(listaSerie[i].isEntregado()) {
				entregados += 1;
				listaSerie[i].devolver();
			}
		if(listaVideoJuego[i].isEntregado()) {
			entregados += 1;
			listaVideoJuego[i].devolver();
			}
		}
		
		System.out.print("Hay " + entregados + " articulos");
		
		Serie serieMayor = listaSerie[0];
		VideoJuego videoJuegoMayor = listaVideoJuego[0];
		
		for(int i = 1; i<listaSerie.length; i++) {
			if(listaSerie[i].compareTo(serieMayor)==Serie.MAY) {
				serieMayor = listaSerie[i];
			}
			if(listaVideoJuego[i].compareTo(videoJuegoMayor)==VideoJuego.MAY) {
				videoJuegoMayor = listaVideoJuego[i];
			}
		}
		System.out.print(videoJuegoMayor);
		System.out.print(serieMayor);
	}
}
