package ip;

import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import mn.g0;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ip.g */
/* loaded from: classes3.dex */
public final class C3337g extends AbstractC8193c {

    /* renamed from: a */
    public int f17652a;

    /* renamed from: b */
    public int f17653b;

    /* renamed from: c */
    public ArrayList f17654c;

    /* renamed from: d */
    public g0 f17655d;

    /* renamed from: e */
    public LocalDateTime f17656e;

    /* renamed from: f */
    public LocalDateTime f17657f;

    /* renamed from: g */
    public List f17658g;

    /* renamed from: h */
    public boolean f17659h;

    /* renamed from: j */
    public boolean f17660j;

    /* renamed from: k */
    public boolean f17661k;

    /* renamed from: l */
    public boolean f17662l;

    /* renamed from: m */
    public boolean f17663m;

    /* renamed from: n */
    public /* synthetic */ Object f17664n;

    /* renamed from: p */
    public final /* synthetic */ C3342l f17665p;

    /* renamed from: q */
    public int f17666q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3337g(C3342l c3342l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17665p = c3342l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17664n = obj;
        this.f17666q |= Integer.MIN_VALUE;
        Object objM7665i = C3342l.m7665i(this.f17665p, 0, this);
        return objM7665i == EnumC7794a.COROUTINE_SUSPENDED ? objM7665i : new C6364n(objM7665i);
    }
}
