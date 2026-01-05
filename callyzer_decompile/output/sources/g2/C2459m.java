package g2;

import ex.InterfaceC2139c;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g2.m */
/* loaded from: classes.dex */
public final class C2459m extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public int f12035a;

    /* renamed from: b */
    public final /* synthetic */ C2460n f12036b;

    /* renamed from: c */
    public final /* synthetic */ float f12037c;

    /* renamed from: d */
    public final /* synthetic */ boolean f12038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2459m(C2460n c2460n, float f6, boolean z6, InterfaceC7559c interfaceC7559c) {
        super(1, interfaceC7559c);
        this.f12036b = c2460n;
        this.f12037c = f6;
        this.f12038d = z6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        return new C2459m(this.f12036b, this.f12037c, this.f12038d, interfaceC7559c);
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        return ((C2459m) create((InterfaceC7559c) obj)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r14.m6776e(r0, r13) == r2) goto L34;
     */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C2459m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
