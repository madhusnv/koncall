package p001o;

import ai.salesmax.model.PaymentDataInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ume extends ewi {
    public final TextInputEditText A0;
    public final TextInputLayout B0;
    public final View C0;
    public final TextInputEditText D0;
    public final MaterialCardView E0;
    public final RecyclerView F0;
    public final RecyclerView G0;
    public final MaterialButtonToggleGroup H0;
    public final MaterialTextView I0;
    public final View J0;
    public final MaterialTextView K0;
    public final MaterialButtonToggleGroup L0;
    public final MaterialTextView M0;
    public final MaterialTextView N0;
    public PaymentDataInfo O0;
    public String P0;
    public Boolean Q0;
    public Boolean R0;
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final Button q0;
    public final Button r0;
    public final Button s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final MaterialButton v0;
    public final TextInputLayout w0;
    public final View x0;
    public final TextInputEditText y0;
    public final TextInputLayout z0;

    public ume(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, Button button5, Button button6, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, TextInputLayout textInputLayout, View view2, TextInputEditText textInputEditText, TextInputLayout textInputLayout2, TextInputEditText textInputEditText2, TextInputLayout textInputLayout3, View view3, TextInputEditText textInputEditText3, MaterialCardView materialCardView, RecyclerView recyclerView, RecyclerView recyclerView2, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView, View view4, MaterialTextView materialTextView2, MaterialButtonToggleGroup materialButtonToggleGroup2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = button4;
        this.r0 = button5;
        this.s0 = button6;
        this.t0 = materialButton;
        this.u0 = materialButton2;
        this.v0 = materialButton3;
        this.w0 = textInputLayout;
        this.x0 = view2;
        this.y0 = textInputEditText;
        this.z0 = textInputLayout2;
        this.A0 = textInputEditText2;
        this.B0 = textInputLayout3;
        this.C0 = view3;
        this.D0 = textInputEditText3;
        this.E0 = materialCardView;
        this.F0 = recyclerView;
        this.G0 = recyclerView2;
        this.H0 = materialButtonToggleGroup;
        this.I0 = materialTextView;
        this.J0 = view4;
        this.K0 = materialTextView2;
        this.L0 = materialButtonToggleGroup2;
        this.M0 = materialTextView3;
        this.N0 = materialTextView4;
    }

    public static ume h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static ume i0(LayoutInflater layoutInflater, Object obj) {
        return (ume) ewi.m25668F(layoutInflater, p9e.request_payment_fragment, null, false, obj);
    }

    public abstract void j0(Boolean bool);

    public abstract void k0(Boolean bool);

    public abstract void l0(PaymentDataInfo paymentDataInfo);
}
