package up;

import java.util.List;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: up.e */
/* loaded from: classes3.dex */
public final class C7492e extends AbstractC8193c {

    /* renamed from: a */
    public List f36168a;

    /* renamed from: b */
    public /* synthetic */ Object f36169b;

    /* renamed from: c */
    public final /* synthetic */ C7494g f36170c;

    /* renamed from: d */
    public int f36171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7492e(C7494g c7494g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f36170c = c7494g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f36169b = obj;
        this.f36171d |= Integer.MIN_VALUE;
        return C7494g.m14290h(this.f36170c, this);
    }
}
