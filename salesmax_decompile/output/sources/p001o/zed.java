package p001o;

import ai.salesmax.model.Leads;
import ai.salesmax.model.Tasks;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class zed extends ewi {
    public final MaterialTextView A0;
    public final LinearLayout B0;
    public final Chip C0;
    public final ShapeableImageView D0;
    public final ChipGroup E0;
    public final LinearLayout F0;
    public final LinearLayout G0;
    public final Chip H0;
    public final TextInputEditText I0;
    public final TextInputLayout J0;
    public final Chip K0;
    public final Chip L0;
    public final Chip M0;
    public final Chip N0;
    public final CardView O0;
    public final ShapeableImageView P0;
    public final Chip Q0;
    public final MaterialButton R0;
    public final MaterialCardView S0;
    public final Chip T0;
    public final Chip U0;
    public final View V0;
    public final Chip W0;
    public final Chip X0;
    public final Chip Y0;
    public final Chip Z0;
    public final Chip a1;
    public final MaterialTextView b1;
    public final MaterialTextView c1;
    public final MaterialTextView d1;
    public final MaterialTextView e1;
    public final Chip f1;
    public final View g1;
    public final Chip h1;
    public final Chip i1;
    public Leads j1;
    public Tasks k1;
    public Integer l1;
    public ck6 m1;
    public final Chip n0;
    public final MaterialTextView o0;
    public final MaterialTextView p0;
    public final LinearLayout q0;
    public final LinearLayout r0;
    public final Chip s0;
    public final MaterialTextView t0;
    public final Chip u0;
    public final Chip v0;
    public final Chip w0;
    public final LinearLayout x0;
    public final LinearLayout y0;
    public final LinearLayout z0;

    public zed(Object obj, View view, int i, Chip chip, MaterialTextView materialTextView, MaterialTextView materialTextView2, LinearLayout linearLayout, LinearLayout linearLayout2, Chip chip2, MaterialTextView materialTextView3, Chip chip3, Chip chip4, Chip chip5, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, MaterialTextView materialTextView4, LinearLayout linearLayout6, Chip chip6, ShapeableImageView shapeableImageView, ChipGroup chipGroup, LinearLayout linearLayout7, LinearLayout linearLayout8, Chip chip7, TextInputEditText textInputEditText, TextInputLayout textInputLayout, Chip chip8, Chip chip9, Chip chip10, Chip chip11, CardView cardView, ShapeableImageView shapeableImageView2, Chip chip12, MaterialButton materialButton, MaterialCardView materialCardView, Chip chip13, Chip chip14, View view2, Chip chip15, Chip chip16, Chip chip17, Chip chip18, Chip chip19, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialTextView materialTextView8, Chip chip20, View view3, Chip chip21, Chip chip22) {
        super(obj, view, i);
        this.n0 = chip;
        this.o0 = materialTextView;
        this.p0 = materialTextView2;
        this.q0 = linearLayout;
        this.r0 = linearLayout2;
        this.s0 = chip2;
        this.t0 = materialTextView3;
        this.u0 = chip3;
        this.v0 = chip4;
        this.w0 = chip5;
        this.x0 = linearLayout3;
        this.y0 = linearLayout4;
        this.z0 = linearLayout5;
        this.A0 = materialTextView4;
        this.B0 = linearLayout6;
        this.C0 = chip6;
        this.D0 = shapeableImageView;
        this.E0 = chipGroup;
        this.F0 = linearLayout7;
        this.G0 = linearLayout8;
        this.H0 = chip7;
        this.I0 = textInputEditText;
        this.J0 = textInputLayout;
        this.K0 = chip8;
        this.L0 = chip9;
        this.M0 = chip10;
        this.N0 = chip11;
        this.O0 = cardView;
        this.P0 = shapeableImageView2;
        this.Q0 = chip12;
        this.R0 = materialButton;
        this.S0 = materialCardView;
        this.T0 = chip13;
        this.U0 = chip14;
        this.V0 = view2;
        this.W0 = chip15;
        this.X0 = chip16;
        this.Y0 = chip17;
        this.Z0 = chip18;
        this.a1 = chip19;
        this.b1 = materialTextView5;
        this.c1 = materialTextView6;
        this.d1 = materialTextView7;
        this.e1 = materialTextView8;
        this.f1 = chip20;
        this.g1 = view3;
        this.h1 = chip21;
        this.i1 = chip22;
    }

    public static zed h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static zed i0(LayoutInflater layoutInflater, Object obj) {
        return (zed) ewi.m25668F(layoutInflater, p9e.post_call_activity, null, false, obj);
    }

    public abstract void j0(Tasks tasks);

    public abstract void k0(ck6 ck6Var);

    public abstract void l0(Leads leads);

    public abstract void m0(Integer num);
}
