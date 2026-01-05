package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes.dex */
public abstract class h2j extends ewi {
    public final FloatingActionButton n0;
    public final ShapeableImageView o0;
    public final MaterialCardView p0;
    public final ShimmerFrameLayout q0;
    public final RecyclerView r0;

    public h2j(Object obj, View view, int i, FloatingActionButton floatingActionButton, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, ShimmerFrameLayout shimmerFrameLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = floatingActionButton;
        this.o0 = shapeableImageView;
        this.p0 = materialCardView;
        this.q0 = shimmerFrameLayout;
        this.r0 = recyclerView;
    }

    public static h2j h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static h2j i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (h2j) ewi.m25668F(layoutInflater, p9e.visit_outcome_definition_fragment, viewGroup, z, obj);
    }
}
