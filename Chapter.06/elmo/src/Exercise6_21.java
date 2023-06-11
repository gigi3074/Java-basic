public class Exercise6_21 {
    public static void main(String[] args) {
        MyTv t = new MyTv();
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH: "+t.channel+", VOL: "+t.volume); //CH: 100, VOL: 0

        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume); //CH:99, VOL:0

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume); //CH:100, VOL:100
    }
}
class MyTv{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff(){
        isPowerOn = (isPowerOn)? false:true;
    }
    void volumeUp(){
        volume += (volume<MAX_VOLUME)? 1:0;
    }
    void volumeDown(){
        volume -= (volume>MIN_VOLUME)? 1:0;
    }
    void channelUp(){
        if(channel==MAX_CHANNEL){
            channel = MIN_CHANNEL;
        }else{
            channel++;
        }
    }
    void channelDown(){
        if(channel==MIN_CHANNEL){
            channel = MAX_CHANNEL;
        }else{
            channel--;
        }
    }
}
