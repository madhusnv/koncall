package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;

/* loaded from: classes.dex */
public abstract class eqi extends ewi {
    public final RecyclerView n0;
    public final View o0;
    public final ShimmerFrameLayout p0;

    public eqi(Object obj, View view, int i, RecyclerView recyclerView, View view2, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.n0 = recyclerView;
        this.o0 = view2;
        this.p0 = shimmerFrameLayout;
    }

    public static eqi h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static eqi i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (eqi) ewi.m25668F(layoutInflater, p9e.users_fragment, viewGroup, z, obj);
    }
}
