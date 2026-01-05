package p001o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p001o.cd4;

/* loaded from: classes2.dex */
public final class jyh {

    /* renamed from: a */
    public final String f31263a;

    /* renamed from: b */
    public final String f31264b;

    /* renamed from: c */
    public final boolean f31265c;

    /* renamed from: d */
    public final long f31266d;

    /* renamed from: e */
    public final long f31267e;

    /* renamed from: f */
    public final nyh f31268f;

    /* renamed from: g */
    public final String[] f31269g;

    /* renamed from: h */
    public final String f31270h;

    /* renamed from: i */
    public final String f31271i;

    /* renamed from: j */
    public final jyh f31272j;

    /* renamed from: k */
    public final HashMap f31273k;

    /* renamed from: l */
    public final HashMap f31274l;

    /* renamed from: m */
    public List f31275m;

    public jyh(String str, String str2, long j, long j2, nyh nyhVar, String[] strArr, String str3, String str4, jyh jyhVar) {
        this.f31263a = str;
        this.f31264b = str2;
        this.f31271i = str4;
        this.f31268f = nyhVar;
        this.f31269g = strArr;
        this.f31265c = str2 != null;
        this.f31266d = j;
        this.f31267e = j2;
        this.f31270h = (String) op0.m42515e(str3);
        this.f31272j = jyhVar;
        this.f31273k = new HashMap();
        this.f31274l = new HashMap();
    }

    /* renamed from: c */
    public static jyh m34723c(String str, long j, long j2, nyh nyhVar, String[] strArr, String str2, String str3, jyh jyhVar) {
        return new jyh(str, null, j, j2, nyhVar, strArr, str2, str3, jyhVar);
    }

    /* renamed from: d */
    public static jyh m34724d(String str) {
        return new jyh(null, myh.m39871b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: e */
    public static void m34725e(SpannableStringBuilder spannableStringBuilder) {
        for (jl5 jl5Var : (jl5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), jl5.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(jl5Var), spannableStringBuilder.getSpanEnd(jl5Var), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    /* renamed from: k */
    public static SpannableStringBuilder m34726k(String str, Map map) {
        if (!map.containsKey(str)) {
            cd4.C12641b c12641b = new cd4.C12641b();
            c12641b.m20933o(new SpannableStringBuilder());
            map.put(str, c12641b);
        }
        return (SpannableStringBuilder) op0.m42515e(((cd4.C12641b) map.get(str)).m20923e());
    }

    /* renamed from: a */
    public void m34727a(jyh jyhVar) {
        if (this.f31275m == null) {
            this.f31275m = new ArrayList();
        }
        this.f31275m.add(jyhVar);
    }

    /* renamed from: b */
    public final void m34728b(Map map, cd4.C12641b c12641b, int i, int i2, int i3) {
        nyh nyhVarM39875f = myh.m39875f(this.f31268f, this.f31269g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c12641b.m20923e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c12641b.m20933o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (nyhVarM39875f != null) {
            myh.m39870a(spannableStringBuilder2, i, i2, nyhVarM39875f, this.f31272j, map, i3);
            if (NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON.equals(this.f31263a)) {
                if (nyhVarM39875f.m41251k() != Float.MAX_VALUE) {
                    c12641b.m20931m((nyhVarM39875f.m41251k() * (-90.0f)) / 100.0f);
                }
                if (nyhVarM39875f.m41253m() != null) {
                    c12641b.m20934p(nyhVarM39875f.m41253m());
                }
                if (nyhVarM39875f.m41248h() != null) {
                    c12641b.m20928j(nyhVarM39875f.m41248h());
                }
            }
        }
    }

    /* renamed from: f */
    public jyh m34729f(int i) {
        List list = this.f31275m;
        if (list != null) {
            return (jyh) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int m34730g() {
        List list = this.f31275m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public List m34731h(long j, Map map, Map map2, Map map3) {
        List<Pair> arrayList = new ArrayList();
        m34736n(j, this.f31270h, arrayList);
        TreeMap treeMap = new TreeMap();
        m34738p(j, false, this.f31270h, treeMap);
        m34737o(j, map, map2, this.f31270h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                lyh lyhVar = (lyh) op0.m42515e((lyh) map2.get(pair.first));
                arrayList2.add(new cd4.C12641b().m20924f(bitmapDecodeByteArray).m20929k(lyhVar.f34532b).m20930l(0).m20926h(lyhVar.f34533c, 0).m20927i(lyhVar.f34535e).m20932n(lyhVar.f34536f).m20925g(lyhVar.f34537g).m20936r(lyhVar.f34540j).m20919a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            lyh lyhVar2 = (lyh) op0.m42515e((lyh) map2.get(entry.getKey()));
            cd4.C12641b c12641b = (cd4.C12641b) entry.getValue();
            m34725e((SpannableStringBuilder) op0.m42515e(c12641b.m20923e()));
            c12641b.m20926h(lyhVar2.f34533c, lyhVar2.f34534d);
            c12641b.m20927i(lyhVar2.f34535e);
            c12641b.m20929k(lyhVar2.f34532b);
            c12641b.m20932n(lyhVar2.f34536f);
            c12641b.m20935q(lyhVar2.f34539i, lyhVar2.f34538h);
            c12641b.m20936r(lyhVar2.f34540j);
            arrayList2.add(c12641b.m20919a());
        }
        return arrayList2;
    }

    /* renamed from: i */
    public final void m34732i(TreeSet treeSet, boolean z) {
        boolean zEquals = NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON.equals(this.f31263a);
        boolean zEquals2 = "div".equals(this.f31263a);
        if (z || zEquals || (zEquals2 && this.f31271i != null)) {
            long j = this.f31266d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f31267e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f31275m == null) {
            return;
        }
        for (int i = 0; i < this.f31275m.size(); i++) {
            ((jyh) this.f31275m.get(i)).m34732i(treeSet, z || zEquals);
        }
    }

    /* renamed from: j */
    public long[] m34733j() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m34732i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: l */
    public String[] m34734l() {
        return this.f31269g;
    }

    /* renamed from: m */
    public boolean m34735m(long j) {
        long j2 = this.f31266d;
        return (j2 == -9223372036854775807L && this.f31267e == -9223372036854775807L) || (j2 <= j && this.f31267e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.f31267e) || (j2 <= j && j < this.f31267e));
    }

    /* renamed from: n */
    public final void m34736n(long j, String str, List list) {
        if (!"".equals(this.f31270h)) {
            str = this.f31270h;
        }
        if (m34735m(j) && "div".equals(this.f31263a) && this.f31271i != null) {
            list.add(new Pair(str, this.f31271i));
            return;
        }
        for (int i = 0; i < m34730g(); i++) {
            m34729f(i).m34736n(j, str, list);
        }
    }

    /* renamed from: o */
    public final void m34737o(long j, Map map, Map map2, String str, Map map3) {
        int i;
        if (m34735m(j)) {
            String str2 = "".equals(this.f31270h) ? str : this.f31270h;
            Iterator it = this.f31274l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int iIntValue = this.f31273k.containsKey(str3) ? ((Integer) this.f31273k.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    m34728b(map, (cd4.C12641b) op0.m42515e((cd4.C12641b) map3.get(str3)), iIntValue, iIntValue2, ((lyh) op0.m42515e((lyh) map2.get(str2))).f34540j);
                }
            }
            while (i < m34730g()) {
                m34729f(i).m34737o(j, map, map2, str2, map3);
                i++;
            }
        }
    }

    /* renamed from: p */
    public final void m34738p(long j, boolean z, String str, Map map) {
        this.f31273k.clear();
        this.f31274l.clear();
        if ("metadata".equals(this.f31263a)) {
            return;
        }
        if (!"".equals(this.f31270h)) {
            str = this.f31270h;
        }
        if (this.f31265c && z) {
            m34726k(str, map).append((CharSequence) op0.m42515e(this.f31264b));
            return;
        }
        if ("br".equals(this.f31263a) && z) {
            m34726k(str, map).append('\n');
            return;
        }
        if (m34735m(j)) {
            for (Map.Entry entry : map.entrySet()) {
                this.f31273k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) op0.m42515e(((cd4.C12641b) entry.getValue()).m20923e())).length()));
            }
            boolean zEquals = NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON.equals(this.f31263a);
            for (int i = 0; i < m34730g(); i++) {
                m34729f(i).m34738p(j, z || zEquals, str, map);
            }
            if (zEquals) {
                myh.m39872c(m34726k(str, map));
            }
            for (Map.Entry entry2 : map.entrySet()) {
                this.f31274l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) op0.m42515e(((cd4.C12641b) entry2.getValue()).m20923e())).length()));
            }
        }
    }
}
