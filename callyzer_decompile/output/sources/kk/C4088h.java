package kk;

import com.google.android.gms.internal.measurement.j4;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import mk.C4766e;
import mk.C4772k;
import nk.C5079b;
import nk.C5081d;
import nk.C5085h;
import nk.C5089l;
import nk.C5091n;
import nk.C5098u;
import nk.C5100w;
import nk.C5102y;
import nk.b1;
import nk.d1;
import nk.e0;
import nk.m1;
import qk.AbstractC6243f;
import rk.C6566c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kk.h */
/* loaded from: classes.dex */
public final class C4088h {

    /* renamed from: i */
    public static final C4083c f20969i = C4083c.f20961d;

    /* renamed from: j */
    public static final EnumC4081a f20970j = EnumC4081a.IDENTITY;

    /* renamed from: k */
    public static final EnumC4100t f20971k = EnumC4100t.DOUBLE;

    /* renamed from: l */
    public static final EnumC4100t f20972l = EnumC4100t.LAZILY_PARSED_NUMBER;

    /* renamed from: a */
    public final ThreadLocal f20973a;

    /* renamed from: b */
    public final ConcurrentHashMap f20974b;

    /* renamed from: c */
    public final j4 f20975c;

    /* renamed from: d */
    public final C5089l f20976d;

    /* renamed from: e */
    public final List f20977e;

    /* renamed from: f */
    public final boolean f20978f;

    /* renamed from: g */
    public final C4083c f20979g;

    /* renamed from: h */
    public final EnumC4099s f20980h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4088h() {
        C4766e c4766e = C4766e.f23778c;
        Map map = Collections.EMPTY_MAP;
        EnumC4097q enumC4097q = EnumC4097q.DEFAULT;
        List list = Collections.EMPTY_LIST;
        this(c4766e, f20970j, map, true, f20969i, null, true, enumC4097q, list, f20971k, f20972l, list);
    }

    /* renamed from: a */
    public static void m8854a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: b */
    public final Object m8855b(Class cls, String str) {
        return m8856c(str, TypeToken.get(cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8856c(java.lang.String r10, com.google.gson.reflect.TypeToken r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.C4088h.m8856c(java.lang.String, com.google.gson.reflect.TypeToken):java.lang.Object");
    }

    /* renamed from: d */
    public final Object m8857d(String str, Type type) {
        return m8856c(str, TypeToken.get(type));
    }

    /* renamed from: e */
    public final AbstractC4103w m8858e(TypeToken typeToken) {
        boolean z6;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f20974b;
        AbstractC4103w abstractC4103w = (AbstractC4103w) concurrentHashMap.get(typeToken);
        if (abstractC4103w != null) {
            return abstractC4103w;
        }
        ThreadLocal threadLocal = this.f20973a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z6 = true;
        } else {
            AbstractC4103w abstractC4103w2 = (AbstractC4103w) map.get(typeToken);
            if (abstractC4103w2 != null) {
                return abstractC4103w2;
            }
            z6 = false;
        }
        try {
            C4087g c4087g = new C4087g();
            map.put(typeToken, c4087g);
            Iterator it = this.f20977e.iterator();
            AbstractC4103w abstractC4103wMo8877a = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC4103wMo8877a = ((InterfaceC4104x) it.next()).mo8877a(this, typeToken);
                if (abstractC4103wMo8877a != null) {
                    if (c4087g.f20968a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c4087g.f20968a = abstractC4103wMo8877a;
                    map.put(typeToken, abstractC4103wMo8877a);
                }
            }
            if (z6) {
                threadLocal.remove();
            }
            if (abstractC4103wMo8877a != null) {
                if (z6) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC4103wMo8877a;
            }
            throw new IllegalArgumentException("GSON (2.13.1) cannot handle " + typeToken);
        } catch (Throwable th2) {
            if (z6) {
                threadLocal.remove();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kk.AbstractC4103w m8859f(kk.InterfaceC4104x r7, com.google.gson.reflect.TypeToken r8) {
        /*
            r6 = this;
            java.lang.String r0 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r8, r0)
            nk.l r0 = r6.f20976d
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r0.f24938b
            nk.k r2 = nk.C5089l.f24935c
            r3 = 1
            if (r7 != r2) goto L17
            goto L59
        L17:
            java.lang.Class r2 = r8.getRawType()
            java.lang.Object r4 = r1.get(r2)
            kk.x r4 = (kk.InterfaceC4104x) r4
            if (r4 == 0) goto L26
            if (r4 != r7) goto L5a
            goto L59
        L26:
            java.lang.Class<lk.a> r4 = lk.InterfaceC4484a.class
            java.lang.annotation.Annotation r4 = r2.getAnnotation(r4)
            lk.a r4 = (lk.InterfaceC4484a) r4
            if (r4 != 0) goto L31
            goto L5a
        L31:
            java.lang.Class r4 = r4.value()
            java.lang.Class<kk.x> r5 = kk.InterfaceC4104x.class
            boolean r5 = r5.isAssignableFrom(r4)
            if (r5 != 0) goto L3e
            goto L5a
        L3e:
            com.google.android.gms.internal.measurement.j4 r5 = r0.f24937a
            com.google.gson.reflect.TypeToken r4 = com.google.gson.reflect.TypeToken.get(r4)
            mk.p r4 = r5.m3395m(r4, r3)
            java.lang.Object r4 = r4.mo28i()
            kk.x r4 = (kk.InterfaceC4104x) r4
            java.lang.Object r1 = r1.putIfAbsent(r2, r4)
            kk.x r1 = (kk.InterfaceC4104x) r1
            if (r1 == 0) goto L57
            r4 = r1
        L57:
            if (r4 != r7) goto L5a
        L59:
            r7 = r0
        L5a:
            java.util.List r0 = r6.f20977e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L61:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r0.next()
            kk.x r2 = (kk.InterfaceC4104x) r2
            if (r1 != 0) goto L73
            if (r2 != r7) goto L61
            r1 = r3
            goto L61
        L73:
            kk.w r2 = r2.mo8877a(r6, r8)
            if (r2 == 0) goto L61
            return r2
        L7a:
            if (r1 != 0) goto L81
            kk.w r7 = r6.m8858e(r8)
            return r7
        L81:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.C4088h.m8859f(kk.x, com.google.gson.reflect.TypeToken):kk.w");
    }

    /* renamed from: g */
    public final C6566c m8860g(Writer writer) {
        C6566c c6566c = new C6566c(writer);
        c6566c.m12584R(this.f20979g);
        c6566c.f31450j = this.f20978f;
        EnumC4099s enumC4099s = this.f20980h;
        if (enumC4099s == null) {
            enumC4099s = EnumC4099s.LEGACY_STRICT;
        }
        c6566c.m12585S(enumC4099s);
        c6566c.f31452l = false;
        return c6566c;
    }

    /* renamed from: h */
    public final String m8861h(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                m8863j(m8860g(stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            m8862i(obj, cls, m8860g(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    /* renamed from: i */
    public final void m8862i(Object obj, Class cls, C6566c c6566c) {
        AbstractC4103w abstractC4103wM8858e = m8858e(TypeToken.get((Type) cls));
        EnumC4099s enumC4099s = c6566c.f31449h;
        EnumC4099s enumC4099s2 = this.f20980h;
        if (enumC4099s2 != null) {
            c6566c.f31449h = enumC4099s2;
        } else if (enumC4099s == EnumC4099s.LEGACY_STRICT) {
            c6566c.m12585S(EnumC4099s.LENIENT);
        }
        boolean z6 = c6566c.f31450j;
        boolean z10 = c6566c.f31452l;
        c6566c.f31450j = this.f20978f;
        c6566c.f31452l = false;
        try {
            try {
                try {
                    abstractC4103wM8858e.mo8852c(c6566c, obj);
                } catch (IOException e2) {
                    throw new JsonIOException(e2);
                }
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e10.getMessage(), e10);
            }
        } finally {
            c6566c.m12585S(enumC4099s);
            c6566c.f31450j = z6;
            c6566c.f31452l = z10;
        }
    }

    /* renamed from: j */
    public final void m8863j(C6566c c6566c) {
        C4093m c4093m = C4093m.f20997a;
        EnumC4099s enumC4099s = c6566c.f31449h;
        boolean z6 = c6566c.f31450j;
        boolean z10 = c6566c.f31452l;
        c6566c.f31450j = this.f20978f;
        c6566c.f31452l = false;
        EnumC4099s enumC4099s2 = this.f20980h;
        if (enumC4099s2 != null) {
            c6566c.f31449h = enumC4099s2;
        } else if (enumC4099s == EnumC4099s.LEGACY_STRICT) {
            c6566c.m12585S(EnumC4099s.LENIENT);
        }
        try {
            try {
                m1.f24967z.getClass();
                C5091n.m10020f(c6566c, c4093m);
                c6566c.m12585S(enumC4099s);
                c6566c.f31450j = z6;
                c6566c.f31452l = z10;
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e10.getMessage(), e10);
            }
        } catch (Throwable th2) {
            c6566c.m12585S(enumC4099s);
            c6566c.f31450j = z6;
            c6566c.f31452l = z10;
            throw th2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f20977e + ",instanceCreators:" + this.f20975c + "}";
    }

    public C4088h(C4766e c4766e, InterfaceC4082b interfaceC4082b, Map map, boolean z6, C4083c c4083c, EnumC4099s enumC4099s, boolean z10, EnumC4097q enumC4097q, List list, InterfaceC4101u interfaceC4101u, InterfaceC4101u interfaceC4101u2, List list2) {
        C5098u c5098u;
        AbstractC4103w c4085e;
        C5098u c5098u2;
        this.f20973a = new ThreadLocal();
        this.f20974b = new ConcurrentHashMap();
        j4 j4Var = new j4(map, z10, list2);
        this.f20975c = j4Var;
        this.f20978f = z6;
        this.f20979g = c4083c;
        this.f20980h = enumC4099s;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m1.f24940A);
        C5098u c5098u3 = C5102y.f24991c;
        int i10 = 1;
        if (interfaceC4101u == EnumC4100t.DOUBLE) {
            c5098u = C5102y.f24991c;
        } else {
            c5098u = new C5098u(i10, interfaceC4101u);
        }
        arrayList.add(c5098u);
        arrayList.add(c4766e);
        arrayList.addAll(list);
        arrayList.add(m1.f24957p);
        arrayList.add(m1.f24948g);
        arrayList.add(m1.f24945d);
        arrayList.add(m1.f24946e);
        arrayList.add(m1.f24947f);
        if (enumC4097q == EnumC4097q.DEFAULT) {
            c4085e = m1.f24952k;
        } else {
            c4085e = new C4085e();
        }
        arrayList.add(new d1(Long.TYPE, Long.class, c4085e));
        int i11 = 0;
        arrayList.add(new d1(Double.TYPE, Double.class, new C4084d(0)));
        arrayList.add(new d1(Float.TYPE, Float.class, new C4084d(1)));
        C5098u c5098u4 = C5100w.f24988b;
        if (interfaceC4101u2 == EnumC4100t.LAZILY_PARSED_NUMBER) {
            c5098u2 = C5100w.f24988b;
        } else {
            c5098u2 = new C5098u(i11, new C5100w(interfaceC4101u2));
        }
        arrayList.add(c5098u2);
        arrayList.add(m1.f24949h);
        arrayList.add(m1.f24950i);
        arrayList.add(new b1(AtomicLong.class, new C4086f(c4085e, i11).m8876a(), i11));
        arrayList.add(new b1(AtomicLongArray.class, new C4086f(c4085e, i10).m8876a(), i11));
        arrayList.add(m1.f24951j);
        arrayList.add(m1.f24953l);
        arrayList.add(m1.f24958q);
        arrayList.add(m1.f24959r);
        arrayList.add(new b1(BigDecimal.class, m1.f24954m, i11));
        arrayList.add(new b1(BigInteger.class, m1.f24955n, i11));
        arrayList.add(new b1(C4772k.class, m1.f24956o, i11));
        arrayList.add(m1.f24960s);
        arrayList.add(m1.f24961t);
        arrayList.add(m1.f24963v);
        arrayList.add(m1.f24964w);
        arrayList.add(m1.f24966y);
        arrayList.add(m1.f24962u);
        arrayList.add(m1.f24943b);
        arrayList.add(C5085h.f24921c);
        arrayList.add(m1.f24965x);
        if (AbstractC6243f.f30262a) {
            arrayList.add(AbstractC6243f.f30266e);
            arrayList.add(AbstractC6243f.f30265d);
            arrayList.add(AbstractC6243f.f30267f);
        }
        arrayList.add(C5079b.f24887c);
        arrayList.add(m1.f24942a);
        arrayList.add(new C5081d(j4Var, i11));
        arrayList.add(new C5081d(j4Var, i10));
        C5089l c5089l = new C5089l(j4Var);
        this.f20976d = c5089l;
        arrayList.add(c5089l);
        arrayList.add(m1.f24941B);
        arrayList.add(new e0(j4Var, interfaceC4082b, c4766e, c5089l, list2));
        this.f20977e = Collections.unmodifiableList(arrayList);
    }
}
