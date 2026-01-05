package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.u0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sun.mail.imap.IMAPStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sf.AbstractC6840z;
import sg.AbstractC6843c;
import sg.C6841a;
import sg.C6842b;
import ug.n1;
import ug.r2;
import ug.z1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b */
    public static volatile AppMeasurement f6709b;

    /* renamed from: a */
    public final AbstractC6843c f6710a;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;
    }

    public AppMeasurement(n1 n1Var) {
        this.f6710a = new C6841a(n1Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f6709b == null) {
            synchronized (AppMeasurement.class) {
                if (f6709b == null) {
                    r2 r2Var = (r2) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (r2Var != null) {
                        f6709b = new AppMeasurement(r2Var);
                    } else {
                        f6709b = new AppMeasurement(n1.m14086s(context, new u0(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f6709b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f6710a.mo9667f(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f6710a.mo9669h(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f6710a.mo9665d(str);
    }

    @Keep
    public long generateEventId() {
        return this.f6710a.mo9668g();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f6710a.mo9672k();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listMo9670i = this.f6710a.mo9670i(str, str2);
        ArrayList arrayList = new ArrayList(listMo9670i == null ? 0 : listMo9670i.size());
        for (Bundle bundle : listMo9670i) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            AbstractC6840z.m13036g(bundle);
            conditionalUserProperty.mAppId = (String) z1.m14267e(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) z1.m14267e(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) z1.m14267e(bundle, IMAPStore.ID_NAME, String.class, null);
            conditionalUserProperty.mValue = z1.m14267e(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) z1.m14267e(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) z1.m14267e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) z1.m14267e(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) z1.m14267e(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) z1.m14267e(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) z1.m14267e(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) z1.m14267e(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) z1.m14267e(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) z1.m14267e(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) z1.m14267e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) z1.m14267e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) z1.m14267e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f6710a.mo9663b();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f6710a.mo9662a();
    }

    @Keep
    public String getGmpAppId() {
        return this.f6710a.mo9673l();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f6710a.mo9671j(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z6) {
        return this.f6710a.mo9674m(str, str2, z6);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f6710a.mo9666e(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        AbstractC6840z.m13036g(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(IMAPStore.ID_NAME, str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            z1.m14265c(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f6710a.mo9664c(bundle);
    }

    public AppMeasurement(r2 r2Var) {
        this.f6710a = new C6842b(r2Var);
    }
}
