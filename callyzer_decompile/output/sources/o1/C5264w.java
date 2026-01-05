package o1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import u3.InterfaceC7332c;
import u3.InterfaceC7335f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.w */
/* loaded from: classes.dex */
public final class C5264w implements InterfaceC7332c {

    /* renamed from: a */
    public final InterfaceC2139c f25857a;

    /* renamed from: b */
    public v1 f25858b;

    public C5264w(InterfaceC2139c interfaceC2139c) {
        this.f25857a = interfaceC2139c;
    }

    @Override // u3.InterfaceC7332c
    /* renamed from: d */
    public final void mo10373d(InterfaceC7335f interfaceC7335f) {
        v1 v1Var = (v1) interfaceC7335f.mo13728d(y1.f25893a);
        if (AbstractC4154l.m8918a(v1Var, this.f25858b)) {
            return;
        }
        this.f25858b = v1Var;
        this.f25857a.invoke(v1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5264w) && ((C5264w) obj).f25857a == this.f25857a;
    }

    public final int hashCode() {
        return this.f25857a.hashCode();
    }
}
