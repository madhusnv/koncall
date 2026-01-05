package n3;

import android.view.KeyEvent;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n3.b */
/* loaded from: classes.dex */
public final class C4948b {

    /* renamed from: a */
    public final KeyEvent f24634a;

    public final boolean equals(Object obj) {
        if (obj instanceof C4948b) {
            return AbstractC4154l.m8918a(this.f24634a, ((C4948b) obj).f24634a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24634a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f24634a + ')';
    }
}
