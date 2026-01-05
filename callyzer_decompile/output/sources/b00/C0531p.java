package b00;

import com.skydoves.balloon.internals.DefinitionKt;
import i0.m0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import k5.C4006a;
import k5.C4013h;
import k5.C4014i;
import k5.C4016k;
import k5.EnumC4012g;
import kotlin.jvm.internal.AbstractC4154l;
import l5.AbstractC4398q;
import l5.C4382a;
import l5.C4383b;
import l5.C4384c;
import l5.C4387f;
import l5.C4388g;
import l5.C4389h;
import l5.C4390i;
import l5.C4392k;
import l5.C4393l;
import l5.C4395n;
import l5.InterfaceC4385d;
import m5.C4654h;
import rw.AbstractC6663m;
import rw.AbstractC6674x;
import rw.C6669s;
import tb.EnumC7091b;
import tb.EnumC7092c;
import tb.EnumC7093d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.p */
/* loaded from: classes3.dex */
public final class C0531p {

    /* renamed from: a */
    public final /* synthetic */ int f3654a;

    /* renamed from: b */
    public boolean f3655b;

    /* renamed from: c */
    public boolean f3656c;

    /* renamed from: d */
    public Object f3657d;

    /* renamed from: e */
    public Object f3658e;

    /* renamed from: f */
    public Serializable f3659f;

    /* renamed from: g */
    public Object f3660g;

    /* renamed from: h */
    public Object f3661h;

    /* renamed from: i */
    public Object f3662i;

    public C0531p(int i10) {
        this.f3654a = i10;
        switch (i10) {
            case 2:
                break;
            default:
                this.f3659f = EnumC7091b.HTTP_REQUEST_VIA_HEADERS;
                this.f3660g = EnumC7093d.SIGV4;
                this.f3655b = true;
                this.f3656c = true;
                this.f3661h = EnumC7092c.NONE;
                this.f3662i = new hq.d0(2);
                break;
        }
    }

    /* renamed from: a */
    public void m1614a(C4387f c4387f, int i10, ArrayList arrayList, C4393l c4393l) {
        AbstractC4398q abstractC4398q = c4387f.f21963d;
        C4393l c4393l2 = abstractC4398q.f21983c;
        C4387f c4387f2 = abstractC4398q.f21989i;
        C4387f c4387f3 = abstractC4398q.f21988h;
        if (c4393l2 == null) {
            C4014i c4014i = (C4014i) this.f3657d;
            if (abstractC4398q == c4014i.f20762d || abstractC4398q == c4014i.f20763e) {
                return;
            }
            if (c4393l == null) {
                c4393l = new C4393l();
                c4393l.f21975a = null;
                c4393l.f21976b = new ArrayList();
                c4393l.f21975a = abstractC4398q;
                arrayList.add(c4393l);
            }
            abstractC4398q.f21983c = c4393l;
            c4393l.f21976b.add(abstractC4398q);
            ArrayList arrayList2 = c4387f3.f21970k;
            int size = arrayList2.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                InterfaceC4385d interfaceC4385d = (InterfaceC4385d) obj;
                if (interfaceC4385d instanceof C4387f) {
                    m1614a((C4387f) interfaceC4385d, i10, arrayList, c4393l);
                }
            }
            ArrayList arrayList3 = c4387f2.f21970k;
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList3.get(i13);
                i13++;
                InterfaceC4385d interfaceC4385d2 = (InterfaceC4385d) obj2;
                if (interfaceC4385d2 instanceof C4387f) {
                    m1614a((C4387f) interfaceC4385d2, i10, arrayList, c4393l);
                }
            }
            if (i10 == 1 && (abstractC4398q instanceof C4395n)) {
                ArrayList arrayList4 = ((C4395n) abstractC4398q).f21978k.f21970k;
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    InterfaceC4385d interfaceC4385d3 = (InterfaceC4385d) obj3;
                    if (interfaceC4385d3 instanceof C4387f) {
                        m1614a((C4387f) interfaceC4385d3, i10, arrayList, c4393l);
                    }
                }
            }
            ArrayList arrayList5 = c4387f3.f21971l;
            int size4 = arrayList5.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList5.get(i15);
                i15++;
                m1614a((C4387f) obj4, i10, arrayList, c4393l);
            }
            ArrayList arrayList6 = c4387f2.f21971l;
            int size5 = arrayList6.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList6.get(i16);
                i16++;
                m1614a((C4387f) obj5, i10, arrayList, c4393l);
            }
            if (i10 == 1 && (abstractC4398q instanceof C4395n)) {
                ArrayList arrayList7 = ((C4395n) abstractC4398q).f21978k.f21971l;
                int size6 = arrayList7.size();
                while (i11 < size6) {
                    Object obj6 = arrayList7.get(i11);
                    i11++;
                    m1614a((C4387f) obj6, i10, arrayList, c4393l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1615b(k5.C4014i r26) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.C0531p.m1615b(k5.i):void");
    }

    /* renamed from: c */
    public void m1616c() {
        C4014i c4014i = (C4014i) this.f3657d;
        ArrayList arrayList = (ArrayList) this.f3662i;
        ArrayList arrayList2 = (ArrayList) this.f3659f;
        arrayList2.clear();
        C4014i c4014i2 = (C4014i) this.f3658e;
        c4014i2.f20762d.mo9158f();
        C4395n c4395n = c4014i2.f20763e;
        c4395n.mo9158f();
        arrayList2.add(c4014i2.f20762d);
        arrayList2.add(c4395n);
        ArrayList arrayList3 = c4014i2.f44389d0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            C4013h c4013h = (C4013h) obj;
            if (c4013h instanceof C4016k) {
                C4389h c4389h = new C4389h(c4013h);
                c4013h.f20762d.mo9158f();
                c4013h.f20763e.mo9158f();
                c4389h.f21986f = ((C4016k) c4013h).f44408h0;
                arrayList2.add(c4389h);
            } else {
                if (c4013h.m8805o()) {
                    if (c4013h.f20760b == null) {
                        c4013h.f20760b = new C4384c(c4013h, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c4013h.f20760b);
                } else {
                    arrayList2.add(c4013h.f20762d);
                }
                if (c4013h.m8806p()) {
                    if (c4013h.f20761c == null) {
                        c4013h.f20761c = new C4384c(c4013h, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c4013h.f20761c);
                } else {
                    arrayList2.add(c4013h.f20763e);
                }
                if (c4013h instanceof C4006a) {
                    arrayList2.add(new C4390i(c4013h));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            ((AbstractC4398q) obj2).mo9158f();
        }
        int size3 = arrayList2.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            AbstractC4398q abstractC4398q = (AbstractC4398q) obj3;
            if (abstractC4398q.f21982b != c4014i2) {
                abstractC4398q.mo9156d();
            }
        }
        arrayList.clear();
        m1618e(c4014i.f20762d, 0, arrayList);
        m1618e(c4014i.f20763e, 1, arrayList);
        this.f3655b = false;
    }

    /* renamed from: d */
    public int m1617d(C4014i c4014i, int i10) {
        ArrayList arrayList;
        int i11;
        long jMax;
        float f6;
        C4014i c4014i2 = c4014i;
        ArrayList arrayList2 = (ArrayList) this.f3662i;
        int size = arrayList2.size();
        long j6 = 0;
        int i12 = 0;
        long jMax2 = 0;
        while (i12 < size) {
            AbstractC4398q abstractC4398q = ((C4393l) arrayList2.get(i12)).f21975a;
            if (!(abstractC4398q instanceof C4384c) ? !(i10 != 0 ? (abstractC4398q instanceof C4395n) : (abstractC4398q instanceof C4392k)) : ((C4384c) abstractC4398q).f21986f != i10) {
                C4387f c4387f = (i10 == 0 ? c4014i2.f20762d : c4014i2.f20763e).f21988h;
                C4387f c4387f2 = (i10 == 0 ? c4014i2.f20762d : c4014i2.f20763e).f21989i;
                C4387f c4387f3 = abstractC4398q.f21988h;
                C4387f c4387f4 = abstractC4398q.f21989i;
                boolean zContains = c4387f3.f21971l.contains(c4387f);
                boolean zContains2 = c4387f4.f21971l.contains(c4387f2);
                long jMo9159j = abstractC4398q.mo9159j();
                if (zContains && zContains2) {
                    long jM9171b = C4393l.m9171b(c4387f3, j6);
                    long jM9170a = C4393l.m9170a(c4387f4, j6);
                    long j10 = jM9171b - jMo9159j;
                    int i13 = c4387f4.f21965f;
                    arrayList = arrayList2;
                    i11 = size;
                    if (j10 >= (-i13)) {
                        j10 += i13;
                    }
                    long j11 = c4387f3.f21965f;
                    long j12 = ((-jM9170a) - jMo9159j) - j11;
                    if (j12 >= j11) {
                        j12 -= j11;
                    }
                    C4013h c4013h = abstractC4398q.f21982b;
                    if (i10 == 0) {
                        f6 = c4013h.f20752T;
                    } else if (i10 == 1) {
                        f6 = c4013h.f20753U;
                    } else {
                        c4013h.getClass();
                        f6 = -1.0f;
                    }
                    float f10 = f6 > DefinitionKt.NO_Float_VALUE ? (long) ((j10 / (1.0f - f6)) + (j12 / f6)) : 0L;
                    jMax = (c4387f3.f21965f + ((((long) ((f10 * f6) + 0.5f)) + jMo9159j) + ((long) m0.m7368a(1.0f, f6, f10, 0.5f)))) - c4387f4.f21965f;
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    jMax = zContains ? Math.max(C4393l.m9171b(c4387f3, c4387f3.f21965f), c4387f3.f21965f + jMo9159j) : zContains2 ? Math.max(-C4393l.m9170a(c4387f4, c4387f4.f21965f), (-c4387f4.f21965f) + jMo9159j) : (abstractC4398q.mo9159j() + c4387f3.f21965f) - c4387f4.f21965f;
                }
            } else {
                arrayList = arrayList2;
                i11 = size;
                jMax = j6;
            }
            jMax2 = Math.max(jMax2, jMax);
            i12++;
            c4014i2 = c4014i;
            arrayList2 = arrayList;
            size = i11;
            j6 = 0;
        }
        return (int) jMax2;
    }

    /* renamed from: e */
    public void m1618e(AbstractC4398q abstractC4398q, int i10, ArrayList arrayList) {
        C4387f c4387f = abstractC4398q.f21988h;
        C4387f c4387f2 = abstractC4398q.f21989i;
        ArrayList arrayList2 = c4387f.f21970k;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            InterfaceC4385d interfaceC4385d = (InterfaceC4385d) obj;
            if (interfaceC4385d instanceof C4387f) {
                m1614a((C4387f) interfaceC4385d, i10, arrayList, null);
            } else if (interfaceC4385d instanceof AbstractC4398q) {
                m1614a(((AbstractC4398q) interfaceC4385d).f21988h, i10, arrayList, null);
            }
        }
        ArrayList arrayList3 = c4387f2.f21970k;
        int size2 = arrayList3.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList3.get(i13);
            i13++;
            InterfaceC4385d interfaceC4385d2 = (InterfaceC4385d) obj2;
            if (interfaceC4385d2 instanceof C4387f) {
                m1614a((C4387f) interfaceC4385d2, i10, arrayList, null);
            } else if (interfaceC4385d2 instanceof AbstractC4398q) {
                m1614a(((AbstractC4398q) interfaceC4385d2).f21989i, i10, arrayList, null);
            }
        }
        if (i10 == 1) {
            ArrayList arrayList4 = ((C4395n) abstractC4398q).f21978k.f21970k;
            int size3 = arrayList4.size();
            while (i11 < size3) {
                Object obj3 = arrayList4.get(i11);
                i11++;
                InterfaceC4385d interfaceC4385d3 = (InterfaceC4385d) obj3;
                if (interfaceC4385d3 instanceof C4387f) {
                    m1614a((C4387f) interfaceC4385d3, i10, arrayList, null);
                }
            }
        }
    }

    /* renamed from: f */
    public void m1619f(C4013h c4013h, EnumC4012g enumC4012g, int i10, EnumC4012g enumC4012g2, int i11) {
        C4383b c4383b = (C4383b) this.f3661h;
        c4383b.f21948a = enumC4012g;
        c4383b.f21949b = enumC4012g2;
        c4383b.f21950c = i10;
        c4383b.f21951d = i11;
        ((C4654h) this.f3660g).m9534a(c4013h, c4383b);
        c4013h.m8812v(c4383b.f21952e);
        c4013h.m8809s(c4383b.f21953f);
        c4013h.f20781w = c4383b.f21955h;
        int i12 = c4383b.f21954g;
        c4013h.f20749Q = i12;
        c4013h.f20781w = i12 > 0;
    }

    /* renamed from: g */
    public void m1620g() {
        C4382a c4382a;
        ArrayList arrayList = ((C4014i) this.f3657d).f44389d0;
        int size = arrayList.size();
        char c2 = 0;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            C4013h c4013h = (C4013h) arrayList.get(i10);
            boolean z6 = c4013h.f20759a;
            C4392k c4392k = c4013h.f20762d;
            C4395n c4395n = c4013h.f20763e;
            if (!z6) {
                EnumC4012g[] enumC4012gArr = c4013h.f20741I;
                EnumC4012g enumC4012g = enumC4012gArr[c2];
                EnumC4012g enumC4012g2 = enumC4012gArr[1];
                int i12 = c4013h.f20768j;
                int i13 = c4013h.f20769k;
                EnumC4012g enumC4012g3 = EnumC4012g.WRAP_CONTENT;
                char c10 = (enumC4012g == enumC4012g3 || (enumC4012g == EnumC4012g.MATCH_CONSTRAINT && i12 == 1)) ? (char) 1 : c2;
                char c11 = (enumC4012g2 == enumC4012g3 || (enumC4012g2 == EnumC4012g.MATCH_CONSTRAINT && i13 == 1)) ? (char) 1 : c2;
                C4388g c4388g = c4392k.f21985e;
                C4388g c4388g2 = c4392k.f21985e;
                boolean z10 = c4388g.f21969j;
                C4388g c4388g3 = c4395n.f21985e;
                C4388g c4388g4 = c4395n.f21985e;
                boolean z11 = c4388g3.f21969j;
                if (z10 && z11) {
                    EnumC4012g enumC4012g4 = EnumC4012g.FIXED;
                    m1619f(c4013h, enumC4012g4, c4388g.f21966g, enumC4012g4, c4388g3.f21966g);
                    c4013h.f20759a = true;
                } else if (z10 && c11 != 0) {
                    m1619f(c4013h, EnumC4012g.FIXED, c4388g.f21966g, enumC4012g3, c4388g3.f21966g);
                    if (enumC4012g2 == EnumC4012g.MATCH_CONSTRAINT) {
                        c4388g4.f21972m = c4013h.m8797g();
                    } else {
                        c4388g4.mo9165d(c4013h.m8797g());
                        c4013h.f20759a = true;
                    }
                } else if (z11 && c10 != 0) {
                    m1619f(c4013h, enumC4012g3, c4388g.f21966g, EnumC4012g.FIXED, c4388g3.f21966g);
                    if (enumC4012g == EnumC4012g.MATCH_CONSTRAINT) {
                        c4388g2.f21972m = c4013h.m8800j();
                    } else {
                        c4388g2.mo9165d(c4013h.m8800j());
                        c4013h.f20759a = true;
                    }
                }
                if (c4013h.f20759a && (c4382a = c4395n.f21979l) != null) {
                    c4382a.mo9165d(c4013h.f20749Q);
                }
                c2 = 0;
            }
            i10 = i11;
        }
    }

    public String toString() {
        switch (this.f3654a) {
            case 0:
                Map map = (Map) this.f3662i;
                Long l9 = (Long) this.f3661h;
                Long l10 = (Long) this.f3660g;
                Long l11 = (Long) this.f3659f;
                Long l12 = (Long) this.f3658e;
                ArrayList arrayList = new ArrayList();
                if (this.f3655b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f3656c) {
                    arrayList.add("isDirectory");
                }
                if (l12 != null) {
                    arrayList.add("byteCount=" + l12);
                }
                if (l11 != null) {
                    arrayList.add("createdAt=" + l11);
                }
                if (l10 != null) {
                    arrayList.add("lastModifiedAt=" + l10);
                }
                if (l9 != null) {
                    arrayList.add("lastAccessedAt=" + l9);
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return AbstractC6663m.m12748L(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public C0531p(boolean z6, boolean z10, a0 a0Var, Long l9, Long l10, Long l11, Long l12, Map extras) {
        this.f3654a = 0;
        AbstractC4154l.m8923f(extras, "extras");
        this.f3655b = z6;
        this.f3656c = z10;
        this.f3657d = a0Var;
        this.f3658e = l9;
        this.f3659f = l10;
        this.f3660g = l11;
        this.f3661h = l12;
        this.f3662i = AbstractC6674x.m12785m(extras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0531p(boolean z6, boolean z10, a0 a0Var, Long l9, Long l10, Long l11, Long l12) {
        this(z6, z10, a0Var, l9, l10, l11, l12, C6669s.f31944a);
        this.f3654a = 0;
    }
}
