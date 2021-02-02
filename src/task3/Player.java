package task3;

public class Player implements Playable, Recordable {

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void record() {
        System.out.println("Record");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }
}
