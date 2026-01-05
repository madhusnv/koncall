package p001o;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public class w94 extends t94 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w94(String str, Bundle bundle) {
        super(str, bundle);
        sq8.m48649h(str, "type");
        sq8.m48649h(bundle, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!(str.length() > 0)) {
            throw new IllegalArgumentException("type should not be empty".toString());
        }
    }
}
