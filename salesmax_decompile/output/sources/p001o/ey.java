package p001o;

import ai.salesmax.model.FormFields;
import ai.salesmax.model.Leads;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hbb20.CountryCodePicker;

/* loaded from: classes.dex */
public abstract class ey extends ewi {
    public final TextInputEditText A0;
    public final TextInputLayout B0;
    public final TextInputLayout C0;
    public final TextInputLayout D0;
    public final TextInputEditText E0;
    public final TextInputEditText F0;
    public final TextInputEditText G0;
    public final TextInputLayout H0;
    public final LinearLayout I0;
    public final TextInputEditText J0;
    public final TextInputLayout K0;
    public final ShapeableImageView L0;
    public final AppCompatAutoCompleteTextView M0;
    public final TextInputLayout N0;
    public final ConstraintLayout O0;
    public final MaterialTextView P0;
    public final MaterialTextView Q0;
    public final MaterialButton R0;
    public final CountryCodePicker S0;
    public final CountryCodePicker T0;
    public final r14 U0;
    public final ShapeableImageView V0;
    public final xz8 W0;
    public final ConstraintLayout X0;
    public final MaterialTextView Y0;
    public final ShapeableImageView Z0;
    public final AppCompatImageView a1;
    public final AppCompatImageView b1;
    public final ShapeableImageView c1;
    public final TextInputEditText d1;
    public final TextInputEditText e1;
    public final RecyclerView f1;
    public Leads g1;
    public FormFields h1;
    public Integer i1;
    public ck6 j1;
    public Boolean k1;
    public final ShapeableImageView n0;
    public final MaterialButton o0;
    public final LinearLayout p0;
    public final LinearLayout q0;
    public final LinearLayout r0;
    public final AppCompatAutoCompleteTextView s0;
    public final TextInputLayout t0;
    public final TextInputEditText u0;
    public final TextInputLayout v0;
    public final TextInputEditText w0;
    public final TextInputLayout x0;
    public final TextInputEditText y0;
    public final TextInputLayout z0;

    public ey(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialButton materialButton, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout2, TextInputEditText textInputEditText2, TextInputLayout textInputLayout3, TextInputEditText textInputEditText3, TextInputLayout textInputLayout4, TextInputEditText textInputEditText4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextInputEditText textInputEditText5, TextInputEditText textInputEditText6, TextInputEditText textInputEditText7, TextInputLayout textInputLayout8, LinearLayout linearLayout4, TextInputEditText textInputEditText8, TextInputLayout textInputLayout9, ShapeableImageView shapeableImageView2, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2, TextInputLayout textInputLayout10, ConstraintLayout constraintLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialButton materialButton2, CountryCodePicker countryCodePicker, CountryCodePicker countryCodePicker2, r14 r14Var, ShapeableImageView shapeableImageView3, xz8 xz8Var, ConstraintLayout constraintLayout2, MaterialTextView materialTextView3, ShapeableImageView shapeableImageView4, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ShapeableImageView shapeableImageView5, TextInputEditText textInputEditText9, TextInputEditText textInputEditText10, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialButton;
        this.p0 = linearLayout;
        this.q0 = linearLayout2;
        this.r0 = linearLayout3;
        this.s0 = appCompatAutoCompleteTextView;
        this.t0 = textInputLayout;
        this.u0 = textInputEditText;
        this.v0 = textInputLayout2;
        this.w0 = textInputEditText2;
        this.x0 = textInputLayout3;
        this.y0 = textInputEditText3;
        this.z0 = textInputLayout4;
        this.A0 = textInputEditText4;
        this.B0 = textInputLayout5;
        this.C0 = textInputLayout6;
        this.D0 = textInputLayout7;
        this.E0 = textInputEditText5;
        this.F0 = textInputEditText6;
        this.G0 = textInputEditText7;
        this.H0 = textInputLayout8;
        this.I0 = linearLayout4;
        this.J0 = textInputEditText8;
        this.K0 = textInputLayout9;
        this.L0 = shapeableImageView2;
        this.M0 = appCompatAutoCompleteTextView2;
        this.N0 = textInputLayout10;
        this.O0 = constraintLayout;
        this.P0 = materialTextView;
        this.Q0 = materialTextView2;
        this.R0 = materialButton2;
        this.S0 = countryCodePicker;
        this.T0 = countryCodePicker2;
        this.U0 = r14Var;
        this.V0 = shapeableImageView3;
        this.W0 = xz8Var;
        this.X0 = constraintLayout2;
        this.Y0 = materialTextView3;
        this.Z0 = shapeableImageView4;
        this.a1 = appCompatImageView;
        this.b1 = appCompatImageView2;
        this.c1 = shapeableImageView5;
        this.d1 = textInputEditText9;
        this.e1 = textInputEditText10;
        this.f1 = recyclerView;
    }

    public static ey j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return k0(layoutInflater, viewGroup, z, null);
    }

    public static ey k0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ey) ewi.m25668F(layoutInflater, p9e.add_lead_fragment, viewGroup, z, obj);
    }

    public FormFields h0() {
        return this.h1;
    }

    public Boolean i0() {
        return this.k1;
    }

    public abstract void l0(FormFields formFields);

    public abstract void m0(Leads leads);

    public abstract void n0(Boolean bool);
}
