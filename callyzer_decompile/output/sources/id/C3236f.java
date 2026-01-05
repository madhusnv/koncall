package id;

import a2.AbstractC0030c;
import fd.InterfaceC2265c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: id.f */
/* loaded from: classes.dex */
public final class C3236f implements InterfaceC2265c {

    /* renamed from: a */
    public final String f17401a;

    public C3236f(String str) {
        this.f17401a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3236f) && AbstractC4154l.m8918a(this.f17401a, ((C3236f) obj).f17401a);
    }

    public final int hashCode() {
        return this.f17401a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("XmlSerialName(name="), this.f17401a, ')');
    }
}
