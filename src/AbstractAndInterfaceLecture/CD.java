package AbstractAndInterfaceLecture;

public class CD extends Media {

    @Override
    public void play() {
        System.out.println("I am playing the CD!!");
    }

    public static void main(String[] args) {
        CD myCD = new CD();
        myCD.checkout();
        myCD.play();
    }
}
