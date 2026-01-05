package g2;

import ex.InterfaceC2141e;
import h1.C2772c;
import m1.InterfaceC4628j;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f12151a;

    /* renamed from: b */
    public int f12152b;

    /* renamed from: c */
    public final /* synthetic */ Object f12153c;

    /* renamed from: d */
    public final /* synthetic */ float f12154d;

    /* renamed from: e */
    public final /* synthetic */ boolean f12155e;

    /* renamed from: f */
    public final /* synthetic */ Object f12156f;

    /* renamed from: g */
    public final /* synthetic */ Object f12157g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(C2772c c2772c, float f6, boolean z6, InterfaceC4628j interfaceC4628j, k2.w0 w0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f12151a = 2;
        this.f12153c = c2772c;
        this.f12154d = f6;
        this.f12155e = z6;
        this.f12156f = interfaceC4628j;
        this.f12157g = w0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f12151a) {
            case 0:
                return new n0((C2772c) this.f12153c, this.f12154d, this.f12155e, (o0) this.f12157g, (InterfaceC4628j) this.f12156f, interfaceC7559c, 0);
            case 1:
                return new n0((C2772c) this.f12153c, this.f12154d, this.f12155e, (v0) this.f12157g, (InterfaceC4628j) this.f12156f, interfaceC7559c, 1);
            case 2:
                return new n0((C2772c) this.f12153c, this.f12154d, this.f12155e, (InterfaceC4628j) this.f12156f, (k2.w0) this.f12157g, interfaceC7559c);
            default:
                return new n0((C2460n) this.f12153c, this.f12154d, this.f12155e, (k2.w0) this.f12157g, (k2.w0) this.f12156f, interfaceC7559c, 3);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f12151a) {
        }
        return ((n0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (r10.m6776e(r1, r15) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (h2.AbstractC2816u.m6923a(r10, r5, r1, r9, r15) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
    
        return r0;
     */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj, float f6, boolean z6, Object obj2, Object obj3, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f12151a = i10;
        this.f12153c = obj;
        this.f12154d = f6;
        this.f12155e = z6;
        this.f12157g = obj2;
        this.f12156f = obj3;
    }
}
