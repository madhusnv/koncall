package kr;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import k2.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.j */
/* loaded from: classes3.dex */
public final class C4195j implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f21265a;

    /* renamed from: b */
    public final /* synthetic */ boolean f21266b;

    /* renamed from: c */
    public final /* synthetic */ Object f21267c;

    public /* synthetic */ C4195j(boolean z6, Object obj, int i10) {
        this.f21265a = i10;
        this.f21266b = z6;
        this.f21267c = obj;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f21265a) {
            case 0:
                if (this.f21266b) {
                    ((w0) this.f21267c).setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                }
                break;
            case 1:
                if (this.f21266b) {
                    ((InterfaceC2139c) this.f21267c).invoke(Boolean.TRUE);
                }
                break;
            default:
                if (!this.f21266b) {
                    ((InterfaceC2137a) this.f21267c).invoke();
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
