package p001o;

import ai.salesmax.model.FormDefinition;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class gw extends ewi {
    public final TextInputLayout A0;
    public final TextInputEditText B0;
    public final TextInputLayout C0;
    public final AutoCompleteTextView D0;
    public final MaterialTextView E0;
    public FormDefinition F0;
    public Integer G0;
    public ck6 H0;
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final MaterialCardView q0;
    public final TextInputEditText r0;
    public final TextInputLayout s0;
    public final TextInputEditText t0;
    public final TextInputLayout u0;
    public final MaterialSwitch v0;
    public final MaterialSwitch w0;
    public final TextInputLayout x0;
    public final AutoCompleteTextView y0;
    public final RecyclerView z0;

    public gw(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialCardView materialCardView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, MaterialSwitch materialSwitch, MaterialSwitch materialSwitch2, TextInputLayout textInputLayout3, AutoCompleteTextView autoCompleteTextView, RecyclerView recyclerView, TextInputLayout textInputLayout4, TextInputEditText textInputEditText3, TextInputLayout textInputLayout5, AutoCompleteTextView autoCompleteTextView2, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialButton3;
        this.q0 = materialCardView;
        this.r0 = textInputEditText;
        this.s0 = textInputLayout;
        this.t0 = textInputEditText2;
        this.u0 = textInputLayout2;
        this.v0 = materialSwitch;
        this.w0 = materialSwitch2;
        this.x0 = textInputLayout3;
        this.y0 = autoCompleteTextView;
        this.z0 = recyclerView;
        this.A0 = textInputLayout4;
        this.B0 = textInputEditText3;
        this.C0 = textInputLayout5;
        this.D0 = autoCompleteTextView2;
        this.E0 = materialTextView;
    }

    public static gw h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static gw i0(LayoutInflater layoutInflater, Object obj) {
        return (gw) ewi.m25668F(layoutInflater, p9e.add_custom_form, null, false, obj);
    }

    public abstract void j0(FormDefinition formDefinition);
}
