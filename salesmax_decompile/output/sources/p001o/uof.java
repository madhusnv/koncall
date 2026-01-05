package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class uof extends ewi {
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final Button q0;
    public final j34 r0;
    public final RecyclerView s0;
    public final MaterialButtonToggleGroup t0;
    public final TextInputEditText u0;
    public final TextInputLayout v0;
    public final ShimmerFrameLayout w0;
    public final ShapeableImageView x0;
    public boolean y0;

    public uof(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, j34 j34Var, RecyclerView recyclerView, MaterialButtonToggleGroup materialButtonToggleGroup, TextInputEditText textInputEditText, TextInputLayout textInputLayout, ShimmerFrameLayout shimmerFrameLayout, ShapeableImageView shapeableImageView) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = button4;
        this.r0 = j34Var;
        this.s0 = recyclerView;
        this.t0 = materialButtonToggleGroup;
        this.u0 = textInputEditText;
        this.v0 = textInputLayout;
        this.w0 = shimmerFrameLayout;
        this.x0 = shapeableImageView;
    }

    public static uof h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static uof i0(LayoutInflater layoutInflater, Object obj) {
        return (uof) ewi.m25668F(layoutInflater, p9e.sheet_search_chat_window, null, false, obj);
    }
}
