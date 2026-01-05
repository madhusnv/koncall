package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.bh3;
import p001o.ch3;
import p001o.dh3;
import p001o.e9g;
import p001o.ep0;
import p001o.fp0;
import p001o.gp0;
import p001o.id5;
import p001o.kh3;
import p001o.ph2;
import p001o.sq8;
import p001o.vg3;

/* renamed from: androidx.navigation.n */
/* loaded from: classes2.dex */
public abstract class AbstractC2347n {

    /* renamed from: c */
    public static final q f9673c = new q(null);

    /* renamed from: d */
    public static final AbstractC2347n f9674d = new i();

    /* renamed from: e */
    public static final AbstractC2347n f9675e = new m();

    /* renamed from: f */
    public static final AbstractC2347n f9676f = new g();

    /* renamed from: g */
    public static final AbstractC2347n f9677g = new h();

    /* renamed from: h */
    public static final AbstractC2347n f9678h = new l();

    /* renamed from: i */
    public static final AbstractC2347n f9679i = new j();

    /* renamed from: j */
    public static final AbstractC2347n f9680j = new k();

    /* renamed from: k */
    public static final AbstractC2347n f9681k = new f();

    /* renamed from: l */
    public static final AbstractC2347n f9682l = new d();

    /* renamed from: m */
    public static final AbstractC2347n f9683m = new e();

    /* renamed from: n */
    public static final AbstractC2347n f9684n = new c();

    /* renamed from: o */
    public static final AbstractC2347n f9685o = new a();

    /* renamed from: p */
    public static final AbstractC2347n f9686p = new b();

    /* renamed from: q */
    public static final AbstractC2347n f9687q = new p();

    /* renamed from: r */
    public static final AbstractC2347n f9688r = new n();

    /* renamed from: s */
    public static final AbstractC2347n f9689s = new o();

    /* renamed from: a */
    public final boolean f9690a;

    /* renamed from: b */
    public final String f9691b = "nav_type";

    /* renamed from: androidx.navigation.n$a */
    public static final class a extends vg3 {
        public a() {
            super(true);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "boolean[]";
        }

        @Override // p001o.vg3
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean[] mo8842k() {
            return new boolean[0];
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean[] mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return (boolean[]) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean[] mo8937l(String str) {
            sq8.m48649h(str, "value");
            return new boolean[]{((Boolean) AbstractC2347n.f9684n.mo8937l(str)).booleanValue()};
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean[] mo8838g(String str, boolean[] zArr) {
            boolean[] zArrM27247E;
            sq8.m48649h(str, "value");
            return (zArr == null || (zArrM27247E = fp0.m27247E(zArr, mo8837f(str))) == null) ? mo8837f(str) : zArrM27247E;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo8839h(Bundle bundle, String str, boolean[] zArr) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putBooleanArray(str, zArr);
        }

        @Override // p001o.vg3
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List mo8843l(boolean[] zArr) {
            List listE0;
            if (zArr == null || (listE0 = gp0.E0(zArr)) == null) {
                return ch3.m21246k();
            }
            ArrayList arrayList = new ArrayList(dh3.m23088v(listE0, 10));
            Iterator it = listE0.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean mo8841j(boolean[] zArr, boolean[] zArr2) {
            return ep0.m25405c(zArr != null ? fp0.m27251I(zArr) : null, zArr2 != null ? fp0.m27251I(zArr2) : null);
        }
    }

    /* renamed from: androidx.navigation.n$b */
    public static final class b extends vg3 {
        public b() {
            super(true);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "List<Boolean>";
        }

        @Override // p001o.vg3
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List mo8842k() {
            return ch3.m21246k();
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            boolean[] zArr = (boolean[]) bundle.get(str);
            if (zArr != null) {
                return gp0.E0(zArr);
            }
            return null;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List mo8937l(String str) {
            sq8.m48649h(str, "value");
            return bh3.m18963e(AbstractC2347n.f9684n.mo8937l(str));
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List mo8838g(String str, List list) {
            List listX0;
            sq8.m48649h(str, "value");
            return (list == null || (listX0 = kh3.x0(list, mo8837f(str))) == null) ? mo8837f(str) : listX0;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo8839h(Bundle bundle, String str, List list) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putBooleanArray(str, list != null ? kh3.K0(list) : null);
        }

        @Override // p001o.vg3
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List mo8843l(List list) {
            if (list == null) {
                return ch3.m21246k();
            }
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean mo8841j(List list, List list2) {
            return ep0.m25405c(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
        }
    }

    /* renamed from: androidx.navigation.n$c */
    public static final class c extends AbstractC2347n {
        public c() {
            super(false);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "boolean";
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: h */
        public /* bridge */ /* synthetic */ void mo8839h(Bundle bundle, String str, Object obj) {
            m8860m(bundle, str, ((Boolean) obj).booleanValue());
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return (Boolean) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Boolean mo8937l(String str) {
            boolean z;
            sq8.m48649h(str, "value");
            if (sq8.m48644c(str, "true")) {
                z = true;
            } else {
                if (!sq8.m48644c(str, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: m */
        public void m8860m(Bundle bundle, String str, boolean z) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putBoolean(str, z);
        }
    }

    /* renamed from: androidx.navigation.n$d */
    public static final class d extends vg3 {
        public d() {
            super(true);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "float[]";
        }

        @Override // p001o.vg3
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public float[] mo8842k() {
            return new float[0];
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public float[] mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return (float[]) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public float[] mo8937l(String str) {
            sq8.m48649h(str, "value");
            return new float[]{((Number) AbstractC2347n.f9681k.mo8937l(str)).floatValue()};
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public float[] mo8838g(String str, float[] fArr) {
            float[] fArrM27275x;
            sq8.m48649h(str, "value");
            return (fArr == null || (fArrM27275x = fp0.m27275x(fArr, mo8837f(str))) == null) ? mo8837f(str) : fArrM27275x;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo8839h(Bundle bundle, String str, float[] fArr) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putFloatArray(str, fArr);
        }

        @Override // p001o.vg3
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List mo8843l(float[] fArr) {
            List listA0;
            if (fArr == null || (listA0 = gp0.A0(fArr)) == null) {
                return ch3.m21246k();
            }
            ArrayList arrayList = new ArrayList(dh3.m23088v(listA0, 10));
            Iterator it = listA0.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean mo8841j(float[] fArr, float[] fArr2) {
            return ep0.m25405c(fArr != null ? fp0.m27252J(fArr) : null, fArr2 != null ? fp0.m27252J(fArr2) : null);
        }
    }

    /* renamed from: androidx.navigation.n$e */
    public static final class e extends vg3 {
        public e() {
            super(true);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "List<Float>";
        }

        @Override // p001o.vg3
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List mo8842k() {
            return ch3.m21246k();
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            float[] fArr = (float[]) bundle.get(str);
            if (fArr != null) {
                return gp0.A0(fArr);
            }
            return null;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List mo8937l(String str) {
            sq8.m48649h(str, "value");
            return bh3.m18963e(AbstractC2347n.f9681k.mo8937l(str));
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List mo8838g(String str, List list) {
            List listX0;
            sq8.m48649h(str, "value");
            return (list == null || (listX0 = kh3.x0(list, mo8837f(str))) == null) ? mo8837f(str) : listX0;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo8839h(Bundle bundle, String str, List list) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putFloatArray(str, list != null ? kh3.N0(list) : null);
        }

        @Override // p001o.vg3
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List mo8843l(List list) {
            if (list == null) {
                return ch3.m21246k();
            }
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean mo8841j(List list, List list2) {
            return ep0.m25405c(list != null ? (Float[]) list.toArray(new Float[0]) : null, list2 != null ? (Float[]) list2.toArray(new Float[0]) : null);
        }
    }

    /* renamed from: androidx.navigation.n$f */
    public static final class f extends AbstractC2347n {
        public f() {
            super(false);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "float";
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: h */
        public /* bridge */ /* synthetic */ void mo8839h(Bundle bundle, String str, Object obj) {
            m8877m(bundle, str, ((Number) obj).floatValue());
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            Object obj = bundle.get(str);
            sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Float mo8937l(String str) {
            sq8.m48649h(str, "value");
            return Float.valueOf(Float.parseFloat(str));
        }

        /* renamed from: m */
        public void m8877m(Bundle bundle, String str, float f) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putFloat(str, f);
        }
    }

    /* renamed from: androidx.navigation.n$g */
    public static final class g extends vg3 {
        public g() {
            super(true);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "integer[]";
        }

        @Override // p001o.vg3
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public int[] mo8842k() {
            return new int[0];
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public int[] mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return (int[]) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int[] mo8937l(String str) {
            sq8.m48649h(str, "value");
            return new int[]{((Number) AbstractC2347n.f9674d.mo8937l(str)).intValue()};
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public int[] mo8838g(String str, int[] iArr) {
            int[] iArrM27277z;
            sq8.m48649h(str, "value");
            return (iArr == null || (iArrM27277z = fp0.m27277z(iArr, mo8837f(str))) == null) ? mo8837f(str) : iArrM27277z;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo8839h(Bundle bundle, String str, int[] iArr) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putIntArray(str, iArr);
        }

        @Override // p001o.vg3
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List mo8843l(int[] iArr) {
            List listB0;
            if (iArr == null || (listB0 = gp0.B0(iArr)) == null) {
                return ch3.m21246k();
            }
            ArrayList arrayList = new ArrayList(dh3.m23088v(listB0, 10));
            Iterator it = listB0.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean mo8841j(int[] iArr, int[] iArr2) {
            return ep0.m25405c(iArr != null ? fp0.m27253K(iArr) : null, iArr2 != null ? fp0.m27253K(iArr2) : null);
        }
    }

    /* renamed from: androidx.navigation.n$h */
    public static final class h extends vg3 {
        public h() {
            super(true);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "List<Int>";
        }

        @Override // p001o.vg3
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List mo8842k() {
            return ch3.m21246k();
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            int[] iArr = (int[]) bundle.get(str);
            if (iArr != null) {
                return gp0.B0(iArr);
            }
            return null;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List mo8937l(String str) {
            sq8.m48649h(str, "value");
            return bh3.m18963e(AbstractC2347n.f9674d.mo8937l(str));
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List mo8838g(String str, List list) {
            List listX0;
            sq8.m48649h(str, "value");
            return (list == null || (listX0 = kh3.x0(list, mo8837f(str))) == null) ? mo8837f(str) : listX0;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo8839h(Bundle bundle, String str, List list) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putIntArray(str, list != null ? kh3.P0(list) : null);
        }

        @Override // p001o.vg3
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List mo8843l(List list) {
            if (list == null) {
                return ch3.m21246k();
            }
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean mo8841j(List list, List list2) {
            return ep0.m25405c(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
        }
    }

    /* renamed from: androidx.navigation.n$i */
    public static final class i extends AbstractC2347n {
        public i() {
            super(false);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "integer";
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: h */
        public /* bridge */ /* synthetic */ void mo8839h(Bundle bundle, String str, Object obj) {
            m8894m(bundle, str, ((Number) obj).intValue());
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            Object obj = bundle.get(str);
            sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer mo8937l(String str) throws NumberFormatException {
            int i;
            sq8.m48649h(str, "value");
            if (e9g.m24597K(str, "0x", false, 2, null)) {
                String strSubstring = str.substring(2);
                sq8.m48648g(strSubstring, "substring(...)");
                i = Integer.parseInt(strSubstring, ph2.m43651a(16));
            } else {
                i = Integer.parseInt(str);
            }
            return Integer.valueOf(i);
        }

        /* renamed from: m */
        public void m8894m(Bundle bundle, String str, int i) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putInt(str, i);
        }
    }

    /* renamed from: androidx.navigation.n$j */
    public static final class j extends vg3 {
        public j() {
            super(true);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "long[]";
        }

        @Override // p001o.vg3
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public long[] mo8842k() {
            return new long[0];
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public long[] mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return (long[]) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public long[] mo8937l(String str) {
            sq8.m48649h(str, "value");
            return new long[]{((Number) AbstractC2347n.f9678h.mo8937l(str)).longValue()};
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public long[] mo8838g(String str, long[] jArr) {
            long[] jArrM27243A;
            sq8.m48649h(str, "value");
            return (jArr == null || (jArrM27243A = fp0.m27243A(jArr, mo8837f(str))) == null) ? mo8837f(str) : jArrM27243A;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo8839h(Bundle bundle, String str, long[] jArr) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putLongArray(str, jArr);
        }

        @Override // p001o.vg3
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List mo8843l(long[] jArr) {
            List listC0;
            if (jArr == null || (listC0 = gp0.C0(jArr)) == null) {
                return ch3.m21246k();
            }
            ArrayList arrayList = new ArrayList(dh3.m23088v(listC0, 10));
            Iterator it = listC0.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean mo8841j(long[] jArr, long[] jArr2) {
            return ep0.m25405c(jArr != null ? fp0.m27254L(jArr) : null, jArr2 != null ? fp0.m27254L(jArr2) : null);
        }
    }

    /* renamed from: androidx.navigation.n$k */
    public static final class k extends vg3 {
        public k() {
            super(true);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "List<Long>";
        }

        @Override // p001o.vg3
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List mo8842k() {
            return ch3.m21246k();
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            long[] jArr = (long[]) bundle.get(str);
            if (jArr != null) {
                return gp0.C0(jArr);
            }
            return null;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List mo8937l(String str) {
            sq8.m48649h(str, "value");
            return bh3.m18963e(AbstractC2347n.f9678h.mo8937l(str));
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List mo8838g(String str, List list) {
            List listX0;
            sq8.m48649h(str, "value");
            return (list == null || (listX0 = kh3.x0(list, mo8837f(str))) == null) ? mo8837f(str) : listX0;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo8839h(Bundle bundle, String str, List list) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putLongArray(str, list != null ? kh3.R0(list) : null);
        }

        @Override // p001o.vg3
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List mo8843l(List list) {
            if (list == null) {
                return ch3.m21246k();
            }
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean mo8841j(List list, List list2) {
            return ep0.m25405c(list != null ? (Long[]) list.toArray(new Long[0]) : null, list2 != null ? (Long[]) list2.toArray(new Long[0]) : null);
        }
    }

    /* renamed from: androidx.navigation.n$l */
    public static final class l extends AbstractC2347n {
        public l() {
            super(false);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "long";
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: h */
        public /* bridge */ /* synthetic */ void mo8839h(Bundle bundle, String str, Object obj) {
            m8911m(bundle, str, ((Number) obj).longValue());
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Long mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            Object obj = bundle.get(str);
            sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Long mo8937l(String str) throws NumberFormatException {
            String strSubstring;
            long j;
            sq8.m48649h(str, "value");
            if (e9g.m24605w(str, "L", false, 2, null)) {
                strSubstring = str.substring(0, str.length() - 1);
                sq8.m48648g(strSubstring, "substring(...)");
            } else {
                strSubstring = str;
            }
            if (e9g.m24597K(str, "0x", false, 2, null)) {
                String strSubstring2 = strSubstring.substring(2);
                sq8.m48648g(strSubstring2, "substring(...)");
                j = Long.parseLong(strSubstring2, ph2.m43651a(16));
            } else {
                j = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j);
        }

        /* renamed from: m */
        public void m8911m(Bundle bundle, String str, long j) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putLong(str, j);
        }
    }

    /* renamed from: androidx.navigation.n$m */
    public static final class m extends AbstractC2347n {
        public m() {
            super(false);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "reference";
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: h */
        public /* bridge */ /* synthetic */ void mo8839h(Bundle bundle, String str, Object obj) {
            m8914m(bundle, str, ((Number) obj).intValue());
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            Object obj = bundle.get(str);
            sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer mo8937l(String str) throws NumberFormatException {
            int i;
            sq8.m48649h(str, "value");
            if (e9g.m24597K(str, "0x", false, 2, null)) {
                String strSubstring = str.substring(2);
                sq8.m48648g(strSubstring, "substring(...)");
                i = Integer.parseInt(strSubstring, ph2.m43651a(16));
            } else {
                i = Integer.parseInt(str);
            }
            return Integer.valueOf(i);
        }

        /* renamed from: m */
        public void m8914m(Bundle bundle, String str, int i) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putInt(str, i);
        }
    }

    /* renamed from: androidx.navigation.n$n */
    public static final class n extends vg3 {
        public n() {
            super(true);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "string[]";
        }

        @Override // p001o.vg3
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public String[] mo8842k() {
            return new String[0];
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public String[] mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return (String[]) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public String[] mo8937l(String str) {
            sq8.m48649h(str, "value");
            return new String[]{str};
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public String[] mo8838g(String str, String[] strArr) {
            String[] strArr2;
            sq8.m48649h(str, "value");
            return (strArr == null || (strArr2 = (String[]) fp0.m27246D(strArr, mo8837f(str))) == null) ? mo8837f(str) : strArr2;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo8839h(Bundle bundle, String str, String[] strArr) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putStringArray(str, strArr);
        }

        @Override // p001o.vg3
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List mo8843l(String[] strArr) {
            if (strArr == null) {
                return ch3.m21246k();
            }
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(Uri.encode(str));
            }
            return arrayList;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean mo8841j(String[] strArr, String[] strArr2) {
            return ep0.m25405c(strArr, strArr2);
        }
    }

    /* renamed from: androidx.navigation.n$o */
    public static final class o extends vg3 {
        public o() {
            super(true);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "List<String>";
        }

        @Override // p001o.vg3
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public List mo8842k() {
            return ch3.m21246k();
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            String[] strArr = (String[]) bundle.get(str);
            if (strArr != null) {
                return gp0.D0(strArr);
            }
            return null;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public List mo8937l(String str) {
            sq8.m48649h(str, "value");
            return bh3.m18963e(str);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public List mo8838g(String str, List list) {
            List listX0;
            sq8.m48649h(str, "value");
            return (list == null || (listX0 = kh3.x0(list, mo8837f(str))) == null) ? mo8837f(str) : listX0;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo8839h(Bundle bundle, String str, List list) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putStringArray(str, list != null ? (String[]) list.toArray(new String[0]) : null);
        }

        @Override // p001o.vg3
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List mo8843l(List list) {
            if (list == null) {
                return ch3.m21246k();
            }
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.encode((String) it.next()));
            }
            return arrayList;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean mo8841j(List list, List list2) {
            return ep0.m25405c(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
        }
    }

    /* renamed from: androidx.navigation.n$p */
    public static final class p extends AbstractC2347n {
        public p() {
            super(true);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            return "string";
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public String mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return (String) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public String mo8937l(String str) {
            sq8.m48649h(str, "value");
            if (sq8.m48644c(str, "null")) {
                return null;
            }
            return str;
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo8839h(Bundle bundle, String str, String str2) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            bundle.putString(str, str2);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public String mo8840i(String str) {
            String strEncode = str != null ? Uri.encode(str) : null;
            return strEncode == null ? "null" : strEncode;
        }
    }

    /* renamed from: androidx.navigation.n$q */
    public static final class q {
        public q() {
        }

        public /* synthetic */ q(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public AbstractC2347n m8933a(String str, String str2) throws ClassNotFoundException {
            String strSubstring;
            AbstractC2347n abstractC2347n = AbstractC2347n.f9674d;
            if (sq8.m48644c(abstractC2347n.mo8833b(), str)) {
                return abstractC2347n;
            }
            AbstractC2347n abstractC2347n2 = AbstractC2347n.f9676f;
            if (sq8.m48644c(abstractC2347n2.mo8833b(), str)) {
                return abstractC2347n2;
            }
            AbstractC2347n abstractC2347n3 = AbstractC2347n.f9677g;
            if (sq8.m48644c(abstractC2347n3.mo8833b(), str)) {
                return abstractC2347n3;
            }
            AbstractC2347n abstractC2347n4 = AbstractC2347n.f9678h;
            if (sq8.m48644c(abstractC2347n4.mo8833b(), str)) {
                return abstractC2347n4;
            }
            AbstractC2347n abstractC2347n5 = AbstractC2347n.f9679i;
            if (sq8.m48644c(abstractC2347n5.mo8833b(), str)) {
                return abstractC2347n5;
            }
            AbstractC2347n abstractC2347n6 = AbstractC2347n.f9680j;
            if (sq8.m48644c(abstractC2347n6.mo8833b(), str)) {
                return abstractC2347n6;
            }
            AbstractC2347n abstractC2347n7 = AbstractC2347n.f9684n;
            if (sq8.m48644c(abstractC2347n7.mo8833b(), str)) {
                return abstractC2347n7;
            }
            AbstractC2347n abstractC2347n8 = AbstractC2347n.f9685o;
            if (sq8.m48644c(abstractC2347n8.mo8833b(), str)) {
                return abstractC2347n8;
            }
            AbstractC2347n abstractC2347n9 = AbstractC2347n.f9686p;
            if (sq8.m48644c(abstractC2347n9.mo8833b(), str)) {
                return abstractC2347n9;
            }
            AbstractC2347n abstractC2347n10 = AbstractC2347n.f9687q;
            if (sq8.m48644c(abstractC2347n10.mo8833b(), str)) {
                return abstractC2347n10;
            }
            AbstractC2347n abstractC2347n11 = AbstractC2347n.f9688r;
            if (sq8.m48644c(abstractC2347n11.mo8833b(), str)) {
                return abstractC2347n11;
            }
            AbstractC2347n abstractC2347n12 = AbstractC2347n.f9689s;
            if (sq8.m48644c(abstractC2347n12.mo8833b(), str)) {
                return abstractC2347n12;
            }
            AbstractC2347n abstractC2347n13 = AbstractC2347n.f9681k;
            if (sq8.m48644c(abstractC2347n13.mo8833b(), str)) {
                return abstractC2347n13;
            }
            AbstractC2347n abstractC2347n14 = AbstractC2347n.f9682l;
            if (sq8.m48644c(abstractC2347n14.mo8833b(), str)) {
                return abstractC2347n14;
            }
            AbstractC2347n abstractC2347n15 = AbstractC2347n.f9683m;
            if (sq8.m48644c(abstractC2347n15.mo8833b(), str)) {
                return abstractC2347n15;
            }
            AbstractC2347n abstractC2347n16 = AbstractC2347n.f9675e;
            if (sq8.m48644c(abstractC2347n16.mo8833b(), str)) {
                return abstractC2347n16;
            }
            if (str == null || str.length() == 0) {
                return abstractC2347n10;
            }
            try {
                if (!e9g.m24597K(str, ".", false, 2, null) || str2 == null) {
                    strSubstring = str;
                } else {
                    strSubstring = str2 + str;
                }
                boolean zM24605w = e9g.m24605w(str, "[]", false, 2, null);
                if (zM24605w) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    sq8.m48648g(strSubstring, "substring(...)");
                }
                Class<?> cls = Class.forName(strSubstring);
                sq8.m48648g(cls, "clazz");
                AbstractC2347n abstractC2347nM8936d = m8936d(cls, zM24605w);
                if (abstractC2347nM8936d != null) {
                    return abstractC2347nM8936d;
                }
                throw new IllegalArgumentException((strSubstring + " is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: b */
        public final AbstractC2347n m8934b(String str) {
            sq8.m48649h(str, "value");
            try {
                try {
                    try {
                        try {
                            AbstractC2347n abstractC2347n = AbstractC2347n.f9674d;
                            abstractC2347n.mo8937l(str);
                            sq8.m48647f(abstractC2347n, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return abstractC2347n;
                        } catch (IllegalArgumentException unused) {
                            AbstractC2347n abstractC2347n2 = AbstractC2347n.f9684n;
                            abstractC2347n2.mo8937l(str);
                            sq8.m48647f(abstractC2347n2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return abstractC2347n2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        AbstractC2347n abstractC2347n3 = AbstractC2347n.f9678h;
                        abstractC2347n3.mo8937l(str);
                        sq8.m48647f(abstractC2347n3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return abstractC2347n3;
                    }
                } catch (IllegalArgumentException unused3) {
                    AbstractC2347n abstractC2347n4 = AbstractC2347n.f9687q;
                    sq8.m48647f(abstractC2347n4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return abstractC2347n4;
                }
            } catch (IllegalArgumentException unused4) {
                AbstractC2347n abstractC2347n5 = AbstractC2347n.f9681k;
                abstractC2347n5.mo8937l(str);
                sq8.m48647f(abstractC2347n5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return abstractC2347n5;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AbstractC2347n m8935c(Object obj) {
            AbstractC2347n vVar;
            if (obj instanceof Integer) {
                AbstractC2347n abstractC2347n = AbstractC2347n.f9674d;
                sq8.m48647f(abstractC2347n, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return abstractC2347n;
            }
            if (obj instanceof int[]) {
                AbstractC2347n abstractC2347n2 = AbstractC2347n.f9676f;
                sq8.m48647f(abstractC2347n2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return abstractC2347n2;
            }
            if (obj instanceof Long) {
                AbstractC2347n abstractC2347n3 = AbstractC2347n.f9678h;
                sq8.m48647f(abstractC2347n3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return abstractC2347n3;
            }
            if (obj instanceof long[]) {
                AbstractC2347n abstractC2347n4 = AbstractC2347n.f9679i;
                sq8.m48647f(abstractC2347n4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return abstractC2347n4;
            }
            if (obj instanceof Float) {
                AbstractC2347n abstractC2347n5 = AbstractC2347n.f9681k;
                sq8.m48647f(abstractC2347n5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return abstractC2347n5;
            }
            if (obj instanceof float[]) {
                AbstractC2347n abstractC2347n6 = AbstractC2347n.f9682l;
                sq8.m48647f(abstractC2347n6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return abstractC2347n6;
            }
            if (obj instanceof Boolean) {
                AbstractC2347n abstractC2347n7 = AbstractC2347n.f9684n;
                sq8.m48647f(abstractC2347n7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return abstractC2347n7;
            }
            if (obj instanceof boolean[]) {
                AbstractC2347n abstractC2347n8 = AbstractC2347n.f9685o;
                sq8.m48647f(abstractC2347n8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return abstractC2347n8;
            }
            if ((obj instanceof String) || obj == null) {
                AbstractC2347n abstractC2347n9 = AbstractC2347n.f9687q;
                sq8.m48647f(abstractC2347n9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return abstractC2347n9;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                AbstractC2347n abstractC2347n10 = AbstractC2347n.f9688r;
                sq8.m48647f(abstractC2347n10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return abstractC2347n10;
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                sq8.m48646e(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    sq8.m48647f(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    vVar = new s(componentType2);
                } else if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    sq8.m48646e(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        sq8.m48647f(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        vVar = new u(componentType4);
                    } else if (obj instanceof Parcelable) {
                        vVar = new t(obj.getClass());
                    } else if (obj instanceof Enum) {
                        vVar = new r(obj.getClass());
                    } else {
                        if (!(obj instanceof Serializable)) {
                            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        vVar = new v(obj.getClass());
                    }
                }
            }
            return vVar;
        }

        /* renamed from: d */
        public final AbstractC2347n m8936d(Class cls, boolean z) {
            sq8.m48649h(cls, "clazz");
            if (Parcelable.class.isAssignableFrom(cls)) {
                return z ? new s(cls) : new t(cls);
            }
            if (Enum.class.isAssignableFrom(cls) && !z) {
                return new r(cls);
            }
            if (Serializable.class.isAssignableFrom(cls)) {
                return z ? new u(cls) : new v(cls);
            }
            return null;
        }
    }

    /* renamed from: androidx.navigation.n$r */
    public static final class r extends v {

        /* renamed from: u */
        public final Class f9692u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Class cls) {
            super(false, cls);
            sq8.m48649h(cls, "type");
            if (cls.isEnum()) {
                this.f9692u = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.AbstractC2347n.v, androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            String name = this.f9692u.getName();
            sq8.m48648g(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.AbstractC2347n.v
        /* renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Enum mo8937l(String str) {
            Object obj;
            sq8.m48649h(str, "value");
            Object[] enumConstants = this.f9692u.getEnumConstants();
            sq8.m48648g(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    obj = null;
                    break;
                }
                obj = enumConstants[i];
                if (e9g.m24606x(((Enum) obj).name(), str, true)) {
                    break;
                }
                i++;
            }
            Enum r3 = (Enum) obj;
            if (r3 != null) {
                return r3;
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f9692u.getName() + '.');
        }
    }

    /* renamed from: androidx.navigation.n$s */
    public static final class s extends AbstractC2347n {

        /* renamed from: t */
        public final Class f9693t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Class cls) throws ClassNotFoundException {
            super(true);
            sq8.m48649h(cls, "type");
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
            try {
                Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
                sq8.m48647f(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.f9693t = cls2;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            String name = this.f9693t.getName();
            sq8.m48648g(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !sq8.m48644c(s.class, obj.getClass())) {
                return false;
            }
            return sq8.m48644c(this.f9693t, ((s) obj).f9693t);
        }

        public int hashCode() {
            return this.f9693t.hashCode();
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Parcelable[] mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return (Parcelable[]) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Parcelable[] mo8937l(String str) {
            sq8.m48649h(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo8839h(Bundle bundle, String str, Parcelable[] parcelableArr) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            this.f9693t.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean mo8841j(Parcelable[] parcelableArr, Parcelable[] parcelableArr2) {
            return ep0.m25405c(parcelableArr, parcelableArr2);
        }
    }

    /* renamed from: androidx.navigation.n$t */
    public static final class t extends AbstractC2347n {

        /* renamed from: t */
        public final Class f9694t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Class cls) {
            super(true);
            sq8.m48649h(cls, "type");
            boolean z = true;
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                z = false;
            }
            if (z) {
                this.f9694t = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: a */
        public Object mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            String name = this.f9694t.getName();
            sq8.m48648g(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !sq8.m48644c(t.class, obj.getClass())) {
                return false;
            }
            return sq8.m48644c(this.f9694t, ((t) obj).f9694t);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: f */
        public Object mo8937l(String str) {
            sq8.m48649h(str, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: h */
        public void mo8839h(Bundle bundle, String str, Object obj) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            this.f9694t.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }

        public int hashCode() {
            return this.f9694t.hashCode();
        }
    }

    /* renamed from: androidx.navigation.n$u */
    public static final class u extends AbstractC2347n {

        /* renamed from: t */
        public final Class f9695t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Class cls) throws ClassNotFoundException {
            super(true);
            sq8.m48649h(cls, "type");
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            try {
                Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
                sq8.m48647f(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.f9695t = cls2;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            String name = this.f9695t.getName();
            sq8.m48648g(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !sq8.m48644c(u.class, obj.getClass())) {
                return false;
            }
            return sq8.m48644c(this.f9695t, ((u) obj).f9695t);
        }

        public int hashCode() {
            return this.f9695t.hashCode();
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Serializable[] mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return (Serializable[]) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Serializable[] mo8937l(String str) {
            sq8.m48649h(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo8839h(Bundle bundle, String str, Serializable[] serializableArr) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            this.f9695t.cast(serializableArr);
            bundle.putSerializable(str, serializableArr);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean mo8841j(Serializable[] serializableArr, Serializable[] serializableArr2) {
            return ep0.m25405c(serializableArr, serializableArr2);
        }
    }

    public AbstractC2347n(boolean z) {
        this.f9690a = z;
    }

    /* renamed from: a */
    public abstract Object mo8832a(Bundle bundle, String str);

    /* renamed from: b */
    public abstract String mo8833b();

    /* renamed from: c */
    public boolean m8834c() {
        return this.f9690a;
    }

    /* renamed from: d */
    public final Object m8835d(Bundle bundle, String str, String str2) {
        sq8.m48649h(bundle, "bundle");
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "value");
        Object objMo8937l = mo8937l(str2);
        mo8839h(bundle, str, objMo8937l);
        return objMo8937l;
    }

    /* renamed from: e */
    public final Object m8836e(Bundle bundle, String str, String str2, Object obj) {
        sq8.m48649h(bundle, "bundle");
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if (str2 == null) {
            return obj;
        }
        Object objMo8838g = mo8838g(str2, obj);
        mo8839h(bundle, str, objMo8838g);
        return objMo8838g;
    }

    /* renamed from: f */
    public abstract Object mo8937l(String str);

    /* renamed from: g */
    public Object mo8838g(String str, Object obj) {
        sq8.m48649h(str, "value");
        return mo8937l(str);
    }

    /* renamed from: h */
    public abstract void mo8839h(Bundle bundle, String str, Object obj);

    /* renamed from: i */
    public String mo8840i(Object obj) {
        return String.valueOf(obj);
    }

    /* renamed from: j */
    public boolean mo8841j(Object obj, Object obj2) {
        return sq8.m48644c(obj, obj2);
    }

    public String toString() {
        return mo8833b();
    }

    /* renamed from: androidx.navigation.n$v */
    public static class v extends AbstractC2347n {

        /* renamed from: t */
        public final Class f9696t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Class cls) {
            super(true);
            sq8.m48649h(cls, "type");
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            if (true ^ cls.isEnum()) {
                this.f9696t = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: b */
        public String mo8833b() {
            String name = this.f9696t.getName();
            sq8.m48648g(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof v) {
                return sq8.m48644c(this.f9696t, ((v) obj).f9696t);
            }
            return false;
        }

        public int hashCode() {
            return this.f9696t.hashCode();
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Serializable mo8832a(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            return (Serializable) bundle.get(str);
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: l */
        public Serializable mo8937l(String str) {
            sq8.m48649h(str, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.AbstractC2347n
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo8839h(Bundle bundle, String str, Serializable serializable) {
            sq8.m48649h(bundle, "bundle");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(serializable, "value");
            this.f9696t.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(boolean z, Class cls) {
            super(z);
            sq8.m48649h(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f9696t = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
