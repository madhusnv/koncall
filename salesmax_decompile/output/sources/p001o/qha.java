package p001o;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class qha {

    /* renamed from: a */
    public static final qha f42009a = new qha();

    /* renamed from: a */
    public final Object m45494a(oha ohaVar) {
        sq8.m48649h(ohaVar, "localeList");
        ArrayList arrayList = new ArrayList(dh3.m23088v(ohaVar, 10));
        Iterator<E> it = ohaVar.iterator();
        while (it.hasNext()) {
            arrayList.add(nha.m40603a((mha) it.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    /* renamed from: b */
    public final void m45495b(rf0 rf0Var, oha ohaVar) {
        sq8.m48649h(rf0Var, "textPaint");
        sq8.m48649h(ohaVar, "localeList");
        ArrayList arrayList = new ArrayList(dh3.m23088v(ohaVar, 10));
        Iterator<E> it = ohaVar.iterator();
        while (it.hasNext()) {
            arrayList.add(nha.m40603a((mha) it.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        throw null;
    }
}
