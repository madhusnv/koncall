package ca;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import og.ma;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ca.g */
/* loaded from: classes.dex */
public final class C0935g extends ma {

    /* renamed from: a */
    public final String f5689a;

    public C0935g(String errorMessage) {
        AbstractC4154l.m8923f(errorMessage, "errorMessage");
        this.f5689a = errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0935g) && AbstractC4154l.m8918a(this.f5689a, ((C0935g) obj).f5689a);
    }

    public final int hashCode() {
        return this.f5689a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("Err(errorMessage="), this.f5689a, ')');
    }
}
