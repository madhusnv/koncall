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
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class hy extends ewi {
    public final MaterialButton A0;
    public final MaterialButton B0;
    public final TextInputEditText C0;
    public final TextInputLayout D0;
    public final TextInputEditText E0;
    public final TextInputLayout F0;
    public final RecyclerView G0;
    public final MaterialButton H0;
    public final MaterialButtonToggleGroup I0;
    public final MaterialTextView J0;
    public Tasks K0;
    public Integer L0;
    public ck6 M0;
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final Button q0;
    public final Button r0;
    public final MaterialButton s0;
    public final MaterialButton t0;
    public final TextInputLayout u0;
    public final AppCompatAutoCompleteTextView v0;
    public final AppCompatImageView w0;
    public final LinearLayout x0;
    public final View y0;
    public final RecyclerView z0;

    public hy(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, Button button5, MaterialButton materialButton, MaterialButton materialButton2, TextInputLayout textInputLayout, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, View view2, RecyclerView recyclerView, MaterialButton materialButton3, MaterialButton materialButton4, TextInputEditText textInputEditText, TextInputLayout textInputLayout2, TextInputEditText textInputEditText2, TextInputLayout textInputLayout3, RecyclerView recyclerView2, MaterialButton materialButton5, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = button4;
        this.r0 = button5;
        this.s0 = materialButton;
        this.t0 = materialButton2;
        this.u0 = textInputLayout;
        this.v0 = appCompatAutoCompleteTextView;
        this.w0 = appCompatImageView;
        this.x0 = linearLayout;
        this.y0 = view2;
        this.z0 = recyclerView;
        this.A0 = materialButton3;
        this.B0 = materialButton4;
        this.C0 = textInputEditText;
        this.D0 = textInputLayout2;
        this.E0 = textInputEditText2;
        this.F0 = textInputLayout3;
        this.G0 = recyclerView2;
        this.H0 = materialButton5;
        this.I0 = materialButtonToggleGroup;
        this.J0 = materialTextView;
    }

    public static hy h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static hy i0(LayoutInflater layoutInflater, Object obj) {
        return (hy) ewi.m25668F(layoutInflater, p9e.add_notes, null, false, obj);
    }

    public abstract void j0(Tasks tasks);
}
