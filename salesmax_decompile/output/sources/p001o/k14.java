package p001o;

import ai.salesmax.model.AutoCompleteListModel;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class k14 extends ewi {
    public final AutoCompleteTextView n0;
    public final TextInputLayout o0;
    public final MaterialTextView p0;
    public AutoCompleteListModel q0;
    public Integer r0;
    public ck6 s0;

    public k14(Object obj, View view, int i, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = autoCompleteTextView;
        this.o0 = textInputLayout;
        this.p0 = materialTextView;
    }
}
