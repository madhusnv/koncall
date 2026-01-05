package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class iaa extends ewi {
    public final View n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final ShapeableImageView q0;
    public final MaterialTextView r0;
    public final MaterialCardView s0;
    public final RecyclerView t0;
    public final ShimmerFrameLayout u0;
    public boolean v0;

    public iaa(Object obj, View view, int i, View view2, MaterialButton materialButton, MaterialButton materialButton2, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialCardView materialCardView, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout) {
        super(obj, view, i);
        this.n0 = view2;
        this.o0 = materialButton;
        this.p0 = materialButton2;
        this.q0 = shapeableImageView;
        this.r0 = materialTextView;
        this.s0 = materialCardView;
        this.t0 = recyclerView;
        this.u0 = shimmerFrameLayout;
    }

    public static iaa h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static iaa i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (iaa) ewi.m25668F(layoutInflater, p9e.leads_unassigned_fragment, viewGroup, z, obj);
    }
}
