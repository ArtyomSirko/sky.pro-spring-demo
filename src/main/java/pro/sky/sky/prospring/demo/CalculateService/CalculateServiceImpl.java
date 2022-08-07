package pro.sky.sky.prospring.demo.CalculateService;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    @Override
    public int plus(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public int minus(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public int multi(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public int divide(Integer a, Integer b) {

    return a / b;
    }

}
