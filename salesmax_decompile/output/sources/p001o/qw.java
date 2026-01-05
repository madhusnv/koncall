package p001o;

import ai.salesmax.model.IntegrationParameters;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class qw extends ewi {
    public final RecyclerView A0;
    public final MaterialTextView B0;
    public final MaterialTextView C0;
    public IntegrationParameters D0;
    public Integer E0;
    public ck6 F0;
    public final TextInputEditText n0;
    public final TextInputLayout o0;
    public final MaterialTextView p0;
    public final MaterialButton q0;
    public final MaterialButton r0;
    public final MaterialButton s0;
    public final TextInputEditText t0;
    public final TextInputLayout u0;
    public final MaterialSwitch v0;
    public final MaterialTextView w0;
    public final MaterialCardView x0;
    public final ConstraintLayout y0;
    public final MaterialButton z0;

    public qw(Object obj, View view, int i, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialTextView materialTextView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, MaterialSwitch materialSwitch, MaterialTextView materialTextView2, MaterialCardView materialCardView, ConstraintLayout constraintLayout, MaterialButton materialButton4, RecyclerView recyclerView, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        super(obj, view, i);
        this.n0 = textInputEditText;
        this.o0 = textInputLayout;
        this.p0 = materialTextView;
        this.q0 = materialButton;
        this.r0 = materialButton2;
        this.s0 = materialButton3;
        this.t0 = textInputEditText2;
        this.u0 = textInputLayout2;
        this.v0 = materialSwitch;
        this.w0 = materialTextView2;
        this.x0 = materialCardView;
        this.y0 = constraintLayout;
        this.z0 = materialButton4;
        this.A0 = recyclerView;
        this.B0 = materialTextView3;
        this.C0 = materialTextView4;
    }

    public static qw h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static qw i0(LayoutInflater layoutInflater, Object obj) {
        return (qw) ewi.m25668F(layoutInflater, p9e.add_indiamart_integration, null, false, obj);
    }

    public abstract void j0(IntegrationParameters integrationParameters);
}
