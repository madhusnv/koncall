package p001o;

import ai.salesmax.model.AutoCallConfig;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class n31 extends ewi {
    public final Button A0;
    public final Button B0;
    public final Button C0;
    public final Button D0;
    public final Button E0;
    public final Button F0;
    public final Button G0;
    public final Button H0;
    public final Button I0;
    public final Button J0;
    public final MaterialButton K0;
    public final MaterialTextView L0;
    public final MaterialCardView M0;
    public final MaterialCardView N0;
    public final MaterialTextView O0;
    public final MaterialCardView P0;
    public final MaterialTextView Q0;
    public final MaterialButtonToggleGroup R0;
    public final MaterialTextView S0;
    public final MaterialTextView T0;
    public final MaterialTextView U0;
    public final MaterialTextView V0;
    public final MaterialTextView W0;
    public final MaterialSwitch X0;
    public final MaterialTextView Y0;
    public final ShapeableImageView Z0;
    public final MaterialSwitch a1;
    public final TextInputEditText b1;
    public final TextInputLayout c1;
    public final MaterialButtonToggleGroup d1;
    public final MaterialButtonToggleGroup e1;
    public final MaterialButtonToggleGroup f1;
    public final MaterialButtonToggleGroup g1;
    public final MaterialTextView h1;
    public final MaterialButton i1;
    public boolean j1;
    public AutoCallConfig k1;
    public Integer l1;
    public ck6 m1;
    public final MaterialCardView n0;
    public final MaterialCardView o0;
    public final MaterialTextView p0;
    public final ConstraintLayout q0;
    public final Button r0;
    public final Button s0;
    public final Button t0;
    public final Button u0;
    public final Button v0;
    public final Button w0;
    public final Button x0;
    public final Button y0;
    public final Button z0;

    public n31(Object obj, View view, int i, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialTextView materialTextView, ConstraintLayout constraintLayout, Button button, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9, Button button10, Button button11, Button button12, Button button13, Button button14, Button button15, Button button16, Button button17, Button button18, Button button19, MaterialButton materialButton, MaterialTextView materialTextView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialTextView materialTextView3, MaterialCardView materialCardView5, MaterialTextView materialTextView4, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialTextView materialTextView8, MaterialTextView materialTextView9, MaterialSwitch materialSwitch, MaterialTextView materialTextView10, ShapeableImageView shapeableImageView, MaterialSwitch materialSwitch2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialButtonToggleGroup materialButtonToggleGroup2, MaterialButtonToggleGroup materialButtonToggleGroup3, MaterialButtonToggleGroup materialButtonToggleGroup4, MaterialButtonToggleGroup materialButtonToggleGroup5, MaterialTextView materialTextView11, MaterialButton materialButton2) {
        super(obj, view, i);
        this.n0 = materialCardView;
        this.o0 = materialCardView2;
        this.p0 = materialTextView;
        this.q0 = constraintLayout;
        this.r0 = button;
        this.s0 = button2;
        this.t0 = button3;
        this.u0 = button4;
        this.v0 = button5;
        this.w0 = button6;
        this.x0 = button7;
        this.y0 = button8;
        this.z0 = button9;
        this.A0 = button10;
        this.B0 = button11;
        this.C0 = button12;
        this.D0 = button13;
        this.E0 = button14;
        this.F0 = button15;
        this.G0 = button16;
        this.H0 = button17;
        this.I0 = button18;
        this.J0 = button19;
        this.K0 = materialButton;
        this.L0 = materialTextView2;
        this.M0 = materialCardView3;
        this.N0 = materialCardView4;
        this.O0 = materialTextView3;
        this.P0 = materialCardView5;
        this.Q0 = materialTextView4;
        this.R0 = materialButtonToggleGroup;
        this.S0 = materialTextView5;
        this.T0 = materialTextView6;
        this.U0 = materialTextView7;
        this.V0 = materialTextView8;
        this.W0 = materialTextView9;
        this.X0 = materialSwitch;
        this.Y0 = materialTextView10;
        this.Z0 = shapeableImageView;
        this.a1 = materialSwitch2;
        this.b1 = textInputEditText;
        this.c1 = textInputLayout;
        this.d1 = materialButtonToggleGroup2;
        this.e1 = materialButtonToggleGroup3;
        this.f1 = materialButtonToggleGroup4;
        this.g1 = materialButtonToggleGroup5;
        this.h1 = materialTextView11;
        this.i1 = materialButton2;
    }

    public static n31 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static n31 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (n31) ewi.m25668F(layoutInflater, p9e.auto_dial_setup, viewGroup, z, obj);
    }

    public boolean h0() {
        return this.j1;
    }

    public abstract void k0(AutoCallConfig autoCallConfig);

    public abstract void l0(boolean z);
}
