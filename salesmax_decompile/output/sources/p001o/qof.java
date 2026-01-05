package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hbb20.CountryCodePicker;

/* loaded from: classes.dex */
public abstract class qof extends ewi {
    public final TextInputLayout A0;
    public final MaterialCardView B0;
    public final AppCompatImageView C0;
    public final AppCompatImageView D0;
    public final TextInputEditText E0;
    public final MaterialTextView F0;
    public final MaterialButton G0;
    public final ShapeableImageView H0;
    public final AppCompatAutoCompleteTextView n0;
    public final TextInputLayout o0;
    public final ConstraintLayout p0;
    public final TextInputEditText q0;
    public final TextInputLayout r0;
    public final AppCompatAutoCompleteTextView s0;
    public final TextInputLayout t0;
    public final ConstraintLayout u0;
    public final CountryCodePicker v0;
    public final TextInputEditText w0;
    public final TextInputLayout x0;
    public final LinearLayout y0;
    public final TextInputEditText z0;

    public qof(Object obj, View view, int i, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, TextInputLayout textInputLayout, ConstraintLayout constraintLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout2, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2, TextInputLayout textInputLayout3, ConstraintLayout constraintLayout2, CountryCodePicker countryCodePicker, TextInputEditText textInputEditText2, TextInputLayout textInputLayout4, LinearLayout linearLayout, TextInputEditText textInputEditText3, TextInputLayout textInputLayout5, MaterialCardView materialCardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextInputEditText textInputEditText4, MaterialTextView materialTextView, MaterialButton materialButton, ShapeableImageView shapeableImageView) {
        super(obj, view, i);
        this.n0 = appCompatAutoCompleteTextView;
        this.o0 = textInputLayout;
        this.p0 = constraintLayout;
        this.q0 = textInputEditText;
        this.r0 = textInputLayout2;
        this.s0 = appCompatAutoCompleteTextView2;
        this.t0 = textInputLayout3;
        this.u0 = constraintLayout2;
        this.v0 = countryCodePicker;
        this.w0 = textInputEditText2;
        this.x0 = textInputLayout4;
        this.y0 = linearLayout;
        this.z0 = textInputEditText3;
        this.A0 = textInputLayout5;
        this.B0 = materialCardView;
        this.C0 = appCompatImageView;
        this.D0 = appCompatImageView2;
        this.E0 = textInputEditText4;
        this.F0 = materialTextView;
        this.G0 = materialButton;
        this.H0 = shapeableImageView;
    }

    public static qof h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static qof i0(LayoutInflater layoutInflater, Object obj) {
        return (qof) ewi.m25668F(layoutInflater, p9e.sheet_quick_edit_lead, null, false, obj);
    }
}
