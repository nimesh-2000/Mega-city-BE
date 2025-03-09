package org.denuwan.mega.megacity.dao;



import org.denuwan.mega.megacity.entity.Payment;

import java.util.List;

public interface PaymentDAO {
    boolean createPayment(Payment payment);
    Payment getPaymentById(int id);
    List<Payment> getAllPayments();
    void updatePayment(Payment payment);
    void deletePayment(int id);
}
