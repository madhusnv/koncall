package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class in8 extends ewi {
    public final MaterialTextView n0;
    public final FrameLayout o0;
    public final RecyclerView p0;
    public final ShapeableImageView q0;
    public final MaterialCardView r0;

    public in8(Object obj, View view, int i, MaterialTextView materialTextView, FrameLayout frameLayout, RecyclerView recyclerView, ShapeableImageView shapeableImageView, MaterialCardView materialCardView) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = frameLayout;
        this.p0 = recyclerView;
        this.q0 = shapeableImageView;
        this.r0 = materialCardView;
    }

    public static in8 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static in8 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (in8) ewi.m25668F(layoutInflater, p9e.integrations_fragment, viewGroup, z, obj);
    }
}
