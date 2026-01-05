package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class mqe extends ewi {
    public final Chip A0;
    public final MaterialTextView B0;
    public final Chip C0;
    public final Chip D0;
    public final Chip E0;
    public final Chip F0;
    public final Chip G0;
    public final MaterialTextView H0;
    public final MaterialTextView I0;
    public final MaterialTextView J0;
    public final Chip K0;
    public final Chip L0;
    public final Chip M0;
    public final Chip N0;
    public boolean O0;
    public final MaterialCardView n0;
    public final ChipGroup o0;
    public final ShapeableImageView p0;
    public final MaterialButton q0;
    public final RecyclerView r0;
    public final TextInputEditText s0;
    public final TextInputLayout t0;
    public final MaterialCardView u0;
    public final ShimmerFrameLayout v0;
    public final Chip w0;
    public final Chip x0;
    public final Chip y0;
    public final Chip z0;

    public mqe(Object obj, View view, int i, MaterialCardView materialCardView, ChipGroup chipGroup, ShapeableImageView shapeableImageView, MaterialButton materialButton, RecyclerView recyclerView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialCardView materialCardView2, ShimmerFrameLayout shimmerFrameLayout, Chip chip, Chip chip2, Chip chip3, Chip chip4, Chip chip5, MaterialTextView materialTextView, Chip chip6, Chip chip7, Chip chip8, Chip chip9, Chip chip10, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, Chip chip11, Chip chip12, Chip chip13, Chip chip14) {
        super(obj, view, i);
        this.n0 = materialCardView;
        this.o0 = chipGroup;
        this.p0 = shapeableImageView;
        this.q0 = materialButton;
        this.r0 = recyclerView;
        this.s0 = textInputEditText;
        this.t0 = textInputLayout;
        this.u0 = materialCardView2;
        this.v0 = shimmerFrameLayout;
        this.w0 = chip;
        this.x0 = chip2;
        this.y0 = chip3;
        this.z0 = chip4;
        this.A0 = chip5;
        this.B0 = materialTextView;
        this.C0 = chip6;
        this.D0 = chip7;
        this.E0 = chip8;
        this.F0 = chip9;
        this.G0 = chip10;
        this.H0 = materialTextView2;
        this.I0 = materialTextView3;
        this.J0 = materialTextView4;
        this.K0 = chip11;
        this.L0 = chip12;
        this.M0 = chip13;
        this.N0 = chip14;
    }

    public static mqe i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static mqe j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (mqe) ewi.m25668F(layoutInflater, p9e.resources_fragment, viewGroup, z, obj);
    }

    public boolean h0() {
        return this.O0;
    }

    public abstract void k0(boolean z);
}
