package ca;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import og.la;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ca.d */
/* loaded from: classes.dex */
public final class C0932d extends la {

    /* renamed from: a */
    public final String f5680a;

    public C0932d(String str) {
        this.f5680a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0932d) && AbstractC4154l.m8918a(this.f5680a, ((C0932d) obj).f5680a);
    }

    public final int hashCode() {
        return this.f5680a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("Process(command="), this.f5680a, ')');
    }
}
