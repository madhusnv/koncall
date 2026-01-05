package p001o;

import ai.salesmax.model.FormFields;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class kof extends ewi {
    public final MaterialTextView A0;
    public final RecyclerView B0;
    public final MaterialButton C0;
    public final LinearLayout D0;
    public final TextInputEditText E0;
    public final TextInputLayout F0;
    public final MaterialButtonToggleGroup G0;
    public final MaterialTextView H0;
    public FormFields I0;
    public Integer J0;
    public ck6 K0;
    public final MaterialTextView n0;
    public final Button o0;
    public final Button p0;
    public final MaterialButton q0;
    public final Button r0;
    public final Button s0;
    public final Button t0;
    public final Button u0;
    public final r14 v0;
    public final MaterialTextView w0;
    public final TextInputEditText x0;
    public final TextInputLayout y0;
    public final MaterialButtonToggleGroup z0;

    public kof(Object obj, View view, int i, MaterialTextView materialTextView, Button button, Button button2, MaterialButton materialButton, Button button3, Button button4, Button button5, Button button6, r14 r14Var, MaterialTextView materialTextView2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView3, RecyclerView recyclerView, MaterialButton materialButton2, LinearLayout linearLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, MaterialButtonToggleGroup materialButtonToggleGroup2, MaterialTextView materialTextView4) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = button;
        this.p0 = button2;
        this.q0 = materialButton;
        this.r0 = button3;
        this.s0 = button4;
        this.t0 = button5;
        this.u0 = button6;
        this.v0 = r14Var;
        this.w0 = materialTextView2;
        this.x0 = textInputEditText;
        this.y0 = textInputLayout;
        this.z0 = materialButtonToggleGroup;
        this.A0 = materialTextView3;
        this.B0 = recyclerView;
        this.C0 = materialButton2;
        this.D0 = linearLayout;
        this.E0 = textInputEditText2;
        this.F0 = textInputLayout2;
        this.G0 = materialButtonToggleGroup2;
        this.H0 = materialTextView4;
    }

    public static kof i0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return j0(layoutInflater, null);
    }

    public static kof j0(LayoutInflater layoutInflater, Object obj) {
        return (kof) ewi.m25668F(layoutInflater, p9e.sheet_meeting_link, null, false, obj);
    }

    public FormFields h0() {
        return this.I0;
    }

    public abstract void k0(FormFields formFields);
}
