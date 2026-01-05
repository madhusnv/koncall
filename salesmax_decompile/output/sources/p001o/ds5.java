package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ds5 extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialTextView p0;
    public final ConstraintLayout q0;

    public ds5(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialTextView materialTextView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialTextView;
        this.q0 = constraintLayout;
    }

    public static ds5 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static ds5 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ds5) ewi.m25668F(layoutInflater, p9e.dialog_leave_confirm, viewGroup, z, obj);
    }
}
