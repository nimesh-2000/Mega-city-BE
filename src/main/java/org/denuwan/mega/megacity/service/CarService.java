package org.denuwan.mega.megacity.service;



import org.denuwan.mega.megacity.dto.CarDTO;

import java.util.List;

public interface CarService {
    void addCar(CarDTO carDTO);
    CarDTO getCarById(int id);
    List<CarDTO> getAllCars();
    void updateCar(CarDTO carDTO);
    void deleteCar(int id);
}
