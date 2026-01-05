package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ee extends ewi {
    public final MaterialButton n0;
    public final MaterialButton o0;
    public final MaterialButton p0;
    public final Chip q0;
    public final Chip r0;
    public final Chip s0;
    public final ShapeableImageView t0;
    public final MaterialCardView u0;
    public final MaterialTextView v0;
    public final MaterialButton w0;
    public final MaterialButton x0;

    public ee(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, Chip chip, Chip chip2, Chip chip3, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, MaterialTextView materialTextView, MaterialButton materialButton4, MaterialButton materialButton5) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialButton2;
        this.p0 = materialButton3;
        this.q0 = chip;
        this.r0 = chip2;
        this.s0 = chip3;
        this.t0 = shapeableImageView;
        this.u0 = materialCardView;
        this.v0 = materialTextView;
        this.w0 = materialButton4;
        this.x0 = materialButton5;
    }

    public static ee h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static ee i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ee) ewi.m25668F(layoutInflater, p9e.account_defaults_fragment, viewGroup, z, obj);
    }
}
