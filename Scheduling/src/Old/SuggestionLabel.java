package Old;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.KeyStroke;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;

public class SuggestionLabel extends JLabel{

    private boolean focused = false;
    private final JWindow autoSuggestionsPopUpWindow;
    private final JTextComponent textComponent;
    private final AutoSuggestor autoSuggestor;
    private Color suggestionsTextColor, suggestionBorderColor;

    public SuggestionLabel(String string, final Color borderColor, Color suggestionsTextColor, AutoSuggestor autoSuggestor) {
        super(string);

        this.suggestionsTextColor = suggestionsTextColor;
        this.autoSuggestor = autoSuggestor;
        this.textComponent = autoSuggestor.getTextField();
        this.suggestionBorderColor = borderColor;
        this.autoSuggestionsPopUpWindow = autoSuggestor.getAutoSuggestionPopUpWindow();

        initComponent();
    }

    private void initComponent() {
        setFocusable(true);
        setForeground(suggestionsTextColor);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                super.mouseClicked(me);

                replaceWithSuggestedText();

                autoSuggestionsPopUpWindow.setVisible(false);
                
                if(!autoSuggestor.getDictionary().contains(autoSuggestor.getCurrentlyTypedWord())){
    				autoSuggestor.addToDictionary(autoSuggestor.getCurrentlyTypedWord());
    			}
            }
        });

        FrontDeskFormOne.getTextField().setFocusable(true);
        addKeyListener(new KeyAdapter(){
        	@Override
        	public void keyPressed(KeyEvent enter){
        		if(enter.getKeyCode() == KeyEvent.VK_ENTER){
        			if(!autoSuggestor.getDictionary().contains(autoSuggestor.getCurrentlyTypedWord())){
        				autoSuggestor.addToDictionary(autoSuggestor.getCurrentlyTypedWord());
        			}
        		}
                autoSuggestionsPopUpWindow.setVisible(false);
        	}
        });
        
        getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "Enter released");
        getActionMap().put("Enter released", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                replaceWithSuggestedText();
                autoSuggestionsPopUpWindow.setVisible(false);
            }

        });
    }

    public void setFocused(boolean focused) {
        if (focused) {
            setBorder(new LineBorder(suggestionBorderColor));
        } else {
            setBorder(null);
        }
        repaint();
        this.focused = focused;
    }

    public boolean isFocused() {
        return focused;
    }

    private void replaceWithSuggestedText() {
        String suggestedWord = getText();
        String text = textComponent.getText();
        String typedWord = autoSuggestor.getCurrentlyTypedWord();
        String t = text.substring(0, text.lastIndexOf(typedWord));
        String tmp = t + text.substring(text.lastIndexOf(typedWord)).replace(typedWord, suggestedWord);
        textComponent.setText(tmp + " ");
    }
}