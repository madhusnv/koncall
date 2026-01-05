package p001o;

import ai.salesmax.model.Tasks;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class m14 extends ewi {
    public final MaterialTextView A0;
    public final ShapeableImageView B0;
    public final AppCompatAutoCompleteTextView C0;
    public final AppCompatImageView D0;
    public final RecyclerView E0;
    public final RecyclerView F0;
    public final ShapeableImageView G0;
    public final TextInputEditText H0;
    public final TextInputLayout I0;
    public final MaterialButtonToggleGroup J0;
    public final MaterialTextView K0;
    public final MaterialTextView L0;
    public final MaterialTextView M0;
    public final MaterialButton N0;
    public final MaterialTextView O0;
    public final MaterialButton P0;
    public final MaterialTextView Q0;
    public final MaterialButton R0;
    public final MaterialTextView S0;
    public Tasks T0;
    public boolean U0;
    public Integer V0;
    public ck6 W0;
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final Button q0;
    public final Button r0;
    public final MaterialButton s0;
    public final View t0;
    public final MaterialCardView u0;
    public final TextInputLayout v0;
    public final View w0;
    public final LinearLayout x0;
    public final ShapeableImageView y0;
    public final MaterialTextView z0;

    public m14(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, Button button5, MaterialButton materialButton, View view2, MaterialCardView materialCardView, TextInputLayout textInputLayout, View view3, LinearLayout linearLayout, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, ShapeableImageView shapeableImageView2, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, AppCompatImageView appCompatImageView, RecyclerView recyclerView, RecyclerView recyclerView2, ShapeableImageView shapeableImageView3, TextInputEditText textInputEditText, TextInputLayout textInputLayout2, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView3, MaterialTextView materialTextView4, MaterialTextView materialTextView5, MaterialButton materialButton2, MaterialTextView materialTextView6, MaterialButton materialButton3, MaterialTextView materialTextView7, MaterialButton materialButton4, MaterialTextView materialTextView8) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = button4;
        this.r0 = button5;
        this.s0 = materialButton;
        this.t0 = view2;
        this.u0 = materialCardView;
        this.v0 = textInputLayout;
        this.w0 = view3;
        this.x0 = linearLayout;
        this.y0 = shapeableImageView;
        this.z0 = materialTextView;
        this.A0 = materialTextView2;
        this.B0 = shapeableImageView2;
        this.C0 = appCompatAutoCompleteTextView;
        this.D0 = appCompatImageView;
        this.E0 = recyclerView;
        this.F0 = recyclerView2;
        this.G0 = shapeableImageView3;
        this.H0 = textInputEditText;
        this.I0 = textInputLayout2;
        this.J0 = materialButtonToggleGroup;
        this.K0 = materialTextView3;
        this.L0 = materialTextView4;
        this.M0 = materialTextView5;
        this.N0 = materialButton2;
        this.O0 = materialTextView6;
        this.P0 = materialButton3;
        this.Q0 = materialTextView7;
        this.R0 = materialButton4;
        this.S0 = materialTextView8;
    }

    public static m14 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static m14 i0(LayoutInflater layoutInflater, Object obj) {
        return (m14) ewi.m25668F(layoutInflater, p9e.content_call_outcome, null, false, obj);
    }

    public abstract void j0(boolean z);

    public abstract void k0(Tasks tasks);
}
