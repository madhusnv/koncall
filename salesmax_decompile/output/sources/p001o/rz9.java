package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class rz9 extends ewi {
    public final MaterialCardView A0;
    public final MaterialTextView B0;
    public final HorizontalScrollView C0;
    public final LinearLayout D0;
    public final MaterialCardView E0;
    public final MaterialTextView F0;
    public final ChipGroup G0;
    public final RecyclerView H0;
    public final ShimmerFrameLayout I0;
    public final MaterialButton J0;
    public String K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public final Chip n0;
    public final Chip o0;
    public final Chip p0;
    public final Chip q0;
    public final Chip r0;
    public final Chip s0;
    public final Chip t0;
    public final Chip u0;
    public final r34 v0;
    public final ShapeableImageView w0;
    public final FloatingActionButton x0;
    public final ShapeableImageView y0;
    public final MaterialTextView z0;

    public rz9(Object obj, View view, int i, Chip chip, Chip chip2, Chip chip3, Chip chip4, Chip chip5, Chip chip6, Chip chip7, Chip chip8, r34 r34Var, ShapeableImageView shapeableImageView, FloatingActionButton floatingActionButton, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, MaterialCardView materialCardView, MaterialTextView materialTextView2, HorizontalScrollView horizontalScrollView, LinearLayout linearLayout, MaterialCardView materialCardView2, MaterialTextView materialTextView3, ChipGroup chipGroup, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, MaterialButton materialButton) {
        super(obj, view, i);
        this.n0 = chip;
        this.o0 = chip2;
        this.p0 = chip3;
        this.q0 = chip4;
        this.r0 = chip5;
        this.s0 = chip6;
        this.t0 = chip7;
        this.u0 = chip8;
        this.v0 = r34Var;
        this.w0 = shapeableImageView;
        this.x0 = floatingActionButton;
        this.y0 = shapeableImageView2;
        this.z0 = materialTextView;
        this.A0 = materialCardView;
        this.B0 = materialTextView2;
        this.C0 = horizontalScrollView;
        this.D0 = linearLayout;
        this.E0 = materialCardView2;
        this.F0 = materialTextView3;
        this.G0 = chipGroup;
        this.H0 = recyclerView;
        this.I0 = shimmerFrameLayout;
        this.J0 = materialButton;
    }

    public static rz9 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return k0(layoutInflater, viewGroup, z, null);
    }

    public static rz9 k0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (rz9) ewi.m25668F(layoutInflater, p9e.leads_attention_fragment, viewGroup, z, obj);
    }

    public String h0() {
        return this.K0;
    }

    public boolean i0() {
        return this.N0;
    }

    public abstract void l0(String str);

    public abstract void m0(boolean z);

    public abstract void n0(boolean z);

    public abstract void p0(boolean z);
}
