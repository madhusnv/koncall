package s1;

import tx.C7251k;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s1.c */
/* loaded from: classes.dex */
public final class C6708c extends AbstractC8193c {

    /* renamed from: a */
    public C7251k f32046a;

    /* renamed from: b */
    public /* synthetic */ Object f32047b;

    /* renamed from: c */
    public final /* synthetic */ C6709d f32048c;

    /* renamed from: d */
    public int f32049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6708c(C6709d c6709d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f32048c = c6709d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f32047b = obj;
        this.f32049d |= Integer.MIN_VALUE;
        return this.f32048c.m12844h(this);
    }
}
