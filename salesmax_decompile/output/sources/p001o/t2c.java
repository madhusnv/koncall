package p001o;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.messaging.Constants;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p001o.o2c;

/* loaded from: classes2.dex */
public abstract class t2c {

    /* renamed from: a */
    public static final Object f46262a = new Object();

    /* renamed from: b */
    public static final Object f46263b = new Object();

    /* renamed from: a */
    public static Bundle m49200a(o2c.C15690b c15690b) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatM41357d = c15690b.m41357d();
        bundle.putInt("icon", iconCompatM41357d != null ? iconCompatM41357d.m5860j() : 0);
        bundle.putCharSequence(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, c15690b.m41361h());
        bundle.putParcelable("actionIntent", c15690b.m41354a());
        Bundle bundle2 = c15690b.m41356c() != null ? new Bundle(c15690b.m41356c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", c15690b.m41355b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m49202c(c15690b.m41358e()));
        bundle.putBoolean("showsUserInterface", c15690b.m41360g());
        bundle.putInt("semanticAction", c15690b.m41359f());
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m49201b(gie gieVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", gieVar.m28803i());
        bundle.putCharSequence(Constants.ScionAnalytics.PARAM_LABEL, gieVar.m28802h());
        bundle.putCharSequenceArray("choices", gieVar.m28799e());
        bundle.putBoolean("allowFreeFormInput", gieVar.m28797c());
        bundle.putBundle("extras", gieVar.m28801g());
        Set setM28798d = gieVar.m28798d();
        if (setM28798d != null && !setM28798d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setM28798d.size());
            Iterator it = setM28798d.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: c */
    public static Bundle[] m49202c(gie[] gieVarArr) {
        if (gieVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[gieVarArr.length];
        for (int i = 0; i < gieVarArr.length; i++) {
            bundleArr[i] = m49201b(gieVarArr[i]);
        }
        return bundleArr;
    }
}
