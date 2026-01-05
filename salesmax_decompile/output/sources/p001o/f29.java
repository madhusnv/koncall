package p001o;

import ai.salesmax.services.model.LeaderboardActivityMetrics;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class f29 extends ewi {
    public final MaterialTextView n0;
    public final MaterialTextView o0;
    public final ShapeableImageView p0;
    public final MaterialCardView q0;
    public final MaterialCardView r0;
    public LeaderboardActivityMetrics s0;
    public Integer t0;
    public ck6 u0;

    public f29(Object obj, View view, int i, MaterialTextView materialTextView, MaterialTextView materialTextView2, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, MaterialCardView materialCardView2) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = materialTextView2;
        this.p0 = shapeableImageView;
        this.q0 = materialCardView;
        this.r0 = materialCardView2;
    }

    public abstract void h0(LeaderboardActivityMetrics leaderboardActivityMetrics);

    public abstract void i0(Integer num);
}
