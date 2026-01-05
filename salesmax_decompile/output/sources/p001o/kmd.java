package p001o;

import ai.salesmax.view.ViewProfileData;
import ai.salesmax.view.ViewProfileDataVer2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class kmd extends ewi {
    public final MaterialButton A0;
    public mii B0;
    public ck6 C0;
    public final ViewProfileData n0;
    public final ViewProfileDataVer2 o0;
    public final ConstraintLayout p0;
    public final MaterialTextView q0;
    public final ViewProfileData r0;
    public final MaterialTextView s0;
    public final ViewProfileData t0;
    public final ShapeableImageView u0;
    public final ShapeableImageView v0;
    public final MaterialTextView w0;
    public final MaterialTextView x0;
    public final ShapeableImageView y0;
    public final ViewProfileData z0;

    public kmd(Object obj, View view, int i, ViewProfileData viewProfileData, ViewProfileDataVer2 viewProfileDataVer2, ConstraintLayout constraintLayout, MaterialTextView materialTextView, ViewProfileData viewProfileData2, MaterialTextView materialTextView2, ViewProfileData viewProfileData3, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, ShapeableImageView shapeableImageView3, ViewProfileData viewProfileData4, MaterialButton materialButton) {
        super(obj, view, i);
        this.n0 = viewProfileData;
        this.o0 = viewProfileDataVer2;
        this.p0 = constraintLayout;
        this.q0 = materialTextView;
        this.r0 = viewProfileData2;
        this.s0 = materialTextView2;
        this.t0 = viewProfileData3;
        this.u0 = shapeableImageView;
        this.v0 = shapeableImageView2;
        this.w0 = materialTextView3;
        this.x0 = materialTextView4;
        this.y0 = shapeableImageView3;
        this.z0 = viewProfileData4;
        this.A0 = materialButton;
    }

    public static kmd h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static kmd i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (kmd) ewi.m25668F(layoutInflater, p9e.profile_fragment, viewGroup, z, obj);
    }

    public abstract void j0(mii miiVar);
}
