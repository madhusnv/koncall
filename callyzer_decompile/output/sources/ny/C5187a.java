package ny;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import net.schmizz.sshj.common.C5033m;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ny.a */
/* loaded from: classes3.dex */
public final class C5187a {

    /* renamed from: b */
    public static final C8687a f25288b = new C8687a(21);

    /* renamed from: a */
    public final C5189c f25289a;

    public C5187a(String str, InterfaceC5188b interfaceC5188b, C5033m c5033m) {
        this.f25289a = new C5189c(str, interfaceC5188b, null, c5033m);
    }

    /* renamed from: a */
    public final void m10142a(long j6) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f25289a.m10149d(j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m10143b() {
        /*
            r3 = this;
            ny.c r0 = r3.f25289a
            java.util.concurrent.locks.ReentrantLock r1 = r0.f25293d
            r1.lock()
            java.lang.Throwable r2 = r0.f25296g     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L13
            java.lang.Object r0 = r0.f25295f     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L11:
            r0 = move-exception
            goto L18
        L13:
            r0 = 0
        L14:
            r1.unlock()
            return r0
        L18:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ny.C5187a.m10143b():boolean");
    }

    /* renamed from: c */
    public final void m10144c() {
        this.f25289a.m10147b(f25288b);
    }

    /* renamed from: d */
    public final void m10145d() {
        this.f25289a.f25293d.unlock();
    }

    public final String toString() {
        return this.f25289a.f25291b;
    }

    public C5187a(String str, InterfaceC5188b interfaceC5188b, ReentrantLock reentrantLock, C5033m c5033m) {
        this.f25289a = new C5189c(str, interfaceC5188b, reentrantLock, c5033m);
    }
}
