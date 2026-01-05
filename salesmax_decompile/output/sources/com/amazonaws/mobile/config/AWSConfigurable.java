package com.amazonaws.mobile.config;

import android.content.Context;
import com.amazonaws.ClientConfiguration;

/* loaded from: classes4.dex */
public interface AWSConfigurable {
    AWSConfigurable initialize(Context context);

    AWSConfigurable initialize(Context context, AWSConfiguration aWSConfiguration);

    AWSConfigurable initialize(Context context, AWSConfiguration aWSConfiguration, ClientConfiguration clientConfiguration);
}
