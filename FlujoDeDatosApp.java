import javax.swing.JOptionPane;
public class FlujoDeDatosApp {

	public static void main(String[] args) {
		
//		metodoTarea1();
//		metodoTarea2();
//		metodoTarea3();
//		metodoTarea4();
//		metodoTarea5();
//		metodoTarea6();
//		metodoTarea7();
//		metodoTarea8();
//		metodoTarea9();
//		metodoTarea10();
//		metodoTarea11();
//		metodoTarea12();
//		metodoTarea13();
		
	}
	
	//Método para la tarea 1
		public static void metodoTarea1 () {		
			int n1 = 20;
			int n2 = 66;
			
			if(n1>n2) {
				System.out.println("El número más grande entre "+n1+" y "+n2+" es "+n1);
			} else if(n2>n1) {
				System.out.println("El número más grande entre "+n1+" y "+n2+" es "+n2);
			} else {
				System.out.println("Ambos números són iguales");
			}		
		}
	
	//Método para la tarea 2
		public static void metodoTarea2 () {	
			String nombre = "Frank";
			System.out.println("Tu nombre es "+nombre);
		}
	
	//Método para la tarea 3
		public static void metodoTarea3 () {	
			String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
			System.out.println("Tu nombre es "+nombre);
		}
		
	//Método para la tarea 4
		public static void metodoTarea4 () {			
			String radio = JOptionPane.showInputDialog("Introduce el radio");
			JOptionPane.showMessageDialog(null, "El area es "+(Math.PI * Math.pow(Double.parseDouble(radio), 2)));			
		}
		
	//Método para la tarea 5
		public static void metodoTarea5 () {
			String n = JOptionPane.showInputDialog("Introduce un número");
			
			if(Integer.parseInt(n)%2==0) {
				JOptionPane.showMessageDialog(null,n+" es divisible entre 2");
			} else {
				JOptionPane.showMessageDialog(null,n+" no es divisible entre 2");
			}
		}
		
	//Método para la tarea 6
		public static void metodoTarea6 () {
			final double IVA = 0.21;
			String precio = JOptionPane.showInputDialog("Introduce un precio");
			JOptionPane.showMessageDialog(null,"El precio del producto más IVA asciende a "+(Double.parseDouble(precio)+Double.parseDouble(precio)*IVA));
		}
		
	//Método para la tarea 7
		public static void metodoTarea7 () {
			int i=1;
			while(i<101) {
				System.out.println(i);
				i++;
			}
		}
	
	//Método para la tarea 8
		public static void metodoTarea8 () {
			for (int i = 1; i < 101; i++) {
				System.out.println(i);
			}
		}
		
	//Método para la tarea 9
		public static void metodoTarea9 () {
			for (int i = 1; i < 101; i++) {
				if(i%2==0 && i%3==0) {
					System.out.println(i);
				}
			}
		}
	
	//Método para la tarea 10
		public static void metodoTarea10 () {
			int r = 0;
			String ventas = JOptionPane.showInputDialog("Introduce el número de ventas");
			for (int i = 1; i <= Integer.parseInt(ventas); i++) {
				String numVentas = JOptionPane.showInputDialog("Introduce una venta");
				r+=Integer.parseInt(numVentas);
			}
			JOptionPane.showMessageDialog(null,"La suma total de todas las ventas es "+r);
		}
		
	//Método para la tarea 11
		public static void metodoTarea11 () {
			String dia = JOptionPane.showInputDialog("Introduce un día de la semana");
			
			switch (dia) {
			case "Lunes":
				JOptionPane.showMessageDialog(null,dia+" es un día laboral.");
				break;
			case "Martes":
				JOptionPane.showMessageDialog(null,dia+" es un día laboral.");
				break;
			case "Miercoles":
				JOptionPane.showMessageDialog(null,dia+" es un día laboral.");
				break;
			case "Jueves":
				JOptionPane.showMessageDialog(null,dia+" es un día laboral.");
				break;
			case "Viernes":
				JOptionPane.showMessageDialog(null,dia+" es un día laboral.");
				break;
			case "Sábado":
				JOptionPane.showMessageDialog(null,dia+" no es un día laboral.");
				break;
			case "Domingo":
				JOptionPane.showMessageDialog(null,dia+" no es un día laboral.");
				break;

			default:
				JOptionPane.showMessageDialog(null,"No has introducido un día válido.");
				break;
			}
		}
		
	//Método para la tarea 12
		public static void metodoTarea12 () {
			String password = "12345";
			boolean acierto = false;
			int n = 1;
			
			while(!acierto && n<=3) {
				if(JOptionPane.showInputDialog("Introduce la contraseña").equals(password)) {
					JOptionPane.showMessageDialog(null,"Enhorabuena!");
					acierto = true;
				} else {
					n++;
				}
			}
		}
	
	//Método para la tarea 13
		public static void metodoTarea13 () {
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));			
			int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un segundo número"));
			String op = JOptionPane.showInputDialog("Introduce un signo aritmético");
			switch (op) {
			case "+":
				JOptionPane.showMessageDialog(null,n1+" + "+n2+" es "+(n1+n2));
				break;
			case "-":
				JOptionPane.showMessageDialog(null,n1+" - "+n2+" es "+(n1-n2));
				break;
			case "*":
				JOptionPane.showMessageDialog(null,n1+" * "+n2+" es "+(n1*n2));
				break;
			case "/":
				JOptionPane.showMessageDialog(null,n1+" / "+n2+" es "+(n1/n2));
				break;
			case "^":
				JOptionPane.showMessageDialog(null,n1+" elevado a "+n2+" es "+Math.pow(n1, n2));
				break;
			case "%":
				JOptionPane.showMessageDialog(null,"El resto de la división entre "+n1+" y "+n2+" es "+(n1%n2));
				break;


			default:
				JOptionPane.showMessageDialog(null,"No has introducido un signo aritmético válido.");
				break;
			}
			
		}
	
}
