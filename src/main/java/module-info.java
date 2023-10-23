module com.example.tableviewfxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.tableviewfxml to javafx.fxml;
    exports es.ieslosmontecillos.tableviewfxml;
}