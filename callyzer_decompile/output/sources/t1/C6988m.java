package t1;

import ds.C1792p;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import tx.InterfaceC7266z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t1.m */
/* loaded from: classes.dex */
public final class C6988m extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f33825a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC7000y f33826b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7266z f33827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6988m(AbstractC7000y abstractC7000y, InterfaceC7266z interfaceC7266z, int i10) {
        super(0);
        this.f33825a = i10;
        this.f33826b = abstractC7000y;
        this.f33827c = interfaceC7266z;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        boolean z6;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f33825a) {
            case 0:
                AbstractC7000y abstractC7000y = this.f33826b;
                if (abstractC7000y.mo7522c()) {
                    tx.c0.m13502y(this.f33827c, null, null, new C1792p(abstractC7000y, null, 2), 3);
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 1:
                AbstractC7000y abstractC7000y2 = this.f33826b;
                if (abstractC7000y2.mo7523d()) {
                    tx.c0.m13502y(this.f33827c, null, null, new C1792p(abstractC7000y2, null, 3), 3);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 2:
                AbstractC7000y abstractC7000y3 = this.f33826b;
                if (abstractC7000y3.mo7522c()) {
                    tx.c0.m13502y(this.f33827c, null, null, new C1792p(abstractC7000y3, null, 2), 3);
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            default:
                AbstractC7000y abstractC7000y4 = this.f33826b;
                if (abstractC7000y4.mo7523d()) {
                    tx.c0.m13502y(this.f33827c, null, null, new C1792p(abstractC7000y4, null, 3), 3);
                    z12 = true;
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
        }
    }
}
