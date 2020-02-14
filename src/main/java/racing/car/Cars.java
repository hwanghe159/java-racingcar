package racing.car;

import racing.car.numbergenerator.NumberGenerator;

import java.util.List;
import java.util.Objects;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public int size() {
        return cars.size();
    }

    public void go(NumberGenerator numberGenerator) {
        for (Car car : cars) {
            car.go(numberGenerator);
        }
    }

    public Winners getWinner() {
        return new Winners(this);
    }

    public Car get(int index) {
        return cars.get(index);
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
