package go;

import com.websoptimization.callyzerbiz.data.model.request.lead_request.StaticProperties;
import java.io.Serializable;
import java.util.List;
import tb.C7105p;
import ur.AbstractC7524q;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: go.b */
/* loaded from: classes3.dex */
public final class C2685b extends AbstractC8193c {

    /* renamed from: a */
    public AbstractC7524q f15003a;

    /* renamed from: b */
    public StaticProperties f15004b;

    /* renamed from: c */
    public List f15005c;

    /* renamed from: d */
    public Serializable f15006d;

    /* renamed from: e */
    public String f15007e;

    /* renamed from: f */
    public List f15008f;

    /* renamed from: g */
    public /* synthetic */ Object f15009g;

    /* renamed from: h */
    public final /* synthetic */ C7105p f15010h;

    /* renamed from: j */
    public int f15011j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2685b(C7105p c7105p, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f15010h = c7105p;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15009g = obj;
        this.f15011j |= Integer.MIN_VALUE;
        return this.f15010h.m13382d(null, this);
    }
}
