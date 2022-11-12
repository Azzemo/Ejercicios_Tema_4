import javax.lang.model.util.ElementScanner14;

public class Main {
    
    public static void main(String[] args) {
        var numeroIf = 0;

        if (numeroIf > 0){
            System.out.println("numeroIf es positivo.");
        }
        else if (numeroIf < 0){
            System.out.println("numeroIf es negativo.");
        }
        else {
            System.out.println("numeroIf es neutro.\n");   
        }


        var numeroWhile = 0;
        while (numeroWhile < 3) { numeroWhile += 1;
            System.out.println("numeroWhile "+numeroWhile); //el string es solo decorativo. 
        }   
        
        System.out.println("\s"); //Esto es para hacer espacio entre las respuestas. 


        var numeroDoWhile = 0;
        do {
            System.out.println("numeroDoWhile "+numeroDoWhile+"\n");
            numeroDoWhile += 3;
            
        } while (numeroDoWhile < 3);


        var numeroFor = 0; 
        for (; numeroFor <= 3; numeroFor += 1){
            System.out.println("numeroFor "+numeroFor);
        }
        System.out.println("\s"); //De nuevo solo para separar. 


        var estación = "INVIERNO";
        switch (estación) {
            case "VERANO":
            System.out.println("Es "+estación+"!");
             break;
                
            case "OTOÑO":
            System.out.println("Es "+estación+"!");
             break;

            case "INVIERNO":
            System.out.println("Es "+estación+"!");
             break;

            case "PRIMAVERA":
            System.out.println("Es "+estación+"!");
             break;
        
            default:
            System.out.println("Esto NO es una estación!"+"!");
             break;
        }
    }
        
 
    
}
