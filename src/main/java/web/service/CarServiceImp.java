package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> carList;

    public CarServiceImp() {
        this.carList = new ArrayList<>();
        carList.add(new Car("BMW X5", 2019, "Black"));
        carList.add(new Car("Toyota RAV4", 2020, "White"));
        carList.add(new Car("AUDI Q7", 2022, "Black"));
        carList.add(new Car("KIA Sorento", 2020, "White"));
        carList.add(new Car("Niva", 2023, "Grey"));
    }

    @Override
    public List<Car> getSomeCars(int count) {
        if (count > carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
