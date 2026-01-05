package org.apache.http.conn.util;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import org.apache.http.Consts;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import p001o.eja;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
public final class PublicSuffixMatcherLoader {
    private static volatile PublicSuffixMatcher DEFAULT_INSTANCE;

    public static PublicSuffixMatcher getDefault() {
        if (DEFAULT_INSTANCE == null) {
            synchronized (PublicSuffixMatcherLoader.class) {
                if (DEFAULT_INSTANCE == null) {
                    URL resource = PublicSuffixMatcherLoader.class.getResource("/mozilla/public-suffix-list.txt");
                    if (resource != null) {
                        try {
                            DEFAULT_INSTANCE = load(resource);
                        } catch (IOException unused) {
                            eja.m25143k(PublicSuffixMatcherLoader.class);
                            throw null;
                        }
                    } else {
                        DEFAULT_INSTANCE = new PublicSuffixMatcher(DomainType.ICANN, Arrays.asList("com"), null);
                    }
                }
            }
        }
        return DEFAULT_INSTANCE;
    }

    private static PublicSuffixMatcher load(InputStream inputStream) {
        return new PublicSuffixMatcher(new PublicSuffixListParser().parseByType(new InputStreamReader(inputStream, Consts.UTF_8)));
    }

    public static PublicSuffixMatcher load(URL url) throws IOException {
        Args.notNull(url, "URL");
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
        try {
            return load(inputStreamOpenStream);
        } finally {
            inputStreamOpenStream.close();
        }
    }

    public static PublicSuffixMatcher load(File file) throws IOException {
        Args.notNull(file, "File");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return load(fileInputStream);
        } finally {
            fileInputStream.close();
        }
    }
}
