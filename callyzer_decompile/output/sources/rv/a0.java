package rv;

import ex.InterfaceC2141e;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f31818a;

    /* renamed from: b */
    public int f31819b;

    /* renamed from: c */
    public final /* synthetic */ p0 f31820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(p0 p0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f31818a = i10;
        this.f31820c = p0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f31818a) {
            case 0:
                return new a0(this.f31820c, interfaceC7559c, 0);
            case 1:
                return new a0(this.f31820c, interfaceC7559c, 1);
            case 2:
                return new a0(this.f31820c, interfaceC7559c, 2);
            case 3:
                return new a0(this.f31820c, interfaceC7559c, 3);
            case 4:
                return new a0(this.f31820c, interfaceC7559c, 4);
            case 5:
                return new a0(this.f31820c, interfaceC7559c, 5);
            case 6:
                return new a0(this.f31820c, interfaceC7559c, 6);
            case 7:
                return new a0(this.f31820c, interfaceC7559c, 7);
            case 8:
                return new a0(this.f31820c, interfaceC7559c, 8);
            case 9:
                return new a0(this.f31820c, interfaceC7559c, 9);
            case 10:
                return new a0(this.f31820c, interfaceC7559c, 10);
            case 11:
                return new a0(this.f31820c, interfaceC7559c, 11);
            default:
                return new a0(this.f31820c, interfaceC7559c, 12);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f31818a) {
        }
        return ((a0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01dc, code lost:
    
        if (r2.mo14775g(rv.d0.f31827a, r39) == r11) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e8, code lost:
    
        if (r2.mo14775g(r12, r39) == r11) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x021a, code lost:
    
        if (r2.mo14775g(r12, r39) == r11) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0225, code lost:
    
        if (r1.mo14775g(r5, r39) == r11) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:?, code lost:
    
        return r11;
     */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
