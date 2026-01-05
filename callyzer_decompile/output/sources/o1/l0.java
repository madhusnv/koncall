package o1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import m2.C4640e;
import w2.InterfaceC7877p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f25780a;

    /* renamed from: b */
    public final /* synthetic */ C4640e f25781b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i10, C4640e c4640e) {
        super(1);
        this.f25780a = i10;
        this.f25781b = c4640e;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f25780a) {
            case 0:
                C4640e c4640e = this.f25781b;
                Object[] objArr = c4640e.f22884a;
                int i10 = c4640e.f22886c;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((t3.k0) objArr[i11]).mo12110d();
                }
                return qw.a0.f30746a;
            default:
                this.f25781b.m9506b((InterfaceC7877p) obj);
                return Boolean.TRUE;
        }
    }
}
