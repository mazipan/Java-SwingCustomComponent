package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import mazipan.component.CheckboxList;
import mazipan.component.ColumnsAutoSizer;
import mazipan.component.IntegerTextField;
import mazipan.component.JTableCustom;
import mazipan.model.CheckableItem;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
public class testFrame extends JFrame {

	private JPanel contentPane;
	private CheckboxList list;
	private IntegerTextField textField;
	private JTableCustom table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testFrame frame = new testFrame();
					frame.setVisible(true);
					// frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public testFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"), }, new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"), }));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "2, 2, fill, fill");

		JPanel panel = new JPanel();
		tabbedPane.addTab("CheckboxList", null, panel, null);
		panel.setLayout(new FormLayout(
				new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"),
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC, }, new RowSpec[] {
						FormFactory.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"), }));

		ArrayList<CheckableItem> strs = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			People p = new People();
			p.setPeopleId(i + 1);
			p.setPeopleName("Name " + i);
			strs.add(new CheckableItem(p));
		}

		list = new CheckboxList();
		list.setCheckboxModel(strs);
		JScrollPane js = new JScrollPane(list);
		panel.add(js, "2, 2, fill, fill");

		JButton btnGetSelected = new JButton("get selected");
		btnGetSelected.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				List<CheckableItem> a = list.getSelectedCheckboxItems();
				System.out.println("=====================");
				for (CheckableItem checkableItem : a) {
					System.out.print(checkableItem + ", ");
				}
			}
		});
		panel.add(btnGetSelected, "4, 2, default, top");

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("IntegerTextField", null, panel_1, null);
		panel_1.setLayout(new FormLayout(
				new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"),
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC, }, new RowSpec[] {
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC, }));

		textField = new IntegerTextField();
		panel_1.add(textField, "2, 2, fill, default");
		textField.setColumns(10);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("ColumnAutoSizer", null, panel_2, null);
		panel_2.setLayout(new BorderLayout(0, 0));

		table = new JTableCustom();
		table.setUseTooltip(false);
		JScrollPane js2 = new JScrollPane(table);

		DefaultTableModel dtm = new DefaultTableModel();
		dtm.addColumn("test");
		dtm.addColumn("test2");

		String s = "bdbcscsdcds";
		String r = "bbb";
		for (int i = 0; i < 10; i++) {
			Object[] rowData = new Object[2];
			rowData[0] = s;
			rowData[1] = r;
			dtm.addRow(rowData);
			s += s;
		}
		table.setModel(dtm);
		ColumnsAutoSizer.sizeColumnsToFit(table);

		panel_2.add(js2, BorderLayout.CENTER);

	}

}
