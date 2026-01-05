package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;

/* loaded from: classes.dex */
public abstract class t4c extends ewi {
    public final MaterialSwitch n0;
    public final MaterialSwitch o0;
    public final MaterialSwitch p0;
    public final MaterialSwitch q0;
    public final MaterialSwitch r0;
    public final MaterialSwitch s0;
    public final ShapeableImageView t0;
    public final MaterialCardView u0;
    public final MaterialSwitch v0;

    public t4c(Object obj, View view, int i, MaterialSwitch materialSwitch, MaterialSwitch materialSwitch2, MaterialSwitch materialSwitch3, MaterialSwitch materialSwitch4, MaterialSwitch materialSwitch5, MaterialSwitch materialSwitch6, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, MaterialSwitch materialSwitch7) {
        super(obj, view, i);
        this.n0 = materialSwitch;
        this.o0 = materialSwitch2;
        this.p0 = materialSwitch3;
        this.q0 = materialSwitch4;
        this.r0 = materialSwitch5;
        this.s0 = materialSwitch6;
        this.t0 = shapeableImageView;
        this.u0 = materialCardView;
        this.v0 = materialSwitch7;
    }

    public static t4c h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static t4c i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (t4c) ewi.m25668F(layoutInflater, p9e.notifications_settings_fragment, viewGroup, z, obj);
    }
}
