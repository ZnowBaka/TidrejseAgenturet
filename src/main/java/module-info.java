module com.example.tidrejseagenturet {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires jdk.compiler;

    opens com.example.tidrejseagenturet to javafx.fxml;
    exports com.example.tidrejseagenturet;

    exports com.example.tidrejseagenturet.View;
    opens com.example.tidrejseagenturet.View to javafx.fxml;

    exports com.example.tidrejseagenturet.Controller;
    opens com.example.tidrejseagenturet.Controller to javafx.fxml;

    exports com.example.tidrejseagenturet.Utilities;
    opens com.example.tidrejseagenturet.Utilities to javafx.fxml;

}