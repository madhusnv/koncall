package com.razorpay;

import proguard.annotation.Keep;
import proguard.annotation.KeepClassMembers;

@Keep
@KeepClassMembers
/* loaded from: classes6.dex */
interface Callback {
    void run(ResponseObject responseObject);
}
