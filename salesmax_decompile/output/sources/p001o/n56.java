package p001o;

import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class n56 {

    /* renamed from: o.n56$a */
    public static class C15505a {
        /* renamed from: a */
        public static Set<int[]> m40116a() {
            return C15506b.m40117a();
        }
    }

    /* renamed from: o.n56$b */
    public static class C15506b {
        /* renamed from: a */
        public static Set m40117a() {
            try {
                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
                if (objInvoke == null) {
                    return Collections.emptySet();
                }
                Set set = (Set) objInvoke;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    /* renamed from: a */
    public static Set m40115a() {
        return Build.VERSION.SDK_INT >= 34 ? C15505a.m40116a() : C15506b.m40117a();
    }
}
