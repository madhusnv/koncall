package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class yqb extends ewi {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final n19 n0;
    public final f44 o0;
    public final d44 p0;
    public final h44 q0;
    public final RecyclerView r0;
    public final RecyclerView s0;
    public final RecyclerView t0;
    public final ShimmerFrameLayout u0;
    public final TextInputLayout v0;
    public final AutoCompleteTextView w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    public yqb(Object obj, View view, int i, n19 n19Var, f44 f44Var, d44 d44Var, h44 h44Var, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, ShimmerFrameLayout shimmerFrameLayout, TextInputLayout textInputLayout, AutoCompleteTextView autoCompleteTextView) {
        super(obj, view, i);
        this.n0 = n19Var;
        this.o0 = f44Var;
        this.p0 = d44Var;
        this.q0 = h44Var;
        this.r0 = recyclerView;
        this.s0 = recyclerView2;
        this.t0 = recyclerView3;
        this.u0 = shimmerFrameLayout;
        this.v0 = textInputLayout;
        this.w0 = autoCompleteTextView;
    }

    public static yqb h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static yqb i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (yqb) ewi.m25668F(layoutInflater, p9e.my_tasks_fragment, viewGroup, z, obj);
    }

    public abstract void j0(boolean z);

    public abstract void k0(boolean z);

    public abstract void l0(boolean z);

    public abstract void m0(boolean z);

    public abstract void n0(boolean z);
}
