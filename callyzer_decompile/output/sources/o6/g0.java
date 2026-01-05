package o6;

import java.io.FileOutputStream;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 extends AbstractC8193c {

    /* renamed from: a */
    public FileOutputStream f26046a;

    /* renamed from: b */
    public FileOutputStream f26047b;

    /* renamed from: c */
    public /* synthetic */ Object f26048c;

    /* renamed from: d */
    public final /* synthetic */ h0 f26049d;

    /* renamed from: e */
    public int f26050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f26049d = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f26048c = obj;
        this.f26050e |= Integer.MIN_VALUE;
        return this.f26049d.m10450b(null, this);
    }
}
