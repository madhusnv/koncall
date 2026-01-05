package ss;

import java.util.ArrayList;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class y0 extends AbstractC8193c {

    /* renamed from: a */
    public ArrayList f33527a;

    /* renamed from: b */
    public /* synthetic */ Object f33528b;

    /* renamed from: c */
    public final /* synthetic */ z0 f33529c;

    /* renamed from: d */
    public int f33530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f33529c = z0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f33528b = obj;
        this.f33530d |= Integer.MIN_VALUE;
        return this.f33529c.m13202y(null, this);
    }
}
