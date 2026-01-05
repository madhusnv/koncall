package p001o;

import ai.salesmax.model.DealStageDefinition;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class mw extends ewi {
    public final RecyclerView A0;
    public final RecyclerView B0;
    public final MaterialTextView C0;
    public final MaterialButtonToggleGroup D0;
    public DealStageDefinition E0;
    public Integer F0;
    public ck6 G0;
    public final Button n0;
    public final Button o0;
    public final MaterialButton p0;
    public final MaterialButton q0;
    public final MaterialButton r0;
    public final MaterialTextView s0;
    public final MaterialTextView t0;
    public final TextInputEditText u0;
    public final TextInputLayout v0;
    public final TextInputEditText w0;
    public final TextInputLayout x0;
    public final MaterialCardView y0;
    public final MaterialTextView z0;

    public mw(Object obj, View view, int i, Button button, Button button2, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialTextView materialTextView, MaterialTextView materialTextView2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, MaterialCardView materialCardView, MaterialTextView materialTextView3, RecyclerView recyclerView, RecyclerView recyclerView2, MaterialTextView materialTextView4, MaterialButtonToggleGroup materialButtonToggleGroup) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = materialButton;
        this.q0 = materialButton2;
        this.r0 = materialButton3;
        this.s0 = materialTextView;
        this.t0 = materialTextView2;
        this.u0 = textInputEditText;
        this.v0 = textInputLayout;
        this.w0 = textInputEditText2;
        this.x0 = textInputLayout2;
        this.y0 = materialCardView;
        this.z0 = materialTextView3;
        this.A0 = recyclerView;
        this.B0 = recyclerView2;
        this.C0 = materialTextView4;
        this.D0 = materialButtonToggleGroup;
    }

    public static mw h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static mw i0(LayoutInflater layoutInflater, Object obj) {
        return (mw) ewi.m25668F(layoutInflater, p9e.add_deal_stage, null, false, obj);
    }

    public abstract void j0(DealStageDefinition dealStageDefinition);
}
