package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class uqb extends ewi {
    public boolean A0;
    public final n19 n0;
    public final b34 o0;
    public final d34 p0;
    public final h44 q0;
    public final MaterialTextView r0;
    public final LinearLayout s0;
    public final RecyclerView t0;
    public final RecyclerView u0;
    public final ShimmerFrameLayout v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    public uqb(Object obj, View view, int i, n19 n19Var, b34 b34Var, d34 d34Var, h44 h44Var, MaterialTextView materialTextView, LinearLayout linearLayout, RecyclerView recyclerView, RecyclerView recyclerView2, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.n0 = n19Var;
        this.o0 = b34Var;
        this.p0 = d34Var;
        this.q0 = h44Var;
        this.r0 = materialTextView;
        this.s0 = linearLayout;
        this.t0 = recyclerView;
        this.u0 = recyclerView2;
        this.v0 = shimmerFrameLayout;
    }

    public static uqb h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static uqb i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (uqb) ewi.m25668F(layoutInflater, p9e.my_activity_fragment, viewGroup, z, obj);
    }

    public abstract void j0(boolean z);

    public abstract void k0(boolean z);

    public abstract void l0(boolean z);

    public abstract void m0(boolean z);
}
