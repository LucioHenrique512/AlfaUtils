package sample;

public class ClasseCalculadora {
    private double metragemlinear;
    private double valorcobrado;
    private double metroquadrado;
    private double valordometroquadrado;
    private double valordometrolinear;

    public void setMetragemLinear(String metragemlinear){
        this.metragemlinear = Double.parseDouble(metragemlinear);;
    }

    public void setValorCobrado(String valorcobrado){
        this.valorcobrado = Double.parseDouble(valorcobrado);
    }

    public String getMetroquadrado(){
        return String.valueOf(this.metroquadrado = this.metragemlinear * 1.4);
    }



    public double getValorCobrado(){
        return this.valorcobrado;
    }

    public String getValordometroquadrado(){
        return String.valueOf(this.valordometroquadrado = getValorCobrado() / this.metroquadrado);
    }

    public String getValordometrolinear(){
        return String.valueOf(this.valordometroquadrado * 1.4);
    }


}
