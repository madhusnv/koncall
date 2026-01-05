package p001o;

import ai.salesmax.model.NotificationStagingInfo;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class p19 extends ewi {
    public final TextView n0;
    public final ShapeableImageView o0;
    public final MaterialTextView p0;
    public final MaterialCardView q0;
    public final FrameLayout r0;
    public final MaterialTextView s0;
    public final MaterialTextView t0;
    public NotificationStagingInfo u0;
    public Integer v0;
    public ck6 w0;

    public p19(Object obj, View view, int i, TextView textView, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialCardView materialCardView, FrameLayout frameLayout, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        super(obj, view, i);
        this.n0 = textView;
        this.o0 = shapeableImageView;
        this.p0 = materialTextView;
        this.q0 = materialCardView;
        this.r0 = frameLayout;
        this.s0 = materialTextView2;
        this.t0 = materialTextView3;
    }
}
