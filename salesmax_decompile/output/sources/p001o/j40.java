package p001o;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class j40 extends ewi {
    public final MaterialButton n0;
    public final Chip o0;
    public final Chip p0;
    public final Chip q0;
    public final ChipGroup r0;
    public final Chip s0;
    public final Chip t0;
    public final MaterialTextView u0;
    public String v0;

    public j40(Object obj, View view, int i, MaterialButton materialButton, Chip chip, Chip chip2, Chip chip3, ChipGroup chipGroup, Chip chip4, Chip chip5, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = chip;
        this.p0 = chip2;
        this.q0 = chip3;
        this.r0 = chipGroup;
        this.s0 = chip4;
        this.t0 = chip5;
        this.u0 = materialTextView;
    }

    public static j40 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static j40 i0(LayoutInflater layoutInflater, Object obj) {
        return (j40) ewi.m25668F(layoutInflater, p9e.add_task_priority, null, false, obj);
    }

    public abstract void j0(String str);
}
