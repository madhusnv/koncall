package cs;

import es.C2127d;
import kotlin.jvm.internal.AbstractC4154l;
import og.hb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cs.a */
/* loaded from: classes3.dex */
public final class C1482a extends hb {

    /* renamed from: a */
    public final C2127d f7559a;

    public C1482a(C2127d uiModule) {
        AbstractC4154l.m8923f(uiModule, "uiModule");
        this.f7559a = uiModule;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1482a) && AbstractC4154l.m8918a(this.f7559a, ((C1482a) obj).f7559a);
    }

    public final int hashCode() {
        return this.f7559a.hashCode();
    }

    public final String toString() {
        return "EditNote(uiModule=" + this.f7559a + ")";
    }
}
