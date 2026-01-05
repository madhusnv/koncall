package f00;

import a9.C0073l;
import g00.EnumC2418c;
import h00.C2768d;
import h00.InterfaceC2766b;
import java.io.Closeable;
import java.io.IOException;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f00.b */
/* loaded from: classes3.dex */
public interface InterfaceC2173b {
    /* renamed from: A */
    default InterfaceC2766b mo5824A(EnumC2418c enumC2418c) {
        C8849i c8849i = new C8849i(5, false);
        c8849i.f42584c = this;
        C0073l c0073l = new C0073l();
        c0073l.f264a = enumC2418c;
        c8849i.f42583b = c0073l;
        return c8849i;
    }

    /* renamed from: a */
    void mo5825a(Object obj, String str);

    /* renamed from: b */
    default boolean mo5826b(EnumC2418c enumC2418c) {
        int i10 = enumC2418c.toInt();
        if (i10 == 0) {
            return mo5836l();
        }
        if (i10 == 10) {
            return mo5829e();
        }
        if (i10 == 20) {
            return mo5835k();
        }
        if (i10 == 30) {
            return mo5827c();
        }
        if (i10 == 40) {
            return mo5832h();
        }
        throw new IllegalArgumentException("Level [" + enumC2418c + "] not recognized.");
    }

    /* renamed from: c */
    boolean mo5827c();

    /* renamed from: d */
    void mo5828d(String str, Object obj, Object obj2);

    void debug(String str);

    /* renamed from: e */
    boolean mo5829e();

    void error(String str);

    void error(String str, Throwable th2);

    /* renamed from: f */
    void mo5830f(String str, Number number, Object obj);

    /* renamed from: g */
    void mo5831g(Object obj, String str);

    String getName();

    /* renamed from: h */
    boolean mo5832h();

    /* renamed from: i */
    void mo5833i(Object obj, String str);

    void info(String str);

    /* renamed from: j */
    void mo5834j(String str, Object... objArr);

    /* renamed from: k */
    boolean mo5835k();

    /* renamed from: l */
    boolean mo5836l();

    /* renamed from: m */
    void mo5837m(String str, Object obj, Object obj2);

    /* renamed from: n */
    void mo5838n(String str, Object... objArr);

    /* renamed from: o */
    void mo5839o(String str, Object... objArr);

    /* renamed from: p */
    void mo5840p(String str, Throwable th2);

    /* renamed from: q */
    void mo5841q(Closeable closeable, IOException iOException);

    /* renamed from: r */
    void mo5842r(String str, Throwable th2);

    /* renamed from: s */
    void mo5843s(Object obj, String str);

    /* renamed from: t */
    void mo5844t(String str, Throwable th2);

    /* renamed from: u */
    void mo5845u(String str, Object... objArr);

    /* renamed from: v */
    void mo5846v(String str);

    /* renamed from: w */
    void mo5847w(String str, Object... objArr);

    void warn(String str);

    void warn(String str, Throwable th2);

    /* renamed from: x */
    void mo5848x(String str, Object obj, Object obj2);

    /* renamed from: y */
    void mo5849y(Object obj, String str);

    /* renamed from: z */
    default InterfaceC2766b mo5850z(EnumC2418c enumC2418c) {
        return mo5826b(enumC2418c) ? mo5824A(enumC2418c) : C2768d.f15337a;
    }
}
