package yn;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yn.m */
/* loaded from: classes3.dex */
public final class C8715m extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public Object f42136a;

    /* renamed from: b */
    public C8716n f42137b;

    /* renamed from: c */
    public Throwable f42138c;

    /* renamed from: d */
    public int f42139d;

    /* renamed from: e */
    public int f42140e;

    /* renamed from: f */
    public final /* synthetic */ C8716n f42141f;

    /* renamed from: g */
    public final /* synthetic */ boolean f42142g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8715m(C8716n c8716n, boolean z6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f42141f = c8716n;
        this.f42142g = z6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C8715m(this.f42141f, this.f42142g, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C8715m) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r9.m16471g(r20) == r10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0117, code lost:
    
        if (r0.m16471g(r20) == r10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0131, code lost:
    
        if (r9.m16471g(r20) == r10) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Throwable, yn.n] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn.C8715m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
