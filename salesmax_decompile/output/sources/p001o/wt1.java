package p001o;

import ai.salesmax.model.Tasks;
import ai.salesmax.view.MentionAutoCompleteTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class wt1 extends ewi {
    public final LinearLayout A0;
    public final MentionAutoCompleteTextView B0;
    public final TextInputLayout C0;
    public final RecyclerView D0;
    public final MaterialTextView E0;
    public final MaterialTextView F0;
    public final MaterialButton G0;
    public final ConstraintLayout H0;
    public final View I0;
    public final Chip J0;
    public final MaterialTextView K0;
    public final ShimmerFrameLayout L0;
    public final MaterialCardView M0;
    public final MaterialTextView N0;
    public final MaterialTextView O0;
    public final MaterialTextView P0;
    public Tasks Q0;
    public Integer R0;
    public ck6 S0;
    public final ShapeableImageView n0;
    public final ConstraintLayout o0;
    public final MaterialButton p0;
    public final t14 q0;
    public final ShapeableImageView r0;
    public final Chip s0;
    public final MaterialTextView t0;
    public final MaterialTextView u0;
    public final ShapeableImageView v0;
    public final MaterialTextView w0;
    public final ShapeableImageView x0;
    public final MaterialTextView y0;
    public final PlayerView z0;

    public wt1(Object obj, View view, int i, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout, MaterialButton materialButton, t14 t14Var, ShapeableImageView shapeableImageView2, Chip chip, MaterialTextView materialTextView, MaterialTextView materialTextView2, ShapeableImageView shapeableImageView3, MaterialTextView materialTextView3, ShapeableImageView shapeableImageView4, MaterialTextView materialTextView4, PlayerView playerView, LinearLayout linearLayout, MentionAutoCompleteTextView mentionAutoCompleteTextView, TextInputLayout textInputLayout, RecyclerView recyclerView, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialButton materialButton2, ConstraintLayout constraintLayout2, View view2, Chip chip2, MaterialTextView materialTextView7, ShimmerFrameLayout shimmerFrameLayout, MaterialCardView materialCardView, MaterialTextView materialTextView8, MaterialTextView materialTextView9, MaterialTextView materialTextView10) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = constraintLayout;
        this.p0 = materialButton;
        this.q0 = t14Var;
        this.r0 = shapeableImageView2;
        this.s0 = chip;
        this.t0 = materialTextView;
        this.u0 = materialTextView2;
        this.v0 = shapeableImageView3;
        this.w0 = materialTextView3;
        this.x0 = shapeableImageView4;
        this.y0 = materialTextView4;
        this.z0 = playerView;
        this.A0 = linearLayout;
        this.B0 = mentionAutoCompleteTextView;
        this.C0 = textInputLayout;
        this.D0 = recyclerView;
        this.E0 = materialTextView5;
        this.F0 = materialTextView6;
        this.G0 = materialButton2;
        this.H0 = constraintLayout2;
        this.I0 = view2;
        this.J0 = chip2;
        this.K0 = materialTextView7;
        this.L0 = shimmerFrameLayout;
        this.M0 = materialCardView;
        this.N0 = materialTextView8;
        this.O0 = materialTextView9;
        this.P0 = materialTextView10;
    }

    public static wt1 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static wt1 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (wt1) ewi.m25668F(layoutInflater, p9e.call_details_fragment, viewGroup, z, obj);
    }

    public Tasks h0() {
        return this.Q0;
    }

    public abstract void k0(Tasks tasks);
}
