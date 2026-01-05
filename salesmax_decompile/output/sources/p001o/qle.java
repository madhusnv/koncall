package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class qle extends ewi {
    public final RecyclerView n0;
    public final LinearLayout o0;
    public final View p0;
    public final ShimmerFrameLayout q0;
    public final MaterialTextView r0;
    public final MaterialTextView s0;
    public final MaterialTextView t0;

    public qle(Object obj, View view, int i, RecyclerView recyclerView, LinearLayout linearLayout, View view2, ShimmerFrameLayout shimmerFrameLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        super(obj, view, i);
        this.n0 = recyclerView;
        this.o0 = linearLayout;
        this.p0 = view2;
        this.q0 = shimmerFrameLayout;
        this.r0 = materialTextView;
        this.s0 = materialTextView2;
        this.t0 = materialTextView3;
    }

    public static qle h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static qle i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qle) ewi.m25668F(layoutInflater, p9e.reportees_fragment, viewGroup, z, obj);
    }
}
