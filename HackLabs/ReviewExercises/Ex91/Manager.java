package HackLabs.ReviewExercises.Ex91;

public class Manager extends Employee {
        private double bonus;

        public void setBonus(double newBonus) {
            bonus = newBonus;
        }

        @Override
        public double getSalary() {
            return super.getSalary() + bonus;
        }
}