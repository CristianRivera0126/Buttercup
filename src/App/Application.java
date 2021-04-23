package App;

import Utils.Cliente;
import Utils.Cocinero;
import Utils.Insumo;
import Utils.Postre;
import Utils.Sucursal;
import Utils.Vendedor;

public class Application {
	public static void main(String[] args) {
		//Sucursales
		Sucursal s1=new Sucursal("Buttercup NY");
		Sucursal s2=new Sucursal("Buttercup TGU");
		Sucursal s3=new Sucursal("Buttercup MX");
		
		//Clientes
		Cliente c1=new Cliente("marzo",2021,"Cristian Rivera");
		Cliente c2=new Cliente("marzo",2021,"Kimberly Raudales");
		Cliente c3=new Cliente("marzo",2021,"Daniela Caceres");
		
		//Vendedores
		Vendedor v1= new Vendedor("201202","Raul Gonzales");
		Vendedor v2= new Vendedor("203204","Pedro Gomez");
		Vendedor v3= new Vendedor("205206","Iker Ponce");
		
		//Cocinero
		Cocinero coci1=new Cocinero("0011","Julio Romero");
		Cocinero coci2=new Cocinero("0022","Erick Cabrera");
		Cocinero coci3=new Cocinero("0033","Angel Reina");
		//Postre
		Postre p1= new Postre("19 de mayo del 21","0001","Pastel",5,50);
		Postre p2= new Postre("29 de abril del 21","0002","Semita",12,3);
		Postre p3= new Postre("15 de enero del 21","0003","Pan Baguet",2,25);
		
		//Insumo
		Insumo i1=new Insumo(s1.nombreS,"Abril",2021,"20109","Leche",p1.CantV+p2.CantV+p3.CantV,"Deslactosada");
		Insumo i2=new Insumo(s2.nombreS,"Enero",2021,"20110","Leche",p1.CantV+p2.CantV+p3.CantV,"Descremada");
		Insumo i3=new Insumo(s3.nombreS,"Mayo",2021,"20111","Leche",p1.CantV+p2.CantV+p3.CantV,"de coco");
		
		//Reporte 1
		c1.agregar_Postre(p1);
		c1.agregar_Postre(p2);
		c1.imprimir_postre();
		v1.Crear_Reporte(c1, coci1);
		c1.imprimir_reporte();
		
		//Reporte 2
		c2.agregar_Postre(p2);
		c2.agregar_Postre(p3);
		c2.imprimir_postre();
		v2.Crear_Reporte(c2, coci2);
		c2.imprimir_reporte();		
				
		//Reporte 3
		c3.agregar_Postre(p1);
		c3.agregar_Postre(p3);
		c3.agregar_Postre(p2);
		c3.imprimir_postre();
		v3.Crear_Reporte(c3, coci3);
		c3.imprimir_reporte();
		
		c1.imprimir_reporteMA(i1.mes,i1.año);
	
	}
	

}
