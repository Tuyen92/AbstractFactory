import Enemy.Goblin;
import Enemy.IEnemy;
import Enemy.Snake;

public class GroundEnemyFactory implements AbstractEnemyFactory {

    @Override
    public IEnemy createPoisonousEnemy() {
        Snake snake = new Snake();
        return snake;
    }

    @Override
    public IEnemy createCombatEnemy() {
        Goblin goblin = new Goblin();
        return goblin;
    }
    
}
