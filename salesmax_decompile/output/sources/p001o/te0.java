package p001o;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class te0 implements n9d {

    /* renamed from: a */
    public final Locale f46918a;

    public te0(Locale locale) {
        sq8.m48649h(locale, "javaLocale");
        this.f46918a = locale;
    }

    @Override // p001o.n9d
    /* renamed from: a */
    public String mo40254a() {
        String languageTag = this.f46918a.toLanguageTag();
        sq8.m48648g(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    /* renamed from: b */
    public final Locale m49760b() {
        return this.f46918a;
    }
}
