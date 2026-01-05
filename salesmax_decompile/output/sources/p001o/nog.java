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
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class nog extends ewi {
    public final FrameLayout A0;
    public final p44 B0;
    public final MaterialTextView C0;
    public final FloatingActionButton D0;
    public final FloatingActionButton E0;
    public final LinearLayout F0;
    public final ShimmerFrameLayout G0;
    public final MaterialButton H0;
    public final MentionAutoCompleteTextView I0;
    public final TextInputLayout J0;
    public final RecyclerView K0;
    public final MaterialTextView L0;
    public final Chip M0;
    public final MaterialButton N0;
    public final MaterialButton O0;
    public final MaterialTextView P0;
    public final MaterialTextView Q0;
    public final MaterialTextView R0;
    public final Chip S0;
    public final MaterialButton T0;
    public final ConstraintLayout U0;
    public final ConstraintLayout V0;
    public final View W0;
    public final View X0;
    public final Chip Y0;
    public final MaterialButton Z0;
    public final RecyclerView a1;
    public final MaterialCardView b1;
    public final Chip c1;
    public final Chip d1;
    public final Chip e1;
    public final Chip f1;
    public final MaterialButton g1;
    public final MaterialButton h1;
    public final Chip i1;
    public final Chip j1;
    public final MaterialButton k1;
    public final RecyclerView l1;
    public final MaterialTextView m1;
    public final ShapeableImageView n0;
    public final MaterialTextView n1;
    public final FloatingActionButton o0;
    public final MaterialTextView o1;
    public final ChipGroup p0;
    public final MaterialTextView p1;
    public final FloatingActionButton q0;
    public Tasks q1;
    public final t14 r0;
    public Integer r1;
    public final FloatingActionButton s0;
    public ck6 s1;
    public final ShapeableImageView t0;
    public final FloatingActionButton u0;
    public final ShapeableImageView v0;
    public final FloatingActionButton w0;
    public final LinearLayout x0;
    public final FloatingActionButton y0;
    public final MaterialTextView z0;

    public nog(Object obj, View view, int i, ShapeableImageView shapeableImageView, FloatingActionButton floatingActionButton, ChipGroup chipGroup, FloatingActionButton floatingActionButton2, t14 t14Var, FloatingActionButton floatingActionButton3, ShapeableImageView shapeableImageView2, FloatingActionButton floatingActionButton4, ShapeableImageView shapeableImageView3, FloatingActionButton floatingActionButton5, LinearLayout linearLayout, FloatingActionButton floatingActionButton6, MaterialTextView materialTextView, FrameLayout frameLayout, p44 p44Var, MaterialTextView materialTextView2, FloatingActionButton floatingActionButton7, FloatingActionButton floatingActionButton8, LinearLayout linearLayout2, ShimmerFrameLayout shimmerFrameLayout, MaterialButton materialButton, MentionAutoCompleteTextView mentionAutoCompleteTextView, TextInputLayout textInputLayout, RecyclerView recyclerView, MaterialTextView materialTextView3, Chip chip, MaterialButton materialButton2, MaterialButton materialButton3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, Chip chip2, MaterialButton materialButton4, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view2, View view3, Chip chip3, MaterialButton materialButton5, RecyclerView recyclerView2, MaterialCardView materialCardView, Chip chip4, Chip chip5, Chip chip6, Chip chip7, MaterialButton materialButton6, MaterialButton materialButton7, Chip chip8, Chip chip9, MaterialButton materialButton8, RecyclerView recyclerView3, MaterialTextView materialTextView7, MaterialTextView materialTextView8, MaterialTextView materialTextView9, MaterialTextView materialTextView10) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = floatingActionButton;
        this.p0 = chipGroup;
        this.q0 = floatingActionButton2;
        this.r0 = t14Var;
        this.s0 = floatingActionButton3;
        this.t0 = shapeableImageView2;
        this.u0 = floatingActionButton4;
        this.v0 = shapeableImageView3;
        this.w0 = floatingActionButton5;
        this.x0 = linearLayout;
        this.y0 = floatingActionButton6;
        this.z0 = materialTextView;
        this.A0 = frameLayout;
        this.B0 = p44Var;
        this.C0 = materialTextView2;
        this.D0 = floatingActionButton7;
        this.E0 = floatingActionButton8;
        this.F0 = linearLayout2;
        this.G0 = shimmerFrameLayout;
        this.H0 = materialButton;
        this.I0 = mentionAutoCompleteTextView;
        this.J0 = textInputLayout;
        this.K0 = recyclerView;
        this.L0 = materialTextView3;
        this.M0 = chip;
        this.N0 = materialButton2;
        this.O0 = materialButton3;
        this.P0 = materialTextView4;
        this.Q0 = materialTextView5;
        this.R0 = materialTextView6;
        this.S0 = chip2;
        this.T0 = materialButton4;
        this.U0 = constraintLayout;
        this.V0 = constraintLayout2;
        this.W0 = view2;
        this.X0 = view3;
        this.Y0 = chip3;
        this.Z0 = materialButton5;
        this.a1 = recyclerView2;
        this.b1 = materialCardView;
        this.c1 = chip4;
        this.d1 = chip5;
        this.e1 = chip6;
        this.f1 = chip7;
        this.g1 = materialButton6;
        this.h1 = materialButton7;
        this.i1 = chip8;
        this.j1 = chip9;
        this.k1 = materialButton8;
        this.l1 = recyclerView3;
        this.m1 = materialTextView7;
        this.n1 = materialTextView8;
        this.o1 = materialTextView9;
        this.p1 = materialTextView10;
    }

    public static nog i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static nog j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (nog) ewi.m25668F(layoutInflater, p9e.task_details_fragment, viewGroup, z, obj);
    }

    public Tasks h0() {
        return this.q1;
    }

    public abstract void k0(Tasks tasks);
}
