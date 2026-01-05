package p013o;

import android.os.LocaleList;
import android.widget.TextView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c0 {
    /* renamed from: a */
    public static LocaleList m10213a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* renamed from: b */
    public static void m10214b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
