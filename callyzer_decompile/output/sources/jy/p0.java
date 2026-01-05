package jy;

import an.j2;
import ex.InterfaceC2137a;
import fy.InterfaceC2401a;
import hy.C3060k;
import hy.InterfaceC3055f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import pg.AbstractC5942w;
import pg.w9;
import qw.EnumC6359i;
import rw.AbstractC6663m;
import rw.C6668r;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class p0 implements InterfaceC3055f, InterfaceC3873j {

    /* renamed from: a */
    public final String f19941a;

    /* renamed from: b */
    public final InterfaceC3888y f19942b;

    /* renamed from: c */
    public final int f19943c;

    /* renamed from: d */
    public int f19944d = -1;

    /* renamed from: e */
    public final String[] f19945e;

    /* renamed from: f */
    public final List[] f19946f;

    /* renamed from: g */
    public final boolean[] f19947g;

    /* renamed from: h */
    public Object f19948h;

    /* renamed from: i */
    public final Object f19949i;

    /* renamed from: j */
    public final Object f19950j;

    /* renamed from: k */
    public final Object f19951k;

    public p0(String str, InterfaceC3888y interfaceC3888y, int i10) {
        this.f19941a = str;
        this.f19942b = interfaceC3888y;
        this.f19943c = i10;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f19945e = strArr;
        int i12 = this.f19943c;
        this.f19946f = new List[i12];
        this.f19947g = new boolean[i12];
        this.f19948h = C6669s.f31944a;
        EnumC6359i enumC6359i = EnumC6359i.PUBLICATION;
        final int i13 = 0;
        this.f19949i = nd.m10781b(enumC6359i, new InterfaceC2137a(this) { // from class: jy.o0

            /* renamed from: b */
            public final /* synthetic */ p0 f19937b;

            {
                this.f19937b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, qw.g] */
            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                InterfaceC2401a[] interfaceC2401aArrChildSerializers;
                ArrayList arrayList;
                InterfaceC2401a[] interfaceC2401aArrTypeParametersSerializers;
                switch (i13) {
                    case 0:
                        InterfaceC3888y interfaceC3888y2 = this.f19937b.f19942b;
                        return (interfaceC3888y2 == null || (interfaceC2401aArrChildSerializers = interfaceC3888y2.childSerializers()) == null) ? n0.f19931b : interfaceC2401aArrChildSerializers;
                    case 1:
                        InterfaceC3888y interfaceC3888y3 = this.f19937b.f19942b;
                        if (interfaceC3888y3 == null || (interfaceC2401aArrTypeParametersSerializers = interfaceC3888y3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC2401aArrTypeParametersSerializers.length);
                            for (InterfaceC2401a interfaceC2401a : interfaceC2401aArrTypeParametersSerializers) {
                                arrayList.add(interfaceC2401a.getDescriptor());
                            }
                        }
                        return n0.m8422c(arrayList);
                    default:
                        p0 p0Var = this.f19937b;
                        return Integer.valueOf(n0.m8425f(p0Var, (InterfaceC3055f[]) p0Var.f19950j.getValue()));
                }
            }
        });
        final int i14 = 1;
        this.f19950j = nd.m10781b(enumC6359i, new InterfaceC2137a(this) { // from class: jy.o0

            /* renamed from: b */
            public final /* synthetic */ p0 f19937b;

            {
                this.f19937b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, qw.g] */
            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                InterfaceC2401a[] interfaceC2401aArrChildSerializers;
                ArrayList arrayList;
                InterfaceC2401a[] interfaceC2401aArrTypeParametersSerializers;
                switch (i14) {
                    case 0:
                        InterfaceC3888y interfaceC3888y2 = this.f19937b.f19942b;
                        return (interfaceC3888y2 == null || (interfaceC2401aArrChildSerializers = interfaceC3888y2.childSerializers()) == null) ? n0.f19931b : interfaceC2401aArrChildSerializers;
                    case 1:
                        InterfaceC3888y interfaceC3888y3 = this.f19937b.f19942b;
                        if (interfaceC3888y3 == null || (interfaceC2401aArrTypeParametersSerializers = interfaceC3888y3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC2401aArrTypeParametersSerializers.length);
                            for (InterfaceC2401a interfaceC2401a : interfaceC2401aArrTypeParametersSerializers) {
                                arrayList.add(interfaceC2401a.getDescriptor());
                            }
                        }
                        return n0.m8422c(arrayList);
                    default:
                        p0 p0Var = this.f19937b;
                        return Integer.valueOf(n0.m8425f(p0Var, (InterfaceC3055f[]) p0Var.f19950j.getValue()));
                }
            }
        });
        final int i15 = 2;
        this.f19951k = nd.m10781b(enumC6359i, new InterfaceC2137a(this) { // from class: jy.o0

            /* renamed from: b */
            public final /* synthetic */ p0 f19937b;

            {
                this.f19937b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, qw.g] */
            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                InterfaceC2401a[] interfaceC2401aArrChildSerializers;
                ArrayList arrayList;
                InterfaceC2401a[] interfaceC2401aArrTypeParametersSerializers;
                switch (i15) {
                    case 0:
                        InterfaceC3888y interfaceC3888y2 = this.f19937b.f19942b;
                        return (interfaceC3888y2 == null || (interfaceC2401aArrChildSerializers = interfaceC3888y2.childSerializers()) == null) ? n0.f19931b : interfaceC2401aArrChildSerializers;
                    case 1:
                        InterfaceC3888y interfaceC3888y3 = this.f19937b.f19942b;
                        if (interfaceC3888y3 == null || (interfaceC2401aArrTypeParametersSerializers = interfaceC3888y3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC2401aArrTypeParametersSerializers.length);
                            for (InterfaceC2401a interfaceC2401a : interfaceC2401aArrTypeParametersSerializers) {
                                arrayList.add(interfaceC2401a.getDescriptor());
                            }
                        }
                        return n0.m8422c(arrayList);
                    default:
                        p0 p0Var = this.f19937b;
                        return Integer.valueOf(n0.m8425f(p0Var, (InterfaceC3055f[]) p0Var.f19950j.getValue()));
                }
            }
        });
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: a */
    public final String mo7277a() {
        return this.f19941a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // jy.InterfaceC3873j
    /* renamed from: b */
    public final Set mo7286b() {
        return this.f19948h.keySet();
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: c */
    public final boolean mo7278c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // hy.InterfaceC3055f
    /* renamed from: d */
    public final int mo7279d(String name) {
        AbstractC4154l.m8923f(name, "name");
        Integer num = (Integer) this.f19948h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: e */
    public AbstractC5942w mo7280e() {
        return C3060k.f16413b;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qw.g] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, qw.g] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            InterfaceC3055f interfaceC3055f = (InterfaceC3055f) obj;
            if (this.f19941a.equals(interfaceC3055f.mo7277a()) && Arrays.equals((InterfaceC3055f[]) this.f19950j.getValue(), (InterfaceC3055f[]) ((p0) obj).f19950j.getValue())) {
                int iMo7281f = interfaceC3055f.mo7281f();
                int i10 = this.f19943c;
                if (i10 == iMo7281f) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (AbstractC4154l.m8918a(mo7284i(i11).mo7277a(), interfaceC3055f.mo7284i(i11).mo7277a()) && AbstractC4154l.m8918a(mo7284i(i11).mo7280e(), interfaceC3055f.mo7284i(i11).mo7280e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: f */
    public final int mo7281f() {
        return this.f19943c;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: g */
    public final String mo7282g(int i10) {
        return this.f19945e[i10];
    }

    @Override // hy.InterfaceC3055f
    public final List getAnnotations() {
        return C6668r.f31943a;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: h */
    public final List mo7283h(int i10) {
        List list = this.f19946f[i10];
        return list == null ? C6668r.f31943a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qw.g] */
    public int hashCode() {
        return ((Number) this.f19951k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qw.g] */
    @Override // hy.InterfaceC3055f
    /* renamed from: i */
    public InterfaceC3055f mo7284i(int i10) {
        return ((InterfaceC2401a[]) this.f19949i.getValue())[i10].getDescriptor();
    }

    @Override // hy.InterfaceC3055f
    public boolean isInline() {
        return false;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: j */
    public final boolean mo7285j(int i10) {
        return this.f19947g[i10];
    }

    /* renamed from: k */
    public final void m8428k(String name, boolean z6) {
        AbstractC4154l.m8923f(name, "name");
        int i10 = this.f19944d + 1;
        this.f19944d = i10;
        String[] strArr = this.f19945e;
        strArr[i10] = name;
        this.f19947g[i10] = z6;
        this.f19946f[i10] = null;
        if (i10 == this.f19943c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                map.put(strArr[i11], Integer.valueOf(i11));
            }
            this.f19948h = map;
        }
    }

    public String toString() {
        return AbstractC6663m.m12748L(w9.m11919j(0, this.f19943c), ", ", this.f19941a.concat("("), ")", new j2(25, this), 24);
    }
}
