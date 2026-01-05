package p001o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;
import org.apache.http.protocol.HTTP;

/* loaded from: classes5.dex */
public final class prb {

    /* renamed from: a */
    public static final prb f40445a = new prb();

    /* renamed from: b */
    public static final String f40446b = prb.class.getName();

    /* renamed from: c */
    public static File f40447c;

    /* renamed from: a */
    public static final File m44084a(UUID uuid, String str, boolean z) {
        sq8.m48649h(uuid, "callId");
        File fileM44085b = m44085b(uuid, z);
        if (fileM44085b == null) {
            return null;
        }
        try {
            return new File(fileM44085b, URLEncoder.encode(str, HTTP.UTF_8));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final File m44085b(UUID uuid, boolean z) {
        sq8.m48649h(uuid, "callId");
        if (f40447c == null) {
            return null;
        }
        File file = new File(f40447c, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: c */
    public static final File m44086c(UUID uuid, String str) throws FileNotFoundException {
        if (cri.d0(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return m44084a(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }
}
