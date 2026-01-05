package p001o;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class lmf extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialButton p0;

    public lmf(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialButton3;
    }

    public static lmf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static lmf i0(LayoutInflater layoutInflater, Object obj) {
        return (lmf) ewi.m25668F(layoutInflater, p9e.sheet_add_leads, null, false, obj);
    }
}
