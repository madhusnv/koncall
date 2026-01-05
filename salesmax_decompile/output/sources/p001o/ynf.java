package p001o;

import ai.salesmax.model.LeadFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ynf extends ewi {
    public final Button A0;
    public final Button B0;
    public final Button C0;
    public final ShapeableImageView D0;
    public final MaterialButton E0;
    public final MaterialButton F0;
    public final ShapeableImageView G0;
    public final MaterialTextView H0;
    public final MaterialCardView I0;
    public final MaterialTextView J0;
    public final MaterialTextView K0;
    public final AppCompatImageView L0;
    public final AppCompatImageView M0;
    public final AppCompatImageView N0;
    public final AppCompatImageView O0;
    public final RecyclerView P0;
    public final MaterialTextView Q0;
    public LeadFilter R0;
    public boolean S0;
    public final AppCompatAutoCompleteTextView n0;
    public final AppCompatAutoCompleteTextView o0;
    public final TextInputLayout p0;
    public final ConstraintLayout q0;
    public final TextInputLayout r0;
    public final ConstraintLayout s0;
    public final AppCompatAutoCompleteTextView t0;
    public final TextInputLayout u0;
    public final ConstraintLayout v0;
    public final AppCompatAutoCompleteTextView w0;
    public final TextInputLayout x0;
    public final ConstraintLayout y0;
    public final Button z0;

    public ynf(Object obj, View view, int i, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2, TextInputLayout textInputLayout, ConstraintLayout constraintLayout, TextInputLayout textInputLayout2, ConstraintLayout constraintLayout2, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView3, TextInputLayout textInputLayout3, ConstraintLayout constraintLayout3, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView4, TextInputLayout textInputLayout4, ConstraintLayout constraintLayout4, Button button, Button button2, Button button3, Button button4, ShapeableImageView shapeableImageView, MaterialButton materialButton, MaterialButton materialButton2, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, MaterialCardView materialCardView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, RecyclerView recyclerView, MaterialTextView materialTextView4) {
        super(obj, view, i);
        this.n0 = appCompatAutoCompleteTextView;
        this.o0 = appCompatAutoCompleteTextView2;
        this.p0 = textInputLayout;
        this.q0 = constraintLayout;
        this.r0 = textInputLayout2;
        this.s0 = constraintLayout2;
        this.t0 = appCompatAutoCompleteTextView3;
        this.u0 = textInputLayout3;
        this.v0 = constraintLayout3;
        this.w0 = appCompatAutoCompleteTextView4;
        this.x0 = textInputLayout4;
        this.y0 = constraintLayout4;
        this.z0 = button;
        this.A0 = button2;
        this.B0 = button3;
        this.C0 = button4;
        this.D0 = shapeableImageView;
        this.E0 = materialButton;
        this.F0 = materialButton2;
        this.G0 = shapeableImageView2;
        this.H0 = materialTextView;
        this.I0 = materialCardView;
        this.J0 = materialTextView2;
        this.K0 = materialTextView3;
        this.L0 = appCompatImageView;
        this.M0 = appCompatImageView2;
        this.N0 = appCompatImageView3;
        this.O0 = appCompatImageView4;
        this.P0 = recyclerView;
        this.Q0 = materialTextView4;
    }

    public static ynf i0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return j0(layoutInflater, null);
    }

    public static ynf j0(LayoutInflater layoutInflater, Object obj) {
        return (ynf) ewi.m25668F(layoutInflater, p9e.sheet_filter_lead_new, null, false, obj);
    }

    public LeadFilter h0() {
        return this.R0;
    }

    public abstract void k0(boolean z);

    public abstract void l0(LeadFilter leadFilter);
}
