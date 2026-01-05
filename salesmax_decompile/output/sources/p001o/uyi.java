package p001o;

import ai.salesmax.view.ColorArcProgressBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class uyi extends ewi {
    public final ShapeableImageView n0;
    public final MaterialCardView o0;
    public final ShapeableImageView p0;
    public final MaterialTextView q0;
    public final ColorArcProgressBar r0;
    public final MaterialTextView s0;
    public final TextView t0;
    public final View u0;

    public uyi(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, ColorArcProgressBar colorArcProgressBar, MaterialTextView materialTextView2, TextView textView, View view2) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialCardView;
        this.p0 = shapeableImageView2;
        this.q0 = materialTextView;
        this.r0 = colorArcProgressBar;
        this.s0 = materialTextView2;
        this.t0 = textView;
        this.u0 = view2;
    }

    public static uyi h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static uyi i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (uyi) ewi.m25668F(layoutInflater, p9e.view_progress_card, viewGroup, z, obj);
    }
}
