package wo;

import mm.C4791b;
import mm.C4802m;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wo.p */
/* loaded from: classes3.dex */
public final class C8131p extends AbstractC8193c {

    /* renamed from: a */
    public C4791b f38935a;

    /* renamed from: b */
    public String f38936b;

    /* renamed from: c */
    public String f38937c;

    /* renamed from: d */
    public C4802m f38938d;

    /* renamed from: e */
    public /* synthetic */ Object f38939e;

    /* renamed from: f */
    public final /* synthetic */ C8134s f38940f;

    /* renamed from: g */
    public int f38941g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8131p(C8134s c8134s, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38940f = c8134s;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38939e = obj;
        this.f38941g |= Integer.MIN_VALUE;
        return this.f38940f.m15315s(null, this);
    }
}
