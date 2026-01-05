package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class sr5 extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final AppCompatAutoCompleteTextView p0;
    public final TextInputLayout q0;
    public final ConstraintLayout r0;

    public sr5(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, TextInputLayout textInputLayout, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = appCompatAutoCompleteTextView;
        this.q0 = textInputLayout;
        this.r0 = constraintLayout;
    }

    public static sr5 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static sr5 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (sr5) ewi.m25668F(layoutInflater, p9e.dialog_create_group, viewGroup, z, obj);
    }
}
