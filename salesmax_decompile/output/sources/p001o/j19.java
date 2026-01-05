package p001o;

import ai.salesmax.services.model.LeaderboardActivityMetrics;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class j19 extends ewi {
    public ck6 A0;
    public final MaterialTextView n0;
    public final MaterialTextView o0;
    public final ShapeableImageView p0;
    public final MaterialCardView q0;
    public final MaterialButton r0;
    public final MaterialButton s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final MaterialTextView v0;
    public final MaterialCardView w0;
    public final MaterialButton x0;
    public LeaderboardActivityMetrics y0;
    public Integer z0;

    public j19(Object obj, View view, int i, MaterialTextView materialTextView, MaterialTextView materialTextView2, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialTextView materialTextView3, MaterialCardView materialCardView2, MaterialButton materialButton5) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = materialTextView2;
        this.p0 = shapeableImageView;
        this.q0 = materialCardView;
        this.r0 = materialButton;
        this.s0 = materialButton2;
        this.t0 = materialButton3;
        this.u0 = materialButton4;
        this.v0 = materialTextView3;
        this.w0 = materialCardView2;
        this.x0 = materialButton5;
    }

    public abstract void h0(LeaderboardActivityMetrics leaderboardActivityMetrics);
}
