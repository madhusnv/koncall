package b1;

import al.C0174b;
import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b1.a */
/* loaded from: classes.dex */
public final class C0542a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    public final /* synthetic */ C0174b f3682a;

    public C0542a(C0174b c0174b) {
        this.f3682a = c0174b;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e2) {
        AbstractC4154l.m8923f(e2, "e");
        e2.getX();
        e2.getY();
        return true;
    }
}
