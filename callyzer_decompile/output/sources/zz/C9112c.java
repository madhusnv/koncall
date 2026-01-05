package zz;

import a2.AbstractC0030c;
import b00.C0526k;
import b00.C0536u;
import b00.InterfaceC0528m;
import com.amplifyframework.storage.ObjectMetadata;
import com.sun.mail.util.AbstractC1452a;
import iz.C3389v;
import iz.C3391x;
import iz.C3393z;
import iz.InterfaceC3392y;
import iz.i0;
import iz.k0;
import iz.n0;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4154l;
import nz.C5197h;
import nz.C5206q;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import oz.AbstractC5782e;
import oz.C5783f;
import p000a.AbstractC0000a;
import p020v.x0;
import pg.z9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zz.c */
/* loaded from: classes3.dex */
public final class C9112c implements InterfaceC3392y {

    /* renamed from: a */
    public final C9111b f43679a = C9111b.f43678a;

    /* renamed from: b */
    public volatile EnumC9110a f43680b = EnumC9110a.NONE;

    @Override // iz.InterfaceC3392y
    /* renamed from: a */
    public final k0 mo7804a(C5783f c5783f) throws Exception {
        boolean z6;
        boolean z10;
        String str;
        String str2;
        String str3;
        String str4;
        Long lValueOf;
        C0536u c0536u;
        Long lValueOf2;
        EnumC9110a enumC9110a = this.f43680b;
        x0 x0Var = (x0) c5783f.f28358i;
        if (enumC9110a == EnumC9110a.NONE) {
            return c5783f.m11332f(x0Var);
        }
        boolean z11 = true;
        boolean z12 = enumC9110a == EnumC9110a.BODY;
        if (!z12 && enumC9110a != EnumC9110a.HEADERS) {
            z11 = false;
        }
        i0 i0Var = (i0) x0Var.f36757e;
        C5197h c5197h = (C5197h) c5783f.f28357h;
        C5206q c5206qM10183c = c5197h != null ? c5197h.m10183c() : null;
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append((String) x0Var.f36755c);
        sb2.append(' ');
        C3391x url = (C3391x) x0Var.f36754b;
        AbstractC4154l.m8923f(url, "url");
        sb2.append(url.f17999i);
        sb2.append(c5206qM10183c != null ? " " + c5206qM10183c.f25382h : "");
        String string = sb2.toString();
        if (!z11 && i0Var != null) {
            StringBuilder sbM11245p = AbstractC5601a.m11245p(string, " (");
            sbM11245p.append(i0Var.mo7445a());
            sbM11245p.append("-byte body)");
            string = sbM11245p.toString();
        }
        this.f43679a.m16514a(string);
        if (z11) {
            C3389v c3389v = (C3389v) x0Var.f36756d;
            z6 = z12;
            if (i0Var != null) {
                C3393z c3393zMo7446b = i0Var.mo7446b();
                z10 = z11;
                if (c3393zMo7446b == null || c3389v.m7787b(ObjectMetadata.CONTENT_TYPE) != null) {
                    str = " ";
                    str2 = "url";
                } else {
                    str2 = "url";
                    str = " ";
                    this.f43679a.m16514a("Content-Type: " + c3393zMo7446b);
                }
                if (i0Var.mo7445a() != -1 && c3389v.m7787b("Content-Length") == null) {
                    this.f43679a.m16514a("Content-Length: " + i0Var.mo7445a());
                }
            } else {
                z10 = z11;
                str = " ";
                str2 = "url";
            }
            int size = c3389v.size();
            for (int i10 = 0; i10 < size; i10++) {
                m16515b(c3389v, i10);
            }
            if (!z6 || i0Var == null) {
                this.f43679a.m16514a("--> END " + ((String) x0Var.f36755c));
            } else {
                String strM7787b = ((C3389v) x0Var.f36756d).m7787b(ObjectMetadata.CONTENT_ENCODING);
                if (strM7787b != null && !strM7787b.equalsIgnoreCase("identity") && !strM7787b.equalsIgnoreCase("gzip")) {
                    this.f43679a.m16514a(AbstractC1452a.m4564k(new StringBuilder("--> END "), (String) x0Var.f36755c, " (encoded body omitted)"));
                } else if (i0Var.mo7730c()) {
                    this.f43679a.m16514a(AbstractC1452a.m4564k(new StringBuilder("--> END "), (String) x0Var.f36755c, " (duplex request body omitted)"));
                } else if (i0Var.mo7727d()) {
                    this.f43679a.m16514a(AbstractC1452a.m4564k(new StringBuilder("--> END "), (String) x0Var.f36755c, " (one-shot body omitted)"));
                } else {
                    C0526k c0526k = new C0526k();
                    i0Var.mo7447e(c0526k);
                    if ("gzip".equalsIgnoreCase(c3389v.m7787b(ObjectMetadata.CONTENT_ENCODING))) {
                        lValueOf2 = Long.valueOf(c0526k.f3638b);
                        c0536u = new C0536u(c0526k);
                        try {
                            c0526k = new C0526k();
                            c0526k.j0(c0536u);
                            c0536u.close();
                        } finally {
                        }
                    } else {
                        lValueOf2 = null;
                    }
                    Charset charsetM11972a = z9.m11972a(i0Var.mo7446b());
                    this.f43679a.m16514a("");
                    if (!AbstractC0000a.m1b(c0526k)) {
                        this.f43679a.m16514a("--> END " + ((String) x0Var.f36755c) + " (binary " + i0Var.mo7445a() + "-byte body omitted)");
                    } else if (lValueOf2 != null) {
                        this.f43679a.m16514a("--> END " + ((String) x0Var.f36755c) + " (" + c0526k.f3638b + "-byte, " + lValueOf2 + "-gzipped-byte body)");
                    } else {
                        this.f43679a.m16514a(c0526k.mo1543Q(charsetM11972a));
                        this.f43679a.m16514a("--> END " + ((String) x0Var.f36755c) + " (" + i0Var.mo7445a() + "-byte body)");
                    }
                }
            }
        } else {
            z6 = z12;
            z10 = z11;
            str = " ";
            str2 = "url";
        }
        long jNanoTime = System.nanoTime();
        try {
            k0 k0VarM11332f = c5783f.m11332f(x0Var);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            n0 n0Var = k0VarM11332f.f17923g;
            AbstractC4154l.m8920c(n0Var);
            long jMo7460h = n0Var.mo7460h();
            String str5 = jMo7460h != -1 ? jMo7460h + "-byte" : "unknown-length";
            C9111b c9111b = this.f43679a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("<-- " + k0VarM11332f.f17920d);
            if (k0VarM11332f.f17919c.length() > 0) {
                str4 = str;
                StringBuilder sb4 = new StringBuilder(str4);
                str3 = "-byte";
                sb4.append(k0VarM11332f.f17919c);
                sb3.append(sb4.toString());
            } else {
                str3 = "-byte";
                str4 = str;
            }
            StringBuilder sb5 = new StringBuilder(str4);
            C3391x c3391x = (C3391x) k0VarM11332f.f17917a.f36754b;
            AbstractC4154l.m8923f(c3391x, str2);
            sb5.append(c3391x.f17999i);
            sb5.append(" (");
            sb5.append(millis);
            sb5.append("ms");
            sb3.append(sb5.toString());
            if (!z10) {
                sb3.append(", " + str5 + " body");
            }
            sb3.append(")");
            c9111b.m16514a(sb3.toString());
            if (z10) {
                C3389v c3389v2 = k0VarM11332f.f17922f;
                int size2 = c3389v2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    m16515b(c3389v2, i11);
                }
                if (z6 && AbstractC5782e.m11322a(k0VarM11332f)) {
                    String strM7787b2 = k0VarM11332f.f17922f.m7787b(ObjectMetadata.CONTENT_ENCODING);
                    if (strM7787b2 != null && !strM7787b2.equalsIgnoreCase("identity") && !strM7787b2.equalsIgnoreCase("gzip")) {
                        this.f43679a.m16514a("<-- END HTTP (encoded body omitted)");
                        return k0VarM11332f;
                    }
                    C3393z c3393zMo7461j = k0VarM11332f.f17923g.mo7461j();
                    if (c3393zMo7461j != null && c3393zMo7461j.f18003b.equals(TextBundle.TEXT_ENTRY) && c3393zMo7461j.f18004c.equals("event-stream")) {
                        this.f43679a.m16514a("<-- END HTTP (streaming)");
                        return k0VarM11332f;
                    }
                    InterfaceC0528m interfaceC0528mMo7462n = n0Var.mo7462n();
                    interfaceC0528mMo7462n.request(Long.MAX_VALUE);
                    long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                    C0526k c0526kMo1544a = interfaceC0528mMo7462n.mo1544a();
                    if ("gzip".equalsIgnoreCase(c3389v2.m7787b(ObjectMetadata.CONTENT_ENCODING))) {
                        lValueOf = Long.valueOf(c0526kMo1544a.f3638b);
                        c0536u = new C0536u(c0526kMo1544a.clone());
                        try {
                            c0526kMo1544a = new C0526k();
                            c0526kMo1544a.j0(c0536u);
                            c0536u.close();
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    Charset charsetM11972a2 = z9.m11972a(n0Var.mo7461j());
                    if (!AbstractC0000a.m1b(c0526kMo1544a)) {
                        this.f43679a.m16514a("");
                        C9111b c9111b2 = this.f43679a;
                        StringBuilder sb6 = new StringBuilder("<-- END HTTP (");
                        sb6.append(millis2);
                        sb6.append("ms, binary ");
                        c9111b2.m16514a(AbstractC0030c.m116g(c0526kMo1544a.f3638b, "-byte body omitted)", sb6));
                        return k0VarM11332f;
                    }
                    if (jMo7460h != 0) {
                        this.f43679a.m16514a("");
                        this.f43679a.m16514a(c0526kMo1544a.clone().mo1543Q(charsetM11972a2));
                    }
                    C9111b c9111b3 = this.f43679a;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("<-- END HTTP (" + millis2 + "ms, " + c0526kMo1544a.f3638b + str3);
                    if (lValueOf != null) {
                        sb7.append(", " + lValueOf + "-gzipped-byte");
                    }
                    sb7.append(" body)");
                    c9111b3.m16514a(sb7.toString());
                    return k0VarM11332f;
                }
                this.f43679a.m16514a("<-- END HTTP");
            }
            return k0VarM11332f;
        } catch (Exception e2) {
            this.f43679a.m16514a(AbstractC0030c.m120k("<-- HTTP FAILED: ", e2));
            throw e2;
        }
    }

    /* renamed from: b */
    public final void m16515b(C3389v c3389v, int i10) {
        c3389v.m7788h(i10);
        this.f43679a.m16514a(c3389v.m7788h(i10) + ": " + c3389v.m7790q(i10));
    }
}
