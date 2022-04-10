import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(900, 900);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(127, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
  fill(255,255,255);
  ellipse(width/2,height/4,width/4,height/4);
  fill(255,255,255);
  ellipse(width/2,height*29/50,width*5/12,height*5/12);
  fill(255,255,255);
  rect(-1, height*3/4, width+1, height+1);
  fill(0,0,0);
  rect(width*37/75,height*29/60,width/75,height/60);
  fill(0,0,0);
  rect(width*37/75,height*8/15,width/75,height/60);
  fill(0,0,0);
  rect(width*37/75,height*7/12,width/75,height/60);
  fill(150,150,150);
  ellipse(width*9/20,height*9/40,width/40,height/40);
  fill(150,150,150);
  ellipse(width*11/20,height*9/40,width/40,height/40);
  fill(255,255,0);
  ellipse(width,0,width/4,height/4);
  fill(255,0,0);
  triangle(width/3, height/6, width*2/3, height/6, width/2, height/15); 
  }
  
  // define other methods down here.
}