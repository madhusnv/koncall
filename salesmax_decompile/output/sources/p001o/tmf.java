package p001o;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class tmf extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;

    public tmf(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
    }

    public static tmf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static tmf i0(LayoutInflater layoutInflater, Object obj) {
        return (tmf) ewi.m25668F(layoutInflater, p9e.sheet_add_user_team, null, false, obj);
    }
}
