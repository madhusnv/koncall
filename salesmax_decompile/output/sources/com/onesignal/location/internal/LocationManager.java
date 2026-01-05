package com.onesignal.location.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.core.internal.preferences.PreferenceStores;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.location.ILocationManager;
import com.onesignal.location.internal.capture.ILocationCapturer;
import com.onesignal.location.internal.common.LocationConstants;
import com.onesignal.location.internal.common.LocationUtils;
import com.onesignal.location.internal.controller.ILocationController;
import com.onesignal.location.internal.permissions.ILocationPermissionChangedHandler;
import com.onesignal.location.internal.permissions.LocationPermissionController;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.ch3;
import p001o.dge;
import p001o.eu5;
import p001o.h84;
import p001o.jgg;
import p001o.jpa;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nl7;
import p001o.o64;
import p001o.pm1;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class LocationManager implements ILocationManager, IStartableService, ILocationPermissionChangedHandler {
    private final IApplicationService _applicationService;
    private final ILocationCapturer _capturer;
    private boolean _isShared;
    private final ILocationController _locationController;
    private final LocationPermissionController _locationPermissionController;
    private final IPreferencesService _prefs;

    @l75(m36647c = "com.onesignal.location.internal.LocationManager$onLocationPermissionChanged$1", m36648f = "LocationManager.kt", m36649l = {53}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.location.internal.LocationManager$onLocationPermissionChanged$1 */
    public static final class C117061 extends jgg implements xk7 {
        int label;

        public C117061(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return LocationManager.this.new C117061(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                LocationManager locationManager = LocationManager.this;
                this.label = 1;
                if (locationManager.startGetLocation(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C117061) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.location.internal.LocationManager", m36648f = "LocationManager.kt", m36649l = {Opcodes.IASTORE}, m36650m = "requestPermission")
    /* renamed from: com.onesignal.location.internal.LocationManager$requestPermission$1 */
    public static final class C117071 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C117071(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocationManager.this.requestPermission(this);
        }
    }

    @l75(m36647c = "com.onesignal.location.internal.LocationManager$requestPermission$2", m36648f = "LocationManager.kt", m36649l = {Opcodes.LDIV, Opcodes.FCMPG, 155, 158}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.location.internal.LocationManager$requestPermission$2 */
    public static final class C117082 extends jgg implements nl7 {
        final /* synthetic */ dge $result;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117082(dge dgeVar, n64 n64Var) {
            super(2, n64Var);
            this.$result = dgeVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return LocationManager.this.new C117082(this.$result, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException {
            boolean zHasPermission;
            Object objBackgroundLocationPermissionLogic;
            dge dgeVar;
            dge dgeVar2;
            Object objPrompt;
            dge dgeVar3;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            boolean zBooleanValue = true;
            if (i == 0) {
                wre.m54934b(obj);
                String str = null;
                if (!LocationManager.this.isShared()) {
                    Logging.warn$default("Requesting location permission, but location sharing must also be enabled by setting isShared to true", null, 2, null);
                }
                AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                boolean zHasPermission2 = androidUtils.hasPermission(LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING, true, LocationManager.this._applicationService);
                if (zHasPermission2) {
                    zHasPermission = false;
                } else {
                    zHasPermission = androidUtils.hasPermission(LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING, true, LocationManager.this._applicationService);
                    LocationManager.this._capturer.setLocationCoarse(true);
                }
                int i2 = Build.VERSION.SDK_INT;
                boolean zHasPermission3 = i2 >= 29 ? androidUtils.hasPermission(LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING, true, LocationManager.this._applicationService) : false;
                if (!zHasPermission2) {
                    List<String> listFilterManifestPermissions = androidUtils.filterManifestPermissions(ch3.m21249n(LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING, LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING, LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING), LocationManager.this._applicationService);
                    if (listFilterManifestPermissions.contains(LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING)) {
                        str = LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING;
                    } else if (!listFilterManifestPermissions.contains(LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING)) {
                        Logging.info$default("Location permissions not added on AndroidManifest file >= M", null, 2, null);
                    } else if (!zHasPermission) {
                        str = LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING;
                    } else if (i2 >= 29 && listFilterManifestPermissions.contains(LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING)) {
                        str = LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING;
                    }
                    dgeVar2 = this.$result;
                    if (str != null) {
                        LocationPermissionController locationPermissionController = LocationManager.this._locationPermissionController;
                        this.L$0 = dgeVar2;
                        this.label = 2;
                        objPrompt = locationPermissionController.prompt(true, str, this);
                        if (objPrompt == objM51918f) {
                            return objM51918f;
                        }
                        dgeVar3 = dgeVar2;
                        zBooleanValue = ((Boolean) objPrompt).booleanValue();
                        dgeVar2 = dgeVar3;
                        dgeVar2.f19803a = zBooleanValue;
                    } else {
                        if (!zHasPermission) {
                            zBooleanValue = false;
                        }
                        dgeVar2.f19803a = zBooleanValue;
                    }
                } else if (i2 < 29 || zHasPermission3) {
                    this.$result.f19803a = true;
                    LocationManager locationManager = LocationManager.this;
                    this.label = 4;
                    if (locationManager.startGetLocation(this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    dge dgeVar4 = this.$result;
                    LocationManager locationManager2 = LocationManager.this;
                    this.L$0 = dgeVar4;
                    this.label = 3;
                    objBackgroundLocationPermissionLogic = locationManager2.backgroundLocationPermissionLogic(true, this);
                    if (objBackgroundLocationPermissionLogic == objM51918f) {
                        return objM51918f;
                    }
                    dgeVar = dgeVar4;
                    dgeVar.f19803a = ((Boolean) objBackgroundLocationPermissionLogic).booleanValue();
                }
            } else if (i == 1) {
                wre.m54934b(obj);
                this.$result.f19803a = true;
            } else if (i == 2) {
                dgeVar3 = (dge) this.L$0;
                wre.m54934b(obj);
                objPrompt = obj;
                zBooleanValue = ((Boolean) objPrompt).booleanValue();
                dgeVar2 = dgeVar3;
                dgeVar2.f19803a = zBooleanValue;
            } else if (i == 3) {
                dgeVar = (dge) this.L$0;
                wre.m54934b(obj);
                objBackgroundLocationPermissionLogic = obj;
                dgeVar.f19803a = ((Boolean) objBackgroundLocationPermissionLogic).booleanValue();
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C117082) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.location.internal.LocationManager$start$1", m36648f = "LocationManager.kt", m36649l = {45}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.location.internal.LocationManager$start$1 */
    public static final class C117091 extends jgg implements xk7 {
        int label;

        public C117091(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return LocationManager.this.new C117091(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                LocationManager locationManager = LocationManager.this;
                this.label = 1;
                if (locationManager.startGetLocation(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C117091) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.location.internal.LocationManager", m36648f = "LocationManager.kt", m36649l = {Opcodes.MONITOREXIT}, m36650m = "startGetLocation")
    /* renamed from: com.onesignal.location.internal.LocationManager$startGetLocation$1 */
    public static final class C117101 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C117101(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocationManager.this.startGetLocation(this);
        }
    }

    public LocationManager(IApplicationService iApplicationService, ILocationCapturer iLocationCapturer, ILocationController iLocationController, LocationPermissionController locationPermissionController, IPreferencesService iPreferencesService) {
        sq8.m48649h(iApplicationService, "_applicationService");
        sq8.m48649h(iLocationCapturer, "_capturer");
        sq8.m48649h(iLocationController, "_locationController");
        sq8.m48649h(locationPermissionController, "_locationPermissionController");
        sq8.m48649h(iPreferencesService, "_prefs");
        this._applicationService = iApplicationService;
        this._capturer = iLocationCapturer;
        this._locationController = iLocationController;
        this._locationPermissionController = locationPermissionController;
        this._prefs = iPreferencesService;
        Boolean bool = iPreferencesService.getBool(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_LOCATION_SHARED, Boolean.FALSE);
        sq8.m48646e(bool);
        this._isShared = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object backgroundLocationPermissionLogic(boolean z, n64 n64Var) {
        return AndroidUtils.INSTANCE.hasPermission(LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING, false, this._applicationService) ? this._locationPermissionController.prompt(z, LocationConstants.ANDROID_BACKGROUND_LOCATION_PERMISSION_STRING, n64Var) : ml1.m39301a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startGetLocation(n64 n64Var) {
        C117101 c117101;
        if (n64Var instanceof C117101) {
            c117101 = (C117101) n64Var;
            int i = c117101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117101.label = i - Integer.MIN_VALUE;
            } else {
                c117101 = new C117101(n64Var);
            }
        }
        Object objStart = c117101.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117101.label;
        try {
            if (i2 == 0) {
                wre.m54934b(objStart);
                if (!isShared()) {
                    return y3i.f54824a;
                }
                Logging.debug$default("LocationManager.startGetLocation()", null, 2, null);
                ILocationController iLocationController = this._locationController;
                c117101.label = 1;
                objStart = iLocationController.start(c117101);
                if (objStart == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objStart);
            }
            if (!((Boolean) objStart).booleanValue()) {
                Logging.warn$default("LocationManager.startGetLocation: not possible, no location dependency found", null, 2, null);
            }
        } catch (Throwable th) {
            Logging.warn("LocationManager.startGetLocation: Location permission exists but there was an error initializing: ", th);
        }
        return y3i.f54824a;
    }

    @Override // com.onesignal.location.ILocationManager
    public boolean isShared() {
        return this._isShared;
    }

    @Override // com.onesignal.location.internal.permissions.ILocationPermissionChangedHandler
    public void onLocationPermissionChanged(boolean z) {
        if (z) {
            ThreadUtilsKt.suspendifyOnThread$default(0, new C117061(null), 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.location.ILocationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestPermission(n64 n64Var) {
        C117071 c117071;
        dge dgeVar;
        if (n64Var instanceof C117071) {
            c117071 = (C117071) n64Var;
            int i = c117071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c117071.label = i - Integer.MIN_VALUE;
            } else {
                c117071 = new C117071(n64Var);
            }
        }
        Object obj = c117071.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c117071.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            Logging.log(LogLevel.DEBUG, "LocationManager.requestPermission()");
            dge dgeVar2 = new dge();
            jpa jpaVarM25612c = eu5.m25612c();
            C117082 c117082 = new C117082(dgeVar2, null);
            c117071.L$0 = dgeVar2;
            c117071.label = 1;
            if (pm1.m43867g(jpaVarM25612c, c117082, c117071) == objM51918f) {
                return objM51918f;
            }
            dgeVar = dgeVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dgeVar = (dge) c117071.L$0;
            wre.m54934b(obj);
        }
        return ml1.m39301a(dgeVar.f19803a);
    }

    @Override // com.onesignal.location.ILocationManager
    public void setShared(boolean z) {
        Logging.debug$default("LocationManager.setIsShared(value: " + z + ')', null, 2, null);
        this._prefs.saveBool(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_LOCATION_SHARED, Boolean.valueOf(z));
        this._isShared = z;
        onLocationPermissionChanged(z);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._locationPermissionController.subscribe((ILocationPermissionChangedHandler) this);
        if (LocationUtils.INSTANCE.hasLocationPermission(this._applicationService.getAppContext())) {
            ThreadUtilsKt.suspendifyOnThread$default(0, new C117091(null), 1, null);
        }
    }
}
