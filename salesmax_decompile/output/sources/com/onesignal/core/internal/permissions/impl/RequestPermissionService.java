package com.onesignal.core.internal.permissions.impl;

import android.app.Activity;
import android.content.Intent;
import com.onesignal.core.C11591R;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.core.internal.application.IActivityLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.permissions.IRequestPermissionService;
import java.util.HashMap;
import org.objectweb.asm.Opcodes;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class RequestPermissionService implements IRequestPermissionService {
    private final IApplicationService _application;
    private final HashMap<String, IRequestPermissionService.PermissionCallback> callbackMap;
    private boolean fallbackToSettings;
    private boolean shouldShowRequestPermissionRationaleBeforeRequest;
    private boolean waiting;

    public RequestPermissionService(IApplicationService iApplicationService) {
        sq8.m48649h(iApplicationService, "_application");
        this._application = iApplicationService;
        this.callbackMap = new HashMap<>();
    }

    public final IRequestPermissionService.PermissionCallback getCallback(String str) {
        sq8.m48649h(str, "permissionType");
        return this.callbackMap.get(str);
    }

    public final boolean getFallbackToSettings() {
        return this.fallbackToSettings;
    }

    public final boolean getShouldShowRequestPermissionRationaleBeforeRequest() {
        return this.shouldShowRequestPermissionRationaleBeforeRequest;
    }

    public final boolean getWaiting() {
        return this.waiting;
    }

    @Override // com.onesignal.core.internal.permissions.IRequestPermissionService
    public void registerAsCallback(String str, IRequestPermissionService.PermissionCallback permissionCallback) {
        sq8.m48649h(str, "permissionType");
        sq8.m48649h(permissionCallback, "callback");
        this.callbackMap.put(str, permissionCallback);
    }

    public final void setFallbackToSettings(boolean z) {
        this.fallbackToSettings = z;
    }

    public final void setShouldShowRequestPermissionRationaleBeforeRequest(boolean z) {
        this.shouldShowRequestPermissionRationaleBeforeRequest = z;
    }

    public final void setWaiting(boolean z) {
        this.waiting = z;
    }

    @Override // com.onesignal.core.internal.permissions.IRequestPermissionService
    public void startPrompt(boolean z, final String str, final String str2, final Class<?> cls) {
        sq8.m48649h(cls, "callbackClass");
        if (this.waiting) {
            return;
        }
        this.fallbackToSettings = z;
        this._application.addActivityLifecycleHandler(new IActivityLifecycleHandler() { // from class: com.onesignal.core.internal.permissions.impl.RequestPermissionService.startPrompt.1
            @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
            public void onActivityAvailable(Activity activity) {
                sq8.m48649h(activity, "activity");
                if (sq8.m48644c(activity.getClass(), PermissionsActivity.class)) {
                    RequestPermissionService.this._application.removeActivityLifecycleHandler(this);
                    return;
                }
                Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
                intent.setFlags(Opcodes.ACC_DEPRECATED);
                intent.putExtra(PermissionsActivity.INTENT_EXTRA_PERMISSION_TYPE, str).putExtra(PermissionsActivity.INTENT_EXTRA_ANDROID_PERMISSION_STRING, str2).putExtra(PermissionsActivity.INTENT_EXTRA_CALLBACK_CLASS, cls.getName());
                activity.startActivity(intent);
                activity.overridePendingTransition(C11591R.anim.onesignal_fade_in, C11591R.anim.onesignal_fade_out);
            }

            @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
            public void onActivityStopped(Activity activity) {
                sq8.m48649h(activity, "activity");
            }
        });
    }
}
