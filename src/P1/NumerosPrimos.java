package P1;

public class NumerosPrimos
{
    public static void main(String[] args) 
    {
        numeroPrimo(6, 2);
    }
     
    static String numeroPrimo(int numero, int divisor)
    {
        if(numero/2 < divisor)
        {
            return "Es primo";
        }
        
        else 
        {
            if(numero%divisor==0)
            {
                return "No es primo";
            }
            else 
            	
            {
                return numeroPrimo(numero, divisor+1);
            }
        }
    }
    
}
