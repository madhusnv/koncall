package androidx.media3.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import androidx.media3.ui.AbstractC2297a;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p001o.ahh;
import p001o.d18;
import p001o.kve;
import p001o.of8;
import p001o.op0;
import p001o.sqi;
import p001o.w08;

/* renamed from: androidx.media3.ui.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2297a {

    /* renamed from: a */
    public static final Pattern f8887a = Pattern.compile("(&#13;)?&#10;");

    /* renamed from: androidx.media3.ui.a$b */
    public static class b {

        /* renamed from: a */
        public final String f8888a;

        /* renamed from: b */
        public final Map f8889b;

        public b(String str, Map map) {
            this.f8888a = str;
            this.f8889b = map;
        }
    }

    /* renamed from: androidx.media3.ui.a$c */
    public static final class c {

        /* renamed from: e */
        public static final Comparator f8890e = new Comparator() { // from class: o.b0g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC2297a.c.m7869e((AbstractC2297a.c) obj, (AbstractC2297a.c) obj2);
            }
        };

        /* renamed from: f */
        public static final Comparator f8891f = new Comparator() { // from class: o.c0g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC2297a.c.m7870f((AbstractC2297a.c) obj, (AbstractC2297a.c) obj2);
            }
        };

        /* renamed from: a */
        public final int f8892a;

        /* renamed from: b */
        public final int f8893b;

        /* renamed from: c */
        public final String f8894c;

        /* renamed from: d */
        public final String f8895d;

        /* renamed from: e */
        public static /* synthetic */ int m7869e(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f8893b, cVar.f8893b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.f8894c.compareTo(cVar2.f8894c);
            return iCompareTo != 0 ? iCompareTo : cVar.f8895d.compareTo(cVar2.f8895d);
        }

        /* renamed from: f */
        public static /* synthetic */ int m7870f(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f8892a, cVar.f8892a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.f8894c.compareTo(cVar.f8894c);
            return iCompareTo != 0 ? iCompareTo : cVar2.f8895d.compareTo(cVar.f8895d);
        }

        public c(int i, int i2, String str, String str2) {
            this.f8892a = i;
            this.f8893b = i2;
            this.f8894c = str;
            this.f8895d = str2;
        }
    }

    /* renamed from: androidx.media3.ui.a$d */
    public static final class d {

        /* renamed from: a */
        public final List f8896a = new ArrayList();

        /* renamed from: b */
        public final List f8897b = new ArrayList();
    }

    /* renamed from: a */
    public static b m7857a(CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new b("", of8.m42180r());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(m7858b(charSequence), of8.m42180r());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(d18.m22221a("bg_" + iIntValue), sqi.m48702G("background-color:%s;", d18.m22222b(iIntValue)));
        }
        SparseArray sparseArrayM7859c = m7859c(spanned, f);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < sparseArrayM7859c.size()) {
            int iKeyAt = sparseArrayM7859c.keyAt(i);
            sb.append(m7858b(spanned.subSequence(i2, iKeyAt)));
            d dVar = (d) sparseArrayM7859c.get(iKeyAt);
            Collections.sort(dVar.f8897b, c.f8891f);
            Iterator it2 = dVar.f8897b.iterator();
            while (it2.hasNext()) {
                sb.append(((c) it2.next()).f8895d);
            }
            Collections.sort(dVar.f8896a, c.f8890e);
            Iterator it3 = dVar.f8896a.iterator();
            while (it3.hasNext()) {
                sb.append(((c) it3.next()).f8894c);
            }
            i++;
            i2 = iKeyAt;
        }
        sb.append(m7858b(spanned.subSequence(i2, spanned.length())));
        return new b(sb.toString(), map);
    }

    /* renamed from: b */
    public static String m7858b(CharSequence charSequence) {
        return f8887a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    /* renamed from: c */
    public static SparseArray m7859c(Spanned spanned, float f) {
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strM7861e = m7861e(obj, f);
            String strM7860d = m7860d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strM7861e != null) {
                op0.m42515e(strM7860d);
                c cVar = new c(spanStart, spanEnd, strM7861e, strM7860d);
                m7862f(sparseArray, spanStart).f8896a.add(cVar);
                m7862f(sparseArray, spanEnd).f8897b.add(cVar);
            }
        }
        return sparseArray;
    }

    /* renamed from: d */
    public static String m7860d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof w08) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof ahh)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof kve) {
                return "<rt>" + m7858b(((kve) obj).f32754a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m7861e(Object obj, float f) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return sqi.m48702G("<span style='color:%s;'>", d18.m22222b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return sqi.m48702G("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof w08) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            return sqi.m48702G("<span style='font-size:%.2fpx;'>", Float.valueOf(((AbsoluteSizeSpan) obj).getDip() ? r3.getSize() : r3.getSize() / f));
        }
        if (obj instanceof RelativeSizeSpan) {
            return sqi.m48702G("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return sqi.m48702G("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof kve)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof ahh)) {
                return null;
            }
            ahh ahhVar = (ahh) obj;
            return sqi.m48702G("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", m7864h(ahhVar.f14758a, ahhVar.f14759b), m7863g(ahhVar.f14760c));
        }
        int i = ((kve) obj).f32755b;
        if (i == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    /* renamed from: f */
    public static d m7862f(SparseArray sparseArray, int i) {
        d dVar = (d) sparseArray.get(i);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i, dVar2);
        return dVar2;
    }

    /* renamed from: g */
    public static String m7863g(int i) {
        return i != 2 ? "over right" : "under left";
    }

    /* renamed from: h */
    public static String m7864h(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        if (i2 == 1) {
            sb.append("filled ");
        } else if (i2 == 2) {
            sb.append("open ");
        }
        if (i == 0) {
            sb.append(DevicePublicKeyStringDef.NONE);
        } else if (i == 1) {
            sb.append("circle");
        } else if (i == 2) {
            sb.append("dot");
        } else if (i != 3) {
            sb.append("unset");
        } else {
            sb.append("sesame");
        }
        return sb.toString();
    }
}
