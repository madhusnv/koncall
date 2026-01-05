package com.amplifyframework.api.aws;

import p001o.tn8;
import p001o.zqe;

/* loaded from: classes5.dex */
final class UserAgentInterceptor implements tn8 {
    private final UserAgentProvider userAgentProvider;

    public interface UserAgentProvider {
        String getUserAgent();
    }

    private UserAgentInterceptor(UserAgentProvider userAgentProvider) {
        this.userAgentProvider = userAgentProvider;
    }

    public static UserAgentInterceptor using(UserAgentProvider userAgentProvider) {
        return new UserAgentInterceptor(userAgentProvider);
    }

    @Override // p001o.tn8
    public zqe intercept(tn8.InterfaceC17165a interfaceC17165a) {
        return interfaceC17165a.mo20972a(interfaceC17165a.request().m51738i().m51757n("User-Agent", this.userAgentProvider.getUserAgent()).m51746b());
    }
}
