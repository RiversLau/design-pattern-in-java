package pattern16_mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Author: Rivers
 * Date: 2017/11/23 21:19
 */
public class ColleagueCheckBox extends Checkbox implements ItemListener, Colleague {

    private Mediator mediator;
    public ColleagueCheckBox(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
