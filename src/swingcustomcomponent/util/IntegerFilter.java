package swingcustomcomponent.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

// TODO: Auto-generated Javadoc
/**
 * The Class IntegerFilter.
 */
public class IntegerFilter extends DocumentFilter {

    /**
     * Instantiates a new integer filter.
     */
    public IntegerFilter() {

    }

    /* (non-Javadoc)
     * @see javax.swing.text.DocumentFilter#insertString(javax.swing.text.DocumentFilter.FilterBypass, int, java.lang.String, javax.swing.text.AttributeSet)
     */
    @Override
    public void insertString(FilterBypass fb, int off, String str, AttributeSet attr)
            throws BadLocationException {
        // remove non-digits
        fb.insertString(off, str.replaceAll("\\D++", ""), attr);
    }

    /* (non-Javadoc)
     * @see javax.swing.text.DocumentFilter#replace(javax.swing.text.DocumentFilter.FilterBypass, int, int, java.lang.String, javax.swing.text.AttributeSet)
     */
    @Override
    public void replace(FilterBypass fb, int off, int len, String str, AttributeSet attr)
            throws BadLocationException {
        // remove non-digits
        fb.replace(off, len, str.replaceAll("\\D++", ""), attr);
    }
    

	public static int parseWithDefault(String number, int defaultVal) {
		try {
			return Integer.parseInt(number);
		} catch (NumberFormatException e) {
			return defaultVal;
		}
	}

}
