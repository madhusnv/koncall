package oo;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oo.k */
/* loaded from: classes3.dex */
public final class C5430k extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public Object f27314a;

    /* renamed from: b */
    public C5431l f27315b;

    /* renamed from: c */
    public Throwable f27316c;

    /* renamed from: d */
    public int f27317d;

    /* renamed from: e */
    public int f27318e;

    /* renamed from: f */
    public final /* synthetic */ C5431l f27319f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5430k(C5431l c5431l, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f27319f = c5431l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C5430k(this.f27319f, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C5430k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        if (r14.m16471g(r13) == r8) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00eb, code lost:
    
        if (r14.m16471g(r13) == r8) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.C5430k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
