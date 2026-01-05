package nz;

import b00.InterfaceC0527l;
import b00.InterfaceC0528m;
import iz.InterfaceC3392y;
import iz.d0;
import iz.k0;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;
import oz.C5783f;
import oz.InterfaceC5781d;
import p020v.x0;
import pz.C6053g;
import qz.C6398p;
import qz.C6399q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.b */
/* loaded from: classes3.dex */
public final class C5191b implements InterfaceC3392y {

    /* renamed from: a */
    public static final C5191b f25300a = new C5191b();

    @Override // iz.InterfaceC3392y
    /* renamed from: a */
    public final k0 mo7804a(C5783f c5783f) throws IOException {
        InterfaceC5781d c6053g;
        C5205p c5205p = (C5205p) c5783f.f28356g;
        synchronized (c5205p) {
            try {
                if (!c5205p.f25372p) {
                    throw new IllegalStateException("released");
                }
                if (c5205p.f25371n) {
                    throw new IllegalStateException("Check failed.");
                }
                if (c5205p.f25370m) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        InterfaceC5198i interfaceC5198i = c5205p.f25366h;
        AbstractC4154l.m8920c(interfaceC5198i);
        C5206q c5206qMo9079a = interfaceC5198i.mo9079a();
        d0 d0Var = c5205p.f25359a;
        c5206qMo9079a.getClass();
        int i10 = c5783f.f28353d;
        Socket socket = c5206qMo9079a.f25380f;
        InterfaceC0528m interfaceC0528m = c5206qMo9079a.f25383i;
        InterfaceC0527l interfaceC0527l = c5206qMo9079a.f25384j;
        C6398p c6398p = c5206qMo9079a.f25387m;
        if (c6398p != null) {
            c6053g = new C6399q(d0Var, c5206qMo9079a, c5783f, c6398p);
        } else {
            socket.setSoTimeout(i10);
            b00.k0 k0VarMo1532f = interfaceC0528m.mo1532f();
            long j6 = i10;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            k0VarMo1532f.mo1585g(j6);
            interfaceC0527l.mo1538f().mo1585g(c5783f.f28354e);
            c6053g = new C6053g(d0Var, c5206qMo9079a, interfaceC0528m, interfaceC0527l);
        }
        C5197h c5197h = new C5197h(c5205p, c5205p.f25362d, interfaceC5198i, c6053g);
        c5205p.f25369l = c5197h;
        c5205p.f25374r = c5197h;
        synchronized (c5205p) {
            c5205p.f25370m = true;
            c5205p.f25371n = true;
        }
        if (c5205p.f25373q) {
            throw new IOException("Canceled");
        }
        return C5783f.m11327a(c5783f, 0, c5197h, null, 61).m11332f((x0) c5783f.f28358i);
    }
}
