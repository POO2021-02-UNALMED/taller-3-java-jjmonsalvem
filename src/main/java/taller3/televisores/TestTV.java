package taller3.televisores;

public class TestTV {
	public static void main(String[] args) {

		/*
		Marca marca1 = new Marca("Semsung");
	    Marca marca2 = new Marca("Lj");
		
	    TV tv1 = new TV(marca1, true);
	    TV tv2 = new TV(marca2, false);
	    
	    tv1.setPrecio(2000);
	    tv2.setCanal(90);
	    tv1.setCanal(121);
		tv2.setVolumen(7);
		
		Control control1 = new Control();
		control1.enlazar(tv1);
		control1.turnOff();
		control1.setCanal(50);
		control1.turnOn();
		control1.canalUp();
		control1.volumenUp();
		
	    System.out.println(tv2.getCanal());
	    System.out.println(tv1.getPrecio());
	    System.out.println(tv1.getMarca().getNombre());
	    System.out.println(tv1.getCanal());
		*/
		//----------------------------------------------------

		Marca marca =  new Marca("Semsung");
		TV tv1 =  new TV(marca, true);
		
		tv1.setCanal(100);
		tv1.canalDown();
		
		TV tv2 =  new TV(marca, false);
		Control control =  new Control();
		control.enlazar(tv2);
		control.setCanal(50);
		control.turnOn();
		control.canalUp();
		
		TV tv3 =  new TV(marca, false);
		tv2.setCanal(121);

		System.out.println(tv2.getCanal());
		
		if(tv1.getCanal() == 99 && tv2.getCanal() == 2 && tv3.getCanal() == 1) {
		} else {
			System.out.println("Hay un problema con los metodos y restricciones del cambio de canales del televisor");
		}
		
		
	}
}