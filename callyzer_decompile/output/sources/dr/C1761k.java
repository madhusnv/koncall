package dr;

import c9.C0908c;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.k */
/* loaded from: classes3.dex */
public final class C1761k extends AbstractC8193c {

    /* renamed from: a */
    public int f8542a;

    /* renamed from: b */
    public ArrayList f8543b;

    /* renamed from: c */
    public C0908c f8544c;

    /* renamed from: d */
    public LocalDateTime f8545d;

    /* renamed from: e */
    public LocalDateTime f8546e;

    /* renamed from: f */
    public boolean f8547f;

    /* renamed from: g */
    public /* synthetic */ Object f8548g;

    /* renamed from: h */
    public final /* synthetic */ C1775y f8549h;

    /* renamed from: j */
    public int f8550j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1761k(C1775y c1775y, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f8549h = c1775y;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws NumberFormatException {
        this.f8548g = obj;
        this.f8550j |= Integer.MIN_VALUE;
        Object objM5450j = C1775y.m5450j(this.f8549h, 0, this);
        return objM5450j == EnumC7794a.COROUTINE_SUSPENDED ? objM5450j : new C6364n(objM5450j);
    }
}
