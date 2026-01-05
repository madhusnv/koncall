package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.materialswitch.MaterialSwitch;

/* loaded from: classes.dex */
public abstract class ur5 extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialSwitch p0;
    public final ConstraintLayout q0;

    public ur5(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialSwitch materialSwitch, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialSwitch;
        this.q0 = constraintLayout;
    }

    public static ur5 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static ur5 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ur5) ewi.m25668F(layoutInflater, p9e.dialog_delete_untrack, viewGroup, z, obj);
    }
}
