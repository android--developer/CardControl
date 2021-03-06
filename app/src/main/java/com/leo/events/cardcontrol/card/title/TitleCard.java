package com.leo.events.cardcontrol.card.title;

import com.leo.events.cardcontrol.card.DefaultCard;
import com.poseidon.control.CardControl;
import com.poseidon.control.model.CardVM;
import com.poseidon.control.presenter.AbstractPresenter;
import com.poseidon.control.view.AbstractView;

/**
 * Created by spf on 2018/11/15.
 */
public class TitleCard extends DefaultCard {

    public TitleCard(CardControl control) {
        super(control);
    }

    @Override
    protected CardVM instanceCardVM() {
        return new TitleCardVM();
    }

    @Override
    protected AbstractView instanceCardView() {
        return new TitleCardView();
    }

    @Override
    protected AbstractPresenter instancePresenter() {
        return new TitlePresenter();
    }
}
