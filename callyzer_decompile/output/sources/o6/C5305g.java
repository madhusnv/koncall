package o6;

import wj.C8090p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o6.g */
/* loaded from: classes.dex */
public final class C5305g extends AbstractC8193c {

    /* renamed from: a */
    public C8090p f26042a;

    /* renamed from: b */
    public /* synthetic */ Object f26043b;

    /* renamed from: c */
    public final /* synthetic */ C8090p f26044c;

    /* renamed from: d */
    public int f26045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5305g(C8090p c8090p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f26044c = c8090p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f26043b = obj;
        this.f26045d |= Integer.MIN_VALUE;
        return this.f26044c.m15251e(this);
    }
}
