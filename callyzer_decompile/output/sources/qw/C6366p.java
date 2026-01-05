package qw;

import ex.InterfaceC2137a;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qw.p */
/* loaded from: classes3.dex */
public final class C6366p implements InterfaceC6357g, Serializable {

    /* renamed from: a */
    public InterfaceC2137a f30762a;

    /* renamed from: b */
    public volatile Object f30763b;

    /* renamed from: c */
    public final Object f30764c;

    public C6366p(InterfaceC2137a initializer) {
        AbstractC4154l.m8923f(initializer, "initializer");
        this.f30762a = initializer;
        this.f30763b = C6374x.f30774a;
        this.f30764c = this;
    }

    @Override // qw.InterfaceC6357g
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f30763b;
        C6374x c6374x = C6374x.f30774a;
        if (obj != c6374x) {
            return obj;
        }
        synchronized (this.f30764c) {
            objInvoke = this.f30763b;
            if (objInvoke == c6374x) {
                InterfaceC2137a interfaceC2137a = this.f30762a;
                AbstractC4154l.m8920c(interfaceC2137a);
                objInvoke = interfaceC2137a.invoke();
                this.f30763b = objInvoke;
                this.f30762a = null;
            }
        }
        return objInvoke;
    }

    @Override // qw.InterfaceC6357g
    public final boolean isInitialized() {
        return this.f30763b != C6374x.f30774a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
