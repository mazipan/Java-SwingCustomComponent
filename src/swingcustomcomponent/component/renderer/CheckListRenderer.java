package swingcustomcomponent.component.renderer;

import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;
import swingcustomcomponent.model.CheckableItem;

/**
 *
 * @author irfan.maulana
 */
@SuppressWarnings({ "serial", "rawtypes" })
public class CheckListRenderer  extends JCheckBox implements ListCellRenderer {
	
    public CheckListRenderer() {
      setBackground(UIManager.getColor("List.textBackground"));
      setForeground(UIManager.getColor("List.textForeground"));
    }

    public Component getListCellRendererComponent(JList list, Object value,
        int index, boolean isSelected, boolean hasFocus) {
    	
      setEnabled(list.isEnabled());
      setSelected(((CheckableItem) value).isSelected());
      setFont(list.getFont());
      setText(value.toString());
      
      return this;
    }

}
