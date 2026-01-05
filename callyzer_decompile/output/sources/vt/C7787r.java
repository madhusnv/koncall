package vt;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.m6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vt.r */
/* loaded from: classes3.dex */
public final class C7787r extends m6 {

    /* renamed from: a */
    public final Exception f37451a;

    public C7787r(Exception exc) {
        this.f37451a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7787r) && AbstractC4154l.m8918a(this.f37451a, ((C7787r) obj).f37451a);
    }

    public final int hashCode() {
        return this.f37451a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11237h("WriteTraceLog(exception=", ")", this.f37451a);
    }
}
