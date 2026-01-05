package nn;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nn.b */
/* loaded from: classes3.dex */
public final class C5110b extends AbstractC8193c {

    /* renamed from: a */
    public String f25018a;

    /* renamed from: b */
    public /* synthetic */ Object f25019b;

    /* renamed from: c */
    public final /* synthetic */ C5113e f25020c;

    /* renamed from: d */
    public int f25021d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5110b(C5113e c5113e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f25020c = c5113e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f25019b = obj;
        this.f25021d |= Integer.MIN_VALUE;
        return this.f25020c.m10038a(null, this);
    }
}
