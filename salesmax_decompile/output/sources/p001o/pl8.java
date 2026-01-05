package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class pl8 {

    /* renamed from: a */
    public int[] f40227a = new int[10];

    /* renamed from: b */
    public int f40228b;

    /* renamed from: a */
    public final void m43828a() {
        this.f40228b = 0;
    }

    /* renamed from: b */
    public final int m43829b() {
        return this.f40228b;
    }

    /* renamed from: c */
    public final int m43830c(int i) {
        int i2 = this.f40228b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f40227a[i3] == i) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final boolean m43831d() {
        return this.f40228b == 0;
    }

    /* renamed from: e */
    public final int m43832e() {
        return this.f40227a[this.f40228b - 1];
    }

    /* renamed from: f */
    public final int m43833f(int i) {
        return this.f40227a[i];
    }

    /* renamed from: g */
    public final int m43834g(int i) {
        return this.f40228b > 0 ? m43832e() : i;
    }

    /* renamed from: h */
    public final int m43835h() {
        int[] iArr = this.f40227a;
        int i = this.f40228b - 1;
        this.f40228b = i;
        return iArr[i];
    }

    /* renamed from: i */
    public final void m43836i(int i) {
        int i2 = this.f40228b;
        int[] iArr = this.f40227a;
        if (i2 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            sq8.m48648g(iArrCopyOf, "copyOf(this, newSize)");
            this.f40227a = iArrCopyOf;
        }
        int[] iArr2 = this.f40227a;
        int i3 = this.f40228b;
        this.f40228b = i3 + 1;
        iArr2[i3] = i;
    }
}
