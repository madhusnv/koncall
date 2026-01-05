package g2;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import q1.C6097y;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e3 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f11438a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7266z f11439b;

    /* renamed from: c */
    public final /* synthetic */ C6097y f11440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(C6097y c6097y, InterfaceC7266z interfaceC7266z, int i10) {
        super(0);
        this.f11438a = i10;
        this.f11440c = c6097y;
        this.f11439b = interfaceC7266z;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        boolean z6;
        boolean z10;
        switch (this.f11438a) {
            case 0:
                tx.c0.m13502y(this.f11439b, null, null, new d3(this.f11440c, (InterfaceC7559c) null, 0), 3);
                return qw.a0.f30746a;
            case 1:
                tx.c0.m13502y(this.f11439b, null, null, new d3(this.f11440c, (InterfaceC7559c) null, 1), 3);
                return qw.a0.f30746a;
            case 2:
                C6097y c6097y = this.f11440c;
                if (c6097y.mo7523d()) {
                    tx.c0.m13502y(this.f11439b, null, null, new d3(c6097y, (InterfaceC7559c) null, 2), 3);
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            default:
                C6097y c6097y2 = this.f11440c;
                if (c6097y2.mo7522c()) {
                    tx.c0.m13502y(this.f11439b, null, null, new d3(c6097y2, (InterfaceC7559c) null, 3), 3);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(InterfaceC7266z interfaceC7266z, C6097y c6097y, int i10) {
        super(0);
        this.f11438a = i10;
        this.f11439b = interfaceC7266z;
        this.f11440c = c6097y;
    }
}
