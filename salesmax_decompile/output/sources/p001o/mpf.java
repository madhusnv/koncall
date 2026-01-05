package p001o;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class mpf extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;

    public mpf(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
    }

    public static mpf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static mpf i0(LayoutInflater layoutInflater, Object obj) {
        return (mpf) ewi.m25668F(layoutInflater, p9e.sheet_user_selection, null, false, obj);
    }
}
