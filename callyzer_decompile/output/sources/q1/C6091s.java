package q1;

import androidx.compose.foundation.lazy.layout.C0248b;
import java.util.List;
import kotlin.KotlinNothingValueException;
import n1.AbstractC4941a;
import s1.InterfaceC6730y;
import s4.C6754j;
import s4.EnumC6757m;
import t3.v0;
import t3.w0;
import w2.C7870i;
import w2.InterfaceC7865d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.s */
/* loaded from: classes.dex */
public final class C6091s implements InterfaceC6730y {

    /* renamed from: a */
    public final int f29733a;

    /* renamed from: b */
    public final List f29734b;

    /* renamed from: c */
    public final boolean f29735c;

    /* renamed from: d */
    public final InterfaceC7865d f29736d;

    /* renamed from: e */
    public final C7870i f29737e;

    /* renamed from: f */
    public final EnumC6757m f29738f;

    /* renamed from: g */
    public final int f29739g;

    /* renamed from: h */
    public final long f29740h;

    /* renamed from: i */
    public final Object f29741i;

    /* renamed from: j */
    public final Object f29742j;

    /* renamed from: k */
    public final C0248b f29743k;

    /* renamed from: l */
    public int f29744l;

    /* renamed from: m */
    public final int f29745m;

    /* renamed from: n */
    public final int f29746n;

    /* renamed from: o */
    public final int f29747o;

    /* renamed from: p */
    public boolean f29748p;

    /* renamed from: q */
    public int f29749q = Integer.MIN_VALUE;

    /* renamed from: r */
    public final int[] f29750r;

    public C6091s(int i10, List list, boolean z6, InterfaceC7865d interfaceC7865d, C7870i c7870i, EnumC6757m enumC6757m, int i11, int i12, int i13, long j6, Object obj, Object obj2, C0248b c0248b, long j10) {
        this.f29733a = i10;
        this.f29734b = list;
        this.f29735c = z6;
        this.f29736d = interfaceC7865d;
        this.f29737e = c7870i;
        this.f29738f = enumC6757m;
        this.f29739g = i13;
        this.f29740h = j6;
        this.f29741i = obj;
        this.f29742j = obj2;
        this.f29743k = c0248b;
        int size = list.size();
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            w0 w0Var = (w0) list.get(i15);
            boolean z10 = this.f29735c;
            i14 += z10 ? w0Var.f34031b : w0Var.f34030a;
            iMax = Math.max(iMax, !z10 ? w0Var.f34031b : w0Var.f34030a);
        }
        this.f29745m = i14;
        int i16 = i14 + this.f29739g;
        this.f29746n = i16 >= 0 ? i16 : 0;
        this.f29747o = iMax;
        this.f29750r = new int[this.f29734b.size() * 2];
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: a */
    public final int mo12113a() {
        return this.f29734b.size();
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: b */
    public final int mo12114b() {
        return this.f29746n;
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: c */
    public final boolean mo12115c() {
        return this.f29748p;
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: d */
    public final int mo12116d() {
        return 1;
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: e */
    public final Object mo12117e(int i10) {
        return ((w0) this.f29734b.get(i10)).mo13310C();
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: f */
    public final boolean mo12118f() {
        return this.f29735c;
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: g */
    public final void mo12119g() {
        this.f29748p = true;
    }

    @Override // s1.InterfaceC6730y
    public final int getIndex() {
        return this.f29733a;
    }

    @Override // s1.InterfaceC6730y
    public final Object getKey() {
        return this.f29741i;
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: h */
    public final void mo12120h(int i10, int i11, int i12) {
        m12124l(i10, i11, i12);
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: i */
    public final long mo12121i(int i10) {
        int i11 = i10 * 2;
        int[] iArr = this.f29750r;
        return (iArr[i11] << 32) | (iArr[i11 + 1] & 4294967295L);
    }

    @Override // s1.InterfaceC6730y
    /* renamed from: j */
    public final int mo12122j() {
        return 0;
    }

    /* renamed from: k */
    public final void m12123k(v0 v0Var) {
        if (this.f29749q == Integer.MIN_VALUE) {
            AbstractC4941a.m9884a("position() should be called first");
        }
        List list = this.f29734b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            w0 w0Var = (w0) list.get(i10);
            boolean z6 = this.f29735c;
            if (z6) {
                int i11 = w0Var.f34031b;
            } else {
                int i12 = w0Var.f34030a;
            }
            long jMo12121i = mo12121i(i10);
            this.f29743k.m692a(i10, this.f29741i);
            long jM12942c = C6754j.m12942c(jMo12121i, this.f29740h);
            if (z6) {
                v0.m13323l(v0Var, w0Var, jM12942c);
            } else {
                v0.m13321i(v0Var, w0Var, jM12942c);
            }
        }
    }

    /* renamed from: l */
    public final void m12124l(int i10, int i11, int i12) {
        int i13;
        this.f29744l = i10;
        boolean z6 = this.f29735c;
        this.f29749q = z6 ? i12 : i11;
        List list = this.f29734b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            w0 w0Var = (w0) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f29750r;
            if (z6) {
                InterfaceC7865d interfaceC7865d = this.f29736d;
                if (interfaceC7865d == null) {
                    AbstractC4941a.m9885b("null horizontalAlignment when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                iArr[i15] = interfaceC7865d.mo14847a(w0Var.f34030a, i11, this.f29738f);
                iArr[i15 + 1] = i10;
                i13 = w0Var.f34031b;
            } else {
                iArr[i15] = i10;
                int i16 = i15 + 1;
                C7870i c7870i = this.f29737e;
                if (c7870i == null) {
                    AbstractC4941a.m9885b("null verticalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                iArr[i16] = c7870i.m14849a(w0Var.f34031b, i12);
                i13 = w0Var.f34030a;
            }
            i10 += i13;
        }
    }
}
