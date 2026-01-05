package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class u8f extends ewi {
    public final MaterialTextView n0;
    public final RecyclerView o0;
    public final ShimmerFrameLayout p0;
    public boolean q0;

    public u8f(Object obj, View view, int i, MaterialTextView materialTextView, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = recyclerView;
        this.p0 = shimmerFrameLayout;
    }

    public static u8f h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static u8f i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (u8f) ewi.m25668F(layoutInflater, p9e.search_activity_fragment, viewGroup, z, obj);
    }
}
