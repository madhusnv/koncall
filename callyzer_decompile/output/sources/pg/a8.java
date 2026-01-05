package pg;

import au.C0448l;
import aw.C0471k;
import com.amplifyframework.core.model.ModelIdentifier;
import ja.AbstractC3609c;
import ja.AbstractC3613g;
import ja.C3610d;
import ja.C3611e;
import ja.C3612f;
import ja.C3617k;
import ja.C3619m;
import ja.C3630x;
import ja.C3631y;
import ja.C3632z;
import ja.EnumC3618l;
import ja.EnumC3628v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import nd.InterfaceC5016g;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import nx.C5170h;
import og.pe;
import qw.C6361k;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import rw.C6668r;
import rw.C6669s;
import sw.C6957a;
import sw.C6959c;
import sw.C6960d;
import sw.C6962f;
import sw.C6963g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class a8 {

    /* renamed from: a */
    public static final /* synthetic */ int f28792a = 0;

    /* renamed from: a */
    public static final String m11536a(C3632z c3632z) {
        int i10 = AbstractC3609c.f19242a[c3632z.f19274b.ordinal()];
        if (i10 == 1) {
            return "profile";
        }
        if (i10 == 2) {
            return "sso-session";
        }
        if (i10 == 3) {
            return "services";
        }
        if (i10 == 4) {
            return "unknown section";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static final Map m11537b(InterfaceC5016g logger, EnumC3628v type, String str) {
        Iterable iterableM10833h;
        Map map;
        AbstractC4154l.m8923f(logger, "logger");
        AbstractC4154l.m8923f(type, "type");
        C6669s c6669s = C6669s.f31944a;
        if (str == null || AbstractC5178p.m10101L(str)) {
            return c6669s;
        }
        C6959c c6959cM10829d = pe.m10829d();
        C5170h c5170h = new C5170h(str);
        if (c5170h.hasNext()) {
            Object next = c5170h.next();
            if (c5170h.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c5170h.hasNext()) {
                    arrayList.add(c5170h.next());
                }
                iterableM10833h = arrayList;
            } else {
                iterableM10833h = pe.m10833h(next);
            }
        } else {
            iterableM10833h = C6668r.f31943a;
        }
        char c2 = '\n';
        ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(iterableM10833h, 10));
        int i10 = 0;
        for (Object obj : iterableM10833h) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                pe.m10842q();
                throw null;
            }
            arrayList2.add(new C3619m(i11, (String) obj));
            i10 = i11;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            C3619m c3619m = (C3619m) obj2;
            if (!AbstractC5178p.m10101L(c3619m.f19261b)) {
                String string = AbstractC5178p.g0(c3619m.f19261b).toString();
                if (!AbstractC5185w.m10138t(string, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, false) && !AbstractC5185w.m10138t(string, ";", false)) {
                    arrayList3.add(obj2);
                }
            }
        }
        int size2 = arrayList3.size();
        int i13 = 0;
        C3632z c3632z = null;
        C3631y c3631y = null;
        while (i13 < size2) {
            Object obj3 = arrayList3.get(i13);
            i13++;
            C3619m c3619m2 = (C3619m) obj3;
            ja.b0 b0Var = type.tokenOf(c3619m2, c3632z, c3631y);
            if (b0Var instanceof C3632z) {
                c3632z = (C3632z) b0Var;
                c3631y = null;
            } else if (b0Var instanceof C3631y) {
                c3631y = (C3631y) b0Var;
            }
            c6959cM10829d.add(new C6361k(c3619m2, b0Var));
        }
        C6959c c6959cM10828c = pe.m10828c(c6959cM10829d);
        AbstractC4154l.m8923f(c6959cM10828c, "<this>");
        C6962f c6962f = new C6962f();
        C4168z c4168z = new C4168z();
        ListIterator listIterator = c6959cM10828c.listIterator(0);
        C3631y c3631y2 = null;
        LinkedHashMap linkedHashMap = null;
        while (true) {
            C6957a c6957a = (C6957a) listIterator;
            if (!c6957a.hasNext()) {
                C6962f c6962fM13230d = c6962f.m13230d();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Object it = ((C6963g) c6962fM13230d.entrySet()).iterator();
                while (((c6.k0) it).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((C6960d) it).next();
                    boolean z6 = ((C3632z) entry.getKey()).f19275c;
                    if (!z6) {
                        if (z6) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C6963g c6963g = (C6963g) c6962fM13230d.keySet();
                        if (!c6963g.f33722b.isEmpty()) {
                            Iterator it2 = c6963g.iterator();
                            while (it2.hasNext()) {
                                C3632z c3632z2 = (C3632z) it2.next();
                                if (!c3632z2.f19275c || !c3632z2.f19273a.equals(((C3632z) entry.getKey()).f19273a) || c3632z2.f19274b != ((C3632z) entry.getKey()).f19274b) {
                                }
                            }
                        }
                    }
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
                ArrayList arrayList4 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    arrayList4.add(new C3617k(((C3632z) entry2.getKey()).f19273a, (Map) entry2.getValue(), ((C3632z) entry2.getKey()).f19274b));
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (EnumC3618l enumC3618l : EnumC3618l.values()) {
                    ArrayList arrayList5 = new ArrayList();
                    int size3 = arrayList4.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj4 = arrayList4.get(i14);
                        i14++;
                        if (((C3617k) obj4).f19259c == enumC3618l) {
                            arrayList5.add(obj4);
                        }
                    }
                    C6962f c6962f2 = new C6962f();
                    int size4 = arrayList5.size();
                    int i15 = 0;
                    while (i15 < size4) {
                        Object obj5 = arrayList5.get(i15);
                        i15++;
                        C3617k c3617k = (C3617k) obj5;
                        C3617k c3617k2 = (C3617k) c6962f2.get(c3617k.f19257a);
                        if (c3617k2 == null || (map = c3617k2.f19258b) == null) {
                            map = c6669s;
                        }
                        LinkedHashMap linkedHashMapM12780h = AbstractC6674x.m12780h(map, c3617k.f19258b);
                        String str2 = c3617k.f19257a;
                        c6962f2.put(str2, new C3617k(str2, linkedHashMapM12780h, c3617k.f19259c));
                    }
                    C6962f c6962fM13230d2 = c6962f2.m13230d();
                    if (!c6962fM13230d2.isEmpty()) {
                        linkedHashMap3.put(enumC3618l, c6962fM13230d2);
                    }
                }
                return linkedHashMap3;
            }
            C6361k c6361k = (C6361k) c6957a.next();
            C3619m c3619m3 = (C3619m) c6361k.f30755a;
            ja.b0 b0Var2 = (ja.b0) c6361k.f30756b;
            if (b0Var2 instanceof C3632z) {
                c4168z.f21164a = b0Var2;
                if (!c6962f.containsKey(b0Var2)) {
                    if (((C3632z) b0Var2).f19276d) {
                        c6962f.put(b0Var2, new LinkedHashMap());
                    } else {
                        logger.mo329f(null, new C3610d(c3619m3, b0Var2, 0));
                    }
                }
                c3631y2 = null;
            } else if (b0Var2 instanceof C3631y) {
                Object obj6 = c4168z.f21164a;
                AbstractC4154l.m8921d(obj6, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Section");
                c3631y2 = (C3631y) b0Var2;
                String str3 = c3631y2.f19271a;
                if (d8.m11585c(str3)) {
                    Object obj7 = c4168z.f21164a;
                    if (((C3632z) obj7).f19276d) {
                        Object obj8 = c6962f.get(obj7);
                        AbstractC4154l.m8920c(obj8);
                        Map map2 = (Map) obj8;
                        if (map2.containsKey(str3)) {
                            logger.mo329f(null, new C0448l(2, c3619m3, b0Var2, c4168z));
                        }
                        if (map2.containsKey(str3)) {
                            logger.mo329f(null, new C3610d(c3619m3, b0Var2, 2));
                        }
                        map2.put(str3, new C3612f(c3631y2.f19272b));
                    } else {
                        logger.mo329f(null, new C0471k(3, c3619m3, c4168z));
                    }
                } else {
                    logger.mo329f(null, new C3610d(c3619m3, b0Var2, 1));
                }
            } else if (b0Var2 instanceof C3630x) {
                Object obj9 = c4168z.f21164a;
                AbstractC4154l.m8921d(obj9, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Section");
                AbstractC4154l.m8921d(c3631y2, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Property");
                String str4 = c3631y2.f19271a;
                Object obj10 = c6962f.get(c4168z.f21164a);
                AbstractC4154l.m8920c(obj10);
                Map map3 = (Map) obj10;
                Object obj11 = map3.get(str4);
                AbstractC4154l.m8921d(obj11, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.AwsConfigValue.String");
                map3.put(str4, new C3612f(((C3612f) obj11).f19247a + c2 + ((C3630x) b0Var2).f19270a));
            } else {
                if (!(b0Var2 instanceof ja.a0)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj12 = c4168z.f21164a;
                AbstractC4154l.m8921d(obj12, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Section");
                AbstractC4154l.m8921d(c3631y2, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Property");
                String str5 = c3631y2.f19271a;
                ja.a0 a0Var = (ja.a0) b0Var2;
                String str6 = a0Var.f19237a;
                if (d8.m11585c(str6)) {
                    Object obj13 = c6962f.get(c4168z.f21164a);
                    AbstractC4154l.m8920c(obj13);
                    Map map4 = (Map) obj13;
                    AbstractC3613g abstractC3613g = (AbstractC3613g) map4.get(str5);
                    if (abstractC3613g instanceof C3612f) {
                        if (((C3612f) abstractC3613g).f19247a.length() > 0) {
                            logger.mo329f(null, new C3610d(c3619m3, b0Var2, 4));
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        map4.put(str5, new C3611e(linkedHashMap4));
                        linkedHashMap = linkedHashMap4;
                    }
                    AbstractC4154l.m8920c(linkedHashMap);
                    linkedHashMap.put(str6, a0Var.f19238b);
                    c2 = '\n';
                } else {
                    logger.mo329f(null, new C3610d(c3619m3, b0Var2, 3));
                }
            }
        }
    }
}
