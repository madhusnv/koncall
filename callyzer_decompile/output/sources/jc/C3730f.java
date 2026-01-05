package jc;

import java.io.IOException;
import k9.C4032f;
import kotlin.jvm.internal.AbstractC4154l;
import l1.C4327p;
import qc.AbstractC6164j;
import sd.AbstractC6807a;
import tb.C7096g;
import tb.C7105p;
import tx.C7257q;
import ub.C7392h;
import uw.C7565i;
import uw.InterfaceC7559c;
import wc.C7975i;
import wc.C7985s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jc.f */
/* loaded from: classes.dex */
public final class C3730f implements wc.e0 {

    /* renamed from: a */
    public final /* synthetic */ int f19562a;

    /* renamed from: b */
    public final Object f19563b;

    /* renamed from: c */
    public final Object f19564c;

    public /* synthetic */ C3730f(Object obj, C7975i c7975i, int i10) {
        this.f19562a = i10;
        this.f19564c = obj;
        this.f19563b = c7975i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f19562a) {
            case 0:
                ((C7975i) this.f19563b).close();
                break;
            case 1:
                ((C7975i) this.f19563b).close();
                break;
            default:
                ((wc.e0) this.f19564c).close();
                break;
        }
    }

    @Override // wc.e0
    public final long read(C7985s sink, long j6) {
        switch (this.f19562a) {
            case 0:
                AbstractC4154l.m8923f(sink, "sink");
                C7975i c7975i = (C7975i) this.f19563b;
                long j10 = c7975i.read(sink, j6);
                if (j10 == -1) {
                    ((C7257q) this.f19564c).m13558R(AbstractC6807a.m12983a(c7975i.f38367c.mo7578a()));
                }
                return j10;
            case 1:
                AbstractC4154l.m8923f(sink, "sink");
                C7975i c7975i2 = (C7975i) this.f19563b;
                long j11 = c7975i2.read(sink, j6);
                if (j11 == -1) {
                    AbstractC6164j.m12200a((String) this.f19564c, AbstractC6807a.m12983a(c7975i2.f38367c.mo7578a()));
                }
                return j11;
            default:
                AbstractC4154l.m8923f(sink, "sink");
                if (j6 < 0) {
                    throw new IllegalArgumentException(("Invalid limit (" + j6 + ") must be >= 0L").toString());
                }
                if (((Boolean) tx.c0.m13468D(C7565i.f36440a, new C4032f(this, (InterfaceC7559c) null, 12))).booleanValue()) {
                    return ((C7985s) ((C7392h) this.f19563b).f35156g).read(sink, j6);
                }
                return -1L;
        }
    }

    public C3730f(wc.e0 delegate, C7105p signer, C7096g c7096g, byte[] bArr, C3734j c3734j) {
        this.f19562a = 2;
        AbstractC4154l.m8923f(delegate, "delegate");
        AbstractC4154l.m8923f(signer, "signer");
        this.f19564c = delegate;
        this.f19563b = new C7392h(new C4327p(delegate), signer, c7096g, bArr, c3734j);
    }
}
