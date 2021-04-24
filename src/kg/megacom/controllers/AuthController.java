package kg.megacom.controllers;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import kg.megacom.dbHelper.DbHelper;
import kg.megacom.models.Accounts;

public class AuthController {

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnEnter;

    @FXML
    void onButtonClicked(ActionEvent event) {
        if (event.getSource().equals(btnEnter)){
            Accounts account = DbHelper.INSTANCE.findByLogin(txtLogin.getText());
            if (account.getActive() == 0){
                Alert alert = new Alert(Alert.AlertType.WARNING, "Ваш аккаунт заблокирован");
                alert.show();
                return;
            }
        }
    }

}
