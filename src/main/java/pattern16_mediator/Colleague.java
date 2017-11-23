package pattern16_mediator;

/**
 * Author: Rivers
 * Date: 2017/11/23 21:11
 */
public interface Colleague {

    void setMediator(Mediator mediator);

    void setColleagueEnabled(boolean enabled);
}
