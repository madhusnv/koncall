package xe;

import a1.RunnableC0024w;
import a2.AbstractC0030c;
import android.content.Context;
import cf.InterfaceC0965c;
import gf.InterfaceC2585a;
import h6.C2859o;
import io.C3328c;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import ue.C7421c;
import ug.C7439j;
import ve.C7707a;
import wj.C8090p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xe.q */
/* loaded from: classes.dex */
public final class C8365q {

    /* renamed from: e */
    public static volatile C8358j f40019e;

    /* renamed from: a */
    public final InterfaceC2585a f40020a;

    /* renamed from: b */
    public final InterfaceC2585a f40021b;

    /* renamed from: c */
    public final InterfaceC0965c f40022c;

    /* renamed from: d */
    public final C3328c f40023d;

    public C8365q(InterfaceC2585a interfaceC2585a, InterfaceC2585a interfaceC2585a2, InterfaceC0965c interfaceC0965c, C3328c c3328c, C8090p c8090p) {
        this.f40020a = interfaceC2585a;
        this.f40021b = interfaceC2585a2;
        this.f40022c = interfaceC0965c;
        this.f40023d = c3328c;
        ((Executor) c8090p.f38723a).execute(new RunnableC0024w(12, c8090p));
    }

    /* renamed from: a */
    public static C8365q m15536a() {
        C8358j c8358j = f40019e;
        if (c8358j != null) {
            return (C8365q) c8358j.f40006f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: b */
    public static void m15537b(Context context) {
        if (f40019e == null) {
            synchronized (C8365q.class) {
                try {
                    if (f40019e == null) {
                        C2859o c2859o = new C2859o();
                        context.getClass();
                        c2859o.f15868a = context;
                        f40019e = c2859o.m6990a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: c */
    public final C8363o m15538c(InterfaceC8359k interfaceC8359k) {
        byte[] bytes;
        Set setUnmodifiableSet = interfaceC8359k != null ? Collections.unmodifiableSet(C7707a.f37226d) : Collections.singleton(new C7421c("proto"));
        C7439j c7439jM15532a = C8357i.m15532a();
        interfaceC8359k.getClass();
        c7439jM15532a.f35538c = "cct";
        C7707a c7707a = (C7707a) interfaceC8359k;
        String str = c7707a.f37229a;
        String str2 = c7707a.f37230b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = AbstractC0030c.m121l("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        c7439jM15532a.f35537b = bytes;
        return new C8363o(setUnmodifiableSet, c7439jM15532a.m14003n(), this);
    }
}
