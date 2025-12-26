interface Worker {
    void work();
    void eat();
    void sleep();
}

class Robot implements Worker {
    public void work() {
        System.out.println("Robot working");
    }

    public void eat() {
        // inutile pour un robot
    }

    public void sleep() {
        // inutile pour un robot
    }
}
