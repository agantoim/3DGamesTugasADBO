package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.bullet.BulletAppState;
import com.jme3.bullet.control.RigidBodyControl;
import com.jme3.input.FlyByCamera;
import com.jme3.light.AmbientLight;
import com.jme3.light.DirectionalLight;
import static com.jme3.light.Light.Type.Ambient;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Matrix3f;
import com.jme3.math.Vector3f;
import com.jme3.renderer.Camera;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;
import com.jme3.terrain.heightmap.AbstractHeightMap;
import com.jme3.terrain.heightmap.ImageBasedHeightMap;
import com.jme3.texture.Texture;
import com.jme3.util.SkyFactory;


/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {
    private MainCharacter mainChar;
    private Camera camera;
    private FlyByCamera flyByCamera;
    private BulletAppState bulletAppState;
    
    public static void main(String[] args) {
        Main app = new Main();
        
//        app.showSettings = false;
//        
//        AppSettings ap = new AppSettings(true);
//        ap.put("Widht", 1280);
//        ap.put("Height", 720);
        app.start();
    }

    @Override
    public void simpleInitApp() {
        camera=this.getCamera();
        flyByCamera = this.getFlyByCamera();
        
        //set sky with nebula
        getRootNode().attachChild(SkyFactory.createSky(getAssetManager(), "Textures/Sky/SkyNeb.dds", SkyFactory.EnvMapType.CubeMap));
        
        //Camera, speed 500
//        this.flyCam.setEnabled(true);
//        this.setDisplayFps(false);
//        flyCam.setMoveSpeed(500);

        //set Camera to main character position
        camera.setLocation(new Vector3f(100,24,-35));
        camera.lookAt(new Vector3f(0,-10,50), new Vector3f(0,0,0));
        this.flyByCamera.setEnabled(true);
        flyCam.setMoveSpeed(500);
        
        //Light
        DirectionalLight ambient = new DirectionalLight();
        ambient.setDirection((new Vector3f(-0.5f,-0.5f,-0.5f)).normalizeLocal());
        ambient.setColor(ColorRGBA.White);
        rootNode.addLight(ambient);
        
        //Load Main Character
        //mainChar=new MainCharacter(assetManager.loadModel("Models/Sinbad/Quixote.j3o"));
        Spatial mainChar=assetManager.loadModel("Models/Sinbad/Quixote.j3o");
        rootNode.attachChild(mainChar);
        mainChar.setLocalTranslation(75, 10, 0);
        mainChar.rotate(0, -1.6f, 0);
        
        //Load scene1
        Spatial scene1 = assetManager.loadModel("Scenes/Scene1.j3o");
        rootNode.attachChild(scene1);

        //load scene2 next to scene1
        Spatial scene2 =assetManager.loadModel("Scenes/Scene2.j3o");
        rootNode.attachChild(scene2);
        scene2.setLocalTranslation(-256, 0, 0);
        
        
        Spatial scene3 =assetManager.loadModel("Scenes/Scene2.j3o");
        rootNode.attachChild(scene3);
        scene3.rotate(0, 22, 0);
        scene3.setLocalTranslation(-512, 0, 0);
        
        
        Spatial scene4 = assetManager.loadModel("Scenes/Scene1.j3o");
        scene4.rotate(0, 22, 0);
        scene4.setLocalTranslation(-768, 0, 0);
        rootNode.attachChild(scene4);

        
//        AbstractHeightMap heightmap = null;
//        Texture heightMapImage = assetManager.loadTexture(
//            "Textures/Terrain/splat/mountains512.png");
//        heightmap = new ImageBasedHeightMap(heightMapImage.getImage());
//        heightmap.load();
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
        
    }
}
