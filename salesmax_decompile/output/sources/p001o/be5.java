package p001o;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.qbg;

/* loaded from: classes2.dex */
public final class be5 implements yq6 {

    /* renamed from: r */
    public static final int[] f16025r = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: s */
    public static final C12366a f16026s = new C12366a(new C12366a.a() { // from class: o.zd5
        @Override // p001o.be5.C12366a.a
        /* renamed from: a */
        public final Constructor mo16942a() {
            return be5.m18777k();
        }
    });

    /* renamed from: t */
    public static final C12366a f16027t = new C12366a(new C12366a.a() { // from class: o.ae5
        @Override // p001o.be5.C12366a.a
        /* renamed from: a */
        public final Constructor mo16942a() {
            return be5.m18778l();
        }
    });

    /* renamed from: b */
    public boolean f16028b;

    /* renamed from: c */
    public boolean f16029c;

    /* renamed from: d */
    public int f16030d;

    /* renamed from: e */
    public int f16031e;

    /* renamed from: f */
    public int f16032f;

    /* renamed from: g */
    public int f16033g;

    /* renamed from: h */
    public int f16034h;

    /* renamed from: i */
    public int f16035i;

    /* renamed from: j */
    public int f16036j;

    /* renamed from: l */
    public int f16038l;

    /* renamed from: m */
    public nf8 f16039m;

    /* renamed from: q */
    public int f16043q;

    /* renamed from: k */
    public int f16037k = 1;

    /* renamed from: n */
    public int f16040n = 112800;

    /* renamed from: p */
    public qbg.InterfaceC16329a f16042p = new uh5();

    /* renamed from: o */
    public boolean f16041o = true;

    /* renamed from: o.be5$a */
    public static final class C12366a {

        /* renamed from: a */
        public final a f16044a;

        /* renamed from: b */
        public final AtomicBoolean f16045b = new AtomicBoolean(false);

        /* renamed from: c */
        public Constructor f16046c;

        /* renamed from: o.be5$a$a */
        public interface a {
            /* renamed from: a */
            Constructor mo16942a();
        }

        public C12366a(a aVar) {
            this.f16044a = aVar;
        }

        /* renamed from: a */
        public tq6 m18787a(Object... objArr) {
            Constructor constructorM18788b = m18788b();
            if (constructorM18788b == null) {
                return null;
            }
            try {
                return (tq6) constructorM18788b.newInstance(objArr);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating extractor", e);
            }
        }

        /* renamed from: b */
        public final Constructor m18788b() {
            synchronized (this.f16045b) {
                if (this.f16045b.get()) {
                    return this.f16046c;
                }
                try {
                    return this.f16044a.mo16942a();
                } catch (ClassNotFoundException unused) {
                    this.f16045b.set(true);
                    return this.f16046c;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }
    }

    /* renamed from: k */
    public static Constructor m18777k() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(tq6.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* renamed from: l */
    public static Constructor m18778l() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(tq6.class).getConstructor(new Class[0]);
    }

    @Override // p001o.yq6
    /* renamed from: d */
    public synchronized tq6[] mo18781d(Uri uri, Map map) {
        tq6[] tq6VarArr;
        int[] iArr = f16025r;
        ArrayList arrayList = new ArrayList(iArr.length);
        int iM50805b = tz6.m50805b(map);
        if (iM50805b != -1) {
            m18782i(iM50805b, arrayList);
        }
        int iM50806c = tz6.m50806c(uri);
        if (iM50806c != -1 && iM50806c != iM50805b) {
            m18782i(iM50806c, arrayList);
        }
        for (int i : iArr) {
            if (i != iM50805b && i != iM50806c) {
                m18782i(i, arrayList);
            }
        }
        tq6VarArr = new tq6[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            tq6 rbgVar = (tq6) arrayList.get(i2);
            if (this.f16041o && !(rbgVar.mo46490f() instanceof tj7) && !(rbgVar.mo46490f() instanceof fnb) && !(rbgVar.mo46490f() instanceof gyh) && !(rbgVar.mo46490f() instanceof y61) && !(rbgVar.mo46490f() instanceof xza)) {
                rbgVar = new rbg(rbgVar, this.f16042p);
            }
            tq6VarArr[i2] = rbgVar;
        }
        return tq6VarArr;
    }

    @Override // p001o.yq6
    /* renamed from: f */
    public synchronized tq6[] mo17519f() {
        return mo18781d(Uri.EMPTY, new HashMap());
    }

    /* renamed from: i */
    public final void m18782i(int i, List list) {
        switch (i) {
            case 0:
                list.add(new da());
                break;
            case 1:
                list.add(new ha());
                break;
            case 2:
                list.add(new m70((this.f16029c ? 2 : 0) | this.f16030d | (this.f16028b ? 1 : 0)));
                break;
            case 3:
                list.add(new zb0((this.f16029c ? 2 : 0) | this.f16031e | (this.f16028b ? 1 : 0)));
                break;
            case 4:
                tq6 tq6VarM18787a = f16026s.m18787a(Integer.valueOf(this.f16032f));
                if (tq6VarM18787a == null) {
                    list.add(new e27(this.f16032f));
                    break;
                } else {
                    list.add(tq6VarM18787a);
                    break;
                }
            case 5:
                list.add(new q67());
                break;
            case 6:
                list.add(new xza(this.f16042p, (this.f16041o ? 0 : 2) | this.f16033g));
                break;
            case 7:
                list.add(new cnb((this.f16029c ? 2 : 0) | this.f16036j | (this.f16028b ? 1 : 0)));
                break;
            case 8:
                list.add(new tj7(this.f16042p, this.f16035i | (this.f16041o ? 0 : 32)));
                list.add(new fnb(this.f16042p, (this.f16041o ? 0 : 16) | this.f16034h));
                break;
            case 9:
                list.add(new x9c());
                break;
            case 10:
                list.add(new c3e());
                break;
            case 11:
                if (this.f16039m == null) {
                    this.f16039m = nf8.m40499E();
                }
                list.add(new gyh(this.f16037k, !this.f16041o ? 1 : 0, this.f16042p, new umh(0L), new sj5(this.f16038l, this.f16039m), this.f16040n));
                break;
            case 12:
                list.add(new c4j());
                break;
            case 14:
                list.add(new l79(this.f16043q));
                break;
            case 15:
                tq6 tq6VarM18787a2 = f16027t.m18787a(new Object[0]);
                if (tq6VarM18787a2 != null) {
                    list.add(tq6VarM18787a2);
                    break;
                }
                break;
            case 16:
                list.add(new y61(!this.f16041o ? 1 : 0, this.f16042p));
                break;
            case 17:
                list.add(new xbd());
                break;
            case 18:
                list.add(new i6j());
                break;
            case 19:
                list.add(new ak1());
                break;
            case 20:
                int i2 = this.f16034h;
                if ((i2 & 2) == 0 && (i2 & 4) == 0) {
                    list.add(new ay7());
                    break;
                }
                break;
            case 21:
                list.add(new b71());
                break;
        }
    }

    @Override // p001o.yq6
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized be5 mo18780c(boolean z) {
        this.f16041o = z;
        return this;
    }

    /* renamed from: m */
    public synchronized be5 m18784m(boolean z) {
        this.f16028b = z;
        return this;
    }

    /* renamed from: n */
    public synchronized be5 m18785n(int i) {
        this.f16043q = i;
        return this;
    }

    @Override // p001o.yq6
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public synchronized be5 mo18779a(qbg.InterfaceC16329a interfaceC16329a) {
        this.f16042p = interfaceC16329a;
        return this;
    }
}
