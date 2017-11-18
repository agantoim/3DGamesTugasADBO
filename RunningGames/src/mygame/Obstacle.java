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
        Random r=new Random();
        int rand=r.nextInt(2)+1;
        ob.setLocalTranslation(0, rand, 57);
        this.obstacle=ob;
        BoundingBox boundingBox =(BoundingBox) obstacle.getWorldBound();
        float radius=boundingBox.getXExtent();
        float height=boundingBox.getYExtent();
        
        CapsuleCollisionShape playerShape=new CapsuleCollisionShape(radius,height);
        
        obsControl=new CharacterControl(playerShape,1.0f);
        obstacle.addControl(obsControl);
    }

    
    
    public CharacterControl getRintanganControl() {
        return obsControl;
    }

    public Spatial getRintangan() {
        return obstacle;
    }
    
}
