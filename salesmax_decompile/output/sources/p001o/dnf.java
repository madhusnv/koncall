package p001o;

import ai.salesmax.model.ActiveProfile;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class dnf extends ewi {
    public final MaterialCardView A0;
    public final MaterialTextView B0;
    public final ShapeableImageView C0;
    public String D0;
    public ActiveProfile E0;
    public final MaterialButton n0;
    public final MaterialCardView o0;
    public final MaterialButton p0;
    public final MaterialTextView q0;
    public final MaterialTextView r0;
    public final MaterialCardView s0;
    public final MaterialButton t0;
    public final MaterialTextView u0;
    public final MaterialTextView v0;
    public final MaterialCardView w0;
    public final MaterialButton x0;
    public final MaterialTextView y0;
    public final MaterialTextView z0;

    public dnf(Object obj, View view, int i, MaterialButton materialButton, MaterialCardView materialCardView, MaterialButton materialButton2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialCardView materialCardView2, MaterialButton materialButton3, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialCardView materialCardView3, MaterialButton materialButton4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialCardView materialCardView4, MaterialTextView materialTextView7, ShapeableImageView shapeableImageView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialCardView;
        this.p0 = materialButton2;
        this.q0 = materialTextView;
        this.r0 = materialTextView2;
        this.s0 = materialCardView2;
        this.t0 = materialButton3;
        this.u0 = materialTextView3;
        this.v0 = materialTextView4;
        this.w0 = materialCardView3;
        this.x0 = materialButton4;
        this.y0 = materialTextView5;
        this.z0 = materialTextView6;
        this.A0 = materialCardView4;
        this.B0 = materialTextView7;
        this.C0 = shapeableImageView;
    }

    public static dnf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static dnf i0(LayoutInflater layoutInflater, Object obj) {
        return (dnf) ewi.m25668F(layoutInflater, p9e.sheet_call_issues, null, false, obj);
    }

    public abstract void j0(ActiveProfile activeProfile);
}
