package gs;

import com.websoptimization.callyzerbiz.data.model.response.edit_lead_response.LeadCallHistory;
import java.util.Iterator;
import java.util.List;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gs.c */
/* loaded from: classes3.dex */
public final class C2717c extends AbstractC8193c {

    /* renamed from: a */
    public String f15154a;

    /* renamed from: b */
    public List f15155b;

    /* renamed from: c */
    public List f15156c;

    /* renamed from: d */
    public Iterator f15157d;

    /* renamed from: e */
    public LeadCallHistory f15158e;

    /* renamed from: f */
    public String f15159f;

    /* renamed from: g */
    public List f15160g;

    /* renamed from: h */
    public int f15161h;

    /* renamed from: j */
    public /* synthetic */ Object f15162j;

    /* renamed from: k */
    public final /* synthetic */ C2721g f15163k;

    /* renamed from: l */
    public int f15164l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2717c(C2721g c2721g, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f15163k = c2721g;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15162j = obj;
        this.f15164l |= Integer.MIN_VALUE;
        Object objM6721e = C2721g.m6721e(this.f15163k, null, 0, this);
        return objM6721e == EnumC7794a.COROUTINE_SUSPENDED ? objM6721e : new C6364n(objM6721e);
    }
}
