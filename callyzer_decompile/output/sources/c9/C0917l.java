package c9;

import al.C0178f;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase_Impl;
import c0.f0;
import c5.C0863a;
import c5.C0867e;
import c5.C0869g;
import c5.C0870h;
import c6.C0892v;
import coil.request.NullRequestDataException;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import e1.AbstractC1916r;
import e1.C1915q;
import e1.e0;
import e1.j0;
import e1.u0;
import eb.q0;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ge.C2571c;
import ge.C2573e;
import ge.C2577i;
import gl.AbstractC2625a;
import gl.C2626b;
import gl.C2627c;
import gl.C2629e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.v0;
import k4.C4001v;
import ke.AbstractC4060a;
import ke.AbstractC4064e;
import ke.C4070k;
import ke.ComponentCallbacks2C4071l;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4417q;
import m2.C4640e;
import og.bh;
import oi.C5388b;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p009j.AbstractC3500a;
import p020v.C7612v;
import qi.C6221d;
import qv.C6334i;
import sf.AbstractC6840z;
import t2.C7002a;
import t2.InterfaceC7012k;
import tb.C7105p;
import u5.C7340b;
import u6.AbstractC7347a;
import ug.C7439j;
import ug.g1;
import v6.C7676b;
import v6.C7678d;
import v6.C7681g;
import vk.C7715a;
import vk.C7716b;
import wd.C7998f;
import y4.C8542c;
import y7.d1;
import y7.t0;
import z4.C8865c;
import z4.C8867e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c9.l */
/* loaded from: classes.dex */
public final class C0917l implements InterfaceC7012k, f0 {

    /* renamed from: a */
    public final /* synthetic */ int f5593a;

    /* renamed from: b */
    public Object f5594b;

    /* renamed from: c */
    public Object f5595c;

    public /* synthetic */ C0917l(int i10, Object obj, Object obj2) {
        this.f5593a = i10;
        this.f5594b = obj;
        this.f5595c = obj2;
    }

    /* renamed from: g */
    public static C2573e m2635g(C2577i c2577i, Throwable th2) {
        if (th2 instanceof NullRequestDataException) {
            c2577i.getClass();
            C2571c c2571c = c2577i.f14043z;
            c2571c.getClass();
            C2571c c2571c2 = AbstractC4064e.f20918a;
            c2571c.getClass();
        } else {
            c2577i.f14043z.getClass();
            C2571c c2571c3 = AbstractC4064e.f20918a;
        }
        return new C2573e(null, c2577i, th2);
    }

    /* renamed from: k */
    public static void m2636k(C0917l c0917l, C8542c c8542c, float f6, int i10) {
        if ((i10 & 2) != 0) {
            f6 = 0;
        }
        c0917l.m2644j(c8542c, f6, 0);
    }

    @Override // t2.InterfaceC7012k
    /* renamed from: a */
    public Object mo2637a(Object obj) {
        return ((InterfaceC2139c) this.f5595c).invoke(obj);
    }

    @Override // t2.InterfaceC7012k
    /* renamed from: b */
    public Object mo2638b(C7002a c7002a, Object obj) {
        return ((InterfaceC2141e) this.f5594b).invoke(c7002a, obj);
    }

    /* renamed from: c */
    public void m2639c(t0 t0Var, C0892v c0892v) {
        u0 u0Var = (u0) this.f5594b;
        d1 d1VarM15842a = (d1) u0Var.get(t0Var);
        if (d1VarM15842a == null) {
            d1VarM15842a = d1.m15842a();
            u0Var.put(t0Var, d1VarM15842a);
        }
        d1VarM15842a.f41603c = c0892v;
        d1VarM15842a.f41601a |= 8;
    }

    /* renamed from: d */
    public void m2640d() {
        C7439j c7439j = (C7439j) this.f5594b;
        if (c7439j != null) {
            ((AtomicBoolean) c7439j.f35538c).set(true);
            ((ScheduledFuture) c7439j.f35537b).cancel(true);
        }
        this.f5594b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* renamed from: e */
    public ArrayList m2641e() throws PackageManager.NameNotFoundException {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        C4001v c4001v = (C4001v) this.f5595c;
        Context context = (Context) this.f5594b;
        Class cls = (Class) c4001v.f20704b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Objects.toString(cls);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C6221d(0, (String) it.next()));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0204 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e2  */
    @Override // c0.f0
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo26f(c0.p1 r24) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0917l.mo26f(c0.p1):void");
    }

    /* renamed from: h */
    public KeyListener m2642h(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C7105p) ((g1) this.f5595c).f35448a).getClass();
        if (keyListener instanceof C7678d) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C7678d(keyListener);
    }

    /* renamed from: i */
    public String m2643i(String str) {
        String str2 = (String) this.f5595c;
        Resources resources = (Resources) this.f5594b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* renamed from: j */
    public void m2644j(C8542c c8542c, float f6, float f10) {
        int i10 = c8542c.f41498b;
        String str = "top";
        if (i10 != 0 && i10 == 1) {
            str = "bottom";
        }
        C0863a c0863a = new C0863a(new char[0]);
        c0863a.m2317m(C0870h.m2333m(c8542c.f41497a.toString()));
        c0863a.m2317m(C0870h.m2333m(str));
        c0863a.m2317m(new C0867e(f6));
        c0863a.m2317m(new C0867e(f10));
        ((C0869g) this.f5594b).m2315E((String) this.f5595c, c0863a);
    }

    /* renamed from: l */
    public void m2645l(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f5594b).getContext().obtainStyledAttributes(attributeSet, AbstractC3500a.f18350g, i10, 0);
        try {
            boolean z6 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m2652s(z6);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* renamed from: m */
    public void m2646m() throws IOException {
        String str = (String) this.f5594b;
        if (((FileChannel) this.f5595c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f5595c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th2) {
            FileChannel fileChannel = (FileChannel) this.f5595c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f5595c = null;
            throw new IllegalStateException(AbstractC5601a.m11238i("Unable to lock file: '", str, "'."), th2);
        }
    }

    /* renamed from: n */
    public C7676b m2647n(InputConnection inputConnection) {
        g1 g1Var = (g1) this.f5595c;
        if (inputConnection == null) {
            g1Var.getClass();
            inputConnection = null;
        } else {
            C7105p c7105p = (C7105p) g1Var.f35448a;
            c7105p.getClass();
            if (!(inputConnection instanceof C7676b)) {
                inputConnection = new C7676b((EditText) c7105p.f34290b, inputConnection);
            }
        }
        return (C7676b) inputConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ge.C2580l m2648o(ge.C2577i r17, he.C2916g r18) {
        /*
            r16 = this;
            r0 = r17
            r4 = r18
            java.util.List r1 = r0.f14023f
            android.graphics.Bitmap$Config r2 = r0.f14021d
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1a
            android.graphics.Bitmap$Config[] r1 = ke.AbstractC4066g.f20920a
            boolean r1 = rw.AbstractC6662l.m12713c(r1, r2)
            if (r1 == 0) goto L17
            goto L1a
        L17:
            r1 = r16
            goto L3c
        L1a:
            boolean r1 = bg.AbstractC0656a.m1906o(r2)
            if (r1 != 0) goto L23
            r1 = r16
            goto L3e
        L23:
            boolean r1 = bg.AbstractC0656a.m1906o(r2)
            if (r1 != 0) goto L2c
        L29:
            r1 = r16
            goto L31
        L2c:
            boolean r1 = r0.f14028k
            if (r1 != 0) goto L29
            goto L17
        L31:
            java.lang.Object r3 = r1.f5595c
            ke.i r3 = (ke.InterfaceC4068i) r3
            boolean r3 = r3.mo5735a(r4)
            if (r3 == 0) goto L3c
            goto L3e
        L3c:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L3e:
            pg.p r3 = r4.f15948a
            he.b r5 = he.C2911b.f15945b
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L55
            pg.p r3 = r4.f15949b
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L51
            goto L55
        L51:
            he.f r3 = r0.f14040w
        L53:
            r5 = r3
            goto L58
        L55:
            he.f r3 = he.EnumC2915f.FIT
            goto L53
        L58:
            boolean r3 = r0.f14029l
            if (r3 == 0) goto L6b
            java.util.List r3 = r0.f14023f
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L6b
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 == r3) goto L6b
            r3 = 1
        L69:
            r7 = r3
            goto L6d
        L6b:
            r3 = 0
            goto L69
        L6d:
            ge.l r3 = new ge.l
            android.content.Context r1 = r0.f14018a
            boolean r6 = ke.AbstractC4064e.m8839a(r0)
            boolean r8 = r0.f14030m
            iz.v r10 = r0.f14025h
            ge.p r11 = r0.f14026i
            ge.n r12 = r0.f14041x
            ge.b r13 = r0.f14031n
            ge.b r14 = r0.f14032o
            ge.b r15 = r0.f14033p
            r0 = r3
            r3 = 0
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0917l.m2648o(ge.i, he.g):ge.l");
    }

    /* renamed from: p */
    public C0892v m2649p(t0 t0Var, int i10) {
        d1 d1Var;
        C0892v c0892v;
        u0 u0Var = (u0) this.f5594b;
        int iM5632h = u0Var.m5632h(t0Var);
        if (iM5632h >= 0 && (d1Var = (d1) u0Var.m5637o(iM5632h)) != null) {
            int i11 = d1Var.f41601a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                d1Var.f41601a = i12;
                if (i10 == 4) {
                    c0892v = d1Var.f41602b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0892v = d1Var.f41603c;
                }
                if ((i12 & 12) == 0) {
                    u0Var.m5635l(iM5632h);
                    d1Var.f41601a = 0;
                    d1Var.f41602b = null;
                    d1Var.f41603c = null;
                    d1.f41600d.mo1765d(d1Var);
                }
                return c0892v;
            }
        }
        return null;
    }

    /* renamed from: q */
    public void m2650q(t0 t0Var) {
        d1 d1Var = (d1) ((u0) this.f5594b).get(t0Var);
        if (d1Var == null) {
            return;
        }
        d1Var.f41601a &= -2;
    }

    /* renamed from: r */
    public void m2651r(t0 t0Var) {
        C1915q c1915q = (C1915q) this.f5595c;
        int iM5603g = c1915q.m5603g() - 1;
        while (true) {
            if (iM5603g < 0) {
                break;
            }
            if (t0Var == c1915q.m5604i(iM5603g)) {
                Object[] objArr = c1915q.f9039c;
                Object obj = objArr[iM5603g];
                Object obj2 = AbstractC1916r.f9042a;
                if (obj != obj2) {
                    objArr[iM5603g] = obj2;
                    c1915q.f9037a = true;
                }
            } else {
                iM5603g--;
            }
        }
        d1 d1Var = (d1) ((u0) this.f5594b).remove(t0Var);
        if (d1Var != null) {
            d1Var.f41601a = 0;
            d1Var.f41602b = null;
            d1Var.f41603c = null;
            d1.f41600d.mo1765d(d1Var);
        }
    }

    /* renamed from: s */
    public void m2652s(boolean z6) {
        C7681g c7681g = (C7681g) ((C7105p) ((g1) this.f5595c).f35448a).f34291c;
        if (c7681g.f37171b != z6) {
            c7681g.f37171b = z6;
            if (z6) {
                AbstractC7347a.m13754b();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ge.C2580l m2653t(ge.C2580l r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            android.graphics.Bitmap$Config r2 = r0.f14046b
            ge.b r3 = r0.f14059o
            boolean r4 = bg.AbstractC0656a.m1906o(r2)
            r5 = 1
            if (r4 == 0) goto L1f
            java.lang.Object r4 = r1.f5595c
            ke.i r4 = (ke.InterfaceC4068i) r4
            boolean r4 = r4.mo5736b()
            if (r4 == 0) goto L1a
            goto L1f
        L1a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r4 = r5
        L1d:
            r8 = r2
            goto L21
        L1f:
            r4 = 0
            goto L1d
        L21:
            ge.b r2 = r0.f14059o
            boolean r2 = r2.getReadEnabled()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.f5594b
            ke.l r2 = (ke.ComponentCallbacks2C4071l) r2
            monitor-enter(r2)
            r2.m8844a()     // Catch: java.lang.Throwable -> L3b
            boolean r6 = r2.f20939e     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r2)
            if (r6 != 0) goto L3e
            ge.b r3 = ge.EnumC2570b.DISABLED
        L38:
            r21 = r3
            goto L40
        L3b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            throw r0
        L3e:
            r5 = r4
            goto L38
        L40:
            if (r5 == 0) goto L6c
            android.content.Context r7 = r0.f14045a
            android.graphics.ColorSpace r9 = r0.f14047c
            he.g r10 = r0.f14048d
            he.f r11 = r0.f14049e
            boolean r12 = r0.f14050f
            boolean r13 = r0.f14051g
            boolean r14 = r0.f14052h
            java.lang.String r15 = r0.f14053i
            iz.v r2 = r0.f14054j
            ge.p r3 = r0.f14055k
            ge.n r4 = r0.f14056l
            ge.b r5 = r0.f14057m
            ge.b r0 = r0.f14058n
            ge.l r6 = new ge.l
            r20 = r0
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.C0917l.m2653t(ge.l):ge.l");
    }

    public String toString() {
        switch (this.f5593a) {
            case 2:
                return "Bounds{lower=" + ((C7340b) this.f5594b) + " upper=" + ((C7340b) this.f5595c) + "}";
            case 25:
                String string = "[ ";
                if (((C8867e) this.f5594b) != null) {
                    for (int i10 = 0; i10 < 9; i10++) {
                        StringBuilder sbM4568o = AbstractC1452a.m4568o(string);
                        sbM4568o.append(((C8867e) this.f5594b).f42677h[i10]);
                        sbM4568o.append(" ");
                        string = sbM4568o.toString();
                    }
                }
                StringBuilder sbM11245p = AbstractC5601a.m11245p(string, "] ");
                sbM11245p.append((C8867e) this.f5594b);
                return sbM11245p.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m2654u(v0 v0Var) {
        Object objM5574g = ((j0) this.f5595c).m5574g(v0Var);
        if (objM5574g != null) {
            if (!(objM5574g instanceof e0)) {
                throw new ClassCastException();
            }
            e0 e0Var = (e0) objM5574g;
            Object[] objArr = e0Var.f8956a;
            if (e0Var.f8957b <= 0) {
                return;
            }
            AbstractC4154l.m8921d(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    public /* synthetic */ C0917l(int i10, Object obj, Object obj2, boolean z6) {
        this.f5593a = i10;
        this.f5595c = obj;
        this.f5594b = obj2;
    }

    public /* synthetic */ C0917l(int i10, boolean z6) {
        this.f5593a = i10;
    }

    public C0917l(Context context) {
        this.f5593a = 15;
        AbstractC6840z.m13036g(context);
        Resources resources = context.getResources();
        this.f5594b = resources;
        this.f5595c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public C0917l(C4001v c4001v, C7105p c7105p) {
        this.f5593a = 12;
        this.f5595c = c7105p;
        c4001v.m8779t(new C5388b(0, this));
        this.f5594b = new HashSet();
    }

    public C0917l(C6334i c6334i) {
        this.f5593a = 17;
        this.f5594b = c6334i;
        C2626b c2626b = (C2626b) C0178f.m403c().m405a(C2626b.class);
        c2626b.getClass();
        this.f5595c = new C2627c((C2629e) c2626b.f14204a.m343w(C2627c.f14206g), (Executor) c2626b.f14205b.f539a.get(), bh.m10567b(true != AbstractC2625a.m6599c() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning"));
    }

    public C0917l(C7998f c7998f, ComponentCallbacks2C4071l componentCallbacks2C4071l) {
        Object q0Var;
        this.f5593a = 6;
        this.f5594b = componentCallbacks2C4071l;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            boolean z6 = AbstractC4060a.f20911a;
        } else {
            if (!AbstractC4060a.f20911a) {
                if (i10 != 26 && i10 != 27) {
                    q0Var = new q0(true);
                } else {
                    q0Var = new C4070k();
                }
            }
            this.f5595c = q0Var;
        }
        q0Var = new q0(false);
        this.f5595c = q0Var;
    }

    public C0917l(WorkDatabase_Impl workDatabase_Impl) {
        this.f5593a = 0;
        this.f5594b = workDatabase_Impl;
        this.f5595c = new C0907b(workDatabase_Impl, 3);
    }

    public C0917l(String str) {
        this.f5593a = 1;
        this.f5594b = str.concat(".lck");
    }

    public C0917l(C8865c c8865c) {
        this.f5593a = 25;
        this.f5595c = c8865c;
    }

    public C0917l(Context context, String str, String str2) {
        this.f5593a = 5;
        this.f5595c = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f5594b = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f5594b = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    public C0917l(C4417q c4417q, C7715a c7715a, C7716b c7716b) {
        this.f5593a = 22;
        C0908c c0908c = new C0908c(20);
        C0919n c0919n = new C0919n();
        c0919n.f5598a = c7715a;
        c0919n.f5599b = c7716b;
        c0919n.f5600c = c0908c;
        c0919n.f5601d = new ConcurrentHashMap();
        this.f5594b = c4417q;
        this.f5595c = c0919n;
    }

    public C0917l(EditText editText) {
        this.f5593a = 11;
        this.f5594b = editText;
        g1 g1Var = new g1();
        g1Var.f35448a = new C7105p(editText);
        this.f5595c = g1Var;
    }

    public C0917l(int i10) {
        this.f5593a = i10;
        switch (i10) {
            case 9:
                this.f5594b = new j0();
                this.f5595c = new j0();
                break;
            case 10:
                this.f5594b = new C4417q();
                break;
            case 21:
                this.f5594b = new C4640e(new Reference[16]);
                this.f5595c = new ReferenceQueue();
                break;
            case 24:
                this.f5594b = new u0(0);
                this.f5595c = new C1915q((Object) null);
                break;
            default:
                this.f5594b = new ArrayList();
                this.f5595c = new ArrayList();
                break;
        }
    }

    public C0917l(int i10, C0869g c0869g) {
        this.f5593a = 23;
        this.f5594b = c0869g;
        String str = "top";
        if (i10 != 0 && i10 == 1) {
            str = "bottom";
        }
        this.f5595c = str;
    }

    public C0917l(WindowInsetsAnimation.Bounds bounds) {
        this.f5593a = 2;
        this.f5594b = c6.g1.m2383e(bounds);
        this.f5595c = c6.g1.m2382d(bounds);
    }

    public C0917l(C7612v c7612v) {
        this.f5593a = 19;
        this.f5595c = c7612v;
        this.f5594b = null;
    }
}
