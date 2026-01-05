package p001o;

import android.view.accessibility.AccessibilityNodeInfo;
import com.google.firebase.messaging.Constants;
import java.util.List;

/* loaded from: classes2.dex */
public final class gc {

    /* renamed from: a */
    public static final gc f24879a = new gc();

    /* renamed from: a */
    public final void m28314a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        sq8.m48649h(accessibilityNodeInfo, "node");
        sq8.m48649h(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
