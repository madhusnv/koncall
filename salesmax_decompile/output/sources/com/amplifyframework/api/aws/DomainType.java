package com.amplifyframework.api.aws;

import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public enum DomainType {
    STANDARD,
    CUSTOM;

    private static final String STANDARD_ENDPOINT_REGEX = "^https:\\/\\/\\w{26}\\.appsync\\-api\\.\\w{2}(?:\\-\\w{2,})+\\-\\d\\.amazonaws.com(?:\\.cn)?\\/graphql$";

    public static DomainType from(String str) {
        return isRegexMatch(str, STANDARD_ENDPOINT_REGEX) ? STANDARD : CUSTOM;
    }

    private static boolean isRegexMatch(String str, String str2) {
        return Pattern.compile(str2, 2).matcher(str).matches();
    }
}
