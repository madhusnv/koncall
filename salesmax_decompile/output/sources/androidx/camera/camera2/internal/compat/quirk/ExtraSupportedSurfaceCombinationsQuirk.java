package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p001o.j5e;
import p001o.veg;
import p001o.weg;

/* loaded from: classes2.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements j5e {

    /* renamed from: a */
    public static final veg f6064a = m4559c();

    /* renamed from: b */
    public static final veg f6065b = m4560d();

    /* renamed from: c */
    public static final Set f6066c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));

    /* renamed from: d */
    public static final Set f6067d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));

    /* renamed from: c */
    public static veg m4559c() {
        veg vegVar = new veg();
        weg.EnumC17833b enumC17833b = weg.EnumC17833b.YUV;
        vegVar.m52678a(weg.m54274a(enumC17833b, weg.EnumC17832a.VGA));
        vegVar.m52678a(weg.m54274a(weg.EnumC17833b.PRIV, weg.EnumC17832a.PREVIEW));
        vegVar.m52678a(weg.m54274a(enumC17833b, weg.EnumC17832a.MAXIMUM));
        return vegVar;
    }

    /* renamed from: d */
    public static veg m4560d() {
        veg vegVar = new veg();
        weg.EnumC17833b enumC17833b = weg.EnumC17833b.PRIV;
        vegVar.m52678a(weg.m54274a(enumC17833b, weg.EnumC17832a.PREVIEW));
        vegVar.m52678a(weg.m54274a(enumC17833b, weg.EnumC17832a.VGA));
        vegVar.m52678a(weg.m54274a(weg.EnumC17833b.YUV, weg.EnumC17832a.MAXIMUM));
        return vegVar;
    }

    /* renamed from: g */
    public static boolean m4561g() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    /* renamed from: h */
    public static boolean m4562h() {
        return m4561g() || m4563i() || m4564j();
    }

    /* renamed from: i */
    public static boolean m4563i() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f6066c.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* renamed from: j */
    public static boolean m4564j() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f6067d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public List m4565e(String str) {
        return m4561g() ? m4566f(str) : (m4563i() || m4564j()) ? Collections.singletonList(f6065b) : Collections.emptyList();
    }

    /* renamed from: f */
    public final List m4566f(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f6064a);
        }
        return arrayList;
    }
}
