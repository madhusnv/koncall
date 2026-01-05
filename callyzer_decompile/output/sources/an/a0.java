package an;

import java.util.Iterator;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a0 extends AbstractC8193c {

    /* renamed from: a */
    public h3 f590a;

    /* renamed from: b */
    public Iterator f591b;

    /* renamed from: c */
    public int f592c;

    /* renamed from: d */
    public /* synthetic */ Object f593d;

    /* renamed from: e */
    public final /* synthetic */ h3 f594e;

    /* renamed from: f */
    public int f595f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(h3 h3Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f594e = h3Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f593d = obj;
        this.f595f |= Integer.MIN_VALUE;
        return h3.m468p(this.f594e, null, this);
    }
}
