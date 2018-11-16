package com.leo.events.cardcontrol.card.box;

import com.poseidon.control.control.Priority;
import com.poseidon.control.obsever.Subscriber;
import com.poseidon.control.presenter.AbstractPresenter;

/**
 * Created by spf on 2018/11/15.
 */
@Priority
public class BoxPresenter extends AbstractPresenter<BoxCardVM> {

    @Override
    protected void registEvent() {
        mControl.getObservable("aaaa",BoxCard.class).subscribe(new Subscriber<BoxCard>() {
            @Override
            public void onNext(BoxCard appleCard) {

            }
        });
    }

    public void btnClick() {
        mControl.notify("key_person","你好");
    }

    public void btnClickClear() {

    }
}
