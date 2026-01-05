package p001o;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p001o.xn8;

/* loaded from: classes4.dex */
public abstract class z5f {

    /* renamed from: a */
    public static final Class f56567a = m58781A();

    /* renamed from: b */
    public static final k4i f56568b = m58782B(false);

    /* renamed from: c */
    public static final k4i f56569c = m58782B(true);

    /* renamed from: d */
    public static final k4i f56570d = new o4i();

    /* renamed from: A */
    public static Class m58781A() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: B */
    public static k4i m58782B(boolean z) {
        try {
            Class clsM58783C = m58783C();
            if (clsM58783C == null) {
                return null;
            }
            return (k4i) clsM58783C.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static Class m58783C() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static void m58784D(sp6 sp6Var, Object obj, Object obj2) {
        gu6 gu6VarMo48605c = sp6Var.mo48605c(obj2);
        if (gu6VarMo48605c.m29494d()) {
            return;
        }
        sp6Var.mo48606d(obj).m29498h(gu6VarMo48605c);
    }

    /* renamed from: E */
    public static void m58785E(rra rraVar, Object obj, Object obj2, long j) {
        a5i.m16460O(obj, j, rraVar.mo47093a(a5i.m16446A(obj, j), a5i.m16446A(obj2, j)));
    }

    /* renamed from: F */
    public static void m58786F(k4i k4iVar, Object obj, Object obj2) {
        k4iVar.mo34986p(obj, k4iVar.mo34981k(k4iVar.mo34977g(obj), k4iVar.mo34977g(obj2)));
    }

    /* renamed from: G */
    public static k4i m58787G() {
        return f56568b;
    }

    /* renamed from: H */
    public static k4i m58788H() {
        return f56569c;
    }

    /* renamed from: I */
    public static void m58789I(Class cls) {
        Class cls2;
        if (!vn7.class.isAssignableFrom(cls) && (cls2 = f56567a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: J */
    public static boolean m58790J(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: K */
    public static Object m58791K(int i, int i2, Object obj, k4i k4iVar) {
        if (obj == null) {
            obj = k4iVar.mo34984n();
        }
        k4iVar.mo34975e(obj, i, i2);
        return obj;
    }

    /* renamed from: L */
    public static k4i m58792L() {
        return f56570d;
    }

    /* renamed from: M */
    public static void m58793M(int i, List list, bdj bdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18686A(i, list, z);
    }

    /* renamed from: N */
    public static void m58794N(int i, List list, bdj bdjVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18694I(i, list);
    }

    /* renamed from: O */
    public static void m58795O(int i, List list, bdj bdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18692G(i, list, z);
    }

    /* renamed from: P */
    public static void m58796P(int i, List list, bdj bdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18714n(i, list, z);
    }

    /* renamed from: Q */
    public static void m58797Q(int i, List list, bdj bdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18710j(i, list, z);
    }

    /* renamed from: R */
    public static void m58798R(int i, List list, bdj bdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18725y(i, list, z);
    }

    /* renamed from: S */
    public static void m58799S(int i, List list, bdj bdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18701a(i, list, z);
    }

    /* renamed from: T */
    public static void m58800T(int i, List list, bdj bdjVar, o5f o5fVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18697L(i, list, o5fVar);
    }

    /* renamed from: U */
    public static void m58801U(int i, List list, bdj bdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18707g(i, list, z);
    }

    /* renamed from: V */
    public static void m58802V(int i, List list, bdj bdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18691F(i, list, z);
    }

    /* renamed from: W */
    public static void m58803W(int i, List list, bdj bdjVar, o5f o5fVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18699N(i, list, o5fVar);
    }

    /* renamed from: X */
    public static void m58804X(int i, List list, bdj bdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18726z(i, list, z);
    }

    /* renamed from: Y */
    public static void m58805Y(int i, List list, bdj bdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18717q(i, list, z);
    }

    /* renamed from: Z */
    public static void m58806Z(int i, List list, bdj bdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18689D(i, list, z);
    }

    /* renamed from: a */
    public static int m58807a(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? mf3.m38880L(i) + mf3.m38910x(size) : size * mf3.m38890d(i, true);
    }

    public static void a0(int i, List list, bdj bdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18712l(i, list, z);
    }

    /* renamed from: b */
    public static int m58808b(List list) {
        return list.size();
    }

    public static void b0(int i, List list, bdj bdjVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18704d(i, list);
    }

    /* renamed from: c */
    public static int m58809c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM38880L = size * mf3.m38880L(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM38880L += mf3.m38893g((yq1) list.get(i2));
        }
        return iM38880L;
    }

    public static void c0(int i, List list, bdj bdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18711k(i, list, z);
    }

    /* renamed from: d */
    public static int m58810d(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM58811e = m58811e(list);
        return z ? mf3.m38880L(i) + mf3.m38910x(iM58811e) : iM58811e + (size * mf3.m38880L(i));
    }

    public static void d0(int i, List list, bdj bdjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        bdjVar.mo18718r(i, list, z);
    }

    /* renamed from: e */
    public static int m58811e(List list) {
        int iM38897k;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof al8) {
            al8 al8Var = (al8) list;
            iM38897k = 0;
            while (i < size) {
                iM38897k += mf3.m38897k(al8Var.getInt(i));
                i++;
            }
        } else {
            iM38897k = 0;
            while (i < size) {
                iM38897k += mf3.m38897k(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM38897k;
    }

    /* renamed from: f */
    public static int m58812f(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? mf3.m38880L(i) + mf3.m38910x(size * 4) : size * mf3.m38898l(i, 0);
    }

    /* renamed from: g */
    public static int m58813g(List list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m58814h(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? mf3.m38880L(i) + mf3.m38910x(size * 8) : size * mf3.m38900n(i, 0L);
    }

    /* renamed from: i */
    public static int m58815i(List list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m58816j(int i, List list, o5f o5fVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM38904r = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM38904r += mf3.m38904r(i, (rcb) list.get(i2), o5fVar);
        }
        return iM38904r;
    }

    /* renamed from: k */
    public static int m58817k(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM58818l = m58818l(list);
        return z ? mf3.m38880L(i) + mf3.m38910x(iM58818l) : iM58818l + (size * mf3.m38880L(i));
    }

    /* renamed from: l */
    public static int m58818l(List list) {
        int iM38907u;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof al8) {
            al8 al8Var = (al8) list;
            iM38907u = 0;
            while (i < size) {
                iM38907u += mf3.m38907u(al8Var.getInt(i));
                i++;
            }
        } else {
            iM38907u = 0;
            while (i < size) {
                iM38907u += mf3.m38907u(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM38907u;
    }

    /* renamed from: m */
    public static int m58819m(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int iM58820n = m58820n(list);
        return z ? mf3.m38880L(i) + mf3.m38910x(iM58820n) : iM58820n + (list.size() * mf3.m38880L(i));
    }

    /* renamed from: n */
    public static int m58820n(List list) {
        int iM38909w;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ela) {
            ela elaVar = (ela) list;
            iM38909w = 0;
            while (i < size) {
                iM38909w += mf3.m38909w(elaVar.getLong(i));
                i++;
            }
        } else {
            iM38909w = 0;
            while (i < size) {
                iM38909w += mf3.m38909w(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iM38909w;
    }

    /* renamed from: o */
    public static int m58821o(int i, Object obj, o5f o5fVar) {
        return mf3.m38911y(i, (rcb) obj, o5fVar);
    }

    /* renamed from: p */
    public static int m58822p(int i, List list, o5f o5fVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM38880L = mf3.m38880L(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            iM38880L += mf3.m38912z((rcb) list.get(i2), o5fVar);
        }
        return iM38880L;
    }

    /* renamed from: q */
    public static int m58823q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM58824r = m58824r(list);
        return z ? mf3.m38880L(i) + mf3.m38910x(iM58824r) : iM58824r + (size * mf3.m38880L(i));
    }

    /* renamed from: r */
    public static int m58824r(List list) {
        int iM38875G;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof al8) {
            al8 al8Var = (al8) list;
            iM38875G = 0;
            while (i < size) {
                iM38875G += mf3.m38875G(al8Var.getInt(i));
                i++;
            }
        } else {
            iM38875G = 0;
            while (i < size) {
                iM38875G += mf3.m38875G(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM38875G;
    }

    /* renamed from: s */
    public static int m58825s(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM58826t = m58826t(list);
        return z ? mf3.m38880L(i) + mf3.m38910x(iM58826t) : iM58826t + (size * mf3.m38880L(i));
    }

    /* renamed from: t */
    public static int m58826t(List list) {
        int iM38877I;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ela) {
            ela elaVar = (ela) list;
            iM38877I = 0;
            while (i < size) {
                iM38877I += mf3.m38877I(elaVar.getLong(i));
                i++;
            }
        } else {
            iM38877I = 0;
            while (i < size) {
                iM38877I += mf3.m38877I(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iM38877I;
    }

    /* renamed from: u */
    public static int m58827u(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM38880L = mf3.m38880L(i) * size;
        if (list instanceof zi9) {
            zi9 zi9Var = (zi9) list;
            while (i2 < size) {
                Object objMo47846u = zi9Var.mo47846u(i2);
                iM38880L += objMo47846u instanceof yq1 ? mf3.m38893g((yq1) objMo47846u) : mf3.m38879K((String) objMo47846u);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM38880L += obj instanceof yq1 ? mf3.m38893g((yq1) obj) : mf3.m38879K((String) obj);
                i2++;
            }
        }
        return iM38880L;
    }

    /* renamed from: v */
    public static int m58828v(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM58829w = m58829w(list);
        return z ? mf3.m38880L(i) + mf3.m38910x(iM58829w) : iM58829w + (size * mf3.m38880L(i));
    }

    /* renamed from: w */
    public static int m58829w(List list) {
        int iM38882N;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof al8) {
            al8 al8Var = (al8) list;
            iM38882N = 0;
            while (i < size) {
                iM38882N += mf3.m38882N(al8Var.getInt(i));
                i++;
            }
        } else {
            iM38882N = 0;
            while (i < size) {
                iM38882N += mf3.m38882N(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iM38882N;
    }

    /* renamed from: x */
    public static int m58830x(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM58831y = m58831y(list);
        return z ? mf3.m38880L(i) + mf3.m38910x(iM58831y) : iM58831y + (size * mf3.m38880L(i));
    }

    /* renamed from: y */
    public static int m58831y(List list) {
        int iM38884P;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ela) {
            ela elaVar = (ela) list;
            iM38884P = 0;
            while (i < size) {
                iM38884P += mf3.m38884P(elaVar.getLong(i));
                i++;
            }
        } else {
            iM38884P = 0;
            while (i < size) {
                iM38884P += mf3.m38884P(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iM38884P;
    }

    /* renamed from: z */
    public static Object m58832z(int i, List list, xn8.InterfaceC18195c interfaceC18195c, Object obj, k4i k4iVar) {
        if (interfaceC18195c == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                if (interfaceC18195c.isInRange(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    obj = m58791K(i, iIntValue, obj, k4iVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!interfaceC18195c.isInRange(iIntValue2)) {
                    obj = m58791K(i, iIntValue2, obj, k4iVar);
                    it.remove();
                }
            }
        }
        return obj;
    }
}
