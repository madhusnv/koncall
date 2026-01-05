package bn;

import e1.C1903e;
import ex.InterfaceC2139c;
import k8.InterfaceC4024a;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bn.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0710b implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f4514a;

    /* renamed from: b */
    public final /* synthetic */ C0711c f4515b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC4024a f4516c;

    public /* synthetic */ C0710b(C0711c c0711c, InterfaceC4024a interfaceC4024a, int i10) {
        this.f4514a = i10;
        this.f4515b = c0711c;
        this.f4516c = interfaceC4024a;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        C1903e _tmpMap = (C1903e) obj;
        switch (this.f4514a) {
            case 0:
                AbstractC4154l.m8923f(_tmpMap, "_tmpMap");
                this.f4515b.m1992a(this.f4516c, _tmpMap);
                break;
            case 1:
                AbstractC4154l.m8923f(_tmpMap, "_tmpMap");
                this.f4515b.m1993b(this.f4516c, _tmpMap);
                break;
            default:
                AbstractC4154l.m8923f(_tmpMap, "_tmpMap");
                this.f4515b.m1994c(this.f4516c, _tmpMap);
                break;
        }
        return a0.f30746a;
    }
}
