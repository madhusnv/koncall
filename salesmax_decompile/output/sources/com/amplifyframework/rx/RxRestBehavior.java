package com.amplifyframework.rx;

import com.amplifyframework.api.rest.RestOptions;
import p001o.wtf;

/* loaded from: classes5.dex */
public interface RxRestBehavior {
    wtf delete(RestOptions restOptions);

    wtf delete(String str, RestOptions restOptions);

    wtf get(RestOptions restOptions);

    wtf get(String str, RestOptions restOptions);

    wtf head(RestOptions restOptions);

    wtf head(String str, RestOptions restOptions);

    wtf patch(RestOptions restOptions);

    wtf patch(String str, RestOptions restOptions);

    wtf post(RestOptions restOptions);

    wtf post(String str, RestOptions restOptions);

    wtf put(RestOptions restOptions);

    wtf put(String str, RestOptions restOptions);
}
