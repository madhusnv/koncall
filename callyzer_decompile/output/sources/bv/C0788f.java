package bv;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bv.f */
/* loaded from: classes3.dex */
public final class C0788f extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public C0790h f4972a;

    /* renamed from: b */
    public boolean f4973b;

    /* renamed from: c */
    public int f4974c;

    /* renamed from: d */
    public int f4975d;

    /* renamed from: e */
    public final /* synthetic */ C0790h f4976e;

    /* renamed from: f */
    public final /* synthetic */ boolean f4977f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0788f(C0790h c0790h, boolean z6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4976e = c0790h;
        this.f4977f = z6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C0788f(this.f4976e, this.f4977f, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0788f) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x034a, code lost:
    
        if (r2.mo14775g(zu.C9096z.f43628a, r99) == r11) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x035c, code lost:
    
        if (r2.mo14775g(zu.C9095y.f43627a, r99) == r11) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x035f  */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [bv.h, tx.b0, uw.c, uw.h] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r100) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.C0788f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
