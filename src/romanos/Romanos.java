package romanos;

import java.util.Scanner;

public class Romanos {

	public static void main(String[] args) {
		exec();
	}
	public static void exec() 
	{
		int entrada;
		int numero=0;
		Scanner datos = new Scanner(System.in);
		printf("NUMEROS ROMANOS");
		while (true) {
			do {
				printf("\nDIGITA UN NUMERO: ");
				numero = datos.nextInt();
			} while (numero < 1 || numero > 1000);
			printf("El numero romano es: " + conversion(numero));
		}
	}

	public static String conversion(int band) 
	{
		int i, u, d, c, m;
		String cad = "";
		m = band / 1000;
		c = band / 100 % 10;
		d = band / 10 % 10;
		u = band % 10;
		for (i = 1; i <= m; i++) 
		{
			cad = cad + "M";
		}
		if (c == 9) 
		{
			cad = cad + "CM";
		} else if (c >= 5) 
		{
			cad = cad + "D";
			for (i = 6; i <= c; i++) 
			{
				cad = cad + "C";
			}
		} else if (c == 4) 
		{
			cad = cad + "CD";
		} else {
			for (i = 1; i <= c; i++) 
			{
				cad = cad + "C";
			}
		}
		if (d == 9) 
		{
			cad = cad + "XC";
		} else if (d >= 5) 
		{
			cad = cad + "L";
			for (i = 6; i <= d; i++) 
			{
				cad = cad + "X";
			}
		} else if (d == 4) 
		{
			cad = cad + "XL";
		} else {
			for (i = 1; i <= d; i++) 
			{
				cad = cad + "X";
			}
		}
		if (u == 9) 
		{
			cad = cad + "IX";
		} else if (u >= 5) 
		{
			cad = cad + "V";
			for (i = 6; i <= u; i++) 
			{
				cad = cad + "I";
			}
		} else if (u == 4) 
		{
			cad = cad + "IV";
		} else {
			for (i = 1; i <= u; i++) 
			{
				cad = cad + "I";
			}
		}
		return cad;
	}

	public static String printf(String cadena) 
	{
		System.out.println(cadena);
		return cadena;
	}
}
