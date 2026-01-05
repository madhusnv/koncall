package lw;

import c3.C0847b;
import com.skydoves.balloon.internals.DefinitionKt;
import g1.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4262d;
import kx.InterfaceC4263e;
import mw.C4896d;
import og.e1;
import og.pe;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import t3.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lw.b */
/* loaded from: classes3.dex */
public final class C4537b {

    /* renamed from: a */
    public final float f22547a;

    /* renamed from: b */
    public final a0 f22548b = a0.f22546a;

    public C4537b(float f6) {
        this.f22547a = f6;
    }

    /* renamed from: a */
    public final InterfaceC4544i m9396a(f0 f0Var, k0 k0Var, j0 j0Var, y0 y0Var) {
        float fMax;
        float f6;
        long j6;
        long jFloatToRawIntBits;
        C4545j c4545j = !(f0Var.f22581c instanceof a0) ? C4545j.f22594a : null;
        if (c4545j != null) {
            return c4545j;
        }
        float f10 = y0Var.f11118a;
        C4896d c4896d = k0Var.f22600d;
        w0 w0Var = k0Var.f22599c;
        float f11 = f0Var.f22579a * this.f22547a;
        j0 j0Var2 = j0.NorthWest;
        boolean z6 = j0Var == j0Var2 || j0Var == j0.SouthWest;
        if (j0Var == j0.SouthWest || j0Var == j0.SouthEast) {
            fMax = Math.max(((f11 / 2.0f) * ((float) Math.sin(e1.m10622d(c4896d)))) - (w0Var.f34031b / 2.0f), f10);
        } else {
            float fSin = (f11 / 2.0f) * ((float) Math.sin(e1.m10622d(c4896d)));
            float f12 = w0Var.f34031b;
            fMax = Math.min(fSin - (f12 / 2.0f), f10 - f12);
        }
        float f13 = w0Var.f34031b + fMax;
        float f14 = f11 / 2.0f;
        float fAsin = (float) Math.asin(fMax / f14);
        Float fValueOf = Float.valueOf(fAsin);
        Float fValueOf2 = Float.valueOf((float) (3.141592653589793d - fAsin));
        float fAsin2 = (float) Math.asin(f13 / f14);
        Float fValueOf3 = Float.valueOf(fAsin2);
        Float fValueOf4 = Float.valueOf((float) (3.141592653589793d - fAsin2));
        float fCos = ((float) Math.cos(e1.m10622d(c4896d))) * f14;
        if (z6) {
            float fMin = Float.isNaN(fValueOf.floatValue()) ? Float.POSITIVE_INFINITY : Math.min((float) Math.cos(r13.floatValue()), (float) Math.cos(fValueOf2.floatValue())) * f14;
            float fMin2 = Float.isNaN(fValueOf3.floatValue()) ? Float.POSITIVE_INFINITY : Math.min((float) Math.cos(r14.floatValue()), (float) Math.cos(fValueOf4.floatValue())) * f14;
            if (!Float.isInfinite(fMin) || !Float.isInfinite(fMin2)) {
                fCos = Math.min(Math.min(fMin, fMin2), fCos);
            }
        } else {
            float fMax2 = Float.isNaN(fValueOf.floatValue()) ? Float.NEGATIVE_INFINITY : Math.max((float) Math.cos(r13.floatValue()), (float) Math.cos(fValueOf2.floatValue())) * f14;
            float fMax3 = Float.isNaN(fValueOf3.floatValue()) ? Float.NEGATIVE_INFINITY : Math.max((float) Math.cos(r14.floatValue()), (float) Math.cos(fValueOf4.floatValue())) * f14;
            if (!Float.isInfinite(fMax2) || !Float.isInfinite(fMax3)) {
                fCos = Math.max(Math.max(fMax2, fMax3), fCos);
            }
        }
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fMax) & 4294967295L) | (Float.floatToRawIntBits(fCos) << 32);
        if (z6) {
            f6 = 0.0f;
            jFloatToRawIntBits2 = C0847b.m2276g(jFloatToRawIntBits2, (Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) & 4294967295L) | (Float.floatToRawIntBits(-w0Var.f34030a) << 32));
        } else {
            f6 = 0.0f;
        }
        long jM2276g = C0847b.m2276g(jFloatToRawIntBits2, (Float.floatToRawIntBits(w0Var.f34031b / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
        if (z6) {
            j6 = 4294967295L;
            jFloatToRawIntBits = (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(w0Var.f34030a) << 32);
        } else {
            j6 = 4294967295L;
            jFloatToRawIntBits = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        }
        long j10 = jFloatToRawIntBits2;
        C4542g c4542g = new C4542g(j10, C0847b.m2276g(jM2276g, jFloatToRawIntBits), new C4896d(z6 ? 0 : 180));
        if (j0Var != j0Var2 && j0Var != j0.NorthEast) {
            y0Var.f11118a = Float.intBitsToFloat((int) (j10 & j6)) + w0Var.f34031b;
            return c4542g;
        }
        int i10 = (int) (j10 & j6);
        y0Var.f11118a = Float.intBitsToFloat(i10);
        y0Var.f11119b = Math.max(y0Var.f11119b, Float.intBitsToFloat(i10) + w0Var.f34031b);
        return c4542g;
    }

    /* renamed from: b */
    public final ArrayList m9397b(float f6, float f10, ArrayList arrayList, List pieSliceData) {
        AbstractC4154l.m8923f(pieSliceData, "pieSliceData");
        f0 f0Var = new f0(f6, f10, this.f22548b);
        HashMap map = new HashMap();
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
            w0 w0Var = (w0) obj;
            C4896d c4896d = ((g0) pieSliceData.get(i10)).f22585a;
            C4896d c4896d2 = new C4896d(e1.m10621c(new C4896d(e1.m10621c(((g0) pieSliceData.get(i10)).f22586b) / 2.0f)) + e1.m10621c(c4896d));
            j0.Companion.getClass();
            double d2 = 360.0f;
            double dM10621c = ((e1.m10621c(c4896d2) % d2) + d2) % d2;
            if (dM10621c > 270.0d) {
                dM10621c -= d2;
            }
            for (j0 j0Var : j0.getEntries()) {
                InterfaceC4263e angleRange = j0Var.getAngleRange();
                int i13 = size;
                AbstractC4154l.m8923f(angleRange, "<this>");
                C4262d c4262d = (C4262d) angleRange;
                float fFloatValue = Float.valueOf((float) dM10621c).floatValue();
                if (fFloatValue < c4262d.f21644a || fFloatValue > c4262d.f21645b) {
                    size = i13;
                } else {
                    Object arrayList2 = map.get(j0Var);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ((List) arrayList2).add(new k0(i10, (g0) pieSliceData.get(i10), w0Var, c4896d2));
                    map.put(j0Var, arrayList2);
                    size = i13;
                    i10 = i12;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        HashMap map2 = new HashMap();
        y0 y0Var = new y0();
        y0Var.f11118a = Float.POSITIVE_INFINITY;
        y0Var.f11119b = Float.NEGATIVE_INFINITY;
        List list = (List) map.get(j0.NorthEast);
        if (list != null) {
            for (k0 k0Var : AbstractC6663m.m12758V(list)) {
                map2.put(Integer.valueOf(k0Var.f22597a), m9396a(f0Var, k0Var, j0.NorthEast, y0Var));
            }
        }
        y0Var.f11118a = y0Var.f11119b;
        List<k0> list2 = (List) map.get(j0.SouthEast);
        if (list2 != null) {
            for (k0 k0Var2 : list2) {
                map2.put(Integer.valueOf(k0Var2.f22597a), m9396a(f0Var, k0Var2, j0.SouthEast, y0Var));
            }
        }
        y0Var.f11118a = Float.POSITIVE_INFINITY;
        y0Var.f11119b = Float.NEGATIVE_INFINITY;
        List<k0> list3 = (List) map.get(j0.NorthWest);
        if (list3 != null) {
            for (k0 k0Var3 : list3) {
                map2.put(Integer.valueOf(k0Var3.f22597a), m9396a(f0Var, k0Var3, j0.NorthWest, y0Var));
            }
        }
        y0Var.f11118a = y0Var.f11119b;
        List list4 = (List) map.get(j0.SouthWest);
        if (list4 != null) {
            for (k0 k0Var4 : AbstractC6663m.m12758V(list4)) {
                map2.put(Integer.valueOf(k0Var4.f22597a), m9396a(f0Var, k0Var4, j0.SouthWest, y0Var));
            }
        }
        Set setEntrySet = map2.entrySet();
        AbstractC4154l.m8922e(setEntrySet, "<get-entries>(...)");
        List listM12760X = AbstractC6663m.m12760X(setEntrySet, new C4536a());
        ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(listM12760X, 10));
        Iterator it = listM12760X.iterator();
        while (it.hasNext()) {
            arrayList3.add((InterfaceC4544i) ((Map.Entry) it.next()).getValue());
        }
        return arrayList3;
    }
}
