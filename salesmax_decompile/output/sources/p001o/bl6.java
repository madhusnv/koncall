package p001o;

import java.io.File;

/* loaded from: classes6.dex */
public abstract class bl6 {
    /* renamed from: b */
    public static final String m19319b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }
}
