package p001o;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import org.apache.http.protocol.HTTP;

/* loaded from: classes5.dex */
public interface ic9 {

    /* renamed from: a */
    public static final Charset f28450a = Charset.forName(HTTP.UTF_8);

    /* renamed from: a */
    void mo19806a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
