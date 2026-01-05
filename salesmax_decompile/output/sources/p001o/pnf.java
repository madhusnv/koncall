package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class pnf extends ewi {
    public final TextInputLayout n0;
    public final ShapeableImageView o0;
    public final MaterialTextView p0;
    public final MaterialButton q0;
    public final MaterialCardView r0;
    public final AppCompatImageView s0;
    public final AppCompatAutoCompleteTextView t0;
    public final MaterialSwitch u0;
    public final TextInputEditText v0;
    public final TextInputEditText w0;

    public pnf(Object obj, View view, int i, TextInputLayout textInputLayout, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialButton materialButton, MaterialCardView materialCardView, AppCompatImageView appCompatImageView, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, MaterialSwitch materialSwitch, TextInputEditText textInputEditText, TextInputEditText textInputEditText2) {
        super(obj, view, i);
        this.n0 = textInputLayout;
        this.o0 = shapeableImageView;
        this.p0 = materialTextView;
        this.q0 = materialButton;
        this.r0 = materialCardView;
        this.s0 = appCompatImageView;
        this.t0 = appCompatAutoCompleteTextView;
        this.u0 = materialSwitch;
        this.v0 = textInputEditText;
        this.w0 = textInputEditText2;
    }

    public static pnf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static pnf i0(LayoutInflater layoutInflater, Object obj) {
        return (pnf) ewi.m25668F(layoutInflater, p9e.sheet_create_team, null, false, obj);
    }
}
