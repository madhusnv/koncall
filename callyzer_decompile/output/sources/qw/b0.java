package qw;

import ex.InterfaceC2137a;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 implements InterfaceC6357g, Serializable {

    /* renamed from: a */
    public InterfaceC2137a f30750a;

    /* renamed from: b */
    public Object f30751b;

    @Override // qw.InterfaceC6357g
    public final Object getValue() {
        if (this.f30751b == C6374x.f30774a) {
            InterfaceC2137a interfaceC2137a = this.f30750a;
            AbstractC4154l.m8920c(interfaceC2137a);
            this.f30751b = interfaceC2137a.invoke();
            this.f30750a = null;
        }
        return this.f30751b;
    }

    @Override // qw.InterfaceC6357g
    public final boolean isInitialized() {
        return this.f30751b != C6374x.f30774a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
