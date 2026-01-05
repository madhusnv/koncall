package p001o;

import ai.salesmax.model.CallOutcome;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class cw extends ewi {
    public Integer A0;
    public ck6 B0;
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final MaterialCardView q0;
    public final TextInputLayout r0;
    public final AutoCompleteTextView s0;
    public final TextInputLayout t0;
    public final TextInputLayout u0;
    public final AutoCompleteTextView v0;
    public final TextInputEditText w0;
    public final MaterialSwitch x0;
    public final MaterialTextView y0;
    public CallOutcome z0;

    public cw(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialCardView materialCardView, TextInputLayout textInputLayout, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, AutoCompleteTextView autoCompleteTextView2, TextInputEditText textInputEditText, MaterialSwitch materialSwitch, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialButton3;
        this.q0 = materialCardView;
        this.r0 = textInputLayout;
        this.s0 = autoCompleteTextView;
        this.t0 = textInputLayout2;
        this.u0 = textInputLayout3;
        this.v0 = autoCompleteTextView2;
        this.w0 = textInputEditText;
        this.x0 = materialSwitch;
        this.y0 = materialTextView;
    }

    public static cw h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static cw i0(LayoutInflater layoutInflater, Object obj) {
        return (cw) ewi.m25668F(layoutInflater, p9e.add_call_outcome_type, null, false, obj);
    }

    public abstract void j0(CallOutcome callOutcome);
}
