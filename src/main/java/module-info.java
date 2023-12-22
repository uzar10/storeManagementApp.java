module com.uzar.storeapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uzar.storeApplication to javafx.fxml;
    exports com.uzar.storeApplication;
    exports com.uzar.storeApplication.Controllers;
    exports com.uzar.storeApplication.Controllers.Admin;
    exports com.uzar.storeApplication.Controllers.Customer;
    exports com.uzar.storeApplication.Models;
    exports com.uzar.storeApplication.Views;

}