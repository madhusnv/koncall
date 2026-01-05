package com.onesignal.core.internal.permissions;

/* loaded from: classes6.dex */
public interface IRequestPermissionService {

    public interface PermissionCallback {
        void onAccept();

        void onReject(boolean z);
    }

    void registerAsCallback(String str, PermissionCallback permissionCallback);

    void startPrompt(boolean z, String str, String str2, Class<?> cls);
}
