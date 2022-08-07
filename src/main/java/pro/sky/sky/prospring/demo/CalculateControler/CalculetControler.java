package pro.sky.sky.prospring.demo.CalculateControler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.sky.prospring.demo.CalculateService.CalculateService;

@RestController

@RequestMapping("/calculate")
public class CalculetControler {
    private final CalculateService calculateService;
    public CalculetControler (CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public String welcom() {
        return "Добро пожаловать";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(name = "name1") Integer a,
                       @RequestParam(name = "name2") Integer b) {
        int plus = calculateService.plus(a, b);
        return a+"+"+b+"="+plus;
    } @GetMapping("/plus")
    public String minus(@RequestParam(name = "name1") Integer a,
                       @RequestParam(name = "name2") Integer b) {
        int minus = calculateService.minus(a, b);
        return a+"+"+b+"="+minus;
    } @GetMapping("/plus")
    public String multi(@RequestParam(name = "name1") Integer a,
                       @RequestParam(name = "name2") Integer b) {
        int multi = calculateService.multi(a, b);
        return a+"+"+b+"="+multi;
    } @GetMapping("/plus")
    public String divide(@RequestParam(name = "name1") Integer a,
                       @RequestParam(name = "name2") Integer b) {
        if (b ==0) {
            return "На ноль делить нельзя";
        }
        double divide = calculateService.divide(a, b);
        return a+"+"+b+"="+divide;
    }
}
