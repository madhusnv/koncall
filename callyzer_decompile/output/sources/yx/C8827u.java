package yx;

import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7563g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yx.u */
/* loaded from: classes3.dex */
public final class C8827u implements InterfaceC7563g {

    /* renamed from: a */
    public final ThreadLocal f42524a;

    public C8827u(ThreadLocal threadLocal) {
        this.f42524a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8827u) && AbstractC4154l.m8918a(this.f42524a, ((C8827u) obj).f42524a);
    }

    public final int hashCode() {
        return this.f42524a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f42524a + ')';
    }
}
