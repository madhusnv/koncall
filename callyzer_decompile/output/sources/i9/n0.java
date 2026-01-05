package i9;

import ec.InterfaceC2004b;
import kotlin.jvm.internal.AbstractC4154l;
import og.gf;
import sb.InterfaceC6777d;
import sb.InterfaceC6779f;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 implements InterfaceC6779f {

    /* renamed from: a */
    public final InterfaceC6777d f17223a;

    public n0(InterfaceC6777d credentials) {
        AbstractC4154l.m8923f(credentials, "credentials");
        this.f17223a = credentials;
    }

    @Override // vc.InterfaceC7700c
    public final Object resolve(InterfaceC2004b interfaceC2004b, InterfaceC7559c interfaceC7559c) {
        return this.f17223a;
    }

    public final String toString() {
        return gf.m10673a(this);
    }
}
