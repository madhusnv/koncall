package xm;

import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class f4 extends AbstractC8193c {

    /* renamed from: a */
    public String f40295a;

    /* renamed from: b */
    public String f40296b;

    /* renamed from: c */
    public /* synthetic */ Object f40297c;

    /* renamed from: d */
    public final /* synthetic */ j4 f40298d;

    /* renamed from: e */
    public int f40299e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(j4 j4Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40298d = j4Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40297c = obj;
        this.f40299e |= Integer.MIN_VALUE;
        return this.f40298d.m15580b(null, this);
    }
}
