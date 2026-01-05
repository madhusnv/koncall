package p001o;

import java.io.IOException;
import java.util.Iterator;
import org.apache.http.protocol.HTTP;
import p001o.e38;
import p001o.ul1;

/* loaded from: classes6.dex */
public class g38 extends r7 {

    /* renamed from: C */
    public static byte[] f24510C = {48, 13, 10, 13, 10};

    /* renamed from: D */
    public static byte[] f24511D = ped.m43533b("Content-Length: 0\r\n");

    /* renamed from: E */
    public static byte[] f24512E = ped.m43533b("Connection: keep-alive\r\n");

    /* renamed from: F */
    public static byte[] f24513F = ped.m43533b("Connection: close\r\n");

    /* renamed from: G */
    public static byte[] f24514G = ped.m43533b("Connection: ");

    /* renamed from: H */
    public static byte[] f24515H = ped.m43533b("\r\n");

    /* renamed from: I */
    public static byte[] f24516I = ped.m43533b("Transfer-Encoding: chunked\r\n");

    /* renamed from: J */
    public static byte[] f24517J = ped.m43533b("Server: Jetty(6.0.x)\r\n");

    /* renamed from: K */
    public static int f24518K = 12;

    /* renamed from: A */
    public boolean f24519A;

    /* renamed from: B */
    public boolean f24520B;

    /* renamed from: y */
    public boolean f24521y;

    /* renamed from: z */
    public boolean f24522z;

    public g38(lm1 lm1Var, y76 y76Var, int i, int i2) {
        super(lm1Var, y76Var, i, i2);
        this.f24521y = false;
        this.f24522z = false;
        this.f24519A = false;
        this.f24520B = false;
    }

    /* renamed from: y */
    public static void m28015y(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Server: Jetty(");
        stringBuffer.append(str);
        stringBuffer.append(")\r\n");
        f24517J = ped.m43533b(stringBuffer.toString());
    }

    @Override // p001o.r7, p001o.zn7
    /* renamed from: a */
    public void mo28016a(boolean z) {
        super.mo28016a(z);
        this.f24521y = false;
        this.f24522z = false;
        this.f24519A = false;
        this.f24520B = false;
        this.f43072e = null;
        this.f43073f = null;
        this.f43078k = false;
    }

    @Override // p001o.r7, p001o.zn7
    /* renamed from: c */
    public void mo28017c() {
        if (this.f43068a == 4) {
            return;
        }
        super.mo28017c();
        if (this.f43068a < 3) {
            this.f43068a = 3;
            if (this.f43075h == -2) {
                this.f24519A = true;
            }
        }
        flush();
    }

    @Override // p001o.zn7
    /* renamed from: d */
    public void mo28018d(sl1 sl1Var, boolean z) throws dj6 {
        if (this.f43078k) {
            throw new IllegalStateException("NO CONTENT");
        }
        if (this.f43076i || this.f43068a == 4) {
            tia.m49921c("Ignoring extra content {}", sl1Var);
            sl1Var.clear();
            return;
        }
        this.f43076i = z;
        sl1 sl1Var2 = this.f43086s;
        if ((sl1Var2 != null && sl1Var2.length() > 0) || this.f24520B) {
            if (!this.f43081n.isOpen()) {
                throw new dj6();
            }
            flush();
            sl1 sl1Var3 = this.f43086s;
            if ((sl1Var3 != null && sl1Var3.length() > 0) || this.f24520B) {
                throw new IllegalStateException("FULL");
            }
        }
        this.f43086s = sl1Var;
        this.f43074g += sl1Var.length();
        if (this.f43077j) {
            sl1Var.clear();
            this.f43086s = null;
            return;
        }
        if (this.f43081n != null && this.f43085r == null && sl1Var.length() > 0 && this.f43076i) {
            this.f24521y = true;
            return;
        }
        if (this.f43085r == null) {
            this.f43085r = this.f43080m.mo37460f(this.f43083p);
        }
        this.f43086s.mo48450d(this.f43085r.s2(this.f43086s));
        if (this.f43086s.length() == 0) {
            this.f43086s = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0108, code lost:
    
        if (r10.f43068a != 3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010a, code lost:
    
        r10.f43068a = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010e, code lost:
    
        if (r10.f43068a != 4) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0112, code lost:
    
        if (r10.f43079l == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0118, code lost:
    
        if (r10.f43069b == 100) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x011a, code lost:
    
        r10.f43081n.mo29646k();
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4 A[Catch: IOException -> 0x0133, TryCatch #0 {IOException -> 0x0133, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000c, B:8:0x0010, B:10:0x0014, B:11:0x0019, B:13:0x001d, B:15:0x0021, B:17:0x0025, B:18:0x002a, B:21:0x0032, B:23:0x0037, B:27:0x0040, B:29:0x0044, B:33:0x004d, B:35:0x0052, B:37:0x0056, B:41:0x005f, B:42:0x0061, B:88:0x0126, B:89:0x0129, B:44:0x0066, B:45:0x006b, B:46:0x006c, B:47:0x0078, B:48:0x0084, B:49:0x008e, B:50:0x0093, B:51:0x0094, B:52:0x009e, B:53:0x00a8, B:55:0x00ac, B:56:0x00af, B:58:0x00b8, B:60:0x00c3, B:62:0x00d5, B:64:0x00e1, B:66:0x00e5, B:67:0x00f4, B:69:0x00f8, B:71:0x00fc, B:73:0x0100, B:75:0x0106, B:77:0x010a, B:78:0x010c, B:80:0x0110, B:82:0x0114, B:84:0x011a, B:85:0x0120, B:91:0x012b, B:92:0x0132), top: B:99:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0126 A[Catch: IOException -> 0x0133, LOOP:0: B:21:0x0032->B:88:0x0126, LOOP_END, TryCatch #0 {IOException -> 0x0133, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000c, B:8:0x0010, B:10:0x0014, B:11:0x0019, B:13:0x001d, B:15:0x0021, B:17:0x0025, B:18:0x002a, B:21:0x0032, B:23:0x0037, B:27:0x0040, B:29:0x0044, B:33:0x004d, B:35:0x0052, B:37:0x0056, B:41:0x005f, B:42:0x0061, B:88:0x0126, B:89:0x0129, B:44:0x0066, B:45:0x006b, B:46:0x006c, B:47:0x0078, B:48:0x0084, B:49:0x008e, B:50:0x0093, B:51:0x0094, B:52:0x009e, B:53:0x00a8, B:55:0x00ac, B:56:0x00af, B:58:0x00b8, B:60:0x00c3, B:62:0x00d5, B:64:0x00e1, B:66:0x00e5, B:67:0x00f4, B:69:0x00f8, B:71:0x00fc, B:73:0x0100, B:75:0x0106, B:77:0x010a, B:78:0x010c, B:80:0x0110, B:82:0x0114, B:84:0x011a, B:85:0x0120, B:91:0x012b, B:92:0x0132), top: B:99:0x0000 }] */
    @Override // p001o.r7, p001o.zn7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long flush() {
        sl1 sl1Var;
        int iMo51048f;
        sl1 sl1Var2;
        sl1 sl1Var3;
        sl1 sl1Var4;
        try {
            if (this.f43068a == 0) {
                throw new IllegalStateException("State==HEADER");
            }
            m28022x();
            if (this.f43081n == null) {
                if (this.f24522z && (sl1Var4 = this.f43085r) != null) {
                    sl1Var4.u0(u48.f48317a);
                }
                if (this.f24519A && (sl1Var3 = this.f43085r) != null && !this.f43077j) {
                    sl1Var3.u0(f24510C);
                }
                this.f24522z = false;
                this.f24519A = false;
                return 0L;
            }
            int i = 0;
            while (true) {
                sl1 sl1Var5 = this.f43084q;
                char c = (sl1Var5 == null || sl1Var5.length() <= 0) ? (char) 0 : (char) 4;
                sl1 sl1Var6 = this.f43085r;
                switch (c | ((sl1Var6 == null || sl1Var6.length() <= 0) ? (char) 0 : (char) 2) | ((!this.f24521y || (sl1Var2 = this.f43086s) == null || sl1Var2.length() <= 0) ? 0 : 1)) {
                    case 0:
                        sl1 sl1Var7 = this.f43084q;
                        if (sl1Var7 != null) {
                            sl1Var7.clear();
                        }
                        this.f24521y = false;
                        this.f24520B = false;
                        sl1 sl1Var8 = this.f43085r;
                        if (sl1Var8 != null) {
                            sl1Var8.clear();
                            if (this.f43075h == -2) {
                                this.f43085r.k0(f24518K);
                                this.f43085r.w2(f24518K);
                                sl1 sl1Var9 = this.f43086s;
                                if (sl1Var9 != null && sl1Var9.length() < this.f43085r.V0() && this.f43068a != 3) {
                                    this.f43085r.s2(this.f43086s);
                                    this.f43086s.clear();
                                    this.f43086s = null;
                                    break;
                                } else if (!this.f24522z && !this.f24519A && ((sl1Var = this.f43086s) == null || sl1Var.length() == 0)) {
                                    break;
                                } else {
                                    m28022x();
                                    iMo51048f = -1;
                                }
                            }
                        }
                        if (iMo51048f <= 0) {
                            break;
                        } else {
                            i += iMo51048f;
                        }
                        break;
                    case 1:
                        iMo51048f = this.f43081n.mo51048f(this.f43086s);
                        if (iMo51048f <= 0) {
                        }
                        break;
                    case 2:
                        iMo51048f = this.f43081n.mo51048f(this.f43085r);
                        if (iMo51048f <= 0) {
                        }
                        break;
                    case 3:
                        throw new IllegalStateException();
                    case 4:
                        iMo51048f = this.f43081n.mo51048f(this.f43084q);
                        if (iMo51048f <= 0) {
                        }
                        break;
                    case 5:
                        iMo51048f = this.f43081n.mo51050h(this.f43084q, this.f43086s, null);
                        if (iMo51048f <= 0) {
                        }
                        break;
                    case 6:
                        iMo51048f = this.f43081n.mo51050h(this.f43084q, this.f43085r, null);
                        if (iMo51048f <= 0) {
                        }
                        break;
                    case 7:
                        throw new IllegalStateException();
                    default:
                        iMo51048f = -1;
                        if (iMo51048f <= 0) {
                        }
                        break;
                }
            }
            return i;
        } catch (IOException e) {
            tia.m49923e(e);
            if (e instanceof dj6) {
                throw e;
            }
            throw new dj6(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0191  */
    @Override // p001o.r7, p001o.zn7
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo28019h(e38 e38Var, boolean z) {
        StringBuffer stringBuffer;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        e38.C13091a c13091a;
        StringBuffer stringBuffer2;
        StringBuffer stringBuffer3;
        int i;
        int i2;
        boolean z7;
        int i3;
        n5e n5eVar;
        if (this.f43068a != 0) {
            return;
        }
        if (this.f43072e == null && this.f43069b == 0) {
            throw new dj6();
        }
        boolean z8 = this.f43076i;
        if (z8 && !z) {
            throw new IllegalStateException("last?");
        }
        this.f43076i = z8 | z;
        if (this.f43084q == null) {
            this.f43084q = this.f43080m.mo37460f(this.f43082o);
        }
        sl1 sl1Var = this.f43072e;
        int i4 = 5;
        int i5 = 48;
        if (sl1Var == null) {
            int i6 = this.f43070c;
            if (i6 == 9) {
                this.f43079l = true;
                this.f43075h = -1L;
                this.f43068a = 2;
                return;
            }
            if (i6 == 10) {
                this.f43079l = true;
            }
            sl1 sl1VarM46205a = r48.m46205a(this.f43069b);
            if (sl1VarM46205a == null) {
                if (this.f43071d == null) {
                    this.f43071d = r7.m46282t(this.f43069b);
                }
                this.f43084q.s2(z48.f56511d);
                this.f43084q.d1((byte) 32);
                this.f43084q.d1((byte) ((this.f43069b / 100) + 48));
                this.f43084q.d1((byte) (((this.f43069b % 100) / 10) + 48));
                this.f43084q.d1((byte) ((this.f43069b % 10) + 48));
                this.f43084q.d1((byte) 32);
                sl1 sl1Var2 = this.f43071d;
                if (sl1Var2 == null) {
                    this.f43084q.d1((byte) ((this.f43069b / 100) + 48));
                    this.f43084q.d1((byte) (((this.f43069b % 100) / 10) + 48));
                    this.f43084q.d1((byte) ((this.f43069b % 10) + 48));
                } else {
                    this.f43084q.s2(sl1Var2);
                }
                this.f43084q.u0(u48.f48317a);
            } else if (this.f43071d == null) {
                this.f43084q.s2(sl1VarM46205a);
            } else {
                this.f43084q.U2(sl1VarM46205a.j0(), 0, z48.f56511d.length() + 5);
                this.f43084q.s2(this.f43071d);
                this.f43084q.u0(u48.f48317a);
            }
            int i7 = this.f43069b;
            if (i7 < 200 && i7 >= 100) {
                this.f43078k = true;
                this.f43086s = null;
                sl1 sl1Var3 = this.f43085r;
                if (sl1Var3 != null) {
                    sl1Var3.clear();
                }
                this.f43084q.u0(u48.f48317a);
                this.f43068a = 2;
                return;
            }
            if (i7 == 204 || i7 == 304) {
                this.f43078k = true;
                stringBuffer = null;
                this.f43086s = null;
                sl1 sl1Var4 = this.f43085r;
                if (sl1Var4 != null) {
                    sl1Var4.clear();
                }
            }
            if (e38Var == null) {
                Iterator itM24181j = e38Var.m24181j();
                stringBuffer2 = stringBuffer;
                StringBuffer stringBuffer4 = stringBuffer2;
                z3 = false;
                z4 = false;
                z5 = false;
                z6 = false;
                while (itM24181j.hasNext()) {
                    e38.C13091a c13091a2 = (e38.C13091a) itM24181j.next();
                    int iM24204n = c13091a2.m24204n();
                    if (iM24204n == 1) {
                        if (this.f43072e != null) {
                            c13091a2.m24208r(this.f43084q);
                        }
                        int iM24207q = c13091a2.m24207q();
                        if (iM24207q == -1) {
                            n5e n5eVar2 = new n5e(c13091a2.m24205o(), ",");
                            while (n5eVar2.hasMoreTokens()) {
                                String strTrim = n5eVar2.nextToken().trim();
                                ul1.C17390a c17390aM51691c = i38.f27983d.m51691c(strTrim);
                                if (c17390aM51691c != null) {
                                    int iM51698j = c17390aM51691c.m51698j();
                                    if (iM51698j == 1) {
                                        sl1 sl1Var5 = this.f43072e;
                                        if (sl1Var5 == null) {
                                            this.f43079l = true;
                                        }
                                        if (this.f43079l && sl1Var5 == null) {
                                            n5eVar = n5eVar2;
                                            if (this.f43075h == -3) {
                                                this.f43075h = -1L;
                                            }
                                        } else {
                                            n5eVar = n5eVar2;
                                        }
                                        z6 = true;
                                        z5 = false;
                                    } else if (iM51698j != i4) {
                                        if (stringBuffer == null) {
                                            stringBuffer = new StringBuffer();
                                        } else {
                                            stringBuffer.append(',');
                                        }
                                        stringBuffer.append(strTrim);
                                        n5eVar = n5eVar2;
                                    } else if (this.f43070c == 10) {
                                        if (this.f43072e == null) {
                                            this.f43079l = false;
                                        }
                                        n5eVar = n5eVar2;
                                        z5 = true;
                                    } else {
                                        n5eVar = n5eVar2;
                                    }
                                } else {
                                    n5eVar = n5eVar2;
                                    if (stringBuffer == null) {
                                        stringBuffer = new StringBuffer();
                                    } else {
                                        stringBuffer.append(',');
                                    }
                                    stringBuffer.append(strTrim);
                                }
                                n5eVar2 = n5eVar;
                                i4 = 5;
                            }
                        } else if (iM24207q == 1) {
                            sl1 sl1Var6 = this.f43072e;
                            if (sl1Var6 == null) {
                                this.f43079l = true;
                            }
                            if (this.f43079l && sl1Var6 == null && this.f43075h == -3) {
                                this.f43075h = -1L;
                            }
                            z6 = true;
                        } else if (iM24207q != i4) {
                            if (stringBuffer == null) {
                                stringBuffer = new StringBuffer();
                            } else {
                                stringBuffer.append(',');
                            }
                            stringBuffer.append(c13091a2.m24205o());
                        } else if (this.f43070c == 10) {
                            if (this.f43072e == null) {
                                this.f43079l = false;
                            }
                            z5 = true;
                        }
                    } else if (iM24204n != i4) {
                        if (iM24204n == 12) {
                            long jM24201k = c13091a2.m24201k();
                            this.f43075h = jM24201k;
                            long j = this.f43074g;
                            StringBuffer stringBuffer5 = (jM24201k < j || (this.f43076i && jM24201k != j)) ? null : c13091a2;
                            c13091a2.m24208r(this.f43084q);
                            stringBuffer2 = stringBuffer5;
                        } else if (iM24204n == 16) {
                            if (zl1.m59571a(yeb.f55363e, c13091a2.m24206p())) {
                                this.f43075h = -4L;
                            }
                            c13091a2.m24208r(this.f43084q);
                            z3 = true;
                        } else if (iM24204n != i5) {
                            c13091a2.m24208r(this.f43084q);
                        } else if (m46293u()) {
                            c13091a2.m24208r(this.f43084q);
                            z4 = true;
                        }
                    } else if (this.f43070c == 11) {
                        stringBuffer4 = c13091a2;
                    }
                    i4 = 5;
                    i5 = 48;
                }
                z2 = false;
                stringBuffer3 = stringBuffer;
                c13091a = stringBuffer4;
            } else {
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
                z6 = false;
                c13091a = 0;
                stringBuffer2 = null;
                stringBuffer3 = null;
            }
            i = (int) this.f43075h;
            if (i != -3) {
                long j2 = this.f43074g;
                if (j2 == 0 && this.f43072e == null && ((i2 = this.f43069b) < 200 || i2 == 204 || i2 == 304)) {
                    this.f43075h = 0L;
                } else if (this.f43076i) {
                    this.f43075h = j2;
                    if (stringBuffer2 == null && (this.f43072e == null || z3 || j2 > 0)) {
                        this.f43084q.s2(j38.f29705j);
                        this.f43084q.d1((byte) 58);
                        this.f43084q.d1((byte) 32);
                        zl1.m59574d(this.f43084q, this.f43075h);
                        this.f43084q.u0(u48.f48317a);
                    }
                } else {
                    long j3 = (this.f43079l || this.f43070c < 11) ? -1L : -2L;
                    this.f43075h = j3;
                    if (this.f43072e != null && j3 == -1) {
                        this.f43075h = 0L;
                        this.f43078k = true;
                    }
                }
            } else if (i == -1) {
                this.f43079l = this.f43072e == null ? true : z2;
            } else if (i == 0 && stringBuffer2 == null && this.f43072e == null && (i3 = this.f43069b) >= 200 && i3 != 204 && i3 != 304) {
                this.f43084q.u0(f24511D);
            }
            if (this.f43075h == -2) {
                if (c13091a == 0 || 2 == c13091a.m24207q()) {
                    this.f43084q.u0(f24516I);
                } else {
                    if (!c13091a.m24205o().endsWith(HTTP.CHUNK_CODING)) {
                        throw new IllegalArgumentException("BAD TE");
                    }
                    c13091a.m24208r(this.f43084q);
                }
            }
            if (this.f43075h != -1) {
                this.f43079l = true;
                z7 = z2;
            } else {
                z7 = z5;
            }
            if (this.f43072e == null) {
                if (this.f43079l && (z6 || this.f43070c > 10)) {
                    this.f43084q.u0(f24513F);
                    if (stringBuffer3 != null) {
                        sl1 sl1Var7 = this.f43084q;
                        sl1Var7.k0(sl1Var7.Y2() - 2);
                        this.f43084q.d1((byte) 44);
                        this.f43084q.u0(stringBuffer3.toString().getBytes());
                        this.f43084q.u0(f24515H);
                    }
                } else if (z7) {
                    this.f43084q.u0(f24512E);
                    if (stringBuffer3 != null) {
                        sl1 sl1Var8 = this.f43084q;
                        sl1Var8.k0(sl1Var8.Y2() - 2);
                        this.f43084q.d1((byte) 44);
                        this.f43084q.u0(stringBuffer3.toString().getBytes());
                        this.f43084q.u0(f24515H);
                    }
                } else if (stringBuffer3 != null) {
                    this.f43084q.u0(f24514G);
                    this.f43084q.u0(stringBuffer3.toString().getBytes());
                    this.f43084q.u0(f24515H);
                }
            }
            if (!z4 && this.f43069b > 100 && m46293u()) {
                this.f43084q.u0(f24517J);
            }
            this.f43084q.u0(u48.f48317a);
            this.f43068a = 2;
        }
        this.f43079l = false;
        if (this.f43070c == 9) {
            this.f43075h = 0L;
            this.f43084q.s2(sl1Var);
            this.f43084q.d1((byte) 32);
            this.f43084q.u0(this.f43073f.getBytes("utf-8"));
            this.f43084q.u0(u48.f48317a);
            this.f43068a = 3;
            this.f43078k = true;
            return;
        }
        this.f43084q.s2(sl1Var);
        this.f43084q.d1((byte) 32);
        this.f43084q.u0(this.f43073f.getBytes("utf-8"));
        this.f43084q.d1((byte) 32);
        this.f43084q.s2(this.f43070c == 10 ? z48.f56510c : z48.f56511d);
        this.f43084q.u0(u48.f48317a);
        stringBuffer = null;
        if (e38Var == null) {
        }
        i = (int) this.f43075h;
        if (i != -3) {
        }
        if (this.f43075h == -2) {
        }
        if (this.f43075h != -1) {
        }
        if (this.f43072e == null) {
        }
        if (!z4) {
            this.f43084q.u0(f24517J);
        }
        this.f43084q.u0(u48.f48317a);
        this.f43068a = 2;
    }

    @Override // p001o.zn7
    /* renamed from: k */
    public boolean mo28020k(byte b) {
        if (this.f43078k) {
            throw new IllegalStateException("NO CONTENT");
        }
        if (this.f43076i || this.f43068a == 4) {
            tia.m49921c("Ignoring extra content {}", new Byte(b));
            return false;
        }
        sl1 sl1Var = this.f43086s;
        if ((sl1Var != null && sl1Var.length() > 0) || this.f24520B) {
            flush();
            sl1 sl1Var2 = this.f43086s;
            if ((sl1Var2 != null && sl1Var2.length() > 0) || this.f24520B) {
                throw new IllegalStateException("FULL");
            }
        }
        this.f43074g++;
        if (this.f43077j) {
            return false;
        }
        if (this.f43085r == null) {
            this.f43085r = this.f43080m.mo37460f(this.f43083p);
        }
        this.f43085r.d1(b);
        return this.f43085r.V0() <= ((this.f43075h > (-2L) ? 1 : (this.f43075h == (-2L) ? 0 : -1)) == 0 ? f24518K : 0);
    }

    public String toString() {
        String string;
        String string2;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HttpGenerator s=");
        stringBuffer.append(this.f43068a);
        stringBuffer.append(" h=");
        String string3 = "null";
        if (this.f43084q == null) {
            string = "null";
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("");
            stringBuffer2.append(this.f43084q.length());
            string = stringBuffer2.toString();
        }
        stringBuffer.append(string);
        stringBuffer.append(" b=");
        if (this.f43085r == null) {
            string2 = "null";
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("");
            stringBuffer3.append(this.f43085r.length());
            string2 = stringBuffer3.toString();
        }
        stringBuffer.append(string2);
        stringBuffer.append(" c=");
        if (this.f43086s != null) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("");
            stringBuffer4.append(this.f43086s.length());
            string3 = stringBuffer4.toString();
        }
        stringBuffer.append(string3);
        return stringBuffer.toString();
    }

    @Override // p001o.r7
    /* renamed from: w */
    public boolean mo28021w() {
        sl1 sl1Var;
        return super.mo28021w() || this.f24520B || this.f24521y || (this.f43075h == -2 && (sl1Var = this.f43085r) != null && sl1Var.V0() < f24518K);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m28022x() {
        sl1 sl1Var;
        sl1 sl1Var2;
        if (!this.f24520B) {
            sl1 sl1Var3 = this.f43086s;
            if (sl1Var3 != null && sl1Var3.length() > 0 && (sl1Var2 = this.f43085r) != null && sl1Var2.V0() > 0) {
                this.f43086s.mo48450d(this.f43085r.s2(this.f43086s));
                if (this.f43086s.length() == 0) {
                    this.f43086s = null;
                }
            }
            if (this.f43075h == -2) {
                sl1 sl1Var4 = this.f43085r;
                int length = sl1Var4 == null ? 0 : sl1Var4.length();
                if (length > 0) {
                    this.f24520B = true;
                    if (this.f43085r.mo48451r() == f24518K) {
                        sl1 sl1Var5 = this.f43085r;
                        int iMo48451r = sl1Var5.mo48451r() - 2;
                        byte[] bArr = u48.f48317a;
                        sl1Var5.I1(iMo48451r, bArr, 0, 2);
                        sl1 sl1Var6 = this.f43085r;
                        sl1Var6.w2(sl1Var6.mo48451r() - 2);
                        zl1.m59572b(this.f43085r, length);
                        if (this.f24522z) {
                            sl1 sl1Var7 = this.f43085r;
                            sl1Var7.I1(sl1Var7.mo48451r() - 2, bArr, 0, 2);
                            sl1 sl1Var8 = this.f43085r;
                            sl1Var8.w2(sl1Var8.mo48451r() - 2);
                            this.f24522z = false;
                        }
                    } else {
                        if (this.f24522z) {
                            if (this.f43084q.length() > 0) {
                                throw new IllegalStateException("EOC");
                            }
                            this.f43084q.u0(u48.f48317a);
                            this.f24522z = false;
                        }
                        zl1.m59575e(this.f43084q, length);
                        this.f43084q.u0(u48.f48317a);
                    }
                    if (this.f43085r.V0() >= 2) {
                        this.f43085r.u0(u48.f48317a);
                    } else {
                        this.f24522z = true;
                    }
                }
                if (this.f24519A && ((sl1Var = this.f43086s) == null || sl1Var.length() == 0)) {
                    if (this.f24522z) {
                        if (this.f43085r != null || this.f43084q.V0() < 2) {
                            sl1 sl1Var9 = this.f43085r;
                            if (sl1Var9 != null && sl1Var9.V0() >= 2) {
                                this.f43085r.u0(u48.f48317a);
                                this.f24522z = false;
                            }
                        } else {
                            this.f43084q.u0(u48.f48317a);
                            this.f24522z = false;
                        }
                    }
                    if (!this.f24522z && this.f24519A) {
                        if (this.f43085r == null) {
                            int iV0 = this.f43084q.V0();
                            byte[] bArr2 = f24510C;
                            if (iV0 >= bArr2.length) {
                                if (!this.f43077j) {
                                    this.f43084q.u0(bArr2);
                                    this.f24520B = true;
                                }
                                this.f24519A = false;
                            } else {
                                sl1 sl1Var10 = this.f43085r;
                                if (sl1Var10 != null) {
                                    int iV02 = sl1Var10.V0();
                                    byte[] bArr3 = f24510C;
                                    if (iV02 >= bArr3.length) {
                                        if (!this.f43077j) {
                                            this.f43085r.u0(bArr3);
                                            this.f24520B = true;
                                        }
                                        this.f24519A = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        sl1 sl1Var11 = this.f43086s;
        if (sl1Var11 == null || sl1Var11.length() != 0) {
            return;
        }
        this.f43086s = null;
    }
}
