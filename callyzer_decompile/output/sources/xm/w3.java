package xm;

import com.websoptimization.callyzerbiz.data.model.request.message_template_request.FetchMessageTemplateRequest;
import com.websoptimization.callyzerbiz.data.model.response.message_template.MessageTemplateResponse;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class w3 extends AbstractC8193c {

    /* renamed from: a */
    public FetchMessageTemplateRequest f40963a;

    /* renamed from: b */
    public MessageTemplateResponse f40964b;

    /* renamed from: c */
    public /* synthetic */ Object f40965c;

    /* renamed from: d */
    public final /* synthetic */ b0 f40966d;

    /* renamed from: e */
    public int f40967e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(b0 b0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40966d = b0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40965c = obj;
        this.f40967e |= Integer.MIN_VALUE;
        return this.f40966d.m15564j(null, null, this);
    }
}
