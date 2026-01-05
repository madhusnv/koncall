package p001o;

import com.google.firebase.messaging.Constants;

/* loaded from: classes3.dex */
public final class hx7 extends g8f {

    /* renamed from: c */
    public final ax7 f27758c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx7(ax7 ax7Var, f8f f8fVar) {
        super(f8fVar);
        sq8.m48649h(ax7Var, "hash");
        sq8.m48649h(f8fVar, "sink");
        this.f27758c = ax7Var;
    }

    @Override // p001o.g8f
    /* renamed from: a */
    public void mo28209a(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f27758c.mo17933b(bArr, i, i2);
    }

    public /* synthetic */ hx7(ax7 ax7Var, f8f f8fVar, int i, id5 id5Var) {
        this(ax7Var, (i & 2) != 0 ? f8f.a0.m26283a() : f8fVar);
    }
}
