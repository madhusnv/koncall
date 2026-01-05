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
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class p1e extends ewi {
    public final FloatingActionButton A0;
    public final ShapeableImageView B0;
    public final FrameLayout C0;
    public final MaterialTextView D0;
    public final ConstraintLayout E0;
    public final MaterialTextView F0;
    public final ShapeableImageView G0;
    public final TextView H0;
    public final LinearLayout I0;
    public final ChipGroup J0;
    public final HorizontalScrollView K0;
    public final RecyclerView L0;
    public final TextInputEditText M0;
    public final TextInputLayout N0;
    public final MaterialButton O0;
    public final ShimmerFrameLayout P0;
    public final SwipeRefreshLayout Q0;
    public String R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
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
    public final p34 x0;
    public final MaterialButton y0;
    public final ShapeableImageView z0;

    public p1e(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, Chip chip, Chip chip2, Chip chip3, Chip chip4, Chip chip5, Chip chip6, MaterialButton materialButton3, r34 r34Var, p34 p34Var, MaterialButton materialButton4, ShapeableImageView shapeableImageView, FloatingActionButton floatingActionButton, ShapeableImageView shapeableImageView2, FrameLayout frameLayout, MaterialTextView materialTextView, ConstraintLayout constraintLayout, MaterialTextView materialTextView2, ShapeableImageView shapeableImageView3, TextView textView, LinearLayout linearLayout, ChipGroup chipGroup, HorizontalScrollView horizontalScrollView, RecyclerView recyclerView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialButton materialButton5, ShimmerFrameLayout shimmerFrameLayout, SwipeRefreshLayout swipeRefreshLayout) {
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
        this.x0 = p34Var;
        this.y0 = materialButton4;
        this.z0 = shapeableImageView;
        this.A0 = floatingActionButton;
        this.B0 = shapeableImageView2;
        this.C0 = frameLayout;
        this.D0 = materialTextView;
        this.E0 = constraintLayout;
        this.F0 = materialTextView2;
        this.G0 = shapeableImageView3;
        this.H0 = textView;
        this.I0 = linearLayout;
        this.J0 = chipGroup;
        this.K0 = horizontalScrollView;
        this.L0 = recyclerView;
        this.M0 = textInputEditText;
        this.N0 = textInputLayout;
        this.O0 = materialButton5;
        this.P0 = shimmerFrameLayout;
        this.Q0 = swipeRefreshLayout;
    }

    public static p1e j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return k0(layoutInflater, viewGroup, z, null);
    }

    public static p1e k0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (p1e) ewi.m25668F(layoutInflater, p9e.prospecting_leads_fragment, viewGroup, z, obj);
    }

    public String h0() {
        return this.R0;
    }

    public boolean i0() {
        return this.V0;
    }

    public abstract void l0(String str);

    public abstract void m0(boolean z);

    public abstract void n0(boolean z);

    public abstract void p0(boolean z);

    public abstract void q0(boolean z);
}
