module com.haoquy.hethongbanvexe {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive java.sql;
    requires java.base;

    opens com.haoquy.hethongbanvexe to javafx.fxml;
    exports com.haoquy.hethongbanvexe;
}
