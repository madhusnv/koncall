package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class apf extends ewi {
    public final MaterialButton A0;
    public final MaterialTextView B0;
    public final MaterialTextView n0;
    public final ConstraintLayout o0;
    public final MaterialButton p0;
    public final MaterialTextView q0;
    public final ConstraintLayout r0;
    public final MaterialButton s0;
    public final MaterialTextView t0;
    public final ConstraintLayout u0;
    public final MaterialButton v0;
    public final MaterialTextView w0;
    public final ConstraintLayout x0;
    public final MaterialButton y0;
    public final ConstraintLayout z0;

    public apf(Object obj, View view, int i, MaterialTextView materialTextView, ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialTextView materialTextView2, ConstraintLayout constraintLayout2, MaterialButton materialButton2, MaterialTextView materialTextView3, ConstraintLayout constraintLayout3, MaterialButton materialButton3, MaterialTextView materialTextView4, ConstraintLayout constraintLayout4, MaterialButton materialButton4, ConstraintLayout constraintLayout5, MaterialButton materialButton5, MaterialTextView materialTextView5) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = constraintLayout;
        this.p0 = materialButton;
        this.q0 = materialTextView2;
        this.r0 = constraintLayout2;
        this.s0 = materialButton2;
        this.t0 = materialTextView3;
        this.u0 = constraintLayout3;
        this.v0 = materialButton3;
        this.w0 = materialTextView4;
        this.x0 = constraintLayout4;
        this.y0 = materialButton4;
        this.z0 = constraintLayout5;
        this.A0 = materialButton5;
        this.B0 = materialTextView5;
    }

    public static apf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static apf i0(LayoutInflater layoutInflater, Object obj) {
        return (apf) ewi.m25668F(layoutInflater, p9e.sheet_team_chats_more, null, false, obj);
    }
}
