package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class zg7 extends ewi {
    public final ShapeableImageView n0;
    public final RecyclerView o0;
    public final RecyclerView p0;
    public final RecyclerView q0;
    public final ShapeableImageView r0;
    public final TextInputEditText s0;
    public final TextInputLayout t0;
    public final ShimmerFrameLayout u0;
    public final MaterialTextView v0;
    public final MaterialTextView w0;
    public final MaterialTextView x0;

    public zg7(Object obj, View view, int i, ShapeableImageView shapeableImageView, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, ShapeableImageView shapeableImageView2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, ShimmerFrameLayout shimmerFrameLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = recyclerView;
        this.p0 = recyclerView2;
        this.q0 = recyclerView3;
        this.r0 = shapeableImageView2;
        this.s0 = textInputEditText;
        this.t0 = textInputLayout;
        this.u0 = shimmerFrameLayout;
        this.v0 = materialTextView;
        this.w0 = materialTextView2;
        this.x0 = materialTextView3;
    }

    public static zg7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static zg7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (zg7) ewi.m25668F(layoutInflater, p9e.fragment_handle_incoming_file, viewGroup, z, obj);
    }
}
