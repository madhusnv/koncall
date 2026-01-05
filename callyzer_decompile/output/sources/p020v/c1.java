package p020v;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.core.CameraUnavailableException;
import be.C0655j;
import com.google.android.gms.internal.measurement.j4;
import e0.C1892a;
import e0.C1896e;
import e0.EnumC1898g;
import e0.InterfaceC1893b;
import f0.C2168c;
import i0.C3074e;
import i0.C3076g;
import i0.C3082m;
import i0.C3083n;
import i0.b2;
import i0.f2;
import i0.g2;
import i0.j1;
import i0.j2;
import i0.k2;
import i0.l2;
import i0.m2;
import i0.n2;
import i0.o2;
import i0.p2;
import i0.q0;
import i0.v0;
import i0.w2;
import i0.y2;
import j0.AbstractC3502b;
import j0.C3503c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import og.u1;
import og.y0;
import p0.AbstractC5787a;
import p021w.C7843i;
import p021w.C7851q;
import pg.a0;
import pg.e6;
import rw.C6668r;
import u0.C7295e;
import ug.C7439j;
import ug.C7451v;
import ug.g1;
import v0.C7622f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: B */
    public final j4 f36491B;

    /* renamed from: C */
    public final t0 f36492C;

    /* renamed from: D */
    public final InterfaceC1893b f36493D;

    /* renamed from: k */
    public final String f36504k;

    /* renamed from: l */
    public final InterfaceC7595e f36505l;

    /* renamed from: m */
    public final C7843i f36506m;

    /* renamed from: n */
    public final g1 f36507n;

    /* renamed from: o */
    public final int f36508o;

    /* renamed from: p */
    public final boolean f36509p;

    /* renamed from: q */
    public final boolean f36510q;

    /* renamed from: r */
    public final boolean f36511r;

    /* renamed from: s */
    public final boolean f36512s;

    /* renamed from: t */
    public final boolean f36513t;

    /* renamed from: u */
    public final boolean f36514u;

    /* renamed from: v */
    public final boolean f36515v;

    /* renamed from: w */
    public C3083n f36516w;

    /* renamed from: y */
    public final q0 f36518y;

    /* renamed from: a */
    public final ArrayList f36494a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f36495b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f36496c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f36497d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f36498e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f36499f = new ArrayList();

    /* renamed from: g */
    public final HashMap f36500g = new HashMap();

    /* renamed from: h */
    public final ArrayList f36501h = new ArrayList();

    /* renamed from: i */
    public final ArrayList f36502i = new ArrayList();

    /* renamed from: j */
    public final ArrayList f36503j = new ArrayList();

    /* renamed from: x */
    public final ArrayList f36517x = new ArrayList();

    /* renamed from: z */
    public final C7451v f36519z = new C7451v(25);

    /* renamed from: A */
    public final g1 f36490A = new g1(21);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.List] */
    public c1(Context context, String str, C7851q c7851q, InterfaceC7595e interfaceC7595e, InterfaceC1893b interfaceC1893b) throws CameraUnavailableException, NumberFormatException {
        ArrayList arrayListSingletonList;
        int[] iArr;
        boolean z6;
        this.f36509p = false;
        this.f36510q = false;
        this.f36513t = false;
        this.f36514u = false;
        str.getClass();
        this.f36504k = str;
        interfaceC7595e.getClass();
        this.f36505l = interfaceC7595e;
        this.f36507n = new g1(20);
        this.f36518y = q0.m14422b(context);
        try {
            C7843i c7843iM14835b = c7851q.m14835b(str);
            this.f36506m = c7843iM14835b;
            Integer num = (Integer) c7843iM14835b.m14823a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f36508o = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) c7843iM14835b.m14823a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i10 : iArr2) {
                    if (i10 == 3) {
                        this.f36509p = true;
                    } else if (i10 == 6) {
                        this.f36510q = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i10 == 16) {
                        this.f36513t = true;
                    } else if (i10 == 1) {
                        this.f36514u = true;
                    }
                }
            }
            j4 j4Var = new j4(this.f36506m);
            this.f36491B = j4Var;
            this.f36492C = new t0(this.f36506m);
            ArrayList arrayList = this.f36494a;
            int i11 = this.f36508o;
            boolean z10 = this.f36509p;
            boolean z11 = this.f36510q;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            k2 k2Var = new k2();
            n2 n2Var = n2.PRIV;
            l2 l2Var = l2.MAXIMUM;
            k2 k2VarM14326f = a1.m14326f(n2Var, l2Var, k2Var, arrayList3, k2Var);
            n2 n2Var2 = n2.JPEG;
            k2 k2VarM14326f2 = a1.m14326f(n2Var2, l2Var, k2VarM14326f, arrayList3, k2VarM14326f);
            n2 n2Var3 = n2.YUV;
            k2 k2VarM14326f3 = a1.m14326f(n2Var3, l2Var, k2VarM14326f2, arrayList3, k2VarM14326f2);
            l2 l2Var2 = l2.PREVIEW;
            a1.m14344x(n2Var, l2Var2, k2VarM14326f3, n2Var2, l2Var);
            k2 k2VarM14327g = a1.m14327g(arrayList3, k2VarM14326f3);
            a1.m14344x(n2Var3, l2Var2, k2VarM14327g, n2Var2, l2Var);
            k2 k2VarM14327g2 = a1.m14327g(arrayList3, k2VarM14327g);
            a1.m14344x(n2Var, l2Var2, k2VarM14327g2, n2Var, l2Var2);
            k2 k2VarM14327g3 = a1.m14327g(arrayList3, k2VarM14327g2);
            a1.m14344x(n2Var, l2Var2, k2VarM14327g3, n2Var3, l2Var2);
            k2 k2VarM14327g4 = a1.m14327g(arrayList3, k2VarM14327g3);
            a1.m14344x(n2Var, l2Var2, k2VarM14327g4, n2Var3, l2Var2);
            k2VarM14327g4.m7356a(p2.m7409a(n2Var2, l2Var));
            arrayList3.add(k2VarM14327g4);
            arrayList2.addAll(arrayList3);
            if (i11 == 0 || i11 == 4 || i11 == 1 || i11 == 3) {
                ArrayList arrayList4 = new ArrayList();
                k2 k2Var2 = new k2();
                k2Var2.m7356a(p2.m7409a(n2Var, l2Var2));
                l2 l2Var3 = l2.RECORD;
                k2 k2VarM14326f4 = a1.m14326f(n2Var, l2Var3, k2Var2, arrayList4, k2Var2);
                a1.m14344x(n2Var, l2Var2, k2VarM14326f4, n2Var3, l2Var3);
                k2 k2VarM14327g5 = a1.m14327g(arrayList4, k2VarM14326f4);
                a1.m14344x(n2Var3, l2Var2, k2VarM14327g5, n2Var3, l2Var3);
                k2 k2VarM14327g6 = a1.m14327g(arrayList4, k2VarM14327g5);
                a1.m14344x(n2Var, l2Var2, k2VarM14327g6, n2Var, l2Var3);
                k2 k2VarM14326f5 = a1.m14326f(n2Var2, l2Var3, k2VarM14327g6, arrayList4, k2VarM14327g6);
                a1.m14344x(n2Var, l2Var2, k2VarM14326f5, n2Var3, l2Var3);
                k2 k2VarM14326f6 = a1.m14326f(n2Var2, l2Var3, k2VarM14326f5, arrayList4, k2VarM14326f5);
                a1.m14344x(n2Var3, l2Var2, k2VarM14326f6, n2Var3, l2Var2);
                k2VarM14326f6.m7356a(p2.m7409a(n2Var2, l2Var));
                arrayList4.add(k2VarM14326f6);
                arrayList2.addAll(arrayList4);
            }
            if (i11 == 1 || i11 == 3) {
                ArrayList arrayList5 = new ArrayList();
                k2 k2Var3 = new k2();
                a1.m14344x(n2Var, l2Var2, k2Var3, n2Var, l2Var);
                k2 k2VarM14327g7 = a1.m14327g(arrayList5, k2Var3);
                a1.m14344x(n2Var, l2Var2, k2VarM14327g7, n2Var3, l2Var);
                k2 k2VarM14327g8 = a1.m14327g(arrayList5, k2VarM14327g7);
                a1.m14344x(n2Var3, l2Var2, k2VarM14327g8, n2Var3, l2Var);
                k2 k2VarM14327g9 = a1.m14327g(arrayList5, k2VarM14327g8);
                a1.m14344x(n2Var, l2Var2, k2VarM14327g9, n2Var, l2Var2);
                k2 k2VarM14326f7 = a1.m14326f(n2Var2, l2Var, k2VarM14327g9, arrayList5, k2VarM14327g9);
                l2 l2Var4 = l2.VGA;
                a1.m14344x(n2Var3, l2Var4, k2VarM14326f7, n2Var, l2Var2);
                k2 k2VarM14326f8 = a1.m14326f(n2Var3, l2Var, k2VarM14326f7, arrayList5, k2VarM14326f7);
                a1.m14344x(n2Var3, l2Var4, k2VarM14326f8, n2Var3, l2Var2);
                k2VarM14326f8.m7356a(p2.m7409a(n2Var3, l2Var));
                arrayList5.add(k2VarM14326f8);
                arrayList2.addAll(arrayList5);
            }
            if (z10) {
                ArrayList arrayList6 = new ArrayList();
                k2 k2Var4 = new k2();
                n2 n2Var4 = n2.RAW;
                k2 k2VarM14326f9 = a1.m14326f(n2Var4, l2Var, k2Var4, arrayList6, k2Var4);
                a1.m14344x(n2Var, l2Var2, k2VarM14326f9, n2Var4, l2Var);
                k2 k2VarM14327g10 = a1.m14327g(arrayList6, k2VarM14326f9);
                a1.m14344x(n2Var3, l2Var2, k2VarM14327g10, n2Var4, l2Var);
                k2 k2VarM14327g11 = a1.m14327g(arrayList6, k2VarM14327g10);
                a1.m14344x(n2Var, l2Var2, k2VarM14327g11, n2Var, l2Var2);
                k2 k2VarM14326f10 = a1.m14326f(n2Var4, l2Var, k2VarM14327g11, arrayList6, k2VarM14327g11);
                a1.m14344x(n2Var, l2Var2, k2VarM14326f10, n2Var3, l2Var2);
                k2 k2VarM14326f11 = a1.m14326f(n2Var4, l2Var, k2VarM14326f10, arrayList6, k2VarM14326f10);
                a1.m14344x(n2Var3, l2Var2, k2VarM14326f11, n2Var3, l2Var2);
                k2 k2VarM14326f12 = a1.m14326f(n2Var4, l2Var, k2VarM14326f11, arrayList6, k2VarM14326f11);
                a1.m14344x(n2Var, l2Var2, k2VarM14326f12, n2Var2, l2Var);
                k2 k2VarM14326f13 = a1.m14326f(n2Var4, l2Var, k2VarM14326f12, arrayList6, k2VarM14326f12);
                a1.m14344x(n2Var3, l2Var2, k2VarM14326f13, n2Var2, l2Var);
                k2VarM14326f13.m7356a(p2.m7409a(n2Var4, l2Var));
                arrayList6.add(k2VarM14326f13);
                arrayList2.addAll(arrayList6);
            }
            if (z11 && i11 == 0) {
                ArrayList arrayList7 = new ArrayList();
                k2 k2Var5 = new k2();
                a1.m14344x(n2Var, l2Var2, k2Var5, n2Var, l2Var);
                k2 k2VarM14327g12 = a1.m14327g(arrayList7, k2Var5);
                a1.m14344x(n2Var, l2Var2, k2VarM14327g12, n2Var3, l2Var);
                k2 k2VarM14327g13 = a1.m14327g(arrayList7, k2VarM14327g12);
                a1.m14344x(n2Var3, l2Var2, k2VarM14327g13, n2Var3, l2Var);
                arrayList7.add(k2VarM14327g13);
                arrayList2.addAll(arrayList7);
            }
            if (i11 == 3) {
                ArrayList arrayList8 = new ArrayList();
                k2 k2Var6 = new k2();
                k2Var6.m7356a(p2.m7409a(n2Var, l2Var2));
                l2 l2Var5 = l2.VGA;
                a1.m14344x(n2Var, l2Var5, k2Var6, n2Var3, l2Var);
                n2 n2Var5 = n2.RAW;
                k2 k2VarM14326f14 = a1.m14326f(n2Var5, l2Var, k2Var6, arrayList8, k2Var6);
                a1.m14344x(n2Var, l2Var2, k2VarM14326f14, n2Var, l2Var5);
                a1.m14344x(n2Var2, l2Var, k2VarM14326f14, n2Var5, l2Var);
                arrayList8.add(k2VarM14326f14);
                arrayList2.addAll(arrayList8);
            }
            arrayList.addAll(arrayList2);
            g1 g1Var = this.f36507n;
            String str2 = this.f36504k;
            if (((ExtraSupportedSurfaceCombinationsQuirk) g1Var.f35448a) == null) {
                arrayListSingletonList = new ArrayList();
            } else {
                k2 k2Var7 = ExtraSupportedSurfaceCombinationsQuirk.f1824a;
                String str3 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str3) || "heroqltetmo".equalsIgnoreCase(str3)) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayListSingletonList = arrayList9;
                    if (str2.equals("1")) {
                        arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.f1824a);
                        arrayListSingletonList = arrayList9;
                    }
                } else {
                    arrayListSingletonList = ((!"google".equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.f1826c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.m601b()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.f1825b) : Collections.EMPTY_LIST;
                }
            }
            arrayList.addAll(arrayListSingletonList);
            if (this.f36513t) {
                ArrayList arrayList10 = this.f36495b;
                ArrayList arrayList11 = new ArrayList();
                k2 k2Var8 = new k2();
                l2 l2Var6 = l2.ULTRA_MAXIMUM;
                a1.m14344x(n2Var3, l2Var6, k2Var8, n2Var, l2Var2);
                l2 l2Var7 = l2.RECORD;
                k2 k2VarM14326f15 = a1.m14326f(n2Var, l2Var7, k2Var8, arrayList11, k2Var8);
                a1.m14344x(n2Var2, l2Var6, k2VarM14326f15, n2Var, l2Var2);
                k2 k2VarM14326f16 = a1.m14326f(n2Var, l2Var7, k2VarM14326f15, arrayList11, k2VarM14326f15);
                n2 n2Var6 = n2.RAW;
                a1.m14344x(n2Var6, l2Var6, k2VarM14326f16, n2Var, l2Var2);
                k2 k2VarM14326f17 = a1.m14326f(n2Var, l2Var7, k2VarM14326f16, arrayList11, k2VarM14326f16);
                a1.m14344x(n2Var3, l2Var6, k2VarM14326f17, n2Var, l2Var2);
                k2 k2VarM14326f18 = a1.m14326f(n2Var2, l2Var, k2VarM14326f17, arrayList11, k2VarM14326f17);
                a1.m14344x(n2Var2, l2Var6, k2VarM14326f18, n2Var, l2Var2);
                k2 k2VarM14326f19 = a1.m14326f(n2Var2, l2Var, k2VarM14326f18, arrayList11, k2VarM14326f18);
                a1.m14344x(n2Var6, l2Var6, k2VarM14326f19, n2Var, l2Var2);
                k2 k2VarM14326f20 = a1.m14326f(n2Var2, l2Var, k2VarM14326f19, arrayList11, k2VarM14326f19);
                a1.m14344x(n2Var3, l2Var6, k2VarM14326f20, n2Var, l2Var2);
                k2 k2VarM14326f21 = a1.m14326f(n2Var3, l2Var, k2VarM14326f20, arrayList11, k2VarM14326f20);
                a1.m14344x(n2Var2, l2Var6, k2VarM14326f21, n2Var, l2Var2);
                k2 k2VarM14326f22 = a1.m14326f(n2Var3, l2Var, k2VarM14326f21, arrayList11, k2VarM14326f21);
                a1.m14344x(n2Var6, l2Var6, k2VarM14326f22, n2Var, l2Var2);
                k2 k2VarM14326f23 = a1.m14326f(n2Var3, l2Var, k2VarM14326f22, arrayList11, k2VarM14326f22);
                a1.m14344x(n2Var3, l2Var6, k2VarM14326f23, n2Var, l2Var2);
                k2 k2VarM14326f24 = a1.m14326f(n2Var6, l2Var, k2VarM14326f23, arrayList11, k2VarM14326f23);
                a1.m14344x(n2Var2, l2Var6, k2VarM14326f24, n2Var, l2Var2);
                k2 k2VarM14326f25 = a1.m14326f(n2Var6, l2Var, k2VarM14326f24, arrayList11, k2VarM14326f24);
                a1.m14344x(n2Var6, l2Var6, k2VarM14326f25, n2Var, l2Var2);
                k2VarM14326f25.m7356a(p2.m7409a(n2Var6, l2Var));
                arrayList11.add(k2VarM14326f25);
                arrayList10.addAll(arrayList11);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f36511r = zHasSystemFeature;
            if (zHasSystemFeature) {
                ArrayList arrayList12 = this.f36496c;
                ArrayList arrayList13 = new ArrayList();
                k2 k2Var9 = new k2();
                l2 l2Var8 = l2.S1440P_4_3;
                k2 k2VarM14326f26 = a1.m14326f(n2Var3, l2Var8, k2Var9, arrayList13, k2Var9);
                k2 k2VarM14326f27 = a1.m14326f(n2Var, l2Var8, k2VarM14326f26, arrayList13, k2VarM14326f26);
                k2 k2VarM14326f28 = a1.m14326f(n2Var2, l2Var8, k2VarM14326f27, arrayList13, k2VarM14326f27);
                l2 l2Var9 = l2.S720P_16_9;
                a1.m14344x(n2Var3, l2Var9, k2VarM14326f28, n2Var2, l2Var8);
                k2 k2VarM14327g14 = a1.m14327g(arrayList13, k2VarM14326f28);
                a1.m14344x(n2Var, l2Var9, k2VarM14327g14, n2Var2, l2Var8);
                k2 k2VarM14327g15 = a1.m14327g(arrayList13, k2VarM14327g14);
                a1.m14344x(n2Var3, l2Var9, k2VarM14327g15, n2Var3, l2Var8);
                k2 k2VarM14327g16 = a1.m14327g(arrayList13, k2VarM14327g15);
                a1.m14344x(n2Var3, l2Var9, k2VarM14327g16, n2Var, l2Var8);
                k2 k2VarM14327g17 = a1.m14327g(arrayList13, k2VarM14327g16);
                a1.m14344x(n2Var, l2Var9, k2VarM14327g17, n2Var3, l2Var8);
                k2 k2VarM14327g18 = a1.m14327g(arrayList13, k2VarM14327g17);
                a1.m14344x(n2Var, l2Var9, k2VarM14327g18, n2Var, l2Var8);
                arrayList13.add(k2VarM14327g18);
                arrayList12.addAll(arrayList13);
            }
            if (j4Var.f6251b) {
                ArrayList arrayList14 = this.f36501h;
                ArrayList arrayList15 = new ArrayList();
                k2 k2Var10 = new k2();
                k2 k2VarM14326f29 = a1.m14326f(n2Var, l2Var, k2Var10, arrayList15, k2Var10);
                k2 k2VarM14326f30 = a1.m14326f(n2Var3, l2Var, k2VarM14326f29, arrayList15, k2VarM14326f29);
                a1.m14344x(n2Var, l2Var2, k2VarM14326f30, n2Var2, l2Var);
                k2 k2VarM14327g19 = a1.m14327g(arrayList15, k2VarM14326f30);
                a1.m14344x(n2Var, l2Var2, k2VarM14327g19, n2Var3, l2Var);
                k2 k2VarM14327g20 = a1.m14327g(arrayList15, k2VarM14327g19);
                a1.m14344x(n2Var3, l2Var2, k2VarM14327g20, n2Var3, l2Var);
                k2 k2VarM14327g21 = a1.m14327g(arrayList15, k2VarM14327g20);
                k2VarM14327g21.m7356a(p2.m7409a(n2Var, l2Var2));
                l2 l2Var10 = l2.RECORD;
                k2 k2VarM14326f31 = a1.m14326f(n2Var, l2Var10, k2VarM14327g21, arrayList15, k2VarM14327g21);
                a1.m14344x(n2Var, l2Var2, k2VarM14326f31, n2Var, l2Var10);
                k2 k2VarM14326f32 = a1.m14326f(n2Var3, l2Var10, k2VarM14326f31, arrayList15, k2VarM14326f31);
                a1.m14344x(n2Var, l2Var2, k2VarM14326f32, n2Var, l2Var10);
                k2VarM14326f32.m7356a(p2.m7409a(n2Var2, l2Var10));
                arrayList15.add(k2VarM14326f32);
                arrayList14.addAll(arrayList15);
            }
            boolean zM14499d = z0.m14499d(this.f36506m);
            this.f36512s = zM14499d;
            if (zM14499d && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList16 = this.f36503j;
                ArrayList arrayList17 = new ArrayList();
                k2 k2Var11 = new k2();
                l2 l2Var11 = l2.S1440P_4_3;
                j2 j2Var = j2.PREVIEW_VIDEO_STILL;
                k2Var11.m7356a(a0.m11530a(n2Var, l2Var11, j2Var));
                arrayList17.add(k2Var11);
                k2 k2Var12 = new k2();
                k2Var12.m7356a(a0.m11530a(n2Var3, l2Var11, j2Var));
                arrayList17.add(k2Var12);
                k2 k2Var13 = new k2();
                l2 l2Var12 = l2.RECORD;
                j2 j2Var2 = j2.VIDEO_RECORD;
                k2Var13.m7356a(a0.m11530a(n2Var, l2Var12, j2Var2));
                arrayList17.add(k2Var13);
                k2 k2Var14 = new k2();
                k2Var14.m7356a(a0.m11530a(n2Var3, l2Var12, j2Var2));
                arrayList17.add(k2Var14);
                k2 k2Var15 = new k2();
                j2 j2Var3 = j2.STILL_CAPTURE;
                k2Var15.m7356a(a0.m11530a(n2Var2, l2Var, j2Var3));
                arrayList17.add(k2Var15);
                k2 k2Var16 = new k2();
                k2Var16.m7356a(a0.m11530a(n2Var3, l2Var, j2Var3));
                arrayList17.add(k2Var16);
                k2 k2Var17 = new k2();
                j2 j2Var4 = j2.PREVIEW;
                k2Var17.m7356a(a0.m11530a(n2Var, l2Var2, j2Var4));
                k2Var17.m7356a(a0.m11530a(n2Var2, l2Var, j2Var3));
                k2 k2VarM14327g22 = a1.m14327g(arrayList17, k2Var17);
                k2VarM14327g22.m7356a(a0.m11530a(n2Var, l2Var2, j2Var4));
                k2VarM14327g22.m7356a(a0.m11530a(n2Var3, l2Var, j2Var3));
                k2 k2VarM14327g23 = a1.m14327g(arrayList17, k2VarM14327g22);
                k2VarM14327g23.m7356a(a0.m11530a(n2Var, l2Var2, j2Var4));
                k2VarM14327g23.m7356a(a0.m11530a(n2Var, l2Var12, j2Var2));
                k2 k2VarM14327g24 = a1.m14327g(arrayList17, k2VarM14327g23);
                k2VarM14327g24.m7356a(a0.m11530a(n2Var, l2Var2, j2Var4));
                k2VarM14327g24.m7356a(a0.m11530a(n2Var3, l2Var12, j2Var2));
                k2 k2VarM14327g25 = a1.m14327g(arrayList17, k2VarM14327g24);
                k2VarM14327g25.m7356a(a0.m11530a(n2Var, l2Var2, j2Var4));
                k2VarM14327g25.m7356a(a0.m11530a(n2Var3, l2Var2, j2Var4));
                k2 k2VarM14327g26 = a1.m14327g(arrayList17, k2VarM14327g25);
                k2VarM14327g26.m7356a(a0.m11530a(n2Var, l2Var2, j2Var4));
                k2VarM14327g26.m7356a(a0.m11530a(n2Var, l2Var12, j2Var2));
                k2VarM14327g26.m7356a(a0.m11530a(n2Var2, l2Var12, j2Var3));
                arrayList17.add(k2VarM14327g26);
                k2 k2Var18 = new k2();
                k2Var18.m7356a(a0.m11530a(n2Var, l2Var2, j2Var4));
                k2Var18.m7356a(a0.m11530a(n2Var3, l2Var12, j2Var2));
                k2Var18.m7356a(a0.m11530a(n2Var2, l2Var12, j2Var3));
                arrayList17.add(k2Var18);
                k2 k2Var19 = new k2();
                k2Var19.m7356a(a0.m11530a(n2Var, l2Var2, j2Var4));
                k2Var19.m7356a(a0.m11530a(n2Var3, l2Var2, j2Var4));
                k2Var19.m7356a(a0.m11530a(n2Var2, l2Var, j2Var3));
                arrayList17.add(k2Var19);
                arrayList16.addAll(arrayList17);
            }
            C7843i c7843i = this.f36506m;
            if (Build.VERSION.SDK_INT < 33 || (iArr = (int[]) c7843i.m14823a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length == 0) {
                z6 = false;
            } else {
                for (int i12 : iArr) {
                    if (i12 == 2) {
                        z6 = true;
                        break;
                    }
                }
                z6 = false;
            }
            this.f36515v = z6;
            if (z6 && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList18 = this.f36497d;
                ArrayList arrayList19 = new ArrayList();
                k2 k2Var20 = new k2();
                n2 n2Var7 = n2.PRIV;
                l2 l2Var13 = l2.S1440P_4_3;
                k2 k2VarM14326f33 = a1.m14326f(n2Var7, l2Var13, k2Var20, arrayList19, k2Var20);
                n2 n2Var8 = n2.YUV;
                k2 k2VarM14326f34 = a1.m14326f(n2Var8, l2Var13, k2VarM14326f33, arrayList19, k2VarM14326f33);
                k2VarM14326f34.m7356a(p2.m7409a(n2Var7, l2Var13));
                n2 n2Var9 = n2.JPEG;
                l2 l2Var14 = l2.MAXIMUM;
                k2 k2VarM14326f35 = a1.m14326f(n2Var9, l2Var14, k2VarM14326f34, arrayList19, k2VarM14326f34);
                a1.m14344x(n2Var8, l2Var13, k2VarM14326f35, n2Var9, l2Var14);
                k2 k2VarM14327g27 = a1.m14327g(arrayList19, k2VarM14326f35);
                a1.m14344x(n2Var7, l2Var13, k2VarM14327g27, n2Var8, l2Var14);
                k2 k2VarM14327g28 = a1.m14327g(arrayList19, k2VarM14327g27);
                a1.m14344x(n2Var8, l2Var13, k2VarM14327g28, n2Var8, l2Var14);
                k2 k2VarM14327g29 = a1.m14327g(arrayList19, k2VarM14327g28);
                l2 l2Var15 = l2.PREVIEW;
                a1.m14344x(n2Var7, l2Var15, k2VarM14327g29, n2Var7, l2Var13);
                k2 k2VarM14327g30 = a1.m14327g(arrayList19, k2VarM14327g29);
                a1.m14344x(n2Var8, l2Var15, k2VarM14327g30, n2Var7, l2Var13);
                k2 k2VarM14327g31 = a1.m14327g(arrayList19, k2VarM14327g30);
                a1.m14344x(n2Var7, l2Var15, k2VarM14327g31, n2Var8, l2Var13);
                k2 k2VarM14327g32 = a1.m14327g(arrayList19, k2VarM14327g31);
                a1.m14344x(n2Var8, l2Var15, k2VarM14327g32, n2Var8, l2Var13);
                arrayList19.add(k2VarM14327g32);
                arrayList18.addAll(arrayList19);
            }
            m14356c();
            this.f36493D = interfaceC1893b;
        } catch (CameraAccessExceptionCompat e2) {
            throw new CameraUnavailableException(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Range m14349d(android.util.Range r13, int r14, android.util.Range[] r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.c1.m14349d(android.util.Range, int, android.util.Range[]):android.util.Range");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Size m14350f(android.hardware.camera2.params.StreamConfigurationMap r8, int r9, boolean r10, android.util.Rational r11) {
        /*
            r0 = 34
            r1 = 0
            if (r9 != r0) goto Lc
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            android.util.Size[] r0 = r8.getOutputSizes(r0)     // Catch: java.lang.Throwable -> L11
            goto L12
        Lc:
            android.util.Size[] r0 = r8.getOutputSizes(r9)     // Catch: java.lang.Throwable -> L11
            goto L12
        L11:
            r0 = r1
        L12:
            r2 = 0
            if (r0 == 0) goto L38
            int r3 = r0.length
            if (r3 != 0) goto L19
            goto L38
        L19:
            if (r11 == 0) goto L43
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r0.length
            r5 = r2
        L22:
            if (r5 >= r4) goto L32
            r6 = r0[r5]
            boolean r7 = j0.AbstractC3502b.m8054a(r11, r6)
            if (r7 == 0) goto L2f
            r3.add(r6)
        L2f:
            int r5 = r5 + 1
            goto L22
        L32:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L3a
        L38:
            r0 = r1
            goto L43
        L3a:
            android.util.Size[] r11 = new android.util.Size[r2]
            java.lang.Object[] r11 = r3.toArray(r11)
            r0 = r11
            android.util.Size[] r0 = (android.util.Size[]) r0
        L43:
            if (r0 == 0) goto L7f
            int r11 = r0.length
            if (r11 != 0) goto L49
            goto L7f
        L49:
            j0.c r11 = new j0.c
            r11.<init>(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.Object r0 = java.util.Collections.max(r0, r11)
            android.util.Size r0 = (android.util.Size) r0
            android.util.Size r1 = p0.AbstractC5787a.f28368a
            if (r10 == 0) goto L70
            android.util.Size[] r8 = r8.getHighResolutionOutputSizes(r9)
            if (r8 == 0) goto L70
            int r9 = r8.length
            if (r9 <= 0) goto L70
            java.util.List r8 = java.util.Arrays.asList(r8)
            java.lang.Object r8 = java.util.Collections.max(r8, r11)
            r1 = r8
            android.util.Size r1 = (android.util.Size) r1
        L70:
            android.util.Size[] r8 = new android.util.Size[]{r0, r1}
            java.util.List r8 = java.util.Arrays.asList(r8)
            java.lang.Object r8 = java.util.Collections.max(r8, r11)
            android.util.Size r8 = (android.util.Size) r8
            return r8
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.c1.m14350f(android.hardware.camera2.params.StreamConfigurationMap, int, boolean, android.util.Rational):android.util.Size");
    }

    /* renamed from: h */
    public static int m14351h(Range range, Range range2) {
        y0.m11056f("Ranges must not intersect", (range.contains((Range) range2.getUpper()) || range.contains((Range) range2.getLower())) ? false : true);
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    /* renamed from: i */
    public static int m14352i(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    /* renamed from: m */
    public static Range m14353m(Range range, Range range2, boolean z6) {
        Range range3 = C3082m.f16521h;
        if (range3.equals(range2) && range3.equals(range)) {
            return range3;
        }
        if (range3.equals(range2)) {
            return range;
        }
        if (range3.equals(range)) {
            return range2;
        }
        if (z6) {
            y0.m11056f("All targetFrameRate should be the same if strict fps is required", range == range2);
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    /* renamed from: a */
    public final boolean m14354a(C7594d c7594d, List list, Map map, List list2, List list3) {
        boolean z6;
        List list4;
        Size relatedFixedSize;
        boolean z10 = c7594d.f36523d;
        boolean z11 = c7594d.f36527h;
        HashMap map2 = this.f36500g;
        if (map2.containsKey(c7594d)) {
            list4 = (List) map2.get(c7594d);
            z6 = true;
        } else {
            ArrayList arrayList = new ArrayList();
            int i10 = c7594d.f36520a;
            if (z11) {
                ArrayList arrayList2 = this.f36499f;
                if (arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    n2 n2Var = n2.PRIV;
                    l2 l2Var = l2.S1080P_16_9;
                    arrayList3.add(new k2(p2.m7409a(n2Var, l2Var)));
                    l2 l2Var2 = l2.S720P_16_9;
                    arrayList3.add(new k2(p2.m7409a(n2Var, l2Var2)));
                    l2 l2Var3 = l2.MAXIMUM_16_9;
                    arrayList3.addAll(e6.m11596b(l2Var, l2Var3));
                    l2 l2Var4 = l2.UHD;
                    arrayList3.addAll(e6.m11596b(l2Var, l2Var4));
                    arrayList3.addAll(e6.m11596b(l2Var, l2.S1440P_16_9));
                    arrayList3.addAll(e6.m11596b(l2Var, l2Var));
                    arrayList3.addAll(e6.m11596b(l2Var2, l2Var3));
                    arrayList3.addAll(e6.m11596b(l2Var2, l2Var4));
                    arrayList3.addAll(e6.m11596b(l2Var2, l2Var));
                    l2 l2Var5 = l2.X_VGA;
                    l2 l2Var6 = l2.MAXIMUM_4_3;
                    arrayList3.addAll(e6.m11596b(l2Var5, l2Var6));
                    arrayList3.addAll(e6.m11596b(l2.S1080P_4_3, l2Var6));
                    arrayList2.addAll(arrayList3);
                }
                arrayList.addAll(arrayList2);
            } else if (c7594d.f36524e) {
                ArrayList arrayList4 = this.f36502i;
                if (arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    k2 k2Var = new k2();
                    n2 n2Var2 = n2.JPEG_R;
                    l2 l2Var7 = l2.MAXIMUM;
                    k2 k2VarM14326f = a1.m14326f(n2Var2, l2Var7, k2Var, arrayList5, k2Var);
                    a1.m14344x(n2.PRIV, l2.PREVIEW, k2VarM14326f, n2Var2, l2Var7);
                    arrayList5.add(k2VarM14326f);
                    arrayList4.addAll(arrayList5);
                }
                if (i10 == 0) {
                    arrayList.addAll(arrayList4);
                }
            } else if (c7594d.f36525f) {
                ArrayList arrayList6 = this.f36498e;
                if (arrayList6.isEmpty()) {
                    t0 t0Var = this.f36492C;
                    if (((Boolean) t0Var.f36694b.getValue()).booleanValue()) {
                        arrayList6.clear();
                        Size size = (Size) t0Var.f36695c.getValue();
                        if (size != null) {
                            C3083n surfaceSizeDefinition = m14361l(34);
                            ArrayList arrayList7 = new ArrayList();
                            j2 j2Var = p2.f16554e;
                            AbstractC4154l.m8923f(surfaceSizeDefinition, "surfaceSizeDefinition");
                            p2 p2VarM11531b = a0.m11531b(34, size, surfaceSizeDefinition, 0, m2.CAPTURE_SESSION_TABLES, p2.f16554e);
                            k2 k2Var2 = new k2();
                            k2Var2.m7356a(p2VarM11531b);
                            arrayList7.add(k2Var2);
                            k2 k2Var3 = new k2();
                            k2Var3.m7356a(p2VarM11531b);
                            k2Var3.m7356a(p2VarM11531b);
                            arrayList7.add(k2Var3);
                            arrayList6.addAll(arrayList7);
                        }
                    }
                }
                arrayList.addAll(arrayList6);
            } else {
                int i11 = c7594d.f36522c;
                if (i11 == 8) {
                    z6 = true;
                    if (i10 != 1) {
                        ArrayList arrayList8 = this.f36494a;
                        if (i10 != 2) {
                            if (z10) {
                                arrayList8 = this.f36497d;
                            }
                            arrayList.addAll(arrayList8);
                        } else {
                            arrayList.addAll(this.f36495b);
                            arrayList.addAll(arrayList8);
                        }
                    } else {
                        arrayList = this.f36496c;
                    }
                } else {
                    z6 = true;
                    if (i11 == 10 && i10 == 0) {
                        arrayList.addAll(this.f36501h);
                    }
                }
                map2.put(c7594d, arrayList);
                list4 = arrayList;
            }
            z6 = true;
            map2.put(c7594d, arrayList);
            list4 = arrayList;
        }
        Iterator it = list4.iterator();
        int i12 = 0;
        boolean z12 = false;
        while (it.hasNext()) {
            z12 = ((k2) it.next()).m7357c(list) != null ? z6 : false;
            if (z12) {
                break;
            }
        }
        if (!z12 || !z11) {
            return z12;
        }
        Range range = c7594d.f36528i;
        f2 f2Var = new f2();
        while (i12 < list.size()) {
            p2 p2Var = (p2) list.get(i12);
            C3083n definition = m14361l(p2Var.f16561d);
            int i13 = p2Var.f16561d;
            AbstractC4154l.m8923f(definition, "definition");
            HashMap map3 = definition.f16534f;
            l2 l2Var8 = p2Var.f16559b;
            switch (o2.f16551a[l2Var8.ordinal()]) {
                case 1:
                    relatedFixedSize = definition.f16531c;
                    break;
                case 2:
                    relatedFixedSize = definition.f16533e;
                    break;
                case 3:
                    relatedFixedSize = (Size) map3.get(Integer.valueOf(i13));
                    break;
                case 4:
                    relatedFixedSize = (Size) map3.get(Integer.valueOf(i13));
                    break;
                case 5:
                    relatedFixedSize = (Size) map3.get(Integer.valueOf(i13));
                    break;
                case 6:
                    relatedFixedSize = (Size) definition.f16537i.get(Integer.valueOf(i13));
                    break;
                case 7:
                    throw new IllegalStateException("Not supported config size");
                default:
                    relatedFixedSize = l2Var8.getRelatedFixedSize();
                    break;
            }
            AbstractC4154l.m8920c(relatedFixedSize);
            w2 w2Var = (w2) list2.get(((Integer) list3.get(i12)).intValue());
            c0.a0 a0Var = (c0.a0) map.get(p2Var);
            Objects.requireNonNull(a0Var);
            AbstractC4154l.m8923f(w2Var, "<this>");
            C1892a c1892a = new C1892a(relatedFixedSize, w2Var.mo7291q());
            EnumC1898g.Companion.getClass();
            Class<?> surfaceClass = C1896e.m5516b(w2Var).getSurfaceClass();
            if (surfaceClass != null) {
                c1892a.f16609j = surfaceClass;
            }
            b2 b2VarM7301e = b2.m7301e(w2Var, relatedFixedSize);
            C0655j c0655j = b2VarM7301e.f16425b;
            boolean z13 = z10;
            b2VarM7301e.m7304c(c1892a, a0Var, -1);
            Range range2 = C3082m.f16521h.equals(range) ? C2168c.f10032d : range;
            c0655j.getClass();
            ((j1) c0655j.f4194d).m7352n(q0.f16564j, range2);
            if (z13) {
                c0655j.getClass();
                ((j1) c0655j.f4194d).m7352n(w2.D0, 2);
            }
            f2Var.m7336a(b2VarM7301e.m7305d());
            boolean zM7338c = f2Var.m7338c();
            StringBuilder sb2 = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb2.append(w2Var);
            sb2.append(" with ");
            sb2.append(p2Var);
            sb2.append(" due to [");
            sb2.append(!f2Var.f16458m ? "Template is not set" : f2Var.f16457l.toString());
            sb2.append("]; surfaceConfigList = ");
            sb2.append(list);
            sb2.append(", featureSettings = ");
            sb2.append(c7594d);
            sb2.append(", newUseCaseConfigs = ");
            sb2.append(list2);
            y0.m11056f(sb2.toString(), zM7338c);
            i12++;
            z10 = z13;
        }
        g2 g2VarM7337b = f2Var.m7337b();
        boolean zMo1989f = this.f36493D.mo1989f(g2VarM7337b);
        Iterator it2 = g2VarM7337b.m7341b().iterator();
        while (it2.hasNext()) {
            ((v0) it2.next()).mo7416a();
        }
        return zMo1989f;
    }

    /* renamed from: b */
    public final C7594d m14355b(int i10, boolean z6, HashMap map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Range range, boolean z15) {
        int i11;
        Range range2;
        Range range3;
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                i11 = 8;
                break;
            }
            if (((c0.a0) it.next()).f5042b == 10) {
                i11 = 10;
                break;
            }
        }
        String str = this.f36504k;
        if (i10 != 0 && z11) {
            throw new IllegalArgumentException(a1.m14333m("Camera device id is ", str, ". Ultra HDR is not currently supported in ", i10 != 1 ? i10 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
        }
        if (i10 != 0 && i11 == 10) {
            throw new IllegalArgumentException(a1.m14333m("Camera device id is ", str, ". 10 bit dynamic range is not currently supported in ", i10 != 1 ? i10 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
        }
        if (i10 != 0 && z13) {
            throw new IllegalArgumentException(a1.m14333m("Camera device id is ", str, ". Feature combination query is not currently supported in ", i10 != 1 ? i10 != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
        }
        if (z12 && z13) {
            throw new IllegalArgumentException("High-speed session is not supported with feature combination");
        }
        if (z12 && !((Boolean) this.f36492C.f36694b.getValue()).booleanValue()) {
            throw new IllegalArgumentException("High-speed session is not supported on this device.");
        }
        if (z13) {
            range2 = range;
            if (range2 == C3082m.f16521h && z14) {
                range3 = C2168c.f10032d;
            }
            return new C7594d(i10, z6, i11, z10, z11, z12, z13, z14, range3, z15);
        }
        range2 = range;
        range3 = range2;
        return new C7594d(i10, z6, i11, z10, z11, z12, z13, z14, range3, z15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r2 = new android.util.Size(r8.videoFrameWidth, r8.videoFrameHeight);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14356c() throws java.lang.NumberFormatException {
        /*
            r11 = this;
            v.q0 r0 = r11.f36518y
            android.util.Size r4 = r0.m14426e()
            r0 = 0
            r1 = 0
            java.lang.String r2 = r11.f36504k     // Catch: java.lang.NumberFormatException -> L3a
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L3a
            v.e r3 = r11.f36505l     // Catch: java.lang.NumberFormatException -> L3a
            r5 = 8
            int[] r6 = new int[r5]     // Catch: java.lang.NumberFormatException -> L3a
            r6 = {x00ac: FILL_ARRAY_DATA , data: [1, 13, 10, 8, 12, 6, 5, 4} // fill-array     // Catch: java.lang.NumberFormatException -> L3a
            r7 = r1
        L18:
            if (r7 >= r5) goto L35
            r8 = r6[r7]     // Catch: java.lang.NumberFormatException -> L3a
            boolean r9 = r3.mo14156c(r2, r8)     // Catch: java.lang.NumberFormatException -> L3a
            if (r9 == 0) goto L32
            android.media.CamcorderProfile r8 = r3.mo14155b(r2, r8)     // Catch: java.lang.NumberFormatException -> L3a
            if (r8 == 0) goto L32
            android.util.Size r2 = new android.util.Size     // Catch: java.lang.NumberFormatException -> L3a
            int r3 = r8.videoFrameWidth     // Catch: java.lang.NumberFormatException -> L3a
            int r5 = r8.videoFrameHeight     // Catch: java.lang.NumberFormatException -> L3a
            r2.<init>(r3, r5)     // Catch: java.lang.NumberFormatException -> L3a
            goto L36
        L32:
            int r7 = r7 + 1
            goto L18
        L35:
            r2 = r0
        L36:
            if (r2 == 0) goto L3a
        L38:
            r6 = r2
            goto L83
        L3a:
            w.i r2 = r11.f36506m
            ug.j r2 = r2.m14825c()
            java.lang.Object r2 = r2.f35537b     // Catch: java.lang.Throwable -> L4f
            v0.f r2 = (v0.C7622f) r2     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r2 = r2.f36778a     // Catch: java.lang.Throwable -> L4f
            android.hardware.camera2.params.StreamConfigurationMap r2 = (android.hardware.camera2.params.StreamConfigurationMap) r2     // Catch: java.lang.Throwable -> L4f
            java.lang.Class<android.media.MediaRecorder> r3 = android.media.MediaRecorder.class
            android.util.Size[] r2 = r2.getOutputSizes(r3)     // Catch: java.lang.Throwable -> L4f
            goto L50
        L4f:
            r2 = r0
        L50:
            if (r2 != 0) goto L53
            goto L7c
        L53:
            j0.c r3 = new j0.c
            r5 = 1
            r3.<init>(r5)
            java.util.Arrays.sort(r2, r3)
            int r3 = r2.length
        L5d:
            if (r1 >= r3) goto L7c
            r5 = r2[r1]
            int r6 = r5.getWidth()
            android.util.Size r7 = p0.AbstractC5787a.f28372e
            int r8 = r7.getWidth()
            if (r6 > r8) goto L79
            int r6 = r5.getHeight()
            int r7 = r7.getHeight()
            if (r6 > r7) goto L79
            r0 = r5
            goto L7c
        L79:
            int r1 = r1 + 1
            goto L5d
        L7c:
            if (r0 == 0) goto L80
            r6 = r0
            goto L83
        L80:
            android.util.Size r2 = p0.AbstractC5787a.f28370c
            goto L38
        L83:
            android.util.Size r2 = p0.AbstractC5787a.f28369b
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            i0.n r1 = new i0.n
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f36516w = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.c1.m14356c():void");
    }

    /* renamed from: e */
    public final int m14357e(int i10, Size size, boolean z6) {
        long outputMinFrameDuration;
        y0.m11056f(null, !z6 || i10 == 34);
        if (!z6) {
            C7439j c7439jM14825c = this.f36506m.m14825c();
            Objects.requireNonNull(c7439jM14825c);
            try {
                outputMinFrameDuration = ((StreamConfigurationMap) ((C7622f) c7439jM14825c.f35537b).f36778a).getOutputMinFrameDuration(i10, size);
            } catch (RuntimeException unused) {
                Objects.toString(size);
                u1.m10952k("StreamConfigurationMapCompat");
                outputMinFrameDuration = 0;
            }
            if (outputMinFrameDuration > 0) {
                return (int) (1.0E9d / outputMinFrameDuration);
            }
            if (!this.f36514u) {
                return Integer.MAX_VALUE;
            }
            Objects.toString(size);
            u1.m10951j("SupportedSurfaceCombination");
            return 0;
        }
        t0 t0Var = this.f36492C;
        t0Var.getClass();
        AbstractC4154l.m8923f(size, "size");
        List listM14429c = t0Var.m14429c(size);
        List list = listM14429c.isEmpty() ? null : listM14429c;
        if (list == null) {
            size.toString();
            u1.m10951j("HighSpeedResolver");
            return 0;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Integer num = (Integer) ((Range) it.next()).getUpper();
        while (it.hasNext()) {
            Integer num2 = (Integer) ((Range) it.next()).getUpper();
            if (num.compareTo(num2) < 0) {
                num = num2;
            }
        }
        AbstractC4154l.m8922e(num, "maxOf(...)");
        return num.intValue();
    }

    /* renamed from: g */
    public final List m14358g(C7594d c7594d, List list, HashMap map, HashMap map2) {
        List list2;
        C3076g c3076g = z0.f36763a;
        if (c7594d.f36520a != 0 || c7594d.f36522c != 8 || c7594d.f36525f) {
            return null;
        }
        ArrayList arrayList = this.f36503j;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            List listM7357c = ((k2) obj).m7357c(list);
            if (listM7357c != null) {
                C3076g c3076g2 = z0.f36763a;
                int size2 = listM7357c.size();
                int i12 = i10;
                while (true) {
                    if (i12 < size2) {
                        long value = ((p2) listM7357c.get(i12)).f16560c.getValue();
                        if (map.containsKey(Integer.valueOf(i12))) {
                            C3074e c3074e = (C3074e) map.get(Integer.valueOf(i12));
                            AbstractC4154l.m8920c(c3074e);
                            List list3 = c3074e.f16447e;
                            y2 y2Var = list3.size() == 1 ? (y2) list3.get(i10) : y2.STREAM_SHARING;
                            AbstractC4154l.m8920c(y2Var);
                            if (!z0.m14498c(y2Var, value, list3)) {
                                break;
                            }
                            i12++;
                            i10 = 0;
                        } else {
                            if (!map2.containsKey(Integer.valueOf(i12))) {
                                throw new AssertionError("SurfaceConfig does not map to any use case");
                            }
                            Object obj2 = map2.get(Integer.valueOf(i12));
                            AbstractC4154l.m8920c(obj2);
                            w2 w2Var = (w2) obj2;
                            y2 y2VarMo7421E = w2Var.mo7421E();
                            AbstractC4154l.m8922e(y2VarMo7421E, "getCaptureType(...)");
                            if (w2Var.mo7421E() == y2.STREAM_SHARING) {
                                list2 = (List) ((C7295e) w2Var).mo7406k(C7295e.f34801b);
                                AbstractC4154l.m8922e(list2, "getCaptureTypes(...)");
                            } else {
                                list2 = C6668r.f31943a;
                            }
                            if (!z0.m14498c(y2VarMo7421E, value, list2)) {
                                break;
                            }
                            i12++;
                            i10 = 0;
                        }
                    } else if (z0.m14496a(this.f36506m, listM7357c)) {
                        return listM7357c;
                    }
                }
            }
            i10 = 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x042d, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0388  */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i0.q2 m14359j(int r30, java.util.ArrayList r31, java.util.HashMap r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.c1.m14359j(int, java.util.ArrayList, java.util.HashMap, boolean, boolean, boolean):i0.q2");
    }

    /* renamed from: k */
    public final Pair m14360k(C7594d c7594d, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i10, HashMap map, HashMap map2) {
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            C3074e c3074e = (C3074e) obj;
            arrayList4.add(c3074e.f16443a);
            map.put(Integer.valueOf(arrayList4.size() - 1), c3074e);
        }
        int iMin = i10;
        for (int i12 = 0; i12 < list.size(); i12++) {
            Size size2 = (Size) list.get(i12);
            w2 w2Var = (w2) arrayList2.get(((Integer) arrayList3.get(i12)).intValue());
            int iMo7291q = w2Var.mo7291q();
            j2 j2VarM7423z = w2Var.m7423z();
            m2 m2Var = c7594d.f36527h ? m2.FEATURE_COMBINATION_TABLE : m2.CAPTURE_SESSION_TABLES;
            C3083n c3083nM14361l = m14361l(iMo7291q);
            int i13 = c7594d.f36520a;
            j2 j2Var = p2.f16554e;
            arrayList4.add(a0.m11531b(iMo7291q, size2, c3083nM14361l, i13, m2Var, j2VarM7423z));
            map2.put(Integer.valueOf(arrayList4.size() - 1), w2Var);
            iMin = Math.min(iMin, m14357e(w2Var.mo7291q(), size2, c7594d.f36525f));
        }
        return new Pair(arrayList4, Integer.valueOf(iMin));
    }

    /* renamed from: l */
    public final C3083n m14361l(int i10) {
        StreamConfigurationMap streamConfigurationMap;
        Integer numValueOf = Integer.valueOf(i10);
        ArrayList arrayList = this.f36517x;
        if (!arrayList.contains(numValueOf)) {
            m14364p(this.f36516w.f16530b, AbstractC5787a.f28371d, i10);
            m14364p(this.f36516w.f16532d, AbstractC5787a.f28373f, i10);
            m14363o(this.f36516w.f16534f, i10, null);
            m14363o(this.f36516w.f16535g, i10, AbstractC3502b.f18368a);
            m14363o(this.f36516w.f16536h, i10, AbstractC3502b.f18370c);
            HashMap map = this.f36516w.f16537i;
            if (Build.VERSION.SDK_INT >= 31 && this.f36513t && (streamConfigurationMap = (StreamConfigurationMap) this.f36506m.m14823a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map.put(Integer.valueOf(i10), m14350f(streamConfigurationMap, i10, true, null));
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return this.f36516w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0289  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85, types: [rw.r] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i0.q2 m14362n(p020v.C7594d r43, java.util.ArrayList r44, java.util.Map r45, java.util.ArrayList r46, java.util.ArrayList r47, java.util.HashMap r48) {
        /*
            Method dump skipped, instructions count: 2161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p020v.c1.m14362n(v.d, java.util.ArrayList, java.util.Map, java.util.ArrayList, java.util.ArrayList, java.util.HashMap):i0.q2");
    }

    /* renamed from: o */
    public final void m14363o(HashMap map, int i10, Rational rational) {
        Size sizeM14350f = m14350f((StreamConfigurationMap) ((C7622f) this.f36506m.m14825c().f35537b).f36778a, i10, true, rational);
        if (sizeM14350f != null) {
            map.put(Integer.valueOf(i10), sizeM14350f);
        }
    }

    /* renamed from: p */
    public final void m14364p(HashMap map, Size size, int i10) {
        if (this.f36511r) {
            Size sizeM14350f = m14350f((StreamConfigurationMap) ((C7622f) this.f36506m.m14825c().f35537b).f36778a, i10, false, null);
            Integer numValueOf = Integer.valueOf(i10);
            if (sizeM14350f != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeM14350f), new C3503c(false));
            }
            map.put(numValueOf, size);
        }
    }
}
