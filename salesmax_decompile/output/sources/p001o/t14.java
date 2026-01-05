package p001o;

import ai.salesmax.custom.CustomFormDataObservable;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class t14 extends ewi {
    public final MaterialCardView n0;
    public final MaterialTextView o0;
    public CustomFormDataObservable p0;
    public Integer q0;
    public ck6 r0;

    public t14(Object obj, View view, int i, MaterialCardView materialCardView, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialCardView;
        this.o0 = materialTextView;
    }

    public abstract void h0(ck6 ck6Var);

    public abstract void i0(CustomFormDataObservable customFormDataObservable);

    public abstract void j0(Integer num);
}
