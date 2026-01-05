package dt;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.o */
/* loaded from: classes3.dex */
public final class C1809o extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8747a;

    /* renamed from: b */
    public boolean f8748b;

    /* renamed from: c */
    public int f8749c;

    /* renamed from: d */
    public final /* synthetic */ C1813s f8750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1809o(C1813s c1813s, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8747a = i10;
        this.f8750d = c1813s;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8747a) {
            case 0:
                return new C1809o(this.f8750d, interfaceC7559c, 0);
            default:
                return new C1809o(this.f8750d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8747a) {
        }
        return ((C1809o) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fc  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt.C1809o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
