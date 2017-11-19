/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.bounding.BoundingBox;
import com.jme3.bullet.collision.shapes.CapsuleCollisionShape;
import com.jme3.bullet.control.CharacterControl;
import com.jme3.scene.Spatial;
import java.util.Random;

/**
 *
 * @author Qolbi Fathurrohim
 */
public class Obstacle {
    protected CharacterControl obsControl;
    protected Spatial obstacle;
    public Obstacle(Spatial ob)
    {
        
    }
    
    public CharacterControl getObsControl() {
        return obsControl;
    }

    public Spatial getObstacle() {
        return obstacle;
    }
    
}
