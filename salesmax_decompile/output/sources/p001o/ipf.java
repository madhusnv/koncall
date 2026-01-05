package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class ipf extends ewi {
    public final j34 n0;
    public final MaterialButton o0;
    public final ShapeableImageView p0;
    public final RecyclerView q0;
    public final RecyclerView r0;
    public final RecyclerView s0;
    public final TextInputEditText t0;
    public final TextInputLayout u0;
    public final ShimmerFrameLayout v0;
    public final ShapeableImageView w0;
    public boolean x0;

    public ipf(Object obj, View view, int i, j34 j34Var, MaterialButton materialButton, ShapeableImageView shapeableImageView, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, TextInputEditText textInputEditText, TextInputLayout textInputLayout, ShimmerFrameLayout shimmerFrameLayout, ShapeableImageView shapeableImageView2) {
        super(obj, view, i);
        this.n0 = j34Var;
        this.o0 = materialButton;
        this.p0 = shapeableImageView;
        this.q0 = recyclerView;
        this.r0 = recyclerView2;
        this.s0 = recyclerView3;
        this.t0 = textInputEditText;
        this.u0 = textInputLayout;
        this.v0 = shimmerFrameLayout;
        this.w0 = shapeableImageView2;
    }

    public static ipf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static ipf i0(LayoutInflater layoutInflater, Object obj) {
        return (ipf) ewi.m25668F(layoutInflater, p9e.sheet_uploaded_files, null, false, obj);
    }

    public abstract void j0(boolean z);
}
