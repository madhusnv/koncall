package ug;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.C1286b;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.f5;
import com.google.android.gms.internal.measurement.f6;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.u5;
import com.google.android.gms.internal.measurement.zzmr;
import com.sun.mail.imap.IMAPStore;
import com.sun.mail.util.AbstractC1452a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import nz.C5201l;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 extends c4 {

    /* renamed from: d */
    public final /* synthetic */ int f35950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(h4 h4Var, int i10) {
        super(h4Var);
        this.f35950d = i10;
    }

    public static int A0(com.google.android.gms.internal.measurement.j3 j3Var, String str) {
        for (int i10 = 0; i10 < ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).V1(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).W1(i10).m3708r())) {
                return i10;
            }
        }
        return -1;
    }

    public static Bundle[] B0(o5 o5Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = o5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.f3 f3Var = (com.google.android.gms.internal.measurement.f3) it.next();
            if (f3Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.f3 f3Var2 : f3Var.m3266z()) {
                    if (f3Var2.m3258r()) {
                        bundle.putString(f3Var2.m3257q(), f3Var2.m3259s());
                    } else if (f3Var2.m3260t()) {
                        bundle.putLong(f3Var2.m3257q(), f3Var2.m3261u());
                    } else if (f3Var2.m3264x()) {
                        bundle.putDouble(f3Var2.m3257q(), f3Var2.m3265y());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap C0(Bundle bundle, boolean z6) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z10 = obj instanceof Parcelable[];
            if (z10 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z6) {
                    ArrayList arrayList = new ArrayList();
                    if (z10) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(C0((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(C0((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(C0((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    /* renamed from: Q */
    public static C7449t m14194Q(C1286b c1286b) {
        Object obj;
        Bundle bundleM14195R = m14195R(c1286b.f6070c, true);
        String string = (!bundleM14195R.containsKey("_o") || (obj = bundleM14195R.get("_o")) == null) ? "app" : obj.toString();
        String strM14269g = z1.m14269g(z1.f36025a, c1286b.f6068a, z1.f36027c);
        if (strM14269g == null) {
            strM14269g = c1286b.f6068a;
        }
        return new C7449t(strM14269g, new C7448s(bundleM14195R), string, c1286b.f6069b);
    }

    /* renamed from: R */
    public static Bundle m14195R(Map map, boolean z6) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z6) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(m14195R((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* renamed from: S */
    public static final void m14196S(com.google.android.gms.internal.measurement.b3 b3Var, String str, Long l9) {
        List listM3141i = b3Var.m3141i();
        int i10 = 0;
        while (true) {
            if (i10 >= listM3141i.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.f3) listM3141i.get(i10)).m3257q())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.e3 e3VarM3244B = com.google.android.gms.internal.measurement.f3.m3244B();
        e3VarM3244B.m3241i(str);
        e3VarM3244B.m3243l(l9.longValue());
        if (i10 < 0) {
            b3Var.m3145n(e3VarM3244B);
        } else {
            b3Var.m3303b();
            ((com.google.android.gms.internal.measurement.c3) b3Var.f6231b).m3188A(i10, (com.google.android.gms.internal.measurement.f3) e3VarM3244B.m3306e());
        }
    }

    /* renamed from: T */
    public static final Bundle m14197T(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.f3 f3Var = (com.google.android.gms.internal.measurement.f3) it.next();
            String strM3257q = f3Var.m3257q();
            if (f3Var.m3264x()) {
                bundle.putDouble(strM3257q, f3Var.m3265y());
            } else if (f3Var.m3262v()) {
                bundle.putFloat(strM3257q, f3Var.m3263w());
            } else if (f3Var.m3258r()) {
                bundle.putString(strM3257q, f3Var.m3259s());
            } else if (f3Var.m3260t()) {
                bundle.putLong(strM3257q, f3Var.m3261u());
            }
        }
        return bundle;
    }

    /* renamed from: U */
    public static final com.google.android.gms.internal.measurement.f3 m14198U(com.google.android.gms.internal.measurement.c3 c3Var, String str) {
        for (com.google.android.gms.internal.measurement.f3 f3Var : c3Var.m3198p()) {
            if (f3Var.m3257q().equals(str)) {
                return f3Var;
            }
        }
        return null;
    }

    /* renamed from: V */
    public static final Serializable m14199V(com.google.android.gms.internal.measurement.c3 c3Var, String str) {
        com.google.android.gms.internal.measurement.f3 f3VarM14198U = m14198U(c3Var, str);
        if (f3VarM14198U == null) {
            return null;
        }
        return b0(f3VarM14198U);
    }

    /* renamed from: Y */
    public static final void m14200Y(int i10, StringBuilder sb2) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    /* renamed from: Z */
    public static final void m14201Z(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String a0(boolean z6, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        if (z6) {
            sb2.append("Dynamic ");
        }
        if (z10) {
            sb2.append("Sequence ");
        }
        if (z11) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable b0(com.google.android.gms.internal.measurement.f3 f3Var) {
        if (f3Var.m3258r()) {
            return f3Var.m3259s();
        }
        if (f3Var.m3260t()) {
            return Long.valueOf(f3Var.m3261u());
        }
        if (f3Var.m3264x()) {
            return Double.valueOf(f3Var.m3265y());
        }
        if (f3Var.m3245A() > 0) {
            return B0((o5) f3Var.m3266z());
        }
        return null;
    }

    public static final void c0(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m14201Z(builder, str3, string, set);
            }
        }
    }

    public static final void d0(StringBuilder sb2, String str, com.google.android.gms.internal.measurement.n3 n3Var) {
        if (n3Var == null) {
            return;
        }
        m14200Y(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (n3Var.m3522s() != 0) {
            m14200Y(4, sb2);
            sb2.append("results: ");
            int i10 = 0;
            for (Long l9 : n3Var.m3521r()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l9);
                i10 = i11;
            }
            sb2.append('\n');
        }
        if (n3Var.m3520q() != 0) {
            m14200Y(4, sb2);
            sb2.append("status: ");
            int i12 = 0;
            for (Long l10 : n3Var.m3519p()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i12 = i13;
            }
            sb2.append('\n');
        }
        if (n3Var.m3524u() != 0) {
            m14200Y(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (com.google.android.gms.internal.measurement.a3 a3Var : n3Var.m3523t()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb2.append(", ");
                }
                sb2.append(a3Var.m3105p() ? Integer.valueOf(a3Var.m3106q()) : null);
                sb2.append(":");
                sb2.append(a3Var.m3107r() ? Long.valueOf(a3Var.m3108s()) : null);
                i14 = i15;
            }
            sb2.append("}\n");
        }
        if (n3Var.m3526w() != 0) {
            m14200Y(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (com.google.android.gms.internal.measurement.p3 p3Var : n3Var.m3525v()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb2.append(", ");
                }
                sb2.append(p3Var.m3588p() ? Integer.valueOf(p3Var.m3589q()) : null);
                sb2.append(": [");
                Iterator it = p3Var.m3590r().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i18 = i19;
                }
                sb2.append("]");
                i16 = i17;
            }
            sb2.append("}\n");
        }
        m14200Y(3, sb2);
        sb2.append("}\n");
    }

    public static final void e0(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m14200Y(i10 + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void f0(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.u1 u1Var) {
        if (u1Var == null) {
            return;
        }
        m14200Y(i10, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (u1Var.m3675p()) {
            int iM3684z = u1Var.m3684z();
            e0(sb2, i10, "comparison_type", iM3684z != 1 ? iM3684z != 2 ? iM3684z != 3 ? iM3684z != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (u1Var.m3676q()) {
            e0(sb2, i10, "match_as_float", Boolean.valueOf(u1Var.m3677r()));
        }
        if (u1Var.m3678s()) {
            e0(sb2, i10, "comparison_value", u1Var.m3679t());
        }
        if (u1Var.m3680u()) {
            e0(sb2, i10, "min_comparison_value", u1Var.m3681v());
        }
        if (u1Var.m3682w()) {
            e0(sb2, i10, "max_comparison_value", u1Var.m3683x());
        }
        m14200Y(i10, sb2);
        sb2.append("}\n");
    }

    public static boolean s0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean t0(n5 n5Var, int i10) {
        if (i10 < ((u5) n5Var).f6411c * 64) {
            return ((1 << (i10 % 64)) & ((Long) ((u5) n5Var).get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList u0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j6 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j6 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j6));
        }
        return arrayList;
    }

    public static h5 z0(h5 h5Var, byte[] bArr) throws zzmr {
        b5 b5VarM3268b;
        b5 b5Var = b5.f6076a;
        if (b5Var == null) {
            synchronized (b5.class) {
                try {
                    b5VarM3268b = b5.f6076a;
                    if (b5VarM3268b == null) {
                        f6 f6Var = f6.f6193c;
                        b5VarM3268b = f5.m3268b();
                        b5.f6076a = b5VarM3268b;
                    }
                } finally {
                }
            }
            b5Var = b5VarM3268b;
        }
        if (b5Var != null) {
            h5Var.getClass();
            h5Var.m3308g(bArr, bArr.length, b5Var);
            return h5Var;
        }
        h5Var.getClass();
        int length = bArr.length;
        b5 b5Var2 = b5.f6076a;
        f6 f6Var2 = f6.f6193c;
        h5Var.m3308g(bArr, length, b5.f6077b);
        return h5Var;
    }

    @Override // ug.c4
    /* renamed from: P */
    public final void mo13847P() {
        int i10 = this.f35950d;
    }

    /* renamed from: W */
    public void m14202W(StringBuilder sb2, int i10, o5 o5Var) {
        if (o5Var == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = o5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.f3 f3Var = (com.google.android.gms.internal.measurement.f3) it.next();
            if (f3Var != null) {
                m14200Y(i11, sb2);
                sb2.append("param {\n");
                e0(sb2, i11, IMAPStore.ID_NAME, f3Var.m3256p() ? ((n1) this.f482a).f35673k.m14114b(f3Var.m3257q()) : null);
                e0(sb2, i11, "string_value", f3Var.m3258r() ? f3Var.m3259s() : null);
                e0(sb2, i11, "int_value", f3Var.m3260t() ? Long.valueOf(f3Var.m3261u()) : null);
                e0(sb2, i11, "double_value", f3Var.m3264x() ? Double.valueOf(f3Var.m3265y()) : null);
                if (f3Var.m3245A() > 0) {
                    m14202W(sb2, i11, (o5) f3Var.m3266z());
                }
                m14200Y(i11, sb2);
                sb2.append("}\n");
            }
        }
    }

    /* renamed from: X */
    public void m14203X(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.r1 r1Var) {
        String str;
        if (r1Var == null) {
            return;
        }
        m14200Y(i10, sb2);
        sb2.append("filter {\n");
        if (r1Var.m3604t()) {
            e0(sb2, i10, "complement", Boolean.valueOf(r1Var.m3605u()));
        }
        if (r1Var.m3606v()) {
            e0(sb2, i10, "param_name", ((n1) this.f482a).f35673k.m14114b(r1Var.m3607w()));
        }
        if (r1Var.m3600p()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.x1 x1VarM3601q = r1Var.m3601q();
            if (x1VarM3601q != null) {
                m14200Y(i11, sb2);
                sb2.append("string_filter {\n");
                if (x1VarM3601q.m3758p()) {
                    switch (x1VarM3601q.m3765x()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    e0(sb2, i11, "match_type", str);
                }
                if (x1VarM3601q.m3759q()) {
                    e0(sb2, i11, "expression", x1VarM3601q.m3760r());
                }
                if (x1VarM3601q.m3761s()) {
                    e0(sb2, i11, "case_sensitive", Boolean.valueOf(x1VarM3601q.m3762t()));
                }
                if (x1VarM3601q.m3764v() > 0) {
                    m14200Y(i10 + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : x1VarM3601q.m3763u()) {
                        m14200Y(i10 + 3, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                m14200Y(i11, sb2);
                sb2.append("}\n");
            }
        }
        if (r1Var.m3602r()) {
            f0(sb2, i10 + 1, "number_filter", r1Var.m3603s());
        }
        m14200Y(i10, sb2);
        sb2.append("}\n");
    }

    public boolean g0() {
        m13858N();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((n1) this.f482a).f35664a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void k0(com.google.android.gms.internal.measurement.t3 t3Var, Object obj) {
        AbstractC6840z.m13036g(obj);
        t3Var.m3303b();
        ((com.google.android.gms.internal.measurement.u3) t3Var.f6231b).m3701E();
        t3Var.m3303b();
        ((com.google.android.gms.internal.measurement.u3) t3Var.f6231b).m3703G();
        t3Var.m3303b();
        ((com.google.android.gms.internal.measurement.u3) t3Var.f6231b).m3705I();
        if (obj instanceof String) {
            t3Var.m3303b();
            ((com.google.android.gms.internal.measurement.u3) t3Var.f6231b).m3700D((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            t3Var.m3303b();
            ((com.google.android.gms.internal.measurement.u3) t3Var.f6231b).m3702F(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            t3Var.m3303b();
            ((com.google.android.gms.internal.measurement.u3) t3Var.f6231b).m3704H(dDoubleValue);
        } else {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14141b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void l0(String str, d4 d4Var, com.google.android.gms.internal.measurement.i3 i3Var, w0 w0Var) {
        String str2;
        URL url;
        byte[] bArrM3669a;
        m1 m1Var;
        Map map;
        String str3 = d4Var.f35353a;
        n1 n1Var = (n1) this.f482a;
        mo325M();
        m13858N();
        try {
            url = new URI(str3).toURL();
            this.f35959b.j0();
            bArrM3669a = i3Var.m3669a();
            m1Var = n1Var.f35670g;
            n1.m14085m(m1Var);
            map = d4Var.f35354b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            m1Var.m14050Y(new x0(this, str2, url, bArrM3669a, map, w0Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14142c("Failed to parse URL. Not uploading MeasurementBatch. appId", v0.m14157U(str2), str3);
        }
    }

    public void m0(com.google.android.gms.internal.measurement.e3 e3Var, Object obj) {
        e3Var.m3303b();
        ((com.google.android.gms.internal.measurement.f3) e3Var.f6231b).m3248E();
        e3Var.m3303b();
        ((com.google.android.gms.internal.measurement.f3) e3Var.f6231b).m3250G();
        e3Var.m3303b();
        ((com.google.android.gms.internal.measurement.f3) e3Var.f6231b).m3252I();
        e3Var.m3303b();
        ((com.google.android.gms.internal.measurement.f3) e3Var.f6231b).m3255L();
        if (obj instanceof String) {
            e3Var.m3242k((String) obj);
            return;
        }
        if (obj instanceof Long) {
            e3Var.m3243l(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            e3Var.m3303b();
            ((com.google.android.gms.internal.measurement.f3) e3Var.f6231b).m3251H(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14141b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.e3 e3VarM3244B = com.google.android.gms.internal.measurement.f3.m3244B();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.e3 e3VarM3244B2 = com.google.android.gms.internal.measurement.f3.m3244B();
                    e3VarM3244B2.m3241i(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        e3VarM3244B2.m3243l(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        e3VarM3244B2.m3242k((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        e3VarM3244B2.m3303b();
                        ((com.google.android.gms.internal.measurement.f3) e3VarM3244B2.f6231b).m3251H(dDoubleValue2);
                    }
                    e3VarM3244B.m3303b();
                    ((com.google.android.gms.internal.measurement.f3) e3VarM3244B.f6231b).m3253J((com.google.android.gms.internal.measurement.f3) e3VarM3244B2.m3306e());
                }
                if (((com.google.android.gms.internal.measurement.f3) e3VarM3244B.f6231b).m3245A() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.f3) e3VarM3244B.m3306e());
                }
            }
        }
        e3Var.m3303b();
        ((com.google.android.gms.internal.measurement.f3) e3Var.f6231b).m3254K(arrayList);
    }

    public w3 n0(String str, com.google.android.gms.internal.measurement.j3 j3Var, com.google.android.gms.internal.measurement.b3 b3Var, String str2) {
        int iIndexOf;
        p8.m3595a();
        n1 n1Var = (n1) this.f482a;
        C7436g c7436g = n1Var.f35667d;
        if (!c7436g.m13889W(str, f0.P0)) {
            return null;
        }
        n1Var.f35674l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = c7436g.m13885S(str, f0.f44829u0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        h4 h4Var = this.f35959b;
        e4 e4Var = h4Var.f35495k;
        i1 i1Var = h4Var.f35486a;
        i1 i1Var2 = e4Var.f35959b.f35486a;
        h4.m13944U(i1Var2);
        String strM13994Z = i1Var2.m13994Z(str);
        Uri.Builder builder = new Uri.Builder();
        C7436g c7436g2 = ((n1) e4Var.f482a).f35667d;
        builder.scheme(c7436g2.m13885S(str, f0.f44822n0));
        if (TextUtils.isEmpty(strM13994Z)) {
            builder.authority(c7436g2.m13885S(str, f0.f44823o0));
        } else {
            String strM13885S = c7436g2.m13885S(str, f0.f44823o0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strM13994Z).length() + 1 + String.valueOf(strM13885S).length());
            sb2.append(strM13994Z);
            sb2.append(".");
            sb2.append(strM13885S);
            builder.authority(sb2.toString());
        }
        builder.path(c7436g2.m13885S(str, f0.f44824p0));
        m14201Z(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).m3439E(), setUnmodifiableSet);
        c7436g.m13884R();
        m14201Z(builder, "gmp_version", String.valueOf(133005L), setUnmodifiableSet);
        String strM3468y = ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).m3468y();
        e0 e0Var = f0.S0;
        if (c7436g.m13889W(str, e0Var)) {
            h4.m13944U(i1Var);
            if (i1Var.f0(str)) {
                strM3468y = "";
            }
        }
        m14201Z(builder, "app_instance_id", strM3468y, setUnmodifiableSet);
        m14201Z(builder, "rdid", ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).m3465v(), setUnmodifiableSet);
        m14201Z(builder, "bundle_id", j3Var.m3377q(), setUnmodifiableSet);
        String strM3147p = b3Var.m3147p();
        String strM14269g = z1.m14269g(z1.f36027c, strM3147p, z1.f36025a);
        if (true != TextUtils.isEmpty(strM14269g)) {
            strM3147p = strM14269g;
        }
        m14201Z(builder, "app_event_name", strM3147p, setUnmodifiableSet);
        m14201Z(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).m3445K()), setUnmodifiableSet);
        String strI2 = ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).i2();
        if (c7436g.m13889W(str, e0Var)) {
            h4.m13944U(i1Var);
            if (i1Var.e0(str) && !TextUtils.isEmpty(strI2) && (iIndexOf = strI2.indexOf(".")) != -1) {
                strI2 = strI2.substring(0, iIndexOf);
            }
        }
        m14201Z(builder, "os_version", strI2, setUnmodifiableSet);
        m14201Z(builder, "timestamp", String.valueOf(b3Var.m3148q()), setUnmodifiableSet);
        if (((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).m3467x()) {
            m14201Z(builder, "lat", "1", setUnmodifiableSet);
        }
        m14201Z(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).G0()), setUnmodifiableSet);
        m14201Z(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        m14201Z(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        m14201Z(builder, "request_uuid", str2, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.f3> listM3141i = b3Var.m3141i();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.f3 f3Var : listM3141i) {
            String strM3257q = f3Var.m3257q();
            if (f3Var.m3264x()) {
                bundle.putString(strM3257q, String.valueOf(f3Var.m3265y()));
            } else if (f3Var.m3262v()) {
                bundle.putString(strM3257q, String.valueOf(f3Var.m3263w()));
            } else if (f3Var.m3258r()) {
                bundle.putString(strM3257q, f3Var.m3259s());
            } else if (f3Var.m3260t()) {
                bundle.putString(strM3257q, String.valueOf(f3Var.m3261u()));
            }
        }
        c0(builder, c7436g.m13885S(str, f0.f44828t0).split("\\|"), bundle, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.u3> listUnmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).U1());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.u3 u3Var : listUnmodifiableList) {
            String strM3708r = u3Var.m3708r();
            if (u3Var.m3715y()) {
                bundle2.putString(strM3708r, String.valueOf(u3Var.m3716z()));
            } else if (u3Var.m3713w()) {
                bundle2.putString(strM3708r, String.valueOf(u3Var.m3714x()));
            } else if (u3Var.m3709s()) {
                bundle2.putString(strM3708r, u3Var.m3710t());
            } else if (u3Var.m3711u()) {
                bundle2.putString(strM3708r, String.valueOf(u3Var.m3712v()));
            }
        }
        c0(builder, c7436g.m13885S(str, f0.f44827s0).split("\\|"), bundle2, setUnmodifiableSet);
        m14201Z(builder, "dma", true != ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).D0() ? "0" : "1", setUnmodifiableSet);
        if (!((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).F0().isEmpty()) {
            m14201Z(builder, "dma_cps", ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).F0(), setUnmodifiableSet);
        }
        if (((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).L0()) {
            com.google.android.gms.internal.measurement.p2 p2VarM0 = ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).M0();
            if (!p2VarM0.m3586z().isEmpty()) {
                m14201Z(builder, "dl_gclid", p2VarM0.m3586z(), setUnmodifiableSet);
            }
            if (!p2VarM0.m3556B().isEmpty()) {
                m14201Z(builder, "dl_gbraid", p2VarM0.m3556B(), setUnmodifiableSet);
            }
            if (!p2VarM0.m3558D().isEmpty()) {
                m14201Z(builder, "dl_gs", p2VarM0.m3558D(), setUnmodifiableSet);
            }
            if (p2VarM0.m3560F() > 0) {
                m14201Z(builder, "dl_ss_ts", String.valueOf(p2VarM0.m3560F()), setUnmodifiableSet);
            }
            if (!p2VarM0.m3562H().isEmpty()) {
                m14201Z(builder, "mr_gclid", p2VarM0.m3562H(), setUnmodifiableSet);
            }
            if (!p2VarM0.m3564J().isEmpty()) {
                m14201Z(builder, "mr_gbraid", p2VarM0.m3564J(), setUnmodifiableSet);
            }
            if (!p2VarM0.m3566L().isEmpty()) {
                m14201Z(builder, "mr_gs", p2VarM0.m3566L(), setUnmodifiableSet);
            }
            if (p2VarM0.m3568N() > 0) {
                m14201Z(builder, "mr_click_ts", String.valueOf(p2VarM0.m3568N()), setUnmodifiableSet);
            }
        }
        return new w3(builder.build().toString(), 1, jCurrentTimeMillis);
    }

    public com.google.android.gms.internal.measurement.c3 o0(C5201l c5201l) {
        com.google.android.gms.internal.measurement.b3 b3VarM3187z = com.google.android.gms.internal.measurement.c3.m3187z();
        long j6 = c5201l.f25349c;
        b3VarM3187z.m3303b();
        ((com.google.android.gms.internal.measurement.c3) b3VarM3187z.f6231b).m3195H(j6);
        C7448s c7448s = (C7448s) c5201l.f25353g;
        Objects.requireNonNull(c7448s);
        Bundle bundle = c7448s.f35811a;
        for (String str : bundle.keySet()) {
            com.google.android.gms.internal.measurement.e3 e3VarM3244B = com.google.android.gms.internal.measurement.f3.m3244B();
            e3VarM3244B.m3241i(str);
            Object obj = bundle.get(str);
            AbstractC6840z.m13036g(obj);
            m0(e3VarM3244B, obj);
            b3VarM3187z.m3145n(e3VarM3244B);
        }
        String str2 = (String) c5201l.f25352f;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            com.google.android.gms.internal.measurement.e3 e3VarM3244B2 = com.google.android.gms.internal.measurement.f3.m3244B();
            e3VarM3244B2.m3241i("_o");
            e3VarM3244B2.m3242k(str2);
            b3VarM3187z.m3144m((com.google.android.gms.internal.measurement.f3) e3VarM3244B2.m3306e());
        }
        return (com.google.android.gms.internal.measurement.c3) b3VarM3187z.m3306e();
    }

    public String p0(com.google.android.gms.internal.measurement.i3 i3Var) {
        com.google.android.gms.internal.measurement.s2 s2VarI0;
        StringBuilder sbM4568o = AbstractC1452a.m4568o("\nbatch {\n");
        if (i3Var.m3327u()) {
            e0(sbM4568o, 0, "upload_subdomain", i3Var.m3328v());
        }
        if (i3Var.m3325s()) {
            e0(sbM4568o, 0, "sgtm_join_id", i3Var.m3326t());
        }
        for (com.google.android.gms.internal.measurement.k3 k3Var : i3Var.m3322p()) {
            if (k3Var != null) {
                m14200Y(1, sbM4568o);
                sbM4568o.append("bundle {\n");
                if (k3Var.m3450P()) {
                    e0(sbM4568o, 1, "protocol_version", Integer.valueOf(k3Var.P0()));
                }
                n1 n1Var = (n1) this.f482a;
                C7436g c7436g = n1Var.f35667d;
                q0 q0Var = n1Var.f35673k;
                if (c7436g.m13889W(k3Var.m3459p(), f0.M0) && k3Var.v0()) {
                    e0(sbM4568o, 1, "session_stitching_token", k3Var.w0());
                }
                e0(sbM4568o, 1, "platform", k3Var.h2());
                if (k3Var.m3461r()) {
                    e0(sbM4568o, 1, "gmp_version", Long.valueOf(k3Var.m3462s()));
                }
                if (k3Var.m3463t()) {
                    e0(sbM4568o, 1, "uploading_gmp_version", Long.valueOf(k3Var.m3464u()));
                }
                if (k3Var.r0()) {
                    e0(sbM4568o, 1, "dynamite_version", Long.valueOf(k3Var.s0()));
                }
                if (k3Var.m3446L()) {
                    e0(sbM4568o, 1, "config_version", Long.valueOf(k3Var.m3447M()));
                }
                e0(sbM4568o, 1, "gmp_app_id", k3Var.m3439E());
                e0(sbM4568o, 1, "app_id", k3Var.m3459p());
                e0(sbM4568o, 1, "app_version", k3Var.m3460q());
                if (k3Var.m3444J()) {
                    e0(sbM4568o, 1, "app_version_major", Integer.valueOf(k3Var.m3445K()));
                }
                e0(sbM4568o, 1, "firebase_instance_id", k3Var.m3443I());
                if (k3Var.m3469z()) {
                    e0(sbM4568o, 1, "dev_cert_hash", Long.valueOf(k3Var.m3435A()));
                }
                e0(sbM4568o, 1, "app_store", k3Var.n2());
                if (k3Var.X1()) {
                    e0(sbM4568o, 1, "upload_timestamp_millis", Long.valueOf(k3Var.Y1()));
                }
                if (k3Var.Z1()) {
                    e0(sbM4568o, 1, "start_timestamp_millis", Long.valueOf(k3Var.a2()));
                }
                if (k3Var.b2()) {
                    e0(sbM4568o, 1, "end_timestamp_millis", Long.valueOf(k3Var.c2()));
                }
                if (k3Var.d2()) {
                    e0(sbM4568o, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(k3Var.e2()));
                }
                if (k3Var.f2()) {
                    e0(sbM4568o, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(k3Var.g2()));
                }
                e0(sbM4568o, 1, "app_instance_id", k3Var.m3468y());
                e0(sbM4568o, 1, "resettable_device_id", k3Var.m3465v());
                e0(sbM4568o, 1, "ds_id", k3Var.m3449O());
                if (k3Var.m3466w()) {
                    e0(sbM4568o, 1, "limited_ad_tracking", Boolean.valueOf(k3Var.m3467x()));
                }
                e0(sbM4568o, 1, "os_version", k3Var.i2());
                e0(sbM4568o, 1, "device_model", k3Var.j2());
                e0(sbM4568o, 1, "user_default_language", k3Var.k2());
                if (k3Var.l2()) {
                    e0(sbM4568o, 1, "time_zone_offset_minutes", Integer.valueOf(k3Var.m2()));
                }
                if (k3Var.m3436B()) {
                    e0(sbM4568o, 1, "bundle_sequential_index", Integer.valueOf(k3Var.m3437C()));
                }
                if (k3Var.J0()) {
                    e0(sbM4568o, 1, "delivery_index", Integer.valueOf(k3Var.K0()));
                }
                if (k3Var.m3440F()) {
                    e0(sbM4568o, 1, "service_upload", Boolean.valueOf(k3Var.m3441G()));
                }
                e0(sbM4568o, 1, "health_monitor", k3Var.m3438D());
                if (k3Var.p0()) {
                    e0(sbM4568o, 1, "retry_counter", Integer.valueOf(k3Var.q0()));
                }
                if (k3Var.t0()) {
                    e0(sbM4568o, 1, "consent_signals", k3Var.u0());
                }
                if (k3Var.C0()) {
                    e0(sbM4568o, 1, "is_dma_region", Boolean.valueOf(k3Var.D0()));
                }
                if (k3Var.E0()) {
                    e0(sbM4568o, 1, "core_platform_services", k3Var.F0());
                }
                if (k3Var.A0()) {
                    e0(sbM4568o, 1, "consent_diagnostics", k3Var.B0());
                }
                if (k3Var.x0()) {
                    e0(sbM4568o, 1, "target_os_version", Long.valueOf(k3Var.y0()));
                }
                p8.m3595a();
                if (n1Var.f35667d.m13889W(k3Var.m3459p(), f0.P0)) {
                    e0(sbM4568o, 1, "ad_services_version", Integer.valueOf(k3Var.G0()));
                    if (k3Var.H0() && (s2VarI0 = k3Var.I0()) != null) {
                        m14200Y(2, sbM4568o);
                        sbM4568o.append("attribution_eligibility_status {\n");
                        e0(sbM4568o, 2, "eligible", Boolean.valueOf(s2VarI0.m3647p()));
                        e0(sbM4568o, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(s2VarI0.m3648q()));
                        e0(sbM4568o, 2, "pre_r", Boolean.valueOf(s2VarI0.m3649r()));
                        e0(sbM4568o, 2, "r_extensions_too_old", Boolean.valueOf(s2VarI0.m3650s()));
                        e0(sbM4568o, 2, "adservices_extension_too_old", Boolean.valueOf(s2VarI0.m3651t()));
                        e0(sbM4568o, 2, "ad_storage_not_allowed", Boolean.valueOf(s2VarI0.m3652u()));
                        e0(sbM4568o, 2, "measurement_manager_disabled", Boolean.valueOf(s2VarI0.m3653v()));
                        m14200Y(2, sbM4568o);
                        sbM4568o.append("}\n");
                    }
                }
                if (k3Var.L0()) {
                    com.google.android.gms.internal.measurement.p2 p2VarM0 = k3Var.M0();
                    m14200Y(2, sbM4568o);
                    sbM4568o.append("ad_campaign_info {\n");
                    if (p2VarM0.m3585y()) {
                        e0(sbM4568o, 2, "deep_link_gclid", p2VarM0.m3586z());
                    }
                    if (p2VarM0.m3555A()) {
                        e0(sbM4568o, 2, "deep_link_gbraid", p2VarM0.m3556B());
                    }
                    if (p2VarM0.m3557C()) {
                        e0(sbM4568o, 2, "deep_link_gad_source", p2VarM0.m3558D());
                    }
                    if (p2VarM0.m3559E()) {
                        e0(sbM4568o, 2, "deep_link_session_millis", Long.valueOf(p2VarM0.m3560F()));
                    }
                    if (p2VarM0.m3561G()) {
                        e0(sbM4568o, 2, "market_referrer_gclid", p2VarM0.m3562H());
                    }
                    if (p2VarM0.m3563I()) {
                        e0(sbM4568o, 2, "market_referrer_gbraid", p2VarM0.m3564J());
                    }
                    if (p2VarM0.m3565K()) {
                        e0(sbM4568o, 2, "market_referrer_gad_source", p2VarM0.m3566L());
                    }
                    if (p2VarM0.m3567M()) {
                        e0(sbM4568o, 2, "market_referrer_click_millis", Long.valueOf(p2VarM0.m3568N()));
                    }
                    m14200Y(2, sbM4568o);
                    sbM4568o.append("}\n");
                }
                if (k3Var.m3451Q()) {
                    e0(sbM4568o, 1, "batching_timestamp_millis", Long.valueOf(k3Var.m3452R()));
                }
                if (k3Var.N0()) {
                    com.google.android.gms.internal.measurement.s3 s3VarO0 = k3Var.O0();
                    m14200Y(2, sbM4568o);
                    sbM4568o.append("sgtm_diagnostics {\n");
                    int iM3660t = s3VarO0.m3660t();
                    e0(sbM4568o, 2, "upload_type", iM3660t != 1 ? iM3660t != 2 ? iM3660t != 3 ? iM3660t != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    e0(sbM4568o, 2, "client_upload_eligibility", s3VarO0.m3658p().name());
                    int iM3661u = s3VarO0.m3661u();
                    e0(sbM4568o, 2, "service_upload_eligibility", iM3661u != 1 ? iM3661u != 2 ? iM3661u != 3 ? iM3661u != 4 ? iM3661u != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    m14200Y(2, sbM4568o);
                    sbM4568o.append("}\n");
                }
                if (k3Var.m3453S()) {
                    com.google.android.gms.internal.measurement.y2 y2VarM3454T = k3Var.m3454T();
                    m14200Y(2, sbM4568o);
                    sbM4568o.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.x2 x2Var : y2VarM3454T.m3781p()) {
                        m14200Y(3, sbM4568o);
                        sbM4568o.append("limited_data_modes {\n");
                        int iM3767q = x2Var.m3767q();
                        e0(sbM4568o, 3, TransferTable.COLUMN_TYPE, iM3767q != 1 ? iM3767q != 2 ? iM3767q != 3 ? iM3767q != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iM3768r = x2Var.m3768r();
                        e0(sbM4568o, 3, "mode", iM3768r != 1 ? iM3768r != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        m14200Y(3, sbM4568o);
                        sbM4568o.append("}\n");
                    }
                    m14200Y(2, sbM4568o);
                    sbM4568o.append("}\n");
                }
                o5<com.google.android.gms.internal.measurement.u3> o5VarU1 = k3Var.U1();
                if (o5VarU1 != null) {
                    for (com.google.android.gms.internal.measurement.u3 u3Var : o5VarU1) {
                        if (u3Var != null) {
                            m14200Y(2, sbM4568o);
                            sbM4568o.append("user_property {\n");
                            e0(sbM4568o, 2, "set_timestamp_millis", u3Var.m3706p() ? Long.valueOf(u3Var.m3707q()) : null);
                            e0(sbM4568o, 2, IMAPStore.ID_NAME, q0Var.m14115c(u3Var.m3708r()));
                            e0(sbM4568o, 2, "string_value", u3Var.m3710t());
                            e0(sbM4568o, 2, "int_value", u3Var.m3711u() ? Long.valueOf(u3Var.m3712v()) : null);
                            e0(sbM4568o, 2, "double_value", u3Var.m3715y() ? Double.valueOf(u3Var.m3716z()) : null);
                            m14200Y(2, sbM4568o);
                            sbM4568o.append("}\n");
                        }
                    }
                }
                o5<com.google.android.gms.internal.measurement.u2> o5VarM3442H = k3Var.m3442H();
                if (o5VarM3442H != null) {
                    for (com.google.android.gms.internal.measurement.u2 u2Var : o5VarM3442H) {
                        if (u2Var != null) {
                            m14200Y(2, sbM4568o);
                            sbM4568o.append("audience_membership {\n");
                            if (u2Var.m3687p()) {
                                e0(sbM4568o, 2, "audience_id", Integer.valueOf(u2Var.m3688q()));
                            }
                            if (u2Var.m3692u()) {
                                e0(sbM4568o, 2, "new_audience", Boolean.valueOf(u2Var.m3693v()));
                            }
                            d0(sbM4568o, "current_data", u2Var.m3689r());
                            if (u2Var.m3690s()) {
                                d0(sbM4568o, "previous_data", u2Var.m3691t());
                            }
                            m14200Y(2, sbM4568o);
                            sbM4568o.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.c3> listP1 = k3Var.P1();
                if (listP1 != null) {
                    for (com.google.android.gms.internal.measurement.c3 c3Var : listP1) {
                        if (c3Var != null) {
                            m14200Y(2, sbM4568o);
                            sbM4568o.append("event {\n");
                            e0(sbM4568o, 2, IMAPStore.ID_NAME, q0Var.m14113a(c3Var.m3201s()));
                            if (c3Var.m3202t()) {
                                e0(sbM4568o, 2, "timestamp_millis", Long.valueOf(c3Var.m3203u()));
                            }
                            if (c3Var.m3204v()) {
                                e0(sbM4568o, 2, "previous_timestamp_millis", Long.valueOf(c3Var.m3205w()));
                            }
                            if (c3Var.m3206x()) {
                                e0(sbM4568o, 2, "count", Integer.valueOf(c3Var.m3207y()));
                            }
                            if (c3Var.m3199q() != 0) {
                                m14202W(sbM4568o, 2, (o5) c3Var.m3198p());
                            }
                            m14200Y(2, sbM4568o);
                            sbM4568o.append("}\n");
                        }
                    }
                }
                m14200Y(1, sbM4568o);
                sbM4568o.append("}\n");
            }
        }
        sbM4568o.append("} // End-of-batch\n");
        return sbM4568o.toString();
    }

    public String q0(com.google.android.gms.internal.measurement.w1 w1Var) {
        StringBuilder sbM4568o = AbstractC1452a.m4568o("\nproperty_filter {\n");
        if (w1Var.m3732p()) {
            e0(sbM4568o, 0, "filter_id", Integer.valueOf(w1Var.m3733q()));
        }
        e0(sbM4568o, 0, "property_name", ((n1) this.f482a).f35673k.m14115c(w1Var.m3734r()));
        String strA0 = a0(w1Var.m3736t(), w1Var.m3737u(), w1Var.m3739w());
        if (!strA0.isEmpty()) {
            e0(sbM4568o, 0, "filter_type", strA0);
        }
        m14203X(sbM4568o, 1, w1Var.m3735s());
        sbM4568o.append("}\n");
        return sbM4568o.toString();
    }

    public Parcelable r0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (SafeParcelReader$ParseException unused) {
                v0 v0Var = ((n1) this.f482a).f35669f;
                n1.m14085m(v0Var);
                v0Var.f35862f.m14140a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    public List v0(n5 n5Var, List list) {
        int i10;
        n1 n1Var = (n1) this.f482a;
        ArrayList arrayList = new ArrayList(n5Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                v0 v0Var = n1Var.f35669f;
                n1.m14085m(v0Var);
                v0Var.f35865j.m14141b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    v0 v0Var2 = n1Var.f35669f;
                    n1.m14085m(v0Var2);
                    v0Var2.f35865j.m14142c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public boolean w0(long j6, long j10) {
        if (j6 == 0 || j10 <= 0) {
            return true;
        }
        ((n1) this.f482a).f35674l.getClass();
        return Math.abs(System.currentTimeMillis() - j6) > j10;
    }

    public long x0(byte[] bArr) throws NoSuchAlgorithmException {
        AbstractC6840z.m13036g(bArr);
        n1 n1Var = (n1) this.f482a;
        l4 l4Var = n1Var.f35672j;
        n1.m14083i(l4Var);
        l4Var.mo325M();
        MessageDigest messageDigestD0 = l4.d0();
        if (messageDigestD0 != null) {
            return l4.e0(messageDigestD0.digest(bArr));
        }
        v0 v0Var = n1Var.f35669f;
        n1.m14085m(v0Var);
        v0Var.f35862f.m14140a("Failed to get MD5");
        return 0L;
    }

    public byte[] y0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14141b(e2, "Failed to gzip content");
            throw e2;
        }
    }

    private final void h0() {
    }

    private final void i0() {
    }

    private final void j0() {
    }
}
