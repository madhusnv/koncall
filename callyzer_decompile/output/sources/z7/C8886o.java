package z7;

import o6.C5322x;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.o */
/* loaded from: classes.dex */
public final class C8886o extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f42795a;

    /* renamed from: b */
    public final /* synthetic */ C5322x f42796b;

    /* renamed from: c */
    public int f42797c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8886o(C5322x c5322x, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f42796b = c5322x;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f42795a = obj;
        this.f42797c |= Integer.MIN_VALUE;
        return this.f42796b.m10466a(null, this);
    }
}
