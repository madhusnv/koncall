package g4;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4155m;
import t2.C7002a;
import t2.InterfaceC7012k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 implements InterfaceC7012k {

    /* renamed from: a */
    public final /* synthetic */ AbstractC4155m f13567a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC4155m f13568b;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(InterfaceC2141e interfaceC2141e, InterfaceC2139c interfaceC2139c) {
        this.f13567a = (AbstractC4155m) interfaceC2141e;
        this.f13568b = (AbstractC4155m) interfaceC2139c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.c, kotlin.jvm.internal.m] */
    @Override // t2.InterfaceC7012k
    /* renamed from: a */
    public final Object mo2637a(Object obj) {
        return this.f13568b.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.e, kotlin.jvm.internal.m] */
    @Override // t2.InterfaceC7012k
    /* renamed from: b */
    public final Object mo2638b(C7002a c7002a, Object obj) {
        return this.f13567a.invoke(c7002a, obj);
    }
}
