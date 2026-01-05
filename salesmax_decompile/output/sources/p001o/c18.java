package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.common.api.Api;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpHost;
import org.apache.http.cookie.ClientCookie;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public final class c18 {

    /* renamed from: a */
    public static final c18 f17095a;

    /* renamed from: b */
    public static final sx7[] f17096b;

    /* renamed from: c */
    public static final Map f17097c;

    static {
        c18 c18Var = new c18();
        f17095a = c18Var;
        sx7 sx7Var = new sx7(sx7.f46083j, "");
        zq1 zq1Var = sx7.f46080g;
        sx7 sx7Var2 = new sx7(zq1Var, "GET");
        sx7 sx7Var3 = new sx7(zq1Var, "POST");
        zq1 zq1Var2 = sx7.f46081h;
        sx7 sx7Var4 = new sx7(zq1Var2, "/");
        sx7 sx7Var5 = new sx7(zq1Var2, "/index.html");
        zq1 zq1Var3 = sx7.f46082i;
        sx7 sx7Var6 = new sx7(zq1Var3, HttpHost.DEFAULT_SCHEME_NAME);
        sx7 sx7Var7 = new sx7(zq1Var3, "https");
        zq1 zq1Var4 = sx7.f46079f;
        f17096b = new sx7[]{sx7Var, sx7Var2, sx7Var3, sx7Var4, sx7Var5, sx7Var6, sx7Var7, new sx7(zq1Var4, "200"), new sx7(zq1Var4, "204"), new sx7(zq1Var4, "206"), new sx7(zq1Var4, "304"), new sx7(zq1Var4, "400"), new sx7(zq1Var4, "404"), new sx7(zq1Var4, "500"), new sx7("accept-charset", ""), new sx7("accept-encoding", "gzip, deflate"), new sx7("accept-language", ""), new sx7("accept-ranges", ""), new sx7("accept", ""), new sx7("access-control-allow-origin", ""), new sx7("age", ""), new sx7("allow", ""), new sx7("authorization", ""), new sx7("cache-control", ""), new sx7("content-disposition", ""), new sx7("content-encoding", ""), new sx7("content-language", ""), new sx7("content-length", ""), new sx7("content-location", ""), new sx7("content-range", ""), new sx7("content-type", ""), new sx7("cookie", ""), new sx7("date", ""), new sx7(TransferTable.COLUMN_ETAG, ""), new sx7("expect", ""), new sx7(ClientCookie.EXPIRES_ATTR, ""), new sx7(Constants.MessagePayloadKeys.FROM, ""), new sx7("host", ""), new sx7("if-match", ""), new sx7("if-modified-since", ""), new sx7("if-none-match", ""), new sx7("if-range", ""), new sx7("if-unmodified-since", ""), new sx7("last-modified", ""), new sx7("link", ""), new sx7("location", ""), new sx7("max-forwards", ""), new sx7("proxy-authenticate", ""), new sx7("proxy-authorization", ""), new sx7("range", ""), new sx7("referer", ""), new sx7("refresh", ""), new sx7("retry-after", ""), new sx7("server", ""), new sx7("set-cookie", ""), new sx7("strict-transport-security", ""), new sx7("transfer-encoding", ""), new sx7("user-agent", ""), new sx7("vary", ""), new sx7("via", ""), new sx7("www-authenticate", "")};
        f17097c = c18Var.m20041d();
    }

    /* renamed from: a */
    public final zq1 m20038a(zq1 zq1Var) throws IOException {
        sq8.m48649h(zq1Var, "name");
        int iM59694L = zq1Var.m59694L();
        for (int i = 0; i < iM59694L; i++) {
            byte bM59699h = zq1Var.m59699h(i);
            if (65 <= bM59699h && bM59699h < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + zq1Var.m59696R());
            }
        }
        return zq1Var;
    }

    /* renamed from: b */
    public final Map m20039b() {
        return f17097c;
    }

    /* renamed from: c */
    public final sx7[] m20040c() {
        return f17096b;
    }

    /* renamed from: d */
    public final Map m20041d() {
        sx7[] sx7VarArr = f17096b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(sx7VarArr.length);
        int length = sx7VarArr.length;
        for (int i = 0; i < length; i++) {
            sx7[] sx7VarArr2 = f17096b;
            if (!linkedHashMap.containsKey(sx7VarArr2[i].f46084a)) {
                linkedHashMap.put(sx7VarArr2[i].f46084a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        sq8.m48648g(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    /* renamed from: o.c18$a */
    public static final class C12531a {

        /* renamed from: a */
        public final int f17098a;

        /* renamed from: b */
        public int f17099b;

        /* renamed from: c */
        public final List f17100c;

        /* renamed from: d */
        public final im1 f17101d;

        /* renamed from: e */
        public sx7[] f17102e;

        /* renamed from: f */
        public int f17103f;

        /* renamed from: g */
        public int f17104g;

        /* renamed from: h */
        public int f17105h;

        public C12531a(lzf lzfVar, int i, int i2) {
            sq8.m48649h(lzfVar, "source");
            this.f17098a = i;
            this.f17099b = i2;
            this.f17100c = new ArrayList();
            this.f17101d = uac.m51310c(lzfVar);
            this.f17102e = new sx7[8];
            this.f17103f = r2.length - 1;
        }

        /* renamed from: a */
        public final void m20042a() {
            int i = this.f17099b;
            int i2 = this.f17105h;
            if (i < i2) {
                if (i == 0) {
                    m20043b();
                } else {
                    m20045d(i2 - i);
                }
            }
        }

        /* renamed from: b */
        public final void m20043b() {
            fp0.m27273v(this.f17102e, null, 0, 0, 6, null);
            this.f17103f = this.f17102e.length - 1;
            this.f17104g = 0;
            this.f17105h = 0;
        }

        /* renamed from: c */
        public final int m20044c(int i) {
            return this.f17103f + 1 + i;
        }

        /* renamed from: d */
        public final int m20045d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f17102e.length;
                while (true) {
                    length--;
                    i2 = this.f17103f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    sx7 sx7Var = this.f17102e[length];
                    sq8.m48646e(sx7Var);
                    int i4 = sx7Var.f46086c;
                    i -= i4;
                    this.f17105h -= i4;
                    this.f17104g--;
                    i3++;
                }
                sx7[] sx7VarArr = this.f17102e;
                System.arraycopy(sx7VarArr, i2 + 1, sx7VarArr, i2 + 1 + i3, this.f17104g);
                this.f17103f += i3;
            }
            return i3;
        }

        /* renamed from: e */
        public final List m20046e() {
            List listQ0 = kh3.Q0(this.f17100c);
            this.f17100c.clear();
            return listQ0;
        }

        /* renamed from: f */
        public final zq1 m20047f(int i) throws IOException {
            if (m20049h(i)) {
                return c18.f17095a.m20040c()[i].f46084a;
            }
            int iM20044c = m20044c(i - c18.f17095a.m20040c().length);
            if (iM20044c >= 0) {
                sx7[] sx7VarArr = this.f17102e;
                if (iM20044c < sx7VarArr.length) {
                    sx7 sx7Var = sx7VarArr[iM20044c];
                    sq8.m48646e(sx7Var);
                    return sx7Var.f46084a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: g */
        public final void m20048g(int i, sx7 sx7Var) {
            this.f17100c.add(sx7Var);
            int i2 = sx7Var.f46086c;
            if (i != -1) {
                sx7 sx7Var2 = this.f17102e[m20044c(i)];
                sq8.m48646e(sx7Var2);
                i2 -= sx7Var2.f46086c;
            }
            int i3 = this.f17099b;
            if (i2 > i3) {
                m20043b();
                return;
            }
            int iM20045d = m20045d((this.f17105h + i2) - i3);
            if (i == -1) {
                int i4 = this.f17104g + 1;
                sx7[] sx7VarArr = this.f17102e;
                if (i4 > sx7VarArr.length) {
                    sx7[] sx7VarArr2 = new sx7[sx7VarArr.length * 2];
                    System.arraycopy(sx7VarArr, 0, sx7VarArr2, sx7VarArr.length, sx7VarArr.length);
                    this.f17103f = this.f17102e.length - 1;
                    this.f17102e = sx7VarArr2;
                }
                int i5 = this.f17103f;
                this.f17103f = i5 - 1;
                this.f17102e[i5] = sx7Var;
                this.f17104g++;
            } else {
                this.f17102e[i + m20044c(i) + iM20045d] = sx7Var;
            }
            this.f17105h += i2;
        }

        /* renamed from: h */
        public final boolean m20049h(int i) {
            return i >= 0 && i <= c18.f17095a.m20040c().length - 1;
        }

        /* renamed from: i */
        public final int m20050i() {
            return ggj.m28622b(this.f17101d.readByte(), com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH);
        }

        /* renamed from: j */
        public final zq1 m20051j() {
            int iM20050i = m20050i();
            boolean z = (iM20050i & 128) == 128;
            long jM20054m = m20054m(iM20050i, Opcodes.LAND);
            if (!z) {
                return this.f17101d.y1(jM20054m);
            }
            rl1 rl1Var = new rl1();
            q58.f41320a.m44821b(this.f17101d, jM20054m, rl1Var);
            return rl1Var.m46906O();
        }

        /* renamed from: k */
        public final void m20052k() throws IOException {
            while (!this.f17101d.mo32311n()) {
                int iM28622b = ggj.m28622b(this.f17101d.readByte(), com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH);
                if (iM28622b == 128) {
                    throw new IOException("index == 0");
                }
                if ((iM28622b & 128) == 128) {
                    m20053l(m20054m(iM28622b, Opcodes.LAND) - 1);
                } else if (iM28622b == 64) {
                    m20056o();
                } else if ((iM28622b & 64) == 64) {
                    m20055n(m20054m(iM28622b, 63) - 1);
                } else if ((iM28622b & 32) == 32) {
                    int iM20054m = m20054m(iM28622b, 31);
                    this.f17099b = iM20054m;
                    if (iM20054m < 0 || iM20054m > this.f17098a) {
                        throw new IOException("Invalid dynamic table size update " + this.f17099b);
                    }
                    m20042a();
                } else if (iM28622b == 16 || iM28622b == 0) {
                    m20058q();
                } else {
                    m20057p(m20054m(iM28622b, 15) - 1);
                }
            }
        }

        /* renamed from: l */
        public final void m20053l(int i) throws IOException {
            if (m20049h(i)) {
                this.f17100c.add(c18.f17095a.m20040c()[i]);
                return;
            }
            int iM20044c = m20044c(i - c18.f17095a.m20040c().length);
            if (iM20044c >= 0) {
                sx7[] sx7VarArr = this.f17102e;
                if (iM20044c < sx7VarArr.length) {
                    List list = this.f17100c;
                    sx7 sx7Var = sx7VarArr[iM20044c];
                    sq8.m48646e(sx7Var);
                    list.add(sx7Var);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: m */
        public final int m20054m(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int iM20050i = m20050i();
                if ((iM20050i & 128) == 0) {
                    return i2 + (iM20050i << i4);
                }
                i2 += (iM20050i & Opcodes.LAND) << i4;
                i4 += 7;
            }
        }

        /* renamed from: n */
        public final void m20055n(int i) {
            m20048g(-1, new sx7(m20047f(i), m20051j()));
        }

        /* renamed from: o */
        public final void m20056o() {
            m20048g(-1, new sx7(c18.f17095a.m20038a(m20051j()), m20051j()));
        }

        /* renamed from: p */
        public final void m20057p(int i) throws IOException {
            this.f17100c.add(new sx7(m20047f(i), m20051j()));
        }

        /* renamed from: q */
        public final void m20058q() throws IOException {
            this.f17100c.add(new sx7(c18.f17095a.m20038a(m20051j()), m20051j()));
        }

        public /* synthetic */ C12531a(lzf lzfVar, int i, int i2, int i3, id5 id5Var) {
            this(lzfVar, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    /* renamed from: o.c18$b */
    public static final class C12532b {

        /* renamed from: a */
        public int f17106a;

        /* renamed from: b */
        public final boolean f17107b;

        /* renamed from: c */
        public final rl1 f17108c;

        /* renamed from: d */
        public int f17109d;

        /* renamed from: e */
        public boolean f17110e;

        /* renamed from: f */
        public int f17111f;

        /* renamed from: g */
        public sx7[] f17112g;

        /* renamed from: h */
        public int f17113h;

        /* renamed from: i */
        public int f17114i;

        /* renamed from: j */
        public int f17115j;

        public C12532b(int i, boolean z, rl1 rl1Var) {
            sq8.m48649h(rl1Var, "out");
            this.f17106a = i;
            this.f17107b = z;
            this.f17108c = rl1Var;
            this.f17109d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f17111f = i;
            this.f17112g = new sx7[8];
            this.f17113h = r2.length - 1;
        }

        /* renamed from: a */
        public final void m20059a() {
            int i = this.f17111f;
            int i2 = this.f17115j;
            if (i < i2) {
                if (i == 0) {
                    m20060b();
                } else {
                    m20061c(i2 - i);
                }
            }
        }

        /* renamed from: b */
        public final void m20060b() {
            fp0.m27273v(this.f17112g, null, 0, 0, 6, null);
            this.f17113h = this.f17112g.length - 1;
            this.f17114i = 0;
            this.f17115j = 0;
        }

        /* renamed from: c */
        public final int m20061c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f17112g.length;
                while (true) {
                    length--;
                    i2 = this.f17113h;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    sx7 sx7Var = this.f17112g[length];
                    sq8.m48646e(sx7Var);
                    i -= sx7Var.f46086c;
                    int i4 = this.f17115j;
                    sx7 sx7Var2 = this.f17112g[length];
                    sq8.m48646e(sx7Var2);
                    this.f17115j = i4 - sx7Var2.f46086c;
                    this.f17114i--;
                    i3++;
                }
                sx7[] sx7VarArr = this.f17112g;
                System.arraycopy(sx7VarArr, i2 + 1, sx7VarArr, i2 + 1 + i3, this.f17114i);
                sx7[] sx7VarArr2 = this.f17112g;
                int i5 = this.f17113h;
                Arrays.fill(sx7VarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.f17113h += i3;
            }
            return i3;
        }

        /* renamed from: d */
        public final void m20062d(sx7 sx7Var) {
            int i = sx7Var.f46086c;
            int i2 = this.f17111f;
            if (i > i2) {
                m20060b();
                return;
            }
            m20061c((this.f17115j + i) - i2);
            int i3 = this.f17114i + 1;
            sx7[] sx7VarArr = this.f17112g;
            if (i3 > sx7VarArr.length) {
                sx7[] sx7VarArr2 = new sx7[sx7VarArr.length * 2];
                System.arraycopy(sx7VarArr, 0, sx7VarArr2, sx7VarArr.length, sx7VarArr.length);
                this.f17113h = this.f17112g.length - 1;
                this.f17112g = sx7VarArr2;
            }
            int i4 = this.f17113h;
            this.f17113h = i4 - 1;
            this.f17112g[i4] = sx7Var;
            this.f17114i++;
            this.f17115j += i;
        }

        /* renamed from: e */
        public final void m20063e(int i) {
            this.f17106a = i;
            int iMin = Math.min(i, Opcodes.ACC_ENUM);
            int i2 = this.f17111f;
            if (i2 == iMin) {
                return;
            }
            if (iMin < i2) {
                this.f17109d = Math.min(this.f17109d, iMin);
            }
            this.f17110e = true;
            this.f17111f = iMin;
            m20059a();
        }

        /* renamed from: f */
        public final void m20064f(zq1 zq1Var) {
            sq8.m48649h(zq1Var, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (this.f17107b) {
                q58 q58Var = q58.f41320a;
                if (q58Var.m44823d(zq1Var) < zq1Var.m59694L()) {
                    rl1 rl1Var = new rl1();
                    q58Var.m44822c(zq1Var, rl1Var);
                    zq1 zq1VarM46906O = rl1Var.m46906O();
                    m20066h(zq1VarM46906O.m59694L(), Opcodes.LAND, 128);
                    this.f17108c.M2(zq1VarM46906O);
                    return;
                }
            }
            m20066h(zq1Var.m59694L(), Opcodes.LAND, 0);
            this.f17108c.M2(zq1Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m20065g(List list) {
            int length;
            int length2;
            sq8.m48649h(list, "headerBlock");
            if (this.f17110e) {
                int i = this.f17109d;
                if (i < this.f17111f) {
                    m20066h(i, 31, 32);
                }
                this.f17110e = false;
                this.f17109d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                m20066h(this.f17111f, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sx7 sx7Var = (sx7) list.get(i2);
                zq1 zq1VarMo38688P = sx7Var.f46084a.mo38688P();
                zq1 zq1Var = sx7Var.f46085b;
                c18 c18Var = c18.f17095a;
                Integer num = (Integer) c18Var.m20039b().get(zq1VarMo38688P);
                if (num != null) {
                    length2 = num.intValue() + 1;
                    if (!(2 <= length2 && length2 < 8)) {
                        length = length2;
                        length2 = -1;
                    } else if (sq8.m48644c(c18Var.m20040c()[length2 - 1].f46085b, zq1Var)) {
                        length = length2;
                    } else if (sq8.m48644c(c18Var.m20040c()[length2].f46085b, zq1Var)) {
                        length2++;
                        length = length2;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i3 = this.f17113h + 1;
                    int length3 = this.f17112g.length;
                    while (true) {
                        if (i3 >= length3) {
                            break;
                        }
                        sx7 sx7Var2 = this.f17112g[i3];
                        sq8.m48646e(sx7Var2);
                        if (sq8.m48644c(sx7Var2.f46084a, zq1VarMo38688P)) {
                            sx7 sx7Var3 = this.f17112g[i3];
                            sq8.m48646e(sx7Var3);
                            if (sq8.m48644c(sx7Var3.f46085b, zq1Var)) {
                                length2 = c18.f17095a.m20040c().length + (i3 - this.f17113h);
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.f17113h) + c18.f17095a.m20040c().length;
                            }
                        }
                        i3++;
                    }
                }
                if (length2 != -1) {
                    m20066h(length2, Opcodes.LAND, 128);
                } else if (length == -1) {
                    this.f17108c.T1(64);
                    m20064f(zq1VarMo38688P);
                    m20064f(zq1Var);
                    m20062d(sx7Var);
                } else if (!zq1VarMo38688P.m59695M(sx7.f46078e) || sq8.m48644c(sx7.f46083j, zq1VarMo38688P)) {
                    m20066h(length, 63, 64);
                    m20064f(zq1Var);
                    m20062d(sx7Var);
                } else {
                    m20066h(length, 15, 0);
                    m20064f(zq1Var);
                }
            }
        }

        /* renamed from: h */
        public final void m20066h(int i, int i2, int i3) {
            if (i < i2) {
                this.f17108c.T1(i | i3);
                return;
            }
            this.f17108c.T1(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f17108c.T1(128 | (i4 & Opcodes.LAND));
                i4 >>>= 7;
            }
            this.f17108c.T1(i4);
        }

        public /* synthetic */ C12532b(int i, boolean z, rl1 rl1Var, int i2, id5 id5Var) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, rl1Var);
        }
    }
}
