package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class l2h extends ewi {
    public final ShapeableImageView n0;
    public final MaterialTextView o0;
    public final MaterialCardView p0;
    public final RecyclerView q0;
    public final ShimmerFrameLayout r0;
    public boolean s0;
    public String t0;

    public l2h(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialCardView materialCardView, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialTextView;
        this.p0 = materialCardView;
        this.q0 = recyclerView;
        this.r0 = shimmerFrameLayout;
    }

    public static l2h h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static l2h i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (l2h) ewi.m25668F(layoutInflater, p9e.tasks_today_fragment, viewGroup, z, obj);
    }

    public abstract void j0(boolean z);
}
