module com.example.tp1_sistemalavaroupas_rianporfirio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp1_sistemalavaroupas_rianporfirio to javafx.fxml;
    exports com.example.tp1_sistemalavaroupas_rianporfirio;
}