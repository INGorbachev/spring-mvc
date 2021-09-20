package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String showCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int sumCars) {

        List<Car> messages = new ArrayList<>();
        messages.add(new Car("Ford", "Transit", 1986));
        messages.add(new Car("Hyundai", "Solaris", 2011));
        messages.add(new Car("VW", "Tiguan", 2014));
        messages.add(new Car("Renault", "Arkana", 2021));
        messages.add(new Car("BMW", "X6", 2016));

        messages = CarService.getCars(messages, sumCars);
        model.addAttribute("messages", messages.toString());
        return "index";
    }
}
