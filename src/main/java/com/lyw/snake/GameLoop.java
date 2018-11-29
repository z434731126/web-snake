package com.lyw.snake;

import java.util.concurrent.TimeUnit;

/**
 * Created by lyw.
 * User: yiweiliang1
 * Date: 2018/11/29
 */
public class GameLoop {

    public static SnakeGameMap snakeGameMap = SnakeGameMap.init();

    private static void mainLoop() throws InterruptedException {
        while (true) {
            snakeGameMap.next();
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public static void start() {
        try {
            System.out.println("游戏初始化...");
            mainLoop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
