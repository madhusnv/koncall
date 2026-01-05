package ty;

import net.schmizz.sshj.common.Buffer$BufferException;
import net.schmizz.sshj.sftp.SFTPException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ty.k */
/* loaded from: classes3.dex */
public final class C7277k extends C7281o {

    /* renamed from: e */
    public final int f34729e;

    /* renamed from: f */
    public final EnumC7272f f34730f;

    /* renamed from: g */
    public final long f34731g;

    public C7277k(C7281o c7281o, int i10) throws SFTPException {
        int i11 = c7281o.f24777c;
        int i12 = c7281o.f24776b;
        int i13 = i11 - i12;
        this.f24777c = i13;
        byte[] bArr = new byte[i13];
        this.f24775a = bArr;
        System.arraycopy(c7281o.f24775a, i12, bArr, 0, i13);
        this.f34729e = i10;
        this.f34730f = m13605B();
        try {
            this.f34731g = m9930y();
        } catch (Buffer$BufferException e2) {
            throw new SFTPException(e2);
        }
    }

    /* renamed from: C */
    public final void m13593C(EnumC7272f enumC7272f) {
        EnumC7272f enumC7272f2 = this.f34730f;
        if (enumC7272f2 != enumC7272f) {
            if (enumC7272f2 != EnumC7272f.STATUS) {
                throw new SFTPException("Unexpected packet " + enumC7272f2);
            }
            try {
                m13595E(EnumC7276j.fromInt((int) m9930y()));
                throw null;
            } catch (Buffer$BufferException e2) {
                throw new SFTPException(e2);
            }
        }
    }

    /* renamed from: D */
    public final void m13594D() {
        m13593C(EnumC7272f.STATUS);
        EnumC7276j enumC7276j = EnumC7276j.OK;
        try {
            EnumC7276j enumC7276jFromInt = EnumC7276j.fromInt((int) m9930y());
            if (enumC7276jFromInt == enumC7276j) {
                return;
            }
            m13595E(enumC7276jFromInt);
            throw null;
        } catch (Buffer$BufferException e2) {
            throw new SFTPException(e2);
        }
    }

    /* renamed from: E */
    public final void m13595E(EnumC7276j enumC7276j) throws SFTPException {
        try {
            SFTPException sFTPException = new SFTPException(this.f34729e < 3 ? enumC7276j.toString() : m9929x());
            sFTPException.f24793c = enumC7276j;
            throw sFTPException;
        } catch (Buffer$BufferException e2) {
            throw new SFTPException(e2);
        }
    }
}
