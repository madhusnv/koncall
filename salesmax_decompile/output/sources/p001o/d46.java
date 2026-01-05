package p001o;

import ai.salesmax.view.ViewAddLead;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hbb20.CountryCodePicker;

/* loaded from: classes.dex */
public abstract class d46 extends ewi {
    public final LinearLayout A0;
    public final TextView B0;
    public final ConstraintLayout C0;
    public final MaterialTextView D0;
    public final TextInputEditText E0;
    public final ViewAddLead F0;
    public final TextInputEditText G0;
    public final TextInputLayout H0;
    public final TextInputEditText I0;
    public final TextInputEditText J0;
    public final TextInputLayout K0;
    public final TextInputEditText L0;
    public final TextInputLayout M0;
    public mii N0;
    public final LinearLayout n0;
    public final LinearLayout o0;
    public final TextInputEditText p0;
    public final TextInputLayout q0;
    public final ShapeableImageView r0;
    public final MaterialButton s0;
    public final MaterialButton t0;
    public final ShapeableImageView u0;
    public final CountryCodePicker v0;
    public final CountryCodePicker w0;
    public final MaterialTextView x0;
    public final ConstraintLayout y0;
    public final MaterialTextView z0;

    public d46(Object obj, View view, int i, LinearLayout linearLayout, LinearLayout linearLayout2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, ShapeableImageView shapeableImageView, MaterialButton materialButton, MaterialButton materialButton2, ShapeableImageView shapeableImageView2, CountryCodePicker countryCodePicker, CountryCodePicker countryCodePicker2, MaterialTextView materialTextView, ConstraintLayout constraintLayout, MaterialTextView materialTextView2, LinearLayout linearLayout3, TextView textView, ConstraintLayout constraintLayout2, MaterialTextView materialTextView3, TextInputEditText textInputEditText2, ViewAddLead viewAddLead, TextInputEditText textInputEditText3, TextInputLayout textInputLayout2, TextInputEditText textInputEditText4, TextInputEditText textInputEditText5, TextInputLayout textInputLayout3, TextInputEditText textInputEditText6, TextInputLayout textInputLayout4) {
        super(obj, view, i);
        this.n0 = linearLayout;
        this.o0 = linearLayout2;
        this.p0 = textInputEditText;
        this.q0 = textInputLayout;
        this.r0 = shapeableImageView;
        this.s0 = materialButton;
        this.t0 = materialButton2;
        this.u0 = shapeableImageView2;
        this.v0 = countryCodePicker;
        this.w0 = countryCodePicker2;
        this.x0 = materialTextView;
        this.y0 = constraintLayout;
        this.z0 = materialTextView2;
        this.A0 = linearLayout3;
        this.B0 = textView;
        this.C0 = constraintLayout2;
        this.D0 = materialTextView3;
        this.E0 = textInputEditText2;
        this.F0 = viewAddLead;
        this.G0 = textInputEditText3;
        this.H0 = textInputLayout2;
        this.I0 = textInputEditText4;
        this.J0 = textInputEditText5;
        this.K0 = textInputLayout3;
        this.L0 = textInputEditText6;
        this.M0 = textInputLayout4;
    }

    public static d46 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static d46 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (d46) ewi.m25668F(layoutInflater, p9e.edit_profile_fragment, viewGroup, z, obj);
    }

    public mii h0() {
        return this.N0;
    }

    public abstract void k0(mii miiVar);
}
