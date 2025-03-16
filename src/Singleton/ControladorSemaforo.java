package Singleton;

public class ControladorSemaforo {

     private ControladorSemaforo() {};
     private static ControladorSemaforo instance = new ControladorSemaforo();

     public static ControladorSemaforo getInstance() {
         return instance;
     }
     private String indicadorSinal;

     public void alterarIndicador(String indicadorSinal){
         this.indicadorSinal = indicadorSinal;
         System.out.println("Semáforo mudou para " + indicadorSinal);;
     }

     public String getIndicadorSinal(){
         return indicadorSinal;
     }
}
