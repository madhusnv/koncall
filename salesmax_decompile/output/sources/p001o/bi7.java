package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class bi7 extends ewi {
    public boolean A0;
    public final AppBarLayout n0;
    public final ShapeableImageView o0;
    public final MaterialTextView p0;
    public final LinearLayout q0;
    public final RecyclerView r0;
    public final TextInputEditText s0;
    public final TextInputLayout t0;
    public final ShimmerFrameLayout u0;
    public final Toolbar v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    public bi7(Object obj, View view, int i, AppBarLayout appBarLayout, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, LinearLayout linearLayout, RecyclerView recyclerView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, ShimmerFrameLayout shimmerFrameLayout, Toolbar toolbar) {
        super(obj, view, i);
        this.n0 = appBarLayout;
        this.o0 = shapeableImageView;
        this.p0 = materialTextView;
        this.q0 = linearLayout;
        this.r0 = recyclerView;
        this.s0 = textInputEditText;
        this.t0 = textInputLayout;
        this.u0 = shimmerFrameLayout;
        this.v0 = toolbar;
    }

    public static bi7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static bi7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (bi7) ewi.m25668F(layoutInflater, p9e.fragment_select_contact, viewGroup, z, obj);
    }

    public abstract void j0(boolean z);
}
