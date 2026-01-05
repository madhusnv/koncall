package p001o;

import ai.salesmax.model.Leads;
import ai.salesmax.model.Tasks;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class t8d extends ewi {
    public final MaterialTextView A0;
    public final MaterialTextView B0;
    public final ShapeableImageView C0;
    public final Chip D0;
    public final Chip E0;
    public final MaterialCardView F0;
    public final MaterialTextView G0;
    public final MaterialTextView H0;
    public final LinearProgressIndicator I0;
    public final p44 J0;
    public final View K0;
    public final MaterialCardView L0;
    public final MaterialTextView M0;
    public final MaterialTextView N0;
    public final MaterialTextView O0;
    public final MaterialTextView P0;
    public final MaterialTextView Q0;
    public final MaterialTextView R0;
    public Leads S0;
    public Tasks T0;
    public String U0;
    public Integer V0;
    public ck6 W0;
    public final LinearLayout n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final MaterialButton q0;
    public final MaterialButton r0;
    public final MaterialTextView s0;
    public final ShapeableImageView t0;
    public final LinearLayout u0;
    public final t14 v0;
    public final MaterialCardView w0;
    public final MaterialTextView x0;
    public final ShapeableImageView y0;
    public final ConstraintLayout z0;

    public t8d(Object obj, View view, int i, LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialTextView materialTextView, ShapeableImageView shapeableImageView, LinearLayout linearLayout2, t14 t14Var, MaterialCardView materialCardView, MaterialTextView materialTextView2, ShapeableImageView shapeableImageView2, ConstraintLayout constraintLayout, MaterialTextView materialTextView3, MaterialTextView materialTextView4, ShapeableImageView shapeableImageView3, Chip chip, Chip chip2, MaterialCardView materialCardView2, MaterialTextView materialTextView5, MaterialTextView materialTextView6, LinearProgressIndicator linearProgressIndicator, p44 p44Var, View view2, MaterialCardView materialCardView3, MaterialTextView materialTextView7, MaterialTextView materialTextView8, MaterialTextView materialTextView9, MaterialTextView materialTextView10, MaterialTextView materialTextView11, MaterialTextView materialTextView12) {
        super(obj, view, i);
        this.n0 = linearLayout;
        this.o0 = materialButton;
        this.p0 = materialButton2;
        this.q0 = materialButton3;
        this.r0 = materialButton4;
        this.s0 = materialTextView;
        this.t0 = shapeableImageView;
        this.u0 = linearLayout2;
        this.v0 = t14Var;
        this.w0 = materialCardView;
        this.x0 = materialTextView2;
        this.y0 = shapeableImageView2;
        this.z0 = constraintLayout;
        this.A0 = materialTextView3;
        this.B0 = materialTextView4;
        this.C0 = shapeableImageView3;
        this.D0 = chip;
        this.E0 = chip2;
        this.F0 = materialCardView2;
        this.G0 = materialTextView5;
        this.H0 = materialTextView6;
        this.I0 = linearProgressIndicator;
        this.J0 = p44Var;
        this.K0 = view2;
        this.L0 = materialCardView3;
        this.M0 = materialTextView7;
        this.N0 = materialTextView8;
        this.O0 = materialTextView9;
        this.P0 = materialTextView10;
        this.Q0 = materialTextView11;
        this.R0 = materialTextView12;
    }

    public static t8d h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static t8d i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (t8d) ewi.m25668F(layoutInflater, p9e.placing_auto_call, viewGroup, z, obj);
    }

    public abstract void j0(String str);

    public abstract void k0(Leads leads);

    public abstract void l0(Tasks tasks);
}
