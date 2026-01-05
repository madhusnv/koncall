package p001o;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes3.dex */
public class nfe implements TypeEvaluator {

    /* renamed from: a */
    public final Rect f36796a;

    public nfe(Rect rect) {
        this.f36796a = rect;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        this.f36796a.set(rect.left + ((int) ((rect2.left - r0) * f)), rect.top + ((int) ((rect2.top - r1) * f)), rect.right + ((int) ((rect2.right - r2) * f)), rect.bottom + ((int) ((rect2.bottom - r6) * f)));
        return this.f36796a;
    }
}
