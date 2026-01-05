package p001o;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class d40 extends ewi {
    public final MaterialButton n0;
    public final Chip o0;
    public final ChipGroup p0;
    public final Chip q0;
    public final Chip r0;
    public final MaterialTextView s0;
    public String t0;

    public d40(Object obj, View view, int i, MaterialButton materialButton, Chip chip, ChipGroup chipGroup, Chip chip2, Chip chip3, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = chip;
        this.p0 = chipGroup;
        this.q0 = chip2;
        this.r0 = chip3;
        this.s0 = materialTextView;
    }

    public static d40 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static d40 i0(LayoutInflater layoutInflater, Object obj) {
        return (d40) ewi.m25668F(layoutInflater, p9e.add_task_contact_mode, null, false, obj);
    }

    public abstract void j0(String str);
}
