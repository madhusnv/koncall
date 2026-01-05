package j0;

import android.os.Handler;
import android.os.Looper;
import b2.C0558p;
import b2.C0559q;
import b2.C0560r;
import b2.C0562t;
import b2.C0563u;
import b2.EnumC0555m;
import b2.InterfaceC0553k;
import com.google.android.gms.internal.measurement.j4;
import g4.l0;
import g4.n0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import ma.C4682a;
import ma.C4683b;
import ma.C4684c;
import nx.AbstractC5178p;
import og.nd;
import og.pa;
import pg.ba;
import pg.o7;
import qw.EnumC6359i;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j0.d */
/* loaded from: classes.dex */
public abstract class AbstractC3504d {

    /* renamed from: a */
    public static volatile Handler f18373a;

    /* renamed from: a */
    public static final C0560r m8056a(j4 j4Var, InterfaceC0553k interfaceC0553k) {
        EnumC0555m enumC0555mM3396n = j4Var.m3396n();
        C0558p c0558p = (C0558p) j4Var.f6253d;
        boolean z6 = enumC0555mM3396n == EnumC0555m.CROSSED;
        return new C0560r(m8058c(c0558p, z6, true, interfaceC0553k), m8058c(c0558p, z6, false, interfaceC0553k), z6);
    }

    /* renamed from: b */
    public static final C0559q m8057b(j4 j4Var, C0558p c0558p, C0559q c0559q) {
        int i10 = c0558p.f3796c;
        int i11 = c0558p.f3795b;
        boolean z6 = j4Var.f6251b;
        int i12 = z6 ? i11 : i10;
        l0 l0Var = (l0) c0558p.f3798e;
        int i13 = c0558p.f3797d;
        EnumC6359i enumC6359i = EnumC6359i.NONE;
        InterfaceC6357g interfaceC6357gM10781b = nd.m10781b(enumC6359i, new C0563u(c0558p, i12, 0));
        InterfaceC6357g interfaceC6357gM10781b2 = nd.m10781b(enumC6359i, new C0562t(c0558p, i12, z6 ? i10 : i11, j4Var, interfaceC6357gM10781b));
        if (1 != c0559q.f3802c) {
            return (C0559q) interfaceC6357gM10781b2.getValue();
        }
        if (i12 == i13) {
            return c0559q;
        }
        if (((Number) interfaceC6357gM10781b.getValue()).intValue() != l0Var.f13671b.m6471d(i13)) {
            return (C0559q) interfaceC6357gM10781b2.getValue();
        }
        int i14 = c0559q.f3801b;
        long jM6452j = l0Var.m6452j(i14);
        if (i13 != -1) {
            if (i12 != i13) {
                if (((z6 ? 1 : 0) ^ ((i11 < i10 ? EnumC0555m.NOT_CROSSED : i11 > i10 ? EnumC0555m.CROSSED : EnumC0555m.COLLAPSED) == EnumC0555m.CROSSED ? 1 : 0)) == 0) {
                }
            }
            return c0558p.m1655c(i12);
        }
        int i15 = n0.f13685c;
        return (i14 == ((int) (jM6452j >> 32)) || i14 == ((int) (jM6452j & 4294967295L))) ? (C0559q) interfaceC6357gM10781b2.getValue() : c0558p.m1655c(i12);
    }

    /* renamed from: c */
    public static final C0559q m8058c(C0558p c0558p, boolean z6, boolean z10, InterfaceC0553k interfaceC0553k) {
        long j6;
        long jMo1630a = interfaceC0553k.mo1630a(z10 ? c0558p.f3795b : c0558p.f3796c, c0558p);
        if (z6 ^ z10) {
            int i10 = n0.f13685c;
            j6 = jMo1630a >> 32;
        } else {
            int i11 = n0.f13685c;
            j6 = 4294967295L & jMo1630a;
        }
        return c0558p.m1655c((int) j6);
    }

    /* renamed from: d */
    public static final C0559q m8059d(C0559q c0559q, C0558p c0558p, int i10) {
        return new C0559q(((l0) c0558p.f3798e).m6443a(i10), i10, c0559q.f3802c);
    }

    /* renamed from: e */
    public static Handler m8060e() {
        if (f18373a != null) {
            return f18373a;
        }
        synchronized (AbstractC3504d.class) {
            try {
                if (f18373a == null) {
                    f18373a = o7.m11807b(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f18373a;
    }

    /* renamed from: f */
    public static final boolean m8061f(String str, boolean z6) {
        if (str != null && pa.m10814a(str, z6)) {
            if (!z6) {
                return m8062g(str);
            }
            List listM10111V = AbstractC5178p.m10111V(str, new char[]{'.'}, 0, 6);
            if (!listM10111V.isEmpty()) {
                Iterator it = listM10111V.iterator();
                while (it.hasNext()) {
                    if (!m8062g((String) it.next())) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m8062g(String str) {
        int length = str.length();
        if (3 <= length && length < 64) {
            int i10 = 0;
            while (true) {
                if (i10 < str.length()) {
                    char cCharAt = str.charAt(i10);
                    if ('A' <= cCharAt && cCharAt < '[') {
                        break;
                    }
                    i10++;
                } else if (ba.m11558f(str) == null && ba.m11559g(str) == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public static final C4682a m8063h(String str) {
        if (str == null) {
            return null;
        }
        List listM10111V = AbstractC5178p.m10111V(str, new char[]{':'}, 6, 2);
        if (!AbstractC4154l.m8918a(listM10111V.get(0), "arn") || listM10111V.size() != 6 || ((CharSequence) listM10111V.get(1)).length() == 0 || ((CharSequence) listM10111V.get(2)).length() == 0 || ((CharSequence) listM10111V.get(5)).length() == 0) {
            return null;
        }
        return new C4682a((String) listM10111V.get(1), (String) listM10111V.get(2), (String) listM10111V.get(3), (String) listM10111V.get(4), AbstractC5178p.m10111V((CharSequence) listM10111V.get(5), new char[]{':', '/'}, 0, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* renamed from: i */
    public static final C4684c m8064i(String str, List partitions) {
        Object next;
        Object next2;
        C4683b next3;
        AbstractC4154l.m8923f(partitions, "partitions");
        if (str != null) {
            Iterator it = partitions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C4683b) next).f23148b.containsKey(str)) {
                    break;
                }
            }
            C4683b c4683b = (C4683b) next;
            if (c4683b != null) {
                C4684c c4684c = c4683b.f23150d;
                Object obj = c4683b.f23148b.get(str);
                AbstractC4154l.m8920c(obj);
                C4684c c4684c2 = (C4684c) obj;
                c4684c.getClass();
                String str2 = c4684c2.f23151a;
                if (str2 == null) {
                    str2 = c4684c.f23151a;
                }
                String str3 = c4684c2.f23152b;
                if (str3 == null) {
                    str3 = c4684c.f23152b;
                }
                String str4 = c4684c2.f23153c;
                if (str4 == null) {
                    str4 = c4684c.f23153c;
                }
                Boolean bool = c4684c2.f23154d;
                if (bool == null) {
                    bool = c4684c.f23154d;
                }
                Boolean bool2 = c4684c2.f23155e;
                if (bool2 == null) {
                    bool2 = c4684c.f23155e;
                }
                String str5 = c4684c2.f23156f;
                if (str5 == null) {
                    str5 = c4684c.f23156f;
                }
                return new C4684c(str2, str3, str4, bool, bool2, str5);
            }
            Iterator it2 = partitions.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((C4683b) next2).f23149c.m10087c(str)) {
                    break;
                }
            }
            C4683b c4683b2 = (C4683b) next2;
            if (c4683b2 == null) {
                Iterator it3 = partitions.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = 0;
                        break;
                    }
                    next3 = it3.next();
                    if (AbstractC4154l.m8918a(((C4683b) next3).f23147a, "aws")) {
                        break;
                    }
                }
                c4683b2 = next3;
            }
            if (c4683b2 != null) {
                return c4683b2.f23150d;
            }
        }
        return null;
    }
}
