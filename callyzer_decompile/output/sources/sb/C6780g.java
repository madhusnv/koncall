package sb;

import ec.InterfaceC2004b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import uw.InterfaceC7559c;
import vc.InterfaceC7700c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sb.g */
/* loaded from: classes.dex */
public final class C6780g implements InterfaceC6779f, InterfaceC7700c, Closeable {

    /* renamed from: a */
    public final InterfaceC7700c[] f32244a;

    public C6780g(InterfaceC6779f... interfaceC6779fArr) {
        InterfaceC7700c[] providers = (InterfaceC7700c[]) Arrays.copyOf(interfaceC6779fArr, interfaceC6779fArr.length);
        AbstractC4154l.m8923f(providers, "providers");
        this.f32244a = providers;
        if (providers.length == 0) {
            throw new IllegalArgumentException("at least one provider must be in the chain");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1 A[Catch: all -> 0x002a, TryCatch #3 {all -> 0x002a, blocks: (B:12:0x0025, B:49:0x00cd, B:51:0x00d1, B:53:0x00e1, B:52:0x00d9), top: B:58:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9 A[Catch: all -> 0x002a, TryCatch #3 {all -> 0x002a, blocks: (B:12:0x0025, B:49:0x00cd, B:51:0x00d1, B:53:0x00e1, B:52:0x00d9), top: B:58:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m12973h(sb.C6780g r8, ec.InterfaceC2004b r9, ww.AbstractC8193c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.C6780g.m12973h(sb.g, ec.b, ww.c):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        Exception exc;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC7700c interfaceC7700c : this.f32244a) {
            try {
                exc = null;
                Closeable closeable = interfaceC7700c instanceof Closeable ? (Closeable) interfaceC7700c : null;
                if (closeable != null) {
                    closeable.close();
                }
            } catch (Exception e2) {
                exc = e2;
            }
            if (exc != null) {
                arrayList.add(exc);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Exception exc2 = (Exception) AbstractC6663m.m12742F(arrayList);
        Iterator it = AbstractC6663m.m12738B(arrayList).iterator();
        while (it.hasNext()) {
            exc2.addSuppressed((Throwable) it.next());
        }
        throw exc2;
    }

    @Override // vc.InterfaceC7700c
    public final Object resolve(InterfaceC2004b interfaceC2004b, InterfaceC7559c interfaceC7559c) {
        return m12973h(this, interfaceC2004b, (AbstractC8193c) interfaceC7559c);
    }

    public final String toString() {
        return AbstractC6662l.m12702E(this.f32244a, " -> ", null, 62);
    }
}
