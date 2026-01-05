package sc;

import i0.m0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import vc.InterfaceC7703f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sc.q */
/* loaded from: classes.dex */
public final class C6797q {

    /* renamed from: d */
    public static final C6797q f32307d = AbstractC6798r.f32311a;

    /* renamed from: a */
    public final InterfaceC6783c f32308a;

    /* renamed from: b */
    public final Map f32309b;

    /* renamed from: c */
    public final InterfaceC7703f f32310c;

    public C6797q(InterfaceC6783c authSchemeResolver, Map configuredAuthSchemes, InterfaceC7703f identityProviderConfig) {
        AbstractC4154l.m8923f(authSchemeResolver, "authSchemeResolver");
        AbstractC4154l.m8923f(configuredAuthSchemes, "configuredAuthSchemes");
        AbstractC4154l.m8923f(identityProviderConfig, "identityProviderConfig");
        this.f32308a = authSchemeResolver;
        this.f32309b = configuredAuthSchemes;
        this.f32310c = identityProviderConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6797q)) {
            return false;
        }
        C6797q c6797q = (C6797q) obj;
        return AbstractC4154l.m8918a(this.f32308a, c6797q.f32308a) && AbstractC4154l.m8918a(this.f32309b, c6797q.f32309b) && AbstractC4154l.m8918a(this.f32310c, c6797q.f32310c);
    }

    public final int hashCode() {
        return this.f32310c.hashCode() + m0.m7369b(this.f32308a.hashCode() * 31, 31, this.f32309b);
    }

    public final String toString() {
        return "OperationAuthConfig(authSchemeResolver=" + this.f32308a + ", configuredAuthSchemes=" + this.f32309b + ", identityProviderConfig=" + this.f32310c + ')';
    }
}
