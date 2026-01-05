package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ni7 extends ewi {
    public final f34 n0;
    public final MaterialTextView o0;
    public final LinearLayout p0;
    public final RecyclerView q0;
    public final ShimmerFrameLayout r0;
    public boolean s0;
    public boolean t0;

    public ni7(Object obj, View view, int i, f34 f34Var, MaterialTextView materialTextView, LinearLayout linearLayout, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.n0 = f34Var;
        this.o0 = materialTextView;
        this.p0 = linearLayout;
        this.q0 = recyclerView;
        this.r0 = shimmerFrameLayout;
    }

    public static ni7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static ni7 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ni7) ewi.m25668F(layoutInflater, p9e.fragment_team_chat_channels, viewGroup, z, obj);
    }

    public boolean h0() {
        return this.s0;
    }

    public abstract void k0(boolean z);

    public abstract void l0(boolean z);
}
