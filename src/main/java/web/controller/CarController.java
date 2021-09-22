package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int sumCars) {


        List<Car> cars = carService.getCars(sumCars);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
