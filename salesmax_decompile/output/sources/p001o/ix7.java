package p001o;

import com.google.firebase.messaging.Constants;

/* loaded from: classes3.dex */
public final class ix7 extends j8f {

    /* renamed from: c */
    public final ax7 f29340c;

    /* renamed from: d */
    public final h8f f29341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix7(ax7 ax7Var, h8f h8fVar) {
        super(h8fVar);
        sq8.m48649h(ax7Var, "hash");
        sq8.m48649h(h8fVar, "source");
        this.f29340c = ax7Var;
        this.f29341d = h8fVar;
    }

    @Override // p001o.j8f
    /* renamed from: a */
    public void mo32880a(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f29340c.mo17933b(bArr, i, i2);
    }

    /* renamed from: c */
    public final byte[] m32881c() {
        return this.f29340c.mo17932a();
    }
}
