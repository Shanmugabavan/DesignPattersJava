package Observer.pastpaper;

public class ImageProcessor extends Thread{
    private FrameBuffer frameBuffer;

    public ImageProcessor(FrameBuffer frameBuffer) {
        this.frameBuffer = frameBuffer;
    }

    private void process() {

    }
    public void run() {
        Image img=null;
        while(true) {
            try {
                img = frameBuffer.remove();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(img != null)
                process();
        }
    }
}
