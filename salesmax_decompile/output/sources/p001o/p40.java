package p001o;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class p40 extends ewi {
    public final MaterialButton n0;
    public final Chip o0;
    public final Chip p0;
    public final Chip q0;
    public final Chip r0;
    public final Chip s0;
    public final Chip t0;
    public final Chip u0;
    public final ChipGroup v0;
    public final MaterialTextView w0;
    public String x0;

    public p40(Object obj, View view, int i, MaterialButton materialButton, Chip chip, Chip chip2, Chip chip3, Chip chip4, Chip chip5, Chip chip6, Chip chip7, ChipGroup chipGroup, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = chip;
        this.p0 = chip2;
        this.q0 = chip3;
        this.r0 = chip4;
        this.s0 = chip5;
        this.t0 = chip6;
        this.u0 = chip7;
        this.v0 = chipGroup;
        this.w0 = materialTextView;
    }

    public static p40 h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static p40 i0(LayoutInflater layoutInflater, Object obj) {
        return (p40) ewi.m25668F(layoutInflater, p9e.add_task_tag, null, false, obj);
    }

    public abstract void j0(String str);
}
