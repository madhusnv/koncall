package i9;

import l4.C4367l;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.t */
/* loaded from: classes.dex */
public final class C3202t extends AbstractC8193c {

    /* renamed from: a */
    public C4367l f17269a;

    /* renamed from: b */
    public /* synthetic */ Object f17270b;

    /* renamed from: c */
    public final /* synthetic */ C3203u f17271c;

    /* renamed from: d */
    public int f17272d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3202t(C3203u c3203u, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17271c = c3203u;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17270b = obj;
        this.f17272d |= Integer.MIN_VALUE;
        return this.f17271c.resolve(null, this);
    }
}
