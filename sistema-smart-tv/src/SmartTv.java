public class SmartTv {
    boolean ligada=false;
    int canal=2;
    int volume=20;

    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }
    
    public void aumentarCanal(){
        canal++;
    }
    
    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }
}
