package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(int number) {

        List<Car> auto = new ArrayList<>();
        auto.add(new Car("Ford", "Transit", 1986));
        auto.add(new Car("Hyundai", "Solaris", 2011));
        auto.add(new Car("VW", "Tiguan", 2014));
        auto.add(new Car("Renault", "Arkana", 2021));
        auto.add(new Car("BMW", "X6", 2016));

        if (number == 0 || number > 5) return auto;
        return auto.stream().limit(number).collect(Collectors.toList());
    }
}