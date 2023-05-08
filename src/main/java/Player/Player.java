package Player;

public class Player {

    private Integer number;


    public void guess() {

        number = (int) (Math.random() * 10);
        System.out.println("Думаю, это число: " + number);
    }

    public Integer getNumber() {
        return number;
    }

}
