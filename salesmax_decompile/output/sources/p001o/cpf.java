package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class cpf extends ewi {
    public boolean A0;
    public final l44 n0;
    public final HorizontalScrollView o0;
    public final RecyclerView p0;
    public final MaterialTextView q0;
    public final ShimmerFrameLayout r0;
    public final ShapeableImageView s0;
    public final Chip t0;
    public final Chip u0;
    public final Chip v0;
    public final ChipGroup w0;
    public final ShapeableImageView x0;
    public final TextInputLayout y0;
    public final TextInputEditText z0;

    public cpf(Object obj, View view, int i, l44 l44Var, HorizontalScrollView horizontalScrollView, RecyclerView recyclerView, MaterialTextView materialTextView, ShimmerFrameLayout shimmerFrameLayout, ShapeableImageView shapeableImageView, Chip chip, Chip chip2, Chip chip3, ChipGroup chipGroup, ShapeableImageView shapeableImageView2, TextInputLayout textInputLayout, TextInputEditText textInputEditText) {
        super(obj, view, i);
        this.n0 = l44Var;
        this.o0 = horizontalScrollView;
        this.p0 = recyclerView;
        this.q0 = materialTextView;
        this.r0 = shimmerFrameLayout;
        this.s0 = shapeableImageView;
        this.t0 = chip;
        this.u0 = chip2;
        this.v0 = chip3;
        this.w0 = chipGroup;
        this.x0 = shapeableImageView2;
        this.y0 = textInputLayout;
        this.z0 = textInputEditText;
    }

    public static cpf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static cpf i0(LayoutInflater layoutInflater, Object obj) {
        return (cpf) ewi.m25668F(layoutInflater, p9e.sheet_templates, null, false, obj);
    }

    public abstract void j0(boolean z);
}
