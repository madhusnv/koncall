package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class e45 extends ewi {
    public final ConstraintLayout n0;
    public final MaterialButton o0;
    public final MaterialTextView p0;
    public final MaterialButton q0;
    public final MaterialButton r0;
    public final FloatingActionButton s0;
    public final ShapeableImageView t0;
    public final MaterialCardView u0;
    public final ShimmerFrameLayout v0;
    public final RecyclerView w0;

    public e45(Object obj, View view, int i, ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialTextView materialTextView, MaterialButton materialButton2, MaterialButton materialButton3, FloatingActionButton floatingActionButton, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, ShimmerFrameLayout shimmerFrameLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = constraintLayout;
        this.o0 = materialButton;
        this.p0 = materialTextView;
        this.q0 = materialButton2;
        this.r0 = materialButton3;
        this.s0 = floatingActionButton;
        this.t0 = shapeableImageView;
        this.u0 = materialCardView;
        this.v0 = shimmerFrameLayout;
        this.w0 = recyclerView;
    }

    public static e45 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static e45 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (e45) ewi.m25668F(layoutInflater, p9e.deal_stage_defnition_fragment, viewGroup, z, obj);
    }
}
