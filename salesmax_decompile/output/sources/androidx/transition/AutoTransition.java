package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        a1();
    }

    public final void a1() {
        X0(1);
        L0(new Fade(2)).L0(new ChangeBounds()).L0(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1();
    }
}
