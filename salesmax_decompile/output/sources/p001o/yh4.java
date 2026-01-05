package p001o;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class yh4 {

    /* renamed from: a */
    public static final String f55510a = sqi.B0(0);

    /* renamed from: b */
    public static final String f55511b = sqi.B0(1);

    /* renamed from: c */
    public static final String f55512c = sqi.B0(2);

    /* renamed from: d */
    public static final String f55513d = sqi.B0(3);

    /* renamed from: e */
    public static final String f55514e = sqi.B0(4);

    /* renamed from: a */
    public static ArrayList m57807a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (kve kveVar : (kve[]) spanned.getSpans(0, spanned.length(), kve.class)) {
            arrayList.add(m57808b(spanned, kveVar, 1, kveVar.m36259b()));
        }
        for (ahh ahhVar : (ahh[]) spanned.getSpans(0, spanned.length(), ahh.class)) {
            arrayList.add(m57808b(spanned, ahhVar, 2, ahhVar.m17136b()));
        }
        for (w08 w08Var : (w08[]) spanned.getSpans(0, spanned.length(), w08.class)) {
            arrayList.add(m57808b(spanned, w08Var, 3, null));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Bundle m57808b(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f55510a, spanned.getSpanStart(obj));
        bundle2.putInt(f55511b, spanned.getSpanEnd(obj));
        bundle2.putInt(f55512c, spanned.getSpanFlags(obj));
        bundle2.putInt(f55513d, i);
        if (bundle != null) {
            bundle2.putBundle(f55514e, bundle);
        }
        return bundle2;
    }

    /* renamed from: c */
    public static void m57809c(Bundle bundle, Spannable spannable) {
        int i = bundle.getInt(f55510a);
        int i2 = bundle.getInt(f55511b);
        int i3 = bundle.getInt(f55512c);
        int i4 = bundle.getInt(f55513d, -1);
        Bundle bundle2 = bundle.getBundle(f55514e);
        if (i4 == 1) {
            spannable.setSpan(kve.m36258a((Bundle) op0.m42515e(bundle2)), i, i2, i3);
        } else if (i4 == 2) {
            spannable.setSpan(ahh.m17135a((Bundle) op0.m42515e(bundle2)), i, i2, i3);
        } else {
            if (i4 != 3) {
                return;
            }
            spannable.setSpan(new w08(), i, i2, i3);
        }
    }
}
