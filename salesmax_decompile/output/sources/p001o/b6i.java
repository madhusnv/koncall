package p001o;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes3.dex */
public final class b6i extends xa3 {

    /* renamed from: b */
    public final w81 f15600b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6i(String str, w81 w81Var, Throwable th) {
        super(str, th);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(w81Var, "signingAlgorithm");
        this.f15600b = w81Var;
    }

    /* renamed from: b */
    public final w81 m18201b() {
        return this.f15600b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b6i(String str, w81 w81Var) {
        this(str, w81Var, null);
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(w81Var, "signingAlgorithm");
    }
}
