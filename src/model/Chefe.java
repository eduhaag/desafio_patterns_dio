package model;

public class Chefe implements Funcionario{

    private double bonus = 0.05;

    @Override
    public double getBonus() {
        return bonus;
    }
}
