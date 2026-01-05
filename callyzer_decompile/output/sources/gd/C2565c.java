package gd;

import a2.AbstractC0030c;
import fd.InterfaceC2265c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gd.c */
/* loaded from: classes.dex */
public final class C2565c implements InterfaceC2265c {

    /* renamed from: a */
    public final String f13973a;

    public C2565c(String name) {
        AbstractC4154l.m8923f(name, "name");
        this.f13973a = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2565c) && AbstractC4154l.m8918a(this.f13973a, ((C2565c) obj).f13973a);
    }

    public final int hashCode() {
        return this.f13973a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("FormUrlSerialName(name="), this.f13973a, ')');
    }
}
