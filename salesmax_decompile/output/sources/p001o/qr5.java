package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class qr5 extends ewi {
    public final MaterialCheckBox n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final TextInputEditText q0;
    public final TextInputLayout r0;
    public final ConstraintLayout s0;

    public qr5(Object obj, View view, int i, MaterialCheckBox materialCheckBox, MaterialButton materialButton, MaterialButton materialButton2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.n0 = materialCheckBox;
        this.o0 = materialButton;
        this.p0 = materialButton2;
        this.q0 = textInputEditText;
        this.r0 = textInputLayout;
        this.s0 = constraintLayout;
    }

    public static qr5 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static qr5 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qr5) ewi.m25668F(layoutInflater, p9e.dialog_close_lead_manual, viewGroup, z, obj);
    }
}
