/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slickexample;

import org.newdawn.slick.Animation;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

/**
 *
 * @author mluong
 */
public class Player {
    
        public static float x = 96f;

	public static float y = 228f;

	public static int health = 100000;
	
	public static float speed = .4f;

	static float hitboxX = x + 8f;

	static float hitboxY = y + 8f;

	private static int startX, startY, width = 30, height = 42;

	public static Shape rect = new Rectangle(getplayershitboxX(),
			getplayershitboxY(), width, height);

	public static float pdelta;

	public static Animation playeranime;
        
        public boolean blue;
        
        public boolean yellow;
        
        public boolean green;
        
        public boolean pink;
        
        public boolean last;

	public static void setpdelta(float somenum) {

		pdelta = somenum;

	}

	public static float getpdelta() {

		return pdelta;

	}

	public static float getplayersX() {

		return x;

	}

	public static float getplayersY() {

		return y;

	}

	public static float getplayershitboxX() {

		return x + 18f;

	}

	public static float getplayershitboxY() {

		return y + 18f;

	}

	public static void setplayershitboxX() {

		hitboxX = getplayershitboxX();

	}

	public static void setplayershitboxY() {

		hitboxY = getplayershitboxY();

	}
        
        public void stage1() {
            
            blue = true;
    
}
        public void stage2() {
            
            yellow = true;
        }
        
        public void stage3(){
    
            green = true;
}
        public void stage4() {
    
            green = true;
}
        
        public void stage5() {
            
            last = true;            
            
        }
}
