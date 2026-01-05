package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class nmf extends ewi {
    public final TextInputLayout n0;
    public final Button o0;
    public final Button p0;
    public final ShapeableImageView q0;
    public final MaterialTextView r0;
    public final MaterialButton s0;
    public final MaterialCardView t0;
    public final AppCompatImageView u0;
    public final AppCompatAutoCompleteTextView v0;
    public final MaterialTextView w0;
    public final MaterialButtonToggleGroup x0;

    public nmf(Object obj, View view, int i, TextInputLayout textInputLayout, Button button, Button button2, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialButton materialButton, MaterialCardView materialCardView, AppCompatImageView appCompatImageView, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, MaterialTextView materialTextView2, MaterialButtonToggleGroup materialButtonToggleGroup) {
        super(obj, view, i);
        this.n0 = textInputLayout;
        this.o0 = button;
        this.p0 = button2;
        this.q0 = shapeableImageView;
        this.r0 = materialTextView;
        this.s0 = materialButton;
        this.t0 = materialCardView;
        this.u0 = appCompatImageView;
        this.v0 = appCompatAutoCompleteTextView;
        this.w0 = materialTextView2;
        this.x0 = materialButtonToggleGroup;
    }

    public static nmf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static nmf i0(LayoutInflater layoutInflater, Object obj) {
        return (nmf) ewi.m25668F(layoutInflater, p9e.sheet_add_member_team, null, false, obj);
    }
}
