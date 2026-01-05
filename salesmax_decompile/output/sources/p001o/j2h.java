package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class j2h extends ewi {
    public boolean A0;
    public boolean B0;
    public final Chip n0;
    public final Chip o0;
    public final Chip p0;
    public final f44 q0;
    public final ShapeableImageView r0;
    public final MaterialTextView s0;
    public final MaterialCardView t0;
    public final RecyclerView u0;
    public final ShimmerFrameLayout v0;
    public final HorizontalScrollView w0;
    public final ChipGroup x0;
    public boolean y0;
    public String z0;

    public j2h(Object obj, View view, int i, Chip chip, Chip chip2, Chip chip3, f44 f44Var, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialCardView materialCardView, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, HorizontalScrollView horizontalScrollView, ChipGroup chipGroup) {
        super(obj, view, i);
        this.n0 = chip;
        this.o0 = chip2;
        this.p0 = chip3;
        this.q0 = f44Var;
        this.r0 = shapeableImageView;
        this.s0 = materialTextView;
        this.t0 = materialCardView;
        this.u0 = recyclerView;
        this.v0 = shimmerFrameLayout;
        this.w0 = horizontalScrollView;
        this.x0 = chipGroup;
    }

    public static j2h h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static j2h i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (j2h) ewi.m25668F(layoutInflater, p9e.tasks_over_due_fragment, viewGroup, z, obj);
    }

    public abstract void j0(boolean z);

    public abstract void k0(boolean z);

    public abstract void l0(boolean z);

    public abstract void m0(String str);
}
