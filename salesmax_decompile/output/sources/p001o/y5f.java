package p001o;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p001o.yn8;

/* loaded from: classes6.dex */
public abstract class y5f {

    /* renamed from: a */
    public static final Class f54949a = m57243B();

    /* renamed from: b */
    public static final j4i f54950b = m57244C(false);

    /* renamed from: c */
    public static final j4i f54951c = m57244C(true);

    /* renamed from: d */
    public static final j4i f54952d = new n4i();

    /* renamed from: A */
    public static Object m57242A(int i, List list, yn8.InterfaceC18441e interfaceC18441e, Object obj, j4i j4iVar) {
        if (interfaceC18441e == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                if (interfaceC18441e.isInRange(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    obj = m57253L(i, iIntValue, obj, j4iVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!interfaceC18441e.isInRange(iIntValue2)) {
                    obj = m57253L(i, iIntValue2, obj, j4iVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: B */
    public static Class m57243B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static j4i m57244C(boolean z) {
        try {
            Class clsM57245D = m57245D();
            if (clsM57245D == null) {
                return null;
            }
            return (j4i) clsM57245D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Class m57245D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static void m57246E(rp6 rp6Var, Object obj, Object obj2) {
        fu6 fu6VarMo47056c = rp6Var.mo47056c(obj2);
        if (fu6VarMo47056c.m27506n()) {
            return;
        }
        rp6Var.mo47057d(obj).m27511u(fu6VarMo47056c);
    }

    /* renamed from: F */
    public static void m57247F(qra qraVar, Object obj, Object obj2, long j) {
        z4i.m58710V(obj, j, qraVar.mo45806a(z4i.m58695G(obj, j), z4i.m58695G(obj2, j)));
    }

    /* renamed from: G */
    public static void m57248G(j4i j4iVar, Object obj, Object obj2) {
        j4iVar.mo33257p(obj, j4iVar.mo33252k(j4iVar.mo33248g(obj), j4iVar.mo33248g(obj2)));
    }

    /* renamed from: H */
    public static j4i m57249H() {
        return f54950b;
    }

    /* renamed from: I */
    public static j4i m57250I() {
        return f54951c;
    }

    /* renamed from: J */
    public static void m57251J(Class cls) {
        Class cls2;
        if (!wn7.class.isAssignableFrom(cls) && (cls2 = f54949a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    public static boolean m57252K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: L */
    public static Object m57253L(int i, int i2, Object obj, j4i j4iVar) {
        if (obj == null) {
            obj = j4iVar.mo33255n();
        }
        j4iVar.mo33246e(obj, i, i2);
        return obj;
    }

    /* renamed from: M */
    public static j4i m57254M() {
        return f54952d;
    }

    /* renamed from: N */
    public static void m57255N(int i, List list, cdj cdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo20991A(i, list, z);
    }

    /* renamed from: O */
    public static void m57256O(int i, List list, cdj cdjVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo20999I(i, list);
    }

    /* renamed from: P */
    public static void m57257P(int i, List list, cdj cdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo20997G(i, list, z);
    }

    /* renamed from: Q */
    public static void m57258Q(int i, List list, cdj cdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo21019n(i, list, z);
    }

    /* renamed from: R */
    public static void m57259R(int i, List list, cdj cdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo21015j(i, list, z);
    }

    /* renamed from: S */
    public static void m57260S(int i, List list, cdj cdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo21030y(i, list, z);
    }

    /* renamed from: T */
    public static void m57261T(int i, List list, cdj cdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo21006a(i, list, z);
    }

    /* renamed from: U */
    public static void m57262U(int i, List list, cdj cdjVar, n5f n5fVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo21004N(i, list, n5fVar);
    }

    /* renamed from: V */
    public static void m57263V(int i, List list, cdj cdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo21012g(i, list, z);
    }

    /* renamed from: W */
    public static void m57264W(int i, List list, cdj cdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo20996F(i, list, z);
    }

    /* renamed from: X */
    public static void m57265X(int i, List list, cdj cdjVar, n5f n5fVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo21001K(i, list, n5fVar);
    }

    /* renamed from: Y */
    public static void m57266Y(int i, List list, cdj cdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo21031z(i, list, z);
    }

    /* renamed from: Z */
    public static void m57267Z(int i, List list, cdj cdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo21022q(i, list, z);
    }

    /* renamed from: a */
    public static int m57268a(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? nf3.m40457T(i) + nf3.m40438A(size) : size * nf3.m40465e(i, true);
    }

    public static void a0(int i, List list, cdj cdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo20994D(i, list, z);
    }

    /* renamed from: b */
    public static int m57269b(List list) {
        return list.size();
    }

    public static void b0(int i, List list, cdj cdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo21017l(i, list, z);
    }

    /* renamed from: c */
    public static int m57270c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM40457T = size * nf3.m40457T(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM40457T += nf3.m40469i((xq1) list.get(i2));
        }
        return iM40457T;
    }

    public static void c0(int i, List list, cdj cdjVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo21009d(i, list);
    }

    /* renamed from: d */
    public static int m57271d(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM57272e = m57272e(list);
        return z ? nf3.m40457T(i) + nf3.m40438A(iM57272e) : iM57272e + (size * nf3.m40457T(i));
    }

    public static void d0(int i, List list, cdj cdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo21016k(i, list, z);
    }

    /* renamed from: e */
    public static int m57272e(List list) {
        int iM40473m;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zk8) {
            zk8 zk8Var = (zk8) list;
            iM40473m = 0;
            while (i < size) {
                iM40473m += nf3.m40473m(zk8Var.getInt(i));
                i++;
            }
        } else {
            iM40473m = 0;
            while (i < size) {
                iM40473m += nf3.m40473m(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM40473m;
    }

    public static void e0(int i, List list, cdj cdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cdjVar.mo21023r(i, list, z);
    }

    /* renamed from: f */
    public static int m57273f(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? nf3.m40457T(i) + nf3.m40438A(size * 4) : size * nf3.m40474n(i, 0);
    }

    /* renamed from: g */
    public static int m57274g(List list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m57275h(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? nf3.m40457T(i) + nf3.m40438A(size * 8) : size * nf3.m40476p(i, 0L);
    }

    /* renamed from: i */
    public static int m57276i(List list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m57277j(int i, List list, n5f n5fVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM40480t = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM40480t += nf3.m40480t(i, (scb) list.get(i2), n5fVar);
        }
        return iM40480t;
    }

    /* renamed from: k */
    public static int m57278k(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM57279l = m57279l(list);
        return z ? nf3.m40457T(i) + nf3.m40438A(iM57279l) : iM57279l + (size * nf3.m40457T(i));
    }

    /* renamed from: l */
    public static int m57279l(List list) {
        int iM40484x;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zk8) {
            zk8 zk8Var = (zk8) list;
            iM40484x = 0;
            while (i < size) {
                iM40484x += nf3.m40484x(zk8Var.getInt(i));
                i++;
            }
        } else {
            iM40484x = 0;
            while (i < size) {
                iM40484x += nf3.m40484x(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM40484x;
    }

    /* renamed from: m */
    public static int m57280m(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int iM57281n = m57281n(list);
        return z ? nf3.m40457T(i) + nf3.m40438A(iM57281n) : iM57281n + (list.size() * nf3.m40457T(i));
    }

    /* renamed from: n */
    public static int m57281n(List list) {
        int iM40486z;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dla) {
            dla dlaVar = (dla) list;
            iM40486z = 0;
            while (i < size) {
                iM40486z += nf3.m40486z(dlaVar.getLong(i));
                i++;
            }
        } else {
            iM40486z = 0;
            while (i < size) {
                iM40486z += nf3.m40486z(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iM40486z;
    }

    /* renamed from: o */
    public static int m57282o(int i, Object obj, n5f n5fVar) {
        return nf3.m40441D(i, (scb) obj, n5fVar);
    }

    /* renamed from: p */
    public static int m57283p(int i, List list, n5f n5fVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM40457T = nf3.m40457T(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            iM40457T += nf3.m40443F((scb) list.get(i2), n5fVar);
        }
        return iM40457T;
    }

    /* renamed from: q */
    public static int m57284q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM57285r = m57285r(list);
        return z ? nf3.m40457T(i) + nf3.m40438A(iM57285r) : iM57285r + (size * nf3.m40457T(i));
    }

    /* renamed from: r */
    public static int m57285r(List list) {
        int iM40452O;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zk8) {
            zk8 zk8Var = (zk8) list;
            iM40452O = 0;
            while (i < size) {
                iM40452O += nf3.m40452O(zk8Var.getInt(i));
                i++;
            }
        } else {
            iM40452O = 0;
            while (i < size) {
                iM40452O += nf3.m40452O(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM40452O;
    }

    /* renamed from: s */
    public static int m57286s(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM57287t = m57287t(list);
        return z ? nf3.m40457T(i) + nf3.m40438A(iM57287t) : iM57287t + (size * nf3.m40457T(i));
    }

    /* renamed from: t */
    public static int m57287t(List list) {
        int iM40454Q;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dla) {
            dla dlaVar = (dla) list;
            iM40454Q = 0;
            while (i < size) {
                iM40454Q += nf3.m40454Q(dlaVar.getLong(i));
                i++;
            }
        } else {
            iM40454Q = 0;
            while (i < size) {
                iM40454Q += nf3.m40454Q(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iM40454Q;
    }

    /* renamed from: u */
    public static int m57288u(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM40457T = nf3.m40457T(i) * size;
        if (list instanceof yi9) {
            yi9 yi9Var = (yi9) list;
            while (i2 < size) {
                Object objMo46223u = yi9Var.mo46223u(i2);
                iM40457T += objMo46223u instanceof xq1 ? nf3.m40469i((xq1) objMo46223u) : nf3.m40456S((String) objMo46223u);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM40457T += obj instanceof xq1 ? nf3.m40469i((xq1) obj) : nf3.m40456S((String) obj);
                i2++;
            }
        }
        return iM40457T;
    }

    /* renamed from: v */
    public static int m57289v(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM57290w = m57290w(list);
        return z ? nf3.m40457T(i) + nf3.m40438A(iM57290w) : iM57290w + (size * nf3.m40457T(i));
    }

    /* renamed from: w */
    public static int m57290w(List list) {
        int iM40459V;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zk8) {
            zk8 zk8Var = (zk8) list;
            iM40459V = 0;
            while (i < size) {
                iM40459V += nf3.m40459V(zk8Var.getInt(i));
                i++;
            }
        } else {
            iM40459V = 0;
            while (i < size) {
                iM40459V += nf3.m40459V(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM40459V;
    }

    /* renamed from: x */
    public static int m57291x(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM57292y = m57292y(list);
        return z ? nf3.m40457T(i) + nf3.m40438A(iM57292y) : iM57292y + (size * nf3.m40457T(i));
    }

    /* renamed from: y */
    public static int m57292y(List list) {
        int iM40461X;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dla) {
            dla dlaVar = (dla) list;
            iM40461X = 0;
            while (i < size) {
                iM40461X += nf3.m40461X(dlaVar.getLong(i));
                i++;
            }
        } else {
            iM40461X = 0;
            while (i < size) {
                iM40461X += nf3.m40461X(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iM40461X;
    }

    /* renamed from: z */
    public static Object m57293z(int i, List list, yn8.InterfaceC18440d interfaceC18440d, Object obj, j4i j4iVar) {
        if (interfaceC18440d == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                if (interfaceC18440d.findValueByNumber(iIntValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    obj = m57253L(i, iIntValue, obj, j4iVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (interfaceC18440d.findValueByNumber(iIntValue2) == null) {
                    obj = m57253L(i, iIntValue2, obj, j4iVar);
                    it.remove();
                }
            }
        }
        return obj;
    }
}
