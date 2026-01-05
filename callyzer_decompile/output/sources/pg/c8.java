package pg;

import com.amplifyframework.core.model.ModelIdentifier;
import ja.C3619m;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c8 {
    /* renamed from: b */
    public static final boolean m11569b(String str) {
        if (AbstractC5178p.m10117y(str, '=')) {
            List listM10111V = AbstractC5178p.m10111V(str, new char[]{'='}, 2, 2);
            if (listM10111V.size() == 2 && AbstractC5178p.g0((String) listM10111V.get(0)).toString().length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m11570c(C3619m c3619m) {
        AbstractC4154l.m8923f(c3619m, "<this>");
        String str = c3619m.f19261b;
        AbstractC4154l.m8923f(str, "<this>");
        String string = AbstractC5178p.g0(d8.m11587e(d8.m11587e(str, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER), ";")).toString();
        return AbstractC5178p.m10113X(string, '[') && AbstractC5178p.m10093D(string, ']');
    }

    /* renamed from: a */
    public abstract List mo11571a(String str, List list);
}
