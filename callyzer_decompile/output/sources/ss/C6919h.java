package ss;

import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ss.h */
/* loaded from: classes3.dex */
public final class C6919h extends a0 {

    /* renamed from: a */
    public final C4381z f33437a;

    public C6919h(C4381z number) {
        AbstractC4154l.m8923f(number, "number");
        this.f33437a = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6919h) && AbstractC4154l.m8918a(this.f33437a, ((C6919h) obj).f33437a);
    }

    public final int hashCode() {
        return this.f33437a.hashCode();
    }

    public final String toString() {
        return "NumberChanged(number=" + this.f33437a + ")";
    }
}
