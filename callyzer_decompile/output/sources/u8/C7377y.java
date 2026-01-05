package u8;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u8.y */
/* loaded from: classes.dex */
public final class C7377y extends AbstractC8193c {

    /* renamed from: a */
    public C7378z f35062a;

    /* renamed from: b */
    public /* synthetic */ Object f35063b;

    /* renamed from: c */
    public final /* synthetic */ C7378z f35064c;

    /* renamed from: d */
    public int f35065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7377y(C7378z c7378z, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f35064c = c7378z;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f35063b = obj;
        this.f35065d |= Integer.MIN_VALUE;
        return C7378z.m13790a(this.f35064c, this);
    }
}
