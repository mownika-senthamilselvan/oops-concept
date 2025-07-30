package interfaces;

public class Car implements Engine,Brake,Media{
    @Override
    public void brake() {
        System.out.println("Brake like normal car");
    }

    @Override
    public void start() {
        System.out.println("Start like normal car");
    }

    @Override
    public void stop() {
        System.out.println("Stop like normal car");
    }
}
