package p001o;

import ai.salesmax.model.Template;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class t40 extends ewi {
    public final TextInputEditText A0;
    public final TextInputLayout B0;
    public final TextInputEditText C0;
    public final TextInputLayout D0;
    public final TextInputEditText E0;
    public final TextInputLayout F0;
    public Template G0;
    public Integer H0;
    public ck6 I0;
    public String J0;
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialSwitch p0;
    public final LinearLayout q0;
    public final View r0;
    public final TextInputEditText s0;
    public final TextInputLayout t0;
    public final RecyclerView u0;
    public final MaterialButton v0;
    public final MaterialButton w0;
    public final RecyclerView x0;
    public final MaterialButton y0;
    public final MaterialButton z0;

    public t40(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialSwitch materialSwitch, LinearLayout linearLayout, View view2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, RecyclerView recyclerView, MaterialButton materialButton3, MaterialButton materialButton4, RecyclerView recyclerView2, MaterialButton materialButton5, MaterialButton materialButton6, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3, TextInputEditText textInputEditText4, TextInputLayout textInputLayout4) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialSwitch;
        this.q0 = linearLayout;
        this.r0 = view2;
        this.s0 = textInputEditText;
        this.t0 = textInputLayout;
        this.u0 = recyclerView;
        this.v0 = materialButton3;
        this.w0 = materialButton4;
        this.x0 = recyclerView2;
        this.y0 = materialButton5;
        this.z0 = materialButton6;
        this.A0 = textInputEditText2;
        this.B0 = textInputLayout2;
        this.C0 = textInputEditText3;
        this.D0 = textInputLayout3;
        this.E0 = textInputEditText4;
        this.F0 = textInputLayout4;
    }

    public static t40 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static t40 i0(LayoutInflater layoutInflater, Object obj) {
        return (t40) ewi.m25668F(layoutInflater, p9e.add_template, null, false, obj);
    }

    public abstract void j0(String str);

    public abstract void k0(Template template);
}
