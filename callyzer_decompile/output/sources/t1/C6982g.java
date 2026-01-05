package t1;

import java.util.List;
import k1.x0;
import kotlin.KotlinNothingValueException;
import n1.AbstractC4941a;
import s4.EnumC6757m;
import t3.w0;
import w2.C7870i;
import w2.InterfaceC7865d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t1.g */
/* loaded from: classes.dex */
public final class C6982g {

    /* renamed from: a */
    public final int f33789a;

    /* renamed from: b */
    public final List f33790b;

    /* renamed from: c */
    public final long f33791c;

    /* renamed from: d */
    public final Object f33792d;

    /* renamed from: e */
    public final InterfaceC7865d f33793e;

    /* renamed from: f */
    public final C7870i f33794f;

    /* renamed from: g */
    public final EnumC6757m f33795g;

    /* renamed from: h */
    public final boolean f33796h;

    /* renamed from: i */
    public final boolean f33797i;

    /* renamed from: j */
    public final int f33798j;

    /* renamed from: k */
    public final int[] f33799k;

    /* renamed from: l */
    public int f33800l;

    /* renamed from: m */
    public int f33801m;

    public C6982g(int i10, int i11, List list, long j6, Object obj, x0 x0Var, InterfaceC7865d interfaceC7865d, C7870i c7870i, EnumC6757m enumC6757m, boolean z6) {
        this.f33789a = i10;
        this.f33790b = list;
        this.f33791c = j6;
        this.f33792d = obj;
        this.f33793e = interfaceC7865d;
        this.f33794f = c7870i;
        this.f33795g = enumC6757m;
        this.f33796h = z6;
        this.f33797i = x0Var == x0.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            w0 w0Var = (w0) list.get(i12);
            iMax = Math.max(iMax, !this.f33797i ? w0Var.f34031b : w0Var.f34030a);
        }
        this.f33798j = iMax;
        this.f33799k = new int[this.f33790b.size() * 2];
        this.f33801m = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final void m13253a(int i10) {
        this.f33800l += i10;
        int[] iArr = this.f33799k;
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z6 = this.f33797i;
            if ((z6 && i11 % 2 == 1) || (!z6 && i11 % 2 == 0)) {
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    /* renamed from: b */
    public final void m13254b(int i10, int i11, int i12) {
        int i13;
        this.f33800l = i10;
        boolean z6 = this.f33797i;
        this.f33801m = z6 ? i12 : i11;
        List list = this.f33790b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            w0 w0Var = (w0) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f33799k;
            if (z6) {
                InterfaceC7865d interfaceC7865d = this.f33793e;
                if (interfaceC7865d == null) {
                    AbstractC4941a.m9885b("null horizontalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i15] = interfaceC7865d.mo14847a(w0Var.f34030a, i11, this.f33795g);
                iArr[i15 + 1] = i10;
                i13 = w0Var.f34031b;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                C7870i c7870i = this.f33794f;
                if (c7870i == null) {
                    AbstractC4941a.m9885b("null verticalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i16] = c7870i.m14849a(w0Var.f34031b, i12);
                i13 = w0Var.f34030a;
            }
            i10 += i13;
        }
    }
}
