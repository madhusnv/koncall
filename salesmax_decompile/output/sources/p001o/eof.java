package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class eof extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final MaterialTextView q0;
    public final MaterialTextView r0;
    public final MaterialTextView s0;
    public final LinearLayout t0;
    public final LinearLayout u0;
    public final LinearLayout v0;

    public eof(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialButton3;
        this.q0 = materialTextView;
        this.r0 = materialTextView2;
        this.s0 = materialTextView3;
        this.t0 = linearLayout;
        this.u0 = linearLayout2;
        this.v0 = linearLayout3;
    }

    public static eof h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static eof i0(LayoutInflater layoutInflater, Object obj) {
        return (eof) ewi.m25668F(layoutInflater, p9e.sheet_leads_edit, null, false, obj);
    }
}
