package p001o;

import android.util.LruCache;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class gv1 {

    /* renamed from: a */
    public static LruCache f25816a = new LruCache(1000);

    /* renamed from: a */
    public static synchronized String m29521a(String str, String str2, String str3, String str4) {
        String str5 = String.format("%s-%s-%s-%s", str, str2, str3, str4);
        if (!Objects.isNull((String) f25816a.get(str5))) {
            return (String) f25816a.get(str5);
        }
        String string = UUID.randomUUID().toString();
        f25816a.put(str5, string);
        return string;
    }
}
