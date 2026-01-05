package p001o;

import java.text.Normalizer;

/* loaded from: classes6.dex */
public abstract class zfj {
    /* renamed from: a */
    public static final String m59381a(String str) {
        sq8.m48649h(str, "string");
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        sq8.m48648g(strNormalize, "normalize(...)");
        return strNormalize;
    }
}
