package wc;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.o */
/* loaded from: classes.dex */
public final class C7981o extends AbstractC8193c {

    /* renamed from: a */
    public C7985s f38387a;

    /* renamed from: b */
    public C7983q f38388b;

    /* renamed from: c */
    public long f38389c;

    /* renamed from: d */
    public /* synthetic */ Object f38390d;

    /* renamed from: e */
    public final /* synthetic */ C7983q f38391e;

    /* renamed from: f */
    public int f38392f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7981o(C7983q c7983q, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38391e = c7983q;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38390d = obj;
        this.f38392f |= Integer.MIN_VALUE;
        return this.f38391e.read(null, 0L, this);
    }
}
