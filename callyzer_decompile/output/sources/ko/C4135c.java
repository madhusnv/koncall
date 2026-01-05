package ko;

import c9.C0914i;
import com.websoptimization.callyzerbiz.common.exception.SimStateException;
import ww.AbstractC8193c;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ko.c */
/* loaded from: classes3.dex */
public final class C4135c extends AbstractC8193c {

    /* renamed from: a */
    public SimStateException f21105a;

    /* renamed from: b */
    public C8805t f21106b;

    /* renamed from: c */
    public String f21107c;

    /* renamed from: d */
    public int f21108d;

    /* renamed from: e */
    public /* synthetic */ Object f21109e;

    /* renamed from: f */
    public final /* synthetic */ C0914i f21110f;

    /* renamed from: g */
    public int f21111g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4135c(C0914i c0914i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f21110f = c0914i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f21109e = obj;
        this.f21111g |= Integer.MIN_VALUE;
        return this.f21110f.m2632l(this);
    }
}
