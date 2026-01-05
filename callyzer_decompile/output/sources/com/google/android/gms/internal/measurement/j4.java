package com.google.android.gms.internal.measurement;

import a1.RunnableC0012k;
import ac.C0088a;
import ad.C0115v;
import ad.C0116w;
import ad.C0118y;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.text.TextUtils;
import android.view.Surface;
import ao.C0381t;
import b2.C0558p;
import b2.C0560r;
import b2.EnumC0555m;
import c0.C0808a;
import c9.C0927v;
import com.google.android.gms.internal.measurement.j4;
import e1.C1915q;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import j0.AbstractC3504d;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import og.df;
import p005f.C2164m;
import p021w.C7843i;
import p022x.C8233c;
import p022x.InterfaceC8232b;
import p3.AbstractC5818p;
import p3.C5821s;
import r5.AbstractC6468c;
import rw.AbstractC6663m;
import sd.C6813g;
import sd.InterfaceC6811e;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vx.C7806h;
import vx.EnumC7799a;
import yg.C8656m;
import yg.InterfaceC8655l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j4 implements i0.d1 {

    /* renamed from: e */
    public static j4 f6249e;

    /* renamed from: a */
    public final /* synthetic */ int f6250a;

    /* renamed from: b */
    public boolean f6251b;

    /* renamed from: c */
    public final Object f6252c;

    /* renamed from: d */
    public Object f6253d;

    public j4(byte b10, int i10) {
        this.f6250a = i10;
        switch (i10) {
            case 8:
                this.f6252c = new Object();
                break;
            default:
                this.f6251b = false;
                this.f6252c = null;
                this.f6253d = null;
                break;
        }
    }

    /* renamed from: e */
    public static boolean m3386e(c0.a0 a0Var, c0.a0 a0Var2) {
        boolean zM2139b = a0Var2.m2139b();
        int i10 = a0Var2.f5041a;
        og.y0.m11056f("Fully specified range is not actually fully specified.", zM2139b);
        int i11 = a0Var.f5041a;
        if (i11 == 2 && i10 == 1) {
            return false;
        }
        if (i11 != 2 && i11 != 0 && i11 != i10) {
            return false;
        }
        int i12 = a0Var.f5042b;
        return i12 == 0 || i12 == a0Var2.f5042b;
    }

    /* renamed from: f */
    public static boolean m3387f(c0.a0 a0Var, c0.a0 a0Var2, HashSet hashSet) {
        if (hashSet.contains(a0Var2)) {
            return m3386e(a0Var, a0Var2);
        }
        a0Var.toString();
        a0Var2.toString();
        og.u1.m10942a("DynamicRangeResolver");
        return false;
    }

    /* renamed from: i */
    public static String m3388i(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* renamed from: l */
    public static c0.a0 m3389l(c0.a0 a0Var, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (a0Var.f5041a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            c0.a0 a0Var2 = (c0.a0) it.next();
            og.y0.m11055e(a0Var2, "Fully specified DynamicRange cannot be null.");
            int i10 = a0Var2.f5041a;
            og.y0.m11056f("Fully specified DynamicRange must have fully defined encoding.", a0Var2.m2139b());
            if (i10 != 1 && m3387f(a0Var, a0Var2, hashSet)) {
                return a0Var2;
            }
        }
        return null;
    }

    /* renamed from: q */
    public static void m3390q(HashSet hashSet, c0.a0 a0Var, C8233c c8233c) {
        og.y0.m11056f("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set setMo15406b = ((InterfaceC8232b) c8233c.f39372a).mo15406b(a0Var);
        if (setMo15406b.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setMo15406b);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + a0Var + "\nConstraints:\n  " + TextUtils.join("\n  ", setMo15406b) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }

    /* renamed from: r */
    public static j4 m3391r(Context context) {
        j4 j4Var;
        synchronized (j4.class) {
            try {
                if (f6249e == null) {
                    f6249e = AbstractC6468c.m12451b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new j4(context) : new j4((byte) 0, 0);
                }
                j4 j4Var2 = f6249e;
                if (j4Var2 != null && ((i4) j4Var2.f6253d) != null && !j4Var2.f6251b) {
                    try {
                        context.getContentResolver().registerContentObserver(a4.f6054a, true, (i4) f6249e.f6253d);
                        j4 j4Var3 = f6249e;
                        j4Var3.getClass();
                        j4Var3.f6251b = true;
                    } catch (SecurityException unused) {
                    }
                }
                j4Var = f6249e;
                j4Var.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j4Var;
    }

    @Override // i0.d1
    /* renamed from: D */
    public c0.b1 mo1870D() {
        Image imageAcquireNextImage;
        synchronized (this.f6253d) {
            try {
                imageAcquireNextImage = ((ImageReader) this.f6252c).acquireNextImage();
            } catch (RuntimeException e2) {
                if (!"ImageReaderContext is not initialized".equals(e2.getMessage())) {
                    throw e2;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new C0808a(imageAcquireNextImage);
        }
    }

    @Override // i0.d1
    /* renamed from: a */
    public void mo1871a(final i0.c1 c1Var, final Executor executor) {
        synchronized (this.f6253d) {
            this.f6251b = false;
            ((ImageReader) this.f6252c).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: c0.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    j4 j4Var = this.f5043a;
                    Executor executor2 = executor;
                    i0.c1 c1Var2 = c1Var;
                    synchronized (j4Var.f6253d) {
                        try {
                            if (!j4Var.f6251b) {
                                executor2.execute(new RunnableC0012k(3, j4Var, c1Var2));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }, AbstractC3504d.m8060e());
        }
    }

    @Override // i0.d1
    /* renamed from: b */
    public int mo1872b() {
        int width;
        synchronized (this.f6253d) {
            width = ((ImageReader) this.f6252c).getWidth();
        }
        return width;
    }

    /* renamed from: c */
    public boolean m3392c(long j6) {
        Object obj;
        List list = (List) ((C0927v) this.f6253d).f5668b;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (AbstractC5818p.m11400d(((C5821s) obj).f28494a, j6)) {
                break;
            }
            i10++;
        }
        C5821s c5821s = (C5821s) obj;
        if (c5821s != null) {
            return c5821s.f28501h;
        }
        return false;
    }

    @Override // i0.d1
    public void close() {
        synchronized (this.f6253d) {
            ((ImageReader) this.f6252c).close();
        }
    }

    /* renamed from: d */
    public C0118y m3393d() {
        return new C0118y(AbstractC6663m.c0((ArrayList) this.f6252c), this.f6251b);
    }

    /* renamed from: g */
    public void m3394g() {
        ((C7806h) this.f6252c).m14782o(new CancellationException("onBack cancelled"), true);
        ((tx.s1) this.f6253d).mo13510j(null);
    }

    @Override // i0.d1
    public int getHeight() {
        int height;
        synchronized (this.f6253d) {
            height = ((ImageReader) this.f6252c).getHeight();
        }
        return height;
    }

    @Override // i0.d1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f6253d) {
            surface = ((ImageReader) this.f6252c).getSurface();
        }
        return surface;
    }

    @Override // i0.d1
    /* renamed from: h */
    public c0.b1 mo1878h() {
        Image imageAcquireLatestImage;
        synchronized (this.f6253d) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.f6252c).acquireLatestImage();
            } catch (RuntimeException e2) {
                if (!"ImageReaderContext is not initialized".equals(e2.getMessage())) {
                    throw e2;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new C0808a(imageAcquireLatestImage);
        }
    }

    @Override // i0.d1
    /* renamed from: j */
    public int mo1880j() {
        int imageFormat;
        synchronized (this.f6253d) {
            imageFormat = ((ImageReader) this.f6252c).getImageFormat();
        }
        return imageFormat;
    }

    @Override // i0.d1
    /* renamed from: k */
    public void mo1881k() {
        synchronized (this.f6253d) {
            this.f6251b = true;
            ((ImageReader) this.f6252c).setOnImageAvailableListener(null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mk.InterfaceC4777p m3395m(com.google.gson.reflect.TypeToken r9, boolean r10) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.j4.m3395m(com.google.gson.reflect.TypeToken, boolean):mk.p");
    }

    /* renamed from: n */
    public EnumC0555m m3396n() {
        C0558p c0558p = (C0558p) this.f6253d;
        int i10 = c0558p.f3795b;
        int i11 = c0558p.f3796c;
        return i10 < i11 ? EnumC0555m.NOT_CROSSED : i10 > i11 ? EnumC0555m.CROSSED : EnumC0555m.COLLAPSED;
    }

    /* renamed from: o */
    public void m3397o(InterfaceC2139c interfaceC2139c, String str) {
        ArrayList arrayList = (ArrayList) this.f6252c;
        arrayList.clear();
        if (AbstractC4154l.m8918a(str, "")) {
            this.f6251b = false;
            return;
        }
        if (AbstractC4154l.m8918a(str, "/")) {
            this.f6251b = true;
            return;
        }
        String strM10107R = AbstractC5178p.m10107R(str, "/");
        boolean zM10093D = AbstractC5178p.m10093D(strM10107R, '/');
        this.f6251b = zM10093D;
        if (zM10093D) {
            strM10107R = AbstractC5178p.m10108S(strM10107R, "/");
        }
        Iterator it = AbstractC5178p.m10111V(strM10107R, new char[]{'/'}, 0, 6).iterator();
        while (it.hasNext()) {
            arrayList.add(interfaceC2139c.invoke(it.next()));
        }
    }

    /* renamed from: p */
    public void m3398p(String encoded) {
        AbstractC4154l.m8923f(encoded, "encoded");
        m3397o(new C0088a(1, C6813g.f32359i, InterfaceC6811e.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 10), encoded);
    }

    /* renamed from: s */
    public void m3399s(InterfaceC8655l interfaceC8655l) {
        synchronized (this.f6252c) {
            try {
                if (((ArrayDeque) this.f6253d) == null) {
                    this.f6253d = new ArrayDeque();
                }
                ((ArrayDeque) this.f6253d).add(interfaceC8655l);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r6 = true;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m3400t(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f6252c
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            if (r0 == 0) goto L7a
            boolean r2 = com.google.android.gms.internal.measurement.d4.f6111b
            r3 = 1
            if (r2 == 0) goto Ld
            goto L52
        Ld:
            java.lang.Class<com.google.android.gms.internal.measurement.d4> r2 = com.google.android.gms.internal.measurement.d4.class
            monitor-enter(r2)
            boolean r4 = com.google.android.gms.internal.measurement.d4.f6111b     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L18
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            goto L52
        L16:
            r9 = move-exception
            goto L78
        L18:
            r4 = r3
        L19:
            r5 = 2
            r6 = 0
            if (r4 > r5) goto L48
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.d4.f6110a     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L2b
            java.lang.Class<android.os.UserManager> r5 = android.os.UserManager.class
            java.lang.Object r5 = r0.getSystemService(r5)     // Catch: java.lang.Throwable -> L16
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.measurement.d4.f6110a = r5     // Catch: java.lang.Throwable -> L16
        L2b:
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.d4.f6110a     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L31
            r6 = r3
            goto L4c
        L31:
            boolean r7 = r5.isUserUnlocked()     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L43
            if (r7 != 0) goto L41
            android.os.UserHandle r7 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L43
            boolean r0 = r5.isUserRunning(r7)     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L43
            if (r0 != 0) goto L48
        L41:
            r6 = r3
            goto L48
        L43:
            com.google.android.gms.internal.measurement.d4.f6110a = r1     // Catch: java.lang.Throwable -> L16
            int r4 = r4 + 1
            goto L19
        L48:
            if (r6 == 0) goto L4c
            com.google.android.gms.internal.measurement.d4.f6110a = r1     // Catch: java.lang.Throwable -> L16
        L4c:
            if (r6 == 0) goto L50
            com.google.android.gms.internal.measurement.d4.f6111b = r3     // Catch: java.lang.Throwable -> L16
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            r3 = r6
        L52:
            if (r3 != 0) goto L55
            goto L7a
        L55:
            com.google.android.gms.internal.measurement.t r0 = new com.google.android.gms.internal.measurement.t     // Catch: java.lang.Throwable -> L72
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = r0.m3664a()     // Catch: java.lang.SecurityException -> L5f java.lang.Throwable -> L72 java.lang.Throwable -> L72
            goto L6a
        L5f:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L72 java.lang.Throwable -> L72
            java.lang.Object r0 = r0.m3664a()     // Catch: java.lang.Throwable -> L6d
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L72 java.lang.Throwable -> L72
        L6a:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L72 java.lang.Throwable -> L72
            return r0
        L6d:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L72 java.lang.Throwable -> L72
            throw r0     // Catch: java.lang.Throwable -> L72 java.lang.Throwable -> L72 java.lang.Throwable -> L72
        L72:
            java.lang.String r0 = "Unable to read GServices for: "
            r0.concat(r9)
            return r1
        L78:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r9
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.j4.m3400t(java.lang.String):java.lang.String");
    }

    public String toString() {
        switch (this.f6250a) {
            case 2:
                return "SingleSelectionLayout(isStartHandle=" + this.f6251b + ", crossed=" + m3396n() + ", info=\n\t" + ((C0558p) this.f6253d) + ')';
            case 5:
                return ((Map) this.f6252c).toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m3401u(C8656m c8656m) {
        InterfaceC8655l interfaceC8655l;
        synchronized (this.f6252c) {
            if (((ArrayDeque) this.f6253d) != null && !this.f6251b) {
                this.f6251b = true;
                while (true) {
                    synchronized (this.f6252c) {
                        try {
                            interfaceC8655l = (InterfaceC8655l) ((ArrayDeque) this.f6253d).poll();
                            if (interfaceC8655l == null) {
                                this.f6251b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    interfaceC8655l.mo15973a(c8656m);
                }
            }
        }
    }

    @Override // i0.d1
    /* renamed from: z */
    public int mo1884z() {
        int maxImages;
        synchronized (this.f6253d) {
            maxImages = ((ImageReader) this.f6252c).getMaxImages();
        }
        return maxImages;
    }

    public j4(Context context) {
        this.f6250a = 0;
        this.f6251b = false;
        this.f6252c = context;
        this.f6253d = new i4(null);
    }

    public j4(C1915q c1915q, C0927v c0927v) {
        this.f6250a = 6;
        this.f6252c = c1915q;
        this.f6253d = c0927v;
    }

    public j4(ImageReader imageReader) {
        this.f6250a = 3;
        this.f6253d = new Object();
        this.f6251b = true;
        this.f6252c = imageReader;
    }

    public j4(Map map, boolean z6, List list) {
        this.f6250a = 5;
        this.f6252c = map;
        this.f6251b = z6;
        this.f6253d = list;
    }

    public j4(C7843i c7843i) {
        this.f6250a = 7;
        this.f6252c = c7843i;
        this.f6253d = C8233c.m15408d(c7843i);
        int[] iArr = (int[]) c7843i.m14823a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z6 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (iArr[i10] == 18) {
                    z6 = true;
                    break;
                }
                i10++;
            }
        }
        this.f6251b = z6;
    }

    public j4(int i10) {
        this.f6250a = 1;
        ArrayList arrayList = new ArrayList();
        this.f6252c = arrayList;
        C0115v c0115v = C0115v.f389a;
        C6813g c6813g = C6813g.f32359i;
        df.m10612b(arrayList, c0115v, new C0088a(1, c6813g, InterfaceC6811e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 7));
        this.f6253d = df.m10612b(arrayList, C0116w.f390a, new C0088a(1, c6813g, InterfaceC6811e.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 8));
        this.f6251b = false;
    }

    public j4(InterfaceC7266z interfaceC7266z, boolean z6, InterfaceC2141e interfaceC2141e, C2164m c2164m) {
        this.f6250a = 4;
        this.f6251b = z6;
        this.f6252c = pg.o6.m11805a(-2, EnumC7799a.SUSPEND, null, 4);
        this.f6253d = tx.c0.m13502y(interfaceC7266z, null, null, new C0381t(c2164m, interfaceC2141e, this, (InterfaceC7559c) null, 8), 3);
    }

    public j4(boolean z6, C0560r c0560r, C0558p c0558p) {
        this.f6250a = 2;
        this.f6251b = z6;
        this.f6252c = c0560r;
        this.f6253d = c0558p;
    }
}
