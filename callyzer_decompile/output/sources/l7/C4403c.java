package l7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.cg;
import og.dg;
import og.fg;
import og.pe;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.c */
/* loaded from: classes.dex */
public final class C4403c extends k0 {

    /* renamed from: r */
    public final /* synthetic */ int f22008r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4403c(boolean z6, int i10) {
        super(z6);
        this.f22008r = i10;
    }

    /* renamed from: h */
    public static float[] m9199h(String value) {
        AbstractC4154l.m8923f(value, "value");
        return new float[]{((Number) k0.f22066i.mo9206d(value)).floatValue()};
    }

    /* renamed from: i */
    public static int[] m9200i(String value) {
        AbstractC4154l.m8923f(value, "value");
        return new int[]{((Number) k0.f22059b.mo9206d(value)).intValue()};
    }

    /* renamed from: j */
    public static long[] m9201j(String value) {
        AbstractC4154l.m8923f(value, "value");
        return new long[]{((Number) k0.f22063f.mo9206d(value)).longValue()};
    }

    /* renamed from: k */
    public static boolean[] m9202k(String value) {
        AbstractC4154l.m8923f(value, "value");
        return new boolean[]{((Boolean) k0.f22069l.mo9206d(value)).booleanValue()};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [rw.r] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v23, types: [rw.r] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [rw.r] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    @Override // l7.k0
    /* renamed from: a */
    public final Object mo9203a(String key, Bundle bundle) {
        Object objM10833h;
        Object objM10833h2;
        Object objM10833h3;
        switch (this.f22008r) {
            case 0:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                if (!bundle.containsKey(key) || cg.m10590e(key, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(key);
                if (booleanArray != null) {
                    return booleanArray;
                }
                dg.m10615b(key);
                throw null;
            case 1:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                if (!bundle.containsKey(key) || cg.m10590e(key, bundle)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(key);
                if (booleanArray2 == null) {
                    dg.m10615b(key);
                    throw null;
                }
                AbstractC4154l.m8923f(booleanArray2, "<this>");
                int length = booleanArray2.length;
                if (length != 0) {
                    if (length != 1) {
                        objM10833h = new ArrayList(booleanArray2.length);
                        for (boolean z6 : booleanArray2) {
                            objM10833h.add(Boolean.valueOf(z6));
                        }
                    } else {
                        objM10833h = pe.m10833h(Boolean.valueOf(booleanArray2[0]));
                    }
                } else {
                    objM10833h = C6668r.f31943a;
                }
                return objM10833h;
            case 2:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                if (!bundle.containsKey(key) || cg.m10590e(key, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(key);
                if (floatArray != null) {
                    return floatArray;
                }
                dg.m10615b(key);
                throw null;
            case 3:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                if (!bundle.containsKey(key) || cg.m10590e(key, bundle)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(key);
                if (floatArray2 == null) {
                    dg.m10615b(key);
                    throw null;
                }
                AbstractC4154l.m8923f(floatArray2, "<this>");
                int length2 = floatArray2.length;
                if (length2 != 0) {
                    if (length2 != 1) {
                        objM10833h2 = new ArrayList(floatArray2.length);
                        for (float f6 : floatArray2) {
                            objM10833h2.add(Float.valueOf(f6));
                        }
                    } else {
                        objM10833h2 = pe.m10833h(Float.valueOf(floatArray2[0]));
                    }
                } else {
                    objM10833h2 = C6668r.f31943a;
                }
                return objM10833h2;
            case 4:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                if (!bundle.containsKey(key) || cg.m10590e(key, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(key);
                if (intArray != null) {
                    return intArray;
                }
                dg.m10615b(key);
                throw null;
            case 5:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                if (!bundle.containsKey(key) || cg.m10590e(key, bundle)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(key);
                if (intArray2 != null) {
                    int length3 = intArray2.length;
                    return length3 != 0 ? length3 != 1 ? AbstractC6662l.m12709L(intArray2) : pe.m10833h(Integer.valueOf(intArray2[0])) : C6668r.f31943a;
                }
                dg.m10615b(key);
                throw null;
            case 6:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                if (!bundle.containsKey(key) || cg.m10590e(key, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(key);
                if (longArray != null) {
                    return longArray;
                }
                dg.m10615b(key);
                throw null;
            case 7:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                if (!bundle.containsKey(key) || cg.m10590e(key, bundle)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(key);
                if (longArray2 == null) {
                    dg.m10615b(key);
                    throw null;
                }
                AbstractC4154l.m8923f(longArray2, "<this>");
                int length4 = longArray2.length;
                if (length4 != 0) {
                    if (length4 != 1) {
                        objM10833h3 = new ArrayList(longArray2.length);
                        for (long j6 : longArray2) {
                            objM10833h3.add(Long.valueOf(j6));
                        }
                    } else {
                        objM10833h3 = pe.m10833h(Long.valueOf(longArray2[0]));
                    }
                } else {
                    objM10833h3 = C6668r.f31943a;
                }
                return objM10833h3;
            case 8:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                if (!bundle.containsKey(key) || cg.m10590e(key, bundle)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(key);
                if (stringArray != null) {
                    return stringArray;
                }
                dg.m10615b(key);
                throw null;
            default:
                AbstractC4154l.m8923f(bundle, "bundle");
                AbstractC4154l.m8923f(key, "key");
                if (!bundle.containsKey(key) || cg.m10590e(key, bundle)) {
                    return null;
                }
                String[] stringArray2 = bundle.getStringArray(key);
                if (stringArray2 != null) {
                    return AbstractC6662l.m12708K(stringArray2);
                }
                dg.m10615b(key);
                throw null;
        }
    }

    @Override // l7.k0
    /* renamed from: b */
    public final String mo9204b() {
        switch (this.f22008r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // l7.k0
    /* renamed from: c */
    public final Object mo9205c(Object obj, String str) {
        switch (this.f22008r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return m9202k(str);
                }
                boolean[] zArrM9202k = m9202k(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrM9202k, 0, zArrCopyOf, length, 1);
                AbstractC4154l.m8920c(zArrCopyOf);
                return zArrCopyOf;
            case 1:
                List list = (List) obj;
                C4404d c4404d = k0.f22069l;
                return list != null ? AbstractC6663m.m12754R(list, pe.m10833h(c4404d.mo9206d(str))) : pe.m10833h(c4404d.mo9206d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return m9199h(str);
                }
                float[] fArrM9199h = m9199h(str);
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArrM9199h, 0, fArrCopyOf, length2, 1);
                AbstractC4154l.m8920c(fArrCopyOf);
                return fArrCopyOf;
            case 3:
                List list2 = (List) obj;
                C4404d c4404d2 = k0.f22066i;
                return list2 != null ? AbstractC6663m.m12754R(list2, pe.m10833h(c4404d2.mo9206d(str))) : pe.m10833h(c4404d2.mo9206d(str));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return m9200i(str);
                }
                int[] iArrM9200i = m9200i(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrM9200i, 0, iArrCopyOf, length3, 1);
                AbstractC4154l.m8920c(iArrCopyOf);
                return iArrCopyOf;
            case 5:
                List list3 = (List) obj;
                C4404d c4404d3 = k0.f22059b;
                return list3 != null ? AbstractC6663m.m12754R(list3, pe.m10833h(c4404d3.mo9206d(str))) : pe.m10833h(c4404d3.mo9206d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return m9201j(str);
                }
                long[] jArrM9201j = m9201j(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrM9201j, 0, jArrCopyOf, length4, 1);
                AbstractC4154l.m8920c(jArrCopyOf);
                return jArrCopyOf;
            case 7:
                List list4 = (List) obj;
                C4404d c4404d4 = k0.f22063f;
                return list4 != null ? AbstractC6663m.m12754R(list4, pe.m10833h(c4404d4.mo9206d(str))) : pe.m10833h(c4404d4.mo9206d(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(new String[]{str}, 0, objArrCopyOf, length5, 1);
                AbstractC4154l.m8920c(objArrCopyOf);
                return (String[]) objArrCopyOf;
            default:
                List list5 = (List) obj;
                return list5 != null ? AbstractC6663m.m12754R(list5, pe.m10833h(str)) : pe.m10833h(str);
        }
    }

    @Override // l7.k0
    /* renamed from: d */
    public final Object mo9206d(String value) {
        switch (this.f22008r) {
            case 0:
                return m9202k(value);
            case 1:
                AbstractC4154l.m8923f(value, "value");
                return pe.m10833h(k0.f22069l.mo9206d(value));
            case 2:
                return m9199h(value);
            case 3:
                AbstractC4154l.m8923f(value, "value");
                return pe.m10833h(k0.f22066i.mo9206d(value));
            case 4:
                return m9200i(value);
            case 5:
                AbstractC4154l.m8923f(value, "value");
                return pe.m10833h(k0.f22059b.mo9206d(value));
            case 6:
                return m9201j(value);
            case 7:
                AbstractC4154l.m8923f(value, "value");
                return pe.m10833h(k0.f22063f.mo9206d(value));
            case 8:
                AbstractC4154l.m8923f(value, "value");
                return new String[]{value};
            default:
                AbstractC4154l.m8923f(value, "value");
                return pe.m10833h(value);
        }
    }

    @Override // l7.k0
    /* renamed from: e */
    public final void mo9207e(Bundle bundle, String key, Object obj) {
        switch (this.f22008r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                AbstractC4154l.m8923f(key, "key");
                if (zArr == null) {
                    fg.m10656b(key, bundle);
                    break;
                } else {
                    bundle.putBooleanArray(key, zArr);
                    break;
                }
            case 1:
                List list = (List) obj;
                AbstractC4154l.m8923f(key, "key");
                if (list == null) {
                    fg.m10656b(key, bundle);
                    break;
                } else {
                    bundle.putBooleanArray(key, AbstractC6663m.m12762Z(list));
                    break;
                }
            case 2:
                float[] fArr = (float[]) obj;
                AbstractC4154l.m8923f(key, "key");
                if (fArr == null) {
                    fg.m10656b(key, bundle);
                    break;
                } else {
                    bundle.putFloatArray(key, fArr);
                    break;
                }
            case 3:
                List list2 = (List) obj;
                AbstractC4154l.m8923f(key, "key");
                if (list2 == null) {
                    fg.m10656b(key, bundle);
                    break;
                } else {
                    float[] fArr2 = new float[list2.size()];
                    Iterator it = list2.iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        fArr2[i10] = ((Number) it.next()).floatValue();
                        i10++;
                    }
                    bundle.putFloatArray(key, fArr2);
                    break;
                }
            case 4:
                int[] iArr = (int[]) obj;
                AbstractC4154l.m8923f(key, "key");
                if (iArr == null) {
                    fg.m10656b(key, bundle);
                    break;
                } else {
                    bundle.putIntArray(key, iArr);
                    break;
                }
            case 5:
                List list3 = (List) obj;
                AbstractC4154l.m8923f(key, "key");
                if (list3 != null) {
                    bundle.putIntArray(key, AbstractC6663m.b0(list3));
                    break;
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                AbstractC4154l.m8923f(key, "key");
                if (jArr == null) {
                    fg.m10656b(key, bundle);
                    break;
                } else {
                    bundle.putLongArray(key, jArr);
                    break;
                }
            case 7:
                List list4 = (List) obj;
                AbstractC4154l.m8923f(key, "key");
                if (list4 == null) {
                    fg.m10656b(key, bundle);
                    break;
                } else {
                    long[] jArr2 = new long[list4.size()];
                    Iterator it2 = list4.iterator();
                    int i11 = 0;
                    while (it2.hasNext()) {
                        jArr2[i11] = ((Number) it2.next()).longValue();
                        i11++;
                    }
                    bundle.putLongArray(key, jArr2);
                    break;
                }
            case 8:
                String[] strArr = (String[]) obj;
                AbstractC4154l.m8923f(key, "key");
                if (strArr == null) {
                    fg.m10656b(key, bundle);
                    break;
                } else {
                    bundle.putStringArray(key, strArr);
                    break;
                }
            default:
                List list5 = (List) obj;
                AbstractC4154l.m8923f(key, "key");
                if (list5 == null) {
                    fg.m10656b(key, bundle);
                    break;
                } else {
                    String[] value = (String[]) list5.toArray(new String[0]);
                    AbstractC4154l.m8923f(value, "value");
                    bundle.putStringArray(key, value);
                    break;
                }
        }
    }

    @Override // l7.k0
    /* renamed from: g */
    public final boolean mo9208g(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Integer[] numArr;
        Long[] lArr;
        switch (this.f22008r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                Boolean[] boolArr2 = null;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        boolArr[i10] = Boolean.valueOf(zArr[i10]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    boolArr2 = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    for (int i11 = 0; i11 < length2; i11++) {
                        boolArr2[i11] = Boolean.valueOf(zArr2[i11]);
                    }
                }
                return AbstractC6662l.m12714d(boolArr, boolArr2);
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                return AbstractC6662l.m12714d(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
            case 2:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                Float[] fArr4 = null;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i12 = 0; i12 < length3; i12++) {
                        fArr[i12] = Float.valueOf(fArr2[i12]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    fArr4 = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    for (int i13 = 0; i13 < length4; i13++) {
                        fArr4[i13] = Float.valueOf(fArr3[i13]);
                    }
                }
                return AbstractC6662l.m12714d(fArr, fArr4);
            case 3:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return AbstractC6662l.m12714d(list3 != null ? (Float[]) list3.toArray(new Float[0]) : null, list4 != null ? (Float[]) list4.toArray(new Float[0]) : null);
            case 4:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                Integer[] numArr2 = null;
                if (iArr != null) {
                    numArr = new Integer[iArr.length];
                    int length5 = iArr.length;
                    for (int i14 = 0; i14 < length5; i14++) {
                        numArr[i14] = Integer.valueOf(iArr[i14]);
                    }
                } else {
                    numArr = null;
                }
                if (iArr2 != null) {
                    numArr2 = new Integer[iArr2.length];
                    int length6 = iArr2.length;
                    for (int i15 = 0; i15 < length6; i15++) {
                        numArr2[i15] = Integer.valueOf(iArr2[i15]);
                    }
                }
                return AbstractC6662l.m12714d(numArr, numArr2);
            case 5:
                List list5 = (List) obj;
                List list6 = (List) obj2;
                return AbstractC6662l.m12714d(list5 != null ? (Integer[]) list5.toArray(new Integer[0]) : null, list6 != null ? (Integer[]) list6.toArray(new Integer[0]) : null);
            case 6:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                Long[] lArr2 = null;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length7 = jArr.length;
                    for (int i16 = 0; i16 < length7; i16++) {
                        lArr[i16] = Long.valueOf(jArr[i16]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    lArr2 = new Long[jArr2.length];
                    int length8 = jArr2.length;
                    for (int i17 = 0; i17 < length8; i17++) {
                        lArr2[i17] = Long.valueOf(jArr2[i17]);
                    }
                }
                return AbstractC6662l.m12714d(lArr, lArr2);
            case 7:
                List list7 = (List) obj;
                List list8 = (List) obj2;
                return AbstractC6662l.m12714d(list7 != null ? (Long[]) list7.toArray(new Long[0]) : null, list8 != null ? (Long[]) list8.toArray(new Long[0]) : null);
            case 8:
                return AbstractC6662l.m12714d((String[]) obj, (String[]) obj2);
            default:
                List list9 = (List) obj;
                List list10 = (List) obj2;
                return AbstractC6662l.m12714d(list9 != null ? (String[]) list9.toArray(new String[0]) : null, list10 != null ? (String[]) list10.toArray(new String[0]) : null);
        }
    }
}
