package p001o;

import ai.salesmax.model.CallOutcome;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ubf extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialButtonToggleGroup p0;
    public final Button q0;
    public final Button r0;
    public final MaterialTextView s0;
    public CallOutcome t0;
    public Integer u0;
    public ck6 v0;

    public ubf(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialButtonToggleGroup materialButtonToggleGroup, Button button, Button button2, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialButtonToggleGroup;
        this.q0 = button;
        this.r0 = button2;
        this.s0 = materialTextView;
    }

    public static ubf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static ubf i0(LayoutInflater layoutInflater, Object obj) {
        return (ubf) ewi.m25668F(layoutInflater, p9e.select_denomination, null, false, obj);
    }
}
