package p001o;

import ai.salesmax.model.Tasks;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class x09 extends ewi {
    public ck6 A0;
    public final HorizontalScrollView n0;
    public final t14 o0;
    public final MaterialCardView p0;
    public final ShapeableImageView q0;
    public final Chip r0;
    public final MaterialButton s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final MaterialTextView v0;
    public final MaterialTextView w0;
    public final MaterialTextView x0;
    public Tasks y0;
    public Integer z0;

    public x09(Object obj, View view, int i, HorizontalScrollView horizontalScrollView, t14 t14Var, MaterialCardView materialCardView, ShapeableImageView shapeableImageView, Chip chip, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        super(obj, view, i);
        this.n0 = horizontalScrollView;
        this.o0 = t14Var;
        this.p0 = materialCardView;
        this.q0 = shapeableImageView;
        this.r0 = chip;
        this.s0 = materialButton;
        this.t0 = materialButton2;
        this.u0 = materialButton3;
        this.v0 = materialTextView;
        this.w0 = materialTextView2;
        this.x0 = materialTextView3;
    }
}
