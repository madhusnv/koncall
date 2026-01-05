package yp;

import ex.InterfaceC2141e;
import im.InterfaceC3307i;
import qw.a0;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yp.h */
/* loaded from: classes3.dex */
public final class C8728h extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42234a;

    /* renamed from: b */
    public int f42235b;

    /* renamed from: c */
    public /* synthetic */ Object f42236c;

    /* renamed from: d */
    public final /* synthetic */ C8735o f42237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8728h(C8735o c8735o, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f42234a = i10;
        this.f42237d = c8735o;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f42234a) {
            case 0:
                C8728h c8728h = new C8728h(this.f42237d, interfaceC7559c, 0);
                c8728h.f42236c = obj;
                return c8728h;
            default:
                C8728h c8728h2 = new C8728h(this.f42237d, interfaceC7559c, 1);
                c8728h2.f42236c = obj;
                return c8728h2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42234a) {
            case 0:
                return ((C8728h) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            default:
                return ((C8728h) create((Throwable) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yp.C8728h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
