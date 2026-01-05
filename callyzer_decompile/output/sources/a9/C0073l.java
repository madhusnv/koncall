package a9;

import ae.InterfaceC0126g;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import c0.C0814g;
import c9.C0927v;
import com.amplifyframework.storage.ObjectMetadata;
import com.sun.mail.util.AbstractC1452a;
import de.C1701a;
import eb.i3;
import ex.InterfaceC2137a;
import g00.InterfaceC2419d;
import g4.AbstractC2494j;
import g4.C2490f;
import g4.C2491g;
import g4.C2492h;
import g4.C2493i;
import g4.C2502r;
import g4.C2504t;
import g4.C2506v;
import g4.InterfaceC2505u;
import g4.o0;
import h4.AbstractC2838o;
import h4.C2834k;
import h6.C2856l;
import i0.C3080k;
import i0.g0;
import i0.m0;
import i0.v0;
import i00.AbstractC3100e;
import i00.AbstractC3105j;
import i00.InterfaceC3101f;
import i00.InterfaceC3106k;
import i00.q0;
import i1.e0;
import iz.C3370c;
import iz.C3390w;
import iz.i0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import ji.C3773g;
import k4.InterfaceC3987h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.d0;
import l0.AbstractC4308h;
import l0.RunnableC4302b;
import l0.RunnableC4307g;
import l7.AbstractC4422v;
import l7.C4420t;
import l7.C4423w;
import ld.InterfaceC4447g;
import m4.AbstractC4646a;
import mx.AbstractC4913i;
import nd.EnumC5011b;
import nd.InterfaceC5014e;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import o4.C5288d;
import od.AbstractC5339c;
import od.C5340d;
import og.eb;
import og.me;
import og.nd;
import og.pe;
import og.y0;
import or.AbstractC5453p;
import or.C5438a;
import or.C5440c;
import or.C5441d;
import or.C5442e;
import or.C5443f;
import or.C5444g;
import or.C5445h;
import or.C5446i;
import or.C5447j;
import or.C5448k;
import or.C5449l;
import or.C5450m;
import or.C5451n;
import or.C5452o;
import or.C5454q;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p004e.C1870e;
import pg.ba;
import pg.o7;
import pg.t8;
import q0.C6066g;
import q0.C6068i;
import q0.C6069j;
import q5.C6128u;
import q7.C6141h;
import qw.C6361k;
import qw.C6366p;
import qw.EnumC6359i;
import r0.C6410a;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.AbstractC6674x;
import rw.C6661k;
import rw.C6668r;
import rw.C6669s;
import s4.InterfaceC6747c;
import sc.C6801u;
import uo.C7485j;
import wx.m1;
import wx.u0;
import xm.r3;
import xm.y2;
import xm.y5;
import yv.C8791f;
import yv.C8800o;
import yv.C8805t;
import yx.C8810d;
import zh.AbstractC8954a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a9.l */
/* loaded from: classes.dex */
public final class C0073l implements InterfaceC2419d, InterfaceC2505u, InterfaceC5014e {

    /* renamed from: a */
    public Object f264a;

    /* renamed from: b */
    public Object f265b;

    /* renamed from: c */
    public Object f266c;

    /* renamed from: d */
    public Object f267d;

    /* renamed from: e */
    public Object f268e;

    public C0073l(Context context, y2 y2Var, y5 userSIMRepository, C7485j c7485j, C8805t c8805t) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f264a = context;
        this.f265b = y2Var;
        this.f266c = userSIMRepository;
        this.f267d = c7485j;
        this.f268e = c8805t;
    }

    /* renamed from: G */
    public static LinkedHashMap m190G(List updateList) {
        C6361k c6361k;
        C6361k c6361k2;
        Object next;
        String str;
        AbstractC4154l.m8923f(updateList, "updateList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = updateList.iterator();
        while (it.hasNext()) {
            AbstractC5453p abstractC5453p = ((C5438a) it.next()).f27346a;
            if ((abstractC5453p instanceof C5446i) || (abstractC5453p instanceof C5451n) || (abstractC5453p instanceof C5444g) || (abstractC5453p instanceof C5452o) || (abstractC5453p instanceof C5449l)) {
                String strMo11153e = abstractC5453p.mo11153e();
                Object objMo11151c = abstractC5453p.mo11151c();
                String str2 = (String) objMo11151c;
                AbstractC4154l.m8921d(str2, "null cannot be cast to non-null type kotlin.String");
                c6361k = new C6361k(strMo11153e, AbstractC5178p.m10101L(AbstractC5178p.g0(str2).toString()) ? null : objMo11151c);
            } else if (abstractC5453p instanceof C5441d) {
                C5441d c5441d = (C5441d) abstractC5453p;
                String str3 = c5441d.f27366h;
                long j6 = c5441d.f27364f;
                c6361k = new C6361k(str3, j6 != -1 ? Long.valueOf(j6) : null);
            } else if (abstractC5453p instanceof C5450m) {
                C5450m c5450m = (C5450m) abstractC5453p;
                String str4 = c5450m.f27458e;
                List list = c5450m.f27457d;
                if (list == null) {
                    list = null;
                }
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (((C5454q) next).f27493c) {
                            break;
                        }
                    }
                    C5454q c5454q = (C5454q) next;
                    if (c5454q != null && (str = c5454q.f27492b) != null) {
                        C8791f c8791f = C8791f.f42457a;
                        if (C8791f.m16171d(str)) {
                            obj = str;
                        }
                    }
                }
                c6361k = new C6361k(str4, obj);
            } else if ((abstractC5453p instanceof C5447j) || (abstractC5453p instanceof C5440c) || (abstractC5453p instanceof C5443f)) {
                String strMo11153e2 = abstractC5453p.mo11153e();
                Object objMo11151c2 = abstractC5453p.mo11151c();
                List list2 = objMo11151c2 instanceof List ? (List) objMo11151c2 : null;
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (((C5454q) obj).f27493c) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        obj = arrayList;
                    }
                }
                c6361k = new C6361k(strMo11153e2, obj);
            } else {
                if (abstractC5453p instanceof C5442e) {
                    C5442e c5442e = (C5442e) abstractC5453p;
                    c6361k2 = new C6361k(c5442e.f27375e, c5442e.f27374d);
                } else if (abstractC5453p instanceof C5445h) {
                    C5445h c5445h = (C5445h) abstractC5453p;
                    c6361k2 = new C6361k(c5445h.f27403c, c5445h.f27402b);
                } else {
                    if (!(abstractC5453p instanceof C5448k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C5448k c5448k = (C5448k) abstractC5453p;
                    c6361k2 = new C6361k(c5448k.f27434c, c5448k.f27433b);
                }
                c6361k = c6361k2;
            }
            String str5 = (String) c6361k.f30755a;
            Object obj2 = c6361k.f30756b;
            if (obj2 != null) {
                if (obj2 instanceof List) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : (List) obj2) {
                        if (((C5454q) obj3).f27493c) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(arrayList2, 10));
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj4 = arrayList2.get(i10);
                        i10++;
                        arrayList3.add(((C5454q) obj4).f27492b);
                    }
                    linkedHashMap.put(str5, arrayList3);
                } else if (obj2 instanceof Long) {
                    C8800o c8800o = C8800o.f42459a;
                    linkedHashMap.put(str5, C8800o.m16197f(C8800o.m16180D(((Number) obj2).longValue())));
                } else {
                    linkedHashMap.put(str5, obj2);
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: q */
    public static C0073l m191q(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        C0073l c0073l = new C0073l();
        c0073l.f267d = new ArrayDeque();
        c0073l.f264a = sharedPreferences;
        c0073l.f265b = "topic_operation_queue";
        c0073l.f266c = ",";
        c0073l.f268e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) c0073l.f267d)) {
            try {
                ((ArrayDeque) c0073l.f267d).clear();
                String string = ((SharedPreferences) c0073l.f264a).getString((String) c0073l.f265b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) c0073l.f266c)) {
                    String[] strArrSplit = string.split((String) c0073l.f266c, -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) c0073l.f267d).add(str);
                        }
                    }
                    return c0073l;
                }
                return c0073l;
            } finally {
            }
        }
    }

    /* renamed from: A */
    public int m192A(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f265b).get(i10 - 1)).intValue();
    }

    /* renamed from: B */
    public void m193B(String str, String value) {
        AbstractC4154l.m8923f(value, "value");
        i3 i3Var = (i3) this.f266c;
        i3Var.getClass();
        ba.m11554b(str);
        ba.m11555c(value, str);
        i3Var.m5731i(str);
        ba.m11553a(i3Var, str, value);
    }

    /* renamed from: C */
    public synchronized boolean m194C() {
        boolean zM8297g;
        Boolean bool = (Boolean) this.f267d;
        if (bool != null) {
            zM8297g = bool.booleanValue();
        } else {
            try {
                zM8297g = ((C3773g) this.f264a).m8297g();
            } catch (IllegalStateException unused) {
                zM8297g = false;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        return zM8297g;
    }

    /* renamed from: D */
    public int m195D(int i10, int i11) {
        while (i10 > i11) {
            char cCharAt = ((Layout) this.f264a).getText().charAt(i10 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((AbstractC4154l.m8924g(cCharAt, 8192) < 0 || AbstractC4154l.m8924g(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i10;
            }
            i10--;
        }
        return i10;
    }

    /* renamed from: E */
    public void m196E(String method, i0 i0Var) {
        AbstractC4154l.m8923f(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (i0Var == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC5601a.m11238i("method ", method, " must have a request body.").toString());
            }
        } else if (!eb.m10627b(method)) {
            throw new IllegalArgumentException(AbstractC5601a.m11238i("method ", method, " must not have a request body.").toString());
        }
        this.f265b = method;
        this.f267d = i0Var;
    }

    /* renamed from: F */
    public InterfaceC3106k m197F(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f267d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC3106k interfaceC3106kMo7440b = ((AbstractC3105j) list.get(i10)).mo7440b(type, annotationArr, this);
            if (interfaceC3106kMo7440b != null) {
                return interfaceC3106kMo7440b;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((AbstractC3105j) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: H */
    public InterfaceC3106k m198H(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.f267d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC3106k interfaceC3106kMo7439a = ((AbstractC3105j) list.get(i10)).mo7439a(type);
            if (interfaceC3106kMo7439a != null) {
                return interfaceC3106kMo7439a;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((AbstractC3105j) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m199I(com.websoptimization.callyzerbiz.data.model.request.SaveLeadRequest r7, ww.AbstractC8193c r8) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C0073l.m199I(com.websoptimization.callyzerbiz.data.model.request.SaveLeadRequest, ww.c):java.lang.Object");
    }

    /* renamed from: J */
    public void m200J(Object obj, String key) {
        AbstractC4154l.m8923f(key, "key");
        ((LinkedHashMap) this.f264a).put(key, obj);
        u0 u0Var = (u0) ((LinkedHashMap) this.f266c).get(key);
        if (u0Var != null) {
            ((m1) u0Var).m15398j(obj);
        }
        u0 u0Var2 = (u0) ((LinkedHashMap) this.f267d).get(key);
        if (u0Var2 != null) {
            ((m1) u0Var2).m15398j(obj);
        }
    }

    /* renamed from: K */
    public void m201K(C6801u c6801u) {
        AbstractC4154l.m8923f(c6801u, "<set-?>");
        this.f267d = c6801u;
    }

    /* renamed from: L */
    public void m202L(InterfaceC4447g interfaceC4447g) {
        AbstractC4154l.m8923f(interfaceC4447g, "<set-?>");
        this.f264a = interfaceC4447g;
    }

    /* renamed from: M */
    public void m203M(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.f267d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC3105j) list.get(i10)).getClass();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    /* renamed from: N */
    public void m204N(Class type, Object obj) {
        Map mapM8906c;
        AbstractC4154l.m8923f(type, "type");
        C4147e c4147eM8901a = a0.m8901a(type);
        if (obj == null) {
            if (this.f268e.isEmpty()) {
                return;
            }
            Object obj2 = this.f268e;
            AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
            d0.m8906c(obj2).remove(c4147eM8901a);
            return;
        }
        if (this.f268e.isEmpty()) {
            mapM8906c = new LinkedHashMap();
            this.f268e = mapM8906c;
        } else {
            Object obj3 = this.f268e;
            AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
            mapM8906c = d0.m8906c(obj3);
        }
        if (c4147eM8901a.m8915d(obj)) {
            mapM8906c.put(c4147eM8901a, obj);
        } else {
            throw new ClassCastException("Value cannot be cast to " + c4147eM8901a.m8913b());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m205O(ww.AbstractC8193c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof vn.C7726a
            if (r0 == 0) goto L13
            r0 = r9
            vn.a r0 = (vn.C7726a) r0
            int r1 = r0.f37273e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37273e = r1
            goto L18
        L13:
            vn.a r0 = new vn.a
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f37271c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f37273e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r2 = r0.f37270b
            java.util.Iterator r4 = r0.f37269a
            og.od.m10798c(r9)
            goto L52
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            og.od.m10798c(r9)
            goto L4a
        L3a:
            og.od.m10798c(r9)
            java.lang.Object r9 = r8.f266c
            xm.y5 r9 = (xm.y5) r9
            r0.f37273e = r4
            java.lang.Object r9 = r9.m15696l(r0)
            if (r9 != r1) goto L4a
            goto L75
        L4a:
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r4 = r9
        L52:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L76
            java.lang.Object r9 = r4.next()
            mm.m r9 = (mm.C4802m) r9
            java.lang.Object r5 = r8.f265b
            xm.y2 r5 = (xm.y2) r5
            qc.d r6 = new qc.d
            r7 = 13
            r6.<init>(r7, r8)
            r0.f37269a = r4
            r0.f37270b = r2
            r0.f37273e = r3
            java.lang.Object r9 = r5.m15677a(r9, r6, r0)
            if (r9 != r1) goto L52
        L75:
            return r1
        L76:
            qw.a0 r9 = qw.a0.f30746a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C0073l.m205O(ww.c):java.lang.Object");
    }

    /* renamed from: P */
    public void m206P(String url) {
        AbstractC4154l.m8923f(url, "url");
        if (AbstractC5185w.m10138t(url, "ws:", true)) {
            String strSubstring = url.substring(3);
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
            url = "http:".concat(strSubstring);
        } else if (AbstractC5185w.m10138t(url, "wss:", true)) {
            String strSubstring2 = url.substring(4);
            AbstractC4154l.m8922e(strSubstring2, "substring(...)");
            url = "https:".concat(strSubstring2);
        }
        AbstractC4154l.m8923f(url, "<this>");
        C3390w c3390w = new C3390w();
        c3390w.m7795c(null, url);
        this.f264a = c3390w.m7793a();
    }

    /* renamed from: Q */
    public void m207Q() {
        ArrayList arrayList = (ArrayList) this.f268e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int i11 = ((C4420t) obj).f22125a;
            if (m227t(i11) == null) {
                int i12 = AbstractC4422v.f22133f;
                StringBuilder sbM7383p = m0.m7383p("Navigation destination ", AbstractC8954a.m16435a((C2856l) this.f265b, i11), " cannot be found in the navigation graph ");
                sbM7383p.append((C4423w) this.f267d);
                throw new IllegalArgumentException(sbM7383p.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m208R(mm.C4802m r7, ww.AbstractC8193c r8) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C0073l.m208R(mm.m, ww.c):java.lang.Object");
    }

    @Override // g4.InterfaceC2505u
    /* renamed from: a */
    public boolean mo209a() {
        ArrayList arrayList = (ArrayList) this.f268e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C2504t) arrayList.get(i10)).f13716a.mo209a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qw.g] */
    @Override // g4.InterfaceC2505u
    /* renamed from: b */
    public float mo210b() {
        return ((Number) this.f266c.getValue()).floatValue();
    }

    @Override // nd.InterfaceC5014e
    /* renamed from: c */
    public void mo211c() {
        e0 e0Var;
        C6366p c6366p = (C6366p) this.f268e;
        C5340d c5340d = (C5340d) this.f264a;
        InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f266c;
        if (interfaceC2137a == null) {
            throw new IllegalArgumentException("no message provided to LogRecordBuilder");
        }
        int i10 = AbstractC5339c.f26255a[((EnumC5011b) this.f265b).ordinal()];
        if (i10 == 1) {
            e0Var = new e0(2, c5340d, C5340d.class, "error", "error(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0, 3);
        } else if (i10 == 2) {
            e0Var = new e0(2, c5340d, C5340d.class, "warn", "warn(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0, 4);
        } else if (i10 == 3) {
            e0Var = new e0(2, c5340d, C5340d.class, "info", "info(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0, 5);
        } else if (i10 == 4) {
            e0Var = new e0(2, c5340d, C5340d.class, "debug", "debug(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0, 6);
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            e0Var = new e0(2, c5340d, C5340d.class, "trace", "trace(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", 0, 7);
        }
        if (((Map) c6366p.getValue()).isEmpty()) {
            e0Var.invoke((Throwable) this.f267d, interfaceC2137a);
            return;
        }
        if (me.m10767a() == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        Map mapMo6762h = me.m10767a().mo6762h();
        try {
            for (Map.Entry entry : ((Map) c6366p.getValue()).entrySet()) {
                String str = (String) entry.getKey();
                String string = entry.getValue().toString();
                if (str == null) {
                    throw new IllegalArgumentException("key parameter cannot be null");
                }
                if (me.m10767a() == null) {
                    throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                }
                me.m10767a().put(str, string);
            }
            e0Var.invoke((Throwable) this.f267d, interfaceC2137a);
            if (mapMo6762h == null) {
                if (me.m10767a() == null) {
                    throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                }
                me.m10767a().clear();
            } else {
                if (me.m10767a() == null) {
                    throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                }
                me.m10767a().mo6761f(mapMo6762h);
            }
        } catch (Throwable th2) {
            if (mapMo6762h == null) {
                if (me.m10767a() == null) {
                    throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                }
                me.m10767a().clear();
            } else {
                if (me.m10767a() == null) {
                    throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                }
                me.m10767a().mo6761f(mapMo6762h);
            }
            throw th2;
        }
    }

    @Override // nd.InterfaceC5014e
    /* renamed from: d */
    public void mo212d(Throwable ex2) {
        AbstractC4154l.m8923f(ex2, "ex");
        this.f267d = ex2;
    }

    @Override // nd.InterfaceC5014e
    /* renamed from: e */
    public void mo213e(Object value, String key) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        ((Map) ((C6366p) this.f268e).getValue()).put(key, value);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qw.g] */
    @Override // g4.InterfaceC2505u
    /* renamed from: f */
    public float mo214f() {
        return ((Number) this.f267d.getValue()).floatValue();
    }

    /* renamed from: g */
    public void m215g(InterfaceC0126g interfaceC0126g, Class cls) {
        ((ArrayList) this.f267d).add(new C6361k(interfaceC0126g, cls));
    }

    /* renamed from: h */
    public void m216h(C1701a c1701a, Class cls) {
        ((ArrayList) this.f265b).add(new C6361k(c1701a, cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi m217i(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f264a
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.f265b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.f266c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.f267d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.f268e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.m192A(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.f268e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.f268e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C0073l.m217i(int):java.text.Bidi");
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0282, code lost:
    
        if (r7 != zm.EnumC8993c.UPLOAD_FAILED) goto L162;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4 A[Catch: Exception -> 0x00d0, TRY_ENTER, TryCatch #0 {Exception -> 0x00d0, blocks: (B:32:0x00c6, B:43:0x00e4, B:45:0x0100, B:71:0x01c3, B:72:0x01f1, B:74:0x0209, B:76:0x0220), top: B:156:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100 A[Catch: Exception -> 0x00d0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d0, blocks: (B:32:0x00c6, B:43:0x00e4, B:45:0x0100, B:71:0x01c3, B:72:0x01f1, B:74:0x0209, B:76:0x0220), top: B:156:0x00c6 }] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m218j(qe.C6194e r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C0073l.m218j(qe.e):void");
    }

    /* renamed from: k */
    public C3080k m219k() {
        String strM4561h = ((v0) this.f264a) == null ? " surface" : "";
        if (((List) this.f265b) == null) {
            strM4561h = strM4561h.concat(" sharedSurfaces");
        }
        if (((Integer) this.f266c) == null) {
            strM4561h = AbstractC1452a.m4561h(strM4561h, " mirrorMode");
        }
        if (((Integer) this.f267d) == null) {
            strM4561h = AbstractC1452a.m4561h(strM4561h, " surfaceGroupId");
        }
        if (((c0.a0) this.f268e) == null) {
            strM4561h = AbstractC1452a.m4561h(strM4561h, " dynamicRange");
        }
        if (strM4561h.isEmpty()) {
            return new C3080k((v0) this.f264a, (List) this.f265b, ((Integer) this.f266c).intValue(), ((Integer) this.f267d).intValue(), (c0.a0) this.f268e);
        }
        throw new IllegalStateException("Missing required properties:".concat(strM4561h));
    }

    /* renamed from: l */
    public void m220l(C3370c cacheControl) {
        AbstractC4154l.m8923f(cacheControl, "cacheControl");
        String string = cacheControl.toString();
        if (string.length() == 0) {
            ((i3) this.f266c).m5731i(ObjectMetadata.CACHE_CONTROL);
        } else {
            m193B(ObjectMetadata.CACHE_CONTROL, string);
        }
    }

    @Override // nd.InterfaceC5014e
    /* renamed from: m */
    public void mo221m(InterfaceC2137a interfaceC2137a) {
        this.f266c = interfaceC2137a;
    }

    /* renamed from: n */
    public InterfaceC3101f m222n(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f268e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC3101f interfaceC3101fMo7444a = ((AbstractC3100e) list.get(i10)).mo7444a(type, annotationArr, this);
            if (interfaceC3101fMo7444a != null) {
                return interfaceC3101fMo7444a;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((AbstractC3100e) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: o */
    public Object m223o(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new q0(this, cls));
    }

    /* renamed from: p */
    public void m224p(g0 g0Var, g0 g0Var2, C6069j c6069j, C6069j c6069j2, Map.Entry entry) {
        C6069j c6069j3 = (C6069j) entry.getValue();
        C0814g c0814g = new C0814g(c6069j.f29599g.f16522a, ((C6410a) entry.getKey()).f30919a.f32012d, c6069j.f29595c ? g0Var : null, ((C6410a) entry.getKey()).f30919a.f32014f, ((C6410a) entry.getKey()).f30919a.f32015g);
        C0814g c0814g2 = new C0814g(c6069j2.f29599g.f16522a, ((C6410a) entry.getKey()).f30920b.f32012d, c6069j2.f29595c ? g0Var2 : null, ((C6410a) entry.getKey()).f30920b.f32014f, ((C6410a) entry.getKey()).f30920b.f32015g);
        int i10 = ((C6410a) entry.getKey()).f30919a.f32011c;
        c6069j3.getClass();
        o7.m11806a();
        c6069j3.m12074a();
        y0.m11056f("Consumer can only be linked once.", !c6069j3.f29602j);
        c6069j3.f29602j = true;
        C6068i c6068i = c6069j3.f29604l;
        RunnableC4302b runnableC4302bM9037g = AbstractC4308h.m9037g(c6068i.m7418c(), new C6066g(c6069j3, c6068i, i10, c0814g, c0814g2), t8.m11875d());
        runnableC4302bM9037g.mo9026a(new RunnableC4307g(0, runnableC4302bM9037g, new C0927v(11, this, c6069j3)), t8.m11875d());
    }

    /* renamed from: r */
    public C6128u m225r() {
        ArrayList arrayList = (ArrayList) this.f268e;
        Intent intent = (Intent) this.f266c;
        C4423w c4423w = (C4423w) this.f267d;
        if (c4423w == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        AbstractC4422v abstractC4422v = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C4420t c4420t = (C4420t) obj;
            int i11 = c4420t.f22125a;
            Bundle bundle = c4420t.f22126b;
            AbstractC4422v abstractC4422vM227t = m227t(i11);
            if (abstractC4422vM227t == null) {
                int i12 = AbstractC4422v.f22133f;
                throw new IllegalArgumentException("Navigation destination " + AbstractC8954a.m16435a((C2856l) this.f265b, i11) + " cannot be found in the navigation graph " + c4423w);
            }
            for (int i13 : abstractC4422vM227t.m9247j(abstractC4422v)) {
                arrayList2.add(Integer.valueOf(i13));
                arrayList3.add(bundle);
            }
            abstractC4422v = abstractC4422vM227t;
        }
        intent.putExtra("android-support-nav:controller:deepLinkIds", AbstractC6663m.b0(arrayList2));
        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
        C6128u c6128u = new C6128u((Context) this.f264a);
        c6128u.m12158a(new Intent(intent));
        ArrayList arrayList4 = c6128u.f29875a;
        int size2 = arrayList4.size();
        for (int i14 = 0; i14 < size2; i14++) {
            Intent intent2 = (Intent) arrayList4.get(i14);
            if (intent2 != null) {
                intent2.putExtra("android-support-nav:controller:deepLinkIntent", intent);
            }
        }
        return c6128u;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:16:0x0048, B:55:0x0138, B:57:0x013e, B:59:0x014c, B:62:0x0154, B:61:0x0152, B:64:0x016d, B:66:0x0174, B:68:0x0191, B:70:0x0195, B:72:0x01b2, B:23:0x005c, B:44:0x00b0, B:46:0x00b8, B:48:0x00ce, B:50:0x00d4, B:51:0x00e0, B:26:0x0062, B:37:0x008e, B:40:0x0098, B:74:0x01cf, B:27:0x0066, B:33:0x0077, B:30:0x006d), top: B:78:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:16:0x0048, B:55:0x0138, B:57:0x013e, B:59:0x014c, B:62:0x0154, B:61:0x0152, B:64:0x016d, B:66:0x0174, B:68:0x0191, B:70:0x0195, B:72:0x01b2, B:23:0x005c, B:44:0x00b0, B:46:0x00b8, B:48:0x00ce, B:50:0x00d4, B:51:0x00e0, B:26:0x0062, B:37:0x008e, B:40:0x0098, B:74:0x01cf, B:27:0x0066, B:33:0x0077, B:30:0x006d), top: B:78:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:16:0x0048, B:55:0x0138, B:57:0x013e, B:59:0x014c, B:62:0x0154, B:61:0x0152, B:64:0x016d, B:66:0x0174, B:68:0x0191, B:70:0x0195, B:72:0x01b2, B:23:0x005c, B:44:0x00b0, B:46:0x00b8, B:48:0x00ce, B:50:0x00d4, B:51:0x00e0, B:26:0x0062, B:37:0x008e, B:40:0x0098, B:74:0x01cf, B:27:0x0066, B:33:0x0077, B:30:0x006d), top: B:78:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016d A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:16:0x0048, B:55:0x0138, B:57:0x013e, B:59:0x014c, B:62:0x0154, B:61:0x0152, B:64:0x016d, B:66:0x0174, B:68:0x0191, B:70:0x0195, B:72:0x01b2, B:23:0x005c, B:44:0x00b0, B:46:0x00b8, B:48:0x00ce, B:50:0x00d4, B:51:0x00e0, B:26:0x0062, B:37:0x008e, B:40:0x0098, B:74:0x01cf, B:27:0x0066, B:33:0x0077, B:30:0x006d), top: B:78:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m226s(ww.AbstractC8193c r22) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C0073l.m226s(ww.c):java.lang.Object");
    }

    /* renamed from: t */
    public AbstractC4422v m227t(int i10) {
        C6661k c6661k = new C6661k();
        C4423w c4423w = (C4423w) this.f267d;
        AbstractC4154l.m8920c(c4423w);
        c6661k.addLast(c4423w);
        while (!c6661k.isEmpty()) {
            AbstractC4422v abstractC4422v = (AbstractC4422v) c6661k.removeFirst();
            if (abstractC4422v.f22135b.f29939e == i10) {
                return abstractC4422v;
            }
            if (abstractC4422v instanceof C4423w) {
                Iterator it = ((C4423w) abstractC4422v).iterator();
                while (true) {
                    C6141h c6141h = (C6141h) it;
                    if (c6141h.hasNext()) {
                        c6661k.addLast((AbstractC4422v) c6141h.next());
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m228u(ww.AbstractC8193c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof fo.C2337a
            if (r0 == 0) goto L13
            r0 = r8
            fo.a r0 = (fo.C2337a) r0
            int r1 = r0.f10589d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10589d = r1
            goto L18
        L13:
            fo.a r0 = new fo.a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f10587b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10589d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            java.util.ArrayList r0 = r0.f10586a
            og.od.m10798c(r8)
            goto L6b
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            og.od.m10798c(r8)
            goto L49
        L39:
            og.od.m10798c(r8)
            java.lang.Object r8 = r7.f265b
            xm.y5 r8 = (xm.y5) r8
            r0.f10589d = r5
            java.lang.Object r8 = r8.m15696l(r0)
            if (r8 != r1) goto L49
            goto L69
        L49:
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r5 = r7.f267d
            xm.r3 r5 = (xm.r3) r5
            rm.c r6 = new rm.c
            java.lang.Object r8 = r8.get(r3)
            mm.m r8 = (mm.C4802m) r8
            r6.<init>(r8)
            r0.f10586a = r2
            r0.f10589d = r4
            java.lang.Object r8 = r5.m15602a(r6, r0)
            if (r8 != r1) goto L6a
        L69:
            return r1
        L6a:
            r0 = r2
        L6b:
            im.k1 r8 = (im.k1) r8
            boolean r1 = r8 instanceof im.i1
            if (r1 == 0) goto L91
            im.i1 r8 = (im.i1) r8
            java.lang.Object r8 = r8.f17561a
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
        L7b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L90
            java.lang.Object r1 = r8.next()
            com.websoptimization.callyzerbiz.data.model.response.AllEmployeeResponse r1 = (com.websoptimization.callyzerbiz.data.model.response.AllEmployeeResponse) r1
            as.a r2 = new as.a
            r2.<init>(r1, r3)
            r0.add(r2)
            goto L7b
        L90:
            return r0
        L91:
            rw.r r8 = rw.C6668r.f31943a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C0073l.m228u(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:13:0x0029, B:28:0x006e, B:30:0x0074, B:31:0x007e, B:33:0x0084, B:34:0x0093, B:36:0x009b, B:38:0x009f, B:40:0x00a7), top: B:48:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:13:0x0029, B:28:0x006e, B:30:0x0074, B:31:0x007e, B:33:0x0084, B:34:0x0093, B:36:0x009b, B:38:0x009f, B:40:0x00a7), top: B:48:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable m229v(ww.AbstractC8193c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof fo.C2338b
            if (r0 == 0) goto L13
            r0 = r8
            fo.b r0 = (fo.C2338b) r0
            int r1 = r0.f10593d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10593d = r1
            goto L18
        L13:
            fo.b r0 = new fo.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f10591b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10593d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.util.ArrayList r0 = r0.f10590a
            og.od.m10798c(r8)     // Catch: java.lang.Exception -> L2d
            goto L6e
        L2d:
            r8 = move-exception
            goto Lb1
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            og.od.m10798c(r8)
            goto L4c
        L3c:
            og.od.m10798c(r8)
            java.lang.Object r8 = r7.f265b
            xm.y5 r8 = (xm.y5) r8
            r0.f10593d = r5
            java.lang.Object r8 = r8.m15696l(r0)
            if (r8 != r1) goto L4c
            goto L6c
        L4c:
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r5 = r7.f267d     // Catch: java.lang.Exception -> Laf
            xm.r3 r5 = (xm.r3) r5     // Catch: java.lang.Exception -> Laf
            rm.c r6 = new rm.c     // Catch: java.lang.Exception -> Laf
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Exception -> Laf
            mm.m r8 = (mm.C4802m) r8     // Catch: java.lang.Exception -> Laf
            r6.<init>(r8)     // Catch: java.lang.Exception -> Laf
            r0.f10590a = r2     // Catch: java.lang.Exception -> Laf
            r0.f10593d = r4     // Catch: java.lang.Exception -> Laf
            java.lang.Object r8 = r5.m15603b(r6, r0)     // Catch: java.lang.Exception -> Laf
            if (r8 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r0 = r2
        L6e:
            im.k1 r8 = (im.k1) r8     // Catch: java.lang.Exception -> L2d
            boolean r1 = r8 instanceof im.i1     // Catch: java.lang.Exception -> L2d
            if (r1 == 0) goto L9b
            im.i1 r8 = (im.i1) r8     // Catch: java.lang.Exception -> L2d
            java.lang.Object r8 = r8.f17561a     // Catch: java.lang.Exception -> L2d
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> L2d
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L2d
        L7e:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Exception -> L2d
            if (r1 == 0) goto L93
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L2d
            as.b r2 = new as.b     // Catch: java.lang.Exception -> L2d
            r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L2d
            r0.add(r2)     // Catch: java.lang.Exception -> L2d
            goto L7e
        L93:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L2d
            qw.k r1 = new qw.k     // Catch: java.lang.Exception -> L2d
            r1.<init>(r0, r8)     // Catch: java.lang.Exception -> L2d
            return r1
        L9b:
            boolean r8 = r8 instanceof im.j1     // Catch: java.lang.Exception -> L2d
            if (r8 == 0) goto La7
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L2d
            qw.k r1 = new qw.k     // Catch: java.lang.Exception -> L2d
            r1.<init>(r0, r8)     // Catch: java.lang.Exception -> L2d
            return r1
        La7:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L2d
            qw.k r1 = new qw.k     // Catch: java.lang.Exception -> L2d
            r1.<init>(r0, r8)     // Catch: java.lang.Exception -> L2d
            return r1
        Laf:
            r8 = move-exception
            r0 = r2
        Lb1:
            java.lang.Object r1 = r7.f266c
            yv.t r1 = (yv.C8805t) r1
            java.lang.String r2 = "AddLead"
            r1.m16234i(r2, r8)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            qw.k r1 = new qw.k
            r1.<init>(r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C0073l.m229v(ww.c):java.io.Serializable");
    }

    /* renamed from: w */
    public float m230w(int i10, boolean z6) {
        Layout layout = (Layout) this.f264a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i10));
        if (i10 > lineEnd) {
            i10 = lineEnd;
        }
        return z6 ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
    }

    /* renamed from: x */
    public float m231x(int i10, boolean z6, boolean z10) {
        int i11;
        int i12;
        int iM195D = i10;
        Layout layout = (Layout) this.f264a;
        if (!z10) {
            return m230w(i10, z6);
        }
        int iM6964d = AbstractC2838o.m6964d(layout, iM195D, z10);
        int lineStart = layout.getLineStart(iM6964d);
        int lineEnd = layout.getLineEnd(iM6964d);
        if (iM195D != lineStart && iM195D != lineEnd) {
            return m230w(i10, z6);
        }
        if (iM195D == 0 || iM195D == layout.getText().length()) {
            return m230w(i10, z6);
        }
        int iM233z = m233z(iM195D, z10);
        boolean z11 = layout.getParagraphDirection(layout.getLineForOffset(m192A(iM233z))) == -1;
        int iM195D2 = m195D(lineEnd, lineStart);
        int iM192A = m192A(iM233z);
        int i13 = lineStart - iM192A;
        int i14 = iM195D2 - iM192A;
        Bidi bidiM217i = m217i(iM233z);
        Bidi bidiCreateLineBidi = bidiM217i != null ? bidiM217i.createLineBidi(i13, i14) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z6 || z11 == zIsRtlCharAt) {
                z11 = !z11;
            }
            return iM195D == lineStart ? z11 : !z11 ? layout.getLineLeft(iM6964d) : layout.getLineRight(iM6964d);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        C2834k[] c2834kArr = new C2834k[runCount];
        for (int i15 = 0; i15 < runCount; i15++) {
            c2834kArr[i15] = new C2834k(bidiCreateLineBidi.getRunStart(i15) + lineStart, bidiCreateLineBidi.getRunLimit(i15) + lineStart, bidiCreateLineBidi.getRunLevel(i15) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i16 = 0; i16 < runCount2; i16++) {
            bArr[i16] = (byte) bidiCreateLineBidi.getRunLevel(i16);
        }
        Bidi.reorderVisually(bArr, 0, c2834kArr, 0, runCount);
        if (iM195D == lineStart) {
            int i17 = 0;
            while (true) {
                if (i17 >= runCount) {
                    i12 = -1;
                    break;
                }
                if (c2834kArr[i17].f15813a == iM195D) {
                    i12 = i17;
                    break;
                }
                i17++;
            }
            boolean z12 = (z6 || z11 == c2834kArr[i12].f15815c) ? !z11 : z11;
            return (i12 == 0 && z12) ? layout.getLineLeft(iM6964d) : (i12 != runCount - 1 || z12) ? z12 ? layout.getPrimaryHorizontal(c2834kArr[i12 - 1].f15813a) : layout.getPrimaryHorizontal(c2834kArr[i12 + 1].f15813a) : layout.getLineRight(iM6964d);
        }
        if (iM195D > iM195D2) {
            iM195D = m195D(iM195D, lineStart);
        }
        int i18 = 0;
        while (true) {
            if (i18 >= runCount) {
                i11 = -1;
                break;
            }
            if (c2834kArr[i18].f15814b == iM195D) {
                i11 = i18;
                break;
            }
            i18++;
        }
        boolean z13 = (z6 || z11 == c2834kArr[i11].f15815c) ? z11 : !z11;
        return (i11 == 0 && z13) ? layout.getLineLeft(iM6964d) : (i11 != runCount - 1 || z13) ? z13 ? layout.getPrimaryHorizontal(c2834kArr[i11 - 1].f15814b) : layout.getPrimaryHorizontal(c2834kArr[i11 + 1].f15814b) : layout.getLineRight(iM6964d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m232y(mm.C4802m r9, boolean r10, ww.AbstractC8193c r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f266c
            yv.t r0 = (yv.C8805t) r0
            java.lang.String r1 = "selectedLeadSIM is "
            boolean r2 = r11 instanceof fo.C2339c
            if (r2 == 0) goto L19
            r2 = r11
            fo.c r2 = (fo.C2339c) r2
            int r3 = r2.f10597d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f10597d = r3
            goto L1e
        L19:
            fo.c r2 = new fo.c
            r2.<init>(r8, r11)
        L1e:
            java.lang.Object r11 = r2.f10595b
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f10597d
            java.lang.String r5 = "Something went wrong"
            java.lang.String r6 = "AddLead"
            r7 = 1
            if (r4 == 0) goto L3e
            if (r4 != r7) goto L36
            boolean r10 = r2.f10594a
            og.od.m10798c(r11)     // Catch: java.lang.Exception -> L33
            goto L57
        L33:
            r9 = move-exception
            goto Lad
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            og.od.m10798c(r11)
            if (r9 == 0) goto L98
            java.lang.Object r11 = r8.f267d     // Catch: java.lang.Exception -> L33
            xm.r3 r11 = (xm.r3) r11     // Catch: java.lang.Exception -> L33
            rm.a r1 = new rm.a     // Catch: java.lang.Exception -> L33
            r1.<init>(r9)     // Catch: java.lang.Exception -> L33
            r2.f10594a = r10     // Catch: java.lang.Exception -> L33
            r2.f10597d = r7     // Catch: java.lang.Exception -> L33
            java.lang.Object r11 = r11.m15605d(r1, r2)     // Catch: java.lang.Exception -> L33
            if (r11 != r3) goto L57
            return r3
        L57:
            im.k1 r11 = (im.k1) r11     // Catch: java.lang.Exception -> L33
            boolean r9 = r11 instanceof im.i1     // Catch: java.lang.Exception -> L33
            if (r9 == 0) goto L6d
            im.i1 r11 = (im.i1) r11     // Catch: java.lang.Exception -> L33
            java.lang.Object r9 = r11.f17561a     // Catch: java.lang.Exception -> L33
            com.websoptimization.callyzerbiz.data.model.response.lead_form_response.LeadFormResponse r9 = (com.websoptimization.callyzerbiz.data.model.response.lead_form_response.LeadFormResponse) r9     // Catch: java.lang.Exception -> L33
            or.b r9 = og.b2.m10544b(r9, r10)     // Catch: java.lang.Exception -> L33
            im.i1 r10 = new im.i1     // Catch: java.lang.Exception -> L33
            r10.<init>(r9)     // Catch: java.lang.Exception -> L33
            return r10
        L6d:
            boolean r9 = r11 instanceof im.g1     // Catch: java.lang.Exception -> L33
            if (r9 == 0) goto L7b
            im.g1 r9 = new im.g1     // Catch: java.lang.Exception -> L33
            im.g1 r11 = (im.g1) r11     // Catch: java.lang.Exception -> L33
            im.f1 r10 = r11.f17557a     // Catch: java.lang.Exception -> L33
            r9.<init>(r10)     // Catch: java.lang.Exception -> L33
            return r9
        L7b:
            boolean r9 = r11 instanceof im.h1     // Catch: java.lang.Exception -> L33
            if (r9 == 0) goto L89
            im.h1 r9 = new im.h1     // Catch: java.lang.Exception -> L33
            im.h1 r11 = (im.h1) r11     // Catch: java.lang.Exception -> L33
            java.lang.String r10 = r11.f17560a     // Catch: java.lang.Exception -> L33
            r9.<init>(r10)     // Catch: java.lang.Exception -> L33
            return r9
        L89:
            im.j1 r9 = im.j1.f17563a     // Catch: java.lang.Exception -> L33
            boolean r10 = kotlin.jvm.internal.AbstractC4154l.m8918a(r11, r9)     // Catch: java.lang.Exception -> L33
            if (r10 == 0) goto L92
            return r9
        L92:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L33
            r9.<init>()     // Catch: java.lang.Exception -> L33
            throw r9     // Catch: java.lang.Exception -> L33
        L98:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L33
            r10.<init>(r1)     // Catch: java.lang.Exception -> L33
            r10.append(r9)     // Catch: java.lang.Exception -> L33
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Exception -> L33
            r0.m16232g(r6, r9)     // Catch: java.lang.Exception -> L33
            im.h1 r9 = new im.h1     // Catch: java.lang.Exception -> L33
            r9.<init>(r5)     // Catch: java.lang.Exception -> L33
            return r9
        Lad:
            r0.m16239n(r6, r9)
            im.h1 r9 = new im.h1
            r9.<init>(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C0073l.m232y(mm.m, boolean, ww.c):java.lang.Object");
    }

    /* renamed from: z */
    public int m233z(int i10, boolean z6) {
        ArrayList arrayList = (ArrayList) this.f265b;
        int iM10827b = pe.m10827b(arrayList, Integer.valueOf(i10));
        int i11 = iM10827b < 0 ? -(iM10827b + 1) : iM10827b + 1;
        if (z6 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == ((Number) arrayList.get(i12)).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public C0073l(Map initialState) {
        AbstractC4154l.m8923f(initialState, "initialState");
        this.f264a = AbstractC6674x.m12786n(initialState);
        this.f265b = new LinkedHashMap();
        this.f266c = new LinkedHashMap();
        this.f267d = new LinkedHashMap();
        this.f268e = new C1870e(1, this);
    }

    public C0073l(y5 userSIMRepository, C8805t c8805t, r3 r3Var, Context context, C8810d c8810d) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f265b = userSIMRepository;
        this.f266c = c8805t;
        this.f267d = r3Var;
        this.f264a = context;
        this.f268e = c8810d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    public C0073l(C2492h c2492h, o0 o0Var, List list, InterfaceC6747c interfaceC6747c, InterfaceC3987h interfaceC3987h) {
        int i10;
        String strSubstring;
        ArrayList arrayList;
        List list2;
        C2492h c2492h2 = c2492h;
        o0 o0Var2 = o0Var;
        this.f264a = c2492h2;
        this.f265b = list;
        EnumC6359i enumC6359i = EnumC6359i.NONE;
        int i11 = 1;
        this.f266c = nd.m10781b(enumC6359i, new C2502r(this, i11));
        int i12 = 0;
        this.f267d = nd.m10781b(enumC6359i, new C2502r(this, i12));
        C2506v c2506v = o0Var2.f13689b;
        C2492h c2492h3 = AbstractC2494j.f13657a;
        ArrayList arrayList2 = c2492h2.f13622d;
        String str = c2492h2.f13620b;
        C6668r c6668r = C6668r.f31943a;
        List listM12760X = arrayList2 != null ? AbstractC6663m.m12760X(arrayList2, new C2491g(i11)) : c6668r;
        ArrayList arrayList3 = new ArrayList();
        C6661k c6661k = new C6661k();
        int size = listM12760X.size();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            C2490f c2490f = (C2490f) listM12760X.get(i13);
            C2490f c2490fM6430a = C2490f.m6430a(c2490f, c2506v.m6483a((C2506v) c2490f.f13595a), i12, 14);
            Object obj = c2490fM6430a.f13595a;
            int i15 = c2490fM6430a.f13597c;
            int i16 = c2490fM6430a.f13596b;
            while (i14 < i16 && !c6661k.isEmpty()) {
                C2490f c2490f2 = (C2490f) c6661k.last();
                List list3 = listM12760X;
                int i17 = c2490f2.f13597c;
                C6668r c6668r2 = c6668r;
                Object obj2 = c2490f2.f13595a;
                if (i16 < i17) {
                    arrayList3.add(new C2490f(obj2, i14, i16));
                    i14 = i16;
                    listM12760X = list3;
                    c6668r = c6668r2;
                } else {
                    int i18 = size;
                    arrayList3.add(new C2490f(obj2, i14, i17));
                    i14 = c2490f2.f13597c;
                    while (!c6661k.isEmpty() && i14 == ((C2490f) c6661k.last()).f13597c) {
                        c6661k.removeLast();
                    }
                    listM12760X = list3;
                    c6668r = c6668r2;
                    size = i18;
                }
            }
            List list4 = listM12760X;
            C6668r c6668r3 = c6668r;
            int i19 = size;
            if (i14 < i16) {
                arrayList3.add(new C2490f(c2506v, i14, i16));
                i14 = i16;
            }
            C2490f c2490f3 = (C2490f) c6661k.m12693t();
            if (c2490f3 != null) {
                int i20 = c2490f3.f13597c;
                Object obj3 = c2490f3.f13595a;
                int i21 = c2490f3.f13596b;
                if (i21 == i16 && i20 == i15) {
                    c6661k.removeLast();
                    c6661k.addLast(new C2490f(((C2506v) obj3).m6483a((C2506v) obj), i16, i15));
                } else if (i21 == i20) {
                    arrayList3.add(new C2490f(obj3, i21, i20));
                    c6661k.removeLast();
                    c6661k.addLast(new C2490f(obj, i16, i15));
                } else if (i20 >= i15) {
                    c6661k.addLast(new C2490f(((C2506v) obj3).m6483a((C2506v) obj), i16, i15));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                c6661k.addLast(new C2490f(obj, i16, i15));
            }
            i13++;
            listM12760X = list4;
            c6668r = c6668r3;
            size = i19;
            i12 = 0;
        }
        C6668r c6668r4 = c6668r;
        while (i14 <= str.length() && !c6661k.isEmpty()) {
            C2490f c2490f4 = (C2490f) c6661k.last();
            Object obj4 = c2490f4.f13595a;
            int i22 = c2490f4.f13597c;
            arrayList3.add(new C2490f(obj4, i14, i22));
            while (!c6661k.isEmpty() && i22 == ((C2490f) c6661k.last()).f13597c) {
                c6661k.removeLast();
            }
            i14 = i22;
        }
        if (i14 < str.length()) {
            arrayList3.add(new C2490f(c2506v, i14, str.length()));
        }
        if (arrayList3.isEmpty()) {
            i10 = 0;
            arrayList3.add(new C2490f(c2506v, 0, 0));
        } else {
            i10 = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i23 = i10;
        while (i23 < size2) {
            C2490f c2490f5 = (C2490f) arrayList3.get(i23);
            int i24 = c2490f5.f13596b;
            int i25 = c2490f5.f13597c;
            if (i24 != i25) {
                strSubstring = str.substring(i24, i25);
                AbstractC4154l.m8922e(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            List listM6441a = AbstractC2494j.m6441a(c2492h2, i24, i25, C2493i.f13633b);
            C2492h c2492h4 = new C2492h(strSubstring, listM6441a == null ? c6668r4 : listM6441a);
            C2506v c2506v2 = (C2506v) c2490f5.f13595a;
            if (c2506v2.f13720b == Integer.MIN_VALUE) {
                arrayList = arrayList3;
                c2506v2 = new C2506v(c2506v2.f13719a, c2506v.f13720b, c2506v2.f13721c, c2506v2.f13722d, c2506v2.f13723e, c2506v2.f13724f, c2506v2.f13725g, c2506v2.f13726h, c2506v2.f13727i);
            } else {
                arrayList = arrayList3;
            }
            o0 o0Var3 = new o0(o0Var2.f13688a, c2506v.m6483a(c2506v2));
            ?? r62 = c2492h4.f13619a;
            C6668r c6668r5 = r62 == 0 ? c6668r4 : r62;
            List list5 = (List) this.f265b;
            ArrayList arrayList5 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i26 = 0;
            while (i26 < size3) {
                C2490f c2490f6 = (C2490f) list5.get(i26);
                C2506v c2506v3 = c2506v;
                int i27 = c2490f6.f13596b;
                o0 o0Var4 = o0Var3;
                int i28 = c2490f6.f13597c;
                if (AbstractC2494j.m6442b(i24, i25, i27, i28)) {
                    if (i24 > i27 || i28 > i25) {
                        AbstractC4646a.m9525a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list5;
                    arrayList5.add(new C2490f(c2490f6.f13595a, i27 - i24, i28 - i24));
                } else {
                    list2 = list5;
                }
                i26++;
                list5 = list2;
                o0Var3 = o0Var4;
                c2506v = c2506v3;
            }
            arrayList4.add(new C2504t(new C5288d(strSubstring, o0Var3, c6668r5, arrayList5, interfaceC3987h, interfaceC6747c), i24, i25));
            i23++;
            c2492h2 = c2492h;
            o0Var2 = o0Var;
            arrayList3 = arrayList;
        }
        this.f268e = arrayList4;
    }

    public C0073l(l7.a0 a0Var) {
        Intent launchIntentForPackage;
        Context context = a0Var.f21995a;
        AbstractC4154l.m8923f(context, "context");
        this.f264a = context;
        this.f265b = new C2856l(context, false);
        Activity activity = (Activity) AbstractC4913i.m9808d(AbstractC4913i.m9812h(AbstractC4913i.m9809e(new hq.d0(8), context), new hq.d0(9)));
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f266c = launchIntentForPackage;
        this.f268e = new ArrayList();
        this.f267d = a0Var.f21996b.m12174i();
    }

    public C0073l() {
        this.f268e = C6669s.f31944a;
        this.f265b = "GET";
        this.f266c = new i3(2);
    }
}
