package Game.Entities.Static;

import Main.Handler;

/**
 * Created by AlexVR on 7/2/2018.
 */
public class Apple {

    private Handler handler;

    public int xCoord;
    public int yCoord;

    public Apple(Handler handler,int x, int y){
        this.handler=handler;
        this.xCoord=x;
        this.yCoord=y;
    }
    public boolean isGood() {
    	System.out.println("isGood");
    	boolean badApple = false;
    	
		int steps=handler.getWorld().GridWidthHeightPixelCount;
		int playerSteps = handler.getWorld().player.xCoord + handler.getWorld().player.yCoord  ;
    	
		if(steps == playerSteps) {
			System.out.println(playerSteps);
			badApple=true;
			handler.getWorld().player.EatRotten(badApple, true);
		}
	
//    		if(handler.getWorld().player.xCoord==steps||handler.getWorld().player.yCoord==steps) {
//    			badApple=true;
//    			handler.getWorld().player.EatRotten(badApple, true);
//    			}
////    		if(handler.getWorld().player.yCoord==steps) {
////    				badApple=true;
////    				handler.getWorld().player.EatRotten(badApple, true);
////    			}

		return badApple;
	
    	}
    
}
