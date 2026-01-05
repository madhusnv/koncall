package fo;

import wj.C8090p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fo.q */
/* loaded from: classes3.dex */
public final class C2353q extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f10684a;

    /* renamed from: b */
    public final /* synthetic */ C8090p f10685b;

    /* renamed from: c */
    public int f10686c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2353q(C8090p c8090p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10685b = c8090p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10684a = obj;
        this.f10686c |= Integer.MIN_VALUE;
        return this.f10685b.m15262r(this);
    }
}
