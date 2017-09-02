package com.shako.game.engine.stats;

// --- libGDX ---
import com.badlogic.gdx.Gdx;

/**
 * Статистика игрового приложения.
 *
 * @author Timur Kashapov
 */
public class GameAppStats extends Thread {

    /** */
    private long
            memUsageJavaHeap,
            memUsageNativeHeap;

    /** */
    private int
            width,
            height;

    /** */
    private int fps;
    private float delta;

    /** */
    public GameAppStats() {

        setDaemon(true);

    } // GameAppStats()

    /** */
    private void getStats() {

        memUsageJavaHeap   = Gdx.app.getJavaHeap();
        memUsageNativeHeap = Gdx.app.getNativeHeap();

        width  = Gdx.graphics.getWidth();
        height = Gdx.graphics.getHeight();
        fps    = Gdx.graphics.getFramesPerSecond();
        delta  = Gdx.graphics.getDeltaTime();
    } // getStats()

    /** */
    private void show() {

        getStats();

        // В зависимости от платормы:
        switch (Gdx.app.getType()) {
            case Desktop:
                System.out.printf("Java heap: %d\n", memUsageJavaHeap);
                System.out.printf("Java heap (native): %d\n", memUsageNativeHeap);
                break;
            case Android:
                // System.out.printf("Android API version: %d\n", Gdx.app.getVersion());
                break;
            case WebGL:
                // Code for WebGL application
                break;
            default:
                // Unhandled (new?) platform application
                break;
        }
    } // show()

    @Override
    public void run() {
        super.run();

        while (true) {

            getStats();
            // show();
        }
    } // run()

    /** */
    public long getMemUsageJavaHeap() {
        return memUsageJavaHeap;
    } // getMemUsageJavaHeap()

    /** */
    public long getMemUsageNativeHeap() {
        return memUsageNativeHeap;
    } // getMemUsageNativeHeap()

    /** */
    public int getWidth() {
        return width;
    } // getWidth()

    /** */
    public int getHeight() {
        return height;
    } // getHeight()

    /** */
    public int getFps() {
        return fps;
    } // getFps()

    /** */
    public float getDelta() {
        return delta;
    } // getDelta()
} // GameAppStats
