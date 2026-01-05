package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class wr5 extends ewi {
    public final TextInputLayout n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final AppCompatImageView q0;
    public final AppCompatAutoCompleteTextView r0;
    public final ConstraintLayout s0;

    public wr5(Object obj, View view, int i, TextInputLayout textInputLayout, MaterialButton materialButton, MaterialButton materialButton2, AppCompatImageView appCompatImageView, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.n0 = textInputLayout;
        this.o0 = materialButton;
        this.p0 = materialButton2;
        this.q0 = appCompatImageView;
        this.r0 = appCompatAutoCompleteTextView;
        this.s0 = constraintLayout;
    }

    public static wr5 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static wr5 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (wr5) ewi.m25668F(layoutInflater, p9e.dialog_deletemember_migrate, viewGroup, z, obj);
    }
}
