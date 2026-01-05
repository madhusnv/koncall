package g2;

import d3.C1565s;
import d3.InterfaceC1566t;
import kotlin.jvm.internal.AbstractC4160r;
import kotlin.jvm.internal.InterfaceC4149g;
import qw.InterfaceC6355e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class ic implements InterfaceC1566t, InterfaceC4149g {

    /* renamed from: a */
    public final /* synthetic */ AbstractC4160r f11823a;

    public ic(AbstractC4160r abstractC4160r) {
        this.f11823a = abstractC4160r;
    }

    @Override // d3.InterfaceC1566t
    /* renamed from: a */
    public final /* synthetic */ long mo5194a() {
        return ((C1565s) this.f11823a.invoke()).f7819a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1566t) || !(obj instanceof InterfaceC4149g)) {
            return false;
        }
        return this.f11823a.equals(((InterfaceC4149g) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.InterfaceC4149g
    public final InterfaceC6355e getFunctionDelegate() {
        return this.f11823a;
    }

    public final int hashCode() {
        return this.f11823a.hashCode();
    }
}
