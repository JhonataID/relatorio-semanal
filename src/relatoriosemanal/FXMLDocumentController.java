/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatoriosemanal;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author jhomi
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private TextField txtProjeto;
    @FXML
    private Label lblProjeto;
    @FXML
    private TextField txtNumeroRef;
    @FXML
    private Label lblNumeroRef;
    @FXML
    private TextField txtObjetivo;
    @FXML
    private Label lblObjetivo;
    @FXML
    private Label lblTempoEstimando;
    @FXML
    private TextField txtTempoEstimando;
    @FXML
    private Label lblMaterial;
    @FXML
    private TextArea txtMaterial;
    @FXML
    private Button btnIniciar;
    @FXML
    private AnchorPane acpMain;

    boolean start = false;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        acpMain.widthProperty().addListener((obs, oldVal, newVal) -> {
            if (start) {
                System.out.println(acpMain.getWidth());
                int i = (int) ((acpMain.getWidth() - btnIniciar.getWidth()) - 20);
                btnIniciar.setLayoutX(i);
                System.out.println(i + " botao");
            } else {
                start = true;
            }
        });
    }

    @FXML
    public void btnIniciarHandler() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println(acpMain.getHeight());

    }
}
