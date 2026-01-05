package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes.dex */
public abstract class r4c extends ewi {
    public final ShapeableImageView n0;
    public final x34 o0;
    public final LinearLayout p0;
    public final RecyclerView q0;
    public final ShapeableImageView r0;
    public boolean s0;

    public r4c(Object obj, View view, int i, ShapeableImageView shapeableImageView, x34 x34Var, LinearLayout linearLayout, RecyclerView recyclerView, ShapeableImageView shapeableImageView2) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = x34Var;
        this.p0 = linearLayout;
        this.q0 = recyclerView;
        this.r0 = shapeableImageView2;
    }

    public static r4c h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static r4c i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (r4c) ewi.m25668F(layoutInflater, p9e.notifications_fragment, viewGroup, z, obj);
    }

    public abstract void j0(boolean z);
}
