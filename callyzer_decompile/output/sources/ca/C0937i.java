package ca;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import og.na;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ca.i */
/* loaded from: classes.dex */
public final class C0937i extends na {

    /* renamed from: a */
    public final String f5691a;

    public C0937i(String str) {
        this.f5691a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0937i) && AbstractC4154l.m8918a(this.f5691a, ((C0937i) obj).f5691a);
    }

    public final int hashCode() {
        return this.f5691a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("Named(name="), this.f5691a, ')');
    }
}
