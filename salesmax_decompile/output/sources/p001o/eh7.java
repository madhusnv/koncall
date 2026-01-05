package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class eh7 extends ewi {
    public final ShapeableImageView n0;
    public final MaterialTextView o0;
    public final MaterialTextView p0;
    public final MaterialTextView q0;
    public final MaterialTextView r0;

    public eh7(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialTextView;
        this.p0 = materialTextView2;
        this.q0 = materialTextView3;
        this.r0 = materialTextView4;
    }

    public static eh7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static eh7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (eh7) ewi.m25668F(layoutInflater, p9e.fragment_intro_screen_three, viewGroup, z, obj);
    }
}
