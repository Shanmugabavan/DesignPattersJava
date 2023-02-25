package Proxy_Design_Pattern;

public class HighResolutionImage implements Image {

    private String imageFilePath;

    public HighResolutionImage(String imageFilePath) {
        this.imageFilePath = imageFilePath;
        loadImage(imageFilePath);
    }

    private void loadImage(String imageFilePath) {

        // load Image from disk into memory
        // this is heavy and costly operation
    }

    public String getFilePath(){
        return imageFilePath;
    }

    @Override
    public void showImage() {

        // Actual Image rendering logic

    }

}
