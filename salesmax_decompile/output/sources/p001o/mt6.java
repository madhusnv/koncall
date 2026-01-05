package p001o;

import android.R;
import com.facebook.C10773c;
import com.google.api.Service;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.perf.util.Constants;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;
import p001o.st6;

/* loaded from: classes5.dex */
public final class mt6 {

    /* renamed from: a */
    public static final mt6 f35946a = new mt6();

    /* renamed from: b */
    public static final Map f35947b = new HashMap();

    /* renamed from: o.mt6$a */
    public static final class C15424a implements st6.InterfaceC16913a {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC15425b f35948a;

        /* renamed from: b */
        public final /* synthetic */ EnumC15426c f35949b;

        public C15424a(InterfaceC15425b interfaceC15425b, EnumC15426c enumC15426c) {
            this.f35948a = interfaceC15425b;
            this.f35949b = enumC15426c;
        }

        @Override // p001o.st6.InterfaceC16913a
        public void onCompleted() {
            this.f35948a.mo17402a(mt6.m39648g(this.f35949b));
        }
    }

    /* renamed from: o.mt6$b */
    public interface InterfaceC15425b {
        /* renamed from: a */
        void mo17402a(boolean z);
    }

    /* renamed from: o.mt6$c */
    public enum EnumC15426c {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        ProtectedMode(66564),
        MACARuleMatching(66565),
        BlocklistEvents(66566),
        FilterRedactedEvents(66567),
        FilterSensitiveParams(66568),
        StdParamEnforcement(R.attr.trimPathEnd),
        BannedParamFiltering(R.attr.trimPathOffset),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        IapLoggingLib5To7(67330),
        AndroidManualImplicitPurchaseDedupe(67331),
        AndroidManualImplicitSubsDedupe(67332),
        AndroidIAPSubscriptionAutoLogging(67333),
        Instrument(Opcodes.ACC_DEPRECATED),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Megatron(262144),
        Elora(Opcodes.ASM5),
        GPSARATriggers(Opcodes.ASM6),
        GPSPACAProcessing(Opcodes.ASM7),
        GPSTopicsObservation(Opcodes.ASM8),
        Login(16777216),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        Share(MediaHttpDownloader.MAXIMUM_CHUNK_SIZE);

        public static final a Companion = new a(null);
        private final int code;

        /* renamed from: o.mt6$c$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final EnumC15426c m39652a(int i) {
                for (EnumC15426c enumC15426c : EnumC15426c.values()) {
                    if (enumC15426c.code == i) {
                        return enumC15426c;
                    }
                }
                return EnumC15426c.Unknown;
            }
        }

        /* renamed from: o.mt6$c$b */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f35950a;

            static {
                int[] iArr = new int[EnumC15426c.values().length];
                try {
                    iArr[EnumC15426c.Core.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC15426c.AppEvents.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC15426c.CodelessEvents.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC15426c.RestrictiveDataFiltering.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC15426c.Instrument.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC15426c.CrashReport.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC15426c.CrashShield.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC15426c.ThreadCheck.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC15426c.ErrorReport.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EnumC15426c.AnrReport.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[EnumC15426c.AAM.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[EnumC15426c.CloudBridge.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[EnumC15426c.PrivacyProtection.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[EnumC15426c.SuggestedEvents.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[EnumC15426c.IntelligentIntegrity.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[EnumC15426c.StdParamEnforcement.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[EnumC15426c.ProtectedMode.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[EnumC15426c.BannedParamFiltering.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[EnumC15426c.MACARuleMatching.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[EnumC15426c.BlocklistEvents.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[EnumC15426c.FilterRedactedEvents.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[EnumC15426c.FilterSensitiveParams.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[EnumC15426c.ModelRequest.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[EnumC15426c.EventDeactivation.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[EnumC15426c.OnDeviceEventProcessing.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[EnumC15426c.OnDevicePostInstallEventProcessing.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[EnumC15426c.IapLogging.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[EnumC15426c.IapLoggingLib2.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[EnumC15426c.IapLoggingLib5To7.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[EnumC15426c.AndroidManualImplicitPurchaseDedupe.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[EnumC15426c.AndroidManualImplicitSubsDedupe.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[EnumC15426c.AndroidIAPSubscriptionAutoLogging.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[EnumC15426c.Monitoring.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[EnumC15426c.Megatron.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[EnumC15426c.Elora.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[EnumC15426c.GPSARATriggers.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[EnumC15426c.GPSPACAProcessing.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[EnumC15426c.GPSTopicsObservation.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[EnumC15426c.ServiceUpdateCompliance.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[EnumC15426c.Login.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[EnumC15426c.ChromeCustomTabsPrefetching.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[EnumC15426c.IgnoreAppSwitchToLoggedOut.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[EnumC15426c.BypassAppSwitch.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[EnumC15426c.Share.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                f35950a = iArr;
            }
        }

        EnumC15426c(int i) {
            this.code = i;
        }

        public final EnumC15426c getParent() {
            int i = this.code;
            return (i & Constants.MAX_HOST_LENGTH) > 0 ? Companion.m39652a(i & (-256)) : (65280 & i) > 0 ? Companion.m39652a(i & Opcodes.V_PREVIEW) : (16711680 & i) > 0 ? Companion.m39652a(i & (-16777216)) : Companion.m39652a(0);
        }

        public final String toKey() {
            return "FBSDKFeature" + this;
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (b.f35950a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "StdParamEnforcement";
                case 17:
                    return "ProtectedMode";
                case 18:
                    return "BannedParamFiltering";
                case 19:
                    return "MACARuleMatching";
                case 20:
                    return "BlocklistEvents";
                case 21:
                    return "FilterRedactedEvents";
                case 22:
                    return "FilterSensitiveParams";
                case 23:
                    return "ModelRequest";
                case 24:
                    return "EventDeactivation";
                case 25:
                    return "OnDeviceEventProcessing";
                case 26:
                    return "OnDevicePostInstallEventProcessing";
                case 27:
                    return "IAPLogging";
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    return "IAPLoggingLib2";
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    return "IAPLoggingLib5To7";
                case 30:
                    return "AndroidManualImplicitPurchaseDedupe";
                case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    return "AndroidManualImplicitSubsDedupe";
                case 32:
                    return "AndroidIAPSubscriptionAutoLogging";
                case 33:
                    return "Monitoring";
                case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    return "Megatron";
                case 35:
                    return "Elora";
                case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    return "GPSARATriggers";
                case 37:
                    return "GPSPACAProcessing";
                case 38:
                    return "GPSTopicsObservation";
                case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    return "ServiceUpdateCompliance";
                case 40:
                    return "LoginKit";
                case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    return "ChromeCustomTabsPrefetching";
                case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    return "IgnoreAppSwitchToLoggedOut";
                case SignatureVisitor.EXTENDS /* 43 */:
                    return "BypassAppSwitch";
                case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    /* renamed from: o.mt6$d */
    public /* synthetic */ class C15427d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35951a;

        static {
            int[] iArr = new int[EnumC15426c.values().length];
            try {
                iArr[EnumC15426c.RestrictiveDataFiltering.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15426c.Instrument.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC15426c.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC15426c.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC15426c.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC15426c.ErrorReport.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC15426c.AnrReport.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC15426c.AAM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC15426c.CloudBridge.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC15426c.PrivacyProtection.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC15426c.SuggestedEvents.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC15426c.IntelligentIntegrity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC15426c.ModelRequest.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC15426c.EventDeactivation.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC15426c.OnDeviceEventProcessing.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC15426c.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC15426c.IapLogging.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC15426c.IapLoggingLib2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EnumC15426c.IapLoggingLib5To7.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EnumC15426c.AndroidManualImplicitPurchaseDedupe.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EnumC15426c.AndroidManualImplicitSubsDedupe.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[EnumC15426c.AndroidIAPSubscriptionAutoLogging.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[EnumC15426c.BannedParamFiltering.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[EnumC15426c.ProtectedMode.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[EnumC15426c.StdParamEnforcement.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[EnumC15426c.MACARuleMatching.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[EnumC15426c.BlocklistEvents.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[EnumC15426c.FilterRedactedEvents.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[EnumC15426c.FilterSensitiveParams.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[EnumC15426c.ChromeCustomTabsPrefetching.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[EnumC15426c.Monitoring.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[EnumC15426c.IgnoreAppSwitchToLoggedOut.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[EnumC15426c.BypassAppSwitch.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[EnumC15426c.GPSARATriggers.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[EnumC15426c.GPSPACAProcessing.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[EnumC15426c.GPSTopicsObservation.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            f35951a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m39645a(EnumC15426c enumC15426c, InterfaceC15425b interfaceC15425b) {
        sq8.m48649h(enumC15426c, "feature");
        sq8.m48649h(interfaceC15425b, "callback");
        st6.m48898h(new C15424a(interfaceC15425b, enumC15426c));
    }

    /* renamed from: c */
    public static final void m39646c(EnumC15426c enumC15426c) {
        sq8.m48649h(enumC15426c, "feature");
        C10773c.m13019l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(enumC15426c.toKey(), C10773c.m12989C()).apply();
    }

    /* renamed from: d */
    public static final EnumC15426c m39647d(String str) {
        sq8.m48649h(str, "className");
        f35946a.m39651f();
        for (Map.Entry entry : f35947b.entrySet()) {
            EnumC15426c enumC15426c = (EnumC15426c) entry.getKey();
            for (String str2 : (String[]) entry.getValue()) {
                if (e9g.m24597K(str, str2, false, 2, null)) {
                    return enumC15426c;
                }
            }
        }
        return EnumC15426c.Unknown;
    }

    /* renamed from: g */
    public static final boolean m39648g(EnumC15426c enumC15426c) {
        sq8.m48649h(enumC15426c, "feature");
        if (EnumC15426c.Unknown == enumC15426c) {
            return false;
        }
        if (EnumC15426c.Core == enumC15426c) {
            return true;
        }
        String string = C10773c.m13019l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(enumC15426c.toKey(), null);
        if (string != null && sq8.m48644c(string, C10773c.m12989C())) {
            return false;
        }
        EnumC15426c parent = enumC15426c.getParent();
        return parent == enumC15426c ? f35946a.m39650e(enumC15426c) : m39648g(parent) && f35946a.m39650e(enumC15426c);
    }

    /* renamed from: b */
    public final boolean m39649b(EnumC15426c enumC15426c) {
        switch (C15427d.f35951a[enumC15426c.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case 30:
            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 33:
            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
            case 35:
            case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: e */
    public final boolean m39650e(EnumC15426c enumC15426c) {
        return st6.m48897d(enumC15426c.toKey(), C10773c.m13020m(), m39649b(enumC15426c));
    }

    /* renamed from: f */
    public final synchronized void m39651f() {
        Map map = f35947b;
        if (map.isEmpty()) {
            map.put(EnumC15426c.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(EnumC15426c.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(EnumC15426c.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
            map.put(EnumC15426c.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(EnumC15426c.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(EnumC15426c.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(EnumC15426c.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(EnumC15426c.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(EnumC15426c.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(EnumC15426c.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
            map.put(EnumC15426c.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
            map.put(EnumC15426c.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
            map.put(EnumC15426c.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
            map.put(EnumC15426c.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
            map.put(EnumC15426c.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(EnumC15426c.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(EnumC15426c.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(EnumC15426c.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
            map.put(EnumC15426c.GPSARATriggers, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
            map.put(EnumC15426c.GPSPACAProcessing, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
            map.put(EnumC15426c.GPSTopicsObservation, new String[]{"com.facebook.appevents.gps.topics.GpsTopicsManager"});
        }
    }
}
