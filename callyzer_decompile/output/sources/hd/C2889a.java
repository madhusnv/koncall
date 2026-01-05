package hd;

import a2.AbstractC0030c;
import fd.InterfaceC2265c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hd.a */
/* loaded from: classes.dex */
public final class C2889a implements InterfaceC2265c {

    /* renamed from: a */
    public final String f15917a;

    public C2889a(String key) {
        AbstractC4154l.m8923f(key, "key");
        this.f15917a = key;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2889a) && AbstractC4154l.m8918a(this.f15917a, ((C2889a) obj).f15917a);
    }

    public final int hashCode() {
        return this.f15917a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("IgnoreKey(key="), this.f15917a, ')');
    }
}
