package p001o;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class nnf extends ewi {
    public final MaterialTextView A0;
    public final Chip B0;
    public final Chip C0;
    public final Chip D0;
    public final Chip E0;
    public final Chip F0;
    public final Chip G0;
    public final Chip H0;
    public final Chip I0;
    public final MaterialTextView J0;
    public final ShapeableImageView K0;
    public String L0;
    public final ShapeableImageView n0;
    public final ConstraintLayout o0;
    public final MaterialButton p0;
    public final MaterialTextView q0;
    public final ChipGroup r0;
    public final MaterialButton s0;
    public final TextInputEditText t0;
    public final TextInputLayout u0;
    public final TextInputEditText v0;
    public final TextInputLayout w0;
    public final MaterialSwitch x0;
    public final MaterialSwitch y0;
    public final MaterialCardView z0;

    public nnf(Object obj, View view, int i, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialTextView materialTextView, ChipGroup chipGroup, MaterialButton materialButton2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, MaterialSwitch materialSwitch, MaterialSwitch materialSwitch2, MaterialCardView materialCardView, MaterialTextView materialTextView2, Chip chip, Chip chip2, Chip chip3, Chip chip4, Chip chip5, Chip chip6, Chip chip7, Chip chip8, MaterialTextView materialTextView3, ShapeableImageView shapeableImageView2) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = constraintLayout;
        this.p0 = materialButton;
        this.q0 = materialTextView;
        this.r0 = chipGroup;
        this.s0 = materialButton2;
        this.t0 = textInputEditText;
        this.u0 = textInputLayout;
        this.v0 = textInputEditText2;
        this.w0 = textInputLayout2;
        this.x0 = materialSwitch;
        this.y0 = materialSwitch2;
        this.z0 = materialCardView;
        this.A0 = materialTextView2;
        this.B0 = chip;
        this.C0 = chip2;
        this.D0 = chip3;
        this.E0 = chip4;
        this.F0 = chip5;
        this.G0 = chip6;
        this.H0 = chip7;
        this.I0 = chip8;
        this.J0 = materialTextView3;
        this.K0 = shapeableImageView2;
    }

    public static nnf h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static nnf i0(LayoutInflater layoutInflater, Object obj) {
        return (nnf) ewi.m25668F(layoutInflater, p9e.sheet_create_team_account, null, false, obj);
    }
}
