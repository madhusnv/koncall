package qz;

import aw.C0471k;
import b00.C0529n;
import b00.InterfaceC0528m;
import b00.d0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;
import kz.AbstractC4299e;
import mm.AbstractC4801l;
import mz.C4919c;
import ps.C6021u;
import rw.AbstractC6662l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.t */
/* loaded from: classes3.dex */
public final class C6402t implements Closeable {

    /* renamed from: d */
    public static final Logger f30882d;

    /* renamed from: a */
    public final InterfaceC0528m f30883a;

    /* renamed from: b */
    public final C6401s f30884b;

    /* renamed from: c */
    public final C6387e f30885c;

    static {
        Logger logger = Logger.getLogger(AbstractC6390h.class.getName());
        AbstractC4154l.m8922e(logger, "getLogger(...)");
        f30882d = logger;
    }

    public C6402t(InterfaceC0528m source) {
        AbstractC4154l.m8923f(source, "source");
        this.f30883a = source;
        C6401s c6401s = new C6401s(source);
        this.f30884b = c6401s;
        this.f30885c = new C6387e(c6401s);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f30883a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0268, code lost:
    
        throw new java.io.IOException(mm.AbstractC4801l.m9730d(r6, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m12395h(boolean r14, aw.C0471k r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.C6402t.m12395h(boolean, aw.k):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        if (r19 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011f, code lost:
    
        r9.m12410i(iz.C3389v.f17980b, true);
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12396j(aw.C0471k r17, int r18, int r19, final int r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.C6402t.m12396j(aw.k, int, int, int):void");
    }

    /* renamed from: n */
    public final List m12397n(int i10, int i11, int i12, int i13) throws IOException {
        C6401s c6401s = this.f30884b;
        c6401s.f30880e = i10;
        c6401s.f30877b = i10;
        c6401s.f30881f = i11;
        c6401s.f30878c = i12;
        c6401s.f30879d = i13;
        C6387e c6387e = this.f30885c;
        d0 d0Var = c6387e.f30805c;
        ArrayList arrayList = c6387e.f30804b;
        while (!d0Var.mo1545e()) {
            byte b10 = d0Var.readByte();
            byte[] bArr = AbstractC4297c.f21703a;
            int i14 = b10 & 255;
            if (i14 == 128) {
                throw new IOException("index == 0");
            }
            if ((b10 & 128) == 128) {
                int iM12376e = c6387e.m12376e(i14, 127);
                int i15 = iM12376e - 1;
                if (i15 >= 0) {
                    C6386d[] c6386dArr = AbstractC6389g.f30818a;
                    if (i15 <= c6386dArr.length - 1) {
                        arrayList.add(c6386dArr[i15]);
                    }
                }
                int length = c6387e.f30807e + 1 + (i15 - AbstractC6389g.f30818a.length);
                if (length >= 0) {
                    C6386d[] c6386dArr2 = c6387e.f30806d;
                    if (length < c6386dArr2.length) {
                        C6386d c6386d = c6386dArr2[length];
                        AbstractC4154l.m8920c(c6386d);
                        arrayList.add(c6386d);
                    }
                }
                throw new IOException(AbstractC4801l.m9730d(iM12376e, "Header index too large "));
            }
            if (i14 == 64) {
                C6386d[] c6386dArr3 = AbstractC6389g.f30818a;
                C0529n c0529nM12375d = c6387e.m12375d();
                AbstractC6389g.m12382a(c0529nM12375d);
                c6387e.m12374c(new C6386d(c0529nM12375d, c6387e.m12375d()));
            } else if ((b10 & 64) == 64) {
                c6387e.m12374c(new C6386d(c6387e.m12373b(c6387e.m12376e(i14, 63) - 1), c6387e.m12375d()));
            } else if ((b10 & 32) == 32) {
                int iM12376e2 = c6387e.m12376e(i14, 31);
                c6387e.f30803a = iM12376e2;
                if (iM12376e2 < 0 || iM12376e2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c6387e.f30803a);
                }
                int i16 = c6387e.f30809g;
                if (iM12376e2 < i16) {
                    if (iM12376e2 == 0) {
                        C6386d[] c6386dArr4 = c6387e.f30806d;
                        AbstractC6662l.m12726p(c6386dArr4, 0, c6386dArr4.length, null);
                        c6387e.f30807e = c6387e.f30806d.length - 1;
                        c6387e.f30808f = 0;
                        c6387e.f30809g = 0;
                    } else {
                        c6387e.m12372a(i16 - iM12376e2);
                    }
                }
            } else if (i14 == 16 || i14 == 0) {
                C6386d[] c6386dArr5 = AbstractC6389g.f30818a;
                C0529n c0529nM12375d2 = c6387e.m12375d();
                AbstractC6389g.m12382a(c0529nM12375d2);
                arrayList.add(new C6386d(c0529nM12375d2, c6387e.m12375d()));
            } else {
                arrayList.add(new C6386d(c6387e.m12373b(c6387e.m12376e(i14, 15) - 1), c6387e.m12375d()));
            }
        }
        List listC0 = AbstractC6663m.c0(arrayList);
        arrayList.clear();
        return listC0;
    }

    /* renamed from: u */
    public final void m12398u(C0471k c0471k, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i13 = 0;
        boolean z6 = (i11 & 1) != 0;
        if ((i11 & 8) != 0) {
            byte b10 = this.f30883a.readByte();
            byte[] bArr = AbstractC4297c.f21703a;
            i13 = b10 & 255;
        }
        if ((i11 & 32) != 0) {
            InterfaceC0528m interfaceC0528m = this.f30883a;
            interfaceC0528m.readInt();
            interfaceC0528m.readByte();
            byte[] bArr2 = AbstractC4297c.f21703a;
            i10 -= 5;
        }
        List listM12397n = m12397n(AbstractC6400r.m12394a(i10, i11, i13), i13, i11, i12);
        C6398p c6398p = (C6398p) c0471k.f3386c;
        if (i12 != 0 && (i12 & 1) == 0) {
            C4919c.m9815c(c6398p.f30853j, c6398p.f30847c + '[' + i12 + "] onHeaders", new C6394l(c6398p, i12, listM12397n, z6));
            return;
        }
        synchronized (c6398p) {
            C6406x c6406xM12389j = c6398p.m12389j(i12);
            if (c6406xM12389j != null) {
                c6406xM12389j.m12410i(AbstractC4299e.m9019h(listM12397n), z6);
                return;
            }
            if (c6398p.f30850f) {
                return;
            }
            if (i12 <= c6398p.f30848d) {
                return;
            }
            if (i12 % 2 == c6398p.f30849e % 2) {
                return;
            }
            C6406x c6406x = new C6406x(i12, c6398p, false, z6, AbstractC4299e.m9019h(listM12397n));
            c6398p.f30848d = i12;
            c6398p.f30846b.put(Integer.valueOf(i12), c6406x);
            C4919c.m9815c(c6398p.f30851g.m9824d(), c6398p.f30847c + '[' + i12 + "] onStream", new C6021u(7, c6398p, c6406x));
        }
    }

    /* renamed from: w */
    public final void m12399w(C0471k c0471k, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int i14 = 0;
        if ((i11 & 8) != 0) {
            byte b10 = this.f30883a.readByte();
            byte[] bArr = AbstractC4297c.f21703a;
            i13 = b10 & 255;
        } else {
            i13 = 0;
        }
        int i15 = this.f30883a.readInt() & Integer.MAX_VALUE;
        List listM12397n = m12397n(AbstractC6400r.m12394a(i10 - 4, i11, i13), i13, i11, i12);
        C6398p c6398p = (C6398p) c0471k.f3386c;
        synchronized (c6398p) {
            if (c6398p.f30844D.contains(Integer.valueOf(i15))) {
                c6398p.m12386A(i15, EnumC6384b.PROTOCOL_ERROR);
                return;
            }
            c6398p.f30844D.add(Integer.valueOf(i15));
            C4919c.m9815c(c6398p.f30853j, c6398p.f30847c + '[' + i15 + "] onRequest", new C6394l(c6398p, i15, listM12397n, i14));
        }
    }
}
