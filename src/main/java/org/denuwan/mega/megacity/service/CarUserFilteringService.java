package org.denuwan.mega.megacity.service;



import org.denuwan.mega.megacity.dto.CarDTO;

import java.util.List;

public interface CarUserFilteringService {
    List<CarDTO> getAllCars();
    List<CarDTO> filterCarsByStatus(String status);
    List<CarDTO> filterCarsByModel(String model);

    List<CarDTO> filterCarsByStatusAndModel(String status, String model);
}
