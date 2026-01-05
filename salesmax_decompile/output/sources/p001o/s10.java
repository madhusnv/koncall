package p001o;

import ai.salesmax.model.Product;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class s10 extends ewi {
    public final TextInputEditText A0;
    public final TextInputLayout B0;
    public final TextInputEditText C0;
    public final TextInputLayout D0;
    public final TextInputEditText E0;
    public final TextInputLayout F0;
    public final TextInputLayout G0;
    public final AutoCompleteTextView H0;
    public final MaterialButton I0;
    public final MaterialButton J0;
    public final MaterialTextView K0;
    public Product L0;
    public Integer M0;
    public ck6 N0;
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final MaterialCardView q0;
    public final TextInputEditText r0;
    public final TextInputLayout s0;
    public final AutoCompleteTextView t0;
    public final TextInputLayout u0;
    public final TextInputLayout v0;
    public final AutoCompleteTextView w0;
    public final LinearLayout x0;
    public final TextInputLayout y0;
    public final AutoCompleteTextView z0;

    public s10(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialCardView materialCardView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, AutoCompleteTextView autoCompleteTextView2, LinearLayout linearLayout, TextInputLayout textInputLayout4, AutoCompleteTextView autoCompleteTextView3, TextInputEditText textInputEditText2, TextInputLayout textInputLayout5, TextInputEditText textInputEditText3, TextInputLayout textInputLayout6, TextInputEditText textInputEditText4, TextInputLayout textInputLayout7, TextInputLayout textInputLayout8, AutoCompleteTextView autoCompleteTextView4, MaterialButton materialButton4, MaterialButton materialButton5, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialButton3;
        this.q0 = materialCardView;
        this.r0 = textInputEditText;
        this.s0 = textInputLayout;
        this.t0 = autoCompleteTextView;
        this.u0 = textInputLayout2;
        this.v0 = textInputLayout3;
        this.w0 = autoCompleteTextView2;
        this.x0 = linearLayout;
        this.y0 = textInputLayout4;
        this.z0 = autoCompleteTextView3;
        this.A0 = textInputEditText2;
        this.B0 = textInputLayout5;
        this.C0 = textInputEditText3;
        this.D0 = textInputLayout6;
        this.E0 = textInputEditText4;
        this.F0 = textInputLayout7;
        this.G0 = textInputLayout8;
        this.H0 = autoCompleteTextView4;
        this.I0 = materialButton4;
        this.J0 = materialButton5;
        this.K0 = materialTextView;
    }

    public static s10 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static s10 i0(LayoutInflater layoutInflater, Object obj) {
        return (s10) ewi.m25668F(layoutInflater, p9e.add_product_type, null, false, obj);
    }

    public abstract void j0(Product product);
}
