package p001o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class rpf extends ewi {
    public final n44 n0;
    public final RecyclerView o0;
    public final MaterialTextView p0;
    public final ShimmerFrameLayout q0;
    public final ShapeableImageView r0;
    public final ShapeableImageView s0;
    public final MaterialTextView t0;
    public boolean u0;

    public rpf(Object obj, View view, int i, n44 n44Var, RecyclerView recyclerView, MaterialTextView materialTextView, ShimmerFrameLayout shimmerFrameLayout, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = n44Var;
        this.o0 = recyclerView;
        this.p0 = materialTextView;
        this.q0 = shimmerFrameLayout;
        this.r0 = shapeableImageView;
        this.s0 = shapeableImageView2;
        this.t0 = materialTextView2;
    }
}
