public class TelevisionTest {
    public static void main(String[] args) {
        Television myTV = new Television();

        myTV.channel = 7;
        myTV.volume = 9;
        myTV.isOn = true;
        myTV.setChannel(11);
        myTV.print();                                       // 채널은 11이고 볼륨은 9입니다.
        int ch = myTV.getChannel();
        System.out.println("현재 채널은 " + ch + "입니다.");    // 현재 채널은 11입니다.

        Television yourTV = new Television();
        yourTV.channel = 9;
        yourTV.volume = 12;
        yourTV.isOn = true;
        yourTV.print();                                     // 채널은 9이고 볼륨은 12입니다.
    }
}
