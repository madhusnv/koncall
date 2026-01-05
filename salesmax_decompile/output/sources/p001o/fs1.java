package p001o;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpHeaders;
import p001o.wx7;
import p001o.zqe;

/* loaded from: classes6.dex */
public final class fs1 {

    /* renamed from: c */
    public static final C13539a f23999c = new C13539a(null);

    /* renamed from: a */
    public final ule f24000a;

    /* renamed from: b */
    public final zqe f24001b;

    /* renamed from: o.fs1$a */
    public static final class C13539a {
        public C13539a() {
        }

        public /* synthetic */ C13539a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean m27410a(zqe zqeVar, ule uleVar) {
            sq8.m48649h(zqeVar, "response");
            sq8.m48649h(uleVar, "request");
            int iM59739h = zqeVar.m59739h();
            if (iM59739h != 200 && iM59739h != 410 && iM59739h != 414 && iM59739h != 501 && iM59739h != 203 && iM59739h != 204) {
                if (iM59739h == 307) {
                    if (zqe.m59725t(zqeVar, HttpHeaders.EXPIRES, null, 2, null) == null && zqeVar.m59736d().m54892e() == -1 && !zqeVar.m59736d().m54891d() && !zqeVar.m59736d().m54890c()) {
                        return false;
                    }
                } else if (iM59739h != 308 && iM59739h != 404 && iM59739h != 405) {
                    switch (iM59739h) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (zqeVar.m59736d().m54897j() || uleVar.m51731b().m54897j()) ? false : true;
        }
    }

    /* renamed from: o.fs1$b */
    public static final class C13540b {

        /* renamed from: a */
        public final long f24002a;

        /* renamed from: b */
        public final ule f24003b;

        /* renamed from: c */
        public final zqe f24004c;

        /* renamed from: d */
        public Date f24005d;

        /* renamed from: e */
        public String f24006e;

        /* renamed from: f */
        public Date f24007f;

        /* renamed from: g */
        public String f24008g;

        /* renamed from: h */
        public Date f24009h;

        /* renamed from: i */
        public long f24010i;

        /* renamed from: j */
        public long f24011j;

        /* renamed from: k */
        public String f24012k;

        /* renamed from: l */
        public int f24013l;

        public C13540b(long j, ule uleVar, zqe zqeVar) {
            sq8.m48649h(uleVar, "request");
            this.f24002a = j;
            this.f24003b = uleVar;
            this.f24004c = zqeVar;
            this.f24013l = -1;
            if (zqeVar != null) {
                this.f24010i = zqeVar.m59733S();
                this.f24011j = zqeVar.m59731O();
                wx7 wx7VarM59744u = zqeVar.m59744u();
                int size = wx7VarM59744u.size();
                for (int i = 0; i < size; i++) {
                    String strM55329j = wx7VarM59744u.m55329j(i);
                    String strM55333w = wx7VarM59744u.m55333w(i);
                    if (e9g.m24606x(strM55329j, "Date", true)) {
                        this.f24005d = sz4.m49087a(strM55333w);
                        this.f24006e = strM55333w;
                    } else if (e9g.m24606x(strM55329j, HttpHeaders.EXPIRES, true)) {
                        this.f24009h = sz4.m49087a(strM55333w);
                    } else if (e9g.m24606x(strM55329j, HttpHeaders.LAST_MODIFIED, true)) {
                        this.f24007f = sz4.m49087a(strM55333w);
                        this.f24008g = strM55333w;
                    } else if (e9g.m24606x(strM55329j, HttpHeaders.ETAG, true)) {
                        this.f24012k = strM55333w;
                    } else if (e9g.m24606x(strM55329j, HttpHeaders.AGE, true)) {
                        this.f24013l = ggj.m28616E(strM55333w, -1);
                    }
                }
            }
        }

        /* renamed from: a */
        public final long m27411a() {
            Date date = this.f24005d;
            long jMax = date != null ? Math.max(0L, this.f24011j - date.getTime()) : 0L;
            int i = this.f24013l;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            return jMax + Math.max(0L, this.f24011j - this.f24010i) + Math.max(0L, this.f24002a - this.f24011j);
        }

        /* renamed from: b */
        public final fs1 m27412b() {
            fs1 fs1VarM27413c = m27413c();
            return (fs1VarM27413c.m27409b() == null || !this.f24003b.m51731b().m54899l()) ? fs1VarM27413c : new fs1(null, null);
        }

        /* renamed from: c */
        public final fs1 m27413c() {
            String str;
            if (this.f24004c == null) {
                return new fs1(this.f24003b, null);
            }
            if (this.f24003b.m51736g() && this.f24004c.m59742r() == null) {
                return new fs1(this.f24003b, null);
            }
            if (!fs1.f23999c.m27410a(this.f24004c, this.f24003b)) {
                return new fs1(this.f24003b, null);
            }
            wr1 wr1VarM51731b = this.f24003b.m51731b();
            if (wr1VarM51731b.m54896i() || m27415e(this.f24003b)) {
                return new fs1(this.f24003b, null);
            }
            wr1 wr1VarM59736d = this.f24004c.m59736d();
            long jM27411a = m27411a();
            long jM27414d = m27414d();
            if (wr1VarM51731b.m54892e() != -1) {
                jM27414d = Math.min(jM27414d, TimeUnit.SECONDS.toMillis(wr1VarM51731b.m54892e()));
            }
            long millis = 0;
            long millis2 = wr1VarM51731b.m54894g() != -1 ? TimeUnit.SECONDS.toMillis(wr1VarM51731b.m54894g()) : 0L;
            if (!wr1VarM59736d.m54895h() && wr1VarM51731b.m54893f() != -1) {
                millis = TimeUnit.SECONDS.toMillis(wr1VarM51731b.m54893f());
            }
            if (!wr1VarM59736d.m54896i()) {
                long j = millis2 + jM27411a;
                if (j < millis + jM27414d) {
                    zqe.C18696a c18696aM59728H = this.f24004c.m59728H();
                    if (j >= jM27414d) {
                        c18696aM59728H.m59748a(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jM27411a > 86400000 && m27416f()) {
                        c18696aM59728H.m59748a(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new fs1(null, c18696aM59728H.m59750c());
                }
            }
            String str2 = this.f24012k;
            if (str2 != null) {
                str = HttpHeaders.IF_NONE_MATCH;
            } else {
                if (this.f24007f != null) {
                    str2 = this.f24008g;
                } else {
                    if (this.f24005d == null) {
                        return new fs1(this.f24003b, null);
                    }
                    str2 = this.f24006e;
                }
                str = HttpHeaders.IF_MODIFIED_SINCE;
            }
            wx7.C17997a c17997aM55331o = this.f24003b.m51735f().m55331o();
            sq8.m48646e(str2);
            c17997aM55331o.m55338d(str, str2);
            return new fs1(this.f24003b.m51738i().m51758o(c17997aM55331o.m55340f()).m51746b(), this.f24004c);
        }

        /* renamed from: d */
        public final long m27414d() {
            zqe zqeVar = this.f24004c;
            sq8.m48646e(zqeVar);
            if (zqeVar.m59736d().m54892e() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m54892e());
            }
            Date date = this.f24009h;
            if (date != null) {
                Date date2 = this.f24005d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f24011j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f24007f == null || this.f24004c.m59732Q().m51741l().m53883o() != null) {
                return 0L;
            }
            Date date3 = this.f24005d;
            long time2 = date3 != null ? date3.getTime() : this.f24010i;
            Date date4 = this.f24007f;
            sq8.m48646e(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / 10;
            }
            return 0L;
        }

        /* renamed from: e */
        public final boolean m27415e(ule uleVar) {
            return (uleVar.m51734e(HttpHeaders.IF_MODIFIED_SINCE) == null && uleVar.m51734e(HttpHeaders.IF_NONE_MATCH) == null) ? false : true;
        }

        /* renamed from: f */
        public final boolean m27416f() {
            zqe zqeVar = this.f24004c;
            sq8.m48646e(zqeVar);
            return zqeVar.m59736d().m54892e() == -1 && this.f24009h == null;
        }
    }

    public fs1(ule uleVar, zqe zqeVar) {
        this.f24000a = uleVar;
        this.f24001b = zqeVar;
    }

    /* renamed from: a */
    public final zqe m27408a() {
        return this.f24001b;
    }

    /* renamed from: b */
    public final ule m27409b() {
        return this.f24000a;
    }
}
