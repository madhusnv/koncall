package jo;

import cj.C0979e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jo.d */
/* loaded from: classes3.dex */
public final class C3808d extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f19699a;

    /* renamed from: b */
    public final /* synthetic */ C0979e f19700b;

    /* renamed from: c */
    public int f19701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3808d(C0979e c0979e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f19700b = c0979e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f19699a = obj;
        this.f19701c |= Integer.MIN_VALUE;
        return this.f19700b.m2775i(null, this);
    }
}
