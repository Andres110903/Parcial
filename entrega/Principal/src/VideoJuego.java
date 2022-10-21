public class VideoJuego implements Entregable {
		
		private final static int H_ESTIMADAS = 10;
		public final static int MAY = 1;
		public final static int MEN = -1;
		public final static int IGUAL = 0;
		
		private String titulo;
		private int horasEstimadas;
		private boolean entregado;
		private String genero;
		private String compania;
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public int getHorasEstimadas() {
			return horasEstimadas;
		}
		public void setHorasEstimadas(int horasEstimadas) {
			this.horasEstimadas = horasEstimadas;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public String getCompania() {
			return compania;
		}
		public void setCompania(String compania) {
			this.compania = compania;
		}
		
		public void entregar() {
			entregado = true;
		}
		public void devolver() {
			entregado = false;
		}
		public boolean isEntregado() {
			if(entregado) {
				return true;
			}
			return false;
		}
		
		public int compareTo(Object a) {
			int estado = MEN;
			VideoJuego ref = (VideoJuego)a;
			if(horasEstimadas > ref.getHorasEstimadas()) {
				estado = MAY;
			}else if(horasEstimadas == ref.getHorasEstimadas()) {
				estado = IGUAL;
			}
			return estado;
		}
		
		public String toString() {
			return "Inormación:  \n" +
		"Titulo: " + titulo + "\n" +
					"Horas estimadas: " + horasEstimadas + "\n" +
		"Genero: " + genero + "\n" +
					"Compañia: " + compania;
		}
		
		public boolean equals(VideoJuego a) {
			if(titulo.equalsIgnoreCase(a.getTitulo()) && compania.equalsIgnoreCase(a.getCompania())) {
				return true;
			}
			return false;
		}
		
		public VideoJuego() {
			this("", "");
		}
		
		public VideoJuego(String titulo, String compania) {
			this.compania = compania;
			this.titulo = titulo;
			this.genero = genero;
			this.horasEstimadas = horasEstimadas;
			this.entregado = false;
		}
		
}
