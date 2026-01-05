package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class yof extends ewi {
    public final MaterialTextView n0;
    public final MaterialButton o0;
    public final MaterialTextView p0;
    public final MaterialButton q0;
    public final ConstraintLayout r0;
    public final ConstraintLayout s0;

    public yof(Object obj, View view, int i, MaterialTextView materialTextView, MaterialButton materialButton, MaterialTextView materialTextView2, MaterialButton materialButton2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = materialButton;
        this.p0 = materialTextView2;
        this.q0 = materialButton2;
        this.r0 = constraintLayout;
        this.s0 = constraintLayout2;
    }

    public static yof h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static yof i0(LayoutInflater layoutInflater, Object obj) {
        return (yof) ewi.m25668F(layoutInflater, p9e.sheet_tasks_more, null, false, obj);
    }
}
