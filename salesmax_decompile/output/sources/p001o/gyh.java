package p001o;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.hyh;
import p001o.qbg;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class gyh implements tq6 {

    /* renamed from: v */
    public static final yq6 f25950v = new yq6() { // from class: o.fyh
        @Override // p001o.yq6
        /* renamed from: f */
        public final tq6[] mo17519f() {
            return gyh.m29663y();
        }
    };

    /* renamed from: a */
    public final int f25951a;

    /* renamed from: b */
    public final int f25952b;

    /* renamed from: c */
    public final int f25953c;

    /* renamed from: d */
    public final List f25954d;

    /* renamed from: e */
    public final zwc f25955e;

    /* renamed from: f */
    public final SparseIntArray f25956f;

    /* renamed from: g */
    public final hyh.InterfaceC14128c f25957g;

    /* renamed from: h */
    public final qbg.InterfaceC16329a f25958h;

    /* renamed from: i */
    public final SparseArray f25959i;

    /* renamed from: j */
    public final SparseBooleanArray f25960j;

    /* renamed from: k */
    public final SparseBooleanArray f25961k;

    /* renamed from: l */
    public final eyh f25962l;

    /* renamed from: m */
    public dyh f25963m;

    /* renamed from: n */
    public vq6 f25964n;

    /* renamed from: o */
    public int f25965o;

    /* renamed from: p */
    public boolean f25966p;

    /* renamed from: q */
    public boolean f25967q;

    /* renamed from: r */
    public boolean f25968r;

    /* renamed from: s */
    public hyh f25969s;

    /* renamed from: t */
    public int f25970t;

    /* renamed from: u */
    public int f25971u;

    /* renamed from: o.gyh$a */
    public class C13834a implements qaf {

        /* renamed from: a */
        public final ywc f25972a = new ywc(new byte[4]);

        public C13834a() {
        }

        @Override // p001o.qaf
        /* renamed from: a */
        public void mo29669a(zwc zwcVar) {
            if (zwcVar.m60004H() == 0 && (zwcVar.m60004H() & 128) != 0) {
                zwcVar.m60018V(6);
                int iM60020a = zwcVar.m60020a() / 4;
                for (int i = 0; i < iM60020a; i++) {
                    zwcVar.m60030k(this.f25972a, 4);
                    int iM58444h = this.f25972a.m58444h(16);
                    this.f25972a.m58454r(3);
                    if (iM58444h == 0) {
                        this.f25972a.m58454r(13);
                    } else {
                        int iM58444h2 = this.f25972a.m58444h(13);
                        if (gyh.this.f25959i.get(iM58444h2) == null) {
                            gyh.this.f25959i.put(iM58444h2, new raf(gyh.this.new C13835b(iM58444h2)));
                            gyh.m29653m(gyh.this);
                        }
                    }
                }
                if (gyh.this.f25951a != 2) {
                    gyh.this.f25959i.remove(0);
                }
            }
        }

        @Override // p001o.qaf
        /* renamed from: c */
        public void mo29670c(umh umhVar, vq6 vq6Var, hyh.C14129d c14129d) {
        }
    }

    /* renamed from: o.gyh$b */
    public class C13835b implements qaf {

        /* renamed from: a */
        public final ywc f25974a = new ywc(new byte[5]);

        /* renamed from: b */
        public final SparseArray f25975b = new SparseArray();

        /* renamed from: c */
        public final SparseIntArray f25976c = new SparseIntArray();

        /* renamed from: d */
        public final int f25977d;

        public C13835b(int i) {
            this.f25977d = i;
        }

        @Override // p001o.qaf
        /* renamed from: a */
        public void mo29669a(zwc zwcVar) {
            umh umhVar;
            if (zwcVar.m60004H() != 2) {
                return;
            }
            if (gyh.this.f25951a == 1 || gyh.this.f25951a == 2 || gyh.this.f25965o == 1) {
                umhVar = (umh) gyh.this.f25954d.get(0);
            } else {
                umhVar = new umh(((umh) gyh.this.f25954d.get(0)).m51797d());
                gyh.this.f25954d.add(umhVar);
            }
            if ((zwcVar.m60004H() & 128) == 0) {
                return;
            }
            zwcVar.m60018V(1);
            int iM60010N = zwcVar.m60010N();
            int i = 3;
            zwcVar.m60018V(3);
            zwcVar.m60030k(this.f25974a, 2);
            this.f25974a.m58454r(3);
            int i2 = 13;
            gyh.this.f25971u = this.f25974a.m58444h(13);
            zwcVar.m60030k(this.f25974a, 2);
            int i3 = 4;
            this.f25974a.m58454r(4);
            zwcVar.m60018V(this.f25974a.m58444h(12));
            if (gyh.this.f25951a == 2 && gyh.this.f25969s == null) {
                hyh.C14127b c14127b = new hyh.C14127b(21, null, 0, null, sqi.f45795f);
                gyh gyhVar = gyh.this;
                gyhVar.f25969s = gyhVar.f25957g.mo31293b(21, c14127b);
                if (gyh.this.f25969s != null) {
                    gyh.this.f25969s.mo31290c(umhVar, gyh.this.f25964n, new hyh.C14129d(iM60010N, 21, 8192));
                }
            }
            this.f25975b.clear();
            this.f25976c.clear();
            int iM60020a = zwcVar.m60020a();
            while (iM60020a > 0) {
                zwcVar.m60030k(this.f25974a, 5);
                int iM58444h = this.f25974a.m58444h(8);
                this.f25974a.m58454r(i);
                int iM58444h2 = this.f25974a.m58444h(i2);
                this.f25974a.m58454r(i3);
                int iM58444h3 = this.f25974a.m58444h(12);
                hyh.C14127b c14127bM29671b = m29671b(zwcVar, iM58444h3);
                if (iM58444h == 6 || iM58444h == 5) {
                    iM58444h = c14127bM29671b.f27802a;
                }
                iM60020a -= iM58444h3 + 5;
                int i4 = gyh.this.f25951a == 2 ? iM58444h : iM58444h2;
                if (!gyh.this.f25960j.get(i4)) {
                    hyh hyhVarMo31293b = (gyh.this.f25951a == 2 && iM58444h == 21) ? gyh.this.f25969s : gyh.this.f25957g.mo31293b(iM58444h, c14127bM29671b);
                    if (gyh.this.f25951a != 2 || iM58444h2 < this.f25976c.get(i4, 8192)) {
                        this.f25976c.put(i4, iM58444h2);
                        this.f25975b.put(i4, hyhVarMo31293b);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.f25976c.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.f25976c.keyAt(i5);
                int iValueAt = this.f25976c.valueAt(i5);
                gyh.this.f25960j.put(iKeyAt, true);
                gyh.this.f25961k.put(iValueAt, true);
                hyh hyhVar = (hyh) this.f25975b.valueAt(i5);
                if (hyhVar != null) {
                    if (hyhVar != gyh.this.f25969s) {
                        hyhVar.mo31290c(umhVar, gyh.this.f25964n, new hyh.C14129d(iM60010N, iKeyAt, 8192));
                    }
                    gyh.this.f25959i.put(iValueAt, hyhVar);
                }
            }
            if (gyh.this.f25951a == 2) {
                if (gyh.this.f25966p) {
                    return;
                }
                gyh.this.f25964n.mo32489p();
                gyh.this.f25965o = 0;
                gyh.this.f25966p = true;
                return;
            }
            gyh.this.f25959i.remove(this.f25977d);
            gyh gyhVar2 = gyh.this;
            gyhVar2.f25965o = gyhVar2.f25951a == 1 ? 0 : gyh.this.f25965o - 1;
            if (gyh.this.f25965o == 0) {
                gyh.this.f25964n.mo32489p();
                gyh.this.f25966p = true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hyh.C14127b m29671b(zwc zwcVar, int i) {
            int i2;
            int iM60025f = zwcVar.m60025f();
            int i3 = iM60025f + i;
            int i4 = -1;
            String str = null;
            ArrayList arrayList = null;
            int iM60004H = 0;
            while (zwcVar.m60025f() < i3) {
                int iM60004H2 = zwcVar.m60004H();
                int iM60025f2 = zwcVar.m60025f() + zwcVar.m60004H();
                if (iM60025f2 > i3) {
                    break;
                }
                if (iM60004H2 == 5) {
                    long jM60006J = zwcVar.m60006J();
                    if (jM60006J == 1094921523) {
                        i4 = 129;
                    } else if (jM60006J == 1161904947) {
                        i4 = 135;
                    } else if (jM60006J == 1094921524) {
                        i4 = 172;
                    } else if (jM60006J == 1212503619) {
                        i4 = 36;
                    }
                } else if (iM60004H2 != 106) {
                    if (iM60004H2 != 122) {
                        if (iM60004H2 == 127) {
                            int iM60004H3 = zwcVar.m60004H();
                            if (iM60004H3 != 21) {
                                if (iM60004H3 == 14) {
                                    i4 = Opcodes.L2I;
                                } else if (iM60004H3 == 33) {
                                    i4 = Opcodes.F2I;
                                }
                            }
                        } else {
                            if (iM60004H2 == 123) {
                                i2 = Opcodes.L2D;
                            } else if (iM60004H2 == 10) {
                                String strTrim = zwcVar.m60001E(3).trim();
                                iM60004H = zwcVar.m60004H();
                                str = strTrim;
                            } else if (iM60004H2 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (zwcVar.m60025f() < iM60025f2) {
                                    String strTrim2 = zwcVar.m60001E(3).trim();
                                    int iM60004H4 = zwcVar.m60004H();
                                    byte[] bArr = new byte[4];
                                    zwcVar.m60031l(bArr, 0, 4);
                                    arrayList2.add(new hyh.C14126a(strTrim2, iM60004H4, bArr));
                                }
                                arrayList = arrayList2;
                                i4 = 89;
                            } else if (iM60004H2 == 111) {
                                i2 = 257;
                            }
                            i4 = i2;
                        }
                    }
                }
                zwcVar.m60018V(iM60025f2 - zwcVar.m60025f());
            }
            zwcVar.m60017U(i3);
            return new hyh.C14127b(i4, str, iM60004H, arrayList, Arrays.copyOfRange(zwcVar.m60024e(), iM60025f, i3));
        }

        @Override // p001o.qaf
        /* renamed from: c */
        public void mo29670c(umh umhVar, vq6 vq6Var, hyh.C14129d c14129d) {
        }
    }

    public gyh(int i, qbg.InterfaceC16329a interfaceC16329a) {
        this(1, i, interfaceC16329a, new umh(0L), new sj5(0), 112800);
    }

    /* renamed from: m */
    public static /* synthetic */ int m29653m(gyh gyhVar) {
        int i = gyhVar.f25965o;
        gyhVar.f25965o = i + 1;
        return i;
    }

    /* renamed from: y */
    public static /* synthetic */ tq6[] m29663y() {
        return new tq6[]{new gyh(1, qbg.InterfaceC16329a.f41600a)};
    }

    /* renamed from: A */
    public final void m29664A() {
        this.f25960j.clear();
        this.f25959i.clear();
        SparseArray sparseArrayMo31292a = this.f25957g.mo31292a();
        int size = sparseArrayMo31292a.size();
        for (int i = 0; i < size; i++) {
            this.f25959i.put(sparseArrayMo31292a.keyAt(i), (hyh) sparseArrayMo31292a.valueAt(i));
        }
        this.f25959i.put(0, new raf(new C13834a()));
        this.f25969s = null;
    }

    /* renamed from: B */
    public final boolean m29665B(int i) {
        return this.f25951a == 2 || this.f25966p || !this.f25961k.get(i, false);
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        dyh dyhVar;
        op0.m42517g(this.f25951a != 2);
        int size = this.f25954d.size();
        for (int i = 0; i < size; i++) {
            umh umhVar = (umh) this.f25954d.get(i);
            boolean z = umhVar.m51799f() == -9223372036854775807L;
            if (!z) {
                long jM51797d = umhVar.m51797d();
                z = (jM51797d == -9223372036854775807L || jM51797d == 0 || jM51797d == j2) ? false : true;
            }
            if (z) {
                umhVar.m51801i(j2);
            }
        }
        if (j2 != 0 && (dyhVar = this.f25963m) != null) {
            dyhVar.m45455h(j2);
        }
        this.f25955e.m60013Q(0);
        this.f25956f.clear();
        for (int i2 = 0; i2 < this.f25959i.size(); i2++) {
            ((hyh) this.f25959i.valueAt(i2)).mo31289b();
        }
        this.f25970t = 0;
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        boolean z;
        byte[] bArrM60024e = this.f25955e.m60024e();
        uq6Var.mo40498m(bArrM60024e, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                }
                if (bArrM60024e[(i2 * Opcodes.NEWARRAY) + i] != 71) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                uq6Var.mo40496k(i);
                return true;
            }
        }
        return false;
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        if ((this.f25952b & 1) == 0) {
            vq6Var = new sbg(vq6Var, this.f25958h);
        }
        this.f25964n = vq6Var;
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) throws byc {
        long length = uq6Var.getLength();
        boolean z = this.f25951a == 2;
        if (this.f25966p) {
            if (((length == -1 || z) ? false : true) && !this.f25962l.m25849d()) {
                return this.f25962l.m25850e(uq6Var, uedVar, this.f25971u);
            }
            m29668z(length);
            if (this.f25968r) {
                this.f25968r = false;
                mo17261a(0L, 0L);
                if (uq6Var.getPosition() != 0) {
                    uedVar.f48772a = 0L;
                    return 1;
                }
            }
            dyh dyhVar = this.f25963m;
            if (dyhVar != null && dyhVar.m45451d()) {
                return this.f25963m.m45450c(uq6Var, uedVar);
            }
        }
        if (!m29666w(uq6Var)) {
            for (int i = 0; i < this.f25959i.size(); i++) {
                hyh hyhVar = (hyh) this.f25959i.valueAt(i);
                if (hyhVar instanceof l6d) {
                    l6d l6dVar = (l6d) hyhVar;
                    if (l6dVar.m36621d(z)) {
                        l6dVar.mo31288a(new zwc(), 1);
                    }
                }
            }
            return -1;
        }
        int iM29667x = m29667x();
        int iM60026g = this.f25955e.m60026g();
        if (iM29667x > iM60026g) {
            return 0;
        }
        int iM60036q = this.f25955e.m60036q();
        if ((8388608 & iM60036q) != 0) {
            this.f25955e.m60017U(iM29667x);
            return 0;
        }
        int i2 = ((4194304 & iM60036q) != 0 ? 1 : 0) | 0;
        int i3 = (2096896 & iM60036q) >> 8;
        boolean z2 = (iM60036q & 32) != 0;
        hyh hyhVar2 = (iM60036q & 16) != 0 ? (hyh) this.f25959i.get(i3) : null;
        if (hyhVar2 == null) {
            this.f25955e.m60017U(iM29667x);
            return 0;
        }
        if (this.f25951a != 2) {
            int i4 = iM60036q & 15;
            int i5 = this.f25956f.get(i3, i4 - 1);
            this.f25956f.put(i3, i4);
            if (i5 == i4) {
                this.f25955e.m60017U(iM29667x);
                return 0;
            }
            if (i4 != ((i5 + 1) & 15)) {
                hyhVar2.mo31289b();
            }
        }
        if (z2) {
            int iM60004H = this.f25955e.m60004H();
            i2 |= (this.f25955e.m60004H() & 64) != 0 ? 2 : 0;
            this.f25955e.m60018V(iM60004H - 1);
        }
        boolean z3 = this.f25966p;
        if (m29665B(i3)) {
            this.f25955e.m60016T(iM29667x);
            hyhVar2.mo31288a(this.f25955e, i2);
            this.f25955e.m60016T(iM60026g);
        }
        if (this.f25951a != 2 && !z3 && this.f25966p && length != -1) {
            this.f25968r = true;
        }
        this.f25955e.m60017U(iM29667x);
        return 0;
    }

    @Override // p001o.tq6
    public void release() {
    }

    /* renamed from: w */
    public final boolean m29666w(uq6 uq6Var) {
        byte[] bArrM60024e = this.f25955e.m60024e();
        if (9400 - this.f25955e.m60025f() < 188) {
            int iM60020a = this.f25955e.m60020a();
            if (iM60020a > 0) {
                System.arraycopy(bArrM60024e, this.f25955e.m60025f(), bArrM60024e, 0, iM60020a);
            }
            this.f25955e.m60015S(bArrM60024e, iM60020a);
        }
        while (this.f25955e.m60020a() < 188) {
            int iM60026g = this.f25955e.m60026g();
            int i = uq6Var.read(bArrM60024e, iM60026g, 9400 - iM60026g);
            if (i == -1) {
                return false;
            }
            this.f25955e.m60016T(iM60026g + i);
        }
        return true;
    }

    /* renamed from: x */
    public final int m29667x() throws byc {
        int iM60025f = this.f25955e.m60025f();
        int iM60026g = this.f25955e.m60026g();
        int iM32914a = iyh.m32914a(this.f25955e.m60024e(), iM60025f, iM60026g);
        this.f25955e.m60017U(iM32914a);
        int i = iM32914a + Opcodes.NEWARRAY;
        if (i > iM60026g) {
            int i2 = this.f25970t + (iM32914a - iM60025f);
            this.f25970t = i2;
            if (this.f25951a == 2 && i2 > 376) {
                throw byc.m19921a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f25970t = 0;
        }
        return i;
    }

    /* renamed from: z */
    public final void m29668z(long j) {
        if (this.f25967q) {
            return;
        }
        this.f25967q = true;
        if (this.f25962l.m25847b() == -9223372036854775807L) {
            this.f25964n.mo32490r(new zaf.C18604b(this.f25962l.m25847b()));
            return;
        }
        dyh dyhVar = new dyh(this.f25962l.m25848c(), this.f25962l.m25847b(), j, this.f25971u, this.f25953c);
        this.f25963m = dyhVar;
        this.f25964n.mo32490r(dyhVar.m45449b());
    }

    public gyh(int i, int i2, qbg.InterfaceC16329a interfaceC16329a, umh umhVar, hyh.InterfaceC14128c interfaceC14128c, int i3) {
        this.f25957g = (hyh.InterfaceC14128c) op0.m42515e(interfaceC14128c);
        this.f25953c = i3;
        this.f25951a = i;
        this.f25952b = i2;
        this.f25958h = interfaceC16329a;
        if (i == 1 || i == 2) {
            this.f25954d = Collections.singletonList(umhVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f25954d = arrayList;
            arrayList.add(umhVar);
        }
        this.f25955e = new zwc(new byte[9400], 0);
        this.f25960j = new SparseBooleanArray();
        this.f25961k = new SparseBooleanArray();
        this.f25959i = new SparseArray();
        this.f25956f = new SparseIntArray();
        this.f25962l = new eyh(i3);
        this.f25964n = vq6.f50715r;
        this.f25971u = -1;
        m29664A();
    }
}
