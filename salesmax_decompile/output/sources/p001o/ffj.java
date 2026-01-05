package p001o;

import com.google.android.gms.cast.MediaStatus;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.wzc;

/* loaded from: classes6.dex */
public abstract class ffj {

    /* renamed from: o.ffj$a */
    public static final class C13418a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return uk3.m51674d(((dfj) obj).m22990b(), ((dfj) obj2).m22990b());
        }
    }

    /* renamed from: o.ffj$b */
    public static final class C13419b extends kf9 implements nl7 {

        /* renamed from: a */
        public final /* synthetic */ dge f23242a;

        /* renamed from: b */
        public final /* synthetic */ long f23243b;

        /* renamed from: c */
        public final /* synthetic */ fge f23244c;

        /* renamed from: d */
        public final /* synthetic */ im1 f23245d;

        /* renamed from: e */
        public final /* synthetic */ fge f23246e;

        /* renamed from: f */
        public final /* synthetic */ fge f23247f;

        /* renamed from: g */
        public final /* synthetic */ gge f23248g;

        /* renamed from: h */
        public final /* synthetic */ gge f23249h;

        /* renamed from: q */
        public final /* synthetic */ gge f23250q;

        /* renamed from: o.ffj$b$a */
        public static final class a extends kf9 implements nl7 {

            /* renamed from: a */
            public final /* synthetic */ gge f23251a;

            /* renamed from: b */
            public final /* synthetic */ im1 f23252b;

            /* renamed from: c */
            public final /* synthetic */ gge f23253c;

            /* renamed from: d */
            public final /* synthetic */ gge f23254d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(gge ggeVar, im1 im1Var, gge ggeVar2, gge ggeVar3) {
                super(2);
                this.f23251a = ggeVar;
                this.f23252b = im1Var;
                this.f23253c = ggeVar2;
                this.f23254d = ggeVar3;
            }

            /* renamed from: a */
            public final void m26593a(int i, long j) throws IOException {
                if (i == 1) {
                    gge ggeVar = this.f23251a;
                    if (ggeVar.f25106a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (j != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    ggeVar.f25106a = Long.valueOf(this.f23252b.c1());
                    this.f23253c.f25106a = Long.valueOf(this.f23252b.c1());
                    this.f23254d.f25106a = Long.valueOf(this.f23252b.c1());
                }
            }

            @Override // p001o.nl7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
                m26593a(((Number) obj).intValue(), ((Number) obj2).longValue());
                return y3i.f54824a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13419b(dge dgeVar, long j, fge fgeVar, im1 im1Var, fge fgeVar2, fge fgeVar3, gge ggeVar, gge ggeVar2, gge ggeVar3) {
            super(2);
            this.f23242a = dgeVar;
            this.f23243b = j;
            this.f23244c = fgeVar;
            this.f23245d = im1Var;
            this.f23246e = fgeVar2;
            this.f23247f = fgeVar3;
            this.f23248g = ggeVar;
            this.f23249h = ggeVar2;
            this.f23250q = ggeVar3;
        }

        /* renamed from: a */
        public final void m26592a(int i, long j) throws IOException {
            if (i != 1) {
                if (i != 10) {
                    return;
                }
                if (j < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                this.f23245d.skip(4L);
                im1 im1Var = this.f23245d;
                ffj.m26588g(im1Var, (int) (j - 4), new a(this.f23248g, im1Var, this.f23249h, this.f23250q));
                return;
            }
            dge dgeVar = this.f23242a;
            if (dgeVar.f19803a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            dgeVar.f19803a = true;
            if (j < this.f23243b) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            fge fgeVar = this.f23244c;
            long jC1 = fgeVar.f23302a;
            if (jC1 == 4294967295L) {
                jC1 = this.f23245d.c1();
            }
            fgeVar.f23302a = jC1;
            fge fgeVar2 = this.f23246e;
            fgeVar2.f23302a = fgeVar2.f23302a == 4294967295L ? this.f23245d.c1() : 0L;
            fge fgeVar3 = this.f23247f;
            fgeVar3.f23302a = fgeVar3.f23302a == 4294967295L ? this.f23245d.c1() : 0L;
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            m26592a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return y3i.f54824a;
        }
    }

    /* renamed from: o.ffj$c */
    public static final class C13420c extends kf9 implements nl7 {

        /* renamed from: a */
        public final /* synthetic */ im1 f23255a;

        /* renamed from: b */
        public final /* synthetic */ gge f23256b;

        /* renamed from: c */
        public final /* synthetic */ gge f23257c;

        /* renamed from: d */
        public final /* synthetic */ gge f23258d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13420c(im1 im1Var, gge ggeVar, gge ggeVar2, gge ggeVar3) {
            super(2);
            this.f23255a = im1Var;
            this.f23256b = ggeVar;
            this.f23257c = ggeVar2;
            this.f23258d = ggeVar3;
        }

        /* renamed from: a */
        public final void m26594a(int i, long j) throws IOException {
            if (i == 21589) {
                if (j < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                int i2 = this.f23255a.readByte() & 255;
                boolean z = (i2 & 1) == 1;
                boolean z2 = (i2 & 2) == 2;
                boolean z3 = (i2 & 4) == 4;
                im1 im1Var = this.f23255a;
                long j2 = z ? 5L : 1L;
                if (z2) {
                    j2 += 4;
                }
                if (z3) {
                    j2 += 4;
                }
                if (j < j2) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z) {
                    this.f23256b.f25106a = Integer.valueOf(im1Var.C2());
                }
                if (z2) {
                    this.f23257c.f25106a = Integer.valueOf(this.f23255a.C2());
                }
                if (z3) {
                    this.f23258d.f25106a = Integer.valueOf(this.f23255a.C2());
                }
            }
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            m26594a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final Map m26583b(List list) {
        wzc wzcVarM55482d = wzc.C18014a.m55482d(wzc.f52936b, "/", false, 1, null);
        Map mapM32685l = isa.m32685l(vyh.m53620a(wzcVarM55482d, new dfj(wzcVarM55482d, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        Iterator it = kh3.I0(list, new C13418a()).iterator();
        while (it.hasNext()) {
            dfj dfjVar = (dfj) it.next();
            if (((dfj) mapM32685l.put(dfjVar.m22990b(), dfjVar)) == null) {
                while (true) {
                    wzc wzcVarM55475m = dfjVar.m22990b().m55475m();
                    if (wzcVarM55475m != null) {
                        dfj dfjVar2 = (dfj) mapM32685l.get(wzcVarM55475m);
                        if (dfjVar2 != null) {
                            dfjVar2.m22991c().add(dfjVar.m22990b());
                            break;
                        }
                        dfj dfjVar3 = new dfj(wzcVarM55475m, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                        mapM32685l.put(wzcVarM55475m, dfjVar3);
                        dfjVar3.m22991c().add(dfjVar.m22990b());
                        dfjVar = dfjVar3;
                        it = it;
                    }
                }
            }
        }
        return mapM32685l;
    }

    /* renamed from: c */
    public static final String m26584c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String string = Integer.toString(i, ph2.m43651a(16));
        sq8.m48648g(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc A[Catch: all -> 0x00f1, TRY_ENTER, TryCatch #8 {all -> 0x00f1, blocks: (B:13:0x0062, B:15:0x006b, B:18:0x007c, B:44:0x00dc, B:45:0x00dd, B:46:0x00e4, B:47:0x00e5), top: B:131:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102 A[Catch: all -> 0x01a5, TryCatch #2 {all -> 0x01a5, blocks: (B:3:0x0019, B:5:0x0027, B:6:0x0030, B:10:0x004e, B:12:0x005a, B:65:0x0102, B:61:0x00fb, B:66:0x0103, B:93:0x0161, B:97:0x0170, B:91:0x015c, B:98:0x0171, B:101:0x017d, B:102:0x0184, B:104:0x0186, B:105:0x0189, B:106:0x018a, B:107:0x01a4, B:7:0x0038, B:9:0x0041, B:67:0x0114, B:70:0x011c, B:72:0x012c, B:74:0x0138, B:75:0x013b, B:76:0x013f, B:77:0x0146, B:78:0x0147, B:57:0x00f5, B:87:0x0156), top: B:120:0x0019, inners: #1, #9, #11, #13 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final efj m26585d(wzc wzcVar, pz6 pz6Var, xk7 xk7Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable th;
        Throwable th2;
        Throwable th3;
        int iC2;
        sq8.m48649h(wzcVar, "zipPath");
        sq8.m48649h(pz6Var, "fileSystem");
        sq8.m48649h(xk7Var, "predicate");
        rw6 rw6VarMo24957a = pz6Var.mo24957a(wzcVar);
        try {
            long jM47206s = rw6VarMo24957a.m47206s() - 22;
            if (jM47206s < 0) {
                throw new IOException("not a zip: size=" + rw6VarMo24957a.m47206s());
            }
            long jMax = Math.max(jM47206s - MediaStatus.COMMAND_FOLLOW, 0L);
            do {
                im1 im1VarM51310c = uac.m51310c(rw6VarMo24957a.m47207t(jM47206s));
                try {
                    if (im1VarM51310c.C2() == 101010256) {
                        cj6 cj6VarM26587f = m26587f(im1VarM51310c);
                        String strT1 = im1VarM51310c.t1(cj6VarM26587f.m21318b());
                        im1VarM51310c.close();
                        long j = jM47206s - 20;
                        Throwable th4 = null;
                        if (j > 0) {
                            im1 im1VarM51310c2 = uac.m51310c(rw6VarMo24957a.m47207t(j));
                            try {
                                if (im1VarM51310c2.C2() == 117853008) {
                                    int iC22 = im1VarM51310c2.C2();
                                    long jC1 = im1VarM51310c2.c1();
                                    if (im1VarM51310c2.C2() != 1 || iC22 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    im1 im1VarM51310c3 = uac.m51310c(rw6VarMo24957a.m47207t(jC1));
                                    try {
                                        iC2 = im1VarM51310c3.C2();
                                    } catch (Throwable th5) {
                                        if (im1VarM51310c3 != null) {
                                            try {
                                                im1VarM51310c3.close();
                                            } catch (Throwable th6) {
                                                try {
                                                    cl6.m21376a(th5, th6);
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    cj6VarM26587f = cj6VarM26587f;
                                                    if (im1VarM51310c2 != null) {
                                                        try {
                                                            im1VarM51310c2.close();
                                                        } catch (Throwable th8) {
                                                            cl6.m21376a(th, th8);
                                                        }
                                                    }
                                                    th2 = th;
                                                    if (th2 != null) {
                                                    }
                                                }
                                            }
                                        }
                                        th3 = th5;
                                        cj6VarM26587f = cj6VarM26587f;
                                    }
                                    if (iC2 != 101075792) {
                                        throw new IOException("bad zip: expected " + m26584c(101075792) + " but was " + m26584c(iC2));
                                    }
                                    cj6VarM26587f = m26590i(im1VarM51310c3, cj6VarM26587f);
                                    y3i y3iVar = y3i.f54824a;
                                    if (im1VarM51310c3 != null) {
                                        try {
                                            im1VarM51310c3.close();
                                            th3 = null;
                                        } catch (Throwable th9) {
                                            th3 = th9;
                                        }
                                        if (th3 != null) {
                                            throw th3;
                                        }
                                    } else {
                                        th3 = null;
                                        if (th3 != null) {
                                        }
                                    }
                                }
                                y3i y3iVar2 = y3i.f54824a;
                            } catch (Throwable th10) {
                                th = th10;
                            }
                            if (im1VarM51310c2 != null) {
                                try {
                                    im1VarM51310c2.close();
                                    th2 = null;
                                } catch (Throwable th11) {
                                    th2 = th11;
                                }
                                if (th2 != null) {
                                    throw th2;
                                }
                            } else {
                                th2 = null;
                                if (th2 != null) {
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        im1 im1VarM51310c4 = uac.m51310c(rw6VarMo24957a.m47207t(cj6VarM26587f.m21317a()));
                        try {
                            long jM21319c = cj6VarM26587f.m21319c();
                            for (long j2 = 0; j2 < jM21319c; j2++) {
                                dfj dfjVarM26586e = m26586e(im1VarM51310c4);
                                if (dfjVarM26586e.m22994f() >= cj6VarM26587f.m21317a()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) xk7Var.invoke(dfjVarM26586e)).booleanValue()) {
                                    arrayList.add(dfjVarM26586e);
                                }
                            }
                            y3i y3iVar3 = y3i.f54824a;
                            if (im1VarM51310c4 != null) {
                                try {
                                    im1VarM51310c4.close();
                                } catch (Throwable th12) {
                                    th4 = th12;
                                }
                            }
                        } catch (Throwable th13) {
                            th4 = th13;
                            if (im1VarM51310c4 != null) {
                                try {
                                    im1VarM51310c4.close();
                                } catch (Throwable th14) {
                                    cl6.m21376a(th4, th14);
                                }
                            }
                        }
                        if (th4 != null) {
                            throw th4;
                        }
                        efj efjVar = new efj(wzcVar, pz6Var, m26583b(arrayList), strT1);
                        if (rw6VarMo24957a != null) {
                            try {
                                rw6VarMo24957a.close();
                            } catch (Throwable unused) {
                            }
                        }
                        return efjVar;
                    }
                    im1VarM51310c.close();
                    jM47206s--;
                } catch (Throwable th15) {
                    im1VarM51310c.close();
                    throw th15;
                }
            } while (jM47206s >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } finally {
        }
    }

    /* renamed from: e */
    public static final dfj m26586e(im1 im1Var) throws IOException {
        String str;
        long j;
        sq8.m48649h(im1Var, "<this>");
        int iC2 = im1Var.C2();
        if (iC2 != 33639248) {
            throw new IOException("bad zip: expected " + m26584c(33639248) + " but was " + m26584c(iC2));
        }
        im1Var.skip(4L);
        int iX0 = im1Var.X0() & 65535;
        if ((iX0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m26584c(iX0));
        }
        int iX02 = im1Var.X0() & 65535;
        int iX03 = im1Var.X0() & 65535;
        int iX04 = im1Var.X0() & 65535;
        long jC2 = im1Var.C2() & 4294967295L;
        fge fgeVar = new fge();
        fgeVar.f23302a = im1Var.C2() & 4294967295L;
        fge fgeVar2 = new fge();
        fgeVar2.f23302a = im1Var.C2() & 4294967295L;
        int iX05 = im1Var.X0() & 65535;
        int iX06 = im1Var.X0() & 65535;
        int iX07 = im1Var.X0() & 65535;
        im1Var.skip(8L);
        fge fgeVar3 = new fge();
        fgeVar3.f23302a = im1Var.C2() & 4294967295L;
        String strT1 = im1Var.t1(iX05);
        if (f9g.m26305O(strT1, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if (fgeVar2.f23302a == 4294967295L) {
            j = 8 + 0;
            str = strT1;
        } else {
            str = strT1;
            j = 0;
        }
        if (fgeVar.f23302a == 4294967295L) {
            j += 8;
        }
        if (fgeVar3.f23302a == 4294967295L) {
            j += 8;
        }
        long j2 = j;
        gge ggeVar = new gge();
        gge ggeVar2 = new gge();
        gge ggeVar3 = new gge();
        dge dgeVar = new dge();
        String str2 = str;
        m26588g(im1Var, iX06, new C13419b(dgeVar, j2, fgeVar2, im1Var, fgeVar, fgeVar3, ggeVar, ggeVar2, ggeVar3));
        if (j2 > 0 && !dgeVar.f19803a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        return new dfj(wzc.C18014a.m55482d(wzc.f52936b, "/", false, 1, null).m55477o(str2), e9g.m24605w(str2, "/", false, 2, null), im1Var.t1(iX07), jC2, fgeVar.f23302a, fgeVar2.f23302a, iX02, fgeVar3.f23302a, iX04, iX03, (Long) ggeVar.f25106a, (Long) ggeVar2.f25106a, (Long) ggeVar3.f25106a, null, null, null, 57344, null);
    }

    /* renamed from: f */
    public static final cj6 m26587f(im1 im1Var) throws IOException {
        int iX0 = im1Var.X0() & 65535;
        int iX02 = im1Var.X0() & 65535;
        long jX0 = im1Var.X0() & 65535;
        if (jX0 != (im1Var.X0() & 65535) || iX0 != 0 || iX02 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        im1Var.skip(4L);
        return new cj6(jX0, 4294967295L & im1Var.C2(), im1Var.X0() & 65535);
    }

    /* renamed from: g */
    public static final void m26588g(im1 im1Var, int i, nl7 nl7Var) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iX0 = im1Var.X0() & 65535;
            long jX0 = im1Var.X0() & 65535;
            long j2 = j - 4;
            if (j2 < jX0) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            im1Var.k1(jX0);
            long jF0 = im1Var.getBuffer().f0();
            nl7Var.invoke(Integer.valueOf(iX0), Long.valueOf(jX0));
            long jF02 = (im1Var.getBuffer().f0() + jX0) - jF0;
            if (jF02 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iX0);
            }
            if (jF02 > 0) {
                im1Var.getBuffer().skip(jF02);
            }
            j = j2 - jX0;
        }
    }

    /* renamed from: h */
    public static final dfj m26589h(im1 im1Var, dfj dfjVar) throws IOException {
        int iC2 = im1Var.C2();
        if (iC2 != 67324752) {
            throw new IOException("bad zip: expected " + m26584c(67324752) + " but was " + m26584c(iC2));
        }
        im1Var.skip(2L);
        int iX0 = im1Var.X0() & 65535;
        if ((iX0 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m26584c(iX0));
        }
        im1Var.skip(18L);
        int iX02 = im1Var.X0() & 65535;
        im1Var.skip(im1Var.X0() & 65535);
        if (dfjVar == null) {
            im1Var.skip(iX02);
            return null;
        }
        gge ggeVar = new gge();
        gge ggeVar2 = new gge();
        gge ggeVar3 = new gge();
        m26588g(im1Var, iX02, new C13420c(im1Var, ggeVar, ggeVar2, ggeVar3));
        return dfjVar.m22989a((Integer) ggeVar.f25106a, (Integer) ggeVar2.f25106a, (Integer) ggeVar3.f25106a);
    }

    /* renamed from: i */
    public static final cj6 m26590i(im1 im1Var, cj6 cj6Var) throws IOException {
        im1Var.skip(12L);
        int iC2 = im1Var.C2();
        int iC22 = im1Var.C2();
        long jC1 = im1Var.c1();
        if (jC1 != im1Var.c1() || iC2 != 0 || iC22 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        im1Var.skip(8L);
        return new cj6(jC1, im1Var.c1(), cj6Var.m21318b());
    }

    /* renamed from: j */
    public static final void m26591j(im1 im1Var) {
        sq8.m48649h(im1Var, "<this>");
        m26589h(im1Var, null);
    }
}
