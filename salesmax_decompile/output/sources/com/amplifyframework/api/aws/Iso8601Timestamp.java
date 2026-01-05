package com.amplifyframework.api.aws;

import com.amazonaws.util.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes5.dex */
final class Iso8601Timestamp {
    private Iso8601Timestamp() {
    }

    public static String now() {
        return new SimpleDateFormat(DateUtils.COMPRESSED_DATE_PATTERN, Locale.US).format(new Date());
    }
}
