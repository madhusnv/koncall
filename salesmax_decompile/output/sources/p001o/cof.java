package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hbb20.CountryCodePicker;

/* loaded from: classes.dex */
public abstract class cof extends ewi {
    public final MaterialTextView A0;
    public final MaterialTextView B0;
    public final ShapeableImageView C0;
    public final LinearLayout n0;
    public final AutoCompleteTextView o0;
    public final CountryCodePicker p0;
    public final TextInputEditText q0;
    public final TextInputLayout r0;
    public final TextInputEditText s0;
    public final TextInputLayout t0;
    public final MaterialButton u0;
    public final MaterialCardView v0;
    public final TextInputLayout w0;
    public final TextInputEditText x0;
    public final MaterialButton y0;
    public final LinearLayout z0;

    public cof(Object obj, View view, int i, LinearLayout linearLayout, AutoCompleteTextView autoCompleteTextView, CountryCodePicker countryCodePicker, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, MaterialButton materialButton, MaterialCardView materialCardView, TextInputLayout textInputLayout3, TextInputEditText textInputEditText3, MaterialButton materialButton2, LinearLayout linearLayout2, MaterialTextView materialTextView, MaterialTextView materialTextView2, ShapeableImageView shapeableImageView) {
        super(obj, view, i);
        this.n0 = linearLayout;
        this.o0 = autoCompleteTextView;
        this.p0 = countryCodePicker;
        this.q0 = textInputEditText;
        this.r0 = textInputLayout;
        this.s0 = textInputEditText2;
        this.t0 = textInputLayout2;
        this.u0 = materialButton;
        this.v0 = materialCardView;
        this.w0 = textInputLayout3;
        this.x0 = textInputEditText3;
        this.y0 = materialButton2;
        this.z0 = linearLayout2;
        this.A0 = materialTextView;
        this.B0 = materialTextView2;
        this.C0 = shapeableImageView;
    }

    public static cof h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static cof i0(LayoutInflater layoutInflater, Object obj) {
        return (cof) ewi.m25668F(layoutInflater, p9e.sheet_invite_user, null, false, obj);
    }
}
