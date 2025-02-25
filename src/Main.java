import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Lottery();

        Lottery.put("1 ROBOT 10 0.10");
        Lottery.put("2 TRAIN 15 0.15");
        Lottery.put("3 Ball 7 0.07");
        Lottery.put("4 RADIO 5 0.06");
        Lottery.put("5 CLOCK 3 0.04");
        Lottery.put("6 TEA_SET 20 0.20");
        Lottery.put("7 TOY_SOLDIER 8 0.08");
        Lottery.put("8 PLANE 30 0.30");

        ArrayList<toys> winners = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int wonToyId = Lottery.getToyId();
            toys wonToy = Lottery.getToyById(wonToyId);
            assert wonToy != null;
            if (Lottery.checkAvailable(wonToy)) {
                winners.add(wonToy);
            }
        }
        Lottery.saveToFile("Result.txt", winners);
    }
}