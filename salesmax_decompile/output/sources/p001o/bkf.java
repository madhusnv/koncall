package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class bkf extends ewi {
    public final Chip A0;
    public boolean A1;
    public final RecyclerView B0;
    public boolean B1;
    public final MaterialSwitch C0;
    public final MaterialTextView D0;
    public final ConstraintLayout E0;
    public final MaterialSwitch F0;
    public final MaterialTextView G0;
    public final MaterialSwitch H0;
    public final MaterialTextView I0;
    public final MaterialSwitch J0;
    public final MaterialButton K0;
    public final MaterialTextView L0;
    public final MaterialTextView M0;
    public final MaterialSwitch N0;
    public final MaterialTextView O0;
    public final RecyclerView P0;
    public final MaterialTextView Q0;
    public final MaterialSwitch R0;
    public final MaterialSwitch S0;
    public final MaterialTextView T0;
    public final MaterialButton U0;
    public final ShapeableImageView V0;
    public final MaterialCardView W0;
    public final MaterialTextView X0;
    public final MaterialSwitch Y0;
    public final Button Z0;
    public final Button a1;
    public final Button b1;
    public final Button c1;
    public final HorizontalScrollView d1;
    public final ChipGroup e1;
    public final MaterialTextView f1;
    public final MaterialButtonToggleGroup g1;
    public final MaterialButtonToggleGroup h1;
    public final MaterialTextView i1;
    public final MaterialTextView j1;
    public final MaterialTextView k1;
    public final MaterialTextView l1;
    public final MaterialSwitch m1;
    public final MaterialSwitch n0;
    public boolean n1;
    public final MaterialSwitch o0;
    public boolean o1;
    public final ConstraintLayout p0;
    public boolean p1;
    public final MaterialButton q0;
    public boolean q1;
    public final MaterialTextView r0;
    public boolean r1;
    public final MaterialSwitch s0;
    public boolean s1;
    public final MaterialButton t0;
    public String t1;
    public final Chip u0;
    public String u1;
    public final Chip v0;
    public boolean v1;
    public final Chip w0;
    public boolean w1;
    public final Chip x0;
    public boolean x1;
    public final Chip y0;
    public boolean y1;
    public final Chip z0;
    public boolean z1;

    public bkf(Object obj, View view, int i, MaterialSwitch materialSwitch, MaterialSwitch materialSwitch2, ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialTextView materialTextView, MaterialSwitch materialSwitch3, MaterialButton materialButton2, Chip chip, Chip chip2, Chip chip3, Chip chip4, Chip chip5, Chip chip6, Chip chip7, RecyclerView recyclerView, MaterialSwitch materialSwitch4, MaterialTextView materialTextView2, ConstraintLayout constraintLayout2, MaterialSwitch materialSwitch5, MaterialTextView materialTextView3, MaterialSwitch materialSwitch6, MaterialTextView materialTextView4, MaterialSwitch materialSwitch7, MaterialButton materialButton3, MaterialTextView materialTextView5, MaterialTextView materialTextView6, MaterialSwitch materialSwitch8, MaterialTextView materialTextView7, RecyclerView recyclerView2, MaterialTextView materialTextView8, MaterialSwitch materialSwitch9, MaterialSwitch materialSwitch10, MaterialTextView materialTextView9, MaterialButton materialButton4, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, MaterialTextView materialTextView10, MaterialSwitch materialSwitch11, Button button, Button button2, Button button3, Button button4, HorizontalScrollView horizontalScrollView, ChipGroup chipGroup, MaterialTextView materialTextView11, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialButtonToggleGroup materialButtonToggleGroup2, MaterialTextView materialTextView12, MaterialTextView materialTextView13, MaterialTextView materialTextView14, MaterialTextView materialTextView15, MaterialSwitch materialSwitch12) {
        super(obj, view, i);
        this.n0 = materialSwitch;
        this.o0 = materialSwitch2;
        this.p0 = constraintLayout;
        this.q0 = materialButton;
        this.r0 = materialTextView;
        this.s0 = materialSwitch3;
        this.t0 = materialButton2;
        this.u0 = chip;
        this.v0 = chip2;
        this.w0 = chip3;
        this.x0 = chip4;
        this.y0 = chip5;
        this.z0 = chip6;
        this.A0 = chip7;
        this.B0 = recyclerView;
        this.C0 = materialSwitch4;
        this.D0 = materialTextView2;
        this.E0 = constraintLayout2;
        this.F0 = materialSwitch5;
        this.G0 = materialTextView3;
        this.H0 = materialSwitch6;
        this.I0 = materialTextView4;
        this.J0 = materialSwitch7;
        this.K0 = materialButton3;
        this.L0 = materialTextView5;
        this.M0 = materialTextView6;
        this.N0 = materialSwitch8;
        this.O0 = materialTextView7;
        this.P0 = recyclerView2;
        this.Q0 = materialTextView8;
        this.R0 = materialSwitch9;
        this.S0 = materialSwitch10;
        this.T0 = materialTextView9;
        this.U0 = materialButton4;
        this.V0 = shapeableImageView;
        this.W0 = materialCardView;
        this.X0 = materialTextView10;
        this.Y0 = materialSwitch11;
        this.Z0 = button;
        this.a1 = button2;
        this.b1 = button3;
        this.c1 = button4;
        this.d1 = horizontalScrollView;
        this.e1 = chipGroup;
        this.f1 = materialTextView11;
        this.g1 = materialButtonToggleGroup;
        this.h1 = materialButtonToggleGroup2;
        this.i1 = materialTextView12;
        this.j1 = materialTextView13;
        this.k1 = materialTextView14;
        this.l1 = materialTextView15;
        this.m1 = materialSwitch12;
    }

    public static bkf h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static bkf i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (bkf) ewi.m25668F(layoutInflater, p9e.settings_fragment, viewGroup, z, obj);
    }

    public abstract void j0(boolean z);

    public abstract void k0(boolean z);

    public abstract void l0(boolean z);

    public abstract void m0(boolean z);

    public abstract void n0(boolean z);

    public abstract void p0(boolean z);

    public abstract void q0(boolean z);

    public abstract void s0(boolean z);

    public abstract void t0(boolean z);

    public abstract void u0(boolean z);

    public abstract void v0(String str);

    public abstract void w0(boolean z);

    public abstract void x0(boolean z);

    public abstract void y0(boolean z);
}
