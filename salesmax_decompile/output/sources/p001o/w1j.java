package p001o;

import ai.salesmax.model.Tasks;
import ai.salesmax.view.MentionAutoCompleteTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class w1j extends ewi {
    public final TextInputLayout A0;
    public final RecyclerView B0;
    public final MaterialTextView C0;
    public final MaterialTextView D0;
    public final MaterialButton E0;
    public final ConstraintLayout F0;
    public final View G0;
    public final View H0;
    public final View I0;
    public final MaterialButton J0;
    public final MaterialTextView K0;
    public final ShimmerFrameLayout L0;
    public final MaterialTextView M0;
    public final MaterialTextView N0;
    public final MaterialTextView O0;
    public final ConstraintLayout P0;
    public final RecyclerView Q0;
    public final MaterialButton R0;
    public Tasks S0;
    public Integer T0;
    public ck6 U0;
    public final ShapeableImageView n0;
    public final t14 o0;
    public final ShapeableImageView p0;
    public final MaterialTextView q0;
    public final ShapeableImageView r0;
    public final ShapeableImageView s0;
    public final MaterialCardView t0;
    public final MaterialTextView u0;
    public final MaterialTextView v0;
    public final FrameLayout w0;
    public final LinearLayout x0;
    public final MaterialButton y0;
    public final MentionAutoCompleteTextView z0;

    public w1j(Object obj, View view, int i, ShapeableImageView shapeableImageView, t14 t14Var, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, ShapeableImageView shapeableImageView3, ShapeableImageView shapeableImageView4, MaterialCardView materialCardView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, FrameLayout frameLayout, LinearLayout linearLayout, MaterialButton materialButton, MentionAutoCompleteTextView mentionAutoCompleteTextView, TextInputLayout textInputLayout, RecyclerView recyclerView, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialButton materialButton2, ConstraintLayout constraintLayout, View view2, View view3, View view4, MaterialButton materialButton3, MaterialTextView materialTextView6, ShimmerFrameLayout shimmerFrameLayout, MaterialTextView materialTextView7, MaterialTextView materialTextView8, MaterialTextView materialTextView9, ConstraintLayout constraintLayout2, RecyclerView recyclerView2, MaterialButton materialButton4) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = t14Var;
        this.p0 = shapeableImageView2;
        this.q0 = materialTextView;
        this.r0 = shapeableImageView3;
        this.s0 = shapeableImageView4;
        this.t0 = materialCardView;
        this.u0 = materialTextView2;
        this.v0 = materialTextView3;
        this.w0 = frameLayout;
        this.x0 = linearLayout;
        this.y0 = materialButton;
        this.z0 = mentionAutoCompleteTextView;
        this.A0 = textInputLayout;
        this.B0 = recyclerView;
        this.C0 = materialTextView4;
        this.D0 = materialTextView5;
        this.E0 = materialButton2;
        this.F0 = constraintLayout;
        this.G0 = view2;
        this.H0 = view3;
        this.I0 = view4;
        this.J0 = materialButton3;
        this.K0 = materialTextView6;
        this.L0 = shimmerFrameLayout;
        this.M0 = materialTextView7;
        this.N0 = materialTextView8;
        this.O0 = materialTextView9;
        this.P0 = constraintLayout2;
        this.Q0 = recyclerView2;
        this.R0 = materialButton4;
    }

    public static w1j h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static w1j i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (w1j) ewi.m25668F(layoutInflater, p9e.visit_details_fragment, viewGroup, z, obj);
    }

    public abstract void j0(Tasks tasks);
}
