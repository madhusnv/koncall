package p001o;

import ai.salesmax.model.TaskTypeDefinition;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.HorizontalScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class r40 extends ewi {
    public final TextInputEditText A0;
    public final TextInputEditText B0;
    public final TextInputLayout C0;
    public final TextInputLayout D0;
    public final MaterialTextView E0;
    public final HorizontalScrollView F0;
    public final MaterialTextView G0;
    public TaskTypeDefinition H0;
    public Integer I0;
    public ck6 J0;
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final Chip q0;
    public final Chip r0;
    public final Chip s0;
    public final Chip t0;
    public final MaterialCardView u0;
    public final ChipGroup v0;
    public final TextInputEditText w0;
    public final TextInputLayout x0;
    public final TextInputLayout y0;
    public final AutoCompleteTextView z0;

    public r40(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, Chip chip, Chip chip2, Chip chip3, Chip chip4, MaterialCardView materialCardView, ChipGroup chipGroup, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, AutoCompleteTextView autoCompleteTextView, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, MaterialTextView materialTextView, HorizontalScrollView horizontalScrollView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialButton3;
        this.q0 = chip;
        this.r0 = chip2;
        this.s0 = chip3;
        this.t0 = chip4;
        this.u0 = materialCardView;
        this.v0 = chipGroup;
        this.w0 = textInputEditText;
        this.x0 = textInputLayout;
        this.y0 = textInputLayout2;
        this.z0 = autoCompleteTextView;
        this.A0 = textInputEditText2;
        this.B0 = textInputEditText3;
        this.C0 = textInputLayout3;
        this.D0 = textInputLayout4;
        this.E0 = materialTextView;
        this.F0 = horizontalScrollView;
        this.G0 = materialTextView2;
    }

    public static r40 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static r40 i0(LayoutInflater layoutInflater, Object obj) {
        return (r40) ewi.m25668F(layoutInflater, p9e.add_task_type, null, false, obj);
    }

    public abstract void j0(TaskTypeDefinition taskTypeDefinition);
}
