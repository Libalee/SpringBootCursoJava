package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.converters.MathConverter;
import com.example.demo.exceptions.UnsupportedMathOperationExpection;
import com.example.demo.math.SimpleMath;

@RestController
public class MathController {


    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
    ) {

        if(!(MathConverter.isNumeric(numberOne)) || !(MathConverter.isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationExpection();
        }

        return SimpleMath.sum(MathConverter.convertToDouble(numberOne), MathConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double sub(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
    ) {

        if(!(MathConverter.isNumeric(numberOne)) || !(MathConverter.isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationExpection();
        }

        return SimpleMath.sub(MathConverter.convertToDouble(numberOne), MathConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double div(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
    ) {

        if(!(MathConverter.isNumeric(numberOne)) || !(MathConverter.isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationExpection();
        }

        return SimpleMath.div(MathConverter.convertToDouble(numberOne), MathConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double mul(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
    ) {

        if(!(MathConverter.isNumeric(numberOne)) || !(MathConverter.isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationExpection();
        }

        return SimpleMath.mul(MathConverter.convertToDouble(numberOne), MathConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("/average/{numberOne}/{numberTwo}")
    public Double avg(
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
    ) {

        if(!(MathConverter.isNumeric(numberOne)) || !(MathConverter.isNumeric(numberTwo))) {
            throw new UnsupportedMathOperationExpection();
        }

        return SimpleMath.avg(MathConverter.convertToDouble(numberOne), MathConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("/sqrt/{number}")
    public Double sqrt(
        @PathVariable(value = "number") String number
    ) {

        if(!(MathConverter.isNumeric(number))) {
            throw new UnsupportedMathOperationExpection();
        }

        return SimpleMath.sqrt(MathConverter.convertToDouble(number));

    }
}
