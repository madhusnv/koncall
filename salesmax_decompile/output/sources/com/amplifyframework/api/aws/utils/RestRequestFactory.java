package com.amplifyframework.api.aws.utils;

import android.net.Uri;
import com.amplifyframework.api.rest.HttpMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import p001o.ule;
import p001o.w48;
import p001o.wx7;
import p001o.xle;

/* loaded from: classes5.dex */
public final class RestRequestFactory {

    /* renamed from: com.amplifyframework.api.aws.utils.RestRequestFactory$1 */
    public static /* synthetic */ class C103161 {
        static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$api$rest$HttpMethod;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            $SwitchMap$com$amplifyframework$api$rest$HttpMethod = iArr;
            try {
                iArr[HttpMethod.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$rest$HttpMethod[HttpMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$rest$HttpMethod[HttpMethod.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$rest$HttpMethod[HttpMethod.HEAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$rest$HttpMethod[HttpMethod.PATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$rest$HttpMethod[HttpMethod.DELETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public interface BodyCreationStrategy {
        void buildRequest(ule.C17397a c17397a, byte[] bArr);
    }

    private RestRequestFactory() {
    }

    public static ule createRequest(URL url, byte[] bArr, Map<String, String> map, HttpMethod httpMethod) {
        Objects.requireNonNull(url);
        Objects.requireNonNull(httpMethod);
        ule.C17397a c17397aM51743A = new ule.C17397a().m51743A(url);
        switch (C103161.$SwitchMap$com$amplifyframework$api$rest$HttpMethod[httpMethod.ordinal()]) {
            case 1:
                c17397aM51743A.m51749f();
                break;
            case 2:
                populateBody(c17397aM51743A, bArr, new BodyCreationStrategy() { // from class: com.amplifyframework.api.aws.utils.a
                    @Override // com.amplifyframework.api.aws.utils.RestRequestFactory.BodyCreationStrategy
                    public final void buildRequest(ule.C17397a c17397a, byte[] bArr2) {
                        RestRequestFactory.lambda$createRequest$0(c17397a, bArr2);
                    }
                });
                break;
            case 3:
                populateBody(c17397aM51743A, bArr, new BodyCreationStrategy() { // from class: com.amplifyframework.api.aws.utils.b
                    @Override // com.amplifyframework.api.aws.utils.RestRequestFactory.BodyCreationStrategy
                    public final void buildRequest(ule.C17397a c17397a, byte[] bArr2) {
                        RestRequestFactory.lambda$createRequest$1(c17397a, bArr2);
                    }
                });
                break;
            case 4:
                c17397aM51743A.m51756m();
                break;
            case 5:
                populateBody(c17397aM51743A, bArr, new BodyCreationStrategy() { // from class: com.amplifyframework.api.aws.utils.c
                    @Override // com.amplifyframework.api.aws.utils.RestRequestFactory.BodyCreationStrategy
                    public final void buildRequest(ule.C17397a c17397a, byte[] bArr2) {
                        RestRequestFactory.lambda$createRequest$2(c17397a, bArr2);
                    }
                });
                break;
            case 6:
                if (bArr == null) {
                    c17397aM51743A.m51747c();
                    break;
                } else {
                    populateBody(c17397aM51743A, bArr, new BodyCreationStrategy() { // from class: com.amplifyframework.api.aws.utils.d
                        @Override // com.amplifyframework.api.aws.utils.RestRequestFactory.BodyCreationStrategy
                        public final void buildRequest(ule.C17397a c17397a, byte[] bArr2) {
                            RestRequestFactory.lambda$createRequest$3(c17397a, bArr2);
                        }
                    });
                    break;
                }
        }
        if (map != null) {
            c17397aM51743A.m51758o(wx7.m55325p(map));
        }
        return c17397aM51743A.m51746b();
    }

    public static URL createURL(String str, String str2, Map<String, String> map) throws MalformedURLException {
        URL url = new URL(str);
        w48.C17774a c17774aM53899b = new w48.C17774a().m53921x(url.getProtocol()).m53908k(url.getHost()).m53899b(stripLeadingSlashes(url.getPath()));
        if (url.getPort() != -1) {
            c17774aM53899b.m53915r(url.getPort());
        }
        if (str2 != null) {
            c17774aM53899b.m53900c(stripLeadingSlashes(str2));
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c17774aM53899b.m53902e(entry.getKey(), entry.getValue());
            }
        }
        try {
            return new URL(Uri.decode(c17774aM53899b.m53903f().m53888t().toString()));
        } catch (MalformedURLException e) {
            throw new MalformedURLException(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createRequest$0(ule.C17397a c17397a, byte[] bArr) {
        c17397a.m51762s(xle.m56455e(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createRequest$1(ule.C17397a c17397a, byte[] bArr) {
        c17397a.m51761r(xle.m56455e(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createRequest$2(ule.C17397a c17397a, byte[] bArr) {
        c17397a.m51760q(xle.m56455e(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createRequest$3(ule.C17397a c17397a, byte[] bArr) {
        c17397a.m51748d(xle.m56455e(bArr));
    }

    private static void populateBody(ule.C17397a c17397a, byte[] bArr, BodyCreationStrategy bodyCreationStrategy) {
        if (bArr != null) {
            bodyCreationStrategy.buildRequest(c17397a, bArr);
        }
    }

    private static String stripLeadingSlashes(String str) {
        return str.replaceAll("^[\\\\/]+", "");
    }
}
