package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class uka extends ewi {
    public final ShapeableImageView n0;
    public final ShapeableImageView o0;
    public final MaterialTextView p0;
    public final MaterialTextView q0;
    public final MaterialTextView r0;
    public final MaterialButton s0;
    public final MaterialButton t0;

    public uka(Object obj, View view, int i, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialButton materialButton, MaterialButton materialButton2) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = shapeableImageView2;
        this.p0 = materialTextView;
        this.q0 = materialTextView2;
        this.r0 = materialTextView3;
        this.s0 = materialButton;
        this.t0 = materialButton2;
    }

    public static uka h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static uka i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (uka) ewi.m25668F(layoutInflater, p9e.login_or_signup_fragment, viewGroup, z, obj);
    }
}
