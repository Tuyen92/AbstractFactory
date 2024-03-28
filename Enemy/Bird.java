package Enemy;

public class Bird implements IEnemy{

    @Override
    public void attack() {
        System.out.println("Bird swoops down and attacks!");
    }

}
