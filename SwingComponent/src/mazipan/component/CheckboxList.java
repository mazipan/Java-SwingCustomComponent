package mazipan.component;

import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import mazipan.component.renderer.CheckListRenderer;
import mazipan.model.CheckableItem;

/**
 * The Class CheckboxList.
 */
@SuppressWarnings("rawtypes")
public class CheckboxList extends JList {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public CheckboxList() {
		super();

		setCellRenderer(new CheckListRenderer());
		setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int index = locationToIndex(e.getPoint());
				CheckableItem item = (CheckableItem) getModel().getElementAt(
						index);
				item.setSelected(!item.isSelected());
				Rectangle rect = getCellBounds(index, index);
				repaint(rect);

			}
		});

	}

	/**
	 * Sets the checkbox model.
	 * Must be use this method to set model
	 *
	 * @param arr the new checkbox model
	 */
	@SuppressWarnings("unchecked")
	public void setCheckboxModel(List<CheckableItem> arr) {

		DefaultListModel<CheckableItem> model = new DefaultListModel<CheckableItem>();
		for (int i = 0; i < arr.size(); i++) {
			model.add(i, arr.get(i));
		}
		setModel(model);

	}

	/**
	 * Gets the selected checkbox items.
	 *
	 * @return the list of checkbox selected items
	 */
	public List<CheckableItem> getSelectedCheckboxItems() {
		ListModel model = getModel();
		int n = model.getSize();
		ArrayList<CheckableItem> selected = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			CheckableItem item = (CheckableItem) model.getElementAt(i);
			if (item.isSelected()) {
				selected.add(item);
			}
		}
		return selected;

	}

}
