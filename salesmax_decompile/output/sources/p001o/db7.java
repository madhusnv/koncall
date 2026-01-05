package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class db7 extends ewi {
    public final ShapeableImageView A0;
    public final ConstraintLayout B0;
    public final MaterialTextView C0;
    public final LinearLayout D0;
    public final ChipGroup E0;
    public final HorizontalScrollView F0;
    public final RecyclerView G0;
    public final MaterialButton H0;
    public final ShimmerFrameLayout I0;
    public final SwipeRefreshLayout J0;
    public final TextInputEditText K0;
    public final TextInputLayout L0;
    public String M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final Chip p0;
    public final Chip q0;
    public final Chip r0;
    public final Chip s0;
    public final Chip t0;
    public final Chip u0;
    public final MaterialButton v0;
    public final r34 w0;
    public final MaterialButton x0;
    public final ShapeableImageView y0;
    public final FloatingActionButton z0;

    public db7(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, Chip chip, Chip chip2, Chip chip3, Chip chip4, Chip chip5, Chip chip6, MaterialButton materialButton3, r34 r34Var, MaterialButton materialButton4, ShapeableImageView shapeableImageView, FloatingActionButton floatingActionButton, ShapeableImageView shapeableImageView2, ConstraintLayout constraintLayout, MaterialTextView materialTextView, LinearLayout linearLayout, ChipGroup chipGroup, HorizontalScrollView horizontalScrollView, RecyclerView recyclerView, MaterialButton materialButton5, ShimmerFrameLayout shimmerFrameLayout, SwipeRefreshLayout swipeRefreshLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = chip;
        this.q0 = chip2;
        this.r0 = chip3;
        this.s0 = chip4;
        this.t0 = chip5;
        this.u0 = chip6;
        this.v0 = materialButton3;
        this.w0 = r34Var;
        this.x0 = materialButton4;
        this.y0 = shapeableImageView;
        this.z0 = floatingActionButton;
        this.A0 = shapeableImageView2;
        this.B0 = constraintLayout;
        this.C0 = materialTextView;
        this.D0 = linearLayout;
        this.E0 = chipGroup;
        this.F0 = horizontalScrollView;
        this.G0 = recyclerView;
        this.H0 = materialButton5;
        this.I0 = shimmerFrameLayout;
        this.J0 = swipeRefreshLayout;
        this.K0 = textInputEditText;
        this.L0 = textInputLayout;
    }

    public static db7 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return k0(layoutInflater, viewGroup, z, null);
    }

    public static db7 k0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (db7) ewi.m25668F(layoutInflater, p9e.followups_fragment, viewGroup, z, obj);
    }

    public String h0() {
        return this.M0;
    }

    public boolean i0() {
        return this.P0;
    }

    public abstract void l0(String str);

    public abstract void m0(boolean z);

    public abstract void n0(boolean z);

    public abstract void p0(boolean z);
}
