package com.onesignal.location.internal.permissions;

import android.app.Activity;
import android.content.pm.PackageManager;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.events.IEventNotifier;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings;
import com.onesignal.core.internal.permissions.IRequestPermissionService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.location.C11705R;
import p001o.id5;
import p001o.kf9;
import p001o.n64;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class LocationPermissionController implements IRequestPermissionService.PermissionCallback, IStartableService, IEventNotifier<ILocationPermissionChangedHandler> {
    public static final Companion Companion = new Companion(null);
    private static final String PERMISSION_TYPE = "LOCATION";
    private final IApplicationService _applicationService;
    private final IRequestPermissionService _requestPermission;
    private String currPermission;
    private final EventProducer<ILocationPermissionChangedHandler> events;
    private final WaiterWithValue<Boolean> waiter;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.onesignal.location.internal.permissions.LocationPermissionController$onAccept$1 */
    public static final class C117201 extends kf9 implements xk7 {
        public static final C117201 INSTANCE = new C117201();

        public C117201() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ILocationPermissionChangedHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(ILocationPermissionChangedHandler iLocationPermissionChangedHandler) {
            sq8.m48649h(iLocationPermissionChangedHandler, "it");
            iLocationPermissionChangedHandler.onLocationPermissionChanged(true);
        }
    }

    /* renamed from: com.onesignal.location.internal.permissions.LocationPermissionController$onReject$1 */
    public static final class C117211 extends kf9 implements xk7 {
        public static final C117211 INSTANCE = new C117211();

        public C117211() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ILocationPermissionChangedHandler) obj);
            return y3i.f54824a;
        }

        public final void invoke(ILocationPermissionChangedHandler iLocationPermissionChangedHandler) {
            sq8.m48649h(iLocationPermissionChangedHandler, "it");
            iLocationPermissionChangedHandler.onLocationPermissionChanged(false);
        }
    }

    public LocationPermissionController(IRequestPermissionService iRequestPermissionService, IApplicationService iApplicationService) {
        sq8.m48649h(iRequestPermissionService, "_requestPermission");
        sq8.m48649h(iApplicationService, "_applicationService");
        this._requestPermission = iRequestPermissionService;
        this._applicationService = iApplicationService;
        this.waiter = new WaiterWithValue<>();
        this.events = new EventProducer<>();
        this.currPermission = "";
    }

    private final boolean showFallbackAlertDialog() {
        final Activity current = this._applicationService.getCurrent();
        if (current == null) {
            return false;
        }
        AlertDialogPrepromptForAndroidSettings alertDialogPrepromptForAndroidSettings = AlertDialogPrepromptForAndroidSettings.INSTANCE;
        String string = current.getString(C11705R.string.location_permission_name_for_title);
        sq8.m48648g(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = current.getString(C11705R.string.location_permission_settings_message);
        sq8.m48648g(string2, "activity.getString(R.str…mission_settings_message)");
        alertDialogPrepromptForAndroidSettings.show(current, string, string2, new AlertDialogPrepromptForAndroidSettings.Callback() { // from class: com.onesignal.location.internal.permissions.LocationPermissionController.showFallbackAlertDialog.1
            @Override // com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings.Callback
            public void onAccept() {
                IApplicationService iApplicationService = LocationPermissionController.this._applicationService;
                final LocationPermissionController locationPermissionController = LocationPermissionController.this;
                iApplicationService.addApplicationLifecycleHandler(new ApplicationLifecycleHandlerBase() { // from class: com.onesignal.location.internal.permissions.LocationPermissionController$showFallbackAlertDialog$1$onAccept$1
                    @Override // com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase, com.onesignal.core.internal.application.IApplicationLifecycleHandler
                    public void onFocus(boolean z) throws PackageManager.NameNotFoundException {
                        if (z) {
                            return;
                        }
                        super.onFocus(false);
                        locationPermissionController._applicationService.removeApplicationLifecycleHandler(this);
                        boolean zHasPermission = AndroidUtils.INSTANCE.hasPermission(locationPermissionController.currPermission, true, locationPermissionController._applicationService);
                        locationPermissionController.waiter.wake(Boolean.valueOf(zHasPermission));
                        locationPermissionController.events.fire(new C11724x2d83f42c(zHasPermission));
                    }
                });
                NavigateToAndroidSettingsForLocation.INSTANCE.show(current);
            }

            @Override // com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings.Callback
            public void onDecline() {
                LocationPermissionController.this.waiter.wake(Boolean.FALSE);
                LocationPermissionController.this.events.fire(C11725xcbb1646e.INSTANCE);
            }
        });
        return true;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.onesignal.core.internal.permissions.IRequestPermissionService.PermissionCallback
    public void onAccept() {
        this.waiter.wake(Boolean.TRUE);
        this.events.fire(C117201.INSTANCE);
    }

    @Override // com.onesignal.core.internal.permissions.IRequestPermissionService.PermissionCallback
    public void onReject(boolean z) {
        if (z ? showFallbackAlertDialog() : false) {
            return;
        }
        this.waiter.wake(Boolean.FALSE);
        this.events.fire(C117211.INSTANCE);
    }

    public final Object prompt(boolean z, String str, n64 n64Var) {
        this.currPermission = str;
        this._requestPermission.startPrompt(z, "LOCATION", str, LocationPermissionController.class);
        return this.waiter.waitForWake(n64Var);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._requestPermission.registerAsCallback("LOCATION", this);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ILocationPermissionChangedHandler iLocationPermissionChangedHandler) {
        sq8.m48649h(iLocationPermissionChangedHandler, "handler");
        this.events.subscribe(iLocationPermissionChangedHandler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ILocationPermissionChangedHandler iLocationPermissionChangedHandler) {
        sq8.m48649h(iLocationPermissionChangedHandler, "handler");
        this.events.subscribe(iLocationPermissionChangedHandler);
    }
}
