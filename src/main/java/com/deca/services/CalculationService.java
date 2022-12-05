package com.deca.services;

import com.deca.entities.Calculation;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public Calculation add(Calculation calc) {
        /*
            Take in a calculation entity.
            take the value from opA
            take the value from opB
            add the values from opA and opB together and store the result
         */
        int a = calc.getOpA();
        int b = calc.getOpB();
        calc.setResult(a + b);
        return calc;
    }

    public Calculation subtract(Calculation calc) {
        /*
            Take in a calculation entity.
            take the value from opA
            take the value from opB
            subtract the value opB from opA and store the result
         */
        calc.setResult(calc.getOpA() - calc.getOpB());
        return calc;
    }

    public Calculation multiply(Calculation calc) {
        /*
            Take in a calculation entity.
            take the value from opA
            take the value from opB
            multiply the values from opA and opB together and store the result
         */
        calc.setResult(calc.getOpA() * calc.getOpB());
        return calc;
    }

    public Calculation divide(Calculation calc) {
        /*
            Take in a calculation entity.
            take the value from opA
            take the value from opB
            divide the value opA by opB and store the result
         */
        calc.setResult(calc.getOpA() / calc.getOpB());
        return calc;
    }
}
