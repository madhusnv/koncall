package no;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: no.g */
/* loaded from: classes3.dex */
public final class C5120g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public Object f25078a;

    /* renamed from: b */
    public C5122i f25079b;

    /* renamed from: c */
    public Throwable f25080c;

    /* renamed from: d */
    public int f25081d;

    /* renamed from: e */
    public int f25082e;

    /* renamed from: f */
    public final /* synthetic */ C5122i f25083f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5120g(C5122i c5122i, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f25083f = c5122i;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C5120g(this.f25083f, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C5120g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        if (r14.m16471g(r13) == r8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
    
        if (r14.m16471g(r13) == r8) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.C5120g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
