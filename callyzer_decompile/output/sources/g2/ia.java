package g2;

import d4.AbstractC1594v;
import d4.C1573a;
import d4.C1582j;
import d4.C1583k;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import lx.InterfaceC4574m;
import s4.InterfaceC6747c;
import t1.AbstractC7000y;
import t1.C6988m;
import tx.InterfaceC7266z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ia extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11815a;

    /* renamed from: b */
    public final /* synthetic */ boolean f11816b;

    /* renamed from: c */
    public final /* synthetic */ Object f11817c;

    /* renamed from: d */
    public final /* synthetic */ Object f11818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ia(int i10, Object obj, Object obj2, boolean z6) {
        super(1);
        this.f11815a = i10;
        this.f11816b = z6;
        this.f11817c = obj;
        this.f11818d = obj2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f11815a;
        boolean z6 = this.f11816b;
        Object obj2 = this.f11817c;
        Object obj3 = this.f11818d;
        switch (i10) {
            case 0:
                return new ja(z6, (InterfaceC6747c) obj2, (ka) obj, (InterfaceC2139c) obj3);
            default:
                InterfaceC1596x interfaceC1596x = (InterfaceC1596x) obj;
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj3;
                AbstractC7000y abstractC7000y = (AbstractC7000y) obj2;
                if (z6) {
                    C6988m c6988m = new C6988m(abstractC7000y, interfaceC7266z, 0);
                    InterfaceC4574m[] interfaceC4574mArr = AbstractC1594v.f7944a;
                    C1583k c1583k = (C1583k) interfaceC1596x;
                    c1583k.m5202q(C1582j.f7865x, new C1573a(null, c6988m));
                    c1583k.m5202q(C1582j.f7867z, new C1573a(null, new C6988m(abstractC7000y, interfaceC7266z, 1)));
                } else {
                    C6988m c6988m2 = new C6988m(abstractC7000y, interfaceC7266z, 2);
                    InterfaceC4574m[] interfaceC4574mArr2 = AbstractC1594v.f7944a;
                    C1583k c1583k2 = (C1583k) interfaceC1596x;
                    c1583k2.m5202q(C1582j.f7866y, new C1573a(null, c6988m2));
                    c1583k2.m5202q(C1582j.f7840A, new C1573a(null, new C6988m(abstractC7000y, interfaceC7266z, 3)));
                }
                return qw.a0.f30746a;
        }
    }
}
