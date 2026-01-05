package z8;

import a9.AbstractC0067f;
import c9.C0922q;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7077w;
import t8.EnumC7078x;
import y8.C8596e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z8.g */
/* loaded from: classes.dex */
public final class C8904g extends AbstractC8900c {

    /* renamed from: b */
    public final int f42866b;

    static {
        AbstractC4154l.m8922e(C7077w.m13372b("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8904g(AbstractC0067f tracker) {
        super(tracker);
        AbstractC4154l.m8923f(tracker, "tracker");
        this.f42866b = 7;
    }

    @Override // z8.InterfaceC8902e
    /* renamed from: a */
    public final boolean mo15950a(C0922q workSpec) {
        AbstractC4154l.m8923f(workSpec, "workSpec");
        return workSpec.f5631j.f34129a == EnumC7078x.NOT_ROAMING;
    }

    @Override // z8.AbstractC8900c
    /* renamed from: d */
    public final int mo16404d() {
        return this.f42866b;
    }

    @Override // z8.AbstractC8900c
    /* renamed from: e */
    public final boolean mo16405e(Object obj) {
        C8596e value = (C8596e) obj;
        AbstractC4154l.m8923f(value, "value");
        return (value.f41842a && value.f41845d) ? false : true;
    }
}
