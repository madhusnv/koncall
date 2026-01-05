package p001o;

import ai.salesmax.model.CustomizedMessage;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class bk4 extends ewi {
    public final AppCompatImageView A0;
    public final MaterialSwitch B0;
    public final MaterialButton C0;
    public final MaterialButton D0;
    public final MaterialButton E0;
    public final TextInputEditText F0;
    public final TextInputLayout G0;
    public final TextInputEditText H0;
    public final TextInputLayout I0;
    public final ConstraintLayout J0;
    public final MaterialTextView K0;
    public CustomizedMessage L0;
    public Integer M0;
    public ck6 N0;
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final CardView p0;
    public final ConstraintLayout q0;
    public final ShapeableImageView r0;
    public final LinearLayout s0;
    public final MaterialTextView t0;
    public final MaterialCardView u0;
    public final ShapeableImageView v0;
    public final MaterialCardView w0;
    public final TextInputLayout x0;
    public final LinearLayout y0;
    public final AppCompatAutoCompleteTextView z0;

    public bk4(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, CardView cardView, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, LinearLayout linearLayout, MaterialTextView materialTextView, MaterialCardView materialCardView, ShapeableImageView shapeableImageView2, MaterialCardView materialCardView2, TextInputLayout textInputLayout, LinearLayout linearLayout2, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, AppCompatImageView appCompatImageView, MaterialSwitch materialSwitch, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, TextInputEditText textInputEditText, TextInputLayout textInputLayout2, TextInputEditText textInputEditText2, TextInputLayout textInputLayout3, ConstraintLayout constraintLayout2, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = cardView;
        this.q0 = constraintLayout;
        this.r0 = shapeableImageView;
        this.s0 = linearLayout;
        this.t0 = materialTextView;
        this.u0 = materialCardView;
        this.v0 = shapeableImageView2;
        this.w0 = materialCardView2;
        this.x0 = textInputLayout;
        this.y0 = linearLayout2;
        this.z0 = appCompatAutoCompleteTextView;
        this.A0 = appCompatImageView;
        this.B0 = materialSwitch;
        this.C0 = materialButton3;
        this.D0 = materialButton4;
        this.E0 = materialButton5;
        this.F0 = textInputEditText;
        this.G0 = textInputLayout2;
        this.H0 = textInputEditText2;
        this.I0 = textInputLayout3;
        this.J0 = constraintLayout2;
        this.K0 = materialTextView2;
    }

    public static bk4 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static bk4 i0(LayoutInflater layoutInflater, Object obj) {
        return (bk4) ewi.m25668F(layoutInflater, p9e.customize_template, null, false, obj);
    }

    public abstract void j0(CustomizedMessage customizedMessage);
}
