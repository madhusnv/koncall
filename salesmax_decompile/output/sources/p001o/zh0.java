package p001o;

import android.window.BackEvent;

/* loaded from: classes2.dex */
public final class zh0 {

    /* renamed from: a */
    public static final zh0 f57186a = new zh0();

    /* renamed from: a */
    public final BackEvent m59391a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    /* renamed from: b */
    public final float m59392b(BackEvent backEvent) {
        sq8.m48649h(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* renamed from: c */
    public final int m59393c(BackEvent backEvent) {
        sq8.m48649h(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* renamed from: d */
    public final float m59394d(BackEvent backEvent) {
        sq8.m48649h(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* renamed from: e */
    public final float m59395e(BackEvent backEvent) {
        sq8.m48649h(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
