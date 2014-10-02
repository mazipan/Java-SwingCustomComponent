package mazipan.component;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import mazipan.component.renderer.ImageRender;
import mazipan.component.renderer.TextIcon;

/**
 * The Class JTableCustom.
 * JTable with added some custom feature.
 */
public class JTableCustom extends JTable {
	private static final long serialVersionUID = 1L;
	private boolean useTooltip = false;

	public JTableCustom() {
		renderTooltip();

	}

	/**
	 * Sets the header with icon.
	 *
	 * @param int columnIndex
	 * @param ImageIcon icon for header
	 * @param String the header title
	 */
	public void setHeaderWithIcon(int kol_index, ImageIcon icon, String nama) {
		getTableHeader().getColumnModel().getColumn(kol_index)
				.setHeaderRenderer(new ImageRender());
		getColumnModel().getColumn(kol_index).setHeaderValue(
				new TextIcon(nama, icon));
	}

	public boolean isUseTooltip() {
		return useTooltip;
	}

	/**
	 * Sets the use tooltip.
	 * Call this method if you want tooltip for every cell
	 *
	 * @param useTooltip the new use tooltip
	 */
	public void setUseTooltip(boolean useTooltip) {
		this.useTooltip = useTooltip;
		renderTooltip();
	}

	private void renderTooltip() {
		setDefaultRenderer(Object.class, new TableCellRenderer() {

			JLabel comp = new JLabel();

			@Override
			public Component getTableCellRendererComponent(JTable table,
					Object value, boolean isSelected, boolean hasFocus,
					int row, int column) {
				// TODO Auto-generated method stub

				comp.setText((String) table.getValueAt(row, column));
				if (useTooltip) {
					comp.setToolTipText((String) table.getValueAt(row, column));
				}
				return comp;
			}

		});

	}

	/**
	 * Sets the cell editable.
	 * 
	 * get value from old model and set into new model. you must be set the
	 * model before call this method.
	 *
	 * @param boolean b ==> if true : cell will editable
	 *            
	 */
	public void setCellEditable(final boolean b) {
		DefaultTableModel dtm = (DefaultTableModel) getModel();
		if (dtm != null) {
			int columnCount = dtm.getColumnCount();
			int rowCount = dtm.getRowCount();

			DefaultTableModel dtmTemp = new DefaultTableModel() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				public boolean isCellEditable(int row, int column) {
					// all cells false
					return b;
				}

			};

			if (columnCount > 0) {

				Object[] data = new Object[columnCount];

				for (int i = 0; i < columnCount; i++) {
					dtmTemp.addColumn(dtm.getColumnName(i));
				}

				if (rowCount > 0) {
					for (int i = 0; i < columnCount; i++) {
						for (int j = 0; j < rowCount; j++) {
							data[i] = dtm.getValueAt(j, i);
							dtmTemp.addRow(data);
						}
					}
				}

				setModel(dtmTemp);

			}

		}

	}

}
