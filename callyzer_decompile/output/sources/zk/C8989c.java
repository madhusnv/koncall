package zk;

import a2.AbstractC0030c;
import ad.C0109p;
import ai.AbstractC0151h;
import ai.AbstractC0152i;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import b2.C0554l;
import bc.C0642a;
import bg.AbstractC0656a;
import c0.a1;
import c0.b1;
import c6.d0;
import cj.C0979e;
import com.google.crypto.tink.shaded.protobuf.AbstractC1374a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1382i;
import com.google.crypto.tink.shaded.protobuf.C1381h;
import com.google.crypto.tink.shaded.protobuf.C1386m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.skydoves.balloon.internals.DefinitionKt;
import d6.C1617g;
import d6.C1618h;
import d6.C1619i;
import ee.C2033a;
import ee.C2034b;
import ee.C2039g;
import ee.InterfaceC2040h;
import em.C2067a;
import fl.InterfaceC2321a;
import g1.AbstractC2422b;
import g1.h1;
import g1.x0;
import g1.z0;
import gb.C2555e;
import gl.AbstractC2625a;
import h1.AbstractC2785p;
import h1.InterfaceC2786q;
import h1.InterfaceC2795z;
import h1.a0;
import h1.a2;
import h1.b0;
import h1.c2;
import hi.l1;
import hi.m1;
import hi.n1;
import i0.s0;
import i0.w1;
import i00.C3103h;
import i00.InterfaceC3099d;
import i00.InterfaceC3102g;
import i00.p0;
import ig.AbstractC3253i;
import ig.BinderC3248d;
import ig.C3247c;
import ig.C3249e;
import ig.C3258n;
import im.C3299a;
import im.C3300b;
import jakarta.mail.c0;
import jakarta.mail.e0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import kc.InterfaceC4053h;
import kotlin.jvm.internal.AbstractC4154l;
import l0.C4304d;
import l0.C4311k;
import l0.InterfaceC4303c;
import l1.C4327p;
import l4.InterfaceC4374s;
import nf.C5047i;
import nx.AbstractC5163a;
import og.dc;
import og.ec;
import og.od;
import og.pe;
import og.ph;
import og.rc;
import og.xg;
import og.y0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.json.JSONObject;
import rb.C6489b;
import retrofit2.HttpException;
import rf.InterfaceC6505j;
import s4.InterfaceC6747c;
import sc.C6804x;
import sc.InterfaceC6786f;
import tx.C7251k;
import vc.InterfaceC7700c;
import vc.InterfaceC7703f;
import wi.AbstractC8057g;
import wj.C8090p;
import ww.AbstractC8193c;
import x4.C8299i;
import x4.InterfaceC8300j;
import yg.C8650g;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zk.c */
/* loaded from: classes.dex */
public class C8989c implements w1, a1, InterfaceC4303c, InterfaceC2040h, InterfaceC4374s, a0, xg, InterfaceC2321a, InterfaceC2786q, c2, InterfaceC7703f, InterfaceC3102g, InterfaceC6786f, InterfaceC6505j, e0, InterfaceC4053h, InterfaceC8300j {

    /* renamed from: a */
    public final /* synthetic */ int f43338a;

    /* renamed from: b */
    public Object f43339b;

    public /* synthetic */ C8989c(int i10, Object obj) {
        this.f43338a = i10;
        this.f43339b = obj;
    }

    @Override // i00.InterfaceC3102g
    /* renamed from: A */
    public void mo5818A(InterfaceC3099d call, p0 p0Var) {
        switch (this.f43338a) {
            case 20:
                ((C3103h) this.f43339b).complete(p0Var);
                break;
            default:
                C7251k c7251k = (C7251k) this.f43339b;
                AbstractC4154l.m8923f(call, "call");
                if (!p0Var.f16730a.f17932r) {
                    c7251k.resumeWith(od.m10796a(new HttpException(p0Var)));
                    break;
                } else {
                    c7251k.resumeWith(p0Var.f16731b);
                    break;
                }
        }
    }

    @Override // h1.z1
    /* renamed from: B */
    public AbstractC2785p mo2730B(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        return ((C8090p) this.f43339b).mo2730B(j6, abstractC2785p, abstractC2785p2, abstractC2785p3);
    }

    @Override // ee.InterfaceC2040h
    /* renamed from: D */
    public C2034b mo2551D(C2033a c2033a) {
        return null;
    }

    @Override // h1.z1
    /* renamed from: G */
    public AbstractC2785p mo6884G(AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        return ((C8090p) this.f43339b).mo6884G(abstractC2785p, abstractC2785p2, abstractC2785p3);
    }

    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public Object mo15I(C8299i c8299i) {
        switch (this.f43338a) {
            case 28:
                C4304d c4304d = (C4304d) this.f43339b;
                y0.m11056f("The result can only set once!", c4304d.f21727b == null);
                c4304d.f21727b = c8299i;
                return "FutureChain[" + c4304d + "]";
            default:
                C4311k c4311k = (C4311k) this.f43339b;
                y0.m11056f("The result can only set once!", c4311k.f21744f == null);
                c4311k.f21744f = c8299i;
                return "ListFuture[" + this + "]";
        }
    }

    @Override // c0.a1
    /* renamed from: J */
    public int mo2140J() {
        return ((Image.Plane) this.f43339b).getPixelStride();
    }

    @Override // i00.InterfaceC3102g
    /* renamed from: L */
    public void mo5819L(InterfaceC3099d interfaceC3099d, Throwable th2) {
        switch (this.f43338a) {
            case 20:
                ((C3103h) this.f43339b).completeExceptionally(th2);
                break;
            default:
                ((C7251k) this.f43339b).resumeWith(od.m10796a(th2));
                break;
        }
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: M */
    public void mo45M(Throwable th2) throws Exception {
        switch (this.f43338a) {
            case 5:
                ((b1) this.f43339b).close();
                break;
            default:
                C8299i c8299i = (C8299i) this.f43339b;
                if (!(th2 instanceof TimeoutException)) {
                    c8299i.m15507b(Collections.EMPTY_LIST);
                    break;
                } else {
                    c8299i.m15509d(th2);
                    break;
                }
        }
    }

    @Override // h1.a0
    /* renamed from: O */
    public long mo6103O(float f6) {
        return ((long) (Math.exp(((g1.y0) this.f43339b).m6106b(f6) / (z0.f11123a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // fl.InterfaceC2321a
    /* renamed from: R */
    public Point[] mo5987R() {
        return ((ph) this.f43339b).f26738e;
    }

    @Override // vc.InterfaceC7703f
    /* renamed from: S */
    public InterfaceC7700c mo1857S(String schemeId) {
        C2555e c2555e = (C2555e) this.f43339b;
        AbstractC4154l.m8923f(schemeId, "schemeId");
        int iHashCode = schemeId.hashCode();
        if (iHashCode != -872954133) {
            if (iHashCode != -826192891) {
                if (iHashCode == 157824252 && schemeId.equals("aws.auth#sigv4a")) {
                    return c2555e.f13940j;
                }
            } else if (schemeId.equals("aws.auth#sigv4")) {
                return c2555e.f13940j;
            }
        } else if (schemeId.equals("aws.auth#sigv4s3express")) {
            return c2555e.f13947r;
        }
        throw new IllegalStateException(("auth scheme " + ((Object) C6489b.m12497a(schemeId)) + " not configured for client").toString());
    }

    @Override // jakarta.mail.e0
    /* renamed from: T */
    public void mo8190T(InputStream inputStream) throws IOException {
        ((c0) this.f43339b).f19295i.load(inputStream);
    }

    @Override // h1.a0
    /* renamed from: U */
    public float mo6104U(float f6, float f10) {
        double dM6106b = ((g1.y0) this.f43339b).m6106b(f10);
        double d2 = z0.f11123a;
        return (Math.signum(f10) * ((float) (Math.exp((d2 / (d2 - 1.0d)) * dM6106b) * r0.f11118a * r0.f11119b))) + f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f8  */
    @Override // kc.InterfaceC4053h
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo8836X(kc.C4055j r29, ww.AbstractC8193c r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.C8989c.mo8836X(kc.j, ww.c):java.lang.Object");
    }

    @Override // l4.InterfaceC4374s
    /* renamed from: Y */
    public int mo2733Y(int i10) {
        C2067a c2067a = (C2067a) this.f43339b;
        try {
            return ((Number) c2067a.f9680b.get(i10)).intValue();
        } catch (Exception unused) {
            return pe.m10832g(c2067a.f9681c);
        }
    }

    @Override // c0.a1
    /* renamed from: a */
    public ByteBuffer mo2141a() {
        return ((Image.Plane) this.f43339b).getBuffer();
    }

    public C1617g a0(int i10) {
        return null;
    }

    @Override // rf.InterfaceC6505j
    public void accept(Object obj, Object obj2) {
        C3247c c3247c = (C3247c) this.f43339b;
        BinderC3248d binderC3248d = new BinderC3248d((C8650g) obj2);
        C3258n c3258n = (C3258n) ((C3249e) obj).m13009t();
        String str = c3247c.f17423k;
        Parcel parcelM3755f = c3258n.m3755f();
        int i10 = AbstractC3253i.f17432a;
        parcelM3755f.writeStrongBinder(binderC3248d);
        parcelM3755f.writeString(str);
        c3258n.m3756g(parcelM3755f, 2);
    }

    @Override // h1.c2, h1.z1
    /* renamed from: b */
    public boolean mo6777b() {
        ((C8090p) this.f43339b).getClass();
        return false;
    }

    public C1617g b0(int i10) {
        return null;
    }

    public n1 c0(AbstractC1382i abstractC1382i) throws GeneralSecurityException {
        AbstractC0152i abstractC0152i = (AbstractC0152i) this.f43339b;
        try {
            AbstractC0151h abstractC0151hMo352f = abstractC0152i.mo352f();
            AbstractC1374a abstractC1374aMo314B = abstractC0151hMo352f.mo314B(abstractC1382i);
            abstractC0151hMo352f.mo324L(abstractC1374aMo314B);
            AbstractC1374a abstractC1374a = (AbstractC1374a) abstractC0151hMo352f.mo341u(abstractC1374aMo314B);
            l1 l1VarM7156t = n1.m7156t();
            String strMo350d = abstractC0152i.mo350d();
            l1VarM7156t.m4460c();
            n1.m7152m((n1) l1VarM7156t.f7128b, strMo350d);
            try {
                int iMo4155a = abstractC1374a.mo4155a();
                byte[] bArr = new byte[iMo4155a];
                C1386m c1386m = new C1386m(bArr, iMo4155a);
                abstractC1374a.mo4158d(c1386m);
                if (c1386m.f7075c - c1386m.f7076d != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                C1381h c1381h = new C1381h(bArr);
                l1VarM7156t.m4460c();
                n1.m7153n((n1) l1VarM7156t.f7128b, c1381h);
                m1 m1VarMo353g = abstractC0152i.mo353g();
                l1VarM7156t.m4460c();
                n1.m7154o((n1) l1VarM7156t.f7128b, m1VarMo353g);
                return (n1) l1VarM7156t.m4458a();
            } catch (IOException e2) {
                throw new RuntimeException(abstractC1374a.m4156b("ByteString"), e2);
            }
        } catch (InvalidProtocolBufferException e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // i0.w1
    /* renamed from: d */
    public s0 mo2241d() {
        return (s0) this.f43339b;
    }

    public boolean d0(int i10, int i11, Bundle bundle) {
        return false;
    }

    public JSONObject e0() throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        Log.isLoggable("FirebaseCrashlytics", 3);
        FileInputStream fileInputStream2 = null;
        try {
            File file = (File) this.f43339b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(AbstractC8057g.m15195i(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception unused) {
                    AbstractC8057g.m15188b(fileInputStream);
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    AbstractC8057g.m15188b(fileInputStream);
                    throw th2;
                }
            } else {
                Log.isLoggable("FirebaseCrashlytics", 2);
                jSONObject = null;
            }
            AbstractC8057g.m15188b(fileInputStream2);
            return jSONObject;
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th4) {
            th2 = th4;
            fileInputStream = null;
        }
    }

    public void f0(Uri uri, ContentResolver contentResolver) throws IOException {
        ArrayList arrayList = ((C3300b) this.f43339b).f17537a;
        AbstractC4154l.m8923f(uri, "uri");
        try {
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int i12 = i10 + 1;
                if (i10 < 0) {
                    pe.m10842q();
                    throw null;
                }
                int i13 = 0;
                for (Object obj2 : ((C3299a) obj).f17534a) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        pe.m10842q();
                        throw null;
                    }
                    sb2.append((String) obj2);
                    if (i13 < r7.f17534a.size() - 1) {
                        sb2.append(",");
                    }
                    i13 = i14;
                }
                if (i10 < arrayList.size() - 1) {
                    sb2.append("\n");
                }
                i10 = i12;
            }
            String string = sb2.toString();
            AbstractC4154l.m8922e(string, "toString(...)");
            byte[] bytes = string.getBytes(AbstractC5163a.f25245a);
            AbstractC4154l.m8922e(bytes, "getBytes(...)");
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
            if (outputStreamOpenOutputStream != null) {
                outputStreamOpenOutputStream.write(bytes);
            }
            if (outputStreamOpenOutputStream != null) {
                outputStreamOpenOutputStream.flush();
            }
            if (outputStreamOpenOutputStream != null) {
                outputStreamOpenOutputStream.close();
            }
        } catch (Exception e2) {
            e2.toString();
            AbstractC4154l.m8928k("traceLogs");
            throw null;
        }
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: g */
    public void mo65g(Object obj) {
        switch (this.f43338a) {
            case 5:
                break;
            default:
                List list = (List) obj;
                list.getClass();
                ((C8299i) this.f43339b).m15507b(new ArrayList(list));
                break;
        }
    }

    @Override // h1.InterfaceC2786q
    public InterfaceC2795z get(int i10) {
        return ((b0[]) this.f43339b)[i10];
    }

    @Override // fl.InterfaceC2321a
    public int getFormat() {
        return ((ph) this.f43339b).f26734a;
    }

    @Override // h1.z1
    /* renamed from: m */
    public long mo6771m(AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        return ((C8090p) this.f43339b).mo6771m(abstractC2785p, abstractC2785p2, abstractC2785p3);
    }

    @Override // h1.z1
    /* renamed from: n */
    public AbstractC2785p mo2744n(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        return ((C8090p) this.f43339b).mo2744n(j6, abstractC2785p, abstractC2785p2, abstractC2785p3);
    }

    @Override // sc.InterfaceC6786f
    /* renamed from: o */
    public Object mo1858o(C6804x c6804x, AbstractC8193c abstractC8193c) {
        return new C0642a((C0109p) this.f43339b);
    }

    @Override // c0.a1
    /* renamed from: p */
    public int mo2142p() {
        return ((Image.Plane) this.f43339b).getRowStride();
    }

    @Override // fl.InterfaceC2321a
    /* renamed from: r */
    public Rect mo5988r() {
        Point[] pointArr = ((ph) this.f43339b).f26738e;
        if (pointArr == null) {
            return null;
        }
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArr) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // h1.a0
    /* renamed from: s */
    public float mo6107s() {
        return DefinitionKt.NO_Float_VALUE;
    }

    @Override // fl.InterfaceC2321a
    /* renamed from: t */
    public String mo5989t() {
        return ((ph) this.f43339b).f26736c;
    }

    @Override // fl.InterfaceC2321a
    /* renamed from: u */
    public int mo5990u() {
        return ((ph) this.f43339b).f26739f;
    }

    @Override // ee.InterfaceC2040h
    /* renamed from: v */
    public void mo2577v(C2033a c2033a, Bitmap bitmap, Map map) {
        ((C2039g) this.f43339b).m5767q(c2033a, bitmap, map, AbstractC0656a.m1902k(bitmap));
    }

    @Override // l4.InterfaceC4374s
    /* renamed from: w */
    public int mo2753w(int i10) {
        return ((Number) ((C2067a) this.f43339b).f9681c.get(i10)).intValue();
    }

    @Override // h1.a0
    /* renamed from: x */
    public float mo6108x(float f6, long j6) {
        long j10 = j6 / 1000000;
        x0 x0VarM6105a = ((g1.y0) this.f43339b).m6105a(f6);
        long j11 = x0VarM6105a.f11116c;
        return (((Math.signum(x0VarM6105a.f11114a) * AbstractC2422b.m6084a(j11 > 0 ? j10 / j11 : 1.0f).f10916b) * x0VarM6105a.f11115b) / j11) * 1000.0f;
    }

    @Override // h1.a0
    /* renamed from: y */
    public float mo6109y(float f6, float f10, long j6) {
        long j10 = j6 / 1000000;
        x0 x0VarM6105a = ((g1.y0) this.f43339b).m6105a(f10);
        long j11 = x0VarM6105a.f11116c;
        return (Math.signum(x0VarM6105a.f11114a) * x0VarM6105a.f11115b * AbstractC2422b.m6084a(j11 > 0 ? j10 / j11 : 1.0f).f10915a) + f6;
    }

    @Override // og.xg
    public C0554l zza() {
        p020v.x0 x0Var = new p020v.x0(8, false);
        dc dcVar = AbstractC2625a.m6599c() ? dc.TYPE_THICK : dc.TYPE_THIN;
        ec ecVar = (ec) this.f43339b;
        x0Var.f36756d = dcVar;
        C4327p c4327p = new C4327p(12, false);
        c4327p.f21788b = ecVar;
        x0Var.f36758f = new rc(c4327p);
        return new C0554l(x0Var, 0);
    }

    public C8989c(Set set) {
        this.f43338a = 0;
        this.f43339b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C8988b c8988b = (C8988b) it.next();
            HashMap map = (HashMap) this.f43339b;
            c8988b.getClass();
            map.put(AbstractC8987a.class, c8988b.f43337a);
        }
    }

    public C8989c(C2555e config) {
        this.f43338a = 18;
        AbstractC4154l.m8923f(config, "config");
        this.f43339b = config;
    }

    public C8989c(InterfaceC6747c interfaceC6747c) {
        this.f43338a = 12;
        float f6 = h1.f11007a;
        g1.y0 y0Var = new g1.y0();
        y0Var.f11118a = f6;
        float fMo155a = interfaceC6747c.mo155a();
        float f10 = z0.f11123a;
        y0Var.f11119b = fMo155a * 386.0878f * 160.0f * 0.84f;
        this.f43339b = y0Var;
    }

    public C8989c(C0979e c0979e) {
        this.f43338a = 10;
        this.f43339b = new File((File) c0979e.f5804c, "com.crashlytics.settings.json");
    }

    public C8989c(AbstractC0152i abstractC0152i, Class cls) {
        this.f43338a = 1;
        if (!((Map) abstractC0152i.f485c).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(AbstractC0030c.m121l("Given internalKeyMananger ", abstractC0152i.toString(), " does not support primitive class ", cls.getName()));
        }
        this.f43339b = abstractC0152i;
    }

    @Override // ee.InterfaceC2040h
    /* renamed from: V */
    public void mo2557V(int i10) {
    }

    public C8989c(View view) {
        this.f43338a = 6;
        if (Build.VERSION.SDK_INT >= 30) {
            d0 d0Var = new d0(5, view);
            d0Var.f5435e = view;
            this.f43339b = d0Var;
            return;
        }
        this.f43339b = new C8986c(5, view);
    }

    public C8989c(int i10) {
        this.f43338a = i10;
        switch (i10) {
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                break;
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f43339b = new C1619i(this);
                    break;
                } else {
                    this.f43339b = new C1618h(this);
                    break;
                }
        }
    }

    public C8989c(float f6, float f10, AbstractC2785p abstractC2785p) {
        InterfaceC2786q c5047i;
        this.f43338a = 17;
        int[] iArr = a2.f15348a;
        if (abstractC2785p != null) {
            c5047i = new C8989c(abstractC2785p, f6, f10);
        } else {
            c5047i = new C5047i(f6, f10);
        }
        this.f43339b = new C8090p(c5047i);
    }

    public C8989c(AbstractC2785p abstractC2785p, float f6, float f10) {
        this.f43338a = 16;
        int iMo6832b = abstractC2785p.mo6832b();
        b0[] b0VarArr = new b0[iMo6832b];
        for (int i10 = 0; i10 < iMo6832b; i10++) {
            b0VarArr[i10] = new b0(f6, f10, abstractC2785p.mo6831a(i10));
        }
        this.f43339b = b0VarArr;
    }

    /* renamed from: Z */
    public void mo9546Z(int i10, C1617g c1617g, String str, Bundle bundle) {
    }
}
