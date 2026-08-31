package java_hw_6_1.hw_task_3;

public class Program {
    public static void main(String[] args) {
        Media media = new Media("Something", 15);
        media.play();

        Media music = new Music("Mr.Know It All", 3, "Teddy Swims");
        music.play();

        Media video = new Video("The Lord of the Rings", 188, "1800x1080");
        video.play();
    }
}
