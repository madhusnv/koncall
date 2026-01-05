package gp;

import j$.time.LocalDateTime;
import mn.g0;
import qp.C6266c;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gp.i */
/* loaded from: classes3.dex */
public final class C2698i extends AbstractC8193c {

    /* renamed from: a */
    public int f15060a;

    /* renamed from: b */
    public int f15061b;

    /* renamed from: c */
    public C6266c f15062c;

    /* renamed from: d */
    public LocalDateTime f15063d;

    /* renamed from: e */
    public LocalDateTime f15064e;

    /* renamed from: f */
    public EnumC8994d f15065f;

    /* renamed from: g */
    public g0 f15066g;

    /* renamed from: h */
    public boolean f15067h;

    /* renamed from: j */
    public boolean f15068j;

    /* renamed from: k */
    public /* synthetic */ Object f15069k;

    /* renamed from: l */
    public final /* synthetic */ C2703n f15070l;

    /* renamed from: m */
    public int f15071m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2698i(C2703n c2703n, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f15070l = c2703n;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15069k = obj;
        this.f15071m |= Integer.MIN_VALUE;
        Object objM6709j = C2703n.m6709j(this.f15070l, 0, this);
        return objM6709j == EnumC7794a.COROUTINE_SUSPENDED ? objM6709j : new C6364n(objM6709j);
    }
}
