package aj;

import a1.C0011j;
import android.util.JsonReader;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.IOException;
import java.io.StringReader;
import k4.C4001v;
import lj.C4481d;
import p020v.a1;
import zi.C8958a;
import zi.C8959b;
import zi.C8960c;
import zi.C8961d;
import zi.C8962e;
import zi.C8963f;
import zi.C8964g;
import zi.C8965h;
import zi.C8966i;
import zi.C8967j;
import zi.C8968k;
import zi.C8969l;
import zi.C8970m;
import zi.C8971n;
import zi.C8972o;
import zi.C8973p;
import zi.C8974q;
import zi.C8975r;
import zi.C8976s;
import zi.C8977t;
import zi.C8978u;
import zi.C8979v;
import zi.C8980w;
import zi.C8981x;
import zi.C8982y;
import zi.C8983z;
import zi.a2;
import zi.b0;
import zi.b1;
import zi.b2;
import zi.c0;
import zi.c1;
import zi.c2;
import zi.d0;
import zi.d2;
import zi.e0;
import zi.e1;
import zi.e2;
import zi.f0;
import zi.f1;
import zi.f2;
import zi.g0;
import zi.g1;
import zi.g2;
import zi.h0;
import zi.h2;
import zi.i1;
import zi.i2;
import zi.j0;
import zi.j1;
import zi.j2;
import zi.k0;
import zi.k2;
import zi.l0;
import zi.l2;
import zi.m2;
import zi.n0;
import zi.n2;
import zi.o1;
import zi.p0;
import zi.p1;
import zi.q0;
import zi.q1;
import zi.r0;
import zi.r1;
import zi.s0;
import zi.s1;
import zi.t0;
import zi.t1;
import zi.u0;
import zi.u1;
import zi.v0;
import zi.v1;
import zi.w0;
import zi.w1;
import zi.x0;
import zi.x1;
import zi.y0;
import zi.y1;
import zi.z0;
import zi.z1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aj.a */
/* loaded from: classes.dex */
public final class C0161a {

    /* renamed from: a */
    public static final C4001v f499a;

    static {
        C4481d c4481d = new C4481d();
        C8961d c8961d = C8961d.f43034a;
        c4481d.mo8850c(n2.class, c8961d);
        c4481d.mo8850c(b0.class, c8961d);
        C8967j c8967j = C8967j.f43124a;
        c4481d.mo8850c(m2.class, c8967j);
        c4481d.mo8850c(j0.class, c8967j);
        C8964g c8964g = C8964g.f43078a;
        c4481d.mo8850c(u1.class, c8964g);
        c4481d.mo8850c(k0.class, c8964g);
        C8965h c8965h = C8965h.f43089a;
        c4481d.mo8850c(t1.class, c8965h);
        c4481d.mo8850c(l0.class, c8965h);
        C8983z c8983z = C8983z.f43323a;
        c4481d.mo8850c(l2.class, c8983z);
        c4481d.mo8850c(j1.class, c8983z);
        C8982y c8982y = C8982y.f43313a;
        c4481d.mo8850c(k2.class, c8982y);
        c4481d.mo8850c(i1.class, c8982y);
        C8966i c8966i = C8966i.f43097a;
        c4481d.mo8850c(v1.class, c8966i);
        c4481d.mo8850c(n0.class, c8966i);
        C8977t c8977t = C8977t.f43272a;
        c4481d.mo8850c(j2.class, c8977t);
        c4481d.mo8850c(p0.class, c8977t);
        C8968k c8968k = C8968k.f43150a;
        c4481d.mo8850c(d2.class, c8968k);
        c4481d.mo8850c(q0.class, c8968k);
        C8970m c8970m = C8970m.f43178a;
        c4481d.mo8850c(b2.class, c8970m);
        c4481d.mo8850c(r0.class, c8970m);
        C8973p c8973p = C8973p.f43228a;
        c4481d.mo8850c(a2.class, c8973p);
        c4481d.mo8850c(v0.class, c8973p);
        C8974q c8974q = C8974q.f43238a;
        c4481d.mo8850c(z1.class, c8974q);
        c4481d.mo8850c(x0.class, c8974q);
        C8971n c8971n = C8971n.f43200a;
        c4481d.mo8850c(x1.class, c8971n);
        c4481d.mo8850c(t0.class, c8971n);
        C8959b c8959b = C8959b.f42992a;
        c4481d.mo8850c(p1.class, c8959b);
        c4481d.mo8850c(d0.class, c8959b);
        C8958a c8958a = C8958a.f42968a;
        c4481d.mo8850c(o1.class, c8958a);
        c4481d.mo8850c(e0.class, c8958a);
        C8972o c8972o = C8972o.f43217a;
        c4481d.mo8850c(y1.class, c8972o);
        c4481d.mo8850c(u0.class, c8972o);
        C8969l c8969l = C8969l.f43167a;
        c4481d.mo8850c(w1.class, c8969l);
        c4481d.mo8850c(s0.class, c8969l);
        C8960c c8960c = C8960c.f43020a;
        c4481d.mo8850c(q1.class, c8960c);
        c4481d.mo8850c(f0.class, c8960c);
        C8975r c8975r = C8975r.f43251a;
        c4481d.mo8850c(c2.class, c8975r);
        c4481d.mo8850c(z0.class, c8975r);
        C8976s c8976s = C8976s.f43261a;
        c4481d.mo8850c(e2.class, c8976s);
        c4481d.mo8850c(b1.class, c8976s);
        C8978u c8978u = C8978u.f43284a;
        c4481d.mo8850c(f2.class, c8978u);
        c4481d.mo8850c(c1.class, c8978u);
        C8981x c8981x = C8981x.f43306a;
        c4481d.mo8850c(i2.class, c8981x);
        c4481d.mo8850c(g1.class, c8981x);
        C8979v c8979v = C8979v.f43289a;
        c4481d.mo8850c(h2.class, c8979v);
        c4481d.mo8850c(e1.class, c8979v);
        C8980w c8980w = C8980w.f43297a;
        c4481d.mo8850c(g2.class, c8980w);
        c4481d.mo8850c(f1.class, c8980w);
        C8962e c8962e = C8962e.f43061a;
        c4481d.mo8850c(s1.class, c8962e);
        c4481d.mo8850c(g0.class, c8962e);
        C8963f c8963f = C8963f.f43071a;
        c4481d.mo8850c(r1.class, c8963f);
        c4481d.mo8850c(h0.class, c8963f);
        c4481d.f22312d = true;
        f499a = new C4001v(6, c4481d);
    }

    /* renamed from: a */
    public static x0 m372a(JsonReader jsonReader) throws IOException {
        w0 w0Var = new w0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    w0Var.f43303d = jsonReader.nextLong();
                    w0Var.f43305f = (byte) (w0Var.f43305f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    w0Var.f43301b = strNextString;
                    break;
                case "pc":
                    w0Var.f43300a = jsonReader.nextLong();
                    w0Var.f43305f = (byte) (w0Var.f43305f | 1);
                    break;
                case "file":
                    w0Var.f43302c = jsonReader.nextString();
                    break;
                case "importance":
                    w0Var.f43304e = jsonReader.nextInt();
                    w0Var.f43305f = (byte) (w0Var.f43305f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return w0Var.m16455a();
    }

    /* renamed from: b */
    public static f0 m373b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals(TransferTable.COLUMN_KEY)) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new f0(strNextString, strNextString2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (strNextString == null) {
            sb2.append(" key");
        }
        if (strNextString2 == null) {
            sb2.append(" value");
        }
        throw new IllegalStateException(a1.m14334n(sb2, "Missing required properties:"));
    }

    /* renamed from: c */
    public static d0 m374c(JsonReader jsonReader) throws IOException {
        int i10;
        c0 c0Var = new c0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            i10 = 1;
            switch (strNextName) {
                case "buildIdMappingForArch":
                    c0Var.f43031i = m375d(jsonReader, new C0011j(i10));
                    break;
                case "pid":
                    c0Var.f43023a = jsonReader.nextInt();
                    c0Var.f43032j = (byte) (c0Var.f43032j | 1);
                    break;
                case "pss":
                    c0Var.f43027e = jsonReader.nextLong();
                    c0Var.f43032j = (byte) (c0Var.f43032j | 8);
                    break;
                case "rss":
                    c0Var.f43028f = jsonReader.nextLong();
                    c0Var.f43032j = (byte) (c0Var.f43032j | 16);
                    break;
                case "timestamp":
                    c0Var.f43029g = jsonReader.nextLong();
                    c0Var.f43032j = (byte) (c0Var.f43032j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c0Var.f43024b = strNextString;
                    break;
                case "reasonCode":
                    c0Var.f43025c = jsonReader.nextInt();
                    c0Var.f43032j = (byte) (c0Var.f43032j | 2);
                    break;
                case "traceFile":
                    c0Var.f43030h = jsonReader.nextString();
                    break;
                case "importance":
                    c0Var.f43026d = jsonReader.nextInt();
                    c0Var.f43032j = (byte) (c0Var.f43032j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0Var.m16446a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List m375d(android.util.JsonReader r22, a1.C0011j r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.C0161a.m375d(android.util.JsonReader, a1.j):java.util.List");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static zi.p0 m376e(android.util.JsonReader r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.C0161a.m376e(android.util.JsonReader):zi.p0");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static zi.t0 m377f(android.util.JsonReader r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.C0161a.m377f(android.util.JsonReader):zi.t0");
    }

    /* renamed from: g */
    public static z0 m378g(JsonReader jsonReader) throws IOException {
        y0 y0Var = new y0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    y0Var.f43319b = jsonReader.nextInt();
                    y0Var.f43322e = (byte) (y0Var.f43322e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    y0Var.f43318a = strNextString;
                    break;
                case "defaultProcess":
                    y0Var.f43321d = jsonReader.nextBoolean();
                    y0Var.f43322e = (byte) (y0Var.f43322e | 4);
                    break;
                case "importance":
                    y0Var.f43320c = jsonReader.nextInt();
                    y0Var.f43322e = (byte) (y0Var.f43322e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return y0Var.m16456a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static zi.b0 m379h(android.util.JsonReader r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.C0161a.m379h(android.util.JsonReader):zi.b0");
    }

    /* renamed from: i */
    public static b0 m380i(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                b0 b0VarM379h = m379h(jsonReader);
                jsonReader.close();
                return b0VarM379h;
            } finally {
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }
}
