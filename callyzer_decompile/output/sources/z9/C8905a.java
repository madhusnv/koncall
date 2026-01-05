package z9;

import sc.C6804x;
import ww.AbstractC8193c;
import x9.C8316a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z9.a */
/* loaded from: classes.dex */
public final class C8905a extends AbstractC8193c {

    /* renamed from: a */
    public C6804x f42867a;

    /* renamed from: b */
    public /* synthetic */ Object f42868b;

    /* renamed from: c */
    public final /* synthetic */ C8316a f42869c;

    /* renamed from: d */
    public int f42870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8905a(C8316a c8316a, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f42869c = c8316a;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f42868b = obj;
        this.f42870d |= Integer.MIN_VALUE;
        return this.f42869c.mo1858o(null, this);
    }
}
