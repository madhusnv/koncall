package p001o;

import ai.salesmax.model.TodoFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class aof extends ewi {
    public final MaterialTextView A0;
    public final MaterialTextView B0;
    public final MaterialTextView C0;
    public final MaterialCardView D0;
    public final MaterialTextView E0;
    public final RecyclerView F0;
    public final MaterialTextView G0;
    public final MaterialTextView H0;
    public final MaterialTextView I0;
    public final MaterialTextView J0;
    public final TextInputEditText K0;
    public final TextInputEditText L0;
    public final TextInputLayout M0;
    public final TextInputLayout N0;
    public final MaterialButtonToggleGroup O0;
    public final MaterialButtonToggleGroup P0;
    public TodoFilter Q0;
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final Button q0;
    public final Button r0;
    public final Button s0;
    public final Button t0;
    public final Button u0;
    public final Button v0;
    public final ShapeableImageView w0;
    public final MaterialButton x0;
    public final MaterialButton y0;
    public final ShapeableImageView z0;

    public aof(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, Button button9, ShapeableImageView shapeableImageView, MaterialButton materialButton, MaterialButton materialButton2, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialCardView materialCardView, MaterialTextView materialTextView4, RecyclerView recyclerView, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialTextView materialTextView7, MaterialTextView materialTextView8, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialButtonToggleGroup materialButtonToggleGroup2) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = button4;
        this.r0 = button5;
        this.s0 = button6;
        this.t0 = button7;
        this.u0 = button8;
        this.v0 = button9;
        this.w0 = shapeableImageView;
        this.x0 = materialButton;
        this.y0 = materialButton2;
        this.z0 = shapeableImageView2;
        this.A0 = materialTextView;
        this.B0 = materialTextView2;
        this.C0 = materialTextView3;
        this.D0 = materialCardView;
        this.E0 = materialTextView4;
        this.F0 = recyclerView;
        this.G0 = materialTextView5;
        this.H0 = materialTextView6;
        this.I0 = materialTextView7;
        this.J0 = materialTextView8;
        this.K0 = textInputEditText;
        this.L0 = textInputEditText2;
        this.M0 = textInputLayout;
        this.N0 = textInputLayout2;
        this.O0 = materialButtonToggleGroup;
        this.P0 = materialButtonToggleGroup2;
    }

    public static aof h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static aof i0(LayoutInflater layoutInflater, Object obj) {
        return (aof) ewi.m25668F(layoutInflater, p9e.sheet_filter_task, null, false, obj);
    }

    public abstract void j0(TodoFilter todoFilter);
}
