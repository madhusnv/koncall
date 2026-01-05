package okhttp3.internal.publicsuffix;

import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.cookie.ClientCookie;
import p001o.bh3;
import p001o.ch3;
import p001o.e9d;
import p001o.f9g;
import p001o.ggj;
import p001o.id5;
import p001o.im1;
import p001o.kh3;
import p001o.pz6;
import p001o.qef;
import p001o.sh2;
import p001o.sq8;
import p001o.tb3;
import p001o.uac;
import p001o.vv7;
import p001o.wzc;
import p001o.y3i;

/* renamed from: okhttp3.internal.publicsuffix.a */
/* loaded from: classes6.dex */
public final class C18739a {

    /* renamed from: g */
    public static final a f57937g = new a(null);

    /* renamed from: h */
    public static final wzc f57938h = wzc.C18014a.m55482d(wzc.f52936b, "/okhttp3/internal/publicsuffix/" + C18739a.class.getSimpleName() + ".gz", false, 1, null);

    /* renamed from: i */
    public static final byte[] f57939i = {42};

    /* renamed from: j */
    public static final List f57940j = bh3.m18963e("*");

    /* renamed from: k */
    public static final C18739a f57941k = new C18739a(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* renamed from: a */
    public final wzc f57942a;

    /* renamed from: b */
    public final pz6 f57943b;

    /* renamed from: c */
    public final AtomicBoolean f57944c;

    /* renamed from: d */
    public final CountDownLatch f57945d;

    /* renamed from: e */
    public byte[] f57946e;

    /* renamed from: f */
    public byte[] f57947f;

    /* renamed from: okhttp3.internal.publicsuffix.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final String m60188b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int iM28622b;
            int iM28622b2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        iM28622b = 46;
                        z = false;
                    } else {
                        z = z2;
                        iM28622b = ggj.m28622b(bArr2[i8][i9], Constants.MAX_HOST_LENGTH);
                    }
                    iM28622b2 = iM28622b - ggj.m28622b(bArr[i5 + i10], Constants.MAX_HOST_LENGTH);
                    if (iM28622b2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        i9 = -1;
                        z2 = true;
                    }
                }
                if (iM28622b2 >= 0) {
                    if (iM28622b2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                return new String(bArr, i5, i7, sh2.f45422b);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i5 - 1;
            }
            return null;
        }

        /* renamed from: c */
        public final C18739a m60189c() {
            return C18739a.f57941k;
        }
    }

    public C18739a(wzc wzcVar, pz6 pz6Var) {
        sq8.m48649h(wzcVar, ClientCookie.PATH_ATTR);
        sq8.m48649h(pz6Var, "fileSystem");
        this.f57942a = wzcVar;
        this.f57943b = pz6Var;
        this.f57944c = new AtomicBoolean(false);
        this.f57945d = new CountDownLatch(1);
    }

    /* renamed from: b */
    public final List m60182b(List list) throws InterruptedException {
        String str;
        String strM60188b;
        String str2;
        List listM21246k;
        List listM21246k2;
        if (this.f57944c.get() || !this.f57944c.compareAndSet(false, true)) {
            try {
                this.f57945d.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m60185e();
        }
        if (!(this.f57946e != null)) {
            throw new IllegalStateException(("Unable to load " + f57938h + " resource from the classpath.").toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            byte[] bytes = ((String) list.get(i)).getBytes(sh2.f45422b);
            sq8.m48648g(bytes, "getBytes(...)");
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= size) {
                strM60188b = null;
                break;
            }
            a aVar = f57937g;
            byte[] bArr2 = this.f57946e;
            if (bArr2 == null) {
                sq8.m48667z("publicSuffixListBytes");
                bArr2 = null;
            }
            strM60188b = aVar.m60188b(bArr2, bArr, i2);
            if (strM60188b != null) {
                break;
            }
            i2++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                bArr3[i3] = f57939i;
                a aVar2 = f57937g;
                byte[] bArr4 = this.f57946e;
                if (bArr4 == null) {
                    sq8.m48667z("publicSuffixListBytes");
                    bArr4 = null;
                }
                String strM60188b2 = aVar2.m60188b(bArr4, bArr3, i3);
                if (strM60188b2 != null) {
                    str2 = strM60188b2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i4 = size - 1;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                a aVar3 = f57937g;
                byte[] bArr5 = this.f57947f;
                if (bArr5 == null) {
                    sq8.m48667z("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String strM60188b3 = aVar3.m60188b(bArr5, bArr, i5);
                if (strM60188b3 != null) {
                    str = strM60188b3;
                    break;
                }
                i5++;
            }
        }
        if (str != null) {
            return f9g.C0('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strM60188b == null && str2 == null) {
            return f57940j;
        }
        if (strM60188b == null || (listM21246k = f9g.C0(strM60188b, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM21246k = ch3.m21246k();
        }
        if (str2 == null || (listM21246k2 = f9g.C0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM21246k2 = ch3.m21246k();
        }
        return listM21246k.size() > listM21246k2.size() ? listM21246k : listM21246k2;
    }

    /* renamed from: c */
    public final String m60183c(String str) throws InterruptedException {
        int size;
        int size2;
        sq8.m48649h(str, ClientCookie.DOMAIN_ATTR);
        String unicode = IDN.toUnicode(str);
        sq8.m48646e(unicode);
        List listM60186f = m60186f(unicode);
        List listM60182b = m60182b(listM60186f);
        if (listM60186f.size() == listM60182b.size() && ((String) listM60182b.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM60182b.get(0)).charAt(0) == '!') {
            size = listM60186f.size();
            size2 = listM60182b.size();
        } else {
            size = listM60186f.size();
            size2 = listM60182b.size() + 1;
        }
        return qef.m45317t(qef.m45309l(kh3.m35706V(m60186f(str)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    /* renamed from: d */
    public final void m60184d() {
        try {
            im1 im1VarM51310c = uac.m51310c(new vv7(this.f57943b.mo24958b(this.f57942a)));
            try {
                byte[] bArrT0 = im1VarM51310c.T0(im1VarM51310c.readInt());
                byte[] bArrT02 = im1VarM51310c.T0(im1VarM51310c.readInt());
                y3i y3iVar = y3i.f54824a;
                tb3.m49666a(im1VarM51310c, null);
                synchronized (this) {
                    sq8.m48646e(bArrT0);
                    this.f57946e = bArrT0;
                    sq8.m48646e(bArrT02);
                    this.f57947f = bArrT02;
                }
            } finally {
            }
        } finally {
            this.f57945d.countDown();
        }
    }

    /* renamed from: e */
    public final void m60185e() {
        boolean z = false;
        while (true) {
            try {
                try {
                    m60184d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    e9d.f21191a.m24582g().m24573j("Failed to read public suffix list", 5, e);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: f */
    public final List m60186f(String str) {
        List listC0 = f9g.C0(str, new char[]{'.'}, false, 0, 6, null);
        return sq8.m48644c(kh3.r0(listC0), "") ? kh3.m35710Z(listC0, 1) : listC0;
    }

    public /* synthetic */ C18739a(wzc wzcVar, pz6 pz6Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? f57938h : wzcVar, (i & 2) != 0 ? pz6.f40763d : pz6Var);
    }
}
