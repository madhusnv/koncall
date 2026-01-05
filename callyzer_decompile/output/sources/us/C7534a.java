package us;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: us.a */
/* loaded from: classes3.dex */
public final class C7534a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f36281a;

    /* renamed from: b */
    public int f36282b;

    /* renamed from: c */
    public final /* synthetic */ C7536c f36283c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7534a(C7536c c7536c, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f36281a = i10;
        this.f36283c = c7536c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f36281a) {
            case 0:
                return new C7534a(this.f36283c, interfaceC7559c, 0);
            case 1:
                return new C7534a(this.f36283c, interfaceC7559c, 1);
            case 2:
                return new C7534a(this.f36283c, interfaceC7559c, 2);
            default:
                return new C7534a(this.f36283c, interfaceC7559c, 3);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f36281a) {
        }
        return ((C7534a) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us.C7534a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
