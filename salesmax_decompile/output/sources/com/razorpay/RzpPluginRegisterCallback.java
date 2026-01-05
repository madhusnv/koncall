package com.razorpay;

import proguard.annotation.Keep;
import proguard.annotation.KeepClassMembers;

@Keep
@KeepClassMembers
/* loaded from: classes6.dex */
interface RzpPluginRegisterCallback {
    void onResponse(boolean z);
}
