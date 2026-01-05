package p001o;

import ai.salesmax.model.CallOutcome;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class sbf extends ewi {
    public ck6 A0;
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialButtonToggleGroup p0;
    public final ConstraintLayout q0;
    public final ConstraintLayout r0;
    public final Button s0;
    public final Button t0;
    public final MaterialButtonToggleGroup u0;
    public final Button v0;
    public final Button w0;
    public final MaterialTextView x0;
    public CallOutcome y0;
    public Integer z0;

    public sbf(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialButtonToggleGroup materialButtonToggleGroup, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Button button, Button button2, MaterialButtonToggleGroup materialButtonToggleGroup2, Button button3, Button button4, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialButtonToggleGroup;
        this.q0 = constraintLayout;
        this.r0 = constraintLayout2;
        this.s0 = button;
        this.t0 = button2;
        this.u0 = materialButtonToggleGroup2;
        this.v0 = button3;
        this.w0 = button4;
        this.x0 = materialTextView;
    }

    public static sbf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static sbf i0(LayoutInflater layoutInflater, Object obj) {
        return (sbf) ewi.m25668F(layoutInflater, p9e.select_date_format, null, false, obj);
    }
}
