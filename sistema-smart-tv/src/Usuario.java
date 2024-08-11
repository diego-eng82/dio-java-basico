public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Qual Canal? " + smartTv.canal);
        System.out.println("Qual Volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status --> TV Ligada? " + smartTv.ligada);


    }
}
