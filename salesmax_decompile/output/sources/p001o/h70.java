package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class h70 extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialTextView p0;
    public final MaterialButton q0;
    public final MaterialSwitch r0;
    public final MaterialTextView s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final ShapeableImageView v0;
    public final MaterialCardView w0;
    public final MaterialButton x0;
    public final MaterialTextView y0;
    public boolean z0;

    public h70(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialTextView materialTextView, MaterialButton materialButton3, MaterialSwitch materialSwitch, MaterialTextView materialTextView2, MaterialButton materialButton4, MaterialButton materialButton5, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, MaterialButton materialButton6, MaterialTextView materialTextView3) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialTextView;
        this.q0 = materialButton3;
        this.r0 = materialSwitch;
        this.s0 = materialTextView2;
        this.t0 = materialButton4;
        this.u0 = materialButton5;
        this.v0 = shapeableImageView;
        this.w0 = materialCardView;
        this.x0 = materialButton6;
        this.y0 = materialTextView3;
    }

    public static h70 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static h70 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (h70) ewi.m25668F(layoutInflater, p9e.admin_fragment, viewGroup, z, obj);
    }
}
