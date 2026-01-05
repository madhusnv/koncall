package ea;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import im.o1;
import og.rd;
import pg.v9;
import qd.InterfaceC6187g;
import qw.a0;
import rv.p0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import zb.InterfaceC8921o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ea.a */
/* loaded from: classes.dex */
public final class C1971a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f9213a;

    /* renamed from: b */
    public int f9214b;

    /* renamed from: c */
    public int f9215c;

    /* renamed from: d */
    public Object f9216d;

    /* renamed from: e */
    public Object f9217e;

    /* renamed from: f */
    public Object f9218f;

    /* renamed from: g */
    public Object f9219g;

    /* renamed from: h */
    public Object f9220h;

    /* renamed from: j */
    public Object f9221j;

    /* renamed from: k */
    public Object f9222k;

    /* renamed from: l */
    public Object f9223l;

    /* renamed from: m */
    public Object f9224m;

    /* renamed from: n */
    public Object f9225n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1971a(InterfaceC6187g interfaceC6187g, InterfaceC7559c interfaceC7559c, InterfaceC8921o interfaceC8921o, InterfaceC2139c interfaceC2139c, rd rdVar, v9 v9Var) {
        super(2, interfaceC7559c);
        this.f9213a = 0;
        this.f9218f = interfaceC6187g;
        this.f9219g = interfaceC8921o;
        this.f9220h = interfaceC2139c;
        this.f9221j = rdVar;
        this.f9222k = v9Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f9213a) {
            case 0:
                C1971a c1971a = new C1971a((InterfaceC6187g) this.f9218f, interfaceC7559c, (InterfaceC8921o) this.f9219g, (InterfaceC2139c) this.f9220h, (rd) this.f9221j, (v9) this.f9222k);
                c1971a.f9216d = obj;
                return c1971a;
            case 1:
                return new C1971a((p0) this.f9224m, (o1) this.f9225n, interfaceC7559c, 1);
            default:
                return new C1971a((p0) this.f9224m, (String) this.f9225n, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f9213a) {
        }
        return ((C1971a) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0413  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.C1971a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1971a(p0 p0Var, Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f9213a = i10;
        this.f9224m = p0Var;
        this.f9225n = obj;
    }
}
