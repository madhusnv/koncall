package p001o;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public class yrb {

    /* renamed from: a */
    public final Uri f55845a;

    /* renamed from: b */
    public final String f55846b;

    /* renamed from: c */
    public final String f55847c;

    public yrb(Uri uri, String str, String str2) {
        this.f55845a = uri;
        this.f55846b = str;
        this.f55847c = str2;
    }

    /* renamed from: a */
    public String m58138a() {
        return this.f55846b;
    }

    /* renamed from: b */
    public String m58139b() {
        return this.f55847c;
    }

    /* renamed from: c */
    public Uri m58140c() {
        return this.f55845a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (m58140c() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(m58140c()));
        }
        if (m58138a() != null) {
            sb.append(" action=");
            sb.append(m58138a());
        }
        if (m58139b() != null) {
            sb.append(" mimetype=");
            sb.append(m58139b());
        }
        sb.append(" }");
        String string = sb.toString();
        sq8.m48648g(string, "sb.toString()");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yrb(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        sq8.m48649h(intent, "intent");
    }
}
