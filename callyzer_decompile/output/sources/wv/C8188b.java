package wv;

import kotlin.jvm.internal.AbstractC4154l;
import th.C7151a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wv.b */
/* loaded from: classes3.dex */
public final class C8188b extends AbstractC8189c {

    /* renamed from: a */
    public final C7151a f39157a;

    public C8188b(C7151a c7151a) {
        this.f39157a = c7151a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8188b) && AbstractC4154l.m8918a(this.f39157a, ((C8188b) obj).f39157a);
    }

    public final int hashCode() {
        return this.f39157a.hashCode();
    }

    public final String toString() {
        return "StartImmediateUpdate(appUpdateInfo=" + this.f39157a + ")";
    }
}
