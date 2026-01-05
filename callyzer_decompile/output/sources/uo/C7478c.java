package uo;

import android.telephony.SubscriptionInfo;
import io.C3328c;
import java.util.Iterator;
import java.util.List;
import qw.InterfaceC6357g;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uo.c */
/* loaded from: classes3.dex */
public final class C7478c extends AbstractC8193c {

    /* renamed from: a */
    public List f36098a;

    /* renamed from: b */
    public InterfaceC6357g f36099b;

    /* renamed from: c */
    public Iterator f36100c;

    /* renamed from: d */
    public SubscriptionInfo f36101d;

    /* renamed from: e */
    public int f36102e;

    /* renamed from: f */
    public int f36103f;

    /* renamed from: g */
    public /* synthetic */ Object f36104g;

    /* renamed from: h */
    public final /* synthetic */ C3328c f36105h;

    /* renamed from: j */
    public int f36106j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7478c(C3328c c3328c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f36105h = c3328c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f36104g = obj;
        this.f36106j |= Integer.MIN_VALUE;
        return this.f36105h.m7650e(this);
    }
}
