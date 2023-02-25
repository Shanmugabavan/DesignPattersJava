package Observer.pastpaper;

public class FrameBuffer {
    private Thread imageProcessor;
    private Thread imageSensor;
    private Image [] buffer;
    private int size;
    private int index;

    public void setImageProcessor(Thread imageProcessor) {
        this.imageProcessor = imageProcessor;
    }

    public void setImageSensor(Thread imageSensor) {
        this.imageSensor = imageSensor;
    }

    public FrameBuffer( int size) {
        this.buffer = new Image[size];
        this.size = size;
        this.index = 0;
    }

    public synchronized void insert(Image img) throws InterruptedException {
        if (index>=size){
            imageSensor.wait();
        }
        this.buffer[index]=img;
        imageProcessor.notify();
        System.out.println("inserted");
        index++;
    }

    public synchronized Image remove() throws InterruptedException {
        Image img = null;
        if (index <= 0) {
            imageProcessor.wait();
        }

        img = buffer[0];
        for (int i = 0; i < index - 1; i++) {
            buffer[i] = buffer[i + 1];
            System.out.println("removed");
            imageSensor.notify();

            index--;
        }

        return img;
    }
}
