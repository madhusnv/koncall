package p001o;

import ai.salesmax.model.FormFields;
import ai.salesmax.model.Tasks;
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
public abstract class lnf extends ewi {
    public final MaterialButton A0;
    public final LinearLayout B0;
    public final MaterialButton C0;
    public final TextInputEditText D0;
    public final TextInputLayout E0;
    public final Button F0;
    public final Button G0;
    public final MaterialButtonToggleGroup H0;
    public final RecyclerView I0;
    public final MaterialButton J0;
    public final Button K0;
    public final MaterialButtonToggleGroup L0;
    public final MaterialTextView M0;
    public final MaterialTextView N0;
    public final MaterialTextView O0;
    public final MaterialTextView P0;
    public final MaterialTextView Q0;
    public final MaterialTextView R0;
    public Boolean S0;
    public Boolean T0;
    public Boolean U0;
    public Boolean V0;
    public Tasks W0;
    public FormFields X0;
    public FormFields Y0;
    public Integer Z0;
    public ck6 a1;
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final Button q0;
    public final Button r0;
    public final MaterialButton s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final r14 v0;
    public final r14 w0;
    public final MaterialButton x0;
    public final View y0;
    public final RecyclerView z0;

    public lnf(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, Button button5, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, r14 r14Var, r14 r14Var2, MaterialButton materialButton4, View view2, RecyclerView recyclerView, MaterialButton materialButton5, LinearLayout linearLayout, MaterialButton materialButton6, TextInputEditText textInputEditText, TextInputLayout textInputLayout, Button button6, Button button7, MaterialButtonToggleGroup materialButtonToggleGroup, RecyclerView recyclerView2, MaterialButton materialButton7, Button button8, MaterialButtonToggleGroup materialButtonToggleGroup2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = button4;
        this.r0 = button5;
        this.s0 = materialButton;
        this.t0 = materialButton2;
        this.u0 = materialButton3;
        this.v0 = r14Var;
        this.w0 = r14Var2;
        this.x0 = materialButton4;
        this.y0 = view2;
        this.z0 = recyclerView;
        this.A0 = materialButton5;
        this.B0 = linearLayout;
        this.C0 = materialButton6;
        this.D0 = textInputEditText;
        this.E0 = textInputLayout;
        this.F0 = button6;
        this.G0 = button7;
        this.H0 = materialButtonToggleGroup;
        this.I0 = recyclerView2;
        this.J0 = materialButton7;
        this.K0 = button8;
        this.L0 = materialButtonToggleGroup2;
        this.M0 = materialTextView;
        this.N0 = materialTextView2;
        this.O0 = materialTextView3;
        this.P0 = materialTextView4;
        this.Q0 = materialTextView5;
        this.R0 = materialTextView6;
    }

    public static lnf l0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return m0(layoutInflater, null);
    }

    public static lnf m0(LayoutInflater layoutInflater, Object obj) {
        return (lnf) ewi.m25668F(layoutInflater, p9e.sheet_complete_engagement, null, false, obj);
    }

    public FormFields h0() {
        return this.X0;
    }

    public FormFields i0() {
        return this.Y0;
    }

    public Tasks j0() {
        return this.W0;
    }

    public Boolean k0() {
        return this.S0;
    }

    public abstract void n0(Boolean bool);

    public abstract void p0(Boolean bool);

    public abstract void q0(FormFields formFields);

    public abstract void s0(FormFields formFields);

    public abstract void t0(Boolean bool);

    public abstract void u0(Tasks tasks);

    public abstract void v0(Boolean bool);
}
