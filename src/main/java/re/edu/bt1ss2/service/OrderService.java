package re.edu.bt1ss2.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public String healthCheck() {
        return "Order Service is Up";
    }
}
