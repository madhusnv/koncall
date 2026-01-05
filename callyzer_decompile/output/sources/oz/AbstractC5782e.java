package oz;

import b00.C0526k;
import b00.C0529n;
import iz.k0;
import java.io.EOFException;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import nx.AbstractC5163a;
import ph.C5950e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oz.e */
/* loaded from: classes3.dex */
public abstract class AbstractC5782e {

    /* renamed from: a */
    public static final C0529n f28348a;

    /* renamed from: b */
    public static final C0529n f28349b;

    static {
        C0529n c0529n = C0529n.f3647d;
        f28348a = C5950e.m11977h("\"\\");
        f28349b = C5950e.m11977h("\t ,=");
    }

    /* renamed from: a */
    public static final boolean m11322a(k0 k0Var) {
        if (AbstractC4154l.m8918a((String) k0Var.f17917a.f36755c, "HEAD")) {
            return false;
        }
        int i10 = k0Var.f17920d;
        if (((i10 < 100 || i10 >= 200) && i10 != 204 && i10 != 304) || AbstractC4299e.m9016e(k0Var) != -1) {
            return true;
        }
        String strM7787b = k0Var.f17922f.m7787b("Transfer-Encoding");
        if (strM7787b == null) {
            strM7787b = null;
        }
        return "chunked".equalsIgnoreCase(strM7787b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0106, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0106, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m11323b(b00.C0526k r17, java.util.ArrayList r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz.AbstractC5782e.m11323b(b00.k, java.util.ArrayList):void");
    }

    /* renamed from: c */
    public static final String m11324c(C0526k c0526k) {
        long jM1589P = c0526k.m1589P(f28349b);
        if (jM1589P == -1) {
            jM1589P = c0526k.f3638b;
        }
        if (jM1589P != 0) {
            return c0526k.a0(jM1589P, AbstractC5163a.f25245a);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c3, code lost:
    
        if (kz.AbstractC4296b.f21702a.m10087c(r0) == false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m11325d(iz.C3381n r35, iz.C3391x r36, iz.C3389v r37) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz.AbstractC5782e.m11325d(iz.n, iz.x, iz.v):void");
    }

    /* renamed from: e */
    public static final boolean m11326e(C0526k c0526k) throws EOFException {
        boolean z6 = false;
        while (!c0526k.mo1545e()) {
            byte bM1587H = c0526k.m1587H(0L);
            if (bM1587H != 44) {
                if (bM1587H != 32 && bM1587H != 9) {
                    break;
                }
                c0526k.readByte();
            } else {
                c0526k.readByte();
                z6 = true;
            }
        }
        return z6;
    }
}
