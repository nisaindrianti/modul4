public class kelipatan_lima {
    private int Bil1;
    
    public void lipatan_lima(){
        for(Bil1 = 1; Bil1 <= 1000; Bil1++){
            if(Bil1 % 5 == 0){
                System.out.print(Bil1+",");
                
                if (Bil1%50 == 0){
                    System.out.println("");
                }
            }
        }
    }
}
