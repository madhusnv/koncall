package fo;

import tq.EnumC7204p;
import wj.C8090p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fo.n */
/* loaded from: classes3.dex */
public final class C2350n extends AbstractC8193c {

    /* renamed from: a */
    public EnumC7204p f10665a;

    /* renamed from: b */
    public /* synthetic */ Object f10666b;

    /* renamed from: c */
    public final /* synthetic */ C8090p f10667c;

    /* renamed from: d */
    public int f10668d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2350n(C8090p c8090p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f10667c = c8090p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10666b = obj;
        this.f10668d |= Integer.MIN_VALUE;
        return this.f10667c.m15257k(null, this);
    }
}
