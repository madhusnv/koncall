package p001o;

import ai.salesmax.model.Tasks;
import ai.salesmax.view.MentionAutoCompleteTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class icb extends ewi {
    public final MaterialTextView A0;
    public final ConstraintLayout B0;
    public final View C0;
    public final View D0;
    public final View E0;
    public final RecyclerView F0;
    public final MaterialTextView G0;
    public final MaterialTextView H0;
    public final ShimmerFrameLayout I0;
    public final RecyclerView J0;
    public final MaterialTextView K0;
    public final MaterialTextView L0;
    public final MaterialTextView M0;
    public Tasks N0;
    public Integer O0;
    public ck6 P0;
    public final ShapeableImageView n0;
    public final ShapeableImageView o0;
    public final ShapeableImageView p0;
    public final MaterialTextView q0;
    public final ShapeableImageView r0;
    public final ConstraintLayout s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final MentionAutoCompleteTextView v0;
    public final TextInputLayout w0;
    public final RecyclerView x0;
    public final MaterialTextView y0;
    public final MaterialTextView z0;

    public icb(Object obj, View view, int i, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, MaterialTextView materialTextView, ShapeableImageView shapeableImageView4, ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MentionAutoCompleteTextView mentionAutoCompleteTextView, TextInputLayout textInputLayout, RecyclerView recyclerView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, ConstraintLayout constraintLayout2, View view2, View view3, View view4, RecyclerView recyclerView2, MaterialTextView materialTextView5, MaterialTextView materialTextView6, ShimmerFrameLayout shimmerFrameLayout, RecyclerView recyclerView3, MaterialTextView materialTextView7, MaterialTextView materialTextView8, MaterialTextView materialTextView9) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = shapeableImageView2;
        this.p0 = shapeableImageView3;
        this.q0 = materialTextView;
        this.r0 = shapeableImageView4;
        this.s0 = constraintLayout;
        this.t0 = materialButton;
        this.u0 = materialButton2;
        this.v0 = mentionAutoCompleteTextView;
        this.w0 = textInputLayout;
        this.x0 = recyclerView;
        this.y0 = materialTextView2;
        this.z0 = materialTextView3;
        this.A0 = materialTextView4;
        this.B0 = constraintLayout2;
        this.C0 = view2;
        this.D0 = view3;
        this.E0 = view4;
        this.F0 = recyclerView2;
        this.G0 = materialTextView5;
        this.H0 = materialTextView6;
        this.I0 = shimmerFrameLayout;
        this.J0 = recyclerView3;
        this.K0 = materialTextView7;
        this.L0 = materialTextView8;
        this.M0 = materialTextView9;
    }

    public static icb h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static icb i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (icb) ewi.m25668F(layoutInflater, p9e.message_details_fragment, viewGroup, z, obj);
    }

    public abstract void j0(Tasks tasks);
}
