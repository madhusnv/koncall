package p001o;

import ai.salesmax.model.TemplateVariable;
import ai.salesmax.view.AllAutoCompleteTextView;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class j49 extends ewi {
    public final MaterialTextView n0;
    public final TextInputLayout o0;
    public final TextInputEditText p0;
    public final AllAutoCompleteTextView q0;
    public final TextInputLayout r0;
    public TemplateVariable s0;
    public Integer t0;
    public ck6 u0;

    public j49(Object obj, View view, int i, MaterialTextView materialTextView, TextInputLayout textInputLayout, TextInputEditText textInputEditText, AllAutoCompleteTextView allAutoCompleteTextView, TextInputLayout textInputLayout2) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = textInputLayout;
        this.p0 = textInputEditText;
        this.q0 = allAutoCompleteTextView;
        this.r0 = textInputLayout2;
    }
}
