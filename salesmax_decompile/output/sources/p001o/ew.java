package p001o;

import ai.salesmax.model.ChatLabel;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ew extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final MaterialCardView q0;
    public final TextInputLayout r0;
    public final TextInputEditText s0;
    public final MaterialButton t0;
    public final MaterialTextView u0;
    public final MaterialTextView v0;
    public ChatLabel w0;
    public Integer x0;
    public ck6 y0;

    public ew(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialCardView materialCardView, TextInputLayout textInputLayout, TextInputEditText textInputEditText, MaterialButton materialButton4, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialButton3;
        this.q0 = materialCardView;
        this.r0 = textInputLayout;
        this.s0 = textInputEditText;
        this.t0 = materialButton4;
        this.u0 = materialTextView;
        this.v0 = materialTextView2;
    }

    public static ew h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static ew i0(LayoutInflater layoutInflater, Object obj) {
        return (ew) ewi.m25668F(layoutInflater, p9e.add_chat_label_type, null, false, obj);
    }

    public abstract void j0(ChatLabel chatLabel);
}
