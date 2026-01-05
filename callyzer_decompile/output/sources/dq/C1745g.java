package dq;

import j$.time.LocalDateTime;
import mn.g0;
import qp.C6274k;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dq.g */
/* loaded from: classes3.dex */
public final class C1745g extends AbstractC8193c {

    /* renamed from: a */
    public int f8433a;

    /* renamed from: b */
    public int f8434b;

    /* renamed from: c */
    public C6274k f8435c;

    /* renamed from: d */
    public g0 f8436d;

    /* renamed from: e */
    public LocalDateTime f8437e;

    /* renamed from: f */
    public LocalDateTime f8438f;

    /* renamed from: g */
    public boolean f8439g;

    /* renamed from: h */
    public boolean f8440h;

    /* renamed from: j */
    public boolean f8441j;

    /* renamed from: k */
    public boolean f8442k;

    /* renamed from: l */
    public /* synthetic */ Object f8443l;

    /* renamed from: m */
    public final /* synthetic */ C1750l f8444m;

    /* renamed from: n */
    public int f8445n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745g(C1750l c1750l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8444m = c1750l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8443l = obj;
        this.f8445n |= Integer.MIN_VALUE;
        Object objM5439i = C1750l.m5439i(this.f8444m, 0, this);
        return objM5439i == EnumC7794a.COROUTINE_SUSPENDED ? objM5439i : new C6364n(objM5439i);
    }
}
