package hc;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hc.h */
/* loaded from: classes.dex */
public final class C2885h extends AbstractC2887j {

    /* renamed from: a */
    public final Number f15912a;

    public C2885h(Number value) {
        AbstractC4154l.m8923f(value, "value");
        this.f15912a = value;
        if ((!(value instanceof Double) || Math.abs(value.doubleValue()) <= Double.MAX_VALUE) && (!(value instanceof Float) || Math.abs(value.floatValue()) <= Float.MAX_VALUE)) {
            return;
        }
        throw new IllegalArgumentException("a document number cannot be " + value + ", as its value cannot be preserved across serde");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2885h) && AbstractC4154l.m8918a(this.f15912a, ((C2885h) obj).f15912a);
    }

    public final int hashCode() {
        return this.f15912a.hashCode();
    }

    public final String toString() {
        return this.f15912a.toString();
    }
}
