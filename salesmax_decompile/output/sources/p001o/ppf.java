package p001o;

import ai.salesmax.model.Tasks;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ppf extends ewi {
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final MaterialButton q0;
    public final MaterialButtonToggleGroup r0;
    public final MaterialTextView s0;
    public final TextInputEditText t0;
    public final TextInputLayout u0;
    public Tasks v0;

    public ppf(Object obj, View view, int i, Button button, Button button2, Button button3, MaterialButton materialButton, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = materialButton;
        this.r0 = materialButtonToggleGroup;
        this.s0 = materialTextView;
        this.t0 = textInputEditText;
        this.u0 = textInputLayout;
    }

    public static ppf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static ppf i0(LayoutInflater layoutInflater, Object obj) {
        return (ppf) ewi.m25668F(layoutInflater, p9e.sheet_video_meeting_outcome, null, false, obj);
    }

    public abstract void j0(Tasks tasks);
}
