package p001o;

import ai.salesmax.model.FormFields;
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
public abstract class u54 extends ewi {
    public final MaterialTextView A0;
    public final ShapeableImageView B0;
    public final AppCompatAutoCompleteTextView C0;
    public final AppCompatImageView D0;
    public final View E0;
    public final RecyclerView F0;
    public final RecyclerView G0;
    public final MaterialButton H0;
    public final ShapeableImageView I0;
    public final MaterialButton J0;
    public final MaterialButton K0;
    public final TextInputEditText L0;
    public final TextInputLayout M0;
    public final MaterialButtonToggleGroup N0;
    public final MaterialTextView O0;
    public final MaterialButton P0;
    public final MaterialTextView Q0;
    public final LinearLayout R0;
    public final RecyclerView S0;
    public final MaterialTextView T0;
    public final MaterialTextView U0;
    public final MaterialTextView V0;
    public final MaterialTextView W0;
    public final MaterialButton X0;
    public final MaterialTextView Y0;
    public final MaterialButton Z0;
    public final MaterialTextView a1;
    public final MaterialButton b1;
    public final View c1;
    public Tasks d1;
    public FormFields e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public Integer j1;
    public ck6 k1;
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final Button q0;
    public final Button r0;
    public final MaterialCardView s0;
    public final r14 t0;
    public final ShapeableImageView u0;
    public final TextInputLayout v0;
    public final View w0;
    public final LinearLayout x0;
    public final ShapeableImageView y0;
    public final MaterialTextView z0;

    public u54(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, Button button5, MaterialCardView materialCardView, r14 r14Var, ShapeableImageView shapeableImageView, TextInputLayout textInputLayout, View view2, LinearLayout linearLayout, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, ShapeableImageView shapeableImageView3, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, AppCompatImageView appCompatImageView, View view3, RecyclerView recyclerView, RecyclerView recyclerView2, MaterialButton materialButton, ShapeableImageView shapeableImageView4, MaterialButton materialButton2, MaterialButton materialButton3, TextInputEditText textInputEditText, TextInputLayout textInputLayout2, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView3, MaterialButton materialButton4, MaterialTextView materialTextView4, LinearLayout linearLayout2, RecyclerView recyclerView3, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialTextView materialTextView8, MaterialButton materialButton5, MaterialTextView materialTextView9, MaterialButton materialButton6, MaterialTextView materialTextView10, MaterialButton materialButton7, View view4) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = button4;
        this.r0 = button5;
        this.s0 = materialCardView;
        this.t0 = r14Var;
        this.u0 = shapeableImageView;
        this.v0 = textInputLayout;
        this.w0 = view2;
        this.x0 = linearLayout;
        this.y0 = shapeableImageView2;
        this.z0 = materialTextView;
        this.A0 = materialTextView2;
        this.B0 = shapeableImageView3;
        this.C0 = appCompatAutoCompleteTextView;
        this.D0 = appCompatImageView;
        this.E0 = view3;
        this.F0 = recyclerView;
        this.G0 = recyclerView2;
        this.H0 = materialButton;
        this.I0 = shapeableImageView4;
        this.J0 = materialButton2;
        this.K0 = materialButton3;
        this.L0 = textInputEditText;
        this.M0 = textInputLayout2;
        this.N0 = materialButtonToggleGroup;
        this.O0 = materialTextView3;
        this.P0 = materialButton4;
        this.Q0 = materialTextView4;
        this.R0 = linearLayout2;
        this.S0 = recyclerView3;
        this.T0 = materialTextView5;
        this.U0 = materialTextView6;
        this.V0 = materialTextView7;
        this.W0 = materialTextView8;
        this.X0 = materialButton5;
        this.Y0 = materialTextView9;
        this.Z0 = materialButton6;
        this.a1 = materialTextView10;
        this.b1 = materialButton7;
        this.c1 = view4;
    }

    public static u54 l0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return m0(layoutInflater, null);
    }

    public static u54 m0(LayoutInflater layoutInflater, Object obj) {
        return (u54) ewi.m25668F(layoutInflater, p9e.content_visit_outcome, null, false, obj);
    }

    public boolean h0() {
        return this.g1;
    }

    public FormFields i0() {
        return this.e1;
    }

    public boolean j0() {
        return this.h1;
    }

    public boolean k0() {
        return this.i1;
    }

    public abstract void n0(boolean z);

    public abstract void p0(FormFields formFields);

    public abstract void q0(boolean z);

    public abstract void s0(boolean z);

    public abstract void t0(boolean z);

    public abstract void u0(Tasks tasks);
}
