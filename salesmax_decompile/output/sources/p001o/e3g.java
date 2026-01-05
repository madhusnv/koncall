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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class e3g extends ewi {
    public final MaterialTextView A0;
    public final MaterialTextView B0;
    public final ShapeableImageView C0;
    public final MaterialButton D0;
    public final MaterialButton E0;
    public final MaterialButton F0;
    public final MaterialButton G0;
    public final RecyclerView H0;
    public final RecyclerView I0;
    public final LinearLayout J0;
    public final MaterialCardView K0;
    public final MaterialTextView L0;
    public final TextInputEditText M0;
    public final TextInputLayout N0;
    public final MaterialButtonToggleGroup O0;
    public final MaterialTextView P0;
    public final MaterialTextView Q0;
    public final MaterialTextView R0;
    public final MaterialTextView S0;
    public final MaterialTextView T0;
    public final MaterialButton U0;
    public final MaterialTextView V0;
    public Tasks W0;
    public Leads X0;
    public FormFields Y0;
    public Integer Z0;
    public ck6 a1;
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final Button q0;
    public final Button r0;
    public final MaterialButton s0;
    public final ConstraintLayout t0;
    public final MaterialCardView u0;
    public final r14 v0;
    public final ShapeableImageView w0;
    public final ShapeableImageView x0;
    public final View y0;
    public final ShapeableImageView z0;

    public e3g(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, Button button5, MaterialButton materialButton, ConstraintLayout constraintLayout, MaterialCardView materialCardView, r14 r14Var, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, View view2, ShapeableImageView shapeableImageView3, MaterialTextView materialTextView, MaterialTextView materialTextView2, ShapeableImageView shapeableImageView4, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, RecyclerView recyclerView, RecyclerView recyclerView2, LinearLayout linearLayout, MaterialCardView materialCardView2, MaterialTextView materialTextView3, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialTextView materialTextView8, MaterialButton materialButton6, MaterialTextView materialTextView9) {
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
        this.w0 = shapeableImageView;
        this.x0 = shapeableImageView2;
        this.y0 = view2;
        this.z0 = shapeableImageView3;
        this.A0 = materialTextView;
        this.B0 = materialTextView2;
        this.C0 = shapeableImageView4;
        this.D0 = materialButton2;
        this.E0 = materialButton3;
        this.F0 = materialButton4;
        this.G0 = materialButton5;
        this.H0 = recyclerView;
        this.I0 = recyclerView2;
        this.J0 = linearLayout;
        this.K0 = materialCardView2;
        this.L0 = materialTextView3;
        this.M0 = textInputEditText;
        this.N0 = textInputLayout;
        this.O0 = materialButtonToggleGroup;
        this.P0 = materialTextView4;
        this.Q0 = materialTextView5;
        this.R0 = materialTextView6;
        this.S0 = materialTextView7;
        this.T0 = materialTextView8;
        this.U0 = materialButton6;
        this.V0 = materialTextView9;
    }

    public static e3g i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static e3g j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (e3g) ewi.m25668F(layoutInflater, p9e.standalone_deal_update, viewGroup, z, obj);
    }

    public FormFields h0() {
        return this.Y0;
    }

    public abstract void k0(FormFields formFields);

    public abstract void l0(Leads leads);
}
