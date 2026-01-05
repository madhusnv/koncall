package p001o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class vmf extends ewi {
    public final View n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final MaterialTextView q0;
    public final TextInputEditText r0;
    public final TextInputLayout s0;
    public final RecyclerView t0;

    public vmf(Object obj, View view, int i, View view2, MaterialButton materialButton, MaterialButton materialButton2, MaterialTextView materialTextView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = view2;
        this.o0 = materialButton;
        this.p0 = materialButton2;
        this.q0 = materialTextView;
        this.r0 = textInputEditText;
        this.s0 = textInputLayout;
        this.t0 = recyclerView;
    }
}
