package ot;

import ex.InterfaceC2141e;
import pt.C6032f;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ot.h */
/* loaded from: classes3.dex */
public final class C5740h extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f28285a;

    /* renamed from: b */
    public int f28286b;

    /* renamed from: c */
    public final /* synthetic */ C6032f f28287c;

    /* renamed from: d */
    public final /* synthetic */ String f28288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5740h(C6032f c6032f, String str, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f28285a = i10;
        this.f28287c = c6032f;
        this.f28288d = str;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f28285a) {
            case 0:
                return new C5740h(this.f28287c, this.f28288d, interfaceC7559c, 0);
            default:
                return new C5740h(this.f28287c, this.f28288d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f28285a) {
        }
        return ((C5740h) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.C5740h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
