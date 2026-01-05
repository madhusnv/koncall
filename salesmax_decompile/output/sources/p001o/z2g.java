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
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class z2g extends ewi {
    public final ChipGroup A0;
    public final MaterialCardView B0;
    public final r14 C0;
    public final r14 D0;
    public final ShapeableImageView E0;
    public final Chip F0;
    public final Chip G0;
    public final ShapeableImageView H0;
    public final View I0;
    public final View J0;
    public final LinearLayout K0;
    public final ShapeableImageView L0;
    public final MaterialTextView M0;
    public final MaterialTextView N0;
    public final ShapeableImageView O0;
    public final MaterialButton P0;
    public final MaterialButton Q0;
    public final MaterialButton R0;
    public final MaterialButton S0;
    public final RecyclerView T0;
    public final RecyclerView U0;
    public final RecyclerView V0;
    public final NestedScrollView W0;
    public final LinearLayout X0;
    public final MaterialCardView Y0;
    public final MaterialTextView Z0;
    public final TextInputEditText a1;
    public final TextInputLayout b1;
    public final MaterialButtonToggleGroup c1;
    public final MaterialTextView d1;
    public final MaterialTextView e1;
    public final MaterialTextView f1;
    public final MaterialTextView g1;
    public final MaterialTextView h1;
    public final MaterialButton i1;
    public final MaterialTextView j1;
    public final MaterialTextView k1;
    public final MaterialButton l1;
    public final MaterialButton m1;
    public final Button n0;
    public final MaterialTextView n1;
    public final Button o0;
    public final MaterialTextView o1;
    public final Button p0;
    public Tasks p1;
    public final Button q0;
    public Leads q1;
    public final Button r0;
    public boolean r1;
    public final LinearLayout s0;
    public boolean s1;
    public final Chip t0;
    public boolean t1;
    public final Chip u0;
    public FormFields u1;
    public final Chip v0;
    public FormFields v1;
    public final MaterialButton w0;
    public boolean w1;
    public final ConstraintLayout x0;
    public boolean x1;
    public final Chip y0;
    public Integer y1;
    public final Chip z0;
    public ck6 z1;

    public z2g(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, Button button5, LinearLayout linearLayout, Chip chip, Chip chip2, Chip chip3, MaterialButton materialButton, ConstraintLayout constraintLayout, Chip chip4, Chip chip5, ChipGroup chipGroup, MaterialCardView materialCardView, r14 r14Var, r14 r14Var2, ShapeableImageView shapeableImageView, Chip chip6, Chip chip7, ShapeableImageView shapeableImageView2, View view2, View view3, LinearLayout linearLayout2, ShapeableImageView shapeableImageView3, MaterialTextView materialTextView, MaterialTextView materialTextView2, ShapeableImageView shapeableImageView4, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, NestedScrollView nestedScrollView, LinearLayout linearLayout3, MaterialCardView materialCardView2, MaterialTextView materialTextView3, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialTextView materialTextView8, MaterialButton materialButton6, MaterialTextView materialTextView9, MaterialTextView materialTextView10, MaterialButton materialButton7, MaterialButton materialButton8, MaterialTextView materialTextView11, MaterialTextView materialTextView12) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = button4;
        this.r0 = button5;
        this.s0 = linearLayout;
        this.t0 = chip;
        this.u0 = chip2;
        this.v0 = chip3;
        this.w0 = materialButton;
        this.x0 = constraintLayout;
        this.y0 = chip4;
        this.z0 = chip5;
        this.A0 = chipGroup;
        this.B0 = materialCardView;
        this.C0 = r14Var;
        this.D0 = r14Var2;
        this.E0 = shapeableImageView;
        this.F0 = chip6;
        this.G0 = chip7;
        this.H0 = shapeableImageView2;
        this.I0 = view2;
        this.J0 = view3;
        this.K0 = linearLayout2;
        this.L0 = shapeableImageView3;
        this.M0 = materialTextView;
        this.N0 = materialTextView2;
        this.O0 = shapeableImageView4;
        this.P0 = materialButton2;
        this.Q0 = materialButton3;
        this.R0 = materialButton4;
        this.S0 = materialButton5;
        this.T0 = recyclerView;
        this.U0 = recyclerView2;
        this.V0 = recyclerView3;
        this.W0 = nestedScrollView;
        this.X0 = linearLayout3;
        this.Y0 = materialCardView2;
        this.Z0 = materialTextView3;
        this.a1 = textInputEditText;
        this.b1 = textInputLayout;
        this.c1 = materialButtonToggleGroup;
        this.d1 = materialTextView4;
        this.e1 = materialTextView5;
        this.f1 = materialTextView6;
        this.g1 = materialTextView7;
        this.h1 = materialTextView8;
        this.i1 = materialButton6;
        this.j1 = materialTextView9;
        this.k1 = materialTextView10;
        this.l1 = materialButton7;
        this.m1 = materialButton8;
        this.n1 = materialTextView11;
        this.o1 = materialTextView12;
    }

    public static z2g n0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return p0(layoutInflater, viewGroup, z, null);
    }

    public static z2g p0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (z2g) ewi.m25668F(layoutInflater, p9e.standalone_call_outcome, viewGroup, z, obj);
    }

    public boolean h0() {
        return this.r1;
    }

    public FormFields i0() {
        return this.u1;
    }

    public FormFields j0() {
        return this.v1;
    }

    public boolean k0() {
        return this.s1;
    }

    public boolean l0() {
        return this.t1;
    }

    public boolean m0() {
        return this.x1;
    }

    public abstract void q0(boolean z);

    public abstract void s0(FormFields formFields);

    public abstract void t0(FormFields formFields);

    public abstract void u0(boolean z);

    public abstract void v0(boolean z);

    public abstract void w0(Leads leads);

    public abstract void x0(Tasks tasks);

    public abstract void y0(boolean z);
}
