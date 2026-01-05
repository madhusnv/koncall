package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class ks5 extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final TextInputEditText p0;
    public final TextInputLayout q0;
    public final ConstraintLayout r0;

    public ks5(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = textInputEditText;
        this.q0 = textInputLayout;
        this.r0 = constraintLayout;
    }

    public static ks5 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static ks5 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ks5) ewi.m25668F(layoutInflater, p9e.dialog_missing_email, viewGroup, z, obj);
    }
}
