package org.denuwan.mega.megacity.service;



import org.denuwan.mega.megacity.dto.BookingDTO;
import org.denuwan.mega.megacity.entity.Booking;

import java.util.List;

public interface BookingService {
    boolean createBooking(BookingDTO bookingDTO);
    Booking getBookingById(int id);
    List<Booking> getAllBookings();
    boolean updateBooking(int id, BookingDTO bookingDTO);
    boolean deleteBooking(int id);
    List<Booking> getAllBookings(int id);
}
