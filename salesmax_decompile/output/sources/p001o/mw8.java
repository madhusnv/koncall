package p001o;

import ai.salesmax.model.AttendanceInfo;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class mw8 extends ewi {
    public final TextView n0;
    public final FrameLayout o0;
    public final MaterialCardView p0;
    public final ShapeableImageView q0;
    public final ShapeableImageView r0;
    public final MaterialTextView s0;
    public final Chip t0;
    public final Chip u0;
    public final MaterialTextView v0;
    public AttendanceInfo w0;
    public Integer x0;
    public ck6 y0;

    public mw8(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, MaterialCardView materialCardView, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, Chip chip, Chip chip2, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = textView;
        this.o0 = frameLayout;
        this.p0 = materialCardView;
        this.q0 = shapeableImageView;
        this.r0 = shapeableImageView2;
        this.s0 = materialTextView;
        this.t0 = chip;
        this.u0 = chip2;
        this.v0 = materialTextView2;
    }

    public abstract void h0(ck6 ck6Var);

    public abstract void i0(AttendanceInfo attendanceInfo);

    public abstract void j0(Integer num);
}
