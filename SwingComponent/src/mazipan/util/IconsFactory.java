package mazipan.util;

import javax.swing.ImageIcon;

public class IconsFactory {
	
	public static ImageIcon getImageIcon(String name) {
		ImageIcon icon = null;
        if (name != null) {
        	try {
        		icon = new ImageIcon(IconsFactory.class.getResource(name));
        	} catch (NullPointerException ex) {
        		System.out.println("Cannot get icon : " + name);
        	}
        }
        
        return icon;
    }
	
	
	
}

