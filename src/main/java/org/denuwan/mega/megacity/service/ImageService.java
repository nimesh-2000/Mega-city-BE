package org.denuwan.mega.megacity.service;


import org.denuwan.mega.megacity.dto.ImageDTO;

import java.util.List;

public interface ImageService {
    void addImage(ImageDTO imageDTO);
    List<ImageDTO> getImagesByCarId(int carId);
    void deleteImagesByCarId(int carId);
}
