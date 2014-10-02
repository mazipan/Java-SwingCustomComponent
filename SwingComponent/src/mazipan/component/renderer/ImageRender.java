package mazipan.component.renderer;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * The Class ImageRender.
 * credit to ressahardian
 */
@SuppressWarnings("serial")
public class ImageRender extends DefaultTableCellRenderer {
	
	/* (non-Javadoc)
	 * @see javax.swing.table.DefaultTableCellRenderer#getTableCellRendererComponent(javax.swing.JTable, java.lang.Object, boolean, boolean, int, int)
	 */
	public Component getTableCellRendererComponent(JTable tabel, Object obj,
			boolean isSelected, boolean hasFocus, int baris, int kolom) {
		TextIcon ti = (TextIcon) obj;
		if (obj == ti) {
			setIcon(ti.imgIcon);
			setText(ti.text);
		}
		setBorder(UIManager.getBorder("TableHeader.cellBorder"));
		setHorizontalAlignment(JLabel.CENTER);
		return this;
	}
}
