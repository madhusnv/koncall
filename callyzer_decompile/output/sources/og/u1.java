package og;

import android.os.Build;
import android.util.Log;
import ex.InterfaceC2137a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import nd.C5019j;
import nd.EnumC5011b;
import nd.InterfaceC5014e;
import nd.InterfaceC5016g;
import qd.C6181a;
import qd.C6185e;
import qd.InterfaceC6187g;
import rw.C6669s;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: a */
    public static int f26821a = 3;

    /* renamed from: a */
    public static void m10942a(String str) {
        m10947f(3, m10950i(str));
    }

    /* renamed from: b */
    public static void m10943b(String str) {
        m10947f(6, m10950i(str));
    }

    /* renamed from: c */
    public static void m10944c(String str) {
        m10947f(6, m10950i(str));
    }

    /* renamed from: d */
    public static void m10945d(String str) {
        m10947f(4, m10950i(str));
    }

    /* renamed from: e */
    public static boolean m10946e(String str) {
        return m10947f(3, m10950i(str));
    }

    /* renamed from: f */
    public static boolean m10947f(int i10, String str) {
        return f26821a <= i10 || Log.isLoggable(str, i10);
    }

    /* renamed from: g */
    public static final void m10948g(InterfaceC7564h interfaceC7564h, EnumC5011b level, String str, Throwable th2, InterfaceC2137a interfaceC2137a) {
        Map map;
        AbstractC4154l.m8923f(interfaceC7564h, "<this>");
        AbstractC4154l.m8923f(level, "level");
        InterfaceC5016g interfaceC5016gMo9905a = com.google.android.gms.internal.measurement.d4.m3227a(interfaceC7564h).mo9308d().mo9905a(str);
        if (interfaceC5016gMo9905a.mo331h(level)) {
            C5019j c5019j = (C5019j) interfaceC7564h.o0(C5019j.f24768c);
            if (c5019j == null || (map = c5019j.f24769b) == null) {
                map = C6669s.f31944a;
            }
            InterfaceC6187g interfaceC6187gM11093a = zc.m11093a(interfaceC7564h);
            if (interfaceC6187gM11093a != null) {
                C6181a c6181a = ((C6185e) interfaceC6187gM11093a).f30143a;
            }
            InterfaceC5014e interfaceC5014eMo9134n = interfaceC5016gMo9905a.mo9134n(level);
            if (th2 != null) {
                interfaceC5014eMo9134n.mo212d(th2);
            }
            interfaceC5014eMo9134n.mo221m(interfaceC2137a);
            for (Map.Entry entry : map.entrySet()) {
                interfaceC5014eMo9134n.mo213e(entry.getValue(), (String) entry.getKey());
            }
            interfaceC5014eMo9134n.mo211c();
        }
    }

    /* renamed from: h */
    public static final C4367l m10949h(InterfaceC7564h interfaceC7564h, String str) {
        AbstractC4154l.m8923f(interfaceC7564h, "<this>");
        return new C4367l(interfaceC7564h, com.google.android.gms.internal.measurement.d4.m3227a(interfaceC7564h).mo9308d().mo9905a(str), str);
    }

    /* renamed from: i */
    public static String m10950i(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    /* renamed from: j */
    public static void m10951j(String str) {
        m10947f(5, m10950i(str));
    }

    /* renamed from: k */
    public static void m10952k(String str) {
        m10947f(5, m10950i(str));
    }
}
