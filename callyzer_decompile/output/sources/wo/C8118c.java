package wo;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wo.c */
/* loaded from: classes3.dex */
public final class C8118c extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f38856a;

    /* renamed from: b */
    public final /* synthetic */ C8134s f38857b;

    /* renamed from: c */
    public int f38858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8118c(C8134s c8134s, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38857b = c8134s;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38856a = obj;
        this.f38858c |= Integer.MIN_VALUE;
        return C8134s.m15297a(this.f38857b, null, this);
    }
}
