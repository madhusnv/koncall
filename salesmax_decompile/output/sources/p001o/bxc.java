package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes3.dex */
public class bxc extends s6f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxc(String str, String str2, int i) {
        super("parse `" + str + "`: error at " + i + ": " + str2);
        sq8.m48649h(str, "input");
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
    }
}
