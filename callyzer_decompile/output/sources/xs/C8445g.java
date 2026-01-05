package xs;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xs.g */
/* loaded from: classes3.dex */
public final class C8445g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public int f41194a;

    /* renamed from: b */
    public int f41195b;

    /* renamed from: c */
    public final /* synthetic */ C8449k f41196c;

    /* renamed from: d */
    public final /* synthetic */ boolean f41197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8445g(C8449k c8449k, boolean z6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f41196c = c8449k;
        this.f41197d = z6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C8445g(this.f41196c, this.f41197d, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C8445g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1 A[LOOP:2: B:34:0x00e1->B:43:?, LOOP_START] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xs.C8445g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
