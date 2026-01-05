package iz;

import b00.C0526k;
import b00.C0529n;
import b00.InterfaceC0527l;
import java.io.EOFException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.C5176n;
import pg.h7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 extends i0 {

    /* renamed from: f */
    public static final C3393z f17785f;

    /* renamed from: g */
    public static final C3393z f17786g;

    /* renamed from: h */
    public static final byte[] f17787h;

    /* renamed from: i */
    public static final byte[] f17788i;

    /* renamed from: j */
    public static final byte[] f17789j;

    /* renamed from: b */
    public final C0529n f17790b;

    /* renamed from: c */
    public final List f17791c;

    /* renamed from: d */
    public final C3393z f17792d;

    /* renamed from: e */
    public long f17793e;

    static {
        C5176n c5176n = C3393z.f18000e;
        f17785f = h7.m11676d("multipart/mixed");
        h7.m11676d("multipart/alternative");
        h7.m11676d("multipart/digest");
        h7.m11676d("multipart/parallel");
        f17786g = h7.m11676d("multipart/form-data");
        f17787h = new byte[]{58, 32};
        f17788i = new byte[]{13, 10};
        f17789j = new byte[]{45, 45};
    }

    public b0(C0529n boundaryByteString, C3393z type, List list) {
        AbstractC4154l.m8923f(boundaryByteString, "boundaryByteString");
        AbstractC4154l.m8923f(type, "type");
        this.f17790b = boundaryByteString;
        this.f17791c = list;
        C5176n c5176n = C3393z.f18000e;
        this.f17792d = h7.m11676d(type + "; boundary=" + boundaryByteString.m1613r());
        this.f17793e = -1L;
    }

    @Override // iz.i0
    /* renamed from: a */
    public final long mo7445a() throws EOFException {
        long j6 = this.f17793e;
        if (j6 != -1) {
            return j6;
        }
        long jM7728f = m7728f(null, true);
        this.f17793e = jM7728f;
        return jM7728f;
    }

    @Override // iz.i0
    /* renamed from: b */
    public final C3393z mo7446b() {
        return this.f17792d;
    }

    @Override // iz.i0
    /* renamed from: d */
    public final boolean mo7727d() {
        List list = this.f17791c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((a0) it.next()).f17784b.mo7727d()) {
                return true;
            }
        }
        return false;
    }

    @Override // iz.i0
    /* renamed from: e */
    public final void mo7447e(InterfaceC0527l interfaceC0527l) throws EOFException {
        m7728f(interfaceC0527l, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final long m7728f(InterfaceC0527l interfaceC0527l, boolean z6) throws EOFException {
        C0526k c0526k;
        InterfaceC0527l c0526k2;
        if (z6) {
            c0526k2 = new C0526k();
            c0526k = c0526k2;
        } else {
            c0526k = 0;
            c0526k2 = interfaceC0527l;
        }
        List list = this.f17791c;
        int size = list.size();
        long j6 = 0;
        int i10 = 0;
        while (true) {
            C0529n c0529n = this.f17790b;
            byte[] bArr = f17789j;
            byte[] bArr2 = f17788i;
            if (i10 >= size) {
                AbstractC4154l.m8920c(c0526k2);
                c0526k2.write(bArr);
                c0526k2.p0(c0529n);
                c0526k2.write(bArr);
                c0526k2.write(bArr2);
                if (!z6) {
                    return j6;
                }
                AbstractC4154l.m8920c(c0526k);
                long j10 = j6 + c0526k.f3638b;
                c0526k.m1593n();
                return j10;
            }
            a0 a0Var = (a0) list.get(i10);
            C3389v c3389v = a0Var.f17783a;
            i0 i0Var = a0Var.f17784b;
            AbstractC4154l.m8920c(c0526k2);
            c0526k2.write(bArr);
            c0526k2.p0(c0529n);
            c0526k2.write(bArr2);
            int size2 = c3389v.size();
            for (int i11 = 0; i11 < size2; i11++) {
                c0526k2.mo1534N(c3389v.m7788h(i11)).write(f17787h).mo1534N(c3389v.m7790q(i11)).write(bArr2);
            }
            C3393z c3393zMo7446b = i0Var.mo7446b();
            if (c3393zMo7446b != null) {
                c0526k2.mo1534N("Content-Type: ").mo1534N(c3393zMo7446b.f18002a).write(bArr2);
            }
            long jMo7445a = i0Var.mo7445a();
            if (jMo7445a == -1 && z6) {
                AbstractC4154l.m8920c(c0526k);
                c0526k.m1593n();
                return -1L;
            }
            c0526k2.write(bArr2);
            if (z6) {
                j6 += jMo7445a;
            } else {
                i0Var.mo7447e(c0526k2);
            }
            c0526k2.write(bArr2);
            i10++;
        }
    }
}
