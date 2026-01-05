package p001o;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class bzb extends ewi {
    public final TextView n0;
    public final TextView o0;
    public final ConstraintLayout p0;
    public final MaterialButton q0;

    public bzb(Object obj, View view, int i, TextView textView, TextView textView2, ConstraintLayout constraintLayout, MaterialButton materialButton) {
        super(obj, view, i);
        this.n0 = textView;
        this.o0 = textView2;
        this.p0 = constraintLayout;
        this.q0 = materialButton;
    }
}
