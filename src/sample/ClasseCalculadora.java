package sample;

public class ClasseCalculadora {
    private double metragemlinear;
    private double valorcobrado;
    private double metroquadrado;
    private double valordometroquadrado;
    private double valordometrolinear;

    //Pegando o valor do da metragem linear.
    public void setMetragemLinear(String metragemlinear){
        this.metragemlinear = Double.parseDouble(metragemlinear);;
    }
    //Pegando o valor total cobrado.
    public void setValorCobrado(String valorcobrado){
        this.valorcobrado = Double.parseDouble(valorcobrado);
    }
    //Retornando valor da metragem quadrada.
    public String getMetroquadrado(){
        return String.valueOf(this.metroquadrado = this.metragemlinear * 1.4);
    }
    //Retornando o valor em reais do metro quadrado.
    public String getValordometroquadrado(){
        return String.valueOf(this.valordometroquadrado = this.valorcobrado / this.metroquadrado);
    }
    //Retornando o valor do metro linear em reais.
    public String getValordometrolinear(){
        return String.valueOf(this.valordometroquadrado * 1.4);
    }


}
