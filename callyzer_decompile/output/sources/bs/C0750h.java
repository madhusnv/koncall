package bs;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bs.h */
/* loaded from: classes3.dex */
public final class C0750h extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f4724a;

    /* renamed from: b */
    public final /* synthetic */ C0751i f4725b;

    /* renamed from: c */
    public int f4726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0750h(C0751i c0751i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f4725b = c0751i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f4724a = obj;
        this.f4726c |= Integer.MIN_VALUE;
        return C0751i.m2050j(this.f4725b, this);
    }
}
