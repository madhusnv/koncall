package hy;

import a2.AbstractC0030c;
import an.j2;
import aw.C0465e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jy.InterfaceC3873j;
import jy.n0;
import kotlin.jvm.internal.AbstractC4154l;
import mx.C4906b;
import og.nd;
import pg.AbstractC5942w;
import pg.w9;
import qc.C6158d;
import qw.C6361k;
import qw.C6366p;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import rw.C6671u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hy.g */
/* loaded from: classes3.dex */
public final class C3056g implements InterfaceC3055f, InterfaceC3873j {

    /* renamed from: a */
    public final String f16397a;

    /* renamed from: b */
    public final AbstractC5942w f16398b;

    /* renamed from: c */
    public final int f16399c;

    /* renamed from: d */
    public final List f16400d;

    /* renamed from: e */
    public final HashSet f16401e;

    /* renamed from: f */
    public final String[] f16402f;

    /* renamed from: g */
    public final InterfaceC3055f[] f16403g;

    /* renamed from: h */
    public final List[] f16404h;

    /* renamed from: i */
    public final boolean[] f16405i;

    /* renamed from: j */
    public final Map f16406j;

    /* renamed from: k */
    public final InterfaceC3055f[] f16407k;

    /* renamed from: l */
    public final C6366p f16408l;

    public C3056g(String serialName, AbstractC5942w abstractC5942w, int i10, List list, C3050a c3050a) {
        AbstractC4154l.m8923f(serialName, "serialName");
        this.f16397a = serialName;
        this.f16398b = abstractC5942w;
        this.f16399c = i10;
        this.f16400d = c3050a.f16381b;
        ArrayList arrayList = c3050a.f16382c;
        AbstractC4154l.m8923f(arrayList, "<this>");
        HashSet hashSet = new HashSet(AbstractC6674x.m12776d(AbstractC6664n.m12768r(arrayList, 12)));
        AbstractC6663m.a0(arrayList, hashSet);
        this.f16401e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f16402f = strArr;
        this.f16403g = n0.m8422c(c3050a.f16384e);
        this.f16404h = (List[]) c3050a.f16385f.toArray(new List[0]);
        this.f16405i = AbstractC6663m.m12762Z(c3050a.f16386g);
        AbstractC4154l.m8923f(strArr, "<this>");
        C3057h c3057h = new C3057h(3, new C6158d(3, strArr));
        ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(c3057h, 10));
        Iterator it = c3057h.iterator();
        while (true) {
            C4906b c4906b = (C4906b) it;
            if (!c4906b.f24442b.hasNext()) {
                this.f16406j = AbstractC6674x.m12784l(arrayList2);
                this.f16407k = n0.m8422c(list);
                this.f16408l = nd.m10782c(new C0465e(11, this));
                return;
            }
            C6671u c6671u = (C6671u) c4906b.next();
            arrayList2.add(new C6361k(c6671u.f31947b, Integer.valueOf(c6671u.f31946a)));
        }
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: a */
    public final String mo7277a() {
        return this.f16397a;
    }

    @Override // jy.InterfaceC3873j
    /* renamed from: b */
    public final Set mo7286b() {
        return this.f16401e;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: c */
    public final boolean mo7278c() {
        return false;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: d */
    public final int mo7279d(String name) {
        AbstractC4154l.m8923f(name, "name");
        Integer num = (Integer) this.f16406j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: e */
    public final AbstractC5942w mo7280e() {
        return this.f16398b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3056g) {
            InterfaceC3055f interfaceC3055f = (InterfaceC3055f) obj;
            if (AbstractC4154l.m8918a(this.f16397a, interfaceC3055f.mo7277a()) && Arrays.equals(this.f16407k, ((C3056g) obj).f16407k)) {
                int iMo7281f = interfaceC3055f.mo7281f();
                int i10 = this.f16399c;
                if (i10 == iMo7281f) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        InterfaceC3055f[] interfaceC3055fArr = this.f16403g;
                        if (AbstractC4154l.m8918a(interfaceC3055fArr[i11].mo7277a(), interfaceC3055f.mo7284i(i11).mo7277a()) && AbstractC4154l.m8918a(interfaceC3055fArr[i11].mo7280e(), interfaceC3055f.mo7284i(i11).mo7280e())) {
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
        return this.f16399c;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: g */
    public final String mo7282g(int i10) {
        return this.f16402f[i10];
    }

    @Override // hy.InterfaceC3055f
    public final List getAnnotations() {
        return this.f16400d;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: h */
    public final List mo7283h(int i10) {
        return this.f16404h[i10];
    }

    public final int hashCode() {
        return ((Number) this.f16408l.getValue()).intValue();
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: i */
    public final InterfaceC3055f mo7284i(int i10) {
        return this.f16403g[i10];
    }

    @Override // hy.InterfaceC3055f
    public final boolean isInline() {
        return false;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: j */
    public final boolean mo7285j(int i10) {
        return this.f16405i[i10];
    }

    public final String toString() {
        return AbstractC6663m.m12748L(w9.m11919j(0, this.f16399c), ", ", AbstractC0030c.m123n(new StringBuilder(), this.f16397a, '('), ")", new j2(21, this), 24);
    }
}
