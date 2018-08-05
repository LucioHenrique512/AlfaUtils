package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ControllerCalculadora {
    @FXML
    TextField txtMetragemLinear;
    @FXML
    TextField txtValorEmReais;
    @FXML
    TextField txtMetroQuadrado;
    @FXML
    TextField txtValorDoMetroQuadrado;
    @FXML
    TextField txtValorDoMetroLinear;

    ClasseCalculadora calculo;

    public ControllerCalculadora(){
     calculo = new ClasseCalculadora();
    }

    private void eventoCalculo(){
        try {
            //Recebendo o valor digitado pelo usuario e convertendo virgula por ponto.
            calculo.setMetragemLinear(txtMetragemLinear.getText().replace(",", "."));

            //se o valor for nulo automaticamente seta valor cobrado pra 0.
            if (txtValorEmReais.getText().equals("")) {
                calculo.setValorCobrado("0");
            } else {
                calculo.setValorCobrado(txtValorEmReais.getText().replace(",", "."));
            }
            //Carregando os txtField com o resultado e convertendo ponto por virgula
            txtMetroQuadrado.setText(calculo.getMetroquadrado().replace(".", ","));
            txtValorDoMetroQuadrado.setText(calculo.getValordometroquadrado().replace(".", ","));
            txtValorDoMetroLinear.setText(calculo.getValordometrolinear().replace(".", ","));
        }catch (Exception erro){
            Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
            dialogoErro.setTitle("Erro");
            dialogoErro.setHeaderText("Erro na digitação!!");
            dialogoErro.setContentText("O valor informado nao pode ser nulo ou conter letras.");
            dialogoErro.showAndWait();
        }
    }

    public void btnCalcularPress(Event event){

        eventoCalculo();

    }

    public void onKeyPressed(KeyEvent event){
       if(event.getCode() == KeyCode.ENTER){
           eventoCalculo();
       }
    }



}
