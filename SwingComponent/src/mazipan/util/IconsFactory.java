package mazipan.util;

import javax.swing.ImageIcon;

public class IconsFactory {
	
	public static ImageIcon getImageIcon(String path) {
		ImageIcon icon = null;
        if (path != null) {
        	try {
        		icon = new ImageIcon(IconsFactory.class.getResource(path));
        	} catch (NullPointerException ex) {
        		System.out.println("Cannot get icon in path : " + path);
        	}
        }
        
        return icon;
    }
	
	
	
}

