package ip;

import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import mn.g0;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ip.h */
/* loaded from: classes3.dex */
public final class C3338h extends AbstractC8193c {

    /* renamed from: a */
    public int f17667a;

    /* renamed from: b */
    public int f17668b;

    /* renamed from: c */
    public ArrayList f17669c;

    /* renamed from: d */
    public g0 f17670d;

    /* renamed from: e */
    public LocalDateTime f17671e;

    /* renamed from: f */
    public LocalDateTime f17672f;

    /* renamed from: g */
    public List f17673g;

    /* renamed from: h */
    public boolean f17674h;

    /* renamed from: j */
    public boolean f17675j;

    /* renamed from: k */
    public boolean f17676k;

    /* renamed from: l */
    public boolean f17677l;

    /* renamed from: m */
    public boolean f17678m;

    /* renamed from: n */
    public /* synthetic */ Object f17679n;

    /* renamed from: p */
    public final /* synthetic */ C3342l f17680p;

    /* renamed from: q */
    public int f17681q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3338h(C3342l c3342l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17680p = c3342l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17679n = obj;
        this.f17681q |= Integer.MIN_VALUE;
        Object objM7666j = C3342l.m7666j(this.f17680p, 0, this);
        return objM7666j == EnumC7794a.COROUTINE_SUSPENDED ? objM7666j : new C6364n(objM7666j);
    }
}
