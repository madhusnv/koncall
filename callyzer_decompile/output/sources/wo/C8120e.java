package wo;

import java.util.Iterator;
import java.util.List;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wo.e */
/* loaded from: classes3.dex */
public final class C8120e extends AbstractC8193c {

    /* renamed from: a */
    public List f38862a;

    /* renamed from: b */
    public Iterator f38863b;

    /* renamed from: c */
    public List f38864c;

    /* renamed from: d */
    public int f38865d;

    /* renamed from: e */
    public /* synthetic */ Object f38866e;

    /* renamed from: f */
    public final /* synthetic */ C8134s f38867f;

    /* renamed from: g */
    public int f38868g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8120e(C8134s c8134s, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38867f = c8134s;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38866e = obj;
        this.f38868g |= Integer.MIN_VALUE;
        return this.f38867f.m15304g(this);
    }
}
