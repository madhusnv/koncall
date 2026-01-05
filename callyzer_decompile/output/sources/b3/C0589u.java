package b3;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.InterfaceC4149g;
import qw.InterfaceC6355e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b3.u */
/* loaded from: classes.dex */
public final /* synthetic */ class C0589u implements InterfaceC4149g {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC2139c f3963a;

    public C0589u(InterfaceC2139c interfaceC2139c) {
        this.f3963a = interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0589u)) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f3963a, ((InterfaceC4149g) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.InterfaceC4149g
    public final InterfaceC6355e getFunctionDelegate() {
        return this.f3963a;
    }

    public final int hashCode() {
        return this.f3963a.hashCode();
    }
}
