package com.onesignal;

import com.onesignal.internal.OneSignalImp;
import p001o.kf9;
import p001o.uk7;

/* loaded from: classes6.dex */
public final class OneSignal$oneSignal$2 extends kf9 implements uk7 {
    public static final OneSignal$oneSignal$2 INSTANCE = new OneSignal$oneSignal$2();

    public OneSignal$oneSignal$2() {
        super(0);
    }

    @Override // p001o.uk7
    public final OneSignalImp invoke() {
        return new OneSignalImp();
    }
}
