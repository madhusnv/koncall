package xs;

import ex.InterfaceC2141e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xs.j */
/* loaded from: classes3.dex */
public final class C8448j extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public Object f41206a;

    /* renamed from: b */
    public C8449k f41207b;

    /* renamed from: c */
    public Throwable f41208c;

    /* renamed from: d */
    public int f41209d;

    /* renamed from: e */
    public int f41210e;

    /* renamed from: f */
    public final /* synthetic */ C8449k f41211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8448j(C8449k c8449k, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f41211f = c8449k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C8448j(this.f41211f, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C8448j) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xs.C8448j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
