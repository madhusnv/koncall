package fo;

import tq.EnumC7204p;
import wj.C8090p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fo.t */
/* loaded from: classes3.dex */
public final class C2356t extends AbstractC8193c {

    /* renamed from: a */
    public EnumC7204p f10710a;

    /* renamed from: b */
    public /* synthetic */ Object f10711b;

    /* renamed from: c */
    public final /* synthetic */ C8090p f10712c;

    /* renamed from: d */
    public int f10713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2356t(C8090p c8090p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10712c = c8090p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10711b = obj;
        this.f10713d |= Integer.MIN_VALUE;
        return this.f10712c.m15266w(this);
    }
}
