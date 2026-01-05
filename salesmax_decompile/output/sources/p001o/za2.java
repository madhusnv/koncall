package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p001o.ahd;
import p001o.bgg;
import p001o.d9i;
import p001o.mq3;
import p001o.sc8;

/* loaded from: classes2.dex */
public final class za2 implements g72 {

    /* renamed from: M */
    public w8i f56811M;

    /* renamed from: Q */
    public h7g f56812Q;

    /* renamed from: X */
    public final nre f56813X;

    /* renamed from: Y */
    public final ore f56814Y;

    /* renamed from: Z */
    public final ore f56815Z;

    /* renamed from: a */
    public final v92 f56816a;

    /* renamed from: b */
    public final v92 f56817b;

    /* renamed from: c */
    public final m92 f56818c;

    /* renamed from: d */
    public final d9i f56819d;

    /* renamed from: e */
    public final AbstractC18596b f56820e;

    /* renamed from: h */
    public final b92 f56823h;
    public final ei9 h0;
    public final ei9 i0;

    /* renamed from: q */
    public eyi f56824q;

    /* renamed from: x */
    public final u82 f56826x;

    /* renamed from: f */
    public final List f56821f = new ArrayList();

    /* renamed from: g */
    public final List f56822g = new ArrayList();

    /* renamed from: s */
    public List f56825s = Collections.emptyList();

    /* renamed from: y */
    public final Object f56827y = new Object();

    /* renamed from: H */
    public boolean f56809H = true;

    /* renamed from: L */
    public mq3 f56810L = null;

    /* renamed from: o.za2$a */
    public static final class C18595a extends Exception {
        public C18595a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: o.za2$b */
    public static abstract class AbstractC18596b {
        /* renamed from: a */
        public static AbstractC18596b m59079a(String str, cb8 cb8Var) {
            return new d41(str, cb8Var);
        }

        /* renamed from: b */
        public abstract cb8 mo22315b();

        /* renamed from: c */
        public abstract String mo22316c();
    }

    /* renamed from: o.za2$c */
    public static class C18597c {

        /* renamed from: a */
        public c9i f56828a;

        /* renamed from: b */
        public c9i f56829b;

        public C18597c(c9i c9iVar, c9i c9iVar2) {
            this.f56828a = c9iVar;
            this.f56829b = c9iVar2;
        }
    }

    public za2(v92 v92Var, v92 v92Var2, ore oreVar, ore oreVar2, ei9 ei9Var, ei9 ei9Var2, b92 b92Var, m92 m92Var, d9i d9iVar) {
        this.f56816a = v92Var;
        this.f56817b = v92Var2;
        this.h0 = ei9Var;
        this.i0 = ei9Var2;
        this.f56823h = b92Var;
        this.f56818c = m92Var;
        this.f56819d = d9iVar;
        u82 u82VarM42600l = oreVar.m42600l();
        this.f56826x = u82VarM42600l;
        u82VarM42600l.m51202u(null);
        this.f56813X = new nre(v92Var.mo26115c(), null);
        this.f56814Y = oreVar;
        this.f56815Z = oreVar2;
        this.f56820e = m59038A(oreVar, oreVar2);
    }

    /* renamed from: A */
    public static AbstractC18596b m59038A(ore oreVar, ore oreVar2) {
        StringBuilder sb = new StringBuilder();
        sb.append(oreVar.mo38380b());
        sb.append(oreVar2 == null ? "" : oreVar2.mo38380b());
        return AbstractC18596b.m59079a(sb.toString(), oreVar.m42600l().mo51198Q());
    }

    /* renamed from: B */
    public static c9i m59039B(d9i d9iVar, h7g h7gVar) {
        c9i c9iVarMo17069j = new ahd.C12173a().m17075c().mo17069j(false, d9iVar);
        if (c9iVarMo17069j == null) {
            return null;
        }
        qpb qpbVarB0 = qpb.b0(c9iVarMo17069j);
        qpbVarB0.c0(sjg.f45490v);
        return h7gVar.mo17071y(qpbVarB0).mo17074b();
    }

    /* renamed from: E */
    public static Map m59040E(Collection collection, d9i d9iVar, d9i d9iVar2) {
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            w8i w8iVar = (w8i) it.next();
            map.put(w8iVar, new C18597c(h7g.n0(w8iVar) ? m59039B(d9iVar, (h7g) w8iVar) : w8iVar.mo17069j(false, d9iVar), w8iVar.mo17069j(true, d9iVar2)));
        }
        return map;
    }

    /* renamed from: K */
    public static boolean m59041K(k7g k7gVar, bhf bhfVar) {
        mq3 mq3VarMo35128d = k7gVar.mo35128d();
        mq3 mq3VarM19027f = bhfVar.m19027f();
        if (mq3VarMo35128d.mo36956b().size() != bhfVar.m19027f().mo36956b().size()) {
            return true;
        }
        for (mq3.AbstractC15402a abstractC15402a : mq3VarMo35128d.mo36956b()) {
            if (!mq3VarM19027f.mo36957c(abstractC15402a) || !Objects.equals(mq3VarM19027f.mo36960f(abstractC15402a), mq3VarMo35128d.mo36960f(abstractC15402a))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public static boolean m59042L(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (m59048S(((w8i) it.next()).m54090i().m35425E())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: M */
    public static boolean m59043M(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            w8i w8iVar = (w8i) it.next();
            if (m59047R(w8iVar)) {
                c9i c9iVarM54090i = w8iVar.m54090i();
                mq3.AbstractC15402a abstractC15402a = tc8.f46813M;
                if (c9iVarM54090i.mo36957c(abstractC15402a) && ((Integer) fgd.m26663g((Integer) c9iVarM54090i.mo36960f(abstractC15402a))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: N */
    public static boolean m59044N(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (m59051V((w8i) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public static boolean m59045P(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            w8i w8iVar = (w8i) it.next();
            if (m59049T(w8iVar) || h7g.n0(w8iVar)) {
                z = true;
            } else if (m59047R(w8iVar)) {
                z2 = true;
            }
        }
        return z && !z2;
    }

    /* renamed from: Q */
    public static boolean m59046Q(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            w8i w8iVar = (w8i) it.next();
            if (m59049T(w8iVar) || h7g.n0(w8iVar)) {
                z2 = true;
            } else if (m59047R(w8iVar)) {
                z = true;
            }
        }
        return z && !z2;
    }

    /* renamed from: R */
    public static boolean m59047R(w8i w8iVar) {
        return w8iVar instanceof sc8;
    }

    /* renamed from: S */
    public static boolean m59048S(y16 y16Var) {
        return (y16Var.m57102a() == 10) || (y16Var.m57103b() != 1 && y16Var.m57103b() != 0);
    }

    /* renamed from: T */
    public static boolean m59049T(w8i w8iVar) {
        return w8iVar instanceof ahd;
    }

    /* renamed from: U */
    public static boolean m59050U(Collection collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            w8i w8iVar = (w8i) it.next();
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (w8iVar.m54068A(i2)) {
                    if (hashSet.contains(Integer.valueOf(i2))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i2));
                }
            }
        }
        return true;
    }

    /* renamed from: V */
    public static boolean m59051V(w8i w8iVar) {
        if (w8iVar != null) {
            if (w8iVar.m54090i().mo36957c(c9i.f17561E)) {
                return w8iVar.m54090i().mo20533M() == d9i.EnumC12848b.VIDEO_CAPTURE;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(w8iVar);
            sb.append(" UseCase does not have capture type.");
        }
        return false;
    }

    /* renamed from: W */
    public static /* synthetic */ void m59052W(Surface surface, SurfaceTexture surfaceTexture, bgg.AbstractC12389g abstractC12389g) {
        surface.release();
        surfaceTexture.release();
    }

    /* renamed from: X */
    public static /* synthetic */ void m59053X(bgg bggVar) throws ExecutionException, InterruptedException {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(bggVar.m18930o().getWidth(), bggVar.m18930o().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        bggVar.m18921B(surface, gb2.m28293a(), new hu3() { // from class: o.ya2
            @Override // p001o.hu3
            public final void accept(Object obj) {
                za2.m59052W(surface, surfaceTexture, (bgg.AbstractC12389g) obj);
            }
        });
    }

    public static List b0(List list, Collection collection) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((w8i) it.next()).m54076Q(null);
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                tq.m50332a(it2.next());
                throw null;
            }
        }
        return arrayList;
    }

    public static void d0(List list, Collection collection, Collection collection2) {
        List listB0 = b0(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List listB02 = b0(listB0, arrayList);
        if (listB02.size() > 0) {
            wja.m54638l("CameraUseCaseAdapter", "Unused effects: " + listB02);
        }
    }

    /* renamed from: r */
    public static Collection m59056r(Collection collection, w8i w8iVar, h7g h7gVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (w8iVar != null) {
            arrayList.add(w8iVar);
        }
        if (h7gVar != null) {
            arrayList.add(h7gVar);
            arrayList.removeAll(h7gVar.h0());
        }
        return arrayList;
    }

    /* renamed from: t */
    public static Matrix m59057t(Rect rect, Size size) {
        fgd.m26658b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    /* renamed from: C */
    public AbstractC18596b m59058C() {
        return this.f56820e;
    }

    /* renamed from: D */
    public final int m59059D() {
        synchronized (this.f56827y) {
            return this.f56823h.mo18287c() == 2 ? 1 : 0;
        }
    }

    /* renamed from: F */
    public t92 m59060F() {
        return this.f56815Z;
    }

    /* renamed from: G */
    public final int m59061G(boolean z) {
        int i;
        synchronized (this.f56827y) {
            Iterator it = this.f56825s.iterator();
            if (it.hasNext()) {
                tq.m50332a(it.next());
                throw null;
            }
            i = z ? 0 | 3 : 0;
        }
        return i;
    }

    /* renamed from: H */
    public final Set m59062H(Collection collection, boolean z) {
        HashSet hashSet = new HashSet();
        int iM59061G = m59061G(z);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            w8i w8iVar = (w8i) it.next();
            fgd.m26658b(!h7g.n0(w8iVar), "Only support one level of sharing for now.");
            if (w8iVar.m54068A(iM59061G)) {
                hashSet.add(w8iVar);
            }
        }
        return hashSet;
    }

    /* renamed from: I */
    public List m59063I() {
        ArrayList arrayList;
        synchronized (this.f56827y) {
            arrayList = new ArrayList(this.f56821f);
        }
        return arrayList;
    }

    /* renamed from: J */
    public final boolean m59064J() {
        synchronized (this.f56827y) {
            this.f56826x.m51202u(null);
        }
        return false;
    }

    /* renamed from: O */
    public final boolean m59065O() {
        boolean z;
        synchronized (this.f56827y) {
            z = true;
            if (this.f56826x.m51201q() != 1) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: Y */
    public void m59066Y(Collection collection) {
        synchronized (this.f56827y) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f56821f);
            linkedHashSet.removeAll(collection);
            v92 v92Var = this.f56817b;
            boolean z = true;
            boolean z2 = v92Var != null;
            if (v92Var == null) {
                z = false;
            }
            e0(linkedHashSet, z2, z);
        }
    }

    /* renamed from: Z */
    public final void m59067Z() {
        synchronized (this.f56827y) {
            if (this.f56810L != null) {
                this.f56816a.mo26115c().mo37115g(this.f56810L);
            }
        }
    }

    @Override // p001o.g72
    /* renamed from: a */
    public t92 mo28113a() {
        return this.f56814Y;
    }

    public void a0(List list) {
        synchronized (this.f56827y) {
            this.f56825s = list;
        }
    }

    public void c0(eyi eyiVar) {
        synchronized (this.f56827y) {
            this.f56824q = eyiVar;
        }
    }

    public void e0(Collection collection, boolean z, boolean z2) {
        Map map;
        k7g k7gVar;
        mq3 mq3VarMo35128d;
        synchronized (this.f56827y) {
            m59074v(collection);
            if (!z && m59064J() && m59044N(collection)) {
                e0(collection, true, z2);
                return;
            }
            h7g h7gVarM59077y = m59077y(collection, z);
            w8i w8iVarM59072s = m59072s(collection, h7gVarM59077y);
            Collection collectionM59056r = m59056r(collection, w8iVarM59072s, h7gVarM59077y);
            ArrayList<w8i> arrayList = new ArrayList(collectionM59056r);
            arrayList.removeAll(this.f56822g);
            ArrayList<w8i> arrayList2 = new ArrayList(collectionM59056r);
            arrayList2.retainAll(this.f56822g);
            ArrayList<w8i> arrayList3 = new ArrayList(this.f56822g);
            arrayList3.removeAll(collectionM59056r);
            Map mapM59040E = m59040E(arrayList, this.f56826x.m51200j(), this.f56819d);
            Map mapEmptyMap = Collections.emptyMap();
            try {
                Map map2 = mapM59040E;
                Map mapM59073u = m59073u(m59059D(), this.f56816a.mo26122j(), arrayList, arrayList2, map2);
                if (this.f56817b != null) {
                    int iM59059D = m59059D();
                    v92 v92Var = this.f56817b;
                    Objects.requireNonNull(v92Var);
                    map = mapM59073u;
                    mapEmptyMap = m59073u(iM59059D, v92Var.mo26122j(), arrayList, arrayList2, map2);
                } else {
                    map = mapM59073u;
                }
                Map map3 = mapEmptyMap;
                f0(map, collectionM59056r);
                d0(this.f56825s, collectionM59056r, collection);
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((w8i) it.next()).m54078T(this.f56816a);
                }
                this.f56816a.mo26121i(arrayList3);
                if (this.f56817b != null) {
                    for (w8i w8iVar : arrayList3) {
                        v92 v92Var2 = this.f56817b;
                        Objects.requireNonNull(v92Var2);
                        w8iVar.m54078T(v92Var2);
                    }
                    v92 v92Var3 = this.f56817b;
                    Objects.requireNonNull(v92Var3);
                    v92Var3.mo26121i(arrayList3);
                }
                if (arrayList3.isEmpty()) {
                    for (w8i w8iVar2 : arrayList2) {
                        if (map.containsKey(w8iVar2) && (mq3VarMo35128d = (k7gVar = (k7g) map.get(w8iVar2)).mo35128d()) != null && m59041K(k7gVar, w8iVar2.m54102v())) {
                            w8iVar2.m54081W(mq3VarMo35128d);
                            if (this.f56809H) {
                                this.f56816a.mo26117e(w8iVar2);
                                v92 v92Var4 = this.f56817b;
                                if (v92Var4 != null) {
                                    Objects.requireNonNull(v92Var4);
                                    v92Var4.mo26117e(w8iVar2);
                                }
                            }
                        }
                    }
                }
                for (w8i w8iVar3 : arrayList) {
                    Map map4 = map2;
                    C18597c c18597c = (C18597c) map4.get(w8iVar3);
                    Objects.requireNonNull(c18597c);
                    v92 v92Var5 = this.f56817b;
                    if (v92Var5 != null) {
                        v92 v92Var6 = this.f56816a;
                        Objects.requireNonNull(v92Var5);
                        w8iVar3.m54083b(v92Var6, v92Var5, c18597c.f56828a, c18597c.f56829b);
                        w8iVar3.m54080V((k7g) fgd.m26663g((k7g) map.get(w8iVar3)), (k7g) map3.get(w8iVar3));
                    } else {
                        w8iVar3.m54083b(this.f56816a, null, c18597c.f56828a, c18597c.f56829b);
                        w8iVar3.m54080V((k7g) fgd.m26663g((k7g) map.get(w8iVar3)), null);
                    }
                    map2 = map4;
                }
                if (this.f56809H) {
                    this.f56816a.mo26120h(arrayList);
                    v92 v92Var7 = this.f56817b;
                    if (v92Var7 != null) {
                        Objects.requireNonNull(v92Var7);
                        v92Var7.mo26120h(arrayList);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((w8i) it2.next()).m54074G();
                }
                this.f56821f.clear();
                this.f56821f.addAll(collection);
                this.f56822g.clear();
                this.f56822g.addAll(collectionM59056r);
                this.f56811M = w8iVarM59072s;
                this.f56812Q = h7gVarM59077y;
            } catch (IllegalArgumentException e) {
                if (z || m59064J() || this.f56823h.mo18287c() == 2) {
                    throw e;
                }
                e0(collection, true, z2);
            }
        }
    }

    /* renamed from: f */
    public void m59068f(boolean z) {
        this.f56816a.mo26118f(z);
    }

    public final void f0(Map map, Collection collection) {
        synchronized (this.f56827y) {
            if (this.f56824q != null && !collection.isEmpty()) {
                Integer numValueOf = Integer.valueOf(this.f56816a.mo26122j().mo38382d());
                boolean z = true;
                if (numValueOf == null) {
                    wja.m54638l("CameraUseCaseAdapter", "The lens facing is null, probably an external.");
                } else if (numValueOf.intValue() != 0) {
                    z = false;
                }
                Map mapM27765a = fyi.m27765a(this.f56816a.mo26115c().mo37112d(), z, this.f56824q.m25855a(), this.f56816a.mo26122j().mo38387j(this.f56824q.m25857c()), this.f56824q.m25858d(), this.f56824q.m25856b(), map);
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    w8i w8iVar = (w8i) it.next();
                    w8iVar.mo17067S((Rect) fgd.m26663g((Rect) mapM27765a.get(w8iVar)));
                }
            }
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                w8i w8iVar2 = (w8i) it2.next();
                w8iVar2.m54077R(m59057t(this.f56816a.mo26115c().mo37112d(), ((k7g) fgd.m26663g((k7g) map.get(w8iVar2))).mo35129e()));
            }
        }
    }

    /* renamed from: g */
    public void m59069g(Collection collection) {
        synchronized (this.f56827y) {
            this.f56816a.mo26123k(this.f56826x);
            v92 v92Var = this.f56817b;
            if (v92Var != null) {
                v92Var.mo26123k(this.f56826x);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f56821f);
            linkedHashSet.addAll(collection);
            try {
                v92 v92Var2 = this.f56817b;
                boolean z = true;
                boolean z2 = v92Var2 != null;
                if (v92Var2 == null) {
                    z = false;
                }
                e0(linkedHashSet, z2, z);
            } catch (IllegalArgumentException e) {
                throw new C18595a(e);
            }
        }
    }

    /* renamed from: m */
    public void m59070m() {
        synchronized (this.f56827y) {
            if (!this.f56809H) {
                if (!this.f56822g.isEmpty()) {
                    this.f56816a.mo26123k(this.f56826x);
                    v92 v92Var = this.f56817b;
                    if (v92Var != null) {
                        v92Var.mo26123k(this.f56826x);
                    }
                }
                this.f56816a.mo26120h(this.f56822g);
                v92 v92Var2 = this.f56817b;
                if (v92Var2 != null) {
                    v92Var2.mo26120h(this.f56822g);
                }
                m59067Z();
                Iterator it = this.f56822g.iterator();
                while (it.hasNext()) {
                    ((w8i) it.next()).m54074G();
                }
                this.f56809H = true;
            }
        }
    }

    /* renamed from: o */
    public final void m59071o() {
        synchronized (this.f56827y) {
            z82 z82VarMo26115c = this.f56816a.mo26115c();
            this.f56810L = z82VarMo26115c.mo37114f();
            z82VarMo26115c.mo37117i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w8i m59072s(Collection collection, h7g h7gVar) {
        w8i w8iVarM59075w;
        synchronized (this.f56827y) {
            ArrayList arrayList = new ArrayList(collection);
            if (h7gVar != null) {
                arrayList.add(h7gVar);
                arrayList.removeAll(h7gVar.h0());
            }
            if (!m59065O()) {
                w8iVarM59075w = null;
            } else if (m59046Q(arrayList)) {
                w8iVarM59075w = m59049T(this.f56811M) ? this.f56811M : m59076x();
            } else if (m59045P(arrayList)) {
                w8iVarM59075w = m59047R(this.f56811M) ? this.f56811M : m59075w();
            }
        }
        return w8iVarM59075w;
    }

    /* renamed from: u */
    public final Map m59073u(int i, u92 u92Var, Collection collection, Collection collection2, Map map) {
        Rect rectMo37112d;
        boolean z;
        ArrayList arrayList = new ArrayList();
        String strMo38380b = u92Var.mo38380b();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            w8i w8iVar = (w8i) it.next();
            os0 os0VarM42612a = os0.m42612a(this.f56818c.mo18208b(i, strMo38380b, w8iVar.m54092l(), w8iVar.m54086e()), w8iVar.m54092l(), w8iVar.m54086e(), ((k7g) fgd.m26663g(w8iVar.m54085d())).mo35126b(), h7g.f0(w8iVar), w8iVar.m54085d().mo35128d(), w8iVar.m54090i().m20539v(null));
            arrayList.add(os0VarM42612a);
            map3.put(os0VarM42612a, w8iVar);
            map2.put(w8iVar, w8iVar.m54085d());
        }
        if (!collection.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                rectMo37112d = this.f56816a.mo26115c().mo37112d();
            } catch (NullPointerException unused) {
                rectMo37112d = null;
            }
            qeg qegVar = new qeg(u92Var, rectMo37112d != null ? wuh.m55044m(rectMo37112d) : null);
            Iterator it2 = collection.iterator();
            loop1: while (true) {
                z = false;
                while (it2.hasNext()) {
                    w8i w8iVar2 = (w8i) it2.next();
                    C18597c c18597c = (C18597c) map.get(w8iVar2);
                    c9i c9iVarM54070C = w8iVar2.m54070C(u92Var, c18597c.f56828a, c18597c.f56829b);
                    map4.put(c9iVarM54070C, w8iVar2);
                    map5.put(c9iVarM54070C, qegVar.m45343m(c9iVarM54070C));
                    if (w8iVar2.m54090i() instanceof bhd) {
                        if (((bhd) w8iVar2.m54090i()).m20530B() == 2) {
                            z = true;
                        }
                    }
                }
            }
            Pair pairMo18207a = this.f56818c.mo18207a(i, strMo38380b, arrayList, map5, z, m59044N(collection));
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((w8i) entry.getValue(), (k7g) ((Map) pairMo18207a.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) pairMo18207a.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((w8i) map3.get(entry2.getKey()), (k7g) entry2.getValue());
                }
            }
        }
        return map2;
    }

    /* renamed from: v */
    public final void m59074v(Collection collection) {
        if (m59064J()) {
            if (m59042L(collection)) {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (m59043M(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
        }
        synchronized (this.f56827y) {
            if (!this.f56825s.isEmpty() && m59043M(collection)) {
                throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
            }
        }
    }

    /* renamed from: w */
    public final sc8 m59075w() {
        return new sc8.C16798b().m48169m("ImageCapture-Extra").m48160c();
    }

    /* renamed from: x */
    public final ahd m59076x() {
        ahd ahdVarM17075c = new ahd.C12173a().m17083l("Preview-Extra").m17075c();
        ahdVarM17075c.i0(new ahd.InterfaceC12175c() { // from class: o.xa2
            @Override // p001o.ahd.InterfaceC12175c
            /* renamed from: a */
            public final void mo4739a(bgg bggVar) throws ExecutionException, InterruptedException {
                za2.m59053X(bggVar);
            }
        });
        return ahdVarM17075c;
    }

    /* renamed from: y */
    public final h7g m59077y(Collection collection, boolean z) {
        synchronized (this.f56827y) {
            Set setM59062H = m59062H(collection, z);
            if (setM59062H.size() < 2 && (!m59064J() || !m59044N(setM59062H))) {
                return null;
            }
            h7g h7gVar = this.f56812Q;
            if (h7gVar != null && h7gVar.h0().equals(setM59062H)) {
                h7g h7gVar2 = this.f56812Q;
                Objects.requireNonNull(h7gVar2);
                return h7gVar2;
            }
            if (!m59050U(setM59062H)) {
                return null;
            }
            return new h7g(this.f56816a, this.f56817b, this.h0, this.i0, setM59062H, this.f56819d);
        }
    }

    /* renamed from: z */
    public void m59078z() {
        synchronized (this.f56827y) {
            if (this.f56809H) {
                this.f56816a.mo26121i(new ArrayList(this.f56822g));
                v92 v92Var = this.f56817b;
                if (v92Var != null) {
                    v92Var.mo26121i(new ArrayList(this.f56822g));
                }
                m59071o();
                this.f56809H = false;
            }
        }
    }
}
