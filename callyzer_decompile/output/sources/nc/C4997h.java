package nc;

import ex.InterfaceC2137a;
import hq.d0;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import oc.C5336c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nc.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C4997h implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f24750a;

    /* renamed from: b */
    public final /* synthetic */ C4367l f24751b;

    public /* synthetic */ C4997h(C4367l c4367l, int i10) {
        this.f24750a = i10;
        this.f24751b = c4367l;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ex.c, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r0v9, types: [ex.c, kotlin.jvm.internal.j] */
    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f24750a) {
            case 0:
                InterfaceC4991b interfaceC4991b = (InterfaceC4991b) ((AbstractC4152j) this.f24751b.f21921b).invoke(new d0(28));
                AbstractC4154l.m8923f(interfaceC4991b, "<this>");
                return interfaceC4991b instanceof C5336c ? interfaceC4991b : new C5336c(interfaceC4991b);
            default:
                InterfaceC4991b interfaceC4991b2 = (InterfaceC4991b) ((AbstractC4152j) this.f24751b.f21921b).invoke(new d0(27));
                AbstractC4154l.m8923f(interfaceC4991b2, "<this>");
                return interfaceC4991b2 instanceof C5336c ? interfaceC4991b2 : new C5336c(interfaceC4991b2);
        }
    }
}
