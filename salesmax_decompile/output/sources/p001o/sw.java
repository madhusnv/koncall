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
public abstract class sw extends ewi {
    public final MaterialTextView A0;
    public final MaterialCardView B0;
    public final MaterialTextView C0;
    public final MaterialTextView D0;
    public final MaterialTextView E0;
    public IntegrationParameters F0;
    public Integer G0;
    public ck6 H0;
    public final HorizontalScrollView n0;
    public final MaterialTextView o0;
    public final MaterialButton p0;
    public final MaterialButton q0;
    public final MaterialButton r0;
    public final MaterialButton s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final TextInputEditText v0;
    public final TextInputLayout w0;
    public final MaterialCardView x0;
    public final ConstraintLayout y0;
    public final MaterialButton z0;

    public sw(Object obj, View view, int i, HorizontalScrollView horizontalScrollView, MaterialTextView materialTextView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, MaterialButton materialButton6, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialCardView materialCardView, ConstraintLayout constraintLayout, MaterialButton materialButton7, MaterialTextView materialTextView2, MaterialCardView materialCardView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5) {
        super(obj, view, i);
        this.n0 = horizontalScrollView;
        this.o0 = materialTextView;
        this.p0 = materialButton;
        this.q0 = materialButton2;
        this.r0 = materialButton3;
        this.s0 = materialButton4;
        this.t0 = materialButton5;
        this.u0 = materialButton6;
        this.v0 = textInputEditText;
        this.w0 = textInputLayout;
        this.x0 = materialCardView;
        this.y0 = constraintLayout;
        this.z0 = materialButton7;
        this.A0 = materialTextView2;
        this.B0 = materialCardView2;
        this.C0 = materialTextView3;
        this.D0 = materialTextView4;
        this.E0 = materialTextView5;
    }

    public static sw h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static sw i0(LayoutInflater layoutInflater, Object obj) {
        return (sw) ewi.m25668F(layoutInflater, p9e.add_justdial_integration, null, false, obj);
    }

    public abstract void j0(IntegrationParameters integrationParameters);
}
