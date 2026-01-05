package g2;

import a2.C0036i;
import d4.AbstractC1594v;
import d4.C1573a;
import d4.C1582j;
import d4.C1583k;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ma extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f12117a;

    /* renamed from: b */
    public final /* synthetic */ qa f12118b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma(qa qaVar, int i10) {
        super(1);
        this.f12117a = i10;
        this.f12118b = qaVar;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f12117a) {
            case 0:
                InterfaceC1596x interfaceC1596x = (InterfaceC1596x) obj;
                AbstractC1594v.m5228f(interfaceC1596x);
                C1583k c1583k = (C1583k) interfaceC1596x;
                c1583k.m5202q(C1582j.f7862u, new C1573a(null, new C0036i(10, this.f12118b)));
                return qw.a0.f30746a;
            default:
                return Boolean.valueOf(AbstractC4154l.m8918a(((q5) obj).f12486a, this.f12118b));
        }
    }
}
