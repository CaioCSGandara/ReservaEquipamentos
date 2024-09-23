module br.com.reservaequipamentos.reservaequipamentos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens br.com.reservaequipamentos.reservaequipamentos to javafx.fxml;
    exports br.com.reservaequipamentos.reservaequipamentos;
}