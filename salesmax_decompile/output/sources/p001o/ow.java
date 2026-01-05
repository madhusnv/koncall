package p001o;

import ai.salesmax.model.IntegrationParameters;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.login.widget.LoginButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ow extends ewi {
    public IntegrationParameters A0;
    public Integer B0;
    public ck6 C0;
    public final MaterialButton n0;
    public final MaterialTextView o0;
    public final MaterialButton p0;
    public final MaterialButton q0;
    public final MaterialButton r0;
    public final MaterialSwitch s0;
    public final MaterialTextView t0;
    public final MaterialCardView u0;
    public final ConstraintLayout v0;
    public final LoginButton w0;
    public final RecyclerView x0;
    public final MaterialTextView y0;
    public final MaterialTextView z0;

    public ow(Object obj, View view, int i, MaterialButton materialButton, MaterialTextView materialTextView, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialSwitch materialSwitch, MaterialTextView materialTextView2, MaterialCardView materialCardView, ConstraintLayout constraintLayout, LoginButton loginButton, RecyclerView recyclerView, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialTextView;
        this.p0 = materialButton2;
        this.q0 = materialButton3;
        this.r0 = materialButton4;
        this.s0 = materialSwitch;
        this.t0 = materialTextView2;
        this.u0 = materialCardView;
        this.v0 = constraintLayout;
        this.w0 = loginButton;
        this.x0 = recyclerView;
        this.y0 = materialTextView3;
        this.z0 = materialTextView4;
    }

    public static ow h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static ow i0(LayoutInflater layoutInflater, Object obj) {
        return (ow) ewi.m25668F(layoutInflater, p9e.add_facebook_integration, null, false, obj);
    }
}
