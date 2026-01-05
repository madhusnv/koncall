package xm;

import com.websoptimization.callyzerbiz.data.model.request.quick_call.FetchActiveStatusRequest;
import java.util.Iterator;
import java.util.List;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h4 extends AbstractC8193c {

    /* renamed from: a */
    public FetchActiveStatusRequest f40380a;

    /* renamed from: b */
    public List f40381b;

    /* renamed from: c */
    public Iterator f40382c;

    /* renamed from: d */
    public int f40383d;

    /* renamed from: e */
    public /* synthetic */ Object f40384e;

    /* renamed from: f */
    public final /* synthetic */ j4 f40385f;

    /* renamed from: g */
    public int f40386g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(j4 j4Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40385f = j4Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40384e = obj;
        this.f40386g |= Integer.MIN_VALUE;
        return this.f40385f.m15583f(null, null, this);
    }
}
