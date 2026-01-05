package zd;

import al.C0182j;
import b00.AbstractC0517b;
import b00.AbstractC0532q;
import b00.a0;
import b00.c0;
import b00.d0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import nx.C5176n;
import og.md;
import p020v.a1;
import pg.i9;
import pg.x5;
import tx.AbstractC7262v;
import xv.C8482i;
import yx.C8810d;
import zc.C8932i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zd.d */
/* loaded from: classes.dex */
public final class C8940d implements Closeable, Flushable {

    /* renamed from: s */
    public static final C5176n f42926s = new C5176n("[a-z0-9_-]{1,120}");

    /* renamed from: a */
    public final a0 f42927a;

    /* renamed from: b */
    public final long f42928b;

    /* renamed from: c */
    public final a0 f42929c;

    /* renamed from: d */
    public final a0 f42930d;

    /* renamed from: e */
    public final a0 f42931e;

    /* renamed from: f */
    public final LinkedHashMap f42932f;

    /* renamed from: g */
    public final C8810d f42933g;

    /* renamed from: h */
    public long f42934h;

    /* renamed from: j */
    public int f42935j;

    /* renamed from: k */
    public c0 f42936k;

    /* renamed from: l */
    public boolean f42937l;

    /* renamed from: m */
    public boolean f42938m;

    /* renamed from: n */
    public boolean f42939n;

    /* renamed from: p */
    public boolean f42940p;

    /* renamed from: q */
    public boolean f42941q;

    /* renamed from: r */
    public final C8939c f42942r;

    public C8940d(long j6, AbstractC0532q abstractC0532q, a0 a0Var, AbstractC7262v abstractC7262v) {
        this.f42927a = a0Var;
        this.f42928b = j6;
        if (j6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f42929c = a0Var.m1519d("journal");
        this.f42930d = a0Var.m1519d("journal.tmp");
        this.f42931e = a0Var.m1519d("journal.bkp");
        this.f42932f = new LinkedHashMap(0, 0.75f, true);
        this.f42933g = tx.c0.m13479b(x5.m11928d(tx.c0.m13481d(), abstractC7262v.E0(1)));
        this.f42942r = new C8939c(abstractC0532q);
    }

    /* renamed from: S */
    public static void m16410S(String str) {
        if (!f42926s.m10087c(str)) {
            throw new IllegalArgumentException(a1.m14328h('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x011b A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:25:0x0056, B:29:0x0073, B:31:0x0083, B:33:0x008a, B:26:0x005c, B:28:0x006c, B:37:0x00aa, B:39:0x00b1, B:42:0x00b6, B:44:0x00c7, B:47:0x00cc, B:52:0x0107, B:54:0x0112, B:58:0x011b, B:48:0x00e4, B:50:0x00f9, B:51:0x0104, B:36:0x009a, B:61:0x0120, B:62:0x0127), top: B:65:0x0001 }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m16411h(zd.C8940d r9, al.C0182j r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.C8940d.m16411h(zd.d, al.j, boolean):void");
    }

    /* renamed from: A */
    public final void m16412A() {
        Iterator it = this.f42932f.values().iterator();
        long j6 = 0;
        while (it.hasNext()) {
            C8937a c8937a = (C8937a) it.next();
            int i10 = 0;
            if (c8937a.f42919g == null) {
                while (i10 < 2) {
                    j6 += c8937a.f42914b[i10];
                    i10++;
                }
            } else {
                c8937a.f42919g = null;
                while (i10 < 2) {
                    a0 a0Var = (a0) c8937a.f42915c.get(i10);
                    C8939c c8939c = this.f42942r;
                    c8939c.m1622w(a0Var);
                    c8939c.m1622w((a0) c8937a.f42916d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f42934h = j6;
    }

    /* renamed from: H */
    public final void m16413H() throws Throwable {
        d0 d0VarM1524c = AbstractC0517b.m1524c(this.f42942r.mo1604S(this.f42929c));
        try {
            String strMo1541C = d0VarM1524c.mo1541C(Long.MAX_VALUE);
            String strMo1541C2 = d0VarM1524c.mo1541C(Long.MAX_VALUE);
            String strMo1541C3 = d0VarM1524c.mo1541C(Long.MAX_VALUE);
            String strMo1541C4 = d0VarM1524c.mo1541C(Long.MAX_VALUE);
            String strMo1541C5 = d0VarM1524c.mo1541C(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strMo1541C) || !"1".equals(strMo1541C2) || !AbstractC4154l.m8918a(String.valueOf(1), strMo1541C3) || !AbstractC4154l.m8918a(String.valueOf(2), strMo1541C4) || strMo1541C5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo1541C + ", " + strMo1541C2 + ", " + strMo1541C3 + ", " + strMo1541C4 + ", " + strMo1541C5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    m16414J(d0VarM1524c.mo1541C(Long.MAX_VALUE));
                    i10++;
                } catch (EOFException unused) {
                    this.f42935j = i10 - this.f42932f.size();
                    if (d0VarM1524c.mo1545e()) {
                        this.f42936k = m16422z();
                    } else {
                        m16417U();
                    }
                    try {
                        d0VarM1524c.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                d0VarM1524c.close();
            } catch (Throwable th4) {
                md.m10764a(th, th4);
            }
        }
    }

    /* renamed from: J */
    public final void m16414J(String str) throws IOException {
        String strSubstring;
        int iM10098I = AbstractC5178p.m10098I(str, ' ', 0, 6);
        if (iM10098I == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iM10098I + 1;
        int iM10098I2 = AbstractC5178p.m10098I(str, ' ', i10, 4);
        LinkedHashMap linkedHashMap = this.f42932f;
        if (iM10098I2 == -1) {
            strSubstring = str.substring(i10);
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
            if (iM10098I == 6 && AbstractC5185w.m10138t(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iM10098I2);
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
        }
        Object c8937a = linkedHashMap.get(strSubstring);
        if (c8937a == null) {
            c8937a = new C8937a(this, strSubstring);
            linkedHashMap.put(strSubstring, c8937a);
        }
        C8937a c8937a2 = (C8937a) c8937a;
        if (iM10098I2 == -1 || iM10098I != 5 || !AbstractC5185w.m10138t(str, "CLEAN", false)) {
            if (iM10098I2 == -1 && iM10098I == 5 && AbstractC5185w.m10138t(str, "DIRTY", false)) {
                c8937a2.f42919g = new C0182j(this, c8937a2);
                return;
            } else {
                if (iM10098I2 != -1 || iM10098I != 4 || !AbstractC5185w.m10138t(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iM10098I2 + 1);
        AbstractC4154l.m8922e(strSubstring2, "substring(...)");
        List listM10111V = AbstractC5178p.m10111V(strSubstring2, new char[]{' '}, 0, 6);
        c8937a2.f42917e = true;
        c8937a2.f42919g = null;
        if (listM10111V.size() != 2) {
            throw new IOException("unexpected journal line: " + listM10111V);
        }
        try {
            int size = listM10111V.size();
            for (int i11 = 0; i11 < size; i11++) {
                c8937a2.f42914b[i11] = Long.parseLong((String) listM10111V.get(i11));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listM10111V);
        }
    }

    /* renamed from: P */
    public final void m16415P(C8937a c8937a) {
        c0 c0Var;
        int i10 = c8937a.f42920h;
        String str = c8937a.f42913a;
        if (i10 > 0 && (c0Var = this.f42936k) != null) {
            c0Var.mo1534N("DIRTY");
            c0Var.writeByte(32);
            c0Var.mo1534N(str);
            c0Var.writeByte(10);
            c0Var.flush();
        }
        if (c8937a.f42920h > 0 || c8937a.f42919g != null) {
            c8937a.f42918f = true;
            return;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            this.f42942r.m1622w((a0) c8937a.f42915c.get(i11));
            long j6 = this.f42934h;
            long[] jArr = c8937a.f42914b;
            this.f42934h = j6 - jArr[i11];
            jArr[i11] = 0;
        }
        this.f42935j++;
        c0 c0Var2 = this.f42936k;
        if (c0Var2 != null) {
            c0Var2.mo1534N("REMOVE");
            c0Var2.writeByte(32);
            c0Var2.mo1534N(str);
            c0Var2.writeByte(10);
        }
        this.f42932f.remove(str);
        if (this.f42935j >= 2000) {
            m16421w();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        m16415P(r1);
     */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16416R() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f42934h
            long r2 = r4.f42928b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f42932f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            zd.a r1 = (zd.C8937a) r1
            boolean r2 = r1.f42918f
            if (r2 != 0) goto L12
            r4.m16415P(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f42940p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.C8940d.m16416R():void");
    }

    /* renamed from: U */
    public final synchronized void m16417U() {
        Throwable th2;
        try {
            c0 c0Var = this.f42936k;
            if (c0Var != null) {
                c0Var.close();
            }
            c0 c0VarM1523b = AbstractC0517b.m1523b(this.f42942r.mo1603R(this.f42930d));
            try {
                c0VarM1523b.mo1534N("libcore.io.DiskLruCache");
                c0VarM1523b.writeByte(10);
                c0VarM1523b.mo1534N("1");
                c0VarM1523b.writeByte(10);
                c0VarM1523b.m1540j(1);
                c0VarM1523b.writeByte(10);
                c0VarM1523b.m1540j(2);
                c0VarM1523b.writeByte(10);
                c0VarM1523b.writeByte(10);
                for (C8937a c8937a : this.f42932f.values()) {
                    if (c8937a.f42919g != null) {
                        c0VarM1523b.mo1534N("DIRTY");
                        c0VarM1523b.writeByte(32);
                        c0VarM1523b.mo1534N(c8937a.f42913a);
                        c0VarM1523b.writeByte(10);
                    } else {
                        c0VarM1523b.mo1534N("CLEAN");
                        c0VarM1523b.writeByte(32);
                        c0VarM1523b.mo1534N(c8937a.f42913a);
                        for (long j6 : c8937a.f42914b) {
                            c0VarM1523b.writeByte(32);
                            c0VarM1523b.m1540j(j6);
                        }
                        c0VarM1523b.writeByte(10);
                    }
                }
                try {
                    c0VarM1523b.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    c0VarM1523b.close();
                } catch (Throwable th5) {
                    md.m10764a(th4, th5);
                }
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            if (this.f42942r.m1623z(this.f42929c)) {
                this.f42942r.mo1606j(this.f42929c, this.f42931e);
                this.f42942r.mo1606j(this.f42930d, this.f42929c);
                this.f42942r.m1622w(this.f42931e);
            } else {
                this.f42942r.mo1606j(this.f42930d, this.f42929c);
            }
            this.f42936k = m16422z();
            this.f42935j = 0;
            this.f42937l = false;
            this.f42941q = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f42938m && !this.f42939n) {
                for (C8937a c8937a : (C8937a[]) this.f42932f.values().toArray(new C8937a[0])) {
                    C0182j c0182j = c8937a.f42919g;
                    if (c0182j != null) {
                        C8937a c8937a2 = (C8937a) c0182j.f555b;
                        if (AbstractC4154l.m8918a(c8937a2.f42919g, c0182j)) {
                            c8937a2.f42918f = true;
                        }
                    }
                }
                m16416R();
                tx.c0.m13485h(this.f42933g, null);
                c0 c0Var = this.f42936k;
                AbstractC4154l.m8920c(c0Var);
                c0Var.close();
                this.f42936k = null;
                this.f42939n = true;
                return;
            }
            this.f42939n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f42938m) {
            if (this.f42939n) {
                throw new IllegalStateException("cache is closed");
            }
            m16416R();
            c0 c0Var = this.f42936k;
            AbstractC4154l.m8920c(c0Var);
            c0Var.flush();
        }
    }

    /* renamed from: j */
    public final synchronized C0182j m16418j(String str) {
        if (this.f42939n) {
            throw new IllegalStateException("cache is closed");
        }
        m16410S(str);
        m16420u();
        C8937a c8937a = (C8937a) this.f42932f.get(str);
        if ((c8937a != null ? c8937a.f42919g : null) != null) {
            return null;
        }
        if (c8937a != null && c8937a.f42920h != 0) {
            return null;
        }
        if (!this.f42940p && !this.f42941q) {
            c0 c0Var = this.f42936k;
            AbstractC4154l.m8920c(c0Var);
            c0Var.mo1534N("DIRTY");
            c0Var.writeByte(32);
            c0Var.mo1534N(str);
            c0Var.writeByte(10);
            c0Var.flush();
            if (this.f42937l) {
                return null;
            }
            if (c8937a == null) {
                c8937a = new C8937a(this, str);
                this.f42932f.put(str, c8937a);
            }
            C0182j c0182j = new C0182j(this, c8937a);
            c8937a.f42919g = c0182j;
            return c0182j;
        }
        m16421w();
        return null;
    }

    /* renamed from: n */
    public final synchronized C8938b m16419n(String str) {
        C8938b c8938bM16409a;
        if (this.f42939n) {
            throw new IllegalStateException("cache is closed");
        }
        m16410S(str);
        m16420u();
        C8937a c8937a = (C8937a) this.f42932f.get(str);
        if (c8937a != null && (c8938bM16409a = c8937a.m16409a()) != null) {
            boolean z6 = true;
            this.f42935j++;
            c0 c0Var = this.f42936k;
            AbstractC4154l.m8920c(c0Var);
            c0Var.mo1534N("READ");
            c0Var.writeByte(32);
            c0Var.mo1534N(str);
            c0Var.writeByte(10);
            if (this.f42935j < 2000) {
                z6 = false;
            }
            if (z6) {
                m16421w();
            }
            return c8938bM16409a;
        }
        return null;
    }

    /* renamed from: u */
    public final synchronized void m16420u() {
        try {
            if (this.f42938m) {
                return;
            }
            this.f42942r.m1622w(this.f42930d);
            if (this.f42942r.m1623z(this.f42931e)) {
                if (this.f42942r.m1623z(this.f42929c)) {
                    this.f42942r.m1622w(this.f42931e);
                } else {
                    this.f42942r.mo1606j(this.f42931e, this.f42929c);
                }
            }
            if (this.f42942r.m1623z(this.f42929c)) {
                try {
                    m16413H();
                    m16412A();
                    this.f42938m = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        i9.m11699a(this.f42942r, this.f42927a);
                        this.f42939n = false;
                    } catch (Throwable th2) {
                        this.f42939n = false;
                        throw th2;
                    }
                }
            }
            m16417U();
            this.f42938m = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* renamed from: w */
    public final void m16421w() {
        tx.c0.m13502y(this.f42933g, null, null, new C8482i(this, null, 1), 3);
    }

    /* renamed from: z */
    public final c0 m16422z() {
        C8939c c8939c = this.f42942r;
        c8939c.getClass();
        a0 file = this.f42929c;
        AbstractC4154l.m8923f(file, "file");
        return AbstractC0517b.m1523b(new C8941e(c8939c.mo1605h(file), new C8932i(1, this)));
    }
}
