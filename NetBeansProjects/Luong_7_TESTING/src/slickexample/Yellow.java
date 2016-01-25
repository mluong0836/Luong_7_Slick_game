/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slickexample;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

/**
 *
 * @author mluong
 */
public class Yellow {
    public int x;
	public int y;
	public boolean isvisible = true; //false so enemy can be beaten
        boolean enemy_alive;
	Image currentImage;
	Shape hitbox;
	Image healthpotion = new Image("res/yellow_key.png");

	Yellow(int a, int b) throws SlickException {
		this.x = a;
		this.y = b;
		this.hitbox = new Rectangle(a, b, 32, 32);// 64 is the width of the item
		this.currentImage = healthpotion;
}
        
        public void beaten() {
    
            if(!enemy_alive) {
                
            }
}
}
