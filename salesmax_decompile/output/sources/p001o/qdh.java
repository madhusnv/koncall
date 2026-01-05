package p001o;

import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class qdh extends ewi {
    public final RecyclerView n0;
    public final RecyclerView o0;
    public final MaterialTextView p0;
    public final TextInputLayout q0;
    public final AutoCompleteTextView r0;
    public boolean s0;
    public boolean t0;

    public qdh(Object obj, View view, int i, RecyclerView recyclerView, RecyclerView recyclerView2, MaterialTextView materialTextView, TextInputLayout textInputLayout, AutoCompleteTextView autoCompleteTextView) {
        super(obj, view, i);
        this.n0 = recyclerView;
        this.o0 = recyclerView2;
        this.p0 = materialTextView;
        this.q0 = textInputLayout;
        this.r0 = autoCompleteTextView;
    }
}
