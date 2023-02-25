package Observer.pastpaper;

public class ImageSensor extends Thread{
    private FrameBuffer frameBuffer;

    public ImageSensor(FrameBuffer frameBuffer) {
        this.frameBuffer = frameBuffer;
    }

    public void run() {
        while(true) {
            try {
                Thread.sleep(5000);
                frameBuffer.insert(new Image());
            } catch(InterruptedException e) {

            }
        }
    }
}
