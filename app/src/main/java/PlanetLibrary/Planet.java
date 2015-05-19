package PlanetLibrary;

import android.content.Context;

import com.threed.jpct.TextureInfo;
import com.threed.jpct.TextureManager;

/**
 * Created by Artjem on 04.05.2015.
 */
public class Planet extends SphereObj   {
    public static String planetTexture = null;

    public Planet(Context ctx, String planetTexture, float size){
        super(ctx,size);
        this.planetTexture = planetTexture;


        loadTexture(planetTexture,"","");
        loadTexture(planetTexture,"N","n");

        TextureInfo ti = new TextureInfo(TextureManager.getInstance().getTextureID(planetTexture));
        ti.add(TextureManager.getInstance().getTextureID(planetTexture+"N"), TextureInfo.MODE_MODULATE);
        this.getPlanetObj().setTexture(ti);
        this.getPlanetObj().setSpecularLighting(true);

    }

    public void addColor(int r,int g,int b){
        this.getPlanetObj().setAdditionalColor(r, g, b);
    }


}