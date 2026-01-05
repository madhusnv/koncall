package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class us4 extends ewi {
    public final h34 n0;
    public final MaterialCardView o0;
    public final MaterialTextView p0;
    public final RecyclerView q0;
    public final ShimmerFrameLayout r0;
    public final MaterialButton s0;
    public boolean t0;
    public boolean u0;

    public us4(Object obj, View view, int i, h34 h34Var, MaterialCardView materialCardView, MaterialTextView materialTextView, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, MaterialButton materialButton) {
        super(obj, view, i);
        this.n0 = h34Var;
        this.o0 = materialCardView;
        this.p0 = materialTextView;
        this.q0 = recyclerView;
        this.r0 = shimmerFrameLayout;
        this.s0 = materialButton;
    }

    public static us4 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static us4 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (us4) ewi.m25668F(layoutInflater, p9e.dashboard_deals_fragment, viewGroup, z, obj);
    }

    public abstract void j0(boolean z);

    public abstract void k0(boolean z);
}
