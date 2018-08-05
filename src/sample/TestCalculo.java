package sample;

public class TestCalculo{


    public static void main(String [] args){

        ClasseCalculadora calculo = new ClasseCalculadora();

        calculo.setMetragemLinear("10,00".replace(",","."));
        calculo.setValorCobrado("43");
        System.out.println(calculo.getMetroquadrado());
        System.out.println(calculo.getValordometroquadrado());
        System.out.println(calculo.getValordometrolinear());


    }
}
