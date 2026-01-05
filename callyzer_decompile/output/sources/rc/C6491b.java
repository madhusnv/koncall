package rc;

import qd.C6185e;
import sc.C6802v;
import wc.InterfaceC7971e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rc.b */
/* loaded from: classes.dex */
public final class C6491b extends AbstractC8193c {

    /* renamed from: a */
    public C6802v f31176a;

    /* renamed from: b */
    public InterfaceC7971e f31177b;

    /* renamed from: c */
    public C6185e f31178c;

    /* renamed from: d */
    public /* synthetic */ Object f31179d;

    /* renamed from: e */
    public final /* synthetic */ C6493d f31180e;

    /* renamed from: f */
    public int f31181f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6491b(C6493d c6493d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f31180e = c6493d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f31179d = obj;
        this.f31181f |= Integer.MIN_VALUE;
        return this.f31180e.mo12192a(null, null, this);
    }
}
