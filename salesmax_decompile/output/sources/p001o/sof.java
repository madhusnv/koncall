package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

/* loaded from: classes.dex */
public abstract class sof extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final TextInputEditText p0;
    public final TextView q0;
    public final TextView r0;
    public final TextView s0;
    public final TextView t0;

    public sof(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, TextInputEditText textInputEditText, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = textInputEditText;
        this.q0 = textView;
        this.r0 = textView2;
        this.s0 = textView3;
        this.t0 = textView4;
    }

    public static sof h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static sof i0(LayoutInflater layoutInflater, Object obj) {
        return (sof) ewi.m25668F(layoutInflater, p9e.sheet_register_device, null, false, obj);
    }
}
