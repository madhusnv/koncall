package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class hnf extends ewi {
    public final ShapeableImageView n0;
    public final t34 o0;
    public final RecyclerView p0;
    public final ShimmerFrameLayout q0;
    public final MaterialTextView r0;
    public boolean s0;

    public hnf(Object obj, View view, int i, ShapeableImageView shapeableImageView, t34 t34Var, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = t34Var;
        this.p0 = recyclerView;
        this.q0 = shimmerFrameLayout;
        this.r0 = materialTextView;
    }

    public static hnf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static hnf i0(LayoutInflater layoutInflater, Object obj) {
        return (hnf) ewi.m25668F(layoutInflater, p9e.sheet_comments, null, false, obj);
    }

    public abstract void j0(boolean z);
}
