package jo;

import cj.C0979e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jo.k */
/* loaded from: classes3.dex */
public final class C3815k extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f19738a;

    /* renamed from: b */
    public final /* synthetic */ C0979e f19739b;

    /* renamed from: c */
    public int f19740c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3815k(C0979e c0979e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f19739b = c0979e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f19738a = obj;
        this.f19740c |= Integer.MIN_VALUE;
        return this.f19739b.m2779m(null, this);
    }
}
