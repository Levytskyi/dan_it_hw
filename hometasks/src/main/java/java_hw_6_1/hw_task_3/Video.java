package java_hw_6_1.hw_task_3;

public class Video extends Media {
    private String resolution;

    public Video(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    @Override
    public void play() {
        System.out.println("Video is playing " + getTitle() + " with resolution " + this.resolution + ", duration is: " + getDuration() + "min");
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Video{" +
                "resolution='" + resolution + '\'' +
                '}';
    }
}
