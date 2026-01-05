package g2;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import r1.C6440y;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c4 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f11297a;

    /* renamed from: b */
    public final /* synthetic */ C6440y f11298b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7266z f11299c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4(C6440y c6440y, InterfaceC7266z interfaceC7266z, int i10) {
        super(0);
        this.f11297a = i10;
        this.f11298b = c6440y;
        this.f11299c = interfaceC7266z;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        boolean z6;
        boolean z10;
        switch (this.f11297a) {
            case 0:
                C6440y c6440y = this.f11298b;
                if (c6440y.mo7523d()) {
                    tx.c0.m13502y(this.f11299c, null, null, new b4(c6440y, (InterfaceC7559c) null, 0), 3);
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            default:
                C6440y c6440y2 = this.f11298b;
                if (c6440y2.mo7522c()) {
                    tx.c0.m13502y(this.f11299c, null, null, new b4(c6440y2, (InterfaceC7559c) null, 1), 3);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
