package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;

/* loaded from: classes.dex */
public abstract class odh extends ewi {
    public final RecyclerView n0;
    public final ShimmerFrameLayout o0;

    public odh(Object obj, View view, int i, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.n0 = recyclerView;
        this.o0 = shimmerFrameLayout;
    }

    public static odh h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static odh i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (odh) ewi.m25668F(layoutInflater, p9e.teams_fragment, viewGroup, z, obj);
    }
}
