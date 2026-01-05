package o3;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o3.c */
/* loaded from: classes.dex */
public final class C5280c extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f25932a;

    /* renamed from: b */
    public final /* synthetic */ C5281d f25933b;

    /* renamed from: c */
    public int f25934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5280c(C5281d c5281d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f25933b = c5281d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f25932a = obj;
        this.f25934c |= Integer.MIN_VALUE;
        return this.f25933b.m10429b(0L, this);
    }
}
