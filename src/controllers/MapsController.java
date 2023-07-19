package controllers;

import javafx.fxml.FXML;
import javafx.scene.web.WebView;

public class MapsController {
    @FXML
    private WebView webView;

    public void initialize() {
        // Load Google Maps URL
        webView.getEngine().load("https://www.google.com/maps/place/139a+Salvador+St,+Quezon+City,+Metro+Manila/@14.6763305,121.0046344,17z/data=!3m1!4b1!4m6!3m5!1s0x3397b6b904374471:0x50168acfae4ba84c!8m2!3d14.6763253!4d121.0072093!16s%2Fg%2F11lfbcbp2p?hl=en&entry=ttu");
    }
}
