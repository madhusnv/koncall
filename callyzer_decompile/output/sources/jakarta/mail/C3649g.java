package jakarta.mail;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.g */
/* loaded from: classes3.dex */
public class C3649g {
    private String name;
    public static final C3649g ENVELOPE = new C3649g("ENVELOPE");
    public static final C3649g CONTENT_INFO = new C3649g("CONTENT_INFO");
    public static final C3649g SIZE = new C3649g("SIZE");
    public static final C3649g FLAGS = new C3649g("FLAGS");

    public C3649g(String str) {
        this.name = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append("[");
        return AbstractC1452a.m4564k(sb2, this.name, "]");
    }
}
