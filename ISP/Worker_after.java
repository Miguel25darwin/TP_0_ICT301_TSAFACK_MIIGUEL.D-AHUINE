interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class Human implements Workable, Eatable, Sleepable {
    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }

    public void sleep() {
        System.out.println("Human sleeping");
    }
}

class Robot implements Workable {
    public void work() {
        System.out.println("Robot working");
    }
}
