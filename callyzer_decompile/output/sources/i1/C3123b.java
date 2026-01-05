package i1;

import ex.InterfaceC2141e;
import m1.InterfaceC4630l;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.b */
/* loaded from: classes.dex */
public final class C3123b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public boolean f16798a;

    /* renamed from: b */
    public int f16799b;

    /* renamed from: c */
    public /* synthetic */ Object f16800c;

    /* renamed from: d */
    public final /* synthetic */ k1.a1 f16801d;

    /* renamed from: e */
    public final /* synthetic */ long f16802e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC4630l f16803f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC3126e f16804g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3123b(k1.a1 a1Var, long j6, InterfaceC4630l interfaceC4630l, AbstractC3126e abstractC3126e, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f16801d = a1Var;
        this.f16802e = j6;
        this.f16803f = interfaceC4630l;
        this.f16804g = abstractC3126e;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        C3123b c3123b = new C3123b(this.f16801d, this.f16802e, this.f16803f, this.f16804g, interfaceC7559c);
        c3123b.f16800c = obj;
        return c3123b;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C3123b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        if (r15.mo9501a(r2, r17) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        if (r15.mo9501a(r3, r17) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C3123b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
