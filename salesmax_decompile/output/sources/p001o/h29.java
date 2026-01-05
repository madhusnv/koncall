package p001o;

import ai.salesmax.model.RecentAction;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class h29 extends ewi {
    public final FrameLayout n0;
    public final ShapeableImageView o0;
    public final MaterialTextView p0;
    public RecentAction q0;
    public Integer r0;
    public ck6 s0;

    public h29(Object obj, View view, int i, FrameLayout frameLayout, ShapeableImageView shapeableImageView, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = frameLayout;
        this.o0 = shapeableImageView;
        this.p0 = materialTextView;
    }

    public ck6 h0() {
        return this.s0;
    }

    public abstract void i0(ck6 ck6Var);

    public abstract void j0(RecentAction recentAction);

    public abstract void k0(Integer num);
}
