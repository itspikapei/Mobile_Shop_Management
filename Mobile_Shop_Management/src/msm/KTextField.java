package msm;
import javax.swing.*;
import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
class KTextField extends JTextField {

    private int length = 0;

    // Creates a TextField with a fixed length of string input.
    public KTextField(int length) {
        super(new FixedLengthPlainDocument(length),
                "",
                length);
    }
}

    class FixedLengthPlainDocument extends PlainDocument {

        private int maxlength;

        // This creates a Plain Document with a maximum length called maxlength.
        FixedLengthPlainDocument(int maxlength) {
            this.maxlength = maxlength;
        }

        // This is the method used to insert a string to a Plain Document.
        public void insertString(int offset, String str, AttributeSet a) throws
                BadLocationException {

            // If the current length of the string
            // + the length of the string about to be entered
            //(through typing or copy and paste)
            // is less than the maximum length passed as an argument..
            // We call the Plain Document method insertString.
            // If it isn't, the string is not entered.

            if (!((getLength() + str.length()) > maxlength)) {
                super.insertString(offset, str, a);
            }
        }
    }