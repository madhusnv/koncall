package nf;

import a1.AbstractC0019r;
import a1.C0004c;
import a1.C0005d;
import a1.C0007f;
import a1.C0011j;
import a1.C0013l;
import a1.C0018q;
import a1.C0020s;
import a1.EnumC0015n;
import a1.RunnableC0012k;
import a1.b0;
import a1.f0;
import ai.AbstractC0145b;
import ai.AbstractC0146c;
import ai.AbstractC0159p;
import ai.AbstractC0160q;
import ai.C0155l;
import ai.C0156m;
import ai.InterfaceC0157n;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Parcel;
import android.telephony.PhoneNumberUtils;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import b2.y0;
import b6.InterfaceC0600a;
import be.C0655j;
import bi.C0663b;
import c0.b1;
import c0.j1;
import c0.p1;
import c0.x1;
import c6.v0;
import c8.C0898a;
import c9.C0910e;
import c9.C0917l;
import ce.InterfaceC0961b;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.crypto.tink.shaded.protobuf.C1390q;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.i18n.phonenumbers.C1404a;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.InterfaceC1563q;
import d3.a0;
import d6.InterfaceC1627q;
import ee.C2033a;
import ee.C2034b;
import em.C2067a;
import ex.InterfaceC2142f;
import fd.InterfaceC2264b;
import fd.InterfaceC2269g;
import fl.InterfaceC2321a;
import g2.w4;
import g4.C2492h;
import g4.n0;
import gb.C2555e;
import ge.C2577i;
import ge.C2580l;
import ge.C2583o;
import gl.C2627c;
import h1.InterfaceC2786q;
import h1.InterfaceC2795z;
import hc.AbstractC2887j;
import hd.C2891c;
import hi.o1;
import hi.o2;
import hi.y1;
import hi.z0;
import i0.InterfaceC3093x;
import i0.c1;
import i0.d1;
import i0.e0;
import i0.g0;
import i0.m1;
import i0.r2;
import i00.C3103h;
import i00.C3119x;
import i00.InterfaceC3099d;
import i00.InterfaceC3101f;
import i00.InterfaceC3102g;
import i00.p0;
import ig.AbstractC3253i;
import ig.BinderC3246b;
import ig.C3247c;
import ig.C3249e;
import ig.C3258n;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import k1.C3932g;
import k4.C4001v;
import k8.InterfaceC4024a;
import k8.InterfaceC4025b;
import ke.AbstractC4066g;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import l0.InterfaceC4303c;
import l1.C4327p;
import l4.C4381z;
import l4.InterfaceC4374s;
import l4.i0;
import l4.k0;
import l8.InterfaceC4431e;
import lf.C4454e;
import m0.C4609c;
import m2.C4640e;
import mz.C4920d;
import n1.AbstractC4941a;
import nz.C5190a;
import nz.C5194e;
import nz.C5201l;
import nz.C5206q;
import nz.C5207r;
import nz.C5208s;
import og.pe;
import og.u1;
import og.we;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.json.JSONException;
import pg.l8;
import pg.o7;
import pg.w9;
import q0.RunnableC6064e;
import q3.C6105e;
import qw.C6361k;
import r5.AbstractC6468c;
import retrofit2.HttpException;
import rf.InterfaceC6505j;
import rw.AbstractC6663m;
import rw.AbstractC6674x;
import rw.C6669s;
import sc.InterfaceC6786f;
import sk.C6853a;
import sk.C6860h;
import td.C7126c;
import td.EnumC7143t;
import tx.InterfaceC7250j;
import wd.C7995c;
import wd.C7998f;
import yd.EnumC8622e;
import yg.C8650g;
import yg.C8656m;
import yg.InterfaceC8649f;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nf.i */
/* loaded from: classes.dex */
public final class C5047i implements j1, InterfaceC4303c, InterfaceC4025b, InterfaceC1627q, k0, InterfaceC4374s, InterfaceC8649f, InterfaceC2321a, d1, InterfaceC2786q, InterfaceC2264b, InterfaceC2269g, m1, InterfaceC3102g, InterfaceC3101f, InterfaceC6505j, InterfaceC6786f {

    /* renamed from: c */
    public static C5047i f24821c;

    /* renamed from: a */
    public final /* synthetic */ int f24822a;

    /* renamed from: b */
    public Object f24823b;

    public /* synthetic */ C5047i(int i10) {
        this.f24822a = i10;
    }

    /* renamed from: F */
    public static p1 m9969F(b1 b1Var) {
        if (b1Var == null) {
            return null;
        }
        return new p1(b1Var, new Size(b1Var.mo2136b(), b1Var.getHeight()), new C4609c(new C6105e((InterfaceC3093x) null, r2.f16576b, b1Var.mo2135X().mo2195c())));
    }

    /* renamed from: N */
    public static C2583o m9970N(C0655j c0655j, C2577i c2577i, C2033a c2033a, C2034b c2034b) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c2577i.f14018a.getResources(), c2034b.f9591a);
        EnumC8622e enumC8622e = EnumC8622e.MEMORY_CACHE;
        Map map = c2034b.f9592b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z6 = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = AbstractC4066g.f20920a;
        if (c0655j != null && c0655j.f4192b) {
            z6 = true;
        }
        return new C2583o(bitmapDrawable, c2577i, enumC8622e, c2033a, str, zBooleanValue, z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x040a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a1  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m9972Q(nf.C5047i r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.C5047i.m9972Q(nf.i, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: S */
    public static final C5047i m9973S(C0910e c0910e, C0663b c0663b) throws GeneralSecurityException {
        z0 z0VarM7241q = z0.m7241q(c0910e.m2586E(), C1390q.m4366a());
        if (z0VarM7241q.m7242o().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            y1 y1VarM7233t = y1.m7233t(c0663b.mo309b(z0VarM7241q.m7242o().m4278h(), new byte[0]), C1390q.m4366a());
            if (y1VarM7233t.m7235p() > 0) {
                return new C5047i(2, y1VarM7233t);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: Z */
    public static synchronized C5047i m9974Z(Context context) {
        C5047i c5047i;
        Context applicationContext = context.getApplicationContext();
        synchronized (C5047i.class) {
            c5047i = f24821c;
            if (c5047i == null) {
                c5047i = new C5047i(applicationContext);
                f24821c = c5047i;
            }
        }
        return c5047i;
        return c5047i;
    }

    @Override // i00.InterfaceC3102g
    /* renamed from: A */
    public void mo5818A(InterfaceC3099d interfaceC3099d, p0 p0Var) {
        C3103h c3103h = (C3103h) this.f24823b;
        if (p0Var.f16730a.f17932r) {
            c3103h.complete(p0Var.f16731b);
        } else {
            c3103h.completeExceptionally(new HttpException(p0Var));
        }
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: B */
    public long mo35B() {
        return ((C2891c) this.f24823b).mo35B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c0.j1
    /* renamed from: C */
    public void mo2206C(x1 x1Var) {
        b0 b0Var;
        if (!o7.m11808c()) {
            AbstractC6468c.m12452c(((C0018q) this.f24823b).getContext()).execute(new RunnableC0012k(0, this, x1Var));
            return;
        }
        u1.m10942a("PreviewView");
        g0 g0Var = x1Var.f5261d;
        ((C0018q) this.f24823b).f79j = g0Var.mo7319q();
        C0020s c0020s = ((C0018q) this.f24823b).f78h;
        Rect rectMo7324g = g0Var.mo7319q().mo7324g();
        c0020s.getClass();
        new Rational(rectMo7324g.width(), rectMo7324g.height());
        synchronized (c0020s) {
            c0020s.f88b = rectMo7324g;
        }
        x1Var.m2237b(AbstractC6468c.m12452c(((C0018q) this.f24823b).getContext()), new C0013l(0, this, g0Var, x1Var));
        C0018q c0018q = (C0018q) this.f24823b;
        AbstractC0019r abstractC0019r = c0018q.f72b;
        EnumC0015n enumC0015n = c0018q.f71a;
        if (!(abstractC0019r instanceof b0) || C0018q.m98b(x1Var, enumC0015n)) {
            C0018q c0018q2 = (C0018q) this.f24823b;
            if (C0018q.m98b(x1Var, c0018q2.f71a)) {
                C0018q c0018q3 = (C0018q) this.f24823b;
                f0 f0Var = new f0(c0018q3, c0018q3.f74d);
                f0Var.f46i = false;
                f0Var.f48k = new AtomicReference();
                b0Var = f0Var;
            } else {
                C0018q c0018q4 = (C0018q) this.f24823b;
                b0Var = new b0(c0018q4, c0018q4.f74d);
            }
            c0018q2.f72b = b0Var;
        }
        e0 e0VarMo7319q = g0Var.mo7319q();
        C0018q c0018q5 = (C0018q) this.f24823b;
        C0007f c0007f = new C0007f(e0VarMo7319q, c0018q5.f76f, c0018q5.f72b);
        ((C0018q) this.f24823b).f77g.set(c0007f);
        g0Var.mo7309b().mo2184a(AbstractC6468c.m12452c(((C0018q) this.f24823b).getContext()), c0007f);
        ((C0018q) this.f24823b).f72b.mo12g(x1Var, new C0013l(this, c0007f, g0Var));
        C0018q c0018q6 = (C0018q) this.f24823b;
        if (c0018q6.indexOfChild(c0018q6.f73c) == -1) {
            C0018q c0018q7 = (C0018q) this.f24823b;
            c0018q7.addView(c0018q7.f73c);
        }
    }

    @Override // i0.d1
    /* renamed from: D */
    public b1 mo1870D() {
        return m9969F(((j4) this.f24823b).mo1870D());
    }

    /* renamed from: E */
    public void m9975E(CancellationException cancellationException) {
        C4640e c4640e = (C4640e) this.f24823b;
        int i10 = c4640e.f22886c;
        InterfaceC7250j[] interfaceC7250jArr = new InterfaceC7250j[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC7250jArr[i11] = ((C3932g) c4640e.f22884a[i11]).f20101b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            interfaceC7250jArr[i12].cancel(cancellationException);
        }
        if (c4640e.f22886c == 0) {
            return;
        }
        AbstractC4941a.m9886c("uncancelled requests present");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b3, code lost:
    
        if (r7 != false) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ee.C2034b m9976G(ge.C2577i r18, ee.C2033a r19, he.C2916g r20, he.EnumC2915f r21) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.C5047i.m9976G(ge.i, ee.a, he.g, he.f):ee.b");
    }

    /* renamed from: H */
    public Object m9977H(Class cls) throws GeneralSecurityException {
        byte[] bArrArray;
        InterfaceC0157n interfaceC0157n = (InterfaceC0157n) AbstractC0159p.f497e.get(cls);
        Class clsMo361a = interfaceC0157n == null ? null : interfaceC0157n.mo361a();
        if (clsMo361a == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        y1 y1Var = (y1) this.f24823b;
        int i10 = AbstractC0160q.f498a;
        int iM7237r = y1Var.m7237r();
        byte b10 = 1;
        boolean z6 = true;
        int i11 = 0;
        boolean z10 = false;
        for (hi.x1 x1Var : y1Var.m7236q()) {
            if (x1Var.m7225t() == o1.ENABLED) {
                if (!x1Var.m7226u()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(x1Var.m7223r())));
                }
                if (x1Var.m7224s() == o2.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(x1Var.m7223r())));
                }
                if (x1Var.m7225t() == o1.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(x1Var.m7223r())));
                }
                if (x1Var.m7223r() == iM7237r) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (x1Var.m7222q().m7157q() != hi.m1.ASYMMETRIC_PUBLIC) {
                    z6 = false;
                }
                i11++;
            }
        }
        if (i11 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z6) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        C0005d c0005d = new C0005d(clsMo361a);
        Class cls2 = (Class) c0005d.f26d;
        for (hi.x1 x1Var2 : y1Var.m7236q()) {
            o1 o1VarM7225t = x1Var2.m7225t();
            o1 o1Var = o1.ENABLED;
            if (o1VarM7225t == o1Var) {
                Object objM367d = AbstractC0159p.m367d(x1Var2.m7222q().m7158r(), x1Var2.m7222q().m7159s(), clsMo361a);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0005d.f24b;
                if (x1Var2.m7225t() != o1Var) {
                    throw new GeneralSecurityException("only ENABLED key is allowed");
                }
                int i12 = AbstractC0145b.f477a[x1Var2.m7224s().ordinal()];
                if (i12 == b10 || i12 == 2) {
                    bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(x1Var2.m7223r()).array();
                } else if (i12 == 3) {
                    bArrArray = ByteBuffer.allocate(5).put(b10).putInt(x1Var2.m7223r()).array();
                } else {
                    if (i12 != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    bArrArray = AbstractC0146c.f478a;
                }
                C0155l c0155l = new C0155l(objM367d, bArrArray, x1Var2.m7225t(), x1Var2.m7224s());
                ArrayList arrayList = new ArrayList();
                arrayList.add(c0155l);
                C0156m c0156m = new C0156m(c0155l.m360a());
                List list = (List) concurrentHashMap.put(c0156m, Collections.unmodifiableList(arrayList));
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list);
                    arrayList2.add(c0155l);
                    concurrentHashMap.put(c0156m, Collections.unmodifiableList(arrayList2));
                }
                if (x1Var2.m7223r() != y1Var.m7237r()) {
                    continue;
                } else {
                    if (c0155l.f489c != o1Var) {
                        throw new IllegalArgumentException("the primary entry has to be ENABLED");
                    }
                    if (c0005d.m80y(c0155l.m360a()).isEmpty()) {
                        throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                    }
                    c0005d.f25c = c0155l;
                }
            }
            b10 = 1;
        }
        InterfaceC0157n interfaceC0157n2 = (InterfaceC0157n) AbstractC0159p.f497e.get(cls);
        if (interfaceC0157n2 == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls2.getName()));
        }
        if (interfaceC0157n2.mo361a().equals(cls2)) {
            return interfaceC0157n2.mo363c(c0005d);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + interfaceC0157n2.mo361a() + ", got " + cls2);
    }

    /* renamed from: I */
    public int m9978I() {
        boolean zIsEmpty;
        ConcurrentLinkedQueue concurrentLinkedQueue = ((C5207r) this.f24823b).f25402g;
        int i10 = 0;
        if (concurrentLinkedQueue != null && concurrentLinkedQueue.isEmpty()) {
            return 0;
        }
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            C5206q c5206q = (C5206q) it.next();
            AbstractC4154l.m8920c(c5206q);
            synchronized (c5206q) {
                zIsEmpty = c5206q.f25394t.isEmpty();
            }
            if (zIsEmpty && (i10 = i10 + 1) < 0) {
                pe.m10841p();
                throw null;
            }
        }
        return i10;
    }

    /* renamed from: J */
    public void m9979J(float f6, float f10, float f11, float f12) {
        C0005d c0005d = (C0005d) this.f24823b;
        InterfaceC1563q interfaceC1563qM75t = c0005d.m75t();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0005d.m81z() >> 32)) - (f11 + f6);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0005d.m81z() & 4294967295L)) - (f12 + f10)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= DefinitionKt.NO_Float_VALUE && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= DefinitionKt.NO_Float_VALUE)) {
            a0.m5088a("Width and height must be greater than or equal to zero");
        }
        c0005d.e0(jFloatToRawIntBits);
        interfaceC1563qM75t.mo5112n(f6, f10);
    }

    /* renamed from: K */
    public C2033a m9980K(C2577i c2577i, Object obj, C2580l c2580l, C7995c c7995c) {
        String strMo2725a;
        Map linkedHashMap;
        c2577i.getClass();
        List list = c2577i.f14023f;
        List list2 = ((C7998f) this.f24823b).f38451f.f38432c;
        int size = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                strMo2725a = null;
                break;
            }
            C6361k c6361k = (C6361k) list2.get(i10);
            InterfaceC0961b interfaceC0961b = (InterfaceC0961b) c6361k.f30755a;
            if (((Class) c6361k.f30756b).isAssignableFrom(obj.getClass())) {
                AbstractC4154l.m8921d(interfaceC0961b, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                strMo2725a = interfaceC0961b.mo2725a(obj, c2580l);
                if (strMo2725a != null) {
                    break;
                }
            }
            i10++;
        }
        if (strMo2725a == null) {
            return null;
        }
        Map map = c2577i.f14041x.f14062a;
        boolean zIsEmpty = map.isEmpty();
        C6669s c6669s = C6669s.f31944a;
        if (zIsEmpty) {
            linkedHashMap = c6669s;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
        }
        if (list.isEmpty() && linkedHashMap.isEmpty()) {
            return new C2033a(strMo2725a, c6669s);
        }
        LinkedHashMap linkedHashMapM12786n = AbstractC6674x.m12786n(linkedHashMap);
        if (!list.isEmpty()) {
            if (list.size() > 0) {
                list.get(0).getClass();
                throw new ClassCastException();
            }
            linkedHashMapM12786n.put("coil#transformation_size", c2580l.f14048d.toString());
        }
        return new C2033a(strMo2725a, linkedHashMapM12786n);
    }

    @Override // i00.InterfaceC3102g
    /* renamed from: L */
    public void mo5819L(InterfaceC3099d interfaceC3099d, Throwable th2) {
        ((C3103h) this.f24823b).completeExceptionally(th2);
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: M */
    public void mo45M(Throwable th2) throws Exception {
        switch (this.f24822a) {
            case 5:
                ((c0.p0) this.f24823b).close();
                break;
        }
    }

    @Override // fl.InterfaceC2321a
    /* renamed from: R */
    public Point[] mo5987R() {
        return ((we) this.f24823b).f26901e;
    }

    /* renamed from: T */
    public void m9982T() {
        C4640e c4640e = (C4640e) this.f24823b;
        C4266h c4266hM11919j = w9.m11919j(0, c4640e.f22886c);
        int i10 = c4266hM11919j.f21646a;
        int i11 = c4266hM11919j.f21647b;
        if (i10 <= i11) {
            while (true) {
                ((C3932g) c4640e.f22884a[i10]).f20101b.resumeWith(qw.a0.f30746a);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        c4640e.m9511h();
    }

    /* renamed from: U */
    public void m9983U(float f6, long j6) {
        InterfaceC1563q interfaceC1563qM75t = ((C0005d) this.f24823b).m75t();
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        interfaceC1563qM75t.mo5112n(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        interfaceC1563qM75t.mo5103e(f6);
        interfaceC1563qM75t.mo5112n(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
    }

    /* renamed from: V */
    public void m9984V(float f6, float f10, long j6) {
        InterfaceC1563q interfaceC1563qM75t = ((C0005d) this.f24823b).m75t();
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        interfaceC1563qM75t.mo5112n(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        interfaceC1563qM75t.mo5102c(f6, f10);
        interfaceC1563qM75t.mo5112n(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
    }

    /* renamed from: W */
    public void m9985W(float f6, float f10) {
        ((C0005d) this.f24823b).m75t().mo5112n(f6, f10);
    }

    /* renamed from: X */
    public void m9986X(C4381z c4381z, long j6, boolean z6, C0011j c0011j) {
        y0 y0Var = (y0) this.f24823b;
        y0Var.m1705o(n0.m6455b(y0.m1691a(y0Var, c4381z, j6, z6, false, c0011j, false)) ? x1.k0.Cursor : x1.k0.Selection);
    }

    @Override // l4.InterfaceC4374s
    /* renamed from: Y */
    public int mo2733Y(int i10) {
        w4 w4Var = (w4) this.f24823b;
        if (i10 < w4Var.f13108b) {
            return i10;
        }
        if (i10 < w4Var.f13109c) {
            return i10 + 1;
        }
        int i11 = w4Var.f13110d;
        return i10 <= i11 ? i10 + 2 : i11 + 2;
    }

    @Override // i0.d1
    /* renamed from: a */
    public void mo1871a(c1 c1Var, Executor executor) {
        ((j4) this.f24823b).mo1871a(new C0004c(13, this, c1Var), executor);
    }

    public synchronized void a0() {
        C5040b c5040b = (C5040b) this.f24823b;
        ReentrantLock reentrantLock = c5040b.f24801a;
        reentrantLock.lock();
        try {
            c5040b.f24802b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rf.InterfaceC6505j
    public void accept(Object obj, Object obj2) {
        BinderC3246b binderC3246b = new BinderC3246b((C8650g) obj2, 1);
        C3258n c3258n = (C3258n) ((C3249e) obj).m13009t();
        C4454e c4454e = (C4454e) this.f24823b;
        Parcel parcelM3755f = c3258n.m3755f();
        int i10 = AbstractC3253i.f17432a;
        parcelM3755f.writeStrongBinder(binderC3246b);
        AbstractC3253i.m7600c(parcelM3755f, c4454e);
        c3258n.m3756g(parcelM3755f, 1);
    }

    @Override // i0.d1
    /* renamed from: b */
    public int mo1872b() {
        return ((j4) this.f24823b).mo1872b();
    }

    @Override // d6.InterfaceC1627q
    /* renamed from: c */
    public boolean mo5301c(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f24823b;
        if (!swipeDismissBehavior.mo4048r(view)) {
            return false;
        }
        Field field = v0.f5527a;
        boolean z6 = view.getLayoutDirection() == 1;
        int i10 = swipeDismissBehavior.f6729c;
        view.offsetLeftAndRight((!(i10 == 0 && z6) && (i10 != 1 || z6)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(DefinitionKt.NO_Float_VALUE);
        return true;
    }

    @Override // i0.d1
    public void close() {
        ((j4) this.f24823b).close();
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: d */
    public String mo62d() {
        return ((C2891c) this.f24823b).mo62d();
    }

    @Override // fd.InterfaceC2264b
    /* renamed from: e */
    public void mo63e() {
        throw new DeserializationException("This should not be called during deserialization.");
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: f */
    public int mo64f() {
        return ((C2891c) this.f24823b).mo64f();
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: g */
    public void mo65g(Object obj) {
        switch (this.f24822a) {
            case 5:
                break;
            default:
                ((RunnableC6064e) this.f24823b).run();
                break;
        }
    }

    @Override // h1.InterfaceC2786q
    public InterfaceC2795z get(int i10) {
        return (h1.b0) this.f24823b;
    }

    @Override // fl.InterfaceC2321a
    public int getFormat() {
        return ((we) this.f24823b).f26897a;
    }

    @Override // i0.d1
    public int getHeight() {
        return ((j4) this.f24823b).getHeight();
    }

    @Override // i0.d1
    public Surface getSurface() {
        return ((j4) this.f24823b).getSurface();
    }

    @Override // i0.d1
    /* renamed from: h */
    public b1 mo1878h() {
        return m9969F(((j4) this.f24823b).mo1878h());
    }

    @Override // i00.InterfaceC3101f
    /* renamed from: i */
    public Object mo2663i(C3119x c3119x) {
        C3103h c3103h = new C3103h(c3119x);
        c3119x.mo7442j(new C8989c(20, c3103h));
        return c3103h;
    }

    @Override // i0.d1
    /* renamed from: j */
    public int mo1880j() {
        return ((j4) this.f24823b).mo1880j();
    }

    @Override // i0.d1
    /* renamed from: k */
    public void mo1881k() {
        ((j4) this.f24823b).mo1881k();
    }

    @Override // i00.InterfaceC3101f
    /* renamed from: l */
    public Type mo2666l() {
        return (Type) this.f24823b;
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: m */
    public AbstractC2887j mo70m() {
        return ((C2891c) this.f24823b).mo70m();
    }

    @Override // fd.InterfaceC2264b
    /* renamed from: n */
    public Integer mo71n() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // sc.InterfaceC6786f
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1858o(sc.C6804x r6, ww.AbstractC8193c r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f24823b
            gb.e r0 = (gb.C2555e) r0
            boolean r1 = r7 instanceof jb.C3699a
            if (r1 == 0) goto L17
            r1 = r7
            jb.a r1 = (jb.C3699a) r1
            int r2 = r1.f19441d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f19441d = r2
            goto L1c
        L17:
            jb.a r1 = new jb.a
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r7 = r1.f19439b
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f19441d
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            sc.x r6 = r1.f19438a
            og.od.m10798c(r7)
            goto L4c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            og.od.m10798c(r7)
            ib.b r7 = jb.a3.m8270a(r0, r6)
            ng.u r0 = r0.f13945p
            r1.f19438a = r6
            r1.f19441d = r4
            r0.getClass()
            bc.a r7 = ng.C5070u.m10004n(r7)
            if (r7 != r2) goto L4c
            return r2
        L4c:
            bc.a r7 = (bc.C0642a) r7
            ec.b r0 = r7.f4114b
            ec.a r1 = yb.AbstractC8610b.f41875c
            boolean r1 = r0.mo1861a(r1)
            if (r1 == 0) goto L5f
            bd.a r1 = r6.f32335a
            yb.c r2 = yb.EnumC8611c.SERVICE_ENDPOINT_OVERRIDE
            yb.AbstractC8610b.m15956b(r1, r2)
        L5f:
            ec.a r1 = yb.AbstractC8610b.f41874b
            boolean r1 = r0.mo1861a(r1)
            if (r1 == 0) goto L6e
            bd.a r1 = r6.f32335a
            yb.c r2 = yb.EnumC8611c.ACCOUNT_ID_BASED_ENDPOINT
            yb.AbstractC8610b.m15956b(r1, r2)
        L6e:
            ec.a r1 = tb.AbstractC7094e.f34214d
            boolean r2 = r0.mo1861a(r1)
            if (r2 == 0) goto L89
            java.lang.Object r0 = og.ud.m10978d(r0, r1)
            java.lang.String r1 = "s3express"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L89
            bd.a r0 = r6.f32335a
            pa.a r1 = pa.EnumC5867a.S3_EXPRESS_BUCKET
            yb.AbstractC8610b.m15956b(r0, r1)
        L89:
            vc.a r0 = r6.f32337c
            ec.b r0 = r0.getAttributes()
            ec.a r1 = da.AbstractC1678a.f8215b
            boolean r0 = r0.mo1861a(r1)
            if (r0 == 0) goto L9e
            bd.a r6 = r6.f32335a
            yb.c r0 = yb.EnumC8611c.RESOLVED_ACCOUNT_ID
            yb.AbstractC8610b.m15956b(r6, r0)
        L9e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.C5047i.mo1858o(sc.x, ww.c):java.lang.Object");
    }

    @Override // i0.m1
    public void onError(Throwable th2) {
        u1.m10944c("ObserverToConsumerAdapter");
    }

    @Override // yg.InterfaceC8649f
    /* renamed from: p */
    public C8656m mo23p(Object obj) {
        ((C2627c) this.f24823b).getClass();
        return l8.m11765f((List) obj);
    }

    @Override // i0.m1
    /* renamed from: q */
    public void mo88q(Object obj) {
        ((InterfaceC0600a) this.f24823b).accept(obj);
    }

    @Override // fl.InterfaceC2321a
    /* renamed from: r */
    public Rect mo5988r() {
        we weVar = (we) this.f24823b;
        if (weVar.f26901e == null) {
            return null;
        }
        int i10 = 0;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = weVar.f26901e;
            if (i10 >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i10];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i10++;
        }
    }

    @Override // k8.InterfaceC4025b
    /* renamed from: s */
    public InterfaceC4024a mo8823s(String fileName) {
        AbstractC4154l.m8923f(fileName, "fileName");
        return new C0898a(((InterfaceC4431e) this.f24823b).mo9273O());
    }

    @Override // fl.InterfaceC2321a
    /* renamed from: t */
    public String mo5989t() {
        return ((we) this.f24823b).f26898b;
    }

    public String toString() {
        switch (this.f24822a) {
            case 2:
                return AbstractC0160q.m371a((y1) this.f24823b).toString();
            default:
                return super.toString();
        }
    }

    @Override // fl.InterfaceC2321a
    /* renamed from: u */
    public int mo5990u() {
        return ((we) this.f24823b).f26900d;
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: v */
    public C7126c mo77v(EnumC7143t format) {
        AbstractC4154l.m8923f(format, "format");
        return ((C2891c) this.f24823b).mo77v(format);
    }

    @Override // l4.InterfaceC4374s
    /* renamed from: w */
    public int mo2753w(int i10) {
        w4 w4Var = (w4) this.f24823b;
        if (i10 <= w4Var.f13108b - 1) {
            return i10;
        }
        if (i10 <= w4Var.f13109c - 1) {
            return i10 - 1;
        }
        int i11 = w4Var.f13110d;
        return i10 <= i11 + 1 ? i10 - 2 : i11;
    }

    @Override // fd.InterfaceC2269g
    /* renamed from: x */
    public boolean mo79x() {
        return ((C2891c) this.f24823b).mo79x();
    }

    @Override // l4.k0
    /* renamed from: y */
    public i0 mo6334y(C2492h text) {
        AbstractC4154l.m8923f(text, "text");
        String str = text.f13620b;
        int selectionEnd = Selection.getSelectionEnd(text);
        C6853a c6853a = (C6853a) this.f24823b;
        c6853a.getClass();
        c6853a.f32538c.setLength(0);
        c6853a.f32539d.setLength(0);
        c6853a.f32536a.setLength(0);
        c6853a.f32548m = 0;
        c6853a.f32537b = "";
        c6853a.f32549n.setLength(0);
        c6853a.f32551p = "";
        c6853a.f32552q.setLength(0);
        c6853a.f32540e = true;
        c6853a.f32541f = false;
        c6853a.f32542g = false;
        c6853a.f32543h = false;
        c6853a.f32553r.clear();
        c6853a.f32550o = false;
        if (!c6853a.f32547l.equals(c6853a.f32546k)) {
            String str2 = c6853a.f32545j;
            C1404a c1404a = c6853a.f32544i;
            C6860h c6860hM4509g = c1404a.m4509g(c1404a.m4511k(c1404a.m4507d(str2)));
            if (c6860hM4509g == null) {
                c6860hM4509g = C6853a.f32532t;
            }
            c6853a.f32547l = c6860hM4509g;
        }
        int i10 = selectionEnd - 1;
        String strM13058h = null;
        int i11 = 0;
        char c2 = 0;
        int i12 = 0;
        boolean z6 = false;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            int i13 = i12 + 1;
            if (PhoneNumberUtils.isNonSeparator(cCharAt)) {
                if (c2 != 0) {
                    strM13058h = z6 ? c6853a.m13058h(c2, true) : c6853a.m13058h(c2, false);
                    z6 = false;
                }
                c2 = cCharAt;
            }
            if (i12 == i10) {
                z6 = true;
            }
            i11++;
            i12 = i13;
        }
        if (c2 != 0) {
            strM13058h = z6 ? c6853a.m13058h(c2, true) : c6853a.m13058h(c2, false);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (strM13058h != null) {
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i14 < strM13058h.length()) {
                int i17 = i15 + 1;
                if (PhoneNumberUtils.isNonSeparator(strM13058h.charAt(i14))) {
                    arrayList.add(Integer.valueOf(i15));
                } else {
                    i16++;
                }
                if (i15 > 0) {
                    i15 -= i16;
                }
                arrayList2.add(Integer.valueOf(i15));
                i14++;
                i15 = i17;
            }
        }
        Integer num = (Integer) AbstractC6663m.m12752P(arrayList);
        arrayList.add(Integer.valueOf(num != null ? num.intValue() + 1 : 0));
        Integer num2 = (Integer) AbstractC6663m.m12752P(arrayList2);
        arrayList2.add(Integer.valueOf(num2 != null ? num2.intValue() + 1 : 0));
        return new i0(new C2492h(strM13058h != null ? strM13058h : ""), new C8989c(11, new C2067a(strM13058h, arrayList, arrayList2)));
    }

    @Override // i0.d1
    /* renamed from: z */
    public int mo1884z() {
        return ((j4) this.f24823b).mo1884z();
    }

    public /* synthetic */ C5047i(int i10, Object obj) {
        this.f24822a = i10;
        this.f24823b = obj;
    }

    public /* synthetic */ C5047i(C2627c c2627c, int i10, int i11) {
        this.f24822a = 16;
        this.f24823b = c2627c;
    }

    public /* synthetic */ C5047i(C3247c c3247c, C4454e c4454e) {
        this.f24822a = 25;
        this.f24823b = c4454e;
    }

    public C5047i(Context context) {
        String strM9960d;
        this.f24822a = 0;
        C5040b c5040bM9956a = C5040b.m9956a(context);
        this.f24823b = c5040bM9956a;
        c5040bM9956a.m9958b();
        String strM9960d2 = c5040bM9956a.m9960d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strM9960d2) || (strM9960d = c5040bM9956a.m9960d(C5040b.m9957f("googleSignInOptions", strM9960d2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.m3087b(strM9960d);
        } catch (JSONException unused) {
        }
    }

    public C5047i(String str) {
        this.f24822a = 13;
        C1404a.m4499e().getClass();
        this.f24823b = new C6853a(str);
    }

    public C5047i(InterfaceC4431e openHelper) {
        this.f24822a = 7;
        AbstractC4154l.m8923f(openHelper, "openHelper");
        this.f24823b = openHelper;
    }

    public C5047i(C7998f c7998f, C0917l c0917l) {
        this.f24822a = 12;
        this.f24823b = c7998f;
    }

    public C5047i(WorkDatabase workDatabase) {
        this.f24822a = 8;
        AbstractC4154l.m8923f(workDatabase, "workDatabase");
        this.f24823b = workDatabase;
    }

    public C5047i() {
        this.f24822a = 29;
        this.f24823b = new C4640e(new C3932g[16]);
    }

    /* renamed from: O */
    public void m9981O() {
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [iz.j] */
    public C5047i(long j6, C4920d c4920d, int i10, int i11, int i12, int i13, boolean z6, boolean z10, C4327p c4327p, int i14) {
        this.f24822a = 26;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j10 = (i14 & 2) != 0 ? 5L : j6;
        timeUnit = (i14 & 4) != 0 ? TimeUnit.MINUTES : timeUnit;
        C4920d taskRunner = (i14 & 8) != 0 ? C4920d.f24472l : c4920d;
        int i15 = (i14 & 32) != 0 ? 10000 : i10;
        int i16 = (i14 & 64) != 0 ? 10000 : i11;
        int i17 = (i14 & 128) != 0 ? 10000 : i12;
        int i18 = (i14 & 256) != 0 ? 10000 : i13;
        int i19 = (i14 & 512) == 0 ? 0 : 10000;
        boolean z11 = (i14 & 1024) != 0 ? true : z6;
        boolean z12 = (i14 & NewHope.SENDB_BYTES) == 0 ? z10 : true;
        C4327p c4327p2 = (i14 & 4096) != 0 ? new C4327p(8) : c4327p;
        AbstractC4154l.m8923f(timeUnit, "timeUnit");
        AbstractC4154l.m8923f(taskRunner, "taskRunner");
        final C4327p c4327p3 = c4327p2;
        final C4920d c4920d2 = taskRunner;
        final int i20 = i15;
        final int i21 = i19;
        final int i22 = i16;
        final int i23 = i17;
        final int i24 = i18;
        final boolean z13 = z11;
        final boolean z14 = z12;
        this.f24823b = new C5207r(c4920d2, 5, j10, timeUnit, C5194e.f25326a, new InterfaceC2142f() { // from class: iz.j
            @Override // ex.InterfaceC2142f
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                C5207r pool = (C5207r) obj;
                C3368a address = (C3368a) obj2;
                C5190a user = (C5190a) obj3;
                AbstractC4154l.m8923f(pool, "pool");
                AbstractC4154l.m8923f(address, "address");
                AbstractC4154l.m8923f(user, "user");
                C4920d c4920d3 = c4920d2;
                return new C5201l(new C4001v(12, new C5208s(c4920d3, pool, i20, i22, i23, i24, i21, z13, z14, address, c4327p3, user)), c4920d3);
            }
        });
    }

    /* renamed from: P */
    private final void m9971P(Throwable th2) {
    }

    public C5047i(C2555e config) {
        this.f24822a = 28;
        AbstractC4154l.m8923f(config, "config");
        this.f24823b = config;
    }

    public C5047i(float f6, float f10) {
        this.f24822a = 19;
        this.f24823b = new h1.b0(f6, f10, 0.01f);
    }
}
