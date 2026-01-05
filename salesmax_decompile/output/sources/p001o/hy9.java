package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class hy9 extends ewi {
    public final MaterialButtonToggleGroup A0;
    public boolean B0;
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final Chip q0;
    public final Chip r0;
    public final Chip s0;
    public final Chip t0;
    public final ShapeableImageView u0;
    public final MaterialTextView v0;
    public final MaterialCardView w0;
    public final ConstraintLayout x0;
    public final RecyclerView y0;
    public final ShimmerFrameLayout z0;

    public hy9(Object obj, View view, int i, Button button, Button button2, Button button3, Chip chip, Chip chip2, Chip chip3, Chip chip4, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialCardView materialCardView, ConstraintLayout constraintLayout, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, MaterialButtonToggleGroup materialButtonToggleGroup) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = chip;
        this.r0 = chip2;
        this.s0 = chip3;
        this.t0 = chip4;
        this.u0 = shapeableImageView;
        this.v0 = materialTextView;
        this.w0 = materialCardView;
        this.x0 = constraintLayout;
        this.y0 = recyclerView;
        this.z0 = shimmerFrameLayout;
        this.A0 = materialButtonToggleGroup;
    }

    public static hy9 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static hy9 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (hy9) ewi.m25668F(layoutInflater, p9e.leaderboard_fragment, viewGroup, z, obj);
    }
}
