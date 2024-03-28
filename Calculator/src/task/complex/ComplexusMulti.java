package task.complex;

import task.impl.Operationable;

public class ComplexusMulti implements Operationable {
    @Override
    public double calculate(double x, double y) {
        return x * y; // условно
    }
}
