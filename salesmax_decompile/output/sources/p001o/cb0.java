package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class cb0 extends ewi {
    public final l44 n0;
    public final MaterialTextView o0;
    public final RecyclerView p0;
    public final RecyclerView q0;
    public final ShimmerFrameLayout r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;

    public cb0(Object obj, View view, int i, l44 l44Var, MaterialTextView materialTextView, RecyclerView recyclerView, RecyclerView recyclerView2, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.n0 = l44Var;
        this.o0 = materialTextView;
        this.p0 = recyclerView;
        this.q0 = recyclerView2;
        this.r0 = shimmerFrameLayout;
    }

    public static cb0 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static cb0 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (cb0) ewi.m25668F(layoutInflater, p9e.all_files_fragment, viewGroup, z, obj);
    }

    public abstract void j0(boolean z);

    public abstract void k0(boolean z);

    public abstract void l0(boolean z);

    public abstract void m0(boolean z);
}
