package swingcustomcomponent.util;

import javax.swing.ImageIcon;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Icons objects.
 */
public class IconsFactory {
	
	/**
	 * Gets the image icon.
	 *
	 * @param path of the icon you want set it.
	 * @return ImageIcon.class
	 */
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

