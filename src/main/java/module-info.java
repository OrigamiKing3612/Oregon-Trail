module net.origamiking.games.oregontrail {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.origamiking.games.oregontrail to javafx.fxml;
    exports net.origamiking.games.oregontrail;
}