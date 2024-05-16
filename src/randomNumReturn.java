import java.util.Random;

public class randomNumReturn {

    //class with user range input as arguments for random number generation range
    public int randomNumGenerator(int min, int max) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(min, max);
        System.out.println(randomNumber);

        return randomNumber;
    }
}
