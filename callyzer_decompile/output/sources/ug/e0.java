package ug;

import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: f */
    public static final Object f35368f = new Object();

    /* renamed from: a */
    public final String f35369a;

    /* renamed from: b */
    public final InterfaceC7450u f35370b;

    /* renamed from: c */
    public final Object f35371c;

    /* renamed from: d */
    public final Object f35372d = new Object();

    /* renamed from: e */
    public volatile Object f35373e = null;

    public /* synthetic */ e0(String str, Object obj, InterfaceC7450u interfaceC7450u) {
        this.f35369a = str;
        this.f35371c = obj;
        this.f35370b = interfaceC7450u;
    }

    /* renamed from: a */
    public final Object m13872a(Object obj) {
        synchronized (this.f35372d) {
        }
        if (obj != null) {
            return obj;
        }
        if (z1.f36035k == null) {
            return this.f35371c;
        }
        synchronized (f35368f) {
            try {
                if (C8687a.m16043t()) {
                    return this.f35373e == null ? this.f35371c : this.f35373e;
                }
                try {
                    for (e0 e0Var : f0.f35406a) {
                        if (C8687a.m16043t()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            InterfaceC7450u interfaceC7450u = e0Var.f35370b;
                            if (interfaceC7450u != null) {
                                objZza = interfaceC7450u.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f35368f) {
                            e0Var.f35373e = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC7450u interfaceC7450u2 = this.f35370b;
                if (interfaceC7450u2 != null) {
                    try {
                        return interfaceC7450u2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f35371c;
            } finally {
            }
        }
    }
}
