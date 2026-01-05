package p001o;

import ai.salesmax.model.LeadsDeal;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class p6i extends ewi {
    public ck6 A0;
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final Button q0;
    public final Button r0;
    public final MaterialButton s0;
    public final MaterialButton t0;
    public final MaterialTextView u0;
    public final MaterialButtonToggleGroup v0;
    public final MaterialTextView w0;
    public final MaterialTextView x0;
    public LeadsDeal y0;
    public Integer z0;

    public p6i(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, Button button5, MaterialButton materialButton, MaterialButton materialButton2, MaterialTextView materialTextView, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = button4;
        this.r0 = button5;
        this.s0 = materialButton;
        this.t0 = materialButton2;
        this.u0 = materialTextView;
        this.v0 = materialButtonToggleGroup;
        this.w0 = materialTextView2;
        this.x0 = materialTextView3;
    }

    public static p6i h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static p6i i0(LayoutInflater layoutInflater, Object obj) {
        return (p6i) ewi.m25668F(layoutInflater, p9e.update_prospecting_date, null, false, obj);
    }
}
