package p001o;

import ai.salesmax.services.model.LeaderboardActivityMetrics;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class v19 extends ewi {
    public final MaterialTextView n0;
    public final ShapeableImageView o0;
    public final MaterialCardView p0;
    public final MaterialButton q0;
    public final MaterialButton r0;
    public final MaterialButton s0;
    public final MaterialButton t0;
    public final MaterialCardView u0;
    public final MaterialButton v0;
    public LeaderboardActivityMetrics w0;
    public Integer x0;
    public ck6 y0;

    public v19(Object obj, View view, int i, MaterialTextView materialTextView, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialCardView materialCardView2, MaterialButton materialButton5) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = shapeableImageView;
        this.p0 = materialCardView;
        this.q0 = materialButton;
        this.r0 = materialButton2;
        this.s0 = materialButton3;
        this.t0 = materialButton4;
        this.u0 = materialCardView2;
        this.v0 = materialButton5;
    }

    public abstract void h0(LeaderboardActivityMetrics leaderboardActivityMetrics);

    public abstract void i0(Integer num);
}
