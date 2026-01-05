package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class mzi extends ewi {
    public final ShapeableImageView n0;
    public final MaterialCardView o0;
    public final MaterialTextView p0;
    public final ShapeableImageView q0;
    public final MaterialTextView r0;
    public final TextView s0;
    public final View t0;

    public mzi(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, MaterialTextView materialTextView, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView2, TextView textView, View view2) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialCardView;
        this.p0 = materialTextView;
        this.q0 = shapeableImageView2;
        this.r0 = materialTextView2;
        this.s0 = textView;
        this.t0 = view2;
    }

    public static mzi h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static mzi i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (mzi) ewi.m25668F(layoutInflater, p9e.view_task_card, viewGroup, z, obj);
    }
}
