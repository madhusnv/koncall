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
public abstract class vv1 extends ewi {
    public final RecyclerView n0;
    public final FloatingActionButton o0;
    public final ShapeableImageView p0;
    public final MaterialCardView q0;
    public final ShimmerFrameLayout r0;

    public vv1(Object obj, View view, int i, RecyclerView recyclerView, FloatingActionButton floatingActionButton, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.n0 = recyclerView;
        this.o0 = floatingActionButton;
        this.p0 = shapeableImageView;
        this.q0 = materialCardView;
        this.r0 = shimmerFrameLayout;
    }

    public static vv1 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static vv1 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (vv1) ewi.m25668F(layoutInflater, p9e.call_outcome_definition_fragment, viewGroup, z, obj);
    }
}
