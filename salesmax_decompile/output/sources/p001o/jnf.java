package p001o;

import ai.salesmax.model.Tasks;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class jnf extends ewi {
    public final MaterialButtonToggleGroup A0;
    public final MaterialTextView B0;
    public final MaterialTextView C0;
    public final MaterialButton D0;
    public Tasks E0;
    public Integer F0;
    public ck6 G0;
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final Button q0;
    public final Button r0;
    public final MaterialButton s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final ConstraintLayout v0;
    public final RecyclerView w0;
    public final RecyclerView x0;
    public final TextInputEditText y0;
    public final TextInputLayout z0;

    public jnf(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, Button button5, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, ConstraintLayout constraintLayout, RecyclerView recyclerView, RecyclerView recyclerView2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialButton materialButton4) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = button4;
        this.r0 = button5;
        this.s0 = materialButton;
        this.t0 = materialButton2;
        this.u0 = materialButton3;
        this.v0 = constraintLayout;
        this.w0 = recyclerView;
        this.x0 = recyclerView2;
        this.y0 = textInputEditText;
        this.z0 = textInputLayout;
        this.A0 = materialButtonToggleGroup;
        this.B0 = materialTextView;
        this.C0 = materialTextView2;
        this.D0 = materialButton4;
    }
}
