package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class os5 extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final ConstraintLayout p0;
    public final MaterialTextView q0;

    public os5(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, ConstraintLayout constraintLayout, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = constraintLayout;
        this.q0 = materialTextView;
    }

    public static os5 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static os5 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (os5) ewi.m25668F(layoutInflater, p9e.dialog_update_parent_task, viewGroup, z, obj);
    }
}
