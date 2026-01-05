package kr;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.p */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4201p implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f21288a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f21289b;

    /* renamed from: c */
    public final /* synthetic */ boolean f21290c;

    public /* synthetic */ C4201p(InterfaceC2139c interfaceC2139c, boolean z6) {
        this.f21288a = 0;
        this.f21290c = z6;
        this.f21289b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f21288a) {
            case 0:
                if (this.f21290c) {
                    this.f21289b.invoke(Boolean.TRUE);
                }
                return qw.a0.f30746a;
            case 1:
                this.f21289b.invoke(Boolean.valueOf(!this.f21290c));
                break;
            default:
                this.f21289b.invoke(Boolean.valueOf(!this.f21290c));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C4201p(InterfaceC2139c interfaceC2139c, boolean z6, int i10) {
        this.f21288a = i10;
        this.f21289b = interfaceC2139c;
        this.f21290c = z6;
    }
}
