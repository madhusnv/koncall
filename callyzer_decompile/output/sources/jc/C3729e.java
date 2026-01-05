package jc;

import tb.C7105p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jc.e */
/* loaded from: classes.dex */
public final class C3729e extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f19559a;

    /* renamed from: b */
    public final /* synthetic */ C7105p f19560b;

    /* renamed from: c */
    public int f19561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3729e(C7105p c7105p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f19560b = c7105p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f19559a = obj;
        this.f19561c |= Integer.MIN_VALUE;
        return this.f19560b.read(null, 0L, this);
    }
}
