package org.example;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import org.example.sourceClass.Head;


public class Controller {

    private Head head = new Head("Здоровый");


    @FXML
    private URL location;

    @FXML
    private TextArea signalsId;

    @FXML
    private Label mouthSize;

    @FXML
    private Label mouthWeight;

    @FXML
    private Label noseForm;

    @FXML
    private Label noseWeight;

    @FXML
    private Label brainType;

    @FXML
    private Label brainWeight;

    @FXML
    private Label earring;

    @FXML
    private Label earWeight;

    @FXML
    void menuButtonCrazy(ActionEvent event) {
        setTypeBrain("Неадекват");
    }

    @FXML
    void menuButtonHealthy(ActionEvent event) {
        setTypeBrain("Здоровый");
    }

    @FXML
    void menuButtonSick(ActionEvent event) {
        setTypeBrain("Приболел");
    }

    @FXML
    void pizzaButton(ActionEvent event) {
        Util u = new Util();
        String messageFromTheMouth = head.organHead.get(2).eat(head.organHead.get(0).getKpd(), "Пицца");

        u.messageBox("Поел пиццу", messageFromTheMouth);
        signalsId.setText(head.organHead.get(0).receiveSignal("Поел пиццу", messageFromTheMouth) + signalsId.getText());
    }

    @FXML
    void coffeeButton(ActionEvent event) {
        Util u = new Util();
        String messageFromTheMouth = head.organHead.get(2).eat(head.organHead.get(0).getKpd(), "Кофе");

        u.messageBox("Попил кофе", messageFromTheMouth);
        signalsId.setText(head.organHead.get(0).receiveSignal("Попил кофе", messageFromTheMouth) + signalsId.getText());
    }

    @FXML
    void soupButton(ActionEvent event) {
        Util u = new Util();
        String messageFromTheMouth = head.organHead.get(2).eat(head.organHead.get(0).getKpd(), "Суп");

        u.messageBox("Поел суп", messageFromTheMouth);
        signalsId.setText(head.organHead.get(0).receiveSignal("Поел суп", messageFromTheMouth) + signalsId.getText());
    }


    @FXML
    void hear(ActionEvent event) {
        Util u = new Util();
        String messageFromTheNose = head.organHead.get(3).hear(head.organHead.get(0).getKpd());

        u.messageBox("Услышал", messageFromTheNose);
        signalsId.setText(head.organHead.get(0).receiveSignal("Услышал", messageFromTheNose) + signalsId.getText());
    }

    @FXML
    void itch(ActionEvent event) {
        Util u = new Util();
        String messageFromTheNose = head.organHead.get(1).itch(head.organHead.get(0).getKpd());

        u.messageBox("Почесался", messageFromTheNose);
        signalsId.setText(head.organHead.get(0).receiveSignal("Почесался", messageFromTheNose) + signalsId.getText());
    }

    @FXML
    void sniff(ActionEvent event) {
        Util u = new Util();
        String messageFromTheNose = head.organHead.get(1).sniff(head.organHead.get(0).getKpd());

        u.messageBox("Понюхал", messageFromTheNose);
        signalsId.setText(head.organHead.get(0).receiveSignal("Понюхал", messageFromTheNose) + signalsId.getText());
    }

    @FXML
    void speak(ActionEvent event) {
        Util u = new Util();
        String messageFromTheMouth = head.organHead.get(2).speak(head.organHead.get(0).getKpd());

        u.messageBox("Пообщался", messageFromTheMouth);
        signalsId.setText(head.organHead.get(0).receiveSignal("Пообщался", messageFromTheMouth) + signalsId.getText());
    }

    @FXML
    void initialize() {
        setLabels();
    }

    public void setLabels(){
        brainType.setText(head.organHead.get(0).getKpd());
        brainWeight.setText("Весс: " + Integer.toString(head.organHead.get(0).getWeight()));
        noseForm.setText("Форма: " + head.organHead.get(1).getForm());
        noseWeight.setText("Весс: " + Integer.toString(head.organHead.get(1).getWeight()));
        mouthSize.setText("Размер: " + head.organHead.get(2).getSize());
        mouthWeight.setText("Весс: " + Integer.toString(head.organHead.get(2).getWeight()));
        earring.setText("Серьга: " + head.organHead.get(3).getEarring());
        earWeight.setText("Весс: " + Integer.toString(head.organHead.get(3).getWeight()));
    }

    public void setTypeBrain(String typeBrain){
        signalsId.setText("");
        head.organHead.get(0).manegeOrgan(typeBrain);
        head.organHead.get(1).setParameter();
        head.organHead.get(2).setParameter();
        head.organHead.get(3).setParameter();
        setLabels();
    }

}
