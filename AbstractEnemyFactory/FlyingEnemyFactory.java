import Enemy.Bat;
import Enemy.Bird;
import Enemy.IEnemy;

public class FlyingEnemyFactory implements AbstractEnemyFactory {

    @Override
    public IEnemy createPoisonousEnemy() {
        Bat bat = new Bat();
        return bat;
    }

    @Override
    public IEnemy createCombatEnemy() {
        Bird bird = new Bird();
        return bird;
    }
    
}
