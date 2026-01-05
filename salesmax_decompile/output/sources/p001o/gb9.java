package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class gb9 {
    /* renamed from: a */
    public static final String m28310a(Object obj, String str) {
        sq8.m48649h(obj, "obj");
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        h8g h8gVar = h8g.f26398a;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        sq8.m48648g(str2, "format(format, *args)");
        sb.append(str2);
        return sb.toString();
    }
}
