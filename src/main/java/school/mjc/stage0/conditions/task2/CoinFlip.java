package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {

        if (from1UpTo1000 < 500) {
            System.out.println("Eagle");
        } else {
            System.out.println("Tail");
        }

    }

    public static void main(String[] args) {
        CoinFlip coinflip = new CoinFlip();
        coinflip.throwCoin(490);
        coinflip.throwCoin(500);

    }
}
