package p001o;

import ai.salesmax.model.IntegrationParameters;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class d50 extends ewi {
    public final MaterialButton A0;
    public final MaterialTextView B0;
    public final MaterialCardView C0;
    public final MaterialTextView D0;
    public final MaterialTextView E0;
    public final MaterialTextView F0;
    public final MaterialCardView G0;
    public final MaterialTextView H0;
    public final MaterialTextView I0;
    public IntegrationParameters J0;
    public Integer K0;
    public ck6 L0;
    public final HorizontalScrollView n0;
    public final MaterialTextView o0;
    public final MaterialButton p0;
    public final MaterialButton q0;
    public final MaterialButton r0;
    public final MaterialButton s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final MaterialButton v0;
    public final TextInputEditText w0;
    public final MaterialCardView x0;
    public final TextInputLayout y0;
    public final ConstraintLayout z0;

    public d50(Object obj, View view, int i, HorizontalScrollView horizontalScrollView, MaterialTextView materialTextView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, MaterialButton materialButton6, MaterialButton materialButton7, TextInputEditText textInputEditText, MaterialCardView materialCardView, TextInputLayout textInputLayout, ConstraintLayout constraintLayout, MaterialButton materialButton8, MaterialTextView materialTextView2, MaterialCardView materialCardView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialCardView materialCardView3, MaterialTextView materialTextView6, MaterialTextView materialTextView7) {
        super(obj, view, i);
        this.n0 = horizontalScrollView;
        this.o0 = materialTextView;
        this.p0 = materialButton;
        this.q0 = materialButton2;
        this.r0 = materialButton3;
        this.s0 = materialButton4;
        this.t0 = materialButton5;
        this.u0 = materialButton6;
        this.v0 = materialButton7;
        this.w0 = textInputEditText;
        this.x0 = materialCardView;
        this.y0 = textInputLayout;
        this.z0 = constraintLayout;
        this.A0 = materialButton8;
        this.B0 = materialTextView2;
        this.C0 = materialCardView2;
        this.D0 = materialTextView3;
        this.E0 = materialTextView4;
        this.F0 = materialTextView5;
        this.G0 = materialCardView3;
        this.H0 = materialTextView6;
        this.I0 = materialTextView7;
    }

    public static d50 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static d50 i0(LayoutInflater layoutInflater, Object obj) {
        return (d50) ewi.m25668F(layoutInflater, p9e.add_webform_standard_integration, null, false, obj);
    }

    public abstract void j0(IntegrationParameters integrationParameters);
}
