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

/**
 *
 * @author Qolbi Fathurrohim
 */
public class MainCharacter {
    private CharacterControl mainControl;
    private Spatial mainPlayer;
    
    public MainCharacter(Spatial mainChar){
        mainPlayer=mainChar;
        //mainPlayer.setLocalScale(300);
        //mainPlayer.setLocalTranslation(50, 0, 0);
        BoundingBox boundingBox=(BoundingBox) mainPlayer.getWorldBound();
        float radius=boundingBox.getXExtent();
        float height=boundingBox.getYExtent();
        
        CapsuleCollisionShape playerShape=new CapsuleCollisionShape(radius,height);
        
        mainControl=new CharacterControl(playerShape,1.0f);
        mainPlayer.addControl(mainControl);
        mainControl.setJumpSpeed(20);
        
    }
    
    public CharacterControl getMainControl(){
        return mainControl;
    }
    
    public Spatial getMainPlayer(){
        return mainPlayer;
    }
}
