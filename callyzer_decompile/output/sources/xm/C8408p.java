package xm;

import wj.C8090p;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xm.p */
/* loaded from: classes3.dex */
public final class C8408p extends AbstractC8193c {

    /* renamed from: a */
    public String f40678a;

    /* renamed from: b */
    public long f40679b;

    /* renamed from: c */
    public /* synthetic */ Object f40680c;

    /* renamed from: d */
    public final /* synthetic */ C8090p f40681d;

    /* renamed from: e */
    public int f40682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8408p(C8090p c8090p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40681d = c8090p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40680c = obj;
        this.f40682e |= Integer.MIN_VALUE;
        return this.f40681d.m15240R(null, this);
    }
}
