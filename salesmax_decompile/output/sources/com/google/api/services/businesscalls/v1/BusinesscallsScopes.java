package com.google.api.services.businesscalls.v1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class BusinesscallsScopes {
    public static final String CLOUD_PLATFORM = "https://www.googleapis.com/auth/cloud-platform";

    private BusinesscallsScopes() {
    }

    public static Set<String> all() {
        HashSet hashSet = new HashSet();
        hashSet.add(CLOUD_PLATFORM);
        return Collections.unmodifiableSet(hashSet);
    }
}
