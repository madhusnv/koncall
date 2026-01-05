package com.onesignal.session.internal.influence;

import java.util.List;

/* loaded from: classes6.dex */
public interface IInfluenceManager {
    List<Influence> getInfluences();

    void onDirectInfluenceFromIAM(String str);

    void onDirectInfluenceFromNotification(String str);

    void onInAppMessageDismissed();

    void onInAppMessageDisplayed(String str);

    void onNotificationReceived(String str);
}
