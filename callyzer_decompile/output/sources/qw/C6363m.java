package qw;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qw.m */
/* loaded from: classes3.dex */
public final class C6363m implements Serializable {

    /* renamed from: a */
    public final Throwable f30757a;

    public C6363m(Throwable exception) {
        AbstractC4154l.m8923f(exception, "exception");
        this.f30757a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6363m) {
            return AbstractC4154l.m8918a(this.f30757a, ((C6363m) obj).f30757a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30757a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f30757a + ')';
    }
}
