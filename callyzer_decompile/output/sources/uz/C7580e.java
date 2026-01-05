package uz;

import bl.C0689a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5163a;
import tz.AbstractC7285d;
import tz.C7284c;
import ug.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uz.e */
/* loaded from: classes3.dex */
public class C7580e implements InterfaceC7589n {

    /* renamed from: e */
    public static final a0 f36457e = new a0(19);

    /* renamed from: a */
    public final Class f36458a;

    /* renamed from: b */
    public final Method f36459b;

    /* renamed from: c */
    public final Method f36460c;

    /* renamed from: d */
    public final Method f36461d;

    public C7580e(Class cls) throws NoSuchMethodException, SecurityException {
        this.f36458a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC4154l.m8922e(declaredMethod, "getDeclaredMethod(...)");
        this.f36459b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f36460c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f36461d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: a */
    public final boolean mo14309a(SSLSocket sSLSocket) {
        return this.f36458a.isInstance(sSLSocket);
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: b */
    public final boolean mo14310b() {
        boolean z6 = C7284c.f34748d;
        return C7284c.f34748d;
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: c */
    public final String mo14311c(SSLSocket sSLSocket) {
        if (this.f36458a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f36460c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC5163a.f25245a);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (!(cause instanceof NullPointerException) || !AbstractC4154l.m8918a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e10);
                }
            }
        }
        return null;
    }

    @Override // uz.InterfaceC7589n
    /* renamed from: d */
    public final void mo14312d(SSLSocket sSLSocket, String str, List protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC4154l.m8923f(protocols, "protocols");
        if (this.f36458a.isInstance(sSLSocket)) {
            try {
                this.f36459b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f36461d;
                AbstractC7285d abstractC7285d = AbstractC7285d.f34750a;
                method.invoke(sSLSocket, C0689a.m1984l(protocols));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }
}
