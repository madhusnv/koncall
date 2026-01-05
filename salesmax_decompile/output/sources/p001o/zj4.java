package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class zj4 extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final MaterialButton q0;
    public final MaterialButton r0;
    public final MaterialTextView s0;
    public final MaterialButton t0;
    public final ShapeableImageView u0;
    public final MaterialCardView v0;
    public final MaterialButton w0;
    public final MaterialTextView x0;
    public final MaterialButton y0;

    public zj4(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, MaterialTextView materialTextView, MaterialButton materialButton6, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, MaterialButton materialButton7, MaterialTextView materialTextView2, MaterialButton materialButton8) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialButton3;
        this.q0 = materialButton4;
        this.r0 = materialButton5;
        this.s0 = materialTextView;
        this.t0 = materialButton6;
        this.u0 = shapeableImageView;
        this.v0 = materialCardView;
        this.w0 = materialButton7;
        this.x0 = materialTextView2;
        this.y0 = materialButton8;
    }

    public static zj4 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static zj4 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (zj4) ewi.m25668F(layoutInflater, p9e.customize_fragment, viewGroup, z, obj);
    }
}
