package p001o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class z30 extends ewi {
    public final MaterialButton n0;
    public final MaterialTextView o0;
    public final TextInputEditText p0;
    public final TextInputLayout q0;
    public final RecyclerView r0;

    public z30(Object obj, View view, int i, MaterialButton materialButton, MaterialTextView materialTextView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialTextView;
        this.p0 = textInputEditText;
        this.q0 = textInputLayout;
        this.r0 = recyclerView;
    }
}
