package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hbb20.CountryCodePicker;

/* loaded from: classes.dex */
public abstract class lg9 extends ewi {
    public final MaterialTextView A0;
    public final TextInputEditText B0;
    public final TextInputLayout C0;
    public final TextInputLayout D0;
    public final CountryCodePicker E0;
    public final LinearLayout F0;
    public final TextInputEditText G0;
    public final TextInputEditText H0;
    public final MaterialTextView I0;
    public final MaterialTextView J0;
    public final MaterialButton K0;
    public final MaterialButton L0;
    public final LinearLayout M0;
    public final MaterialButton N0;
    public final MaterialTextView O0;
    public final MaterialTextView P0;
    public final MaterialTextView Q0;
    public String R0;
    public final ShapeableImageView n0;
    public final CountryCodePicker o0;
    public final ShapeableImageView p0;
    public final MaterialTextView q0;
    public final LottieAnimationView r0;
    public final MaterialCardView s0;
    public final TextInputEditText t0;
    public final MaterialCardView u0;
    public final MaterialTextView v0;
    public final MaterialTextView w0;
    public final MaterialTextView x0;
    public final MaterialTextView y0;
    public final MaterialTextView z0;

    public lg9(Object obj, View view, int i, ShapeableImageView shapeableImageView, CountryCodePicker countryCodePicker, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, LottieAnimationView lottieAnimationView, MaterialCardView materialCardView, TextInputEditText textInputEditText, MaterialCardView materialCardView2, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, CountryCodePicker countryCodePicker2, LinearLayout linearLayout, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, MaterialTextView materialTextView8, MaterialTextView materialTextView9, MaterialButton materialButton, MaterialButton materialButton2, LinearLayout linearLayout2, MaterialButton materialButton3, MaterialTextView materialTextView10, MaterialTextView materialTextView11, MaterialTextView materialTextView12) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = countryCodePicker;
        this.p0 = shapeableImageView2;
        this.q0 = materialTextView;
        this.r0 = lottieAnimationView;
        this.s0 = materialCardView;
        this.t0 = textInputEditText;
        this.u0 = materialCardView2;
        this.v0 = materialTextView2;
        this.w0 = materialTextView3;
        this.x0 = materialTextView4;
        this.y0 = materialTextView5;
        this.z0 = materialTextView6;
        this.A0 = materialTextView7;
        this.B0 = textInputEditText2;
        this.C0 = textInputLayout;
        this.D0 = textInputLayout2;
        this.E0 = countryCodePicker2;
        this.F0 = linearLayout;
        this.G0 = textInputEditText3;
        this.H0 = textInputEditText4;
        this.I0 = materialTextView8;
        this.J0 = materialTextView9;
        this.K0 = materialButton;
        this.L0 = materialButton2;
        this.M0 = linearLayout2;
        this.N0 = materialButton3;
        this.O0 = materialTextView10;
        this.P0 = materialTextView11;
        this.Q0 = materialTextView12;
    }

    public static lg9 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static lg9 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (lg9) ewi.m25668F(layoutInflater, p9e.landing_fragment, viewGroup, z, obj);
    }

    public String h0() {
        return this.R0;
    }

    public abstract void k0(String str);
}
