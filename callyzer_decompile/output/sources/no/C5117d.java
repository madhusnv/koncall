package no;

import ww.AbstractC8193c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: no.d */
/* loaded from: classes3.dex */
public final class C5117d extends AbstractC8193c {

    /* renamed from: a */
    public Object f25052a;

    /* renamed from: b */
    public AbstractC8199i f25053b;

    /* renamed from: c */
    public String f25054c;

    /* renamed from: d */
    public /* synthetic */ Object f25055d;

    /* renamed from: e */
    public final /* synthetic */ C5122i f25056e;

    /* renamed from: f */
    public int f25057f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5117d(C5122i c5122i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f25056e = c5122i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f25055d = obj;
        this.f25057f |= Integer.MIN_VALUE;
        return this.f25056e.m10049e(null, null, null, null, this);
    }
}
