package bq;

import j$.time.LocalDateTime;
import mn.g0;
import qp.C6274k;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bq.i */
/* loaded from: classes3.dex */
public final class C0729i extends AbstractC8193c {

    /* renamed from: a */
    public int f4587a;

    /* renamed from: b */
    public int f4588b;

    /* renamed from: c */
    public C6274k f4589c;

    /* renamed from: d */
    public g0 f4590d;

    /* renamed from: e */
    public LocalDateTime f4591e;

    /* renamed from: f */
    public LocalDateTime f4592f;

    /* renamed from: g */
    public boolean f4593g;

    /* renamed from: h */
    public boolean f4594h;

    /* renamed from: j */
    public boolean f4595j;

    /* renamed from: k */
    public boolean f4596k;

    /* renamed from: l */
    public /* synthetic */ Object f4597l;

    /* renamed from: m */
    public final /* synthetic */ C0737q f4598m;

    /* renamed from: n */
    public int f4599n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0729i(C0737q c0737q, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f4598m = c0737q;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f4597l = obj;
        this.f4599n |= Integer.MIN_VALUE;
        Object objM2031j = C0737q.m2031j(this.f4598m, 0, this);
        return objM2031j == EnumC7794a.COROUTINE_SUSPENDED ? objM2031j : new C6364n(objM2031j);
    }
}
