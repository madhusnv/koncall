package p001o;

import ai.salesmax.model.LeadsDeal;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class h6i extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final MaterialCardView q0;
    public final TextInputLayout r0;
    public final TextInputEditText s0;
    public final MaterialTextView t0;
    public LeadsDeal u0;
    public Integer v0;
    public ck6 w0;

    public h6i(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialCardView materialCardView, TextInputLayout textInputLayout, TextInputEditText textInputEditText, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialButton3;
        this.q0 = materialCardView;
        this.r0 = textInputLayout;
        this.s0 = textInputEditText;
        this.t0 = materialTextView;
    }

    public static h6i h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static h6i i0(LayoutInflater layoutInflater, Object obj) {
        return (h6i) ewi.m25668F(layoutInflater, p9e.update_deal, null, false, obj);
    }
}
