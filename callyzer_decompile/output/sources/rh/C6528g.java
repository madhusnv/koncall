package rh;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import bh.AbstractC0659a;
import com.google.android.material.datepicker.ViewOnClickListenerC1348l;
import com.google.android.material.textfield.TextInputLayout;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import java.util.LinkedHashSet;
import pg.s8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.g */
/* loaded from: classes.dex */
public final class C6528g extends AbstractC6536o {

    /* renamed from: d */
    public final C6522a f31307d;

    /* renamed from: e */
    public final ViewOnFocusChangeListenerC6523b f31308e;

    /* renamed from: f */
    public final C6524c f31309f;

    /* renamed from: g */
    public final C6525d f31310g;

    /* renamed from: h */
    public AnimatorSet f31311h;

    /* renamed from: i */
    public ValueAnimator f31312i;

    public C6528g(TextInputLayout textInputLayout) {
        super(textInputLayout);
        int i10 = 0;
        this.f31307d = new C6522a(0, this);
        this.f31308e = new ViewOnFocusChangeListenerC6523b(this, i10);
        this.f31309f = new C6524c(this, i10);
        this.f31310g = new C6525d(this, 0);
    }

    @Override // rh.AbstractC6536o
    /* renamed from: a */
    public final void mo12551a() {
        Drawable drawableM11864b = s8.m11864b(this.f31337b, R.drawable.mtrl_ic_cancel);
        TextInputLayout textInputLayout = this.f31336a;
        textInputLayout.setEndIconDrawable(drawableM11864b);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC1348l(4, this));
        LinkedHashSet linkedHashSet = textInputLayout.f43897k1;
        C6524c c6524c = this.f31309f;
        linkedHashSet.add(c6524c);
        if (textInputLayout.f6960e != null) {
            c6524c.m12550a(textInputLayout);
        }
        textInputLayout.f43901o1.add(this.f31310g);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(AbstractC0659a.f4206d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new C6527f(this, 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(DefinitionKt.NO_Float_VALUE, 1.0f);
        LinearInterpolator linearInterpolator = AbstractC0659a.f4203a;
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat2.setDuration(100L);
        valueAnimatorOfFloat2.addUpdateListener(new C6527f(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f31311h = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f31311h.addListener(new C6526e(this, 0));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, DefinitionKt.NO_Float_VALUE);
        valueAnimatorOfFloat3.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat3.setDuration(100L);
        valueAnimatorOfFloat3.addUpdateListener(new C6527f(this, 0));
        this.f31312i = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C6526e(this, 1));
    }

    @Override // rh.AbstractC6536o
    /* renamed from: c */
    public final void mo12552c(boolean z6) {
        if (this.f31336a.getSuffixText() == null) {
            return;
        }
        m12553d(z6);
    }

    /* renamed from: d */
    public final void m12553d(boolean z6) {
        boolean z10 = this.f31336a.m4124g() == z6;
        if (z6 && !this.f31311h.isRunning()) {
            this.f31312i.cancel();
            this.f31311h.start();
            if (z10) {
                this.f31311h.end();
                return;
            }
            return;
        }
        if (z6) {
            return;
        }
        this.f31311h.cancel();
        this.f31312i.start();
        if (z10) {
            this.f31312i.end();
        }
    }
}
