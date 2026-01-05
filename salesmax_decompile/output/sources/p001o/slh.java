package p001o;

import java.util.UUID;

/* loaded from: classes5.dex */
public class slh extends xyb {

    /* renamed from: a */
    public final vj6 f45627a;

    /* renamed from: b */
    public final t1i f45628b;

    /* renamed from: c */
    public final long f45629c;

    public slh(vj6 vj6Var, t1i t1iVar) {
        byte[] bArr = new byte[16];
        vj6Var = vj6Var == null ? vj6.m52876h() : vj6Var;
        this.f45627a = vj6Var;
        vj6Var.m52880m(bArr, 10);
        int iM49176a = t1iVar.m49176a();
        bArr[8] = (byte) (iM49176a >> 8);
        bArr[9] = (byte) iM49176a;
        this.f45629c = u1i.m50866c(u1i.m50865b(bArr, 8));
        this.f45628b = t1iVar;
    }

    /* renamed from: a */
    public UUID m48500a() {
        int iM49177b = (int) (this.f45628b.m49177b() >>> 32);
        return new UUID((((int) r0) << 32) | ((((((iM49177b << 16) | (iM49177b >>> 16)) & (-61441)) | 4096) << 32) >>> 32), this.f45629c);
    }
}
