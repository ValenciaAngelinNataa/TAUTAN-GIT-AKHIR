package PRAK302_2210817220030_ValenciaAngelinNata;


class Negara {
		
	private String negara;
	private String jenisPemimpin;
	private String namaPemimpin;
	private int tglMerdeka;
	private int bulanMerdeka;
	private int thnMerdeka;
	
	public Negara (String negara, String jenisPemimpin, String namaPemimpin, int tglMerdeka, int bulanMerdeka, int thnMerdeka) {
		 this.negara = negara;
	     this.jenisPemimpin = jenisPemimpin;
	     this.namaPemimpin = namaPemimpin;
	     this.tglMerdeka = tglMerdeka;
	     this.bulanMerdeka = bulanMerdeka;
	     this.thnMerdeka = thnMerdeka;
	}
	
	public String getNegara() {
		return negara;
	}
	
	public String getJenisPemimpin() {
		return jenisPemimpin;
	}
	
	public String getNamaPemimpin() {
		return namaPemimpin;
	}
	
	public int getTglMerdeka() {
		return tglMerdeka;
	}
	
	public int getBulanMerdeka() {
		return bulanMerdeka;
	}
	
	public int getThnMerdeka() {
		return thnMerdeka;
	}
}