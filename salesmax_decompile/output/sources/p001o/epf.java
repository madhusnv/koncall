package p001o;

import ai.salesmax.model.Tasks;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class epf extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialTextView p0;
    public final MaterialButton q0;
    public final TextInputEditText r0;
    public final TextInputLayout s0;
    public Tasks t0;
    public Integer u0;
    public ck6 v0;

    public epf(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialTextView materialTextView, MaterialButton materialButton3, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialTextView;
        this.q0 = materialButton3;
        this.r0 = textInputEditText;
        this.s0 = textInputLayout;
    }

    public static epf i0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return j0(layoutInflater, null);
    }

    public static epf j0(LayoutInflater layoutInflater, Object obj) {
        return (epf) ewi.m25668F(layoutInflater, p9e.sheet_update_engagement, null, false, obj);
    }

    public Tasks h0() {
        return this.t0;
    }

    public abstract void k0(Tasks tasks);
}
