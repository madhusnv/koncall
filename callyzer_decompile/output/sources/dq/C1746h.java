package dq;

import j$.time.LocalDateTime;
import mn.g0;
import qp.C6274k;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dq.h */
/* loaded from: classes3.dex */
public final class C1746h extends AbstractC8193c {

    /* renamed from: a */
    public int f8446a;

    /* renamed from: b */
    public int f8447b;

    /* renamed from: c */
    public C6274k f8448c;

    /* renamed from: d */
    public g0 f8449d;

    /* renamed from: e */
    public LocalDateTime f8450e;

    /* renamed from: f */
    public LocalDateTime f8451f;

    /* renamed from: g */
    public boolean f8452g;

    /* renamed from: h */
    public boolean f8453h;

    /* renamed from: j */
    public boolean f8454j;

    /* renamed from: k */
    public boolean f8455k;

    /* renamed from: l */
    public /* synthetic */ Object f8456l;

    /* renamed from: m */
    public final /* synthetic */ C1750l f8457m;

    /* renamed from: n */
    public int f8458n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746h(C1750l c1750l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8457m = c1750l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f8456l = obj;
        this.f8458n |= Integer.MIN_VALUE;
        Object objM5440j = C1750l.m5440j(this.f8457m, 0, this);
        return objM5440j == EnumC7794a.COROUTINE_SUSPENDED ? objM5440j : new C6364n(objM5440j);
    }
}
