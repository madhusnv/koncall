package com.onesignal.notifications.internal.backend;

import com.onesignal.core.internal.device.IDeviceService;
import p001o.n64;

/* loaded from: classes6.dex */
public interface INotificationBackendService {
    Object updateNotificationAsOpened(String str, String str2, String str3, IDeviceService.DeviceType deviceType, n64 n64Var);

    Object updateNotificationAsReceived(String str, String str2, String str3, IDeviceService.DeviceType deviceType, n64 n64Var);
}
