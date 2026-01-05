package eq;

import j$.time.LocalDateTime;
import java.util.List;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eq.h */
/* loaded from: classes3.dex */
public final class C2096h extends AbstractC8193c {

    /* renamed from: a */
    public LocalDateTime f9817a;

    /* renamed from: b */
    public LocalDateTime f9818b;

    /* renamed from: c */
    public List f9819c;

    /* renamed from: d */
    public boolean f9820d;

    /* renamed from: e */
    public /* synthetic */ Object f9821e;

    /* renamed from: f */
    public final /* synthetic */ C2100l f9822f;

    /* renamed from: g */
    public int f9823g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2096h(C2100l c2100l, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f9822f = c2100l;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f9821e = obj;
        this.f9823g |= Integer.MIN_VALUE;
        return C2100l.m5803j(this.f9822f, this);
    }
}
