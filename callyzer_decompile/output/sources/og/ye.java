package og;

import c3.C0848c;
import f8.C2217l;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import s4.C6755k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ye {
    /* renamed from: a */
    public static final C6755k m11069a(long j6, long j10) {
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        return new C6755k(i10, i11, ((int) (j10 >> 32)) + i10, ((int) (j10 & 4294967295L)) + i11);
    }

    /* renamed from: b */
    public static C2217l m11070b(InterfaceC4024a connection, String str) {
        AbstractC4154l.m8923f(connection, "connection");
        InterfaceC4026c interfaceC4026cY0 = connection.y0("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + str + '\'');
        try {
            C2217l c2217l = interfaceC4026cY0.r0() ? new C2217l(interfaceC4026cY0.mo1777W(0), interfaceC4026cY0.mo1777W(1)) : new C2217l(str, null);
            mb.m10760a(interfaceC4026cY0, null);
            return c2217l;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                mb.m10760a(interfaceC4026cY0, th2);
                throw th3;
            }
        }
    }

    /* renamed from: c */
    public static final C6755k m11071c(C0848c c0848c) {
        return new C6755k(Math.round(c0848c.f5354a), Math.round(c0848c.f5355b), Math.round(c0848c.f5356c), Math.round(c0848c.f5357d));
    }
}
