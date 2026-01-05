package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class p2d extends ewi {
    public final LinearLayout A0;
    public final HorizontalScrollView B0;
    public final ChipGroup C0;
    public final RecyclerView D0;
    public final ShimmerFrameLayout E0;
    public final SwipeRefreshLayout F0;
    public final MaterialTextView G0;
    public String H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public Boolean L0;
    public final Chip n0;
    public final Chip o0;
    public final Chip p0;
    public final Chip q0;
    public final z34 r0;
    public final ShapeableImageView s0;
    public final ShapeableImageView t0;
    public final FrameLayout u0;
    public final MaterialTextView v0;
    public final ConstraintLayout w0;
    public final MaterialTextView x0;
    public final ShapeableImageView y0;
    public final TextView z0;

    public p2d(Object obj, View view, int i, Chip chip, Chip chip2, Chip chip3, Chip chip4, z34 z34Var, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, FrameLayout frameLayout, MaterialTextView materialTextView, ConstraintLayout constraintLayout, MaterialTextView materialTextView2, ShapeableImageView shapeableImageView3, TextView textView, LinearLayout linearLayout, HorizontalScrollView horizontalScrollView, ChipGroup chipGroup, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, SwipeRefreshLayout swipeRefreshLayout, MaterialTextView materialTextView3) {
        super(obj, view, i);
        this.n0 = chip;
        this.o0 = chip2;
        this.p0 = chip3;
        this.q0 = chip4;
        this.r0 = z34Var;
        this.s0 = shapeableImageView;
        this.t0 = shapeableImageView2;
        this.u0 = frameLayout;
        this.v0 = materialTextView;
        this.w0 = constraintLayout;
        this.x0 = materialTextView2;
        this.y0 = shapeableImageView3;
        this.z0 = textView;
        this.A0 = linearLayout;
        this.B0 = horizontalScrollView;
        this.C0 = chipGroup;
        this.D0 = recyclerView;
        this.E0 = shimmerFrameLayout;
        this.F0 = swipeRefreshLayout;
        this.G0 = materialTextView3;
    }

    public static p2d h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static p2d i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (p2d) ewi.m25668F(layoutInflater, p9e.payment_status_fragment, viewGroup, z, obj);
    }

    public abstract void j0(String str);

    public abstract void k0(boolean z);

    public abstract void l0(boolean z);

    public abstract void m0(boolean z);
}
