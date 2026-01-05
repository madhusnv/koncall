package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.hbb20.CountryCodePicker;

/* loaded from: classes.dex */
public abstract class d5c extends ewi {
    public final MaterialTextView n0;
    public final MaterialButton o0;
    public final MaterialTextView p0;
    public final MaterialCardView q0;
    public final CountryCodePicker r0;
    public final LinearLayout s0;
    public final TextInputEditText t0;
    public final MaterialTextView u0;

    public d5c(Object obj, View view, int i, MaterialTextView materialTextView, MaterialButton materialButton, MaterialTextView materialTextView2, MaterialCardView materialCardView, CountryCodePicker countryCodePicker, LinearLayout linearLayout, TextInputEditText textInputEditText, MaterialTextView materialTextView3) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = materialButton;
        this.p0 = materialTextView2;
        this.q0 = materialCardView;
        this.r0 = countryCodePicker;
        this.s0 = linearLayout;
        this.t0 = textInputEditText;
        this.u0 = materialTextView3;
    }

    public static d5c h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static d5c i0(LayoutInflater layoutInflater, Object obj) {
        return (d5c) ewi.m25668F(layoutInflater, p9e.number_change_fragment, null, false, obj);
    }
}
