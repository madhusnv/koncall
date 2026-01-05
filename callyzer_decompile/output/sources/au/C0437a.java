package au;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import g4.C2490f;
import g4.C2492h;
import qw.a0;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: au.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0437a implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f3207a;

    /* renamed from: b */
    public final /* synthetic */ C2492h f3208b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f3209c;

    public /* synthetic */ C0437a(C2492h c2492h, InterfaceC2137a interfaceC2137a, int i10) {
        this.f3207a = i10;
        this.f3208b = c2492h;
        this.f3209c = interfaceC2137a;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f3207a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i10) {
            case 0:
                if (((C2490f) AbstractC6663m.m12743G(this.f3208b.m6435b(iIntValue, iIntValue))) != null) {
                    this.f3209c.invoke();
                }
                break;
            case 1:
                if (((C2490f) AbstractC6663m.m12743G(this.f3208b.m6435b(iIntValue, iIntValue))) != null) {
                    this.f3209c.invoke();
                }
                break;
            default:
                if (((C2490f) AbstractC6663m.m12743G(this.f3208b.m6436c(iIntValue, iIntValue, "LEARN_MORE"))) != null) {
                    this.f3209c.invoke();
                }
                break;
        }
        return a0.f30746a;
    }
}
