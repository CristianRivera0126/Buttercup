package Utils;

public class Postre {
	public String fecha;
	public String id;
	public String nameP;
	public int CantV;
	public int PrecioU;
	
	
	public Postre(String fecha,String id,String nameP, int cantV, int PrecioU) {
		super();
		this.fecha = fecha;
		this.id = id;
		this.nameP = nameP;
		this.CantV = cantV;
		this.PrecioU = PrecioU;
	}
	
	public void imprimir_linea() {
		System.out.println(this.fecha + "\t\t\t" + this.id + "\t\t\t\t\t" + this.nameP + "\t\t\t\t\t" + String.valueOf(this.CantV) + "\t\t\t\t\t" + String.valueOf(this.PrecioU) + "\t\t\t\t\t" + String.valueOf(this.PrecioU*this.CantV));
	}

}
