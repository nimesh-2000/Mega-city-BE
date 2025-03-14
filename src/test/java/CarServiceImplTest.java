import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.denuwan.mega.megacity.dao.CarDAO;
import org.denuwan.mega.megacity.dto.CarDTO;
import org.denuwan.mega.megacity.entity.Car;
import org.denuwan.mega.megacity.service.impl.CarServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.Arrays;
import java.util.List;

class CarServiceImplTest {

    @Mock
    private CarDAO carDAOMock;

    private CarServiceImpl carService;

    @BeforeEach
    void setUp() {
        // Initialize mocks and create instance of service
        MockitoAnnotations.openMocks(this);
        carService = new CarServiceImpl();
        carService.setCarDAO(carDAOMock); // Inject mocked DAO
    }

    @Test
    void testAddCar() {
        // Arrange
        CarDTO carDTO = new CarDTO(20, "Toyota", "Corolla", "ABC123", 2020, "Available");

        // Act
        carService.addCar(carDTO);

        // Assert
        verify(carDAOMock, times(1)).addCar(any(Car.class));
    }

    @Test
    void testGetCarById() {
        // Arrange
        Car car = new Car(1, "Toyota", "Corolla", "ABC123", 2020, "Available");
        when(carDAOMock.getCarById(1)).thenReturn(car);

        // Act
        CarDTO result = carService.getCarById(1);

        // Assert
        assertNotNull(result);
        assertEquals(1, result.getId());
        assertEquals("Toyota", result.getName());
        assertEquals("Corolla", result.getModel());
    }

    @Test
    void testGetAllCars() {
        // Arrange
        List<Car> cars = Arrays.asList(
                new Car(1, "Toyota", "Corolla", "ABC123", 2020, "Available"),
                new Car(2, "Honda", "Civic", "XYZ456", 2021, "Unavailable")
        );
        when(carDAOMock.getAllCars()).thenReturn(cars);

        // Act
        List<CarDTO> result = carService.getAllCars();

        // Assert
        assertEquals(2, result.size());
        assertEquals("Toyota", result.get(0).getName());
        assertEquals("Honda", result.get(1).getName());
    }

    @Test
    void testUpdateCar() {
        // Arrange
        CarDTO carDTO = new CarDTO(1, "Toyota", "Corolla", "ABC123", 2020, "Available");

        // Act
        carService.updateCar(carDTO);

        // Assert
        verify(carDAOMock, times(1)).updateCar(any(Car.class));
    }

    @Test
    void testDeleteCar() {
        // Arrange
        int carId = 1;

        // Act
        carService.deleteCar(carId);

        // Assert
        verify(carDAOMock, times(1)).deleteCar(carId);
    }
}
