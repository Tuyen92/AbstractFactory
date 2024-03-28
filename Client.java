import java.util.Scanner;

import Enemy.IEnemy;

public class Client {

    public static void createAndUseEnemies(AbstractEnemyFactory factory, int enemyTypeChoice) {

        IEnemy enemy = null;
          switch (enemyTypeChoice) {
              case 1:
                  enemy = factory.createPoisonousEnemy();
                  break;
              case 2:
                  enemy = factory.createCombatEnemy();
                  break;
              default:
                  System.out.println("Invalid choice.");
                  return;
          }
        if (enemy != null) {
            enemy.attack();
        }
    }
  
    public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Choose enemy type (1 for poisonous, 2 for combat):");
        int enemyTypeChoice = scanner.nextInt();
      AbstractEnemyFactory flyingFactory = new FlyingEnemyFactory();
      createAndUseEnemies(flyingFactory, enemyTypeChoice);
  
      AbstractEnemyFactory groundFactory = new GroundEnemyFactory();
      createAndUseEnemies(groundFactory, enemyTypeChoice);
      }
    }
  }
