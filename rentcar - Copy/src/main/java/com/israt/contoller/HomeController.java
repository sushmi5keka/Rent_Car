package com.israt.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String displayHome() {
        return "index";

    }

    @GetMapping(value = "/about.jsf")
    public String displayAbout() {
        return "about";

    }

    @GetMapping(value = "/car.jsf")
    public String displayCar() {
        return "cars";

    }

    @GetMapping(value = "/booking.jsf")
    public String displayBooking() {
        return "booking";

    }

    @GetMapping(value = "/contactus.jsf")
    public String displayContactus() {
        return "contactus";

    }

    @GetMapping(value = "/signin.jsf")
    public String displaySignin() {
        return "signin";

    }

    @GetMapping(value = "/login.jsf")
    public String displayLogin() {
        return "login";

    }
}
