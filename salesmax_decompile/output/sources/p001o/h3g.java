package p001o;

import ai.salesmax.model.FormFields;
import ai.salesmax.model.Leads;
import ai.salesmax.model.Tasks;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class h3g extends ewi {
    public final View A0;
    public FormFields A1;
    public final ShapeableImageView B0;
    public Integer B1;
    public final MaterialTextView C0;
    public ck6 C1;
    public final MaterialTextView D0;
    public final ShapeableImageView E0;
    public final MaterialButton F0;
    public final MaterialButton G0;
    public final MaterialButton H0;
    public final MaterialButton I0;
    public final View J0;
    public final RecyclerView K0;
    public final RecyclerView L0;
    public final RecyclerView M0;
    public final RecyclerView N0;
    public final MaterialButton O0;
    public final NestedScrollView P0;
    public final LinearLayout Q0;
    public final MaterialCardView R0;
    public final MaterialTextView S0;
    public final LinearLayout T0;
    public final MaterialButton U0;
    public final TextInputEditText V0;
    public final TextInputLayout W0;
    public final Button X0;
    public final Button Y0;
    public final MaterialButtonToggleGroup Z0;
    public final RecyclerView a1;
    public final MaterialButton b1;
    public final Button c1;
    public final MaterialButtonToggleGroup d1;
    public final MaterialTextView e1;
    public final MaterialTextView f1;
    public final MaterialTextView g1;
    public final MaterialTextView h1;
    public final MaterialButton i1;
    public final MaterialTextView j1;
    public final MaterialTextView k1;
    public final MaterialTextView l1;
    public final MaterialTextView m1;
    public final Button n0;
    public final MaterialTextView n1;
    public final Button o0;
    public final MaterialTextView o1;
    public final Button p0;
    public Boolean p1;
    public final Button q0;
    public Boolean q1;
    public final Button r0;
    public Boolean r1;
    public final MaterialButton s0;
    public Tasks s1;
    public final ConstraintLayout t0;
    public Tasks t1;
    public final MaterialCardView u0;
    public Boolean u1;
    public final r14 v0;
    public Boolean v1;
    public final r14 w0;
    public Boolean w1;
    public final ShapeableImageView x0;
    public Leads x1;
    public final ShapeableImageView y0;
    public boolean y1;
    public final View z0;
    public FormFields z1;

    public h3g(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, Button button5, MaterialButton materialButton, ConstraintLayout constraintLayout, MaterialCardView materialCardView, r14 r14Var, r14 r14Var2, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, View view2, View view3, ShapeableImageView shapeableImageView3, MaterialTextView materialTextView, MaterialTextView materialTextView2, ShapeableImageView shapeableImageView4, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, View view4, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, MaterialButton materialButton6, NestedScrollView nestedScrollView, LinearLayout linearLayout, MaterialCardView materialCardView2, MaterialTextView materialTextView3, LinearLayout linearLayout2, MaterialButton materialButton7, TextInputEditText textInputEditText, TextInputLayout textInputLayout, Button button6, Button button7, MaterialButtonToggleGroup materialButtonToggleGroup, RecyclerView recyclerView5, MaterialButton materialButton8, Button button8, MaterialButtonToggleGroup materialButtonToggleGroup2, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialButton materialButton9, MaterialTextView materialTextView8, MaterialTextView materialTextView9, MaterialTextView materialTextView10, MaterialTextView materialTextView11, MaterialTextView materialTextView12, MaterialTextView materialTextView13) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = button4;
        this.r0 = button5;
        this.s0 = materialButton;
        this.t0 = constraintLayout;
        this.u0 = materialCardView;
        this.v0 = r14Var;
        this.w0 = r14Var2;
        this.x0 = shapeableImageView;
        this.y0 = shapeableImageView2;
        this.z0 = view2;
        this.A0 = view3;
        this.B0 = shapeableImageView3;
        this.C0 = materialTextView;
        this.D0 = materialTextView2;
        this.E0 = shapeableImageView4;
        this.F0 = materialButton2;
        this.G0 = materialButton3;
        this.H0 = materialButton4;
        this.I0 = materialButton5;
        this.J0 = view4;
        this.K0 = recyclerView;
        this.L0 = recyclerView2;
        this.M0 = recyclerView3;
        this.N0 = recyclerView4;
        this.O0 = materialButton6;
        this.P0 = nestedScrollView;
        this.Q0 = linearLayout;
        this.R0 = materialCardView2;
        this.S0 = materialTextView3;
        this.T0 = linearLayout2;
        this.U0 = materialButton7;
        this.V0 = textInputEditText;
        this.W0 = textInputLayout;
        this.X0 = button6;
        this.Y0 = button7;
        this.Z0 = materialButtonToggleGroup;
        this.a1 = recyclerView5;
        this.b1 = materialButton8;
        this.c1 = button8;
        this.d1 = materialButtonToggleGroup2;
        this.e1 = materialTextView4;
        this.f1 = materialTextView5;
        this.g1 = materialTextView6;
        this.h1 = materialTextView7;
        this.i1 = materialButton9;
        this.j1 = materialTextView8;
        this.k1 = materialTextView9;
        this.l1 = materialTextView10;
        this.m1 = materialTextView11;
        this.n1 = materialTextView12;
        this.o1 = materialTextView13;
    }

    public static h3g l0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return m0(layoutInflater, viewGroup, z, null);
    }

    public static h3g m0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (h3g) ewi.m25668F(layoutInflater, p9e.standalone_task_update, viewGroup, z, obj);
    }

    public abstract void B0(Boolean bool);

    public FormFields h0() {
        return this.z1;
    }

    public FormFields i0() {
        return this.A1;
    }

    public Tasks j0() {
        return this.t1;
    }

    public Boolean k0() {
        return this.p1;
    }

    public abstract void n0(Boolean bool);

    public abstract void p0(Boolean bool);

    public abstract void q0(FormFields formFields);

    public abstract void s0(FormFields formFields);

    public abstract void t0(Boolean bool);

    public abstract void u0(Boolean bool);

    public abstract void v0(Boolean bool);

    public abstract void w0(Leads leads);

    public abstract void x0(Tasks tasks);

    public abstract void y0(boolean z);

    public abstract void z0(Tasks tasks);
}
