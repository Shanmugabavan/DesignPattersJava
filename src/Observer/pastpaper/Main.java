package Observer.pastpaper;

public class Main {
    public static void main(String[] args) {
        FrameBuffer frameBuffer=new FrameBuffer(5);
        Thread imageSensor= new ImageSensor(frameBuffer);
        Thread imageProcessor= new ImageProcessor(frameBuffer);

        frameBuffer.setImageProcessor(imageProcessor);
        frameBuffer.setImageSensor(imageSensor);

        imageSensor.start();
        imageProcessor.start();


    }


}
