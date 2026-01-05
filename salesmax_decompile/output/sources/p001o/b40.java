package p001o;

import ai.salesmax.model.FormFields;
import ai.salesmax.model.Tasks;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class b40 extends ewi {
    public final RecyclerView A0;
    public final MaterialTextView B0;
    public final ShapeableImageView C0;
    public final TextInputEditText D0;
    public final TextInputLayout E0;
    public final TextInputEditText F0;
    public final TextInputLayout G0;
    public final ShapeableImageView H0;
    public final Chip I0;
    public final RecyclerView J0;
    public final Chip K0;
    public final Chip L0;
    public final Chip M0;
    public final Chip N0;
    public final Chip O0;
    public final MaterialButtonToggleGroup P0;
    public final MaterialTextView Q0;
    public Tasks R0;
    public Integer S0;
    public ck6 T0;
    public FormFields U0;
    public final ConstraintLayout n0;
    public final Button o0;
    public final Button p0;
    public final Button q0;
    public final Button r0;
    public final Button s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final ChipGroup v0;
    public final r14 w0;
    public final TextInputLayout x0;
    public final AppCompatAutoCompleteTextView y0;
    public final AppCompatImageView z0;

    public b40(Object obj, View view, int i, ConstraintLayout constraintLayout, Button button, Button button2, Button button3, Button button4, Button button5, MaterialButton materialButton, MaterialButton materialButton2, ChipGroup chipGroup, r14 r14Var, TextInputLayout textInputLayout, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, AppCompatImageView appCompatImageView, RecyclerView recyclerView, MaterialTextView materialTextView, ShapeableImageView shapeableImageView, TextInputEditText textInputEditText, TextInputLayout textInputLayout2, TextInputEditText textInputEditText2, TextInputLayout textInputLayout3, ShapeableImageView shapeableImageView2, Chip chip, RecyclerView recyclerView2, Chip chip2, Chip chip3, Chip chip4, Chip chip5, Chip chip6, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = constraintLayout;
        this.o0 = button;
        this.p0 = button2;
        this.q0 = button3;
        this.r0 = button4;
        this.s0 = button5;
        this.t0 = materialButton;
        this.u0 = materialButton2;
        this.v0 = chipGroup;
        this.w0 = r14Var;
        this.x0 = textInputLayout;
        this.y0 = appCompatAutoCompleteTextView;
        this.z0 = appCompatImageView;
        this.A0 = recyclerView;
        this.B0 = materialTextView;
        this.C0 = shapeableImageView;
        this.D0 = textInputEditText;
        this.E0 = textInputLayout2;
        this.F0 = textInputEditText2;
        this.G0 = textInputLayout3;
        this.H0 = shapeableImageView2;
        this.I0 = chip;
        this.J0 = recyclerView2;
        this.K0 = chip2;
        this.L0 = chip3;
        this.M0 = chip4;
        this.N0 = chip5;
        this.O0 = chip6;
        this.P0 = materialButtonToggleGroup;
        this.Q0 = materialTextView2;
    }

    public static b40 i0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return j0(layoutInflater, null);
    }

    public static b40 j0(LayoutInflater layoutInflater, Object obj) {
        return (b40) ewi.m25668F(layoutInflater, p9e.add_task_basic, null, false, obj);
    }

    public FormFields h0() {
        return this.U0;
    }

    public abstract void k0(FormFields formFields);

    public abstract void l0(Tasks tasks);
}
