package oc;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import ld.InterfaceC4447g;
import og.od;
import og.pe;
import pd.C5895a;
import pd.C5896b;
import pd.C5897c;
import pd.C5900f;
import qw.C6364n;
import qw.a0;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oc.b */
/* loaded from: classes.dex */
public final class C5335b implements Closeable {

    /* renamed from: r */
    public static final /* synthetic */ AtomicLongFieldUpdater f26233r;

    /* renamed from: s */
    public static final /* synthetic */ AtomicLongFieldUpdater f26234s;

    /* renamed from: t */
    public static final /* synthetic */ AtomicLongFieldUpdater f26235t;

    /* renamed from: v */
    public static final /* synthetic */ AtomicLongFieldUpdater f26236v;

    /* renamed from: a */
    public volatile /* synthetic */ long f26237a;

    /* renamed from: b */
    public volatile /* synthetic */ long f26238b;

    /* renamed from: c */
    public volatile /* synthetic */ long f26239c;

    /* renamed from: d */
    public volatile /* synthetic */ long f26240d;

    /* renamed from: e */
    public volatile /* synthetic */ long f26241e;

    /* renamed from: f */
    public volatile /* synthetic */ long f26242f;

    /* renamed from: g */
    public final C5896b f26243g;

    /* renamed from: h */
    public final C5896b f26244h;

    /* renamed from: j */
    public final C5897c f26245j;

    /* renamed from: k */
    public final C5897c f26246k;

    /* renamed from: l */
    public final C5897c f26247l;

    /* renamed from: m */
    public final C5897c f26248m;

    /* renamed from: n */
    public final C5897c f26249n;

    /* renamed from: p */
    public final C5897c f26250p;

    /* renamed from: q */
    public final C5896b f26251q;

    static {
        AtomicLongFieldUpdater.newUpdater(C5335b.class, "a");
        f26233r = AtomicLongFieldUpdater.newUpdater(C5335b.class, "b");
        f26234s = AtomicLongFieldUpdater.newUpdater(C5335b.class, "c");
        AtomicLongFieldUpdater.newUpdater(C5335b.class, "d");
        f26235t = AtomicLongFieldUpdater.newUpdater(C5335b.class, "e");
        f26236v = AtomicLongFieldUpdater.newUpdater(C5335b.class, "f");
    }

    public C5335b(InterfaceC4447g provider) {
        AbstractC4154l.m8923f(provider, "provider");
        provider.mo9305a().getClass();
        this.f26237a = 0L;
        this.f26238b = 0L;
        this.f26239c = 0L;
        this.f26240d = 0L;
        this.f26241e = 0L;
        this.f26242f = 0L;
        C5896b c5896b = C5897c.f28728a;
        this.f26243g = c5896b;
        this.f26244h = c5896b;
        C5897c c5897c = C5895a.f28727a;
        this.f26245j = c5897c;
        this.f26246k = c5897c;
        this.f26247l = c5897c;
        this.f26248m = c5897c;
        C5897c c5897c2 = C5900f.f28731a;
        this.f26249n = c5897c2;
        this.f26250p = c5897c2;
        this.f26251q = c5896b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Object objM10796a;
        Object objM10796a2;
        Object objM10796a3;
        Object objM10796a4 = a0.f30746a;
        try {
            this.f26245j.getClass();
            objM10796a = objM10796a4;
        } catch (Throwable th2) {
            objM10796a = od.m10796a(th2);
        }
        C6364n c6364n = new C6364n(objM10796a);
        try {
            this.f26246k.getClass();
            objM10796a2 = objM10796a4;
        } catch (Throwable th3) {
            objM10796a2 = od.m10796a(th3);
        }
        C6364n c6364n2 = new C6364n(objM10796a2);
        try {
            this.f26248m.getClass();
            objM10796a3 = objM10796a4;
        } catch (Throwable th4) {
            objM10796a3 = od.m10796a(th4);
        }
        C6364n c6364n3 = new C6364n(objM10796a3);
        try {
            this.f26247l.getClass();
        } catch (Throwable th5) {
            objM10796a4 = od.m10796a(th5);
        }
        List listM10834i = pe.m10834i(c6364n, c6364n2, c6364n3, new C6364n(objM10796a4));
        ArrayList arrayList = new ArrayList();
        Iterator it = listM10834i.iterator();
        while (it.hasNext()) {
            Throwable thM12363a = C6364n.m12363a(((C6364n) it.next()).f30758a);
            if (thM12363a != null) {
                arrayList.add(thM12363a);
            }
        }
        Throwable th6 = (Throwable) AbstractC6663m.m12743G(arrayList);
        if (th6 != null) {
            Iterator it2 = AbstractC6663m.m12738B(arrayList).iterator();
            while (it2.hasNext()) {
                th6.addSuppressed((Throwable) it2.next());
            }
            throw th6;
        }
    }
}
