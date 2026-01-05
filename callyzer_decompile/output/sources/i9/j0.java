package i9;

import java.io.Closeable;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 extends AbstractC8193c {

    /* renamed from: a */
    public d0 f17187a;

    /* renamed from: b */
    public Closeable f17188b;

    /* renamed from: c */
    public /* synthetic */ Object f17189c;

    /* renamed from: d */
    public final /* synthetic */ l0 f17190d;

    /* renamed from: e */
    public int f17191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17190d = l0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17189c = obj;
        this.f17191e |= Integer.MIN_VALUE;
        return this.f17190d.m7548c(null, this);
    }
}
