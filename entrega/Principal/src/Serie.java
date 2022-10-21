
public class Serie {
	
	private final static int N_TEMPO = 3;
	public final static int MAY = 1;
	public final static int MEN = -1;
	public final static int IGUAL = 0;
	
	private String titulo;
	private int numeroDeTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}
	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public void entregar() {
		entregado = true;
	}
	
	public void devolver() {
		entregado = false;
	}
	
	public int compareTo(Object a) {
		int estado = MEN;
		
		Serie ref = (Serie)a;
		if(numeroDeTemporadas > ref.getNumeroDeTemporadas()){
			estado = MAY;
		}else if(numeroDeTemporadas == ref.getNumeroDeTemporadas()) {
			estado = IGUAL;
		}
		return estado;
	}
	
	public boolean isEntregado() {
		if(entregado) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Información: \n" +
		"\tTitulo: "+ titulo +"\n" +
				"\tNumero de Temporadas: " + numeroDeTemporadas + "\n" +
		"\tGenero: "+ genero + "\n" + 
				"tCreador: "+ creador;
	}
	
	public boolean equals(Serie a) {
		if(titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getCreador())) {
			return true;
		}
		return false;
	}
	
	public Serie() {
		this("", N_TEMPO, "", "");
	}
	
	public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = false;
	}
	
}
