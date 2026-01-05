package p001o;

import ai.salesmax.model.LeadEngagementLevel;
import ai.salesmax.model.Leads;
import ai.salesmax.model.Tasks;
import ai.salesmax.view.ColorArcProgressBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class qcg extends ewi {
    public final MaterialTextView A0;
    public final LinearLayout B0;
    public final MaterialTextView C0;
    public final MaterialCardView D0;
    public final RecyclerView E0;
    public final MaterialTextView F0;
    public final LinearLayout G0;
    public final MaterialTextView H0;
    public final MaterialTextView I0;
    public final MaterialTextView J0;
    public final MaterialTextView K0;
    public final MaterialTextView L0;
    public final MaterialTextView M0;
    public Leads N0;
    public LeadEngagementLevel O0;
    public Tasks P0;
    public Integer Q0;
    public Boolean R0;
    public Boolean S0;
    public ck6 T0;
    public final ColorArcProgressBar n0;
    public final MaterialCardView o0;
    public final MaterialTextView p0;
    public final ShapeableImageView q0;
    public final MaterialCardView r0;
    public final ShapeableImageView s0;
    public final ConstraintLayout t0;
    public final ConstraintLayout u0;
    public final MaterialCardView v0;
    public final View w0;
    public final LinearLayout x0;
    public final MaterialCardView y0;
    public final RecyclerView z0;

    public qcg(Object obj, View view, int i, ColorArcProgressBar colorArcProgressBar, MaterialCardView materialCardView, MaterialTextView materialTextView, ShapeableImageView shapeableImageView, MaterialCardView materialCardView2, ShapeableImageView shapeableImageView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, MaterialCardView materialCardView3, View view2, LinearLayout linearLayout, MaterialCardView materialCardView4, RecyclerView recyclerView, MaterialTextView materialTextView2, LinearLayout linearLayout2, MaterialTextView materialTextView3, MaterialCardView materialCardView5, RecyclerView recyclerView2, MaterialTextView materialTextView4, LinearLayout linearLayout3, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialTextView materialTextView8, MaterialTextView materialTextView9, MaterialTextView materialTextView10) {
        super(obj, view, i);
        this.n0 = colorArcProgressBar;
        this.o0 = materialCardView;
        this.p0 = materialTextView;
        this.q0 = shapeableImageView;
        this.r0 = materialCardView2;
        this.s0 = shapeableImageView2;
        this.t0 = constraintLayout;
        this.u0 = constraintLayout2;
        this.v0 = materialCardView3;
        this.w0 = view2;
        this.x0 = linearLayout;
        this.y0 = materialCardView4;
        this.z0 = recyclerView;
        this.A0 = materialTextView2;
        this.B0 = linearLayout2;
        this.C0 = materialTextView3;
        this.D0 = materialCardView5;
        this.E0 = recyclerView2;
        this.F0 = materialTextView4;
        this.G0 = linearLayout3;
        this.H0 = materialTextView5;
        this.I0 = materialTextView6;
        this.J0 = materialTextView7;
        this.K0 = materialTextView8;
        this.L0 = materialTextView9;
        this.M0 = materialTextView10;
    }

    public static qcg i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static qcg j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qcg) ewi.m25668F(layoutInflater, p9e.summary_fragment, viewGroup, z, obj);
    }

    public Leads h0() {
        return this.N0;
    }

    public abstract void k0(LeadEngagementLevel leadEngagementLevel);

    public abstract void l0(Boolean bool);

    public abstract void m0(Boolean bool);

    public abstract void n0(Leads leads);

    public abstract void p0(Tasks tasks);
}
