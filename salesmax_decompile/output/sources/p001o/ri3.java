package p001o;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ri3 extends ewi {
    public final ShapeableImageView n0;
    public final MaterialTextView o0;
    public final MaterialTextView p0;

    public ri3(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialTextView;
        this.p0 = materialTextView2;
    }

    public static ri3 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static ri3 i0(LayoutInflater layoutInflater, Object obj) {
        return (ri3) ewi.m25668F(layoutInflater, p9e.coming_soon_integration, null, false, obj);
    }
}
