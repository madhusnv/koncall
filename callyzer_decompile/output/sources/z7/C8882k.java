package z7;

import aw.C0462b;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.k */
/* loaded from: classes.dex */
public final class C8882k extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f42765a;

    /* renamed from: b */
    public int f42766b;

    /* renamed from: c */
    public final /* synthetic */ C0462b f42767c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8882k(C0462b c0462b, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f42767c = c0462b;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f42765a = obj;
        this.f42766b |= Integer.MIN_VALUE;
        return this.f42767c.emit(null, this);
    }
}
