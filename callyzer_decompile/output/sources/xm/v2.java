package xm;

import java.util.List;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class v2 extends AbstractC8193c {

    /* renamed from: a */
    public List f40931a;

    /* renamed from: b */
    public /* synthetic */ Object f40932b;

    /* renamed from: c */
    public final /* synthetic */ w2 f40933c;

    /* renamed from: d */
    public int f40934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(w2 w2Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40933c = w2Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40932b = obj;
        this.f40934d |= Integer.MIN_VALUE;
        return this.f40933c.m15640f(null, this);
    }
}
