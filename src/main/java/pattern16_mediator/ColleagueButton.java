package pattern16_mediator;

import java.awt.*;

/**
 * Author: Rivers
 * Date: 2017/11/23 21:14
 */
public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;
    public ColleagueButton(String caption) {
        super(caption);
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
