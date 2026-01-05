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
public abstract class hkg extends ewi {
    public final ConstraintLayout n0;
    public final MaterialButton o0;
    public final MaterialTextView p0;
    public final FloatingActionButton q0;
    public final ShapeableImageView r0;
    public final MaterialCardView s0;
    public final ShimmerFrameLayout t0;
    public final RecyclerView u0;

    public hkg(Object obj, View view, int i, ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialTextView materialTextView, FloatingActionButton floatingActionButton, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, ShimmerFrameLayout shimmerFrameLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = constraintLayout;
        this.o0 = materialButton;
        this.p0 = materialTextView;
        this.q0 = floatingActionButton;
        this.r0 = shapeableImageView;
        this.s0 = materialCardView;
        this.t0 = shimmerFrameLayout;
        this.u0 = recyclerView;
    }

    public static hkg h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static hkg i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (hkg) ewi.m25668F(layoutInflater, p9e.task_defnition_fragment, viewGroup, z, obj);
    }
}
