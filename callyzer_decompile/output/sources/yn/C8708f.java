package yn;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yn.f */
/* loaded from: classes3.dex */
public final class C8708f extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42089a;

    /* renamed from: b */
    public C8805t f42090b;

    /* renamed from: c */
    public int f42091c;

    /* renamed from: d */
    public final /* synthetic */ C8716n f42092d;

    /* renamed from: e */
    public final /* synthetic */ String f42093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8708f(C8716n c8716n, String str, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f42089a = i10;
        this.f42092d = c8716n;
        this.f42093e = str;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f42089a) {
            case 0:
                return new C8708f(this.f42092d, this.f42093e, interfaceC7559c, 0);
            case 1:
                return new C8708f(this.f42092d, this.f42093e, interfaceC7559c, 1);
            default:
                return new C8708f(this.f42092d, this.f42093e, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f42089a) {
        }
        return ((C8708f) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0116 A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:44:0x00d4, B:75:0x012f, B:50:0x00e4, B:71:0x0123, B:51:0x00e8, B:66:0x0112, B:68:0x0116, B:76:0x0146, B:52:0x00ec, B:58:0x00fd, B:60:0x0101, B:63:0x0107, B:77:0x014c, B:55:0x00f3), top: B:82:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0146 A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:44:0x00d4, B:75:0x012f, B:50:0x00e4, B:71:0x0123, B:51:0x00e8, B:66:0x0112, B:68:0x0116, B:76:0x0146, B:52:0x00ec, B:58:0x00fd, B:60:0x0101, B:63:0x0107, B:77:0x014c, B:55:0x00f3), top: B:82:0x00c8 }] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn.C8708f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
