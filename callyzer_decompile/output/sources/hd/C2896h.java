package hd;

import a2.AbstractC0030c;
import fd.InterfaceC2265c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hd.h */
/* loaded from: classes.dex */
public final class C2896h implements InterfaceC2265c {

    /* renamed from: a */
    public final String f15930a;

    public C2896h(String str) {
        this.f15930a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2896h) && AbstractC4154l.m8918a(this.f15930a, ((C2896h) obj).f15930a);
    }

    public final int hashCode() {
        return this.f15930a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("JsonSerialName(name="), this.f15930a, ')');
    }
}
