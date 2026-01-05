package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;

/* loaded from: classes.dex */
public abstract class tg7 extends ewi {
    public final RecyclerView n0;
    public final ShimmerFrameLayout o0;

    public tg7(Object obj, View view, int i, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.n0 = recyclerView;
        this.o0 = shimmerFrameLayout;
    }

    public static tg7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static tg7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (tg7) ewi.m25668F(layoutInflater, p9e.fragment_file_share_detail, viewGroup, z, obj);
    }
}
