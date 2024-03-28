import Enemy.IEnemy;
/**
 * AbstractEnemyFactory
 */

public interface AbstractEnemyFactory {
    
    IEnemy createPoisonousEnemy();
    IEnemy createCombatEnemy();

}
