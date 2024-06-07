public class Usuario {
    public static void main(String[] args) throws Exception {
   
        SmartTv smartTv = new SmartTv ();

        System.out.println( "Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println( "Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println( "Tv Ligada ? " + smartTv.ligada);

        SmartTV.diminuirVolume();
        SmartTV.diminuirVolume();
        SmartTV.diminuirVolume();
        SmartTv.aumentarVolume();
        System.out.println("Volume Atual :" + SmartTv.volume);






   
    }
}
