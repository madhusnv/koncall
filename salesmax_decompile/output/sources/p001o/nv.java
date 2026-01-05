package p001o;

import android.os.Looper;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes2.dex */
public abstract class nv {

    /* renamed from: a */
    public static final gi9 f37342a = si9.m48360a(C15674a.f37343a);

    /* renamed from: o.nv$a */
    public static final class C15674a extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C15674a f37343a = new C15674a();

        public C15674a() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final plb invoke() {
            return Looper.getMainLooper() != null ? qc5.f41612a : k8f.f31650a;
        }
    }

    /* renamed from: a */
    public static final cpb m41174a(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }

    /* renamed from: b */
    public static final dpb m41175b(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }

    /* renamed from: c */
    public static final nxf m41176c(Object obj, pxf pxfVar) {
        sq8.m48649h(pxfVar, "policy");
        return new ParcelableSnapshotMutableState(obj, pxfVar);
    }

    /* renamed from: d */
    public static final void m41177d(String str, Throwable th) {
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(th, "e");
    }
}
