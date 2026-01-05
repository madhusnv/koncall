package p001o;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class ue0 implements o9d {

    /* renamed from: a */
    public final ihg f48750a = tgg.m49847a();

    @Override // p001o.o9d
    /* renamed from: a */
    public n9d mo41854a(String str) {
        sq8.m48649h(str, "languageTag");
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        sq8.m48648g(localeForLanguageTag, "forLanguageTag(languageTag)");
        return new te0(localeForLanguageTag);
    }
}
