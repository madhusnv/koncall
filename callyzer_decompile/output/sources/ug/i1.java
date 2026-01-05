package ug;

import android.text.TextUtils;
import c9.C0914i;
import com.google.android.gms.internal.measurement.v5;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzmr;
import e1.C1903e;
import ee.C2037e;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k0.CallableC3892b;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i1 extends c4 implements InterfaceC7435f {

    /* renamed from: d */
    public final C1903e f35510d;

    /* renamed from: e */
    public final C1903e f35511e;

    /* renamed from: f */
    public final C1903e f35512f;

    /* renamed from: g */
    public final C1903e f35513g;

    /* renamed from: h */
    public final C1903e f35514h;

    /* renamed from: j */
    public final C1903e f35515j;

    /* renamed from: k */
    public final C2037e f35516k;

    /* renamed from: l */
    public final l4.d0 f35517l;

    /* renamed from: m */
    public final C1903e f35518m;

    /* renamed from: n */
    public final C1903e f35519n;

    /* renamed from: p */
    public final C1903e f35520p;

    public i1(h4 h4Var) {
        super(h4Var);
        this.f35510d = new C1903e(0);
        this.f35511e = new C1903e(0);
        this.f35512f = new C1903e(0);
        this.f35513g = new C1903e(0);
        this.f35514h = new C1903e(0);
        this.f35518m = new C1903e(0);
        this.f35519n = new C1903e(0);
        this.f35520p = new C1903e(0);
        this.f35515j = new C1903e(0);
        this.f35516k = new C2037e(this);
        this.f35517l = new l4.d0(24, this);
    }

    /* renamed from: W */
    public static final C1903e m13985W(com.google.android.gms.internal.measurement.g2 g2Var) {
        C1903e c1903e = new C1903e(0);
        for (com.google.android.gms.internal.measurement.k2 k2Var : g2Var.m3284t()) {
            c1903e.put(k2Var.m3431p(), k2Var.m3432q());
        }
        return c1903e;
    }

    /* renamed from: X */
    public static final x1 m13986X(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return x1.AD_STORAGE;
        }
        if (i11 == 2) {
            return x1.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return x1.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return x1.AD_PERSONALIZATION;
    }

    /* renamed from: Q */
    public final v1 m13987Q(String str, x1 x1Var) {
        mo325M();
        m13989S(str);
        com.google.android.gms.internal.measurement.b2 b2VarH0 = h0(str);
        if (b2VarH0 == null) {
            return v1.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.y1 y1Var : b2VarH0.m3140u()) {
            if (m13986X(y1Var.m3776p()) == x1Var) {
                int iM3777q = y1Var.m3777q() - 1;
                return iM3777q != 1 ? iM3777q != 2 ? v1.UNINITIALIZED : v1.DENIED : v1.GRANTED;
            }
        }
        return v1.UNINITIALIZED;
    }

    /* renamed from: R */
    public final boolean m13988R(String str) {
        mo325M();
        m13989S(str);
        com.google.android.gms.internal.measurement.b2 b2VarH0 = h0(str);
        if (b2VarH0 == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.y1 y1Var : b2VarH0.m3135p()) {
            if (y1Var.m3776p() == 3 && y1Var.m3778r() == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: S */
    public final void m13989S(String str) {
        m13858N();
        mo325M();
        AbstractC6840z.m13033d(str);
        C1903e c1903e = this.f35514h;
        if (c1903e.get(str) == null) {
            C7443n c7443n = this.f35959b.f35488c;
            h4.m13944U(c7443n);
            C7439j c7439jS0 = c7443n.S0(str);
            C1903e c1903e2 = this.f35520p;
            C1903e c1903e3 = this.f35519n;
            C1903e c1903e4 = this.f35518m;
            C1903e c1903e5 = this.f35510d;
            if (c7439jS0 != null) {
                com.google.android.gms.internal.measurement.f2 f2Var = (com.google.android.gms.internal.measurement.f2) m13992V(str, (byte[]) c7439jS0.f35537b).m3340i();
                m13990T(str, f2Var);
                c1903e5.put(str, m13985W((com.google.android.gms.internal.measurement.g2) f2Var.m3306e()));
                c1903e.put(str, (com.google.android.gms.internal.measurement.g2) f2Var.m3306e());
                m13991U(str, (com.google.android.gms.internal.measurement.g2) f2Var.m3306e());
                c1903e4.put(str, ((com.google.android.gms.internal.measurement.g2) f2Var.f6231b).m3272A());
                c1903e3.put(str, (String) c7439jS0.f35538c);
                c1903e2.put(str, (String) c7439jS0.f35539d);
                return;
            }
            c1903e5.put(str, null);
            this.f35512f.put(str, null);
            this.f35511e.put(str, null);
            this.f35513g.put(str, null);
            c1903e.put(str, null);
            c1903e4.put(str, null);
            c1903e3.put(str, null);
            c1903e2.put(str, null);
            this.f35515j.put(str, null);
        }
    }

    /* renamed from: T */
    public final void m13990T(String str, com.google.android.gms.internal.measurement.f2 f2Var) {
        n1 n1Var = (n1) this.f482a;
        HashSet hashSet = new HashSet();
        C1903e c1903e = new C1903e(0);
        C1903e c1903e2 = new C1903e(0);
        C1903e c1903e3 = new C1903e(0);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.g2) f2Var.f6231b).m3290z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.c2) it.next()).m3186p());
        }
        for (int i10 = 0; i10 < ((com.google.android.gms.internal.measurement.g2) f2Var.f6231b).m3285u(); i10++) {
            com.google.android.gms.internal.measurement.d2 d2Var = (com.google.android.gms.internal.measurement.d2) ((com.google.android.gms.internal.measurement.g2) f2Var.f6231b).m3286v(i10).m3340i();
            if (d2Var.m3226i().isEmpty()) {
                v0 v0Var = n1Var.f35669f;
                n1.m14085m(v0Var);
                v0Var.f35865j.m14140a("EventConfig contained null event name");
            } else {
                String strM3226i = d2Var.m3226i();
                String strM14269g = z1.m14269g(z1.f36025a, d2Var.m3226i(), z1.f36027c);
                if (!TextUtils.isEmpty(strM14269g)) {
                    d2Var.m3303b();
                    ((com.google.android.gms.internal.measurement.e2) d2Var.f6231b).m3240w(strM14269g);
                    f2Var.m3303b();
                    ((com.google.android.gms.internal.measurement.g2) f2Var.f6231b).m3277H(i10, (com.google.android.gms.internal.measurement.e2) d2Var.m3306e());
                }
                if (((com.google.android.gms.internal.measurement.e2) d2Var.f6231b).m3234q() && ((com.google.android.gms.internal.measurement.e2) d2Var.f6231b).m3235r()) {
                    c1903e.put(strM3226i, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.e2) d2Var.f6231b).m3236s() && ((com.google.android.gms.internal.measurement.e2) d2Var.f6231b).m3237t()) {
                    c1903e2.put(d2Var.m3226i(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.e2) d2Var.f6231b).m3238u()) {
                    if (((com.google.android.gms.internal.measurement.e2) d2Var.f6231b).m3239v() < 2 || ((com.google.android.gms.internal.measurement.e2) d2Var.f6231b).m3239v() > 65535) {
                        v0 v0Var2 = n1Var.f35669f;
                        n1.m14085m(v0Var2);
                        v0Var2.f35865j.m14142c("Invalid sampling rate. Event name, sample rate", d2Var.m3226i(), Integer.valueOf(((com.google.android.gms.internal.measurement.e2) d2Var.f6231b).m3239v()));
                    } else {
                        c1903e3.put(d2Var.m3226i(), Integer.valueOf(((com.google.android.gms.internal.measurement.e2) d2Var.f6231b).m3239v()));
                    }
                }
            }
        }
        this.f35511e.put(str, hashSet);
        this.f35512f.put(str, c1903e);
        this.f35513g.put(str, c1903e2);
        this.f35515j.put(str, c1903e3);
    }

    /* renamed from: U */
    public final void m13991U(String str, com.google.android.gms.internal.measurement.g2 g2Var) {
        n1 n1Var = (n1) this.f482a;
        int iM3289y = g2Var.m3289y();
        C2037e c2037e = this.f35516k;
        if (iM3289y == 0) {
            c2037e.m5625m(str);
            return;
        }
        v0 v0Var = n1Var.f35669f;
        n1.m14085m(v0Var);
        v0Var.f35870p.m14141b(Integer.valueOf(g2Var.m3289y()), "EES programs found");
        com.google.android.gms.internal.measurement.x3 x3Var = (com.google.android.gms.internal.measurement.x3) g2Var.m3288x().get(0);
        try {
            com.google.android.gms.internal.measurement.e0 e0Var = new com.google.android.gms.internal.measurement.e0();
            C0914i c0914i = e0Var.f6120a;
            ((HashMap) ((v5) c0914i.f5588d).f6423a).put("internal.remoteConfig", new h1(this, str, 2));
            ((HashMap) ((v5) c0914i.f5588d).f6423a).put("internal.appMetadata", new h1(this, str, 0));
            ((HashMap) ((v5) c0914i.f5588d).f6423a).put("internal.logger", new CallableC3892b(5, this));
            e0Var.m3232b(x3Var);
            c2037e.m5624l(str, e0Var);
            n1.m14085m(v0Var);
            t0 t0Var = v0Var.f35870p;
            t0Var.m14142c("EES program loaded for appId, activities", str, Integer.valueOf(x3Var.m3772q().m3726q()));
            for (com.google.android.gms.internal.measurement.w3 w3Var : x3Var.m3772q().m3725p()) {
                n1.m14085m(v0Var);
                t0Var.m14141b(w3Var.m3743p(), "EES program activity");
            }
        } catch (zzd unused) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14141b(str, "Failed to load EES program. appId");
        }
    }

    /* renamed from: V */
    public final com.google.android.gms.internal.measurement.g2 m13992V(String str, byte[] bArr) {
        n1 n1Var = (n1) this.f482a;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.g2.m3271G();
        }
        try {
            com.google.android.gms.internal.measurement.g2 g2Var = (com.google.android.gms.internal.measurement.g2) ((com.google.android.gms.internal.measurement.f2) y0.z0(com.google.android.gms.internal.measurement.g2.m3270F(), bArr)).m3306e();
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35870p.m14142c("Parsed config. version, gmp_app_id", g2Var.m3280p() ? Long.valueOf(g2Var.m3281q()) : null, g2Var.m3282r() ? g2Var.m3283s() : null);
            return g2Var;
        } catch (zzmr e2) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35865j.m14142c("Unable to merge remote config. appId", v0.m14157U(str), e2);
            return com.google.android.gms.internal.measurement.g2.m3271G();
        } catch (RuntimeException e10) {
            v0 v0Var3 = n1Var.f35669f;
            n1.m14085m(v0Var3);
            v0Var3.f35865j.m14142c("Unable to merge remote config. appId", v0.m14157U(str), e10);
            return com.google.android.gms.internal.measurement.g2.m3271G();
        }
    }

    /* renamed from: Y */
    public final com.google.android.gms.internal.measurement.g2 m13993Y(String str) {
        m13858N();
        mo325M();
        AbstractC6840z.m13033d(str);
        m13989S(str);
        return (com.google.android.gms.internal.measurement.g2) this.f35514h.get(str);
    }

    /* renamed from: Z */
    public final String m13994Z(String str) {
        mo325M();
        m13989S(str);
        return (String) this.f35518m.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03fb, code lost:
    
        r3 = java.lang.Integer.valueOf(r6.m3733q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0404, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0405, code lost:
    
        r5.put(r0, r3);
        r28 = r0;
        r5.put("property_name", r6.m3734r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0417, code lost:
    
        if (r6.m3738v() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0419, code lost:
    
        r3 = java.lang.Boolean.valueOf(r6.m3739w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0422, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0423, code lost:
    
        r5.put("session_scoped", r3);
        r5.put("data", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0435, code lost:
    
        if (r9.B0().insertWithOnConflict("property_filters", null, r5, 5) != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0437, code lost:
    
        r0 = r14.f35669f;
        ug.n1.m14085m(r0);
        r0.f35862f.m14141b(ug.v0.m14157U(r30), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0448, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x044a, code lost:
    
        r5 = r23;
        r3 = r26;
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0452, code lost:
    
        r1 = r14.f35669f;
        ug.n1.m14085m(r1);
        r1.f35862f.m14142c("Error storing property filter. appId", ug.v0.m14157U(r30), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0462, code lost:
    
        r9.m13858N();
        r9.mo325M();
        sf.AbstractC6840z.m13033d(r30);
        r0 = r9.B0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0485, code lost:
    
        r1 = r24;
        r3 = r25;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0264, code lost:
    
        r0 = r5.m3502r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0270, code lost:
    
        if (r0.hasNext() == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x027c, code lost:
    
        if (((com.google.android.gms.internal.measurement.w1) r0.next()).m3732p() != false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027e, code lost:
    
        r0 = r14.f35669f;
        ug.n1.m14085m(r0);
        r0.f35865j.m14142c("Property filter with no ID. Audience definition ignored. appId, audienceId", ug.v0.m14157U(r30), java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0293, code lost:
    
        r0 = r5.m3505u().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029b, code lost:
    
        r8 = r0.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029f, code lost:
    
        r23 = r0;
        r0 = "filter_id";
        r24 = r1;
        r25 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02b1, code lost:
    
        if (r8 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02b3, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.p1) r23.next();
        r9.m13858N();
        r9.mo325M();
        sf.AbstractC6840z.m13033d(r30);
        sf.AbstractC6840z.m13036g(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02cd, code lost:
    
        if (r8.m3544r().isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02cf, code lost:
    
        r0 = r14.f35669f;
        ug.n1.m14085m(r0);
        r0 = r0.f35865j;
        r3 = ug.v0.m14157U(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02e4, code lost:
    
        if (r8.m3542p() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02e6, code lost:
    
        r5 = java.lang.Integer.valueOf(r8.m3543q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02f4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02f5, code lost:
    
        r0.m14143d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0300, code lost:
    
        r26 = r5;
        r5 = r8.m3669a();
        r27 = r6;
        r6 = new android.content.ContentValues();
        r6.put("app_id", r30);
        r6.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x031b, code lost:
    
        if (r8.m3542p() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x031d, code lost:
    
        r1 = java.lang.Integer.valueOf(r8.m3543q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0326, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0327, code lost:
    
        r6.put("filter_id", r1);
        r6.put("event_name", r8.m3544r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0337, code lost:
    
        if (r8.m3552z() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0339, code lost:
    
        r0 = java.lang.Boolean.valueOf(r8.m3539A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0342, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0343, code lost:
    
        r6.put("session_scoped", r0);
        r6.put("data", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0355, code lost:
    
        if (r9.B0().insertWithOnConflict("event_filters", null, r6, 5) != (-1)) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0357, code lost:
    
        r0 = r14.f35669f;
        ug.n1.m14085m(r0);
        r0.f35862f.m14141b(ug.v0.m14157U(r30), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0367, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0373, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0374, code lost:
    
        r1 = r14.f35669f;
        ug.n1.m14085m(r1);
        r1.f35862f.m14142c("Error storing event filter. appId", ug.v0.m14157U(r30), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0386, code lost:
    
        r27 = r6;
        r5 = r5.m3502r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0396, code lost:
    
        if (r5.hasNext() == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0398, code lost:
    
        r6 = (com.google.android.gms.internal.measurement.w1) r5.next();
        r9.m13858N();
        r9.mo325M();
        sf.AbstractC6840z.m13033d(r30);
        sf.AbstractC6840z.m13036g(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x03b2, code lost:
    
        if (r6.m3734r().isEmpty() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03b4, code lost:
    
        r0 = r14.f35669f;
        ug.n1.m14085m(r0);
        r0 = r0.f35865j;
        r3 = ug.v0.m14157U(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03c9, code lost:
    
        if (r6.m3732p() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03cb, code lost:
    
        r5 = java.lang.Integer.valueOf(r6.m3733q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03d4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03d5, code lost:
    
        r0.m14143d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03de, code lost:
    
        r8 = r6.m3669a();
        r23 = r5;
        r5 = new android.content.ContentValues();
        r5.put(r3, r30);
        r26 = r3;
        r5.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03f9, code lost:
    
        if (r6.m3732p() == false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05f2 A[Catch: SQLiteException -> 0x0603, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0603, blocks: (B:153:0x05db, B:155:0x05f2), top: B:169:0x05db }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(java.lang.String r30, java.lang.String r31, java.lang.String r32, byte[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.i1.a0(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final boolean b0(String str, String str2) {
        Boolean bool;
        mo325M();
        m13989S(str);
        if ("1".equals(mo396e(str, "measurement.upload.blacklist_internal")) && l4.l0(str2)) {
            return true;
        }
        if ("1".equals(mo396e(str, "measurement.upload.blacklist_public")) && l4.L0(str2)) {
            return true;
        }
        Map map = (Map) this.f35512f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean c0(String str, String str2) {
        Boolean bool;
        mo325M();
        m13989S(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f35513g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int d0(String str, String str2) {
        Integer num;
        mo325M();
        m13989S(str);
        Map map = (Map) this.f35515j.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // ug.InterfaceC7435f
    /* renamed from: e */
    public final String mo396e(String str, String str2) {
        mo325M();
        m13989S(str);
        Map map = (Map) this.f35510d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final boolean e0(String str) {
        mo325M();
        m13989S(str);
        C1903e c1903e = this.f35511e;
        if (c1903e.get(str) != null) {
            return ((Set) c1903e.get(str)).contains("os_version") || ((Set) c1903e.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean f0(String str) {
        mo325M();
        m13989S(str);
        C1903e c1903e = this.f35511e;
        return c1903e.get(str) != null && ((Set) c1903e.get(str)).contains("app_instance_id");
    }

    public final boolean g0(String str, x1 x1Var) {
        mo325M();
        m13989S(str);
        com.google.android.gms.internal.measurement.b2 b2VarH0 = h0(str);
        if (b2VarH0 == null) {
            return false;
        }
        Iterator it = b2VarH0.m3135p().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.y1 y1Var = (com.google.android.gms.internal.measurement.y1) it.next();
            if (x1Var == m13986X(y1Var.m3776p())) {
                if (y1Var.m3777q() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.b2 h0(String str) {
        mo325M();
        m13989S(str);
        com.google.android.gms.internal.measurement.g2 g2VarM13993Y = m13993Y(str);
        if (g2VarM13993Y == null || !g2VarM13993Y.m3273B()) {
            return null;
        }
        return g2VarM13993Y.m3274C();
    }

    @Override // ug.c4
    /* renamed from: P */
    public final void mo13847P() {
    }
}
