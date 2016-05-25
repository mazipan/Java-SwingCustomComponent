package swingcustomcomponent.component;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import swingcustomcomponent.util.IntegerFilter;


/**
 * The Class IntegerTextField.
 * TextField that only accept integer value.
 */
public class IntegerTextField extends JTextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public IntegerTextField() {
		Document doc = getDocument();
		AbstractDocument abd = (AbstractDocument) doc;
		abd.setDocumentFilter(new IntegerFilter());
		
	}

	/**
	 * Gets the text integer.
	 *
	 * @return Integer ==> get value with Integer return.
	 */
	public Integer getTextInteger() {

		return IntegerFilter.parseWithDefault(getText(), 0);
	}
	

	/**
	 * Sets the text integer.
	 *
	 * @param int i ==> new value of TextField with int.
	 */
	public void setTextInteger(int i) {
		
		setText(Integer.toString(i));
	}

}
