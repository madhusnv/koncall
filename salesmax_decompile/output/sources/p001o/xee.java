package p001o;

import android.view.View;
import android.widget.HorizontalScrollView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class xee extends ewi {
    public final Chip n0;
    public final Chip o0;
    public final ChipGroup p0;
    public final HorizontalScrollView q0;
    public final ShimmerFrameLayout r0;
    public final ShapeableImageView s0;
    public final MaterialTextView t0;

    public xee(Object obj, View view, int i, Chip chip, Chip chip2, ChipGroup chipGroup, HorizontalScrollView horizontalScrollView, ShimmerFrameLayout shimmerFrameLayout, ShapeableImageView shapeableImageView, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = chip;
        this.o0 = chip2;
        this.p0 = chipGroup;
        this.q0 = horizontalScrollView;
        this.r0 = shimmerFrameLayout;
        this.s0 = shapeableImageView;
        this.t0 = materialTextView;
    }
}
