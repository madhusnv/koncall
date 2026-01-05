package p001o;

import ai.salesmax.model.Leads;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.hbb20.CountryCodePicker;

/* loaded from: classes.dex */
public abstract class snf extends ewi {
    public final ShapeableImageView A0;
    public final MaterialButton B0;
    public Leads C0;
    public Integer D0;
    public ck6 E0;
    public final MaterialTextView n0;
    public final CountryCodePicker o0;
    public final MaterialButton p0;
    public final TextInputEditText q0;
    public final MaterialCardView r0;
    public final MaterialTextView s0;
    public final xz8 t0;
    public final MaterialButton u0;
    public final TextInputEditText v0;
    public final MaterialButton w0;
    public final MaterialButton x0;
    public final LinearLayout y0;
    public final MaterialTextView z0;

    public snf(Object obj, View view, int i, MaterialTextView materialTextView, CountryCodePicker countryCodePicker, MaterialButton materialButton, TextInputEditText textInputEditText, MaterialCardView materialCardView, MaterialTextView materialTextView2, xz8 xz8Var, MaterialButton materialButton2, TextInputEditText textInputEditText2, MaterialButton materialButton3, MaterialButton materialButton4, LinearLayout linearLayout, MaterialTextView materialTextView3, ShapeableImageView shapeableImageView, MaterialButton materialButton5) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = countryCodePicker;
        this.p0 = materialButton;
        this.q0 = textInputEditText;
        this.r0 = materialCardView;
        this.s0 = materialTextView2;
        this.t0 = xz8Var;
        this.u0 = materialButton2;
        this.v0 = textInputEditText2;
        this.w0 = materialButton3;
        this.x0 = materialButton4;
        this.y0 = linearLayout;
        this.z0 = materialTextView3;
        this.A0 = shapeableImageView;
        this.B0 = materialButton5;
    }

    public static snf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static snf i0(LayoutInflater layoutInflater, Object obj) {
        return (snf) ewi.m25668F(layoutInflater, p9e.sheet_dial_number, null, false, obj);
    }

    public abstract void j0(Leads leads);
}
