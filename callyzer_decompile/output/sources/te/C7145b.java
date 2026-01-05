package te;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import c3.C0850e;
import k2.e1;
import kotlin.jvm.internal.AbstractC4154l;
import og.d2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: te.b */
/* loaded from: classes.dex */
public final class C7145b implements Drawable.Callback {

    /* renamed from: a */
    public final /* synthetic */ C7146c f34377a;

    public C7145b(C7146c c7146c) {
        this.f34377a = c7146c;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable d2) {
        AbstractC4154l.m8923f(d2, "d");
        C7146c c7146c = this.f34377a;
        e1 e1Var = c7146c.f34379g;
        e1Var.setValue(Integer.valueOf(((Number) e1Var.getValue()).intValue() + 1));
        Drawable drawable = c7146c.f34378f;
        Object obj = AbstractC7147d.f34382a;
        c7146c.f34380h.setValue(new C0850e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : d2.m10598a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qw.g] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable d2, Runnable what, long j6) {
        AbstractC4154l.m8923f(d2, "d");
        AbstractC4154l.m8923f(what, "what");
        ((Handler) AbstractC7147d.f34382a.getValue()).postAtTime(what, j6);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qw.g] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable d2, Runnable what) {
        AbstractC4154l.m8923f(d2, "d");
        AbstractC4154l.m8923f(what, "what");
        ((Handler) AbstractC7147d.f34382a.getValue()).removeCallbacks(what);
    }
}
