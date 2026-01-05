package dr;

import c9.C0908c;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.i */
/* loaded from: classes3.dex */
public final class C1759i extends AbstractC8193c {

    /* renamed from: a */
    public int f8530a;

    /* renamed from: b */
    public ArrayList f8531b;

    /* renamed from: c */
    public C0908c f8532c;

    /* renamed from: d */
    public LocalDateTime f8533d;

    /* renamed from: e */
    public LocalDateTime f8534e;

    /* renamed from: f */
    public boolean f8535f;

    /* renamed from: g */
    public /* synthetic */ Object f8536g;

    /* renamed from: h */
    public final /* synthetic */ C1775y f8537h;

    /* renamed from: j */
    public int f8538j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1759i(C1775y c1775y, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8537h = c1775y;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws NumberFormatException {
        this.f8536g = obj;
        this.f8538j |= Integer.MIN_VALUE;
        Object objM5449i = C1775y.m5449i(this.f8537h, 0, this);
        return objM5449i == EnumC7794a.COROUTINE_SUSPENDED ? objM5449i : new C6364n(objM5449i);
    }
}
