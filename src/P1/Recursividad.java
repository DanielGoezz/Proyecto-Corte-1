package P1;

public class Recursividad {

	public static void main(String[] args)
	{
        int numeroA = 6;
        System.out.println("El numero " + numeroA + ": " + numeroPrimo(numeroA, 2));
        
        int[] a = {1,8,5,6};
        System.out.println("El mayor es: " + numeroMayor(a, a.length - 1 , 0));
        
        int[] b = { 5, 8, 5};
        System.out.println("" + validarPalindromo(b , b.length-1 , 0));
    
        int numeroB = 1234;
        System.out.println("El numero " + numeroB + " tiene " + contarCifras(numeroB) + " cifras");
    }
	
	static String numeroPrimo(int numero, int divisor)
    {
        if(numero/2 < divisor)
        {
            return "Es primo";
        }
        
        
        else if (numero%divisor==0)
        {
            return "No es primo";
        }
             
		return numeroPrimo(numero, divisor+1);
    }

	static int numeroMayor(int[] array , int lenght , int max)
    {
        if(array[lenght] > max)
        {
            max = array[lenght];
        }
        
        else if (lenght==0)
        {
        	return max;
        }
        
        return  numeroMayor(array , lenght-1 , max);
    }
	

    static int validarPalindromo(int array[] , int lenght , int thgnel) 
    {
        if (array[lenght] == array[thgnel]) 
        {
            if (lenght==0)
            {
                  return 1;
            }
            
            else
            {
                return validarPalindromo(array , lenght-1 , thgnel+1);
            }
        }
        
        else
        {
           return 0;
        }
    }

    public static int contarCifras(int n ) 
    {

        if (n < 10) 
        {
            return 1;
        } 
        
        else 
        {
            return 1 + contarCifras(n / 10 );
        }
    }

}
