package hc;

import java.math.BigInteger;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hc.a */
/* loaded from: classes.dex */
public final class C2878a extends Number implements Comparable {

    /* renamed from: a */
    public final BigInteger f15905a;

    public C2878a(String str) {
        this.f15905a = new BigInteger(str);
    }

    @Override // java.lang.Number
    public final byte byteValue() {
        return this.f15905a.byteValue();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2878a other = (C2878a) obj;
        AbstractC4154l.m8923f(other, "other");
        return this.f15905a.compareTo(other.f15905a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.f15905a.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2878a) {
            return AbstractC4154l.m8918a(this.f15905a, ((C2878a) obj).f15905a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return this.f15905a.floatValue();
    }

    public final int hashCode() {
        return this.f15905a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.f15905a.intValue();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f15905a.longValue();
    }

    @Override // java.lang.Number
    public final short shortValue() {
        return this.f15905a.shortValue();
    }

    public final String toString() {
        String string = this.f15905a.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2878a(byte[] bytes) {
        AbstractC4154l.m8923f(bytes, "bytes");
        String string = new BigInteger(bytes).toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        this(string);
    }
}
