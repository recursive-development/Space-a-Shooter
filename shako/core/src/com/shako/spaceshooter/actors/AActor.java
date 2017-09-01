package com.shako.spaceshooter.actors;

// --- libGDX ---
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 *
 * @author Timur Kashapov
 */
public abstract class AActor extends Actor {

    /** */
    private final TextureRegion region;

    /** */
    public AActor(TextureRegion region) {
        this.region = region;
        setSize(region.getRegionWidth(), region.getRegionHeight());
        setBounds(0, 0, getWidth(), getHeight());

    } // AActor()

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);

        // ???
        batch.draw(
                region,
                getX(),         getY(),
                getOriginX(),   getOriginY(),
                getWidth(),     getHeight(),
                getScaleX(),    getScaleY(),
                getRotation());


    } // draw()
} // AActor
