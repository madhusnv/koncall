package p001o;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class utf extends mtf implements hbg {

    /* renamed from: o */
    public final String f49479o;

    /* renamed from: o.utf$a */
    public class C17451a extends nbg {
        public C17451a() {
        }

        @Override // p001o.b85
        /* renamed from: u */
        public void mo18274u() {
            utf.this.m39675t(this);
        }
    }

    public utf(String str) {
        super(new mbg[2], new nbg[2]);
        this.f49479o = str;
        m39678w(1024);
    }

    @Override // p001o.mtf
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final ibg mo28782k(Throwable th) {
        return new ibg("Unexpected decode error", th);
    }

    /* renamed from: B */
    public abstract gbg mo51679B(byte[] bArr, int i, boolean z);

    @Override // p001o.mtf
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final ibg mo28783l(mbg mbgVar, nbg nbgVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) op0.m42515e(mbgVar.f14282d);
            nbgVar.m40292v(mbgVar.f14284f, mo51679B(byteBuffer.array(), byteBuffer.limit(), z), mbgVar.f35125s);
            nbgVar.f15668d = false;
            return null;
        } catch (ibg e) {
            return e;
        }
    }

    @Override // p001o.hbg
    /* renamed from: b */
    public void mo18814b(long j) {
    }

    @Override // p001o.mtf
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final mbg mo28780i() {
        return new mbg();
    }

    @Override // p001o.mtf
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final nbg mo28781j() {
        return new C17451a();
    }
}
