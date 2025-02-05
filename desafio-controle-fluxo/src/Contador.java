import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int x = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int y = scanner.nextInt();

       
       try{
        contar(x,y);
       }
       catch(Tratativa e){
        System.out.println("Erro: " + e.getMessage());
       }
    }
    static void  contar(int x, int y) throws Tratativa{
        if (x > y) {
            throw new Tratativa("O primeiro parametro nao pode ser maior que o segundo");
        }
       
        int contagem = y - x;
            for (int c = 0; c < contagem; c++) {
                System.out.println(c+1);
            }
        
    }

   
    
}

class Tratativa extends Exception {
    public Tratativa(String texto) {
        super(texto); 
    }
}