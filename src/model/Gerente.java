package model;

public class Gerente implements Funcionario{

    private double bonus = 0.1;

    @Override
    public double getBonus() {
        return bonus;
    }
}
