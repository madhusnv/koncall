package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class i3d extends ewi {
    public final MaterialCardView n0;
    public final ShapeableImageView o0;
    public final MaterialButton p0;
    public final MaterialButton q0;
    public final MaterialTextView r0;
    public final MaterialTextView s0;
    public final MaterialTextView t0;

    public i3d(Object obj, View view, int i, MaterialCardView materialCardView, ShapeableImageView shapeableImageView, MaterialButton materialButton, MaterialButton materialButton2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        super(obj, view, i);
        this.n0 = materialCardView;
        this.o0 = shapeableImageView;
        this.p0 = materialButton;
        this.q0 = materialButton2;
        this.r0 = materialTextView;
        this.s0 = materialTextView2;
        this.t0 = materialTextView3;
    }

    public static i3d h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static i3d i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (i3d) ewi.m25668F(layoutInflater, p9e.permission_dialog, viewGroup, z, obj);
    }
}
