package com.onesignal.core.internal.preferences.impl;

import android.content.SharedPreferences;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.onesignal.common.threading.Waiter;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceStores;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p001o.ck5;
import p001o.eu5;
import p001o.h84;
import p001o.id5;
import p001o.isa;
import p001o.jgg;
import p001o.kt7;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.rm1;
import p001o.sq8;
import p001o.vyh;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class PreferencesService implements IPreferencesService, IStartableService {
    public static final Companion Companion = new Companion(null);
    private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;
    private final IApplicationService _applicationService;
    private final ITime _time;
    private final Map<String, Map<String, Object>> prefsToApply;
    private ck5 queueJob;
    private final Waiter waiter;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.onesignal.core.internal.preferences.impl.PreferencesService$doWorkAsync$1", m36648f = "PreferencesService.kt", m36649l = {221, 225}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.core.internal.preferences.impl.PreferencesService$doWorkAsync$1 */
    public static final class C116261 extends jgg implements nl7 {
        long J$0;
        int label;

        public C116261(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return PreferencesService.this.new C116261(n64Var);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[Catch: all -> 0x0116, TryCatch #2 {all -> 0x0116, blocks: (B:18:0x0037, B:19:0x0045, B:21:0x004b, B:23:0x0068, B:24:0x0072, B:25:0x0076, B:47:0x00d8, B:48:0x00d9, B:50:0x00df, B:51:0x00e0, B:52:0x00e1, B:61:0x0105, B:26:0x0077, B:27:0x007f, B:29:0x0085, B:31:0x0093, B:32:0x0099, B:34:0x009d, B:35:0x00a7, B:37:0x00ab, B:38:0x00b5, B:40:0x00b9, B:41:0x00c3, B:43:0x00c7, B:45:0x00cf, B:46:0x00d3), top: B:70:0x0037, inners: #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0115 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0104 A[EDGE_INSN: B:76:0x0104->B:60:0x0104 BREAK  A[LOOP:0: B:70:0x0037->B:66:0x011b], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0113 -> B:70:0x0037). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.preferences.impl.PreferencesService.C116261.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C116261) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public PreferencesService(IApplicationService iApplicationService, ITime iTime) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iTime, "_time");
        this._applicationService = iApplicationService;
        this._time = iTime;
        this.prefsToApply = isa.m32684k(vyh.m53620a(PreferenceStores.ONESIGNAL, new LinkedHashMap()), vyh.m53620a(PreferenceStores.PLAYER_PURCHASES, new LinkedHashMap()));
        this.waiter = new Waiter();
    }

    private final ck5 doWorkAsync() {
        return rm1.m46950b(kt7.f32697a, eu5.m25611b(), null, new C116261(null), 2, null);
    }

    private final Object get(String str, String str2, Class<?> cls, Object obj) throws Exception {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception("Store not found: " + str);
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        sq8.m48646e(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            Object obj2 = map2.get(str2);
            if (obj2 == null && !map2.containsKey(str2)) {
                y3i y3iVar = y3i.f54824a;
                SharedPreferences sharedPrefsByName = getSharedPrefsByName(str);
                if (sharedPrefsByName != null) {
                    try {
                        if (sq8.m48644c(cls, String.class)) {
                            return sharedPrefsByName.getString(str2, (String) obj);
                        }
                        if (sq8.m48644c(cls, Boolean.TYPE)) {
                            Boolean bool = (Boolean) obj;
                            return Boolean.valueOf(sharedPrefsByName.getBoolean(str2, bool != null ? bool.booleanValue() : false));
                        }
                        if (sq8.m48644c(cls, Integer.TYPE)) {
                            Integer num = (Integer) obj;
                            return Integer.valueOf(sharedPrefsByName.getInt(str2, num != null ? num.intValue() : 0));
                        }
                        if (sq8.m48644c(cls, Long.TYPE)) {
                            Long l = (Long) obj;
                            return Long.valueOf(sharedPrefsByName.getLong(str2, l != null ? l.longValue() : 0L));
                        }
                        if (sq8.m48644c(cls, Set.class)) {
                            return sharedPrefsByName.getStringSet(str2, (Set) obj);
                        }
                        return null;
                    } catch (Exception unused) {
                    }
                }
                if (sq8.m48644c(cls, String.class)) {
                    return (String) obj;
                }
                if (sq8.m48644c(cls, Boolean.TYPE)) {
                    Boolean bool2 = (Boolean) obj;
                    return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                }
                if (sq8.m48644c(cls, Integer.TYPE)) {
                    Integer num2 = (Integer) obj;
                    return Integer.valueOf(num2 != null ? num2.intValue() : 0);
                }
                if (sq8.m48644c(cls, Long.TYPE)) {
                    Long l2 = (Long) obj;
                    return Long.valueOf(l2 != null ? l2.longValue() : 0L);
                }
                if (sq8.m48644c(cls, Set.class)) {
                    return (Set) obj;
                }
                return null;
            }
            return obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized SharedPreferences getSharedPrefsByName(String str) {
        return this._applicationService.getAppContext().getSharedPreferences(str, 0);
    }

    private final void save(String str, String str2, Object obj) throws Exception {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception("Store not found: " + str);
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        sq8.m48646e(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            map2.put(str2, obj);
            y3i y3iVar = y3i.f54824a;
        }
        this.waiter.wake();
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public Boolean getBool(String str, String str2, Boolean bool) {
        sq8.m48649h(str, "store");
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        return (Boolean) get(str, str2, Boolean.TYPE, bool);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public Integer getInt(String str, String str2, Integer num) {
        sq8.m48649h(str, "store");
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        return (Integer) get(str, str2, Integer.TYPE, num);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public Long getLong(String str, String str2, Long l) {
        sq8.m48649h(str, "store");
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        return (Long) get(str, str2, Long.TYPE, l);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public String getString(String str, String str2, String str3) {
        sq8.m48649h(str, "store");
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        return (String) get(str, str2, String.class, str3);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public Set<String> getStringSet(String str, String str2, Set<String> set) {
        sq8.m48649h(str, "store");
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        return (Set) get(str, str2, Set.class, set);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveBool(String str, String str2, Boolean bool) throws Exception {
        sq8.m48649h(str, "store");
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        save(str, str2, bool);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveInt(String str, String str2, Integer num) throws Exception {
        sq8.m48649h(str, "store");
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        save(str, str2, num);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveLong(String str, String str2, Long l) throws Exception {
        sq8.m48649h(str, "store");
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        save(str, str2, l);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveString(String str, String str2, String str3) throws Exception {
        sq8.m48649h(str, "store");
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        save(str, str2, str3);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveStringSet(String str, String str2, Set<String> set) throws Exception {
        sq8.m48649h(str, "store");
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        save(str, str2, set);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this.queueJob = doWorkAsync();
    }
}
